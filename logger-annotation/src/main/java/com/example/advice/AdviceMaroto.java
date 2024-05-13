package com.example.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class AdviceMaroto {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ops, algo deu errado. Tente novamente mais tarde!");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleNotFoundException(NoHandlerFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parece que você se perdeu! Não encontramos o recurso que está procurando.");
    }

    @ExceptionHandler({IllegalArgumentException.class, IllegalStateException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleBadRequestException(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Oops, parece que você fez algo errado. Por favor, verifique seus dados e tente novamente!");
    }
}
