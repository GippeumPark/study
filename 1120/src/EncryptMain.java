import org.mindrot.jbcrypt.BCrypt;

public class EncryptMain {

	public static void main(String[] args) {
		String plainText = "joy";
		String encryptText = BCrypt.hashpw(plainText, BCrypt.gensalt());
		System.out.printf("암호화된 문자열: %s\n", encryptText);
		
		//평문과 암호화된 문자열 비교
		Boolean r = BCrypt.checkpw("joy", encryptText);
		if(r == true) {
			System.out.printf("2개의 문자열이 일치합니다.\n");
		}else {
			System.out.printf("2개의 문자열이 일치하지 않습니다.\n");
		}
		
	}

}
