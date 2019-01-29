package org.zalando.nakadi.plugin.api.authz;

public interface EventAuthz
{

    String getAuthCompatibilityMode();

    String getAuthCleanupPolicy();
}
