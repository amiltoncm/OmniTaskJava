package br.com.amxsystems.omnitask.common.error;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
