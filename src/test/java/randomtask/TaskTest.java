package randomtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

  @Test
  void equals() {
    Task task1 = new Task();
    Task task2 = new Task();

    assertEquals(task1, task2);
  }
}
