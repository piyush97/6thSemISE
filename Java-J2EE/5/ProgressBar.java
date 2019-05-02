import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.*;

public class ProgressBar {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(800, 800);
        JLabel l1 = new JLabel("Source");
        JLabel l2 = new JLabel("Destination");
        JTextField t1 = new JTextField(30);
        JTextField t2 = new JTextField(30);
        JButton b1 = new JButton("Start");
        JButton b2 = new JButton("Stop");
        JTextArea ta = new JTextArea(40, 40);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(ta);
        f.setVisible(true);
        JProgressBar pb = new JProgressBar(0, 100);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String src = t1.getText();
                String dest = t2.getText();
                pb.setIndeterminate(true);
                pb.setString("Copying");
                pb.setStringPainted(true);
                pb.setVisible(true);
                try {

                    f.add(pb);
                    f.add(b2);
                    f.setVisible(true);
                    String content = new String(Files.readAllBytes(Paths.get(src)));
                    PrintWriter outPrintWriter = new PrintWriter(dest);
                    outPrintWriter.println(content);
                    outPrintWriter.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String src = t2.getText();
                pb.setVisible(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                try {
                    String content = new String(Files.readAllBytes(Paths.get(src)));
                    ta.setText(content);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

}
