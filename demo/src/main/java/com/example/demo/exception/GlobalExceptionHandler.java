package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(ProductNotFoundException.class)
@ResponseStatus(HttpStatus.NOT_FOUND)
public String handleProductNotFoundException(ProductNotFoundException ex) {
return ex.getMessage();
}
}