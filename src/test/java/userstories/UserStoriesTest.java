package userstories;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStoriesTest {

  @Test
  @DisplayName("As a visitor, when I open the page I want to be presented with the login page")
  void landingPage(){
    RandomTaskWebApp app = new RandomTaskWebApp();
    app.getVisitor().openPage();
    assertTrue(app.loginPageIsVisible());
  }
}
