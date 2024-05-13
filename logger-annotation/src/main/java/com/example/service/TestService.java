package com.example.service;


import com.example.annotation.LogMethod;
import com.example.domain.DomainObject;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestService {

    @LogMethod(value = "first")
    public DomainObject getDomain(String parameter) {
        return new DomainObject(1L, parameter + UUID.randomUUID());
    }
}
