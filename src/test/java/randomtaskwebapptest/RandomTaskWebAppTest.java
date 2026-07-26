package randomtaskwebapptest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RandomTaskWebAppTest {

  @Test
  @DisplayName("RandomTaskWebApp needs to exist")
  void randomTaskWebAppExists() {
    assertNotNull(new RandomTaskWebApp());
  }
}
