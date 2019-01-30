import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	TextField t;
	
	public EventHandler(TextField text) {
		t = text;
	}

	@Override
	public void actionPerformed(ActionEvent x) {
		t.setText("Hello");		
	}

}
