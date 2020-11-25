import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventProsessing extends Frame {
	Button btn1, btn2;
	Label lbl;
	
	public ButtonEventProsessing() {
		Panel panl = new Panel();
				
		btn1 = new Button("hahaha");
		panl.add(btn1);
		btn2 = new Button("hohoho");
		panl.add(btn2);		
				
		lbl = new Label("           ");
		panl.add(lbl);
		
//		btn1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				lbl.setText("button 1 click");
//				
//			}
//			
//		});
//
//		btn2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//				
//			}
//			
//		});

		
		add(panl);
		ActionListener routing = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {
					lbl.setText("btn1 click");
				}else if(e.getSource()==btn2){
					System.exit(0);
				}
				
			}
			
		};
		
		btn1.addActionListener(routing);
		btn2.addActionListener(routing);

				
				
		setTitle("ButtonEvent");
		setBounds(200,100,300,300);
		setVisible(true);
		
		
		
		
		
	}
	
	
}
