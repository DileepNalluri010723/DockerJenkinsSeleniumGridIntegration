package docker;

import java.net.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		driver.get("https://www.google.com");
		System.out.println("Title ofhttp://localhost:4444/grid/console the page: "+driver.getTitle());
		driver.quit();
	}

}
