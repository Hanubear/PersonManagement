public class HashMapKeyAlreadyExistsException extends RuntimeException {
    public HashMapKeyAlreadyExistsException() {
    }

    public HashMapKeyAlreadyExistsException(String message) {
        super(message);
    }

    public HashMapKeyAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public HashMapKeyAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public HashMapKeyAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
