package org.zalando.nakadi.plugin.api;

public interface ApplicationServiceFactory {

    /**
     * @param properties system properties to initialize plugin
     * @return constructed ApplicationService instance
     * @throws PluginException if an error occurred on plugin initialization
    */
    ApplicationService init(SystemProperties properties);
}
