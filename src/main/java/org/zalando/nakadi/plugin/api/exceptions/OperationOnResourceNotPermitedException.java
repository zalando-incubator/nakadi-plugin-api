package org.zalando.nakadi.plugin.api.exceptions;

public class OperationOnResourceNotPermitedException extends RuntimeException {

    public OperationOnResourceNotPermitedException(String message) {
        super(message);
    }
}
