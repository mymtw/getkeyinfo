package com.bugsnag.android.internal;

import android.content.Context;
import com.bugsnag.android.C5932x;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ImmutableConfigKt$sanitiseConfiguration$1 extends Lambda implements C19846a<File> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ C5932x $configuration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmutableConfigKt$sanitiseConfiguration$1(C5932x xVar, Context context) {
        super(0);
        this.$configuration = xVar;
        this.$appContext = context;
    }

    public final File invoke() {
        this.$configuration.f12711a.getClass();
        return this.$appContext.getCacheDir();
    }
}
