package com.google.android.play.core.internal;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p665rl.C18483a;
import p665rl.C18487e;
import p673sl.C18527g;
import p673sl.C18531k;

/* renamed from: com.google.android.play.core.internal.k */
public final class C15699k implements C18527g {

    /* renamed from: a */
    public final Context f35478a;

    /* renamed from: b */
    public final C18487e f35479b;

    /* renamed from: c */
    public final C15701m f35480c;

    /* renamed from: d */
    public final Executor f35481d;

    public C15699k(Context context, ThreadPoolExecutor threadPoolExecutor, C15701m mVar, C18487e eVar) {
        this.f35478a = context;
        this.f35479b = eVar;
        this.f35480c = mVar;
        this.f35481d = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo55527a(List list, C18531k kVar) {
        if (C18483a.f40713e.get() != null) {
            this.f35481d.execute(new C15698j(this, list, kVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
