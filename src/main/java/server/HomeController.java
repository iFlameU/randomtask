package server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.HomePage;

@RestController
public class HomeController {

  @GetMapping("/")
  public String home() {
    return new HomePage().toString();
  }
}
