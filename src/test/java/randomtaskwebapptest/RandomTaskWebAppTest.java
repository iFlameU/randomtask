package randomtaskwebapptest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import randomtaskwebapp.RandomTaskWebApp;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    assertDoesNotThrow(RandomTaskWebApp.class.getMethod("getVisitor"));
  }
}
