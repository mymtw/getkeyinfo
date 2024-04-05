package com.etsy.android.lib.core;

import kotlin.jvm.internal.C19383o;

public final class EtsyMoneyException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyMoneyException(String str) {
        super(str);
        C19383o.m32797g(str, "message");
    }
}
