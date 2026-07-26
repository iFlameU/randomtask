package randomtaskwebapp;

import randomtaskwebapp.visitor.Visitor;

public class RandomTaskWebApp {
  public Object getVisitor() {
    return new Visitor();
  }
}
