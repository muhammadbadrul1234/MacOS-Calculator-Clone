
//2012020216
//MD. BADRUl ALOM TAWSYAT
//badrulalom.me
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorBadrul {
	static int num1, num2;
	static char ope;
	final static JTextField jtf = new JTextField();

	private static JButton addButton(String label, Color background, Color foreground) {
		JButton button = new JButton(label);
		button.setFont(new Font("Helvetica", Font.PLAIN, 20));
		button.setRolloverEnabled(false);
		button.setFocusable(false);
		button.setBorderPainted(false);
		button.setBackground(background);
		button.setForeground(foreground);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals(label))
					jtf.setText(st + "0");
				else
					jtf.setText(st + label);
			}
		});
		return button;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(270, 440);
		frame.setDefaultCloseOperation(3);
		frame.getContentPane().setBackground(Color.decode("#434344"));
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setBounds(1, 10, 280, 355);
		panel1.setBackground(Color.decode("#434344"));
		panel1.setLayout(null);
		jtf.setBounds(1, 60, 260, 40);
		jtf.setBackground(Color.decode("#434344"));
		jtf.setForeground(Color.WHITE);
		jtf.setFont(new Font("Open Sans Light", Font.PLAIN, 40));
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setBorder(new LineBorder(Color.darkGray, 1));
		panel1.add(jtf);
		panel2.setBounds(1, 120, 260, 280);
		panel2.setBackground(Color.decode("#434344"));
		panel2.setLayout(new GridLayout(5, 5, 1, 1));
		frame.add(panel2);

		JButton c = new JButton("C");
		c.setFont(new Font("Helvetica", Font.PLAIN, 20));
		c.setRolloverEnabled(false);
		c.setFocusable(false);
		c.setBorderPainted(false);
		c.setBackground(Color.decode("#555556"));
		c.setForeground(Color.white);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					st = "";
				jtf.setText("");
			}
		});

		JButton cc = new JButton("+/-");
		cc.setFont(new Font("Helvetica", Font.PLAIN, 20));
		cc.setRolloverEnabled(false);
		cc.setFocusable(false);
		cc.setBorderPainted(false);
		cc.setBackground(Color.decode("#555556"));
		cc.setForeground(Color.white);
		cc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				int number = Integer.parseInt(st);
				if (number > 0)
					jtf.setText("-" + st);
				else if (number < 0)
					jtf.setText("+" + st);
				else
					jtf.setText("0");
			}
		});

		JButton percent = new JButton("%");
		percent.setFont(new Font("Helvetica", Font.PLAIN, 20));
		percent.setRolloverEnabled(false);
		percent.setFocusable(false);
		percent.setBorderPainted(false);
		percent.setBackground(Color.decode("#555556"));
		percent.setForeground(Color.white);
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "%");
			}
		});

		JButton div = new JButton("÷");
		div.setFont(new Font("Helvetica", Font.PLAIN, 20));
		div.setBackground(Color.decode("#F2A33C"));
		div.setRolloverEnabled(false);
		div.setFocusable(false);
		div.setBorderPainted(false);
		div.setForeground(Color.white);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "÷");
			}
		});

		JButton zero = addButton("0", Color.GRAY, Color.white);
		JButton one = addButton("1", Color.GRAY, Color.white);
		JButton two = addButton("2", Color.GRAY, Color.white);
		JButton three = addButton("3", Color.GRAY, Color.white);
		JButton four = addButton("4", Color.GRAY, Color.white);
		JButton five = addButton("5", Color.GRAY, Color.white);
		JButton six = addButton("6", Color.GRAY, Color.white);
		JButton seven = addButton("7", Color.GRAY, Color.white);
		JButton eight = addButton("8", Color.GRAY, Color.white);
		JButton nine = addButton("9", Color.GRAY, Color.white);

		JButton multiply = new JButton("x");
		multiply.setFont(new Font("Helvetica", Font.PLAIN, 20));
		multiply.setRolloverEnabled(false);
		multiply.setFocusable(false);
		multiply.setBorderPainted(false);
		multiply.setBackground(Color.decode("#F2A33C"));
		multiply.setForeground(Color.white);
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "x");

			}
		});

		JButton minus = new JButton("-");
		minus.setFont(new Font("Helvetica", Font.PLAIN, 20));
		minus.setRolloverEnabled(false);
		minus.setFocusable(false);
		minus.setBorderPainted(false);
		minus.setBackground(Color.decode("#F2A33C"));
		minus.setForeground(Color.white);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "-");

			}
		});

		JButton plus = new JButton("+");
		plus.setFont(new Font("Helvetica", Font.PLAIN, 20));
		plus.setRolloverEnabled(false);
		plus.setFocusable(false);
		plus.setBorderPainted(false);
		plus.setBackground(Color.decode("#F2A33C"));
		plus.setForeground(Color.white);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "+");

			}
		});

		JButton root = new JButton("√ ");
		root.setFont(new Font("Helvetica", Font.PLAIN, 20));
		root.setRolloverEnabled(false);
		root.setFocusable(false);
		root.setBorderPainted(false);
		root.setBackground(Color.decode("#555556"));
		root.setForeground(Color.white);
		root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "√");

			}
		});

		JButton dot = new JButton(".");
		dot.setFont(new Font("Helvetica", Font.PLAIN, 20));
		dot.setRolloverEnabled(false);
		dot.setFocusable(false);
		dot.setBorderPainted(false);
		dot.setBackground(Color.GRAY);
		dot.setForeground(Color.white);
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + ".");

			}
		});

		JButton equal = new JButton("=");
		equal.setFont(new Font("Helvetica", Font.PLAIN, 20));
		equal.setRolloverEnabled(false);
		equal.setFocusable(false);
		equal.setBorderPainted(false);
		equal.setBackground(Color.decode("#F2A33C"));
		equal.setForeground(Color.white);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "=");

			}
		});

		panel2.add(root);
		panel2.add(cc);
		panel2.add(percent);
		panel2.add(c);
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(div);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
		panel2.add(multiply);
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);
		panel2.add(minus);
		panel2.add(zero);
		panel2.add(dot);
		panel2.add(equal);
		panel2.add(plus);
		frame.add(panel1);
		frame.setVisible(true);

	}

	private static void setBorder(Border createEmptyBorder) {
	}
}
