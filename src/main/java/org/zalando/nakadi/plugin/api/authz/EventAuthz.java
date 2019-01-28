package org.zalando.nakadi.plugin.api.authz;

public interface EventAuthz
{
    public enum CompatibilityMode {
        FORWARD, COMPATIBLE, NONE;
    }
    public enum CleanupPolicy {
        DELETE, COMPACT
    }

    CompatibilityMode getCompatibilityMode();

    CleanupPolicy getCleanupPolicy();
}
