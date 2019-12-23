package org.zalando.nakadi.plugin.api.termination;

import org.zalando.nakadi.plugin.api.exceptions.PluginException;

/**
 * Termination service provides functionality to notify user about coming Nakadi instance termination.
 */
public interface TerminationService {

    /**
     * Registers lister to be executed once termination event happens.
     *
     * @param terminationRunnable action to execute once termination event happens
     * @throws PluginException
     */
    void register(final TerminationListener terminationRunnable) throws PluginException;

    /**
     * Current status of the termination.
     *
     * @throws PluginException
     */
    boolean isTerminating() throws PluginException;

}
