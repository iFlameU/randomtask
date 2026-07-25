package randomtask;

public class InvalidEstimatedTimeFormatException extends Exception {
  public InvalidEstimatedTimeFormatException() {
    super("Estimated time must have the format '<number>y <number>d <number>h <number>m'");
  }
}
