import java.io.File;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BaseballMain {

	public static void main(String[] args) {
//		BaseballDAO dao = new BaseballDAO();
//		dao.connect();
//
//		//삽입할 데이터 객체를 생성
//		BaseballDTO baseball = new BaseballDTO();
//		//이름을 설정
//		baseball.setName("두산");
//		//특정 년월일을 java.sql.Date로 생성하기
//		Calendar cal =
//				new GregorianCalendar(1982, 01, 15);
//		baseball.setBuild(
//				new Date(cal.getTimeInMillis()));
//		
//
//		//파일 대화상자 출력
//	JFileChooser fc = new JFileChooser();
//	//선택할 수 있는 확장자를 설정
//	FileNameExtensionFilter filter = 
//			new FileNameExtensionFilter("이미지", "jpg", "jpeg", "gif", "png");
//	fc.setFileFilter(filter);
//	//확인 버튼을 눌렀는지 아니면 취소버튼을 눌렀는지를 리턴
//	int result = fc.showOpenDialog(null);
//	//확인을 누른경우 그 파일의 경로를 가져옴
//	if(result == JFileChooser.APPROVE_OPTION) {
//		//파일이름 확인
//		File f = fc.getSelectedFile();
////		System.out.printf("%s\n", f.getName());
////		System.out.printf("%s\n", f.getPath());
//
//		
//	}
//		Boolean insertResult = dao.list(baseball);
//		if(insertResult == true) {
//			System.out.printf("삽입 성공\n");
//		}else {
//			System.out.printf("삽입 실패\n");
//		}
//	
//		dao.close();

//		BaseballDAO dao = new BaseballDAO();
//		List<BaseballDTO> list = dao.getList();
//		for(BaseballDTO baseball : list) {
//			System.out.printf("%s\n", baseball);
//		}

		
//		BaseballDAO dao = new BaseballDAO();
//		BaseballDTO baseball = dao.getBaseball(1);
//		System.out.printf("%s\n", baseball);
		
		BaseballDAO dao = new BaseballDAO();
		BaseballDTO baseball = dao.getBaseball(1);
		baseball.setName("ADAM");
		Calendar cal = new GregorianCalendar(2020, 10, 11);
		baseball.setBuild(
				new Date(cal.getTimeInMillis()));
		dao.update(baseball);
		
		
//		BaseballDAO dao = new BaseballDAO();
//		dao.deletd(1);

		
	}

	
}
