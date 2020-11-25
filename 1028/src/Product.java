import java.util.ArrayList;

public class Product {
	//공유 자원으로 사용할 List
	private ArrayList<Character> list;
	
	//생성자 - List 생성
	public Product() {
		list = new ArrayList<Character>();
	}

	//list에 문자를 대입하는 메소드 - 생산자가 사용할 메소드
	public synchronized void put(Character ch) {
		list.add(ch);
		//wait 중인 스레드를 깨워서 수행하도록 함
		notifyAll();
		System.out.printf("창고에 제품%c 가 입고되었습니다.\n", ch);
		try {
			Thread.sleep(1000);
			
		}catch(Exception e) {}
		System.out.printf("재고 수량:%d\n", list.size());
	}

	//list에서 데이터를 1개 제거해서 리턴하는 메소드
	public synchronized Character get() {
		if(list.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                  //wait에 에러가 발생시 surround~ 클릭하면 알아서 생성됨 , 
								//하지만 main에서 실행해보면 오류가 나진 않으나 출고가 안됨 -put에서 입력(꼭 synchronized 붙여야 함)
		}
		Character ch = list.remove(0);
		System.out.printf("창고에서 %c 를 출고\n", ch);
		System.out.printf("재고 수량:%d\n", list.size());
		return ch;
	}
	
}


