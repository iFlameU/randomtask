package randomtaskwebapptest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import randomtaskwebapp.RandomTaskWebApp;
import randomtaskwebapp.visitor.Visitor;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTaskWebAppTest {

  @Test
  @DisplayName("RandomTaskWebApp needs to exist")
  void randomTaskWebAppExists() {
    //noinspection ObviousNullCheck
    assertNotNull(new RandomTaskWebApp());
  }

  @Test
  @DisplayName("RandomTaskWebApp need to have a function called getVisitor")
  void randomTaskWebAppHasGetVisitor() {
    assertDoesNotThrow(() -> RandomTaskWebApp.class.getMethod("getVisitor"));
  }

  @Test
  @DisplayName("RandomTaskWebApp.getVisitor needs to return an object")
  void getVisitorReturnsAnObject() {
    assertNotNull(new RandomTaskWebApp().getVisitor());
  }

  @Test
  @DisplayName("RandomTaskWebApp.getVisitor needs to return a Visitor object")
  void getVisitorReturnsAVisitorObject() {
    assertInstanceOf(Visitor.class, new RandomTaskWebApp().getVisitor());
  }

  @Test
  @DisplayName("RandomTaskWebApp need to have a function called loginPageIsVisible")
  void randomTaskWebAppHasLoginPageIsVisible() {
    assertDoesNotThrow(() -> RandomTaskWebApp.class.getMethod("loginPageIsVisible"));
  }

  @Test
  @DisplayName("RandomTaskWebApp.loginPageIsVisible needs to return a boolean")
  void loginPageIsVisibleReturnsABoolean() {
    assertInstanceOf(Boolean.class, new RandomTaskWebApp().loginPageIsVisible());
  }

  @Test
  @DisplayName("RandomTaskWebApp need to have a function called showsInvalidCredentialsErrorMessage")
  void randomTaskWebAppHasShowsInvalidCredentialsErrorMessage() {
    assertDoesNotThrow(() -> RandomTaskWebApp.class.getMethod("showsInvalidCredentialsErrorMessage"));
  }

  @Test
  @DisplayName("RandomTaskWebApp.showsInvalidCredentialsErrorMessage needs to return a boolean")
  void showsInvalidCredentialsErrorMessageReturnsABoolean() {
    assertInstanceOf(Boolean.class, new RandomTaskWebApp().showsInvalidCredentialsErrorMessage());
  }
}
