package int1006;

public class DataType {

	public static void main(String[] args) {
		char ch = 'Z' + 3;
		int i = 'Z' + 3;
		System.out.println("ch: " + ch);
		//문자 변수에 저장해서 D
		System.out.println("int: " + i);
		//정수 변수에 저장해서 68
		String str = "Z" + 1;
		System.out.println("str: " + str);
		//문자열과 숫자열을 더해서 A1
		
		int result = 2100000000 + 1000000000;
		System.out.println("result: " + result);
		//0.1을 100번 더했는데 10.0이 아닌 결과를 출력
		//표현상의 한계 때문에 이런 결과가 나옴
		
		double sum = 0.0;
		for(int k=0; k<100;k=k+1)
			sum = sum + 0.1;
		System.out.println("sum: " + sum);
		
		//int i = (int)10.7;
		//System.out.println("i");
	
		

	}

}
