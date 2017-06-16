package org.zalando.nakadi.plugin.api.authz;

import org.json.JSONObject;

public interface AuthorizationService {

    enum Operation {
        READ, WRITE, ADMIN
    }

    boolean isAuthorized(String token, Operation operation, JSONObject eventType);

    boolean isAuthorizationAttributeValid(AuthorizationAttribute attribute);

}
