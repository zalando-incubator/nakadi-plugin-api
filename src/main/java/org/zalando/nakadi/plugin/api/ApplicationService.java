package org.zalando.nakadi.plugin.api;

import org.zalando.nakadi.plugin.api.exceptions.PluginException;

public interface ApplicationService {

    /**
     * @param applicationId Application Id to validate
     * @return true if application exists false if isn't
     * @throws PluginException if an error occurred while execute
     */
    boolean exists(String applicationId) throws PluginException;
}
