import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileInformation {

	public static void main(String[] args) {
		// File 인스턴스 만들기
		// 절대경로 사용하는 경우 Windows는 디렉토리 기호 \인데 문자열로 입력할 때는 \\로 입력
		//\는 제어문자로 인식하기 때문
		
		File f = new File("C:\\Users\\20208>C:\\Users\\20208\\Desktop\\학습폴더\\2.DataType.pptx");
		//파일의 존재여부
		if(f.exists()) {
			//파일의 크기
			System.out.printf("파일 크기:%d\n", f.length());
//			System.out.printf("파일이 존재함\n");
			//파일의 마지막 수정 날짜
			System.out.printf("파일 수정 날짜:%d\n", f.lastModified());
//			//마지막 수정 날짜를 yyyy년 mm월 dd일 형식으로 출력
			Date date = new Date(f.lastModified());
			SimpleDateFormat asd = new SimpleDateFormat("yyyy년MM월dd일");
			String result = asd.format(date);
			System.out.printf("%s\n", result);
		}else {	
//			System.out.printf("파일이 존재하지 않음\n");
		}

	}

}
