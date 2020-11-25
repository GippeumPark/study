import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableMain {

	public static void main(String[] args) {
		//User 데이터 설정
		User user = new User();
		user.setNum(1);
		user.setName("기쁨");
		user.setScore(90);

		ArrayList<User> list = new ArrayList<User>();
		list.add(user);
		
		user = new User();
		user.setNum(2);
		user.setName("꼬미");
		user.setScore(100);
		list.add(user);
		try {
			//인스턴스 단위로 저장할 수 있는 스트림 인스턴스를 생성
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("./data.dat"));
			//저장된 클래스의 구조를 알지 못하면 어떤 데이터가 저장되었는지 알지 못함
			//응용 프로그램은 이런 식으로 데이터를 저장
			//그럴 경우 ArrayList 사용하여 또다른 데이터 설정해줌
			
			oos.writeObject(list);
			
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("./data.dat"));

			List<User> list1 = (ArrayList<User>)ois.readObject();
			for(User u : list1) {
				System.out.printf("%s\n", u);
				
			}
			
			ois.close();
								
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
