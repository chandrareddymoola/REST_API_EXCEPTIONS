package com.chandra.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@GetMapping("/book")
    public String getBookName() {
        String msg=null;
        msg.length();
        return "JAVA";
    }
}
