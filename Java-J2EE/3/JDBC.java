import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.sql.*;

public class JDBC {

  public static void main(String[] args) {
    JFrame f;
    JLabel label1, label2, label3, label4, label5, lb1, lb2, lb3, lb4;
    JButton jb1, jb2, jb3;
    JTextField txt1, txt2, txt3, txt4, txt5, tx1, tx2, tx3, tx4;

    f = new JFrame();
    label1 = new JLabel("Customer Number");
    label2 = new JLabel("Customer name");
    label3 = new JLabel("State");
    label4 = new JLabel("Credit Limit");
    label5 = new JLabel("repno");
    lb1 = new JLabel("Repno");
    lb2 = new JLabel("Repname");
    lb3 = new JLabel("State");
    lb4 = new JLabel("Commission rate");
    jb1 = new JButton("Insert1");
    jb2 = new JButton("Insert2");
    jb3 = new JButton("Show");

    txt1 = new JTextField(20);
    txt2 = new JTextField(20);
    txt3 = new JTextField(20);
    txt4 = new JTextField(20);
    txt5 = new JTextField(20);

    tx1 = new JTextField(20);
    tx2 = new JTextField(20);
    tx3 = new JTextField(20);
    tx4 = new JTextField(20);

    JTextArea ta = new JTextArea(20, 40);
    f.setLayout(new FlowLayout());
    f.add(label1);
    f.add(txt1);
    f.add(label2);
    f.add(txt2);
    f.add(label3);
    f.add(txt3);
    f.add(label4);
    f.add(txt4);
    f.add(label5);
    f.add(txt5);
    f.add(jb1);

    f.add(lb1);
    f.add(tx1);
    f.add(lb2);
    f.add(tx2);
    f.add(lb3);
    f.add(tx3);
    f.add(lb4);
    f.add(tx4);
    f.add(jb2);

    f.add(jb3);
    f.add(ta);
    f.setVisible(true);
    f.setSize(800, 800);

    jb1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) { // anonymous inner class
        String name = txt2.getText();
        int cnum = Integer.parseInt(txt1.getText());
        String state = txt3.getText();
        int climit = Integer.parseInt(txt4.getText());
        int repno = Integer.parseInt(txt5.getText());
        try {
          Class.forName("com.mysql.jdbc.Driver"); // registers and loads the driver.
          Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
          if (conn != null) {
            Statement stmt = conn.createStatement(); // createStatement returns a statement obj
            stmt.executeUpdate("insert into Customer values(" + cnum + ",'" + name + "','" + state + "'," + climit + ","
                + repno + ");");
          }
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });

    jb2.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String rname = tx2.getText();
        String state = tx3.getText();
        int comrate = Integer.parseInt(tx4.getText());
        int repno = Integer.parseInt(tx1.getText());
        try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
          if (conn != null) {
            Statement stmt = (Statement) conn.createStatement();
            stmt.executeUpdate(
                "insert into Representative values(" + repno + ",'" + rname + "','" + state + "'," + comrate + ");");
          }
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });

    jb3.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
          if (conn != null) {
            Statement stmt = (Statement) conn.createStatement();
            // result set object is iterable and has tuples from the db
            ResultSet rs = stmt.executeQuery(
                "select * from Representative where repno in ( select repno from Customer where climit>15000);");
            String s = "";
            ta.setText("");
            while (rs.next()) {
              s += rs.getInt(1) + " ";
              s += rs.getString(2) + " ";
              s += rs.getString(3) + " ";
              s += rs.getInt(4) + " ";
              s += "\n";
            }
            System.out.println(s);
            ta.append(s);
          }
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });
  }
}