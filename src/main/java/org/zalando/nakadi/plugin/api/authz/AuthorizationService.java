package org.zalando.nakadi.plugin.api.authz;

import org.zalando.nakadi.plugin.api.PluginException;

public interface AuthorizationService {

    enum Operation {
        READ, WRITE, ADMIN
    }

    /**
     * Check whether a caller, represented by a token, is authorized to perform an operation on a resource.
     *
     * @param subject The subject that performs the operation on the resource
     * @param operation the operation (read, write, admin) to authorize
     * @param resource the resource that the subject wants to perform an operation on
     * @return true if the subject, is authorized to perform the operation on the resource
     * @throws PluginException if an error occurred during execution
     */
    boolean isAuthorized(Subject subject, Operation operation, Resource resource) throws PluginException;

    /**
     * Check whether an attribute is valid.
     *
     * Example: Take an attribute with key 'username' and value 'nakadi'. A plugin implementing this method could
     * check that (a) 'username' is an accepted key, and (b) 'nakadi' is a username that exists and is active.
     *
     * @param attribute the attribute to validate
     * @return true if the attribute is valid
     * @throws PluginException if an error occurred during execution
     */
    boolean isAuthorizationAttributeValid(AuthorizationAttribute attribute) throws PluginException;

}
