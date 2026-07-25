package randomtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TaskTest {

  @Test
  void equals() {
    Task task1 = new Task();
    Task task2 = new Task();

    assertEquals(task1, task2);
  }

  @Test
  void notEquals() {
    Task task1 = new Task();
    Task task2 = new Task();

    task1.setName("Task1");

    assertNotEquals(task1, task2);
  }

  @Test
  void getName() {
    Task task = new Task();

    String name = "Task name";
    task.setName(name);

    assertEquals(name, task.getName());
  }
}
