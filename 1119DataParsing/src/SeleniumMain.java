import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMain {

	public static void main(String[] args) {
		//1.환경변수 설정
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20208\\Desktop\\학습폴더\\chromedriver.exe");
		//2.크롬 드라이버생성
		WebDriver driver = new ChromeDriver();
		//3.크롬으로 네이버 접속
		//driver.get("http://www.naver.com");
		//크롬으로 다음 로그인 페이지
		driver.get("https://logins.daum.net/accounts/signinform.do?url=https%3A%2F%2Fwww.daum.net%2F");
		
		//아이디 입력란 찾아오기
		driver.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("ppeum11");
		
		//비밀번호 입력
		driver.findElement(By.xpath("//*[@id=\"inputPwd\"]")).sendKeys("parkgi1@");
		
		//로그인 클릭
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		

		try {
			//딜레이를 줄 수 있음
			//스레드 슬립을 줄 땐 반드시 try문이 있어야 함
			Thread.sleep(5000);
			//다음카페 원하는 게시판 접속
			driver.get("http://cafe.daum.net/BANGTAN/jbaT");
			Thread.sleep(2000);
			//하나의 화면에 여러개의 프레임으로 되어있는 페이지는 원래 로그인작성시 처럼해도 안됨
			//driver.findElement(By.xpath("//*[@id=\"memoForm\"]/div/table/tbody/tr[1]/td[1]/div/textarea")).sendKeys("BTS MAP OF THE SOUL : 7");
			
			//글 작성 창이 별도의 프레임으로 되어있어 프레임으로 이동한 후 글 작성해야 함
			//이때 쓰는 것이 switchTO
			//페이지 소스 들어가서 frame의 id를 찾아 적고 다시 실행
			driver.switchTo().frame(driver.findElement(By.id("down")));
			driver.findElement(By.xpath("//*[@id=\"memoForm\"]/div/table/tbody/tr[1]/td[1]/div/textarea")).sendKeys("BTS MAP OF THE SOUL : 7");
			
			//클릭하기
			//sleep을 하는 이유는 너무 빨리 실행되면 메크로라고 인식해 막을 수 있어
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"memoForm\"]/div/table/tbody/tr[1]/td[2]/a[1]/span[2]")).click();
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
