import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {


		try {
			//받는 쪽은 포트 번호와 함께 소켓을 생성
			DatagramSocket dsoc = new DatagramSocket(7777);
			
			//받을 때는 Byte 배열이 필요
			while(true) {
				//전송된 데이터를 저장할 배열을 생성 바이트개수는 본인이 지정
				byte [] b = new byte[65536];
				//데이터 패킷 생성
				DatagramPacket dp = new DatagramPacket(b, b.length);
				System.out.printf("서버 대기 중...\n");

				
				dsoc.receive(dp);
				//받은 내용을 문자열로 만들어서 출력
				String msg = new String(b);
				System.out.printf("%s\n", msg.trim()); //byte지정한 개수보다 적으면 공란이 발생해서 맞춰주는게 좋음, 그때 trim을 해주면 됨
				
				
			}
			
			
		}catch(Exception e){
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		
		}

	}

}
