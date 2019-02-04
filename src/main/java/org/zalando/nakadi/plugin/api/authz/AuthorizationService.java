package org.zalando.nakadi.plugin.api.authz;

import org.zalando.nakadi.plugin.api.PluginException;

import java.util.List;
import java.util.Optional;

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
     * Checks whether all the Authorizations for the Resource are valid.
     *
     * Example: Take a resource,for example, a subscription. A plugin implementing this method could
     * check that all the authorisation attributed in subscription is valid and have rights to perform the operation.
     *
     * @param resource the resource that the subject wants to perform an operation on
     * @return true if the all the attributes of the resource have the correct access for the operation.
     * @throws PluginException if an error occurred during execution
     */
    boolean areAllAuthorizationsForResourceValid(Resource resource) throws PluginException;

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
     * Filters a list of resources based on authorization rules.
     *
     * For example, if a user is only able to see the event types for which he has some permissions, this method
     * will take the list of all event types, and return only those that the caller can see.
     *
     * @param input the list to filter
     * @return a filtered list
     * @throws PluginException if an error occurred during execution
     */
    List<Resource> filter(List<Resource> input) throws PluginException;

    /**
     * Get the subject from the request made to the server.
     *
     * @return returns the 'Subject' who made the request. The name of the Subject can be then obtained from the
     * object.
     * @throws PluginException if an error occurred during execution
     */
    Optional<Subject> getSubject() throws PluginException;
}
