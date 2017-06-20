package org.zalando.nakadi.plugin.api.authz;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Resource {

    private final String name;
    private final String type;
    private Map<AuthorizationService.Operation, List<AuthorizationAttribute>> authorizationAttributes;

    public Resource(final String name, final String type,
                    final Map<AuthorizationService.Operation, List<AuthorizationAttribute>> authorizationAttributes) {
        this.name = name;
        this.type = type;
        this.authorizationAttributes = authorizationAttributes;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Optional<List<AuthorizationAttribute>> getAttributesForOperation(final AuthorizationService.Operation operation) {
        return Optional.ofNullable(authorizationAttributes.get(operation));
    }
}
