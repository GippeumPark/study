import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class SecondFrame extends Frame {
	//생성자
	public SecondFrame() {
		//패널 생성
		Panel p = new Panel();
	
		
		//Label 생성
		final Label lab = new Label("Twincle");
		Thread th = new Thread() {
			boolean flag = true;
			public void run() {
				while(true) {
					if(flag == false) {
						lab.setBackground(Color.yellow);
					}else {
						lab.setBackground(Color.green);
					}
					flag = !flag;
					try {
						Thread.sleep(1000);
					} catch (Exception e) {}
					
				}
			}
		};
		th.start();
		p.add(lab);
		
		//버튼 삽입
		Button btn = new Button("Artist");
		//버튼 패널 추가
		p.add(btn);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("Man");
		p.add(man);
		
		
		//체크박스 만들기
		Checkbox ch1 = new Checkbox("Singer");
		Checkbox ch2 = new Checkbox("Actor");
		Checkbox ch3 = new Checkbox("Gagman");
		
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		
		//선택 목록 삽입
		Choice choice = new Choice();
		choice.add("Bangtan");
		choice.add("Ohmygirl");
		choice.add("Girlfriend");
		
		//패널에 추가
		p.add(choice);


		//List
		List list = new List();
		list.add("Idol");
		list.add("Forfomance");
		list.add("Musicvedio");
		p.add(list);
		
		
		//FileDialog 추가 (읽기)
		FileDialog fd = new FileDialog(this, "file", FileDialog.LOAD);
		fd.setVisible(true);
		System.out.printf("%s\n", fd.getFile());
		
		//FileDialog 추가 (저장)
		FileDialog fs = new FileDialog(this, "file", FileDialog.SAVE);
		fs.setVisible(true);
		System.out.printf("%s\n", fs.getFile());
		
		
		//패널을 프레임에 추가
		add(p);
		
		//기본 옵션 설정
		setTitle("AWT Programming");
		setBounds(200,200,400,400); //좌2개 위치, 우2개 크기
		setVisible(true);
	}
	
	
}
