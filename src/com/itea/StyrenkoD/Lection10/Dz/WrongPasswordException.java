package com.itea.StyrenkoD.Lection10.Dz;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
