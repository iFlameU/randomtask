package randomtask;

public class Task {

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Task;
  }
}
