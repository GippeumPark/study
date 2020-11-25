import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class LayoutTest extends Frame {
	public LayoutTest() {
//패널을 생성
		Panel pn1 = new Panel(); //FlowLayout으로 설정

//레이아웃 생성
		//BorderLayout 생성
//		pn1.setLayout(new BorderLayout());
		//GridLayout 생성
//		pn1.setLayout(new GridLayout(1,2));
		//null 생성
		pn1.setLayout(null);
		
		
//버튼 추가
		Button btn1 = new Button("Button");
		btn1.setBounds(0,0,100,100); //버튼별 크기 위치조절
		pn1.add(btn1);
//		pn1.add("Center",btn1); //다른 Layout 사용시 입력 , GridLayout사용 시 크기 자동 배치해줌, null사용 시 아무것도 출력되지 않음

		Button btn2 = new Button("Button1");
		btn2.setBounds(100,100,100,100);
		pn1.add(btn2); //기본 출력시 입력방법
//		pn1.add("East",btn2);

		Button btn3 = new Button("Button2");
		btn3.setBounds(200,200,100,100);
		pn1.add(btn3);
//		pn1.add("West",btn3);
		
		
//패널을 프레임에 추가
		add(pn1);
		
		setTitle("Layout Practice");
			setBounds(500,200,300,300);
			setVisible(true);

			
	}
	
	
}
