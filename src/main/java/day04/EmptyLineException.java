package day04;

public class EmptyLineException extends RuntimeException{

    public EmptyLineException() {
    }

    public EmptyLineException(String message) {
        super(message);
    }

    public EmptyLineException(String message, Throwable cause) {
        super(message, cause);
    }

}
