package randomtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomTaskTest {

  @Test
  void getTest() {
    RandomTask randomTask = new RandomTask();

    Task task = new Task();

    randomTask.add(task);

    Task returned = randomTask.get();

    assertEquals(task, returned);
  }
}
