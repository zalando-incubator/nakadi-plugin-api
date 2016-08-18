package org.zalando.nakadi.plugin.api;

public interface ApplicationServiceFactory {

    /**
     * @throws PluginException if an error occurred on plugin initialization
    */
    ApplicationService init(SystemProperties properties);
}
