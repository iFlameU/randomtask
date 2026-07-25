package randomtask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTaskTest {

  @Test
  void getTest() {
    RandomTask randomTask = new RandomTask();

    Task task = new Task();

    task.setName("Test");
    task.setEstimatedTime("10m");

    try {
      randomTask.add(task);
    } catch (TaskEmptyNameException | TaskNoEstimatedTimeException e) {
      fail();
    }

    Task returned = randomTask.get();

    assertEquals(task, returned);
  }

  @Test()
  @DisplayName("RandomTask.add throws TaskEmptyNameException if Task added has no name")
  void addNoTaskName() {
    RandomTask randomTask = new RandomTask();

    Task task = new Task();

    assertThrows(TaskEmptyNameException.class, () -> randomTask.add(task));
  }

  @Test()
  @DisplayName("RandomTask.add throws TaskEmptyNameException if Task added has no name")
  void addNoTaskEstimatedTime() {
    RandomTask randomTask = new RandomTask();

    Task task = new Task();
    task.setName("Test");

    assertThrows(TaskNoEstimatedTimeException.class, () -> randomTask.add(task));
  }
}
