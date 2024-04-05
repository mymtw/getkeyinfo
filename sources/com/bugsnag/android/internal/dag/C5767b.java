package com.bugsnag.android.internal.dag;

import android.content.Context;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.internal.dag.b */
public final class C5767b extends DependencyModule {

    /* renamed from: b */
    public final Context f12340b;

    public C5767b(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
            C19383o.m32793c(context, "appContext.applicationContext");
        }
        this.f12340b = context;
    }
}
