import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.printf("보낼 메시지 입력:");
				String msg = sc.nextLine();
				
				//보내는 소켓을 생성
				DatagramSocket dsoc = new DatagramSocket();
				
				//보낼 곳의 주소와 포트를 설정
				InetAddress ia = InetAddress.getByName("192.168.10.7");
				int port = 5555;
				
				//보낼 패킷을 생성
				DatagramPacket dp = new DatagramPacket(
						msg.getBytes(),msg.getBytes().length, ia, port);
				dsoc.send(dp);
				dsoc.close();
				System.out.printf("전송 완료\n");
				
			}
				
			
		}catch(Exception e){
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		
		}

	}

}
