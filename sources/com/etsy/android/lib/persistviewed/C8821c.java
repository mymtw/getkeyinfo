package com.etsy.android.lib.persistviewed;

import android.content.Context;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import com.etsy.android.lib.network.C8730f;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.p327ui.util.C11781i;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p040c9.C4591k;
import p346fa.C12703a;
import p456ua.C13461f;
import p740eq.C19011a;
import p765pr.C20068g;
import p769rr.C20164a;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.lib.persistviewed.c */
public final class C8821c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19385a;

    /* renamed from: b */
    public final C19011a f19386b;

    /* renamed from: c */
    public final C19011a f19387c;

    /* renamed from: d */
    public final C19011a f19388d;

    /* renamed from: e */
    public final Object f19389e;

    public /* synthetic */ C8821c(C19011a aVar, C19011a aVar2, C17555d dVar, C19011a aVar3, int i) {
        this.f19385a = i;
        this.f19386b = aVar;
        this.f19387c = aVar2;
        this.f19388d = dVar;
        this.f19389e = aVar3;
    }

    public final Object get() {
        switch (this.f19385a) {
            case 0:
                return new PersistViewedBus((C8822d) this.f19386b.get(), (C13461f) this.f19387c.get(), (C12703a) this.f19388d.get(), (C8890e0) ((C19011a) this.f19389e).get());
            case 1:
                C11780h hVar = new C11780h((Context) this.f19386b.get(), (C11781i) this.f19387c.get(), (C13461f) this.f19388d.get());
                C8618c cVar = (C8618c) ((C19011a) this.f19389e).get();
                return hVar;
            default:
                OkHttpClientHolder okHttpClientHolder = (OkHttpClientHolder) this.f19386b.get();
                C20164a aVar = (C20164a) this.f19387c.get();
                C8618c cVar2 = (C8618c) this.f19388d.get();
                ((C15588c1) this.f19389e).getClass();
                C19383o.m32797g(okHttpClientHolder, "okHttpClientHolder");
                C19383o.m32797g(aVar, "moshiConverterFactory");
                C19383o.m32797g(cVar2, "config");
                String f = cVar2.mo21136f(C8592b.f18822q0);
                C19383o.m32794d(f);
                C20009t.C20010a b = okHttpClientHolder.f18996a.mo72991b();
                b.mo72995c(cVar2.mo21135e(C8592b.f18840w0), TimeUnit.SECONDS);
                C20009t tVar = new C20009t(b);
                C20146w.C20148b bVar = new C20146w.C20148b();
                bVar.f44628b = tVar;
                bVar.mo74393a(new C20068g());
                bVar.f44630d.add(aVar);
                bVar.mo74394b(f);
                return new C8730f(bVar.mo74395c());
        }
    }

    public C8821c(C15588c1 c1Var, C19011a aVar, C19011a aVar2, C4591k kVar) {
        this.f19385a = 2;
        this.f19389e = c1Var;
        this.f19386b = aVar;
        this.f19387c = aVar2;
        this.f19388d = kVar;
    }
}
