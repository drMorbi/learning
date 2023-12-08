package edu.javacours.studentorder.exception;

public class CityRegException extends Exception{
    public CityRegException() {
    }

    public CityRegException(String message) {
        super(message);
    }

    public CityRegException(String message, Throwable cause) {
        super(message, cause);
    }

    public CityRegException(Throwable cause) {
        super(cause);
    }
}
