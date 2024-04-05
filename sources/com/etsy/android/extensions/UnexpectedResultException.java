package com.etsy.android.extensions;

import kotlin.jvm.internal.C19383o;

public final class UnexpectedResultException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnexpectedResultException(String str) {
        super(str);
        C19383o.m32797g(str, "message");
    }
}
