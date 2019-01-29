package org.zalando.nakadi.plugin.api.authz;

public interface EventTypeAuthz
{

    String getAuthCompatibilityMode();

    String getAuthCleanupPolicy();
}
