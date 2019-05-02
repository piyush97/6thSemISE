import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Traffic {
	public static void main(String[] arg) {

		JFrame frm = new JFrame();
		frm.setTitle("Traffic");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setLayout(null);
		JPanel pnl = new JPanel();
		pnl.setSize(300, 300);
		JRadioButton b1 = new JRadioButton("Green");
		JRadioButton b2 = new JRadioButton("Yellow");
		JRadioButton b3 = new JRadioButton("Red");
		b1.setBounds(100, 40, 30, 30);
		b2.setBounds(125, 40, 30, 30);
		b3.setBounds(150, 40, 30, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		JTextField tf = new JTextField(10);
		tf.setBounds(125, 60, 50, 50);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Go");
				tf.setForeground(Color.green);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Ready");
				tf.setForeground(Color.yellow);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Stop");
				tf.setForeground(Color.red);
			}
		});
		pnl.add(b1);
		pnl.add(b2);
		pnl.add(b3);
		pnl.add(tf);
		frm.add(pnl);
	}
}
