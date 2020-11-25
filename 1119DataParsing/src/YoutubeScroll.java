import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YoutubeScroll {

	public static void main(String[] args) {

		try {
			//환경변수 설정
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\20208\\Desktop\\학습폴더\\chromedriver.exe");

			//웹브라우저를 출력하지 않고 데이터 수집하고싶을때 1.
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");

			//크롬 드라이버 생성
			//WebDriver driver = new ChromeDriver();
			
			////웹브라우저를 출력하지 않고 데이터 수집하고싶을떄 2.
			WebDriver driver = new ChromeDriver(options);
			
			//웹 사이트 접속
			driver.get("https://www.youtube.com/feed/trending");
			
			//스크롤을 하려면 우선 body태그를 찾아야 함
			WebElement body = driver.findElement(By.tagName("body"));
			
			//5번 스크롤
			for(int i=0; i<5; i=i+1) {
				Thread.sleep(5000);
				body.sendKeys(Keys.PAGE_DOWN);
			}
			//html을 가져와서 출력
			String html = driver.getPageSource();
			System.out.printf("%s\n", html);
			
			Thread.sleep(5000);
			body.sendKeys(Keys.PAGE_DOWN);
			
		} catch (Exception e) {
			System.out.printf("유튜브 스크롤 실패: %s\n", e.getLocalizedMessage());
			e.printStackTrace();
		}

	}

}
