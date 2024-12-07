package com.isi.ms2.web.rest.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("/v1/helloworld")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World ms2");
    }


}

