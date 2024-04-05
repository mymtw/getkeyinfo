package com.etsy.android.lib.network;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class DebugApiRequestDecorator$Companion$getFeatureFlags$1 extends Lambda implements C19857l<String, CharSequence> {
    public static final DebugApiRequestDecorator$Companion$getFeatureFlags$1 INSTANCE = new DebugApiRequestDecorator$Companion$getFeatureFlags$1();

    public DebugApiRequestDecorator$Companion$getFeatureFlags$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        C19383o.m32797g(str, "key");
        return C0388a.m1049e(new Object[]{str, DebugApiRequestDecorator.f19167a.get(str)}, 2, "%s:%s", "format(this, *args)");
    }
}
