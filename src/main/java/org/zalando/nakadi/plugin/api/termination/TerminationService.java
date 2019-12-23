package org.zalando.nakadi.plugin.api.termination;

import org.zalando.nakadi.plugin.api.exceptions.PluginException;

/**
 * Termination service provides functionality to notify user about coming Nakadi instance termination.
 */
public interface TerminationService {

    /**
     * Registers lister to be executed once termination event happens.
     *
     * @param listenerName        name of the listener
     * @param terminationRunnable action to execute once termination event happens
     * @throws PluginException
     */
    void register(final String listenerName, final TerminationListener terminationRunnable) throws PluginException;

    /**
     * Removes listener by its name.
     *
     * @param listenerName name of the listener
     * @throws PluginException
     */
    void deregister(final String listenerName) throws PluginException;
}
