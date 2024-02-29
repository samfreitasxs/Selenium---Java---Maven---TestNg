import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    public static void Setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/Users/samue/untitled/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://portal-dev.pmerj.seg.br/login");
    }

    @Test
    void teststeps() {
        driver.findElement(By.id("cpf")).sendKeys("10173500005");
        driver.findElement(By.id("senha")).sendKeys("18563995sS$");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Encontrar o elemento
        WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"caixaForm\"]/div[2]/form/div[3]/div/div[2]/p[2]"));

        // Criar uma ação
        Actions actions = new Actions(driver);

        // Clicar e segurar o botão por um tempo (aqui definido como 2 segundos)
        actions.clickAndHold(buttonElement).perform();
        try {
            Thread.sleep(2000); // Tempo em milissegundos (2 segundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Soltar o botão
        actions.release(buttonElement).perform();

        // Fechar o driver
        driver.close();
    }
}
