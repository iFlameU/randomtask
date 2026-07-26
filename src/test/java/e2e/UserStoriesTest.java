package e2e;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import server.Main;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStoriesTest {
  static ConfigurableApplicationContext context;
  static WebDriver driver;

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

  /*
  Opening http://localhost:8081 I want a page to load
   */
  @Test
  @DisplayName("When the page loads I want to see an input for the username")
  void userStory() {
    driver.get("http://localhost:8081");

    assertTrue(driver.findElement(By.cssSelector("input#username")).isDisplayed());
  }
}
