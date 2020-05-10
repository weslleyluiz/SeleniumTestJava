import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumSampleGoogleHomeTest {

	@BeforeEach
	void setUp() {
	}

	@BeforeEach
	void tearDown() {
	}

	@Test
	public void site_header_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "c:\\users\\wesll\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.google.com");
		WebElement href = browser.findElement(By.xpath("//*[@id=\"gb_70\"]"));
		assertTrue((href.isDisplayed()));
		browser.close();
	}
}
