import java.net.InetAddress;

public class IPCheck {

	public static void main(String[] args) {
		//현재 컴퓨터의 IP 와 이름을 확인
		
		try {
			
			InetAddress localhost =
					InetAddress.getLocalHost();
			System.out.printf("이름:%s\n", localhost.getHostName());
			System.out.printf("IP:%s\n", localhost.getHostAddress());
			
			InetAddress daum = InetAddress.getByName("www.daum.net");
			System.out.printf("이름:%s\n", daum.getHostName());
			System.out.printf("IP:%s\n", daum.getHostAddress());
			
			
			
		}catch(Exception e){
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
