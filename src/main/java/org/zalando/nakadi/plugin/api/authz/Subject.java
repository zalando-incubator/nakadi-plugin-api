package org.zalando.nakadi.plugin.api.authz;

public class Subject {

    private final String name;
    private final String token;

    public Subject(final String name, final String token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }
}
