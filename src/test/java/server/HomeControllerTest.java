package server;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import webapp.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
  @Test
  @DisplayName("Homecontroller.home should return the HomePage.toString()")
  void homeReturnsHomePageToString() {
    assertEquals(new HomePage().toString(), new HomeController().home());
  }
}
