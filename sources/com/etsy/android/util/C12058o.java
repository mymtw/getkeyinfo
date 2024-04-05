package com.etsy.android.util;

import android.app.Application;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.util.C12054m;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p040c9.C4591k;
import p248tp.C8061n;
import p402n9.C13092l;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.util.o */
public final class C12058o implements C17555d<C13092l> {

    /* renamed from: a */
    public final C19011a<Application> f26881a;

    /* renamed from: b */
    public final C19011a<C8618c> f26882b;

    /* renamed from: c */
    public final C19011a<C8061n<Boolean>> f26883c;

    /* renamed from: d */
    public final C19011a<C13265p> f26884d;

    /* renamed from: e */
    public final C19011a<C13461f> f26885e;

    /* renamed from: f */
    public final C19011a<String> f26886f;

    public C12058o(C19011a aVar, C4591k kVar, C19011a aVar2, C17553b bVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        C12054m mVar = C12054m.C12055a.f26879a;
        this.f26881a = aVar;
        this.f26882b = kVar;
        this.f26883c = aVar2;
        this.f26884d = bVar;
        this.f26885e = gVar;
        this.f26886f = mVar;
    }

    public final Object get() {
        Application application = this.f26881a.get();
        C8618c cVar = this.f26882b.get();
        C8061n nVar = this.f26883c.get();
        C13265p pVar = this.f26884d.get();
        C13461f fVar = this.f26885e.get();
        String str = this.f26886f.get();
        C19383o.m32797g(application, "application");
        C19383o.m32797g(cVar, "config");
        C19383o.m32797g(nVar, "isBrazeEnabled");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(fVar, "scheduler");
        C19383o.m32797g(str, "apiKey");
        return new C13092l(application, new BrazeActivityLifecycleCallbackListener(true, false, (Set) null, (Set) null, 12, (DefaultConstructorMarker) null), pVar, cVar, nVar, fVar, str);
    }
}
