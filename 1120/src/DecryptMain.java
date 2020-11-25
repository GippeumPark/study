
public class DecryptMain {

	
	
	public static void main(String[] args) {
		try {
			String text = "joy";
			CryptoUtil util = new CryptoUtil();
			//암호화
			String encrypt = util.encrypt(text);
			System.out.printf("암호화된 문자열:%s\n", encrypt);
			
			//복호화
			String decrypt = util.decrypt(encrypt);
			System.out.printf("복호화된 문자열: %s\n", decrypt);
			
			
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
