package io.reflectoring.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class controller {

    @GetMapping("/name")
    public String getName() {
        return "Johan";
    }
    
    
}
