package org.zalando.nakadi.plugin.api.authz;

public class AuthorizationAttribute {

    private final String key;
    private final String value;

    public AuthorizationAttribute(final String key, final String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
