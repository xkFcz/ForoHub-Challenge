package com.forohub.challenge.infra.errors;

import java.io.Serial;

public class IntegrityValidation extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public IntegrityValidation(String s){
        super(s);
    }
}