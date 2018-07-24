package com.example.sampleboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping({"/hello/{name}", "/hello"})
    public String hello(@PathVariable(value = "name", required = false) Optional<String> name) {
        return "Hello " + name.orElse("World") + "!";
    }
}
