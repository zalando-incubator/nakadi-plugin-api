package org.zalando.nakadi.plugin.api.authz;

public class AuthorizationAttribute {

    private final String dataType;
    private final String value;

    public AuthorizationAttribute(final String dataType, final String value) {
        this.dataType = dataType;
        this.value = value;
    }

    public String getDataType() {
        return dataType;
    }

    public String getValue() {
        return value;
    }
}
