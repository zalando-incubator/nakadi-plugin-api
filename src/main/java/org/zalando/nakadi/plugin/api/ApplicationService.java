package org.zalando.nakadi.plugin.api;

public interface ApplicationService {

    /**
     * @throws PluginException if an error occurred while execute
     */
    boolean exists(String applicationId);
}
