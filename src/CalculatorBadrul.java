//2012020216
//MD. BADRUl ALOM TAWSYAT
//badrulalom.me
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorBadrul {
    static int num1,num2;
	static char ope;
    public static void main(String[] args){
        JFrame frame = new JFrame();
		frame.setSize(300,400);
	    frame.setDefaultCloseOperation(3);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	    frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		JPanel panel1 = new JPanel();
		JPanel panel2= new JPanel();
		panel1.setBounds(10,10,260,60);
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		final JTextField jtf = new JTextField();
		jtf.setBounds(10,30,240,40);
		jtf.setBackground(Color.DARK_GRAY);
		panel1.add(jtf);
		panel2.setBounds(1,90,260,230);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setLayout(new GridLayout(5,4,1,1));
		frame.add(panel2);
 
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
			    if(st.equals("0"))
					st="";
			    jtf.setText(st+"0");
			}@Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub 
            }
		});
 
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText(st+"1");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
        	}
		});

		JButton two = new JButton("2");
		two.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"2");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub   
        	}
		});

		JButton three = new JButton("3");
        three.setFont(new Font("Arial", Font.BOLD, 20));
        three.setBackground(new Color(239, 188, 2));
		three.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"3");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });

		JButton four = new JButton("4");
        four.setFont(new Font("Arial", Font.BOLD, 20));
        four.setBackground(new Color(239, 188, 2));
		four.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"4");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });

		JButton five = new JButton("5");
        five.setFont(new Font("Arial", Font.BOLD, 20));
        five.setBackground(new Color(239, 188, 2));
		five.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"5");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });

		JButton six = new JButton("6");
        six.setFont(new Font("Arial", Font.BOLD, 20));
        six.setBackground(new Color(239, 188, 2));
		six.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"6");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });

		JButton seven = new JButton("7");
        seven.setFont(new Font("Arial", Font.BOLD, 20));
        seven.setBackground(new Color(239, 188, 2));
		seven.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"7");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });

		JButton eight = new JButton("8");
        eight.setFont(new Font("Arial", Font.BOLD, 20));
        eight.setBackground(new Color(239, 188, 2));
		eight.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"8");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });

		JButton nine = new JButton("9");
        nine.setFont(new Font("Arial", Font.BOLD, 20));
        nine.setBackground(new Color(239, 188, 2));
		nine.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"9");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	// TODO Auto-generated method stub
            
        	}
        });
 
		panel2.add(zero);
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		frame.add(panel1);
		frame.setVisible(true);
 


        
    }
}

