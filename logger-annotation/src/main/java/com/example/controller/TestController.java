package com.example.controller;

import com.example.domain.DomainObject;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public TestService service;

    @GetMapping("/test/{nome}")
    public ResponseEntity<String> test(@PathVariable String nome) {
        DomainObject lalala = service.getDomain(nome);
        return ResponseEntity.ok().body("Nois jongo - " + lalala.toString());
    }
    @GetMapping("/test")
    public ResponseEntity<String> root() {
        return ResponseEntity.ok().body("Vai veni");
    }

}
