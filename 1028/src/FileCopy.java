import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {

	public static void main(String[] args) {
		// 파일의 경로를 Path 클래스로 생성
		// 현재 작업 디렉토리에 있는 13.IO.pptx 파일의 경로를 생성
		Path from = Paths.get("./13.IO.java");
		//동일한 이름으로 상위 디렉토리 경로를 생성 (한단계 더 상위 폴더)
		Path to = Paths.get("../13.IO.java");
		//파일 복사
		try {
			Files.copy(from, to);
		} catch (IOException e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
	
	}

}
