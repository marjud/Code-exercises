import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
	
	TextField firstNumber, secondNumber, ans;
	String Answer;
	
	public EventHandler(TextField fnumber, TextField snumber, TextField answer) {
		firstNumber = fnumber;
		secondNumber = snumber;
		ans = answer;
		int a = Integer.parseInt(fnumber.getText());
		int b = Integer.parseInt(snumber.getText());
		
		int sumanswer = a + b;
		Answer = Integer.toString(sumanswer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ans.setText(Answer);
		
	}

}
