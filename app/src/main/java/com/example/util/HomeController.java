/*
 * LICENES TEMPLATE
 */

package com.example.util;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {

  @GetMapping("/")
  public String root() {
    return "hello the time is " + LocalDateTime.now();
  }
}
