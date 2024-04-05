package com.google.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

enum Functions$IdentityFunction implements C15784e<Object, Object> {
    INSTANCE;

    @NullableDecl
    public Object apply(@NullableDecl Object obj) {
        return obj;
    }

    public String toString() {
        return "Functions.identity()";
    }
}
