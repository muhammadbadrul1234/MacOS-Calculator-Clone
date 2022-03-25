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
    static int num1,num2;
	static char ope;
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
		frame.setSize(317,355);
	    frame.setDefaultCloseOperation(3);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	    frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		JPanel panel1 = new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		panel1.setBounds(1,10,5000,355);
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		final JTextField jtf = new JTextField();
		jtf.setBounds(1,1,295,40);
		jtf.setBackground(Color.DARK_GRAY);
		jtf.setForeground(Color.WHITE);
		jtf.setFont(new Font("Calibri", Font.BOLD, 20));
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setBorder(new LineBorder(Color.darkGray,1));
		panel1.add(jtf);
		panel2.setBounds(1,120,300,200);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setLayout(new GridLayout(5,5,1,1));
		frame.add(panel2);

		JButton c = new JButton("C");
		c.setFont(new Font("Calibri", Font.BOLD, 20));
		c.setRolloverEnabled(false);
		c.setFocusable(false);
		c.setBorderPainted(false);
		c.setBackground(new Color(239, 188, 2));
		c.setForeground(Color.white);
		c.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText("");
            }
		});

		JButton cc = new JButton("+/-");
		cc.setFont(new Font("Calibri", Font.BOLD, 20));
		cc.setRolloverEnabled(false);
		cc.setFocusable(false);
		cc.setBorderPainted(false);
		cc.setBackground(Color.LIGHT_GRAY);
		cc.setForeground(Color.white);
		cc.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				int number = Integer.parseInt(st);
	    	  	if(number>0)
	    	  		jtf.setText("-"+st);
				else if(number<0)
					jtf.setText("+"+st);
				else
					jtf.setText("0");
            }
		});

		JButton percent = new JButton("%");
		percent.setFont(new Font("Calibri", Font.BOLD, 20));
		percent.setRolloverEnabled(false);
		percent.setFocusable(false);
		percent.setBorderPainted(false);
		percent.setBackground(Color.lightGray);
		percent.setForeground(Color.white);
		percent.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"%"); 
            }
		});

		JButton div = new JButton("÷");
		div.setFont(new Font("Calibri", Font.BOLD, 20));
		div.setBackground(new Color(239, 188, 2));
		div.setRolloverEnabled(false);
		div.setFocusable(false);
		div.setBorderPainted(false);
		div.setForeground(Color.white);
		div.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"÷");
            }
		});

		JButton zero = new JButton("0");
		zero.setFont(new Font("Calibri", Font.BOLD, 20));
		zero.setRolloverEnabled(false);
		zero.setFocusable(false);
		zero.setBorderPainted(false);
		zero.setBackground(Color.gray);
		zero.setForeground(Color.white);
		zero.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
			    if(st.equals("0"))
					st="";
			    jtf.setText(st+"0");
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"0");
            }
		});
 
		JButton one = new JButton("1");
		one.setFont(new Font("Calibri", Font.BOLD, 20));
		one.setRolloverEnabled(false);
		one.setFocusable(false);
		one.setBorderPainted(false);
		one.setBackground(Color.GRAY);
		one.setForeground(Color.white);
		one.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText(st+"1");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText(st+"1");
        	}
		});

		JButton two = new JButton("2");
		two.setFont(new Font("Calibri", Font.BOLD, 20));
		two.setRolloverEnabled(false);
		two.setFocusable(false);
		two.setBorderPainted(false);
		two.setBackground(Color.GRAY);
		two.setForeground(Color.white);
		two.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"2");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"2");   
        	}
		});

		JButton three = new JButton("3");
		three.setFont(new Font("Calibri", Font.BOLD, 20));
		three.setRolloverEnabled(false);
		three.setFocusable(false);
		three.setBorderPainted(false);
		three.setBackground(Color.GRAY);
		three.setForeground(Color.white);
		three.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"3");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"3");
            
        	}
        });

		JButton four = new JButton("4");
		four.setFont(new Font("Calibri", Font.BOLD, 20));
		four.setRolloverEnabled(false);
		four.setFocusable(false);
		four.setBorderPainted(false);
		four.setBackground(Color.GRAY);
		four.setForeground(Color.white);
		four.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"4");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"4");
            
        	}
        });

		JButton five = new JButton("5");
		five.setFont(new Font("Calibri", Font.BOLD, 20));
		five.setRolloverEnabled(false);
		five.setFocusable(false);
		five.setBorderPainted(false);
		five.setBackground(Color.GRAY);
		five.setForeground(Color.white);
		five.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"5");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"5");
            
        	}
        });

		JButton six = new JButton("6");
		six.setFont(new Font("Calibri", Font.BOLD, 20));
		six.setRolloverEnabled(false);
		six.setFocusable(false);
		six.setBorderPainted(false);
		six.setBackground(Color.GRAY);
		six.setForeground(Color.white);
		six.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"6");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"6");
            
        	}
        });

		JButton seven = new JButton("7");
		seven.setFont(new Font("Calibri", Font.BOLD, 20));
		seven.setRolloverEnabled(false);
		seven.setFocusable(false);
		seven.setBorderPainted(false);
		seven.setBackground(Color.GRAY);
		seven.setForeground(Color.white);
		seven.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"7");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"7");
            
        	}
        });

		JButton eight = new JButton("8");
		eight.setFont(new Font("Calibri", Font.BOLD, 20));
		eight.setRolloverEnabled(false);
		eight.setFocusable(false);
		eight.setBorderPainted(false);
		eight.setBackground(Color.GRAY);
		eight.setForeground(Color.white);
		eight.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"8");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"8");
            
        	}
        });

		JButton nine = new JButton("9");
		nine.setFont(new Font("Calibri", Font.BOLD, 20));
		nine.setRolloverEnabled(false);
		nine.setFocusable(false);
		nine.setBorderPainted(false);
		nine.setBackground(Color.GRAY);
		nine.setForeground(Color.white);
		nine.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"9");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"9");
            
        	}
        });

		JButton multiply = new JButton("x");
		multiply.setFont(new Font("Calibri", Font.BOLD, 20));
		multiply.setRolloverEnabled(false);
		multiply.setFocusable(false);
		multiply.setBorderPainted(false);
		multiply.setBackground(new Color(239, 188, 2));
		multiply.setForeground(Color.white);
		multiply.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"x");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"x");
            
        	}
        });

		JButton minus = new JButton("-");
		minus.setFont(new Font("Calibri", Font.BOLD, 20));
		minus.setRolloverEnabled(false);
		minus.setFocusable(false);
		minus.setBorderPainted(false);
		minus.setBackground(new Color(239, 188, 2));
		minus.setForeground(Color.white);
		minus.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"-");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"-");
            
        	}
        });

		JButton plus = new JButton("+");
		plus.setFont(new Font("Calibri", Font.BOLD, 20));
		plus.setRolloverEnabled(false);
		plus.setFocusable(false);
		plus.setBorderPainted(false);
		plus.setBackground(new Color(239, 188, 2));
		plus.setForeground(Color.white);
		plus.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"+");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"+");
            
        	}
        });

		JButton root = new JButton("√ ");
		root.setFont(new Font("Calibri", Font.BOLD, 20));
		root.setRolloverEnabled(false);
		root.setFocusable(false);
		root.setBorderPainted(false);
		root.setBackground(Color.lightGray);
		root.setForeground(Color.white);
		root.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"√ ");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"√");
            
        	}
        });

		JButton dot = new JButton(".");
		dot.setFont(new Font("Calibri", Font.BOLD, 20));
		dot.setRolloverEnabled(false);
		dot.setFocusable(false);
		dot.setBorderPainted(false);
		dot.setBackground(Color.GRAY);
		dot.setForeground(Color.white);
		dot.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+".");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+".");
            
        	}
        });

		JButton equal = new JButton("=");
		equal.setFont(new Font("Calibri", Font.BOLD, 20));
		equal.setRolloverEnabled(false);
		equal.setFocusable(false);
		equal.setBorderPainted(false);
		equal.setBackground(Color.GRAY);
		equal.setForeground(Color.white);
		equal.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"=");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"=");
            
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

