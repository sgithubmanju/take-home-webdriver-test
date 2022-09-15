package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.localhost.allPages.CheckboxesPage;
import com.localhost.allPages.ContexMenuPages;
import com.localhost.allPages.DragNDroPages;
import com.localhost.allPages.DropDownPages;
import com.localhost.allPages.DyanamicContentPages;
import com.localhost.allPages.DyanamicControlsPages;
import com.localhost.allPages.DyanamicLoadingPages;
import com.localhost.allPages.FileDownloadPages;
import com.localhost.allPages.FileUploadPages;
import com.localhost.allPages.FloatingMenuPages;
import com.localhost.allPages.IframePages;
import com.localhost.allPages.JavaScriptAlertPages;
import com.localhost.allPages.JavaScriptErrorPages;
import com.localhost.allPages.LoginFailurePage;
import com.localhost.allPages.LoginPage;
import com.localhost.allPages.MouseHoverPages;
import com.localhost.allPages.NotificationMessagePages;
import com.localhost.allPages.OpenInNewTabPages;

public class VerifyLogin {

	LoginPage login;
	LoginFailurePage loginFailure;
	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\16572\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void loginSuccess() throws InterruptedException {
		driver.get("http://localhost:7080/login");

		login = new LoginPage(driver);

		login.typeUserName();
		Thread.sleep(500);
		login.typePassword();
		login.clickOnLoginButton();
		String actualUrl = "http://localhost:7080/secure";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Test(priority = 1)
	public void loginFailure() throws InterruptedException {
		driver.get("http://localhost:7080/login");
		loginFailure = new LoginFailurePage(driver);

		loginFailure.typeUserName();
		Thread.sleep(500);
		loginFailure.typePassword();
		loginFailure.clickOnLoginButton();
		String actualUrl = "http://localhost:7080/login";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Test(priority = 3)
	public void checkBoxTest() throws InterruptedException {
		driver.get("http://localhost:7080/checkboxes");

		CheckboxesPage check = new CheckboxesPage(driver);
		Thread.sleep(500);
		check.clickCheckbox1();
		//Assert.assertFalse(checkBox.isSelected());
		check.clickCheckbox2();
	}

	@Test(priority =4)
	public void ContextMenu() {
		driver.get("http://localhost:7080/context_menu");
		ContexMenuPages contexm = new ContexMenuPages(driver);
		contexm.taskContexMenu();
		
	}
		
		
	@Test(priority=5)
	public void DragNDrop()  {
		driver.get("http://localhost:7080/drag_and_drop");
		DragNDroPages dragDrop= new DragNDroPages(driver);
	
		dragDrop.dropDrag();
	}
	
	@Test(priority=6)
	public void DropDown() throws InterruptedException {
		driver.get("http://localhost:7080/dropdown");
		DropDownPages dropDown=new DropDownPages(driver);
		Thread.sleep(500);
		dropDown.taskDropDown();
	}
	@Test(priority=7)
	public void DyanamicContect() throws InterruptedException {
		driver.get("http://localhost:7080/dynamic_content");
		DyanamicContentPages dyanamic = new DyanamicContentPages(driver);
		Thread.sleep(500);
		dyanamic.taskDyanamicContent();
	}
	@Test(priority=8)
	public void DyanamicControls() throws InterruptedException {
		driver.get(" http://localhost:7080/dynamic_controls");
		DyanamicControlsPages dyanamicCon = new DyanamicControlsPages (driver);
		Thread.sleep(500);
		dyanamicCon.taskDyanamicControls();
	}
	@Test(priority=9)
	public void DyanamicLoading() throws InterruptedException {
		driver.get("http://localhost:7080/dynamic_loading/2");
		 DyanamicLoadingPages dyanamicLoad = new  DyanamicLoadingPages(driver);
		 Thread.sleep(500);
		 dyanamicLoad.taskDyanamicLoadinga();
	}
	
	@Test(priority=10)
	public void FileDownload() throws InterruptedException {
		driver.get("http://localhost:7080/download");
		 FileDownloadPages file = new  FileDownloadPages(driver);
		 Thread.sleep(500);
		 file.taskFileDownload();
	}
	
	@Test(priority=11)
	public void FileUpload() throws InterruptedException {
		driver.get("http://localhost:7080/upload");
		FileUploadPages fileUp = new  FileUploadPages(driver);
		 Thread.sleep(500);
		 fileUp.taskFileUpload();
	}
	@Test(priority=12)
	public void FloatingMenu() throws InterruptedException {
		driver.get("http://localhost:7080/floating_menu");
		FloatingMenuPages floating = new FloatingMenuPages(driver);
		 Thread.sleep(500);
		 floating.taskFloatingMenu();
	}
	@Test(priority=13)
	public void Iframe() throws InterruptedException {
		driver.get("http://localhost:7080/iframe");
		IframePages iframe = new IframePages(driver);
		Thread.sleep(500);
		iframe.taskIframe();
	}
	@Test(priority=14)
	public void MouseHover() throws InterruptedException {
		driver.get("http://localhost:7080/hovers");
		MouseHoverPages mouse = new MouseHoverPages(driver);
		Thread.sleep(500);
		mouse.taskMouseHover();
	}
	@Test(priority=15)
	public void JavaScriptAlerts() throws InterruptedException {
		driver.get("http://localhost:7080/javascript_alerts");
		JavaScriptAlertPages jsAlert = new JavaScriptAlertPages(driver);
		Thread.sleep(500);
		jsAlert.taskJavaScriptAlert();
		
	}
	@Test(priority=16)
	public void JavaScriptErrors() throws InterruptedException {
		driver.get("http://localhost:7080/javascript_error");
		JavaScriptErrorPages jsAlert = new JavaScriptErrorPages(driver);
		Thread.sleep(500);
		jsAlert.extractJSLogsInfo();
		
	}
	@Test(priority=17)
	public void OpenInNewTab() throws InterruptedException {
		driver.get("http://localhost:7080/windows");
		OpenInNewTabPages open = new OpenInNewTabPages(driver);
		Thread.sleep(500);
		open.taskOpenInNewTab();
		
	}
	
	@Test(priority=18)
	public void NotificationMessage() throws InterruptedException {
		driver.get("http://localhost:7080/notification_message_rendered");
		 NotificationMessagePages notification = new   NotificationMessagePages(driver);
		 Thread.sleep(500);
		 notification.taskNotificationPages();
		 
			
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
