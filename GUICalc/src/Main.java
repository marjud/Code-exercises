import java.awt.*;

public class Main {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		Label firstNumber = new Label("First Number");
		Label secondNumber = new Label("Second Number");
		Label add = new Label("+");
		Button calc = new Button("=");
		TextField fnumber,snumber, answer;
		fnumber = new TextField(10);
		snumber = new TextField(10);
		answer = new TextField(10);
		FlowLayout fl = new FlowLayout();
		
		fnumber.setText("76");
		snumber.setText("554");
		
		EventHandler e = new EventHandler(fnumber, snumber, answer);
		f.setLayout(fl);
		
		f.add(firstNumber);
		f.add(fnumber);
		f.add(add);
		f.add(secondNumber);
		f.add(snumber);
		f.add(calc);
		f.add(answer);
		calc.addActionListener(e);
		f.setSize(600, 600);
		f.setVisible(true);
		

				
	}

}
