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

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LandingPageTest {
  static WebDriver driver;
  static ConfigurableApplicationContext context;

  @BeforeAll
  static void setup() {
    context = SpringApplication.run(Main.class, "--server.port=8081");
    driver = new ChromeDriver();
  }

  @AfterAll
  static void teardown() {
    driver.quit();
    context.close();
  }

  @Test
  @DisplayName("When I open the page I want to be presented the login page")
  void loginPage(){

    driver.get("http://localhost:8081");

    assertTrue(driver.findElement(By.id("username")).isDisplayed());
    assertTrue(driver.findElement(By.id("password")).isDisplayed());
    assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
  }
}
