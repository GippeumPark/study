import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.commons.mail.SimpleEmail;

public class Action implements ActionListener {
		private JTextField receiveEmail;
		private JTextField tfTitle;
		private JTextArea  content;
		
		
		
		//외부에서 가져와서 사용할 수 있도록 해주는 생성자
		public Action(JTextField receiveEmail, JTextField tfTitle, JTextArea content) {
			super();
			this.receiveEmail = receiveEmail;
			this.tfTitle = tfTitle;
			this.content = content;
		}

		//메일 보내기 실행 을 actionprefomed가 함
	@Override
	public void actionPerformed(ActionEvent e) {
		//받는 사람 주소
		String receive = receiveEmail.getText().trim();
		//제목 만들기
		String title = tfTitle.getText().trim();
		if(title.length() == 0) {
			title = "무제";
		}
		//내용 만들기
		String content = this.content.getText().trim();
		if(content.length() == 0) {
			content = "무제";
		}
		
		//메일 보내기 객체 생성
		SimpleEmail simpleEmail = new SimpleEmail();
		
		//서버설정
		simpleEmail.setHostName("smtp.naver.com");
		simpleEmail.setSmtpPort(995);
		simpleEmail.setAuthentication("ppeum12", "PARKgi1706@");
		simpleEmail.setSSLOnConnect(true);
		simpleEmail.setStartTLSEnabled(true);
		simpleEmail.setCharset("utf-8");
		
		try {
			//받는 설정
			simpleEmail.addTo(receive, "받는 사람", "utf-8");
			//보내는 사람 설정
			simpleEmail.setFrom("ppeum12@naver.com", "박기쁨", "utf-8");
			//제목 설정
			simpleEmail.setSubject(title);
			//내용 설정
			simpleEmail.setMsg(content);
			
			//메일 보내기
			simpleEmail.send();
			
			//성공 메시지 보여주기
			JOptionPane.showMessageDialog(null, "메일 보내기 성공");
			
			
		} catch (Exception e2) {
			System.out.printf("메일 보내기 실패: %s\n", e2.getMessage());
			e2.printStackTrace();
		}

	}

}
