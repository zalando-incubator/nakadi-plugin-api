package org.zalando.nakadi.plugin.api.authz;

import java.util.List;
import java.util.Optional;

public interface Resource<T> {

    String getName();

    String getType();

    Optional<List<AuthorizationAttribute>> getAttributesForOperation(final AuthorizationService.Operation operation);

    T get();

}
