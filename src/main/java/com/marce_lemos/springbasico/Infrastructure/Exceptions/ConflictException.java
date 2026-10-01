package com.marce_lemos.springbasico.Infrastructure.Exceptions;

import ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator;

public class ConflictException extends RuntimeException{

    public ConflictException (String message){
        super(message);
    }

    public ConflictException(String message, Throwable throwable){
        super(message);
    }
}
