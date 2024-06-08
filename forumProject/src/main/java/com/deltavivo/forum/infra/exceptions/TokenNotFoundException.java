package com.deltavivo.forum.infra.exceptions;

public class TokenNotFoundException extends RuntimeException{
    
    public TokenNotFoundException(){
        super("Token Not Found");
    }
}
