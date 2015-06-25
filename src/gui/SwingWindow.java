package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingWindow extends JFrame implements MouseListener{
	
	Container conn;
	SwingWindow(){
		  conn=getContentPane();
		  conn.setBackground(Color.magenta);
		  conn.setLayout(null);
		  
		  ImageIcon icon=new ImageIcon("new_02.gif");
		  JButton ok=new JButton("Aha",icon);
		  ok.setBounds(30,20, 120, 30);
		  ok.addMouseListener(this);
		  conn.add(ok);
		  
		  JTextField username=new JTextField(30);
		  username.setBounds(170,20, 300, 30);
		  conn.add(username);
	
	}
	
	public static void main(String[] args) {
			SwingWindow ob=new SwingWindow();
			 ob.setSize(500,400);
			 ob.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		  conn.setBackground(Color.red);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		  conn.setBackground(Color.yellow);
		
	}

}
