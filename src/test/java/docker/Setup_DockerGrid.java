package docker;

import java.io.IOException;

import org.testng.annotations.*;

public class Setup_DockerGrid {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start_dockerGrid.bat");
		Thread.sleep(15000);
	}
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start stop_dockerGrid.bat");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //closes command prompt
	}
}
