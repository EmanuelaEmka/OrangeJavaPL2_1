package pl.sda.OrangeJavaPL2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello world";
    }
}
