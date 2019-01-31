import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
	
	TextField display;
	
	public EventHandler(TextField display) {
		this.display = display;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		String t = display.getText();
		display.setText(t + btn.getLabel());
		
	}
}
