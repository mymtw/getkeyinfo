package com.facebook.bolts;

import kotlin.jvm.internal.C19383o;

public final class ExecutorException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExecutorException(Exception exc) {
        super("An exception was thrown by an Executor", exc);
        C19383o.m32797g(exc, "e");
    }
}
