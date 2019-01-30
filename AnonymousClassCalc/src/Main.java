import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
	static String manswer;
	public static void main(String[] args) {
		Frame f = new Frame();
		TextField fnumber,snumber, answer;
		fnumber = new TextField(10);
		snumber = new TextField(10);
		answer = new TextField(10);
		Button add = new Button("+");
		Button subtract = new Button("-");
		Button multiply = new Button("x");
		Button divide = new Button("/");
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		
		//String stradd = add.get
				
		f.add(fnumber);
		f.add(snumber);
		f.add(add);
		f.add(subtract);
		f.add(divide);
		f.add(multiply);
		f.add(answer);
		f.setSize(600, 600);
		f.setVisible(true);
		
		fnumber.setText("76");
		snumber.setText("554");
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(fnumber.getText());
				int b = Integer.parseInt(snumber.getText());
				
				int sumanswer = a + b;
				manswer = Integer.toString(sumanswer);
				answer.setText(manswer);
			}
		});
		
		subtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(fnumber.getText());
				int b = Integer.parseInt(snumber.getText());
				
				int sumanswer = a - b;
				manswer = Integer.toString(sumanswer);
				answer.setText(manswer);
			}
		});
		
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(fnumber.getText());
				int b = Integer.parseInt(snumber.getText());
				
				int sumanswer = a / b;
				manswer = Integer.toString(sumanswer);
				answer.setText(manswer);
			}
		});
		
		multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(fnumber.getText());
				int b = Integer.parseInt(snumber.getText());
				
				int sumanswer = a * b;
				manswer = Integer.toString(sumanswer);
				answer.setText(manswer);
			}
		});
		
	}

}
