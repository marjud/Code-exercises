import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Calculate extends JFrame{
	
	static String manswer;
	static boolean addition = false;
	static boolean subtraction = false;
	static boolean multi = false;
	static boolean div = false;
	private static double firstNum;
	private static double secondNumber;
	
	Panel displayPanel = new Panel();
	Panel userPanel = new Panel();
	GridLayout grid = new GridLayout(4,4);
	Button b0 = new Button("0");
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	Button add = new Button("+");
	Button subtract = new Button("-");
	Button multiply = new Button("*");
	Button divide = new Button("÷");
	Button c = new Button("c");
	Button equals = new Button("=");
	TextField display = new TextField(50);
	
	public Calculate(){
		displayPanel.add(display);
		EventHandler e = new EventHandler(display);
		
		userPanel.add(b1);
		b1.setPreferredSize(new Dimension(70, 70));
		userPanel.add(b2);
		userPanel.add(b3);
		userPanel.add(subtract);
		userPanel.add(b5);
		userPanel.add(b4);
		userPanel.add(b6);
		userPanel.add(divide);
		userPanel.add(b7);
		userPanel.add(b8);
		userPanel.add(multiply);
		userPanel.add(add);
		userPanel.add(b9);
		userPanel.add(b0);
		userPanel.add(c);
		userPanel.add(equals);	
		userPanel.setLayout(grid);
		add(userPanel,BorderLayout.SOUTH);
		add(displayPanel, BorderLayout.NORTH);
		
		
		
		b0.addActionListener(e);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		b5.addActionListener(e);
		b6.addActionListener(e);
		b7.addActionListener(e);
		b8.addActionListener(e);
		b9.addActionListener(e);
		
		
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(null);
				addition = false;
				subtraction = false;
				multi = false;
				div = false;
			}
		});
		
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText(null);
				addition = true;
			}
			
		});
		
		subtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText(null);
				subtraction = true;
			}
		});
		
		multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText(null);
				multi = true;
			}
		});
		
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText(null);
				div = true;
			}
		});
		
		equals.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				secondNumber = Double.parseDouble(display.getText());
				if(addition == true) {
					secondNumber = secondNumber + firstNum;
				}
				else if(subtraction == true) {
					secondNumber = firstNum - secondNumber;
				}
				else if(multi == true) {
					secondNumber = secondNumber * firstNum;
				}
				else if(div == true) {
					secondNumber = firstNum / secondNumber;
				}
				display.setText(Double.toString(secondNumber));
			}
		});
		
	}

}
	