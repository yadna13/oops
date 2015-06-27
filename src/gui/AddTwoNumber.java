package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class AddTwoNumber extends JFrame implements ActionListener{
	
	Container conn;
	JTextField tfirstNumber;
	JTextField tSecondNumber;
	 JLabel result;
	AddTwoNumber(){
		  conn=getContentPane();
		  conn.setLayout(new BorderLayout());

		  JPanel header=new JPanel();
		  header.setLayout(new FlowLayout());
		  header.setBackground(Color.ORANGE);
		  JLabel titile=new JLabel("Programming by Java Programmer @ 2015");
		  header.add(titile);
		  conn.add(header,BorderLayout.NORTH);
		  
		/*  ImageIcon icon=new ImageIcon("new_02.gif");
		  JButton ok=new JButton("Aha",icon);
		  ok.setBounds(30,20, 120, 30);
		  conn.add(ok);*/
		  ImageIcon centerImage= new ImageIcon("sky.jpg");
	       JLabel center=new JLabel(centerImage);
		  center.setLayout(null);
		  JLabel firstNumber=new JLabel("Enter First Num : ");
		  firstNumber.setBounds(20, 20, 140,30);
		  center.add(firstNumber);
			
		   tfirstNumber=new JTextField(30);
		  tfirstNumber.setBounds(150,20, 300, 27);
		  center.add(tfirstNumber);
		  
		  JLabel secondNumber=new JLabel("Enter Second Num : ");
		  secondNumber.setBounds(20, 60, 140,30);
		  center.add(secondNumber);
			
		  tSecondNumber=new JTextField(30);
		  tSecondNumber.setBounds(150,60, 300, 27);
		  center.add(tSecondNumber);
		  
		  ImageIcon icon=new ImageIcon("new_02.gif");
		  JButton ok=new JButton("Sum",icon);
		  ok.setBounds(30,100, 120, 30);
		  center.add(ok);
		  ok.addActionListener(this);
		  
		  result=new JLabel("waited...... ");
		  result.setBounds(170, 100,300,30);
		  result.setForeground(Color.blue);
		  result.setFont(new Font("Helvetica", Font.BOLD, 25));
		  center.add(result);
			conn.add(center,BorderLayout.CENTER);
			
			
			 JPanel footer=new JPanel();
			 footer.setLayout(new FlowLayout());
			 footer.setBackground(Color.yellow);
			  JLabel flable=new JLabel("Office Address : H-154,Sec-23,Sanjay Nagar(9873003702)");
			  footer.add(flable);
			  conn.add(footer,BorderLayout.SOUTH);
	
	}
	
	public static void main(String[] args) {
		AddTwoNumber ob=new AddTwoNumber();
			 ob.setSize(500,400);
			 ob.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String firstNum=tfirstNumber.getText();
		String secondNum=tSecondNumber.getText();
		int num1=Integer.parseInt(firstNum);
		int num2=Integer.parseInt(secondNum);
		int rr=num1+num2;
		 result.setText("Result is  = "+rr);
		//JOptionPane.showMessageDialog(this, "Hey do not click here!");
	}

}
