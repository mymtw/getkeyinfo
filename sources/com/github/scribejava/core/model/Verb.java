package com.github.scribejava.core.model;

public enum Verb {
    GET(false),
    POST(true),
    PUT(true),
    DELETE(false, true),
    HEAD(false),
    OPTIONS(false),
    TRACE(false),
    PATCH(true);
    
    private final boolean permitBody;
    private final boolean requiresBody;

    private Verb(boolean z) {
        this(r1, r2, z, z);
    }

    public boolean isPermitBody() {
        return this.permitBody;
    }

    public boolean isRequiresBody() {
        return this.requiresBody;
    }

    private Verb(boolean z, boolean z2) {
        if (!z || z2) {
            this.requiresBody = z;
            this.permitBody = z2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
