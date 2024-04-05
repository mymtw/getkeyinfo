package com.etsy.android.lib.models;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;

public final class MoshiModelException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoshiModelException(String str, Throwable th) {
        super(C0388a.m1049e(new Object[]{str}, 1, "An error occurred deserializing %s with Moshi", "format(this, *args)"), th);
        C19383o.m32797g(str, "className");
        C19383o.m32797g(th, "cause");
    }
}
