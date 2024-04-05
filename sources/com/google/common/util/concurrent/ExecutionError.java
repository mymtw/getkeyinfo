package com.google.common.util.concurrent;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class ExecutionError extends Error {
    private static final long serialVersionUID = 0;

    public ExecutionError() {
    }

    public ExecutionError(@NullableDecl String str) {
        super(str);
    }

    public ExecutionError(@NullableDecl String str, @NullableDecl Error error) {
        super(str, error);
    }

    public ExecutionError(@NullableDecl Error error) {
        super(error);
    }
}
