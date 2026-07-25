package randomtask;

public class TaskEmptyNameException extends Exception {
  public TaskEmptyNameException() {
    super("Task name must be given");
  }
}
