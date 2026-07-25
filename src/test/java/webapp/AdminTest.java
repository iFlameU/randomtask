package webapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminTest {
  static WebDriver driver;
  static ConfigurableApplicationContext context;

  @BeforeAll
  static void setup() {
    context = SpringApplication.run(Main.class, "--server.port=8081");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterAll
  static void teardown() {
    driver.quit();
    context.close();
  }

  @Test
  @DisplayName("When I log in as admin I should see the list of users")
  void loginAsAdmin(){

    driver.get("http://localhost:8081");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("login-button")).click();

    assertTrue(driver.findElement(By.id("users-list")).isDisplayed());
  }
}
