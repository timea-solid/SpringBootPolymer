package com.example.project; /**
 * Created by ImyPC on 02/06/2015.
 */

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@RestController
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Example {
   // @RequestMapping("/")
    //String home() {
 //       return "Hello World!";
  //  }

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(com.example.project.Example.class, args);
        SpringApplication app = new SpringApplication(Example.class);
        //app.setShowBanner(false);
        app.run(args);
    }
}
