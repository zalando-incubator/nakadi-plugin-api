package org.zalando.nakadi.plugin.api.exceptions;

public class AuthorizationInvalidException extends RuntimeException {

    public AuthorizationInvalidException(String message) {
        super(message);
    }
}
