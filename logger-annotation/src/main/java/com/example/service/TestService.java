package com.example.service;


import com.example.annotation.LogMethod;
import com.example.domain.DomainObject;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @LogMethod("first")
    public DomainObject getDomain(String parameter) {
        return new DomainObject(1L, "Luisin, are you crazy?");
    }
}
