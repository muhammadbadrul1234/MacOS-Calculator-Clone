
//2012020216
//MD. BADRUl ALOM TAWSYAT
//badrulalom.me
import javax.swing.*;
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
		Color darkestGray = Color.decode("#434344");
		Color darkGray = Color.decode("#555556");
		Color mediumGray = Color.GRAY;
		Color white = Color.white;
		JFrame frame = new JFrame("Calculator");
		frame.setSize(270, 398);
		frame.setDefaultCloseOperation(3);
		frame.getContentPane().setBackground(darkestGray);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel1 = new JPanel();
		panel1.setBounds(1, 10, 280, 100);
		panel1.setBackground(darkestGray);
		panel1.setLayout(null);
		jtf.setBounds(-4, 30, 260, 40);
		jtf.setBackground(darkestGray);
		jtf.setForeground(white);
		jtf.setFont(new Font("Open Sans Light", Font.PLAIN, 32));
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setBorder(new LineBorder(Color.darkGray, 1));
		panel1.add(jtf);

		JPanel panel2 = new JPanel();
		panel2.setBounds(1, 80, 260, 280);
		panel2.setBackground(darkestGray);
		panel2.setLayout(new GridLayout(5, 5, 1, 1));
		frame.add(panel2);

		JButton blank = addButton("", mediumGray, white);
		JButton zero = addButton("0", mediumGray, white);
		JButton one = addButton("1", mediumGray, white);
		JButton two = addButton("2", mediumGray, white);
		JButton three = addButton("3", mediumGray, white);
		JButton four = addButton("4", mediumGray, white);
		JButton five = addButton("5", mediumGray, white);
		JButton six = addButton("6", mediumGray, white);
		JButton seven = addButton("7", mediumGray, white);
		JButton eight = addButton("8", mediumGray, white);
		JButton nine = addButton("9", mediumGray, white);
		JButton multiply = addButton("x", Color.decode("#F2A33C"), white);
		JButton minus = addButton("-", Color.decode("#F2A33C"), white);
		JButton plus = addButton("+", Color.decode("#F2A33C"), white);
		JButton dot = addButton(".", mediumGray, white);
		JButton equal = addButton("=", Color.decode("#F2A33C"), white);

		JButton c = new JButton("C");
		c.setFont(new Font("Helvetica", Font.PLAIN, 20));
		c.setRolloverEnabled(false);
		c.setFocusable(false);
		c.setBorderPainted(false);
		c.setBackground(darkGray);
		c.setForeground(white);
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
		cc.setBackground(darkGray);
		cc.setForeground(white);
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
		percent.setBackground(darkGray);
		percent.setForeground(white);
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
		div.setForeground(white);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0"))
					jtf.setText(st + "0");
				else
					jtf.setText(st + "÷");
			}
		});


		panel2.add(c);
		panel2.add(cc);
		panel2.add(percent);

		JButton[] buttons = { div, seven, eight, nine, multiply, four, five, six, minus, one, two, three, plus, zero, blank, dot, equal};
		for (JButton button : buttons) {
			panel2.add(button);
		}
		frame.add(panel1);
		frame.setVisible(true);

	}
}
