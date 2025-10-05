package MyProject1;

import org.openqa.selenium.chrome.ChromeDriver;

interface WebDriver
{
	void findElement();
	void getWindowHandles();
}
class RemoteWebDriver
{
	public void findElements()
	{
		
	}
}

public class WebDriverInterfaceEx1_Class14 {
	public static void main(String[] args) {
		WebDriver driver = (WebDriver) new ChromeDriver();
	}
}

//The Parent Interface is your Search Context inside Search Context we have WebDriver this is an Interface, We need to
//be implemented by a Class, The Class which is implementing this Interface will be the RemoteWebDriver 
//ChromeDriver, EdgeDriver, SafariDriver, FirefoxDriver are the child of the RemoteWebDriver
