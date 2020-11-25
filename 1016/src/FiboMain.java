
public class FiboMain {
	public static int noRecursion(int n) {
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		for(int i=3; i<=n; i=i+1) {
			result = n1 + n2;
			n2 = n1;
			n1 = result;
			
		}
		return result;
	}
	//재귀를 이용한 피보나치 수열 메소드
	public static int recursion(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return recursion(n-1) + recursion(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(noRecursion(100));
		System.out.println(recursion(100));
	}
	
	
	
}
