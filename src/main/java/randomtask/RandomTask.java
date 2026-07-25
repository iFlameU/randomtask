package randomtask;

public class RandomTask {
  private Task task;

  public void add(Task task) throws TaskEmptyNameException {
    if(task.getName() == null || task.getName().isEmpty()) throw new TaskEmptyNameException("Task has no name");
    this.task = task;
  }

  public Task get() {
    return task;
  }
}
