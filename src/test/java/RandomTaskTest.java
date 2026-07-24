import org.junit.jupiter.api.Test;
import randomtask.RandomTask;
import randomtask.Task;

public class RandomTaskTest {

  @Test
  void getTest() {
    RandomTask randomTask = new RandomTask();

    Task task = new Task();

    randomTask.add(task);

    Task returned = randomTask.get();
  }
}
