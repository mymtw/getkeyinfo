package com.etsy.android.util;

import android.app.Application;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p040c9.C4591k;
import p248tp.C8061n;
import p346fa.C12703a;
import p409o9.C13138q;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.util.g */
public final class C12044g implements C17555d<C12043f> {

    /* renamed from: a */
    public final C0761x f26855a;

    /* renamed from: b */
    public final C19011a<C8694h> f26856b;

    /* renamed from: c */
    public final C19011a<Application> f26857c;

    /* renamed from: d */
    public final C19011a<C8061n<Boolean>> f26858d;

    /* renamed from: e */
    public final C19011a<C8618c> f26859e;

    /* renamed from: f */
    public final C19011a<C12703a> f26860f;

    /* renamed from: g */
    public final C19011a<C12066w> f26861g;

    /* renamed from: h */
    public final C19011a<C13461f> f26862h;

    /* renamed from: i */
    public final C19011a<C13265p> f26863i;

    /* renamed from: j */
    public final C19011a<C13138q> f26864j;

    public C12044g(C0761x xVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C4591k kVar, C17553b bVar, C19011a aVar4, C17553b bVar2, C19011a aVar5) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f26855a = xVar;
        this.f26856b = aVar;
        this.f26857c = aVar2;
        this.f26858d = aVar3;
        this.f26859e = kVar;
        this.f26860f = bVar;
        this.f26861g = aVar4;
        this.f26862h = gVar;
        this.f26863i = bVar2;
        this.f26864j = aVar5;
    }

    public final Object get() {
        C0761x xVar = this.f26855a;
        C8694h hVar = this.f26856b.get();
        Application application = this.f26857c.get();
        C8061n nVar = this.f26858d.get();
        C8618c cVar = this.f26859e.get();
        C12703a aVar = this.f26860f.get();
        C12066w wVar = this.f26861g.get();
        C13461f fVar = this.f26862h.get();
        C13265p pVar = this.f26863i.get();
        C13138q qVar = this.f26864j.get();
        xVar.getClass();
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(application, "application");
        C19383o.m32797g(nVar, "isAppsFlyerEnabled");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(wVar, "postAppsFlyerEndpoint");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(qVar, "installInfo");
        return new C12043f(application, cVar, qVar, pVar, hVar, aVar, fVar, wVar, nVar);
    }
}
