import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame frame;
	JLabel displaytext;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JButton buttondot;
	JButton buttonequal;
	JButton buttondiv;
	JButton buttonmult;
	JButton buttonadd;
	JButton buttonsub;
	JButton buttonclear;
	boolean isOperatorClicked=false;
	boolean isAddClicked=false;
	boolean isSubClicked=false;
	boolean ismultClicked=false;
	boolean isDivClicked=false;
	String oldvalue;
	
	
	public Calculator(){
		frame=new JFrame("calculator");
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displaytext=new JLabel("");
		displaytext.setBounds(5,10,370,50);
		displaytext.setFont(new Font("Courier New",Font.ITALIC,12));
		displaytext.setBackground(Color.LIGHT_GRAY);
		displaytext.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(displaytext);
		displaytext.setVisible(true);
		displaytext.setOpaque(true);
		
		 button7=new JButton("7");
		 button7.setBounds(20,70,80,80);
		 button7.setBackground(Color.orange);
		 button7.setForeground(Color.black);
	     frame.add(button7);
	     button7.addActionListener(this);
	     
	     button8=new JButton("8");
	     button8.setBounds(120, 70, 80, 80);
	     button8.setBackground(Color.orange);
		 button8.setForeground(Color.black);
	     frame.add(button8);
	     button8.addActionListener(this);
	     
	     button9=new JButton("9");
	     button9.setBounds(220,70,80,80);
	     button9.setBackground(Color.orange);
		 button9.setForeground(Color.black);
	     frame.add(button9);
	     button9.addActionListener(this);
	     
	     button4=new JButton("4");
	     button4.setBounds(20,170,80,80);
	     button4.setBackground(Color.orange);
		 button4.setForeground(Color.black);
	     frame.add(button4);
	     button4.addActionListener(this);
	     
	     button5= new JButton("5");
	     button5.setBounds(120,170,80,80);
	     button5.setBackground(Color.orange);
		 button5.setForeground(Color.black);
	     frame.add(button5);
	     button5.addActionListener(this);
	     
	     button6= new JButton("6");
	     button6.setBounds(220,170,80,80);
	     button6.setBackground(Color.orange);
		 button6.setForeground(Color.black);
	     frame.add(button6);
	     button6.addActionListener(this);
	     
	     button1=new JButton("1");
	     button1.setBounds(20,270,80,80);
	     button1.setBackground(Color.orange);
		 button1.setForeground(Color.black);
	     frame.add(button1);
	     button1.addActionListener(this);
	     
	     button2= new JButton("2");
	     button2.setBounds(120,270,80,80);
	     button2.setBackground(Color.orange);
		 button2.setForeground(Color.black);
	     frame.add(button2);
	     button2.addActionListener(this);
	     
	     button3= new JButton("3");
	     button3.setBounds(220,270,80,80);
	     button3.setBackground(Color.orange);
		 button3.setForeground(Color.black);
	     frame.add(button3);
	     button3.addActionListener(this);
	     
	     buttondot=new JButton(".");
	     buttondot.setBounds(20,370,80,80);
	     buttondot.setBackground(Color.orange);
		 buttondot.setForeground(Color.black);
	     frame.add(buttondot);
	     buttondot.addActionListener(this);
	     
	     button0= new JButton("0");
	     button0.setBounds(120,370,80,80);
	     button0.setBackground(Color.orange);
		 button0.setForeground(Color.black);
	     frame.add(button0);
	     button0.addActionListener(this);
	     
	     buttonequal= new JButton("=");
	     buttonequal.setBounds(220,370,80,80);
	     buttonequal.setBackground(Color.green);
		 buttonequal.setForeground(Color.BLACK);
	     frame.add(buttonequal);
	     buttonequal.addActionListener(this);
	     
	     
	     buttondiv=new JButton("/");
	     buttondiv.setBounds(320,70,60,60);
	     buttondiv.setBackground(Color.blue);
		 buttondiv.setForeground(Color.cyan);
	     frame.add(buttondiv);
	     buttondiv.addActionListener(this);
	     
	     buttonmult=new JButton("x");
	     buttonmult.setBounds(320,150,60,60);
	     buttonmult.setBackground(Color.blue);
		 buttonmult.setForeground(Color.cyan);
	     frame.add(buttonmult);
	     buttonmult.addActionListener(this);
	     
	     
	     buttonsub=new JButton("-");
	     buttonsub.setBounds(320,230,60,60);
	     buttonsub.setBackground(Color.blue);
		 buttonsub.setForeground(Color.cyan);
	     frame.add(buttonsub);
	     buttonsub.addActionListener(this);
	     
	     
	     buttonadd=new JButton("+");
	     buttonadd.setBounds(320,310,60,60);
	     buttonadd.setBackground(Color.blue);
		 buttonadd.setForeground(Color.cyan);
	     frame.add(buttonadd);
	     buttonadd.addActionListener(this);
	     
	     
	     buttonclear=new JButton("C");
	     buttonclear.setBounds(320,390,60,60);
	     buttonclear.setBackground(Color.BLACK);
		 buttonclear.setForeground(Color.cyan);
	     frame.add(buttonclear);
	     buttonclear.addActionListener(this);
	     
	     
	     
	}
	public static void main(String[] e) {
		
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource()==button7) {
			if(isOperatorClicked) {
				displaytext.setText("7");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"7");
			
		}else if(e.getSource()==button8) {
			if(isOperatorClicked) {
				displaytext.setText("8");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"8");
			
		}
		else if(e.getSource()==button9) {
			if(isOperatorClicked) {
				displaytext.setText("9");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"9");
			
		}		
	else if(e.getSource()==button4) {
		if(isOperatorClicked) {
			displaytext.setText("4");
			isOperatorClicked=false;
		}else
		displaytext.setText(displaytext.getText()+"4");
		
	}
	else if(e.getSource()==button5) {
		if(isOperatorClicked) {
			displaytext.setText("5");
			isOperatorClicked=false;
		}else
		displaytext.setText(displaytext.getText()+"5");
	
		
		}else if(e.getSource()==button6) {
			if(isOperatorClicked) {
				displaytext.setText("6");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"6");
			
		}
		else if(e.getSource()==button1) {
			if(isOperatorClicked) {
				displaytext.setText("1");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"1");
		
		
		}else if(e.getSource()==button2) {
			if(isOperatorClicked) {
				displaytext.setText("2");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"2");
			
		}
		else if(e.getSource()==button3) {
			if(isOperatorClicked) {
				displaytext.setText("3");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"3");
		
		
		}else if(e.getSource()==button0) {
			if(isOperatorClicked) {
				displaytext.setText("0");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+"0");
			
		}
		else if(e.getSource()==buttondot) {
			if(isOperatorClicked) {
				displaytext.setText(".");
				isOperatorClicked=false;
			}else
			displaytext.setText(displaytext.getText()+".");
			
		}else if(e.getSource()==buttonclear) {
			displaytext.setText("");
			
		}else if(e.getSource()==buttondiv) {
			isOperatorClicked=true;
			isDivClicked=true;
			oldvalue=displaytext.getText();
			
			
		}else if(e.getSource()==buttonmult) {
			isOperatorClicked=true;
			ismultClicked=true;
			oldvalue=displaytext.getText();
			
			
		}else if(e.getSource()==buttonsub) {
			isOperatorClicked=true;
			isSubClicked=true;
			oldvalue=displaytext.getText();
			
		}else if(e.getSource()==buttonadd) {
			isOperatorClicked=true;
			isAddClicked=true;
			oldvalue=displaytext.getText();
			
		}else if(e.getSource()==buttonequal) {
			String newvalue=displaytext.getText();
			float newvalueF=Float.parseFloat(newvalue);
			float oldvalueF=Float.parseFloat(oldvalue);
			float result=0;
		
			
			
			if(isAddClicked) {
				result=newvalueF+oldvalueF;
				
			}else if(isSubClicked) {
				result=oldvalueF-newvalueF;
				
			}else if(ismultClicked) {
				result=oldvalueF*newvalueF;
				
			}else if(isDivClicked) {
				result=oldvalueF/newvalueF;
			}
			
			displaytext.setText(result+"");
			isAddClicked=false;
			isSubClicked=false;
			ismultClicked=false;
			isDivClicked=false;
			
			
			
			
		}
	}

}
