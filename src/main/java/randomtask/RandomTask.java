package randomtask;

public class RandomTask {
  private Task task;

  public void add(Task task) throws TaskEmptyNameException, TaskNoEstimatedTimeException {
    if(task.getName() == null || task.getName().isEmpty()) {
      throw new TaskEmptyNameException();
    }
    if(task.getEstimatedTime() == null || task.getEstimatedTime().isEmpty()) {
      throw new TaskNoEstimatedTimeException();
    }
    this.task = task;
  }

  public Task get() {
    return task;
  }
}
