import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextMailView extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//생성자 - 인스턴스를 만들 때 호출하는 메소드
	//초기화 작업 수행
	public TextMailView() {
		//제목 설정
		setTitle("메일 보내기");
		//위치와 크기 설정
		setBounds(100,100,400,600);
		//종료 기능 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//상단의 화면 구성
		JPanel northPanel = new JPanel();
		//3줄 2칸
		northPanel.setLayout(new GridLayout(3,2));
		JLabel lblSend = new JLabel("보내는 사람", JLabel.RIGHT);
		JLabel sendEmail = new JLabel("박기쁨");
		northPanel.add(lblSend);
		northPanel.add(sendEmail);
		
		JLabel lblReceive = new JLabel("받는 사람", JLabel.RIGHT);
		JTextField receiveEmail = new JTextField(30);
		northPanel.add(lblReceive);
		northPanel.add(receiveEmail);
		
		JLabel lblTitle = new JLabel("제     목", JLabel.RIGHT);
		JTextField txtTitle = new JTextField(30);
		northPanel.add(lblTitle);
		northPanel.add(txtTitle);
		
		add("North", northPanel);
		
		//메일 내용 입력하는 부분
		JTextArea content = new JTextArea(20, 20);
		//화면보다 클 가능성이 있으면 스크롤 뷰에 배치, 화면에서 안보일 가능성이 있어서
		JScrollPane sp = new JScrollPane(content);
		add("Center", sp);
		
		JPanel southPanel = new JPanel();
		JButton btnSend = new JButton("메일 보내기");
		
		//버튼 클릭 이벤트 설정
		btnSend.addActionListener(new Action(receiveEmail, txtTitle, content));

		southPanel.add(btnSend);
		add("South", southPanel);

		//Java GUI 프로그램에서는 화면에 출력되지 않은 상태이기 때문에 이 메소드를 호출해서 화면에 출력해야 함
		setVisible(true);
	}
}
