public class InvalidPersonNameException extends RuntimeException{
    public InvalidPersonNameException() {
    }

    public InvalidPersonNameException(String message) {
        super(message);
    }

    public InvalidPersonNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPersonNameException(Throwable cause) {
        super(cause);
    }

    public InvalidPersonNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
