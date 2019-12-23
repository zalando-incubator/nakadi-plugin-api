package org.zalando.nakadi.plugin.api.termination;

import org.zalando.nakadi.plugin.api.SystemProperties;
import org.zalando.nakadi.plugin.api.exceptions.PluginException;

public interface TerminationServiceFactory {

    /**
     * @param properties system properties to initialize plugin
     * @return constructed ApplicationService instance
     * @throws PluginException if an error occurred on plugin initialization
     */
    TerminationService init(SystemProperties properties) throws PluginException;
}
