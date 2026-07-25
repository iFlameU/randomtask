package randomtask;

import java.util.Objects;

public class Task {

  private String name;
  private String estimatedTime;

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Task other) {
      return
        Objects.equals(this.name, other.name) &&
          Objects.equals(this.estimatedTime, other.estimatedTime);
    }
    return false;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setEstimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public String getEstimatedTime() {
    return estimatedTime;
  }
}
