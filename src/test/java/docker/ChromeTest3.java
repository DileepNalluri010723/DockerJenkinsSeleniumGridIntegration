package docker;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest3 {
	
	@Test
	public void test() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, options);
		driver.get("https://www.udemy.com");
		System.out.println("Title of http://localhost:4444/grid/console the page: "+driver.getTitle());
		driver.quit();
	}

}
