package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.push.registration.C8832e;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.p327ui.user.C11518d0;
import com.etsy.android.p327ui.user.C11613o;
import com.google.android.play.core.appupdate.C15562d;
import dagger.internal.C17553b;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p040c9.C4591k;
import p040c9.C4646o;
import p340ea.C12673n;
import p346fa.C12703a;
import p410oa.C13144d;
import p425q9.C13265p;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.n */
public final class C8764n implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19268a = 1;

    /* renamed from: b */
    public final C19011a f19269b;

    /* renamed from: c */
    public final C19011a f19270c;

    /* renamed from: d */
    public final C19011a f19271d;

    /* renamed from: e */
    public final C19011a f19272e;

    /* renamed from: f */
    public final C19011a f19273f;

    /* renamed from: g */
    public final C19011a f19274g;

    /* renamed from: h */
    public final Object f19275h;

    public C8764n(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, C19011a aVar7) {
        this.f19269b = aVar;
        this.f19270c = aVar2;
        this.f19271d = aVar3;
        this.f19272e = aVar4;
        this.f19273f = aVar5;
        this.f19274g = aVar6;
        this.f19275h = aVar7;
    }

    public final Object get() {
        switch (this.f19268a) {
            case 0:
                return new OAuth2Repository((C8809t) this.f19269b.get(), (C8749c0) this.f19270c.get(), (C8753e0) this.f19271d.get(), C17554c.m29426a(this.f19272e), (C12703a) this.f19273f.get(), (C12673n) this.f19274g.get(), (C8618c) ((C19011a) this.f19275h).get());
            default:
                C13265p pVar = (C13265p) this.f19269b.get();
                C8618c cVar = (C8618c) this.f19270c.get();
                C8837j jVar = (C8837j) this.f19271d.get();
                C13144d dVar = (C13144d) this.f19272e.get();
                C13943a aVar = (C13943a) this.f19273f.get();
                C11613o oVar = (C11613o) this.f19274g.get();
                ((C15562d) this.f19275h).getClass();
                C19383o.m32797g(pVar, "session");
                C19383o.m32797g(cVar, "configMap");
                C19383o.m32797g(jVar, "pushRegistration");
                C19383o.m32797g(dVar, "googlePlayServicesProvider");
                C19383o.m32797g(aVar, "sharedPrefs");
                C19383o.m32797g(oVar, "darkModeViewModel");
                return new C11518d0(pVar, cVar, jVar, dVar, aVar, oVar);
        }
    }

    public C8764n(C15562d dVar, C17553b bVar, C4591k kVar, C4646o oVar, C8782j jVar, C19011a aVar, C8832e eVar) {
        this.f19275h = dVar;
        this.f19269b = bVar;
        this.f19270c = kVar;
        this.f19271d = oVar;
        this.f19272e = jVar;
        this.f19273f = aVar;
        this.f19274g = eVar;
    }
}
