import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
 public Calculator() {    // defined constructor for calculator 
	 JFrame jf=new JFrame("Calculator"); // defined name as calculator 
	 jf.setLayout(null);
	 jf.setSize(600, 600);
	 jf.setLocation(200,150);// just locate the calculator frame in windows.x axis and  y axis .
	 
	 JLabel displayLabel=new JLabel("math");//this object is for displyaing the calculation we can't edit, to edit we need display text class object
	 
	 displayLabel.setBounds(30,50,540,40);
	 displayLabel.setBackground(Color.WHITE);
	 displayLabel.setOpaque(true);
	 displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);// to keep the math on right side of the label
	 displayLabel.setForeground(Color.black);//to change the color of math in lablel
	 jf.add(displayLabel);
	 jf.setVisible(true);
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String[] args) {
	Calculator c= new Calculator(); // created object for calculator under main function 
}
} 
