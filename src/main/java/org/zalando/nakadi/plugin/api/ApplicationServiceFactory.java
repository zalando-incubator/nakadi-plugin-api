package org.zalando.nakadi.plugin.api;

public interface ApplicationServiceFactory {

    ApplicationService init(SystemProperties properties);
}
