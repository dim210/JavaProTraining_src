package com.itea.StyrenkoD.Lection10.Dz;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
