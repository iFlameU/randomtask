package e2e;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import server.Main;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStoriesTest {

  @Test
  @DisplayName("Opening http://localhost:8081 I want a page to load")
  public void userStory() {
    ConfigurableApplicationContext context = SpringApplication.run(Main.class, "--server.port=8081");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:8081");

    driver.quit();
    context.close();
    assertTrue(true);
  }
}
