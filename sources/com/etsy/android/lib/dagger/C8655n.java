package com.etsy.android.lib.dagger;

import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.home.editorspicks.C9924a;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10038a;
import com.google.android.gms.measurement.internal.C15099u;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p514bk.C14088a;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.dagger.n */
public final class C8655n implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19025a;

    /* renamed from: b */
    public final C19011a f19026b;

    /* renamed from: c */
    public final Object f19027c;

    public /* synthetic */ C8655n(Object obj, C17555d dVar, int i) {
        this.f19025a = i;
        this.f19027c = obj;
        this.f19026b = dVar;
    }

    public final Object get() {
        switch (this.f19025a) {
            case 0:
                ((C15099u) this.f19027c).getClass();
                C8623e eVar = ((C8703p) this.f19026b.get()).f19116n;
                C17782b.m29841G(eVar);
                return eVar;
            case 1:
                C8731g gVar = (C8731g) this.f19026b.get();
                ((C14088a) this.f19027c).getClass();
                C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
                Object b = gVar.f19177a.mo74387b(C9924a.class);
                C19383o.m32796f(b, "configuredV3MoshiRetrofi…icksEndpoint::class.java)");
                return (C9924a) b;
            default:
                C8731g gVar2 = (C8731g) this.f19026b.get();
                ((C19543e0) this.f19027c).getClass();
                C19383o.m32797g(gVar2, "v3MoshiRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C10038a.class);
                C19383o.m32796f(b2, "v3MoshiRetrofit.v3moshiR…ewedEndpoint::class.java)");
                return (C10038a) b2;
        }
    }
}
