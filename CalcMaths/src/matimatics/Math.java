package matimatics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Math extends Frame{
	TextField firstNumber, secondNumber, showResult;
	Label firstLabel, secondLabel, blankLabel, resultLabel;
	Button calculate;
	static String manswer;
	
	public Math() {
		firstNumber = new TextField();
		secondNumber = new TextField();
		showResult = new TextField();
		firstLabel = new Label("First number: ");
		secondLabel = new Label("Second number: ");
		blankLabel = new Label();
		resultLabel = new Label("Result: ");
		calculate = new Button("");
		
		GridLayout grid = new GridLayout(4,2);
		setLayout(grid);
		add(firstLabel);
		add(firstNumber);
		add(secondLabel);
		add(secondNumber);
		add(blankLabel);
		add(calculate);
		add(resultLabel);
		add(showResult);
		
		calculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = getTitle();
				int fnum, snum;
				float answer;
				fnum = Integer.parseInt(firstNumber.getText());
				snum = Integer.parseInt(secondNumber.getText());
				
				if (title.equals("Addition")) {
					answer = fnum + snum;
					manswer = Float.toString(answer);
					showResult.setText(manswer);
				}
				if (title.equals("Subtraction")) {
					answer = fnum - snum;
					manswer = Float.toString(answer);
					showResult.setText(manswer);
				}
				if (title.equals("Division")) {
					answer = fnum / snum;
					manswer = Float.toString(answer);
					showResult.setText(manswer);
				}
				if(title.equals("Multiplication")) {
					answer = fnum * snum;
					manswer = Float.toString(answer);
					showResult.setText(manswer);
				}
			}

			
		});
		
		
	}
	public void setOperation(String tt) {
		setTitle(tt);
		if(tt.equals("Addition")) {
			calculate.setLabel("+");
		}
		if(tt.equals("Subtraction")) {
			calculate.setLabel("-");
		}
		if(tt.equals("Division")) {
			calculate.setLabel("/");
		}
		if(tt.equals("Multiplication")) {
			calculate.setLabel("*");
		}
		setSize(600, 600);
		setVisible(true);
	}

}
