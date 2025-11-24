public class PersonManagementKeyAlreadyExiststException extends RuntimeException {
    public PersonManagementKeyAlreadyExiststException() {
    }

    public PersonManagementKeyAlreadyExiststException(String message) {
        super(message);
    }

    public PersonManagementKeyAlreadyExiststException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonManagementKeyAlreadyExiststException(Throwable cause) {
        super(cause);
    }

    public PersonManagementKeyAlreadyExiststException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
