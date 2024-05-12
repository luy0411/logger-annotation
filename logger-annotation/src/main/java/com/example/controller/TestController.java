package com.example.controller;

import com.example.domain.DomainObject;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public TestService service;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        DomainObject lalala = service.getDomain("lalala");
        System.out.println(lalala);
        return ResponseEntity.ok().body("Nois joey" + lalala.toString());
    }

    @GetMapping("/test2")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok().body("Joey, JRebel is nice!");
    }
}
