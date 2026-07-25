package consoleapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

  @Test
  @DisplayName("Running the console app without parameters should provide a 5 minute task")
  void noParam() {
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    try {
      System.setOut(new PrintStream(output));

      Main.main(new String[]{});

      String[] lines = output.toString().split("\\R");

      String estimatedTime = lines[1]
        .replace("Estimated time: ", "")
        .trim();

      int minutes = Integer.parseInt(
        estimatedTime.replace("m", "")
      );

      assertTrue(minutes >= 1 && minutes <= 5);
      assertTrue(estimatedTime.endsWith("m"));

    } finally {
      System.setOut(originalOut);
    }
  }
}
