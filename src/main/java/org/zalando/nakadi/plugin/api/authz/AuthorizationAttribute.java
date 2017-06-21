package org.zalando.nakadi.plugin.api.authz;

public interface AuthorizationAttribute {

    String getDataType();

    String getValue();
}
