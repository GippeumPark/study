import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventHandler implements ActionListener {
	//View 클래스의 멤버 조작

	View view;
	
	public EventHandler(View view) {
		this.view = view;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		view.lbl.setText("방탄소년단");

	}


}
