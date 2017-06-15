package org.zalando.nakadi.plugin.api.authz;

import org.zalando.nakadi.plugin.api.SystemProperties;

public interface AuthorizationServiceFactory {

    AuthorizationService init(SystemProperties properties);
}
