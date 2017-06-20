package org.zalando.nakadi.plugin.api.authz;

public class AuthorizationAttribute {

    private final String category;
    private final String value;

    public AuthorizationAttribute(final String category, final String value) {
        this.category = category;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public String getValue() {
        return value;
    }
}
