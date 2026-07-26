package randomtaskwebapptest.visitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import randomtaskwebapp.visitor.Visitor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VisitorTest {

  @Test
  @DisplayName("Visitor exists")
  void visitorExists() {
    //noinspection ObviousNullCheck
    assertNotNull(new Visitor());
  }

  @Test
  @DisplayName("Visitor needs to have a function called openPage")
  void randomTaskWebAppHasGetVisitor() {
    assertDoesNotThrow(() -> Visitor.class.getMethod("openPage"));
  }

  @Test
  @DisplayName("Visitor needs to have a function called loginWithInvalidCredentials")
  void randomTaskWebAppHasLoginWithInvalidCredentials() {
    assertDoesNotThrow(() -> Visitor.class.getMethod("loginWithInvalidCredentials"));
  }

}
