package org.zalando.nakadi.plugin.api.authz;

import java.util.List;
import java.util.Optional;

public interface Resource {

    String getName();

    String getType();

    Optional<List<AuthorizationAttribute>> getAttributesForOperation(AuthorizationService.Operation operation);
}
