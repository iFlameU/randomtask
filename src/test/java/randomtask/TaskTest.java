package randomtask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

  @Test
  void equals() {
    Task task1 = new Task();
    Task task2 = new Task();

    assertEquals(task1, task2);
  }

  @Test
  void notEqualsOnName() {
    Task task1 = new Task();
    Task task2 = new Task();

    task1.setName("Task1");

    assertNotEquals(task1, task2);
  }

  @Test
  void notEqualsOnEstimatedTime() {
    Task task1 = new Task();
    Task task2 = new Task();

    task1.setName("Task");
    task2.setName("Task");

    try {
      task1.setEstimatedTime("10m");
    } catch (InvalidEstimatedTimeFormatException e) {
      fail();
    }

    assertNotEquals(task1, task2);
  }

  @Test
  void getName() {
    Task task = new Task();

    String name = "Task name";
    task.setName(name);

    assertEquals(name, task.getName());
  }

  @Test
  void getEstimatedTime() {
    Task task = new Task();

    String estimatedTime = "10m";
    try {
      task.setEstimatedTime(estimatedTime);
    } catch (InvalidEstimatedTimeFormatException e) {
      fail();
    }

    assertEquals(estimatedTime, task.getEstimatedTime());
  }

  @Test
  @DisplayName("Estimated time must have the format '<number>y <number>d <number>h <number>m'")
  void setEstimatedTime() {
    Task task = new Task();

    String estimatedTime = "10";

    assertThrows(InvalidEstimatedTimeFormatException.class, () -> task.setEstimatedTime(estimatedTime));
  }
}
