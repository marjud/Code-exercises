import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	static String manswer;
	public static void main(String[] args) {

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
				Frame frameAdd = new Frame("Addition");
				GridLayout addgrid = new GridLayout(4, 2);
				frameAdd.setLayout(addgrid);
				Label firstNum = new Label("First Number");
				TextField inputFirstNum = new TextField(10);
				Label secondNum = new Label("Second Number");
				TextField inputSecondNum = new TextField(10);
				Label result = new Label("Result: ");
				TextField res = new TextField(10);
				Button addition = new Button("Add");
				frameAdd.add(firstNum);
				frameAdd.add(inputFirstNum);
				frameAdd.add(secondNum);
				frameAdd.add(inputSecondNum);
				frameAdd.add(result);
				frameAdd.add(res);
				frameAdd.add(addition);
				frameAdd.setSize(400, 400);
				frameAdd.setVisible(true);
				
				inputFirstNum.setText("76");
				inputSecondNum.setText("554");
				
				addition.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						int a = Integer.parseInt(inputFirstNum.getText());
						int b = Integer.parseInt(inputSecondNum.getText());
						
						int sumanswer = a + b;
						manswer = Integer.toString(sumanswer);
						res.setText(manswer);
						
					}
				});

			}
		});
		
		subtract.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Frame frameAdd = new Frame("Subtraction");
						GridLayout addgrid = new GridLayout(4, 2);
						frameAdd.setLayout(addgrid);
						Label firstNum = new Label("First Number");
						TextField inputFirstNum = new TextField(10);
						Label secondNum = new Label("Second Number");
						TextField inputSecondNum = new TextField(10);
						Label result = new Label("Result: ");
						TextField res = new TextField(10);
						Button addition = new Button("Subtract");
						frameAdd.add(firstNum);
						frameAdd.add(inputFirstNum);
						frameAdd.add(secondNum);
						frameAdd.add(inputSecondNum);
						frameAdd.add(result);
						frameAdd.add(res);
						frameAdd.add(addition);
						frameAdd.setSize(400, 400);
						frameAdd.setVisible(true);
						
						inputFirstNum.setText("76");
						inputSecondNum.setText("554");
						
						addition.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								
								int a = Integer.parseInt(inputFirstNum.getText());
								int b = Integer.parseInt(inputSecondNum.getText());
								
								int sumanswer = a - b;
								manswer = Integer.toString(sumanswer);
								res.setText(manswer);
								
							}
						});
		
					}
				});
		
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame frameAdd = new Frame("Division");
				GridLayout addgrid = new GridLayout(4, 2);
				frameAdd.setLayout(addgrid);
				Label firstNum = new Label("First Number");
				TextField inputFirstNum = new TextField(10);
				Label secondNum = new Label("Second Number");
				TextField inputSecondNum = new TextField(10);
				Label result = new Label("Result: ");
				TextField res = new TextField(10);
				Button addition = new Button("Divide");
				frameAdd.add(firstNum);
				frameAdd.add(inputFirstNum);
				frameAdd.add(secondNum);
				frameAdd.add(inputSecondNum);
				frameAdd.add(result);
				frameAdd.add(res);
				frameAdd.add(addition);
				frameAdd.setSize(400, 400);
				frameAdd.setVisible(true);
				
				inputFirstNum.setText("76");
				inputSecondNum.setText("554");
				
				addition.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						int a = Integer.parseInt(inputFirstNum.getText());
						int b = Integer.parseInt(inputSecondNum.getText());
						
						int sumanswer = a / b;
						manswer = Integer.toString(sumanswer);
						res.setText(manswer);
						
					}
				});

			}
		});
		
		multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame frameAdd = new Frame("Multiply");
				GridLayout addgrid = new GridLayout(4, 2);
				frameAdd.setLayout(addgrid);
				Label firstNum = new Label("First Number");
				TextField inputFirstNum = new TextField(10);
				Label secondNum = new Label("Second Number");
				TextField inputSecondNum = new TextField(10);
				Label result = new Label("Result: ");
				TextField res = new TextField(10);
				Button addition = new Button("Divide");
				frameAdd.add(firstNum);
				frameAdd.add(inputFirstNum);
				frameAdd.add(secondNum);
				frameAdd.add(inputSecondNum);
				frameAdd.add(result);
				frameAdd.add(res);
				frameAdd.add(addition);
				frameAdd.setSize(400, 400);
				frameAdd.setVisible(true);
				
				inputFirstNum.setText("76");
				inputSecondNum.setText("554");
				
				addition.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						int a = Integer.parseInt(inputFirstNum.getText());
						int b = Integer.parseInt(inputSecondNum.getText());
						
						int sumanswer = a * b;
						manswer = Integer.toString(sumanswer);
						res.setText(manswer);
						
					}
				});

			}
		});
		
	}

}
