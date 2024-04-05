package com.etsy.android.lib.config;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GetConfigException extends RuntimeException {
    public static final int $stable = 0;

    public GetConfigException() {
        this((String) null, (Throwable) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetConfigException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "An unknown error occurred while fetching Config" : str, (i & 2) != 0 ? null : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetConfigException(String str, Throwable th) {
        super(str, th);
        C19383o.m32797g(str, "message");
    }
}
