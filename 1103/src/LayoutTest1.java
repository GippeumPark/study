import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutTest1 extends Frame {
	Label lbl;
	public LayoutTest1() {
		//패널을 생성
		Panel pn1 = new Panel();

		//버튼 생성
		Button btn1	= new Button("Button");
		pn1.add(btn1);

//		lbl.setText("버튼1을 눌렀습니다."); 아래 @Override 사용시 final내용 적어야 오류 없음		
//		final Label lbl = new Label("Display"); //final 사용하려면 lbl.setText("버튼1을 눌렀습니다.");아래 적기
		lbl = new Label("Display");
		pn1.add(lbl);
		
		//ActionListener import 다음 add unImplemented까지 해주기
		//anonymous 클래스 안에서는 지역변수 사용 못함
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("Button 1 Click"); //이렇게 작성할 경우 public 위에 Label lbl; 작성해야함
				
			}
			
		});
		
		Label lbl = new Label("출력 영역");
		pn1.add(lbl);
		
		//패널을 프레임에 추가
		add(pn1);
		setTitle("LayoutPractice2");
		setBounds(500,200,300,300);
		setVisible(true);
		
		
	}
}
