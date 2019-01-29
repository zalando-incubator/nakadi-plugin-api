package org.zalando.nakadi.plugin.api.authz;

public interface EventAuthz
{

    String getCompatibilityMode();

    String getCleanupPolicy();
}
