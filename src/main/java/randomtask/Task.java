package randomtask;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

  public void setEstimatedTime(String estimatedTime) throws InvalidEstimatedTimeFormatException {
    Pattern PATTERN = Pattern.compile("^(?:(\\d+)y)?(?:(\\d+)d)?(?: ?(\\d+)h)?(?: ?(\\d+)m)?$");
    Matcher matcher = PATTERN.matcher(estimatedTime);

    if (!matcher.matches()) {
      throw new InvalidEstimatedTimeFormatException();
    }
    this.estimatedTime = estimatedTime;
  }

  public String getEstimatedTime() {
    return estimatedTime;
  }
}
