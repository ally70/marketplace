package com.webmarket.microservices.auth.exceptionHandling.ExceptionsDto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ValidationError {
    private List<String> errors;

    public ValidationError(List<String> errors){
        this.errors = errors;
    }

}
