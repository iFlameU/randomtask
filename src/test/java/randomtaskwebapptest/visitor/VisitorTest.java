package randomtaskwebapptest.visitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import randomtaskwebapp.visitor.Visitor;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VisitorTest {

  @Test
  @DisplayName("Visitor exists")
  void visitorExists() {
    //noinspection ObviousNullCheck
    assertNotNull(new Visitor());
  }
}
