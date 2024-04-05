package com.bugsnag.android.internal;

import com.bugsnag.android.C5932x;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ImmutableConfigKt$convertToImmutableConfig$1 extends Lambda implements C19846a<File> {
    public final /* synthetic */ C5932x $config;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmutableConfigKt$convertToImmutableConfig$1(C5932x xVar) {
        super(0);
        this.$config = xVar;
    }

    public final File invoke() {
        this.$config.f12711a.getClass();
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
