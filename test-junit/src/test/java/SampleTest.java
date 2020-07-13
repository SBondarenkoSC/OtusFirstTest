import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    protected  static WebDriver driver;

    private Logger logger = LogManager.getLogger(SampleTest.class);

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Запуск драйвера");
    }




       @Test
    public void Log(){
           logger.info("log info");
           logger.error("log error");
           logger.fatal("log fatal");

    }

/*
        public void testingCookies(){
            driver.manage().addCookie(new Cookie("Otus 1",  "Value 1"));
            driver.manage().addCookie(new Cookie("Otus 2", "Value 2"));
            Cookie cookie = new Cookie ("Otus 3",  "Value 3");
            driver.manage().addCookie(cookie);
            driver.manage().addCookie(new Cookie("Otus 4", "Value 4"));
            driver.manage().getCookies();
            logger.info( "Cookies cooked");
            driver.manage().getCookieNamed("Otus 1");
            driver.manage().deleteCookie(cookie);
            driver.manage().deleteAllCookies();
            driver.manage().getCookies();
        }
*/

    @Test
    public void openPage() {
        driver.get("https://otus.ru/");
        logger.info("Главная OTUS");
//        List<WebElement> menu driver.findELements(By.)
    }

    @After
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
