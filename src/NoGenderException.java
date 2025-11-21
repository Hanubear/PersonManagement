public class NoGenderException extends RuntimeException{

    public NoGenderException(String message) {
        super(message);
    }

    public NoGenderException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoGenderException(Throwable cause) {
        super(cause);
    }

    public NoGenderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NoGenderException() {
    }
}
