

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.print.attribute.standard.MediaSize.ISO;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {

	boolean isOperatorClicked=false;
	boolean isAddClicked=false;
	boolean isDivClicked=false;
	boolean isMultClicked=false;
	boolean isSubClickedl=false;
	
	JFrame frame;
	JPanel panel=new JPanel();
	JTextArea textarea=new JTextArea(2,10);
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button0=new JButton();
	JButton buttonplus=new JButton();
	JButton buttonmin=new JButton();
	JButton buttondiv=new JButton();
	JButton buttonmult=new JButton();
	JButton buttondot=new JButton();
	JButton buttonequal=new JButton();
	JButton buttonclear=new JButton();
	double number1,number2,result;
	Calculator(){
		
		frame=new JFrame();
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("calculator");
		frame.setVisible(true);
		
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		Border border= BorderFactory.createLineBorder(Color.red,4);
		panel.setBorder(border);
		
		panel.add(textarea);
		textarea.setBackground(Color.black	);
		Border textborder= BorderFactory.createLineBorder(Color.blue,3);
		textarea.setBorder(textborder);
		Font font=new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.white);
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonplus);
		panel.add(buttonmin);
		panel.add(buttondiv);
		panel.add(buttonmult);
		panel.add(buttondot);
		panel.add(buttonclear);
		panel.add(buttonequal);
		
		button1.setPreferredSize(new Dimension(100,43));
		button1.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button1.jpg"));
		
		button2.setPreferredSize(new Dimension(100,43));
		button2.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button2.jpg"));
		
		button3.setPreferredSize(new Dimension(100,43));
		button3.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button3.jpg"));
		
		button4.setPreferredSize(new Dimension(100,43));
		button4.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button4.jpg"));
		
		
		button5.setPreferredSize(new Dimension(100,43));
		button5.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button5.jpg"));
		
		button6.setPreferredSize(new Dimension(100,43));
		button6.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button6.jpg"));
		
		button7.setPreferredSize(new Dimension(100,43));
		button7.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button7.jpg"));
		
		button8.setPreferredSize(new Dimension(100,43));
		button8.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button8.jpg"));
		
		button9.setPreferredSize(new Dimension(100,43));
		button9.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button9.jpg"));
		
		button0.setPreferredSize(new Dimension(100,43));
		button0.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\button0.jpg"));
		
		buttonplus.setPreferredSize(new Dimension(100,43));
		buttonplus.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttonplus.jpg"));
		
		buttonmin.setPreferredSize(new Dimension(100,43));
		buttonmin.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttonmin.jpg"));
		
		buttonmult.setPreferredSize(new Dimension(100,43));
		buttonmult.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttonmult.jpg"));
		
		buttondiv.setPreferredSize(new Dimension(100,43));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttondiv.jpg"));
		
		buttonclear.setPreferredSize(new Dimension(100,35));
		buttonclear.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttonclear.jpg"));
		
		buttondot.setPreferredSize(new Dimension(100,43));
		buttondot.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttondot.jpg"));
		
		buttonequal.setPreferredSize(new Dimension(200,35));
		buttonequal.setIcon(new ImageIcon("C:\\Users\\razor R2D\\Desktop\\buttons\\buttonequal.jpg"));
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		button3.addActionListener(this);
		
		button4.addActionListener(this);
		
		button5.addActionListener(this);
		
		button6.addActionListener(this);
		
		button7.addActionListener(this);
		
		button8.addActionListener(this);
		
		button9.addActionListener(this);
		
		button0.addActionListener(this);
		
		buttonplus.addActionListener(this);
		
		buttonmin.addActionListener(this);
		
		buttondiv.addActionListener(this);
		
		buttonmult.addActionListener(this);
		
		buttondot.addActionListener(this);
		
		buttonclear.addActionListener(this);
		
		buttonequal.addActionListener(this);
	
		
		
			
			
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		Object source=e.getSource();
		
		if(source==button1) {
			
			
			textarea.append("1");
		
		}
		
		if(source==button2) {
			
				textarea.append("2");
			}
			
			
		
		if(source==button3) {
			
				textarea.append("3");
		}
			
		
		if(source==button4) {
			
		
			textarea.append("4");
		}
		if(source==button5) {
			textarea.append("5");
		}
		if(source==button6) {
			textarea.append("6");
		}
		if(source==button7) {
			textarea.append("7");
		}
		if(source==button8) {
			textarea.append("8");
		}
		if(source==button9) {
			textarea.append("9");
		}
		if(source==button0) {
			textarea.append("0");
		}
		if(source==buttondot) {
			textarea.append(".");
		}
		if(source==buttonclear) {
			textarea.setText("");
			textarea.append("");
		}
		if(source==buttonplus) {
			number1=number_reader();
			textarea.setText("");
			isAddClicked=true;
			isSubClickedl=false;
			isMultClicked=false;
			isDivClicked=false;
			
		}
			
		
		
		
	
		if(source==buttonmin) {
			
			number1=number_reader();
			textarea.setText("");
			isAddClicked=false;
			isSubClickedl=true;
			isMultClicked=false;
			isDivClicked=false;
			
		}
		
			
		
		if(source==buttonmult) {
			
			number1=number_reader();
			textarea.setText("");
			isAddClicked=false;
			isSubClickedl=false;
			isMultClicked=true;
			isDivClicked=false;
			
		
			
		}
		if(source==buttondiv) {
			
			number1=number_reader();
			textarea.setText("");
			isAddClicked=false;
			isSubClickedl=false;
			isMultClicked=false;
			isDivClicked=true;
			
			
			
			
		}if(source==buttonequal) {
			number2=number_reader();
			if(isAddClicked) {
				result=number1+number2;
				textarea.setText(Double.toString(result));
			}
			if(isSubClickedl) {
				result=number1-number2;
				textarea.setText(Double.toString(result));
				
			}
			if(isMultClicked) {
				result=number1*number2;
				textarea.setText(Double.toString(result));
			}
			if(isDivClicked) {
				result=number1/number2;
				textarea.setText(Double.toString(result));
			
			}}
			}
	
		public double number_reader() {
			double num1;
			String s;
			s=textarea.getText();
			num1=Double.valueOf(s);
		
			
			
		
			return num1;}

		
		
		}

	
	
	