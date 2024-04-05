package com.etsy.android.lib.dagger;

import android.net.ConnectivityManager;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.C8732h;
import com.etsy.android.lib.network.C8734j;
import com.etsy.android.lib.network.Connectivity;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p340ea.C12673n;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13886b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.dagger.j */
public final class C8651j implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19014a = 0;

    /* renamed from: b */
    public final C19011a f19015b;

    /* renamed from: c */
    public final C19011a f19016c;

    /* renamed from: d */
    public final C19011a f19017d;

    /* renamed from: e */
    public final Object f19018e;

    public C8651j(C19388s sVar, C19011a aVar, C19011a aVar2) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19018e = sVar;
        this.f19015b = aVar;
        this.f19016c = gVar;
        this.f19017d = aVar2;
    }

    public final Object get() {
        switch (this.f19014a) {
            case 0:
                return new OkHttpClientHolder((C8732h) this.f19015b.get(), (C8734j) this.f19016c.get(), (C13886b) this.f19017d.get(), (C12673n) ((C19011a) this.f19018e).get());
            default:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f19015b.get();
                C13461f fVar = (C13461f) this.f19016c.get();
                C8694h hVar = (C8694h) this.f19017d.get();
                ((C19388s) this.f19018e).getClass();
                C19383o.m32797g(connectivityManager, "connectivityManager");
                C19383o.m32797g(fVar, "rxSchedulers");
                C19383o.m32797g(hVar, "logCat");
                return new Connectivity(connectivityManager, fVar, hVar);
        }
    }

    public C8651j(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4) {
        this.f19015b = aVar;
        this.f19016c = aVar2;
        this.f19017d = aVar3;
        this.f19018e = aVar4;
    }
}
