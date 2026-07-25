package randomtask;

public class TaskNoEstimatedTimeException extends Exception {
  public TaskNoEstimatedTimeException() {
    super("Task estimated time must be given");
  }
}
