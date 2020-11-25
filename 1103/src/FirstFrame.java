import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FirstFrame extends Frame {

	public FirstFrame() {
		this.setTitle("첫번째 윈도우");
		this.setBounds(100,100,300,300);
		
		//패널을 생성
		Panel p = new Panel();
		//버튼 생성
		Button btn = new Button("JOY");
		//버튼을 패널에 추가
		p.add(btn);

		//패널을 프레임에 추가
		this.add(p);
		
		//체크박스 만들기
		Checkbox cb1 = new Checkbox("Java");
		Checkbox cb2 = new Checkbox("Hello");	
		
		p.add(cb1);
		p.add(cb2);
		
		//라디오버튼 만들기(필수)
		//그룹을 하나 추가하고 체크박스 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("Man");
		Checkbox woman = new Checkbox("Woman");	
		
		p.add(man);
		p.add(woman);
				
		
		
		this.setVisible(true);
		this.setBackground(Color.cyan);
	
	}

}
