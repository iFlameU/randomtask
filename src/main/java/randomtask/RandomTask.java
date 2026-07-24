package randomtask;

public class RandomTask {
  private Task task;

  public void add(Task task) {
    this.task = task;
  }

  public Task get() {

    return task;
  }
}
