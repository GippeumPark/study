import java.io.FileReader;
import java.io.FileWriter;

public class CharacterFile {

	public static void main(String[] args) {
		//

		try {
			//문자 단위로 기록할 FileWriter 만들기
			FileWriter fw = new FileWriter("1029Character.txt");
			//기록할 문자열
			String msg="파일에 문자 단위로 기록합니다.\n";
			fw.write(msg);
			fw.flush();
			fw.close();
			
			//문자 단위로 데이터를 읽어올 FileReader 만들기
			FileReader fr = new FileReader("1029Character.txt");
			char [ ] ch = new char[512];
			fr.read(ch);
			String str = new String(ch);
			System.out.printf("%s\n", str);
			fr.close();
			
			
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
