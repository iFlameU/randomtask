package webapp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminTest {

  @Test
  void seleniumWorks(){
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com/");

    assertTrue(true);
  }
}
