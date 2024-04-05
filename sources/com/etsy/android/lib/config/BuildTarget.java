package com.etsy.android.lib.config;

import com.etsy.android.C6434e;
import kotlin.jvm.internal.C19383o;

public enum BuildTarget {
    INTERNAL("internal"),
    GOOGLE_PLAY("play");
    
    public static final C8590a Companion = null;
    /* access modifiers changed from: private */
    public static final BuildTarget audience = null;
    private final String target;

    /* renamed from: com.etsy.android.lib.config.BuildTarget$a */
    public static final class C8590a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8590a();
        BuildTarget buildTarget = C6434e.f14262a;
        C19383o.m32796f(buildTarget, "BUILD_TARGET");
        audience = buildTarget;
    }

    private BuildTarget(String str) {
        this.target = str;
    }

    public static final BuildTarget getAudience() {
        Companion.getClass();
        return audience;
    }

    public final String getTarget() {
        return this.target;
    }

    public final boolean isInternal() {
        return this == INTERNAL;
    }
}
