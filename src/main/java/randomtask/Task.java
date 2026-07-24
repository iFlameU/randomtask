package randomtask;

import java.util.Objects;

public class Task {

  private String name;

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Task other) {
      return Objects.equals(this.name, other.name);
    }
    return false;
  }

  public void setName(String name) {
    this.name = name;
  }
}
