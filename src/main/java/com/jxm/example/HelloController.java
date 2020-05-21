package com.jxm.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


  @GetMapping(value = "hello/{name}")
  String hello(@PathVariable("name") String name) {
    return "Hello " + name;
  }

}
