
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoTest {

	public static void main(String[] args) {
		//원격에 있는 몽고 데이터베이스에 연결
		//접속할 위치는 ip를 적는데 자기 컴퓨터이면 localhost, 다른사람컴퓨터는 ip작성, 없는ip도 일단 연결됨
		//MOngoDB의 기본 포트 번호는 27017
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
//		System.out.printf("%s\n", mongoClient);

		//원격 컴퓨터에 있는 데이터베이스에 접속
		//없는 데이터 입력 시 새로 만들기 때문에 접속 됨
		MongoDatabase db = mongoClient.getDatabase("ppeum");
//		System.out.printf("%s\n", db);
		
		//소유한 컬렉션 가져와서 출력
//		for(String name : db.listCollectionNames()) {
//			System.out.printf("%s\n", name);
//		}
		
		//읽어온 데이터를 저장할 List생성
		//org.bson.Document의 List로 생성
		List<Document> list = new ArrayList<>();
		
		//데이터를 전부 가져오기 - users 컬렉션의 데이터 가져오기
		MongoCollection<Document> collection = db.getCollection("users");
		
		
		//컬렉션의 데이터를 하나씩 접근해서 list에 추가
		MongoCursor<Document>cursor = collection.find().iterator();
		while(cursor.hasNext()	) {
			list.add(cursor.next());
		}
	
		//출력
		for(Document document : list) {
			System.out.printf("%s\n", document);
		}
		
		//데이터 삽입
		Document document = new Document();
		document.append("지역", "경남");
		
		collection.insertOne(document);
		
		//데이터수정은 2개의 Document에 대입
		//첫번째 도큐먼트는 수정할 조건
		//두번째 도큐먼트는 수정할 내용
		Document document1 = new Document();
		document1.append("지역", "경남");
		
		Document document2 = new Document();
		document2.append("지역", "경남");
		document2.append("과천", "석진");
	
		Document document3 = new Document("$set", document2);
		
		//document1 에 해당하는 조건을 찾아서 document2로 변경
		collection.updateMany(document1, document3);
		
		//삭제는 update 대신 delete 이용
		//매개변수로 조건에 해당하는 Document 1개만 대입됨
		collection.deleteMany(document1);
		
	}

}
