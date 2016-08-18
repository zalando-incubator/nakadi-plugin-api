package org.zalando.nakadi.plugin.api;

public class PluginException extends RuntimeException {

    public PluginException(String message) {
        super(message);
    }

    public PluginException(String message, Throwable e) {
        super(message, e);
    }

    public PluginException(Throwable e) {
        super(e);
    }
}
