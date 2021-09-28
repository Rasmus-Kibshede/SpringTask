package com.example.springfirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@RestController
public class Controller {

  @RequestMapping
  public String helloWorld() {
    return "Hello World from Spring Boot";
  }

  @RequestMapping("/goodbye")
  public String goodbye(){
    return "Goodbye from Spring Boot";
  }

  @RequestMapping("/input")
  public String test(@RequestParam String input){
    return input;
  }


  @RequestMapping("/day")
  public String getDay(){
    Calendar calendar = Calendar.getInstance();

    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    String answer = "";

    if (dayOfWeek == Calendar.FRIDAY){
      answer = "yes";
    }else {
      answer = "no";
    }

    return answer;
  }


}

