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

    try {
      randomTask.add(task);
    } catch (TaskEmptyNameException e) {
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
}
