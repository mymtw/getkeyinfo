package com.etsy.android.lib.dagger;

import android.content.Intent;
import androidx.activity.C0114h;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.C9111b0;
import com.etsy.android.p327ui.search.listingresults.C10903c;
import com.etsy.android.p327ui.search.p330v2.C11026g;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11011p;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import com.google.android.gms.measurement.internal.C15099u;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p514bk.C14088a;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.dagger.m */
public final class C8654m implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19022a;

    /* renamed from: b */
    public final C19011a f19023b;

    /* renamed from: c */
    public final Object f19024c;

    public /* synthetic */ C8654m(Object obj, C17555d dVar, int i) {
        this.f19022a = i;
        this.f19024c = obj;
        this.f19023b = dVar;
    }

    /* renamed from: a */
    public static C8703p m17038a(C15099u uVar, TrackingBaseActivity trackingBaseActivity) {
        uVar.getClass();
        Intent intent = trackingBaseActivity.getIntent();
        return intent != null ? new C8703p(trackingBaseActivity, true, intent.getExtras()) : new C8703p(trackingBaseActivity);
    }

    public final Object get() {
        switch (this.f19022a) {
            case 0:
                return m17038a((C15099u) this.f19024c, (TrackingBaseActivity) this.f19023b.get());
            case 1:
                C8731g gVar = (C8731g) this.f19023b.get();
                ((C14088a) this.f19024c).getClass();
                C19383o.m32797g(gVar, "configuredRetrofit");
                Object b = gVar.f19177a.mo74387b(C9111b0.class);
                C19383o.m32796f(b, "configuredRetrofit.v3mos…ltipEndpoint::class.java)");
                return (C9111b0) b;
            case 2:
                C8623e eVar = (C8623e) this.f19023b.get();
                ((C19382n) this.f19024c).getClass();
                C19383o.m32797g(eVar, "configMap");
                return new C10903c(eVar);
            case 3:
                C8731g gVar2 = (C8731g) this.f19023b.get();
                ((C0114h) this.f19024c).getClass();
                C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C11026g.class);
                C19383o.m32796f(b2, "configuredV3MoshiRetrofi…riesEndpoint::class.java)");
                return (C11026g) b2;
            default:
                C8731g gVar3 = (C8731g) this.f19023b.get();
                ((C18263b) this.f19024c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b3 = gVar3.f19177a.mo74387b(C11011p.class);
                C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…hAdsEndpoint::class.java)");
                return (C11011p) b3;
        }
    }
}
