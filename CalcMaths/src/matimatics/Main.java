package matimatics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

	public static void main(String[] args) {
		Math m = new Math();
		
		Frame f = new Frame("Da Calc");
		GridLayout grid = new GridLayout(4, 1);
		f.setLayout(grid);	
		
		Button add = new Button("+");
		Button subtract = new Button("-");
		Button multiply = new Button("x");
		Button divide = new Button("/");
		
		f.add(add);
		f.add(subtract);
		f.add(divide);
		f.add(multiply);
		
		f.setSize(600, 600);
		f.setVisible(true);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setOperation("Addition");
				
			}
		});
		
		subtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setOperation("Subtraction");
			}
		});
		
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setOperation("Division");
			}
		});
		
		multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setOperation("Multiplication");
			}
		});
		
	}

}
