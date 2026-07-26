package randomtaskwebapp;

import randomtaskwebapp.visitor.Visitor;

public class RandomTaskWebApp {
  public Visitor getVisitor() {
    return new Visitor();
  }

  public boolean loginPageIsVisible() {
    return true;
  }
}
