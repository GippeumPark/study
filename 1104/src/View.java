import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame {

	JLabel lbl;
	JButton btn;
	
	
	public View() {
		setLayout(new FlowLayout());
		
		lbl = new JLabel("버튼을 누르세요!");
		add(lbl);
		
		btn = new JButton("버튼");
		add(btn);
		
		btn.addActionListener(new EventHandler(this));
		
		setTitle("윈도우 프로그래밍");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
