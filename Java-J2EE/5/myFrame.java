import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.mysql.jdbc.Statement;

public class myFrame extends JFrame {

    myFrame() {
        super("My Jframe Example");
        JLabel jlrep = new JLabel("Representative Information");
        JLabel jl11 = new JLabel("Enter RepNo");
        final JTextField jtf11 = new JTextField();
        JLabel jl12 = new JLabel("Enter RepName");
        final JTextField jtf12 = new JTextField();
        JLabel jl13 = new JLabel("Enter State");
        final JTextField jtf13 = new JTextField();
        JLabel jl14 = new JLabel("Enter Commission");
        final JTextField jtf14 = new JTextField();
        JLabel jl15 = new JLabel("Enter Rate");
        final JTextField jtf15 = new JTextField();
        JButton jb1 = new JButton("Submit");

        JLabel jlcus = new JLabel("Customer Information");
        JLabel jl21 = new JLabel("Enter CustomerNo");
        final JTextField jtf21 = new JTextField();
        JLabel jl22 = new JLabel("Enter CustomerName");
        final JTextField jtf22 = new JTextField();
        JLabel jl23 = new JLabel("Enter State");
        final JTextField jtf23 = new JTextField();
        JLabel jl24 = new JLabel("Enter Credit limit");
        final JTextField jtf24 = new JTextField();
        JLabel jl25 = new JLabel("Enter RepNo");
        final JTextField jtf25 = new JTextField();
        JButton jb2 = new JButton("Submit");

        JPanel panel = new JPanel();
        final JTextArea jta = new JTextArea();
        jta.setRows(10);
        jta.setColumns(5);
        JButton jb3 = new JButton("click");

        panel.add(jl11);
        panel.add(jtf11);
        panel.add(jl12);
        panel.add(jtf12);
        panel.add(jl13);
        panel.add(jtf13);
        panel.add(jl14);
        panel.add(jtf14);
        panel.add(jl15);
        panel.add(jtf15);
        panel.add(jb1);

        panel.add(jl21);
        panel.add(jtf21);
        panel.add(jl22);
        panel.add(jtf22);
        panel.add(jl23);
        panel.add(jtf23);
        panel.add(jl24);
        panel.add(jtf24);
        panel.add(jl25);
        panel.add(jtf25);
        panel.add(jb2);

        panel.add(jta);
        panel.add(jb3);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Statement stmt;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "deek");
                    if (conn != null) {
                        System.out.println("Connection successful !!!");
                        String Repno = jtf11.getText();
                        String Repname = jtf12.getText();
                        String state = jtf13.getText();
                        String commission = jtf14.getText();
                        String rate = jtf15.getText();
                        stmt = (Statement) conn.createStatement();
                        System.out.println(Repno + Repname + state + commission);
                        String query1 = "insert into Representative values('" + Repno + "','" + Repname + "','" + state
                                + "','" + commission + "','" + rate + "');";
                        stmt.executeUpdate(query1);
                    } else
                        System.out.println("Connection  not successful !!!");
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (ClassNotFoundException exx) {
                    System.out.println(exx.getMessage());
                }
            }
        });
        jb2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    Statement stmt2;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "deek");
                    if (conn != null) {
                        System.out.println("Connection successful !!!");
                        String Custno = jtf21.getText();
                        String CustName = jtf22.getText();
                        String state = jtf23.getText();
                        String Credit = jtf24.getText();
                        int cr = Integer.parseInt(Credit);
                        String Rno = jtf25.getText();
                        stmt2 = (Statement) conn.createStatement();
                        System.out.println(Custno + CustName + state + cr + Rno);
                        String query2 = "insert into Customer values('" + Custno + "','" + CustName + "','" + state
                                + "','" + cr + "','" + Rno + "');";
                        stmt2.executeUpdate(query2);

                    } else
                        System.out.println("Connection  not successful !!!");
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (ClassNotFoundException exx) {
                    System.out.println(exx.getMessage());
                }
            }

        });

        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Statement stmt;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "deek");
                    if (conn != null) {
                        stmt = (Statement) conn.createStatement();
                        String query3 = "SELECT * FROM Representative WHERE RepNo IN (SELECT RepNo FROM Customer WHERE Credit_Limit > 15000 )";
                        ResultSet rs = stmt.executeQuery(query3);
                        while (rs.next()) {
                            jta.append("Representative Information");
                            jta.append("\n");
                            jta.append("Number:");
                            jta.append(rs.getString("RepNo"));
                            jta.append("\n");
                            jta.append("Name:");
                            jta.append(rs.getString("RepName"));
                            jta.append("\n");
                            jta.append("State:");
                            jta.append(rs.getString("State"));
                            jta.append("\n");
                            jta.append("Comission:");
                            jta.append(rs.getString("Comission"));
                            jta.append("\n");
                            jta.append("Rate:");
                            jta.append(rs.getString("Rate"));
                            jta.append("\n");
                        }
                        System.out.println("Connection successful !!!");

                    } else
                        System.out.println("Connection  not successful !!!");
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (ClassNotFoundException exx) {
                    System.out.println(exx.getMessage());
                }
            }
        });
        setContentPane(panel);

    }

    public static void main(String[] args) {
        myFrame mf = new myFrame();
        mf.getContentPane().setLayout(new BoxLayout(mf.getContentPane(), BoxLayout.Y_AXIS));
        mf.setVisible(true);
        mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mf.pack();
    }
}
