package org.zalando.nakadi.plugin.api.authz;

import java.util.List;

public interface AuthorizationService {

    boolean isAuthorized(String token, List<AuthorizationAttribute> attributeList);

    boolean isAuthorizationAttributeValid(AuthorizationAttribute attribute);

}
