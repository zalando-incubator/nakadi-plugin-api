package org.zalando.nakadi.plugin.api.authz;

import org.zalando.nakadi.plugin.api.PluginException;

public interface AuthorizationService {

    enum Operation {
        READ, WRITE, ADMIN
    }

    /**
     * Check whether a caller, represented by a token, is authorized to perform an operation on a resource. Notice that
     * the subject is not an explicit parameter of this method call. That's because this method expects the subject to
     * be accessible in the context, as done in org.springframework.security.core.context.SecurityContextHolder
     *
     * @param operation the operation (read, write, admin) to authorize
     * @param resource the resource that the subject wants to perform an operation on
     * @return true if the subject, is authorized to perform the operation on the resource
     * @throws PluginException if an error occurred during execution
     */
    boolean isAuthorized(Operation operation, Resource resource) throws PluginException;

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

    /**
     * Check whether a uid is merchant api application.
     *
     * Example: Take an attribute with key 'applicationname' and value 'external'. A plugin implementing this method could
     * check that this application name is a special application that forwards all requests from other/external applications.
     *
     * @param attribute the attribute to validate
     * @return true if the attribute is a gateway application
     */
    boolean isGatewayApplicationAttribute(AuthorizationAttribute attribute) throws PluginException;
}
