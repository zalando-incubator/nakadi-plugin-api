package org.zalando.nakadi.plugin.api.termination;

@FunctionalInterface
public interface TerminationListener extends Runnable {

    /**
     * Listener code to be executed upon arrival of termination event.
     */
    void run();
}
