package com.adigsoft.core;

/**
 * -- Alex Dobrescu --
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String getResource() {
    return "Spring Boot Testing!";
  }

}
