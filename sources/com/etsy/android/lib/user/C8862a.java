package com.etsy.android.lib.user;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.requests.apiv3.timezone.TimeZoneEndpoint;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.cart.saveforlater.C9354b;
import com.etsy.android.p327ui.sdl.C10722e;
import com.etsy.android.p327ui.shop.C11199s;
import com.etsy.android.p327ui.user.review.CreateReviewViewModel;
import com.google.android.play.core.appupdate.C15562d;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p383ke.C12995a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.user.a */
public final class C8862a implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19576a;

    /* renamed from: b */
    public final C19011a f19577b;

    /* renamed from: c */
    public final Object f19578c;

    public /* synthetic */ C8862a(Object obj, C19011a aVar, int i) {
        this.f19576a = i;
        this.f19578c = obj;
        this.f19577b = aVar;
    }

    public final Object get() {
        switch (this.f19576a) {
            case 0:
                C8731g gVar = (C8731g) this.f19577b.get();
                ((C15562d) this.f19578c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(TimeZoneEndpoint.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…ZoneEndpoint::class.java)");
                return (TimeZoneEndpoint) b;
            case 1:
                Context context = (Context) this.f19577b.get();
                ((C0005b) this.f19578c).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                return new C8886e(context, (Bundle) null, (CreateReviewViewModel) null);
            case 2:
                C8731g gVar2 = (C8731g) this.f19577b.get();
                ((C19388s) this.f19578c).getClass();
                C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C9354b.class);
                C19383o.m32796f(b2, "configuredV3MoshiRetrofi…aterEndpoint::class.java)");
                return (C9354b) b2;
            case 3:
                C8731g gVar3 = (C8731g) this.f19577b.get();
                ((C12995a) this.f19578c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b3 = gVar3.f19177a.mo74387b(C10722e.class);
                C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…tionEndpoint::class.java)");
                return (C10722e) b3;
            default:
                C8731g gVar4 = (C8731g) this.f19577b.get();
                ((C19421p) this.f19578c).getClass();
                C19383o.m32797g(gVar4, "configuredV3MoshiRetrofit");
                Object b4 = gVar4.f19177a.mo74387b(C11199s.class);
                C19383o.m32796f(b4, "configuredV3MoshiRetrofi…tionEndpoint::class.java)");
                return (C11199s) b4;
        }
    }
}
