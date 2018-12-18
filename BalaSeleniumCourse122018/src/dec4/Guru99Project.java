package dec4;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

	    ChromeDriver driver;
		
	    public void invokeBrowser() {
	    	
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\balag\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	
	    	driver = new ChromeDriver();
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().deleteAllCookies();
	    	
	    	driver.get("http://demo.guru99.com/v4");
	    	
	    	  
		
	}
	    
	    public void closebrowser() {
	    	
	    	driver.quit();
	    }
	    
	    public void login(String userID, String PassWord) {
	    	
	    	
	    	driver.findElement(By.name("uid")).sendKeys(userID);
	    	
	    	WebElement passwordElement = driver.findElement(By.name("password"));
	    	
	    	passwordElement.sendKeys(PassWord);	    	
	    	
	    	driver.findElement(By.name("btnLogin")).click();
	    	
	    	
	    }
	    
	
	 

}
