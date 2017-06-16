package org.zalando.nakadi.plugin.api.authz;

import org.json.JSONObject;
import org.zalando.nakadi.plugin.api.PluginException;

public interface AuthorizationService {

    enum Operation {
        READ, WRITE, ADMIN
    }

    /**
     * Check whether a caller, represented by a token, is authorized to perform an operation on an event type.
     *
     * @param token The caller token
     * @param operation the operation (read, write, admin) to authorize
     * @param eventType a JSON representation of the event type on which the operation is requested
     * @return true if the caller, identified by its token, is authorized to perform operation on the eventType
     * @throws PluginException if an error occurred during execution
     */
    boolean isAuthorized(String token, Operation operation, JSONObject eventType);

    /**
     * Check whether an attribute is valid.
     *
     * Example: Take an attribute with key 'username' and value 'nakadi'. A plugin implementing this method could
     * check that (a) 'username' is an accepted key, and (b) 'nakadi' is a username that exists and is active.
     *
     * @param attribute the attribute to validate
     * @return true if the attribute is valid
     */
    boolean isAuthorizationAttributeValid(AuthorizationAttribute attribute);

}
