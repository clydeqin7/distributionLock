package com.fe4fun.distributionLock.exception;

public class CannotAcquireLockException extends RuntimeException{
    public CannotAcquireLockException(String message) {super(message);}
}
