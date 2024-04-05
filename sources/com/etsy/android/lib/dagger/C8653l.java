package com.etsy.android.lib.dagger;

import android.content.Context;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.room.C3259y;
import com.etsy.android.lib.logger.elk.ElkLogDatabase;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.requests.apiv3.TestAccountToolEndpoint;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.home.home.C9990a;
import com.etsy.android.p327ui.shop.tabs.C11216c;
import com.etsy.android.p327ui.shop.tabs.ShopFragment;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p335db.C12641a;
import p361hc.C12809a;
import p471wa.C13798b;
import p568fn.C17782b;
import p628nj.C18263b;
import p740eq.C19011a;
import p772tq.C20203a;

/* renamed from: com.etsy.android.lib.dagger.l */
public final class C8653l implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19019a;

    /* renamed from: b */
    public final C19011a f19020b;

    /* renamed from: c */
    public final Object f19021c;

    public /* synthetic */ C8653l(Object obj, C19011a aVar, int i) {
        this.f19019a = i;
        this.f19021c = obj;
        this.f19020b = aVar;
    }

    public final Object get() {
        switch (this.f19019a) {
            case 0:
                TestAccountToolEndpoint testAccountToolEndpoint = (TestAccountToolEndpoint) this.f19020b.get();
                ((C0761x) this.f19021c).getClass();
                C19383o.m32797g(testAccountToolEndpoint, "testAccountToolEndpoint");
                return new C13798b(testAccountToolEndpoint);
            case 1:
                Context context = (Context) this.f19020b.get();
                ((C0114h) this.f19021c).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                return C3259y.m7913a(context.getApplicationContext(), ElkLogDatabase.class, "etsy-logs").mo11987b();
            case 2:
                C8731g gVar = (C8731g) this.f19020b.get();
                ((C19382n) this.f19021c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C12641a.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…akesEndpoint::class.java)");
                return (C12641a) b;
            case 3:
                BOEActivity bOEActivity = (BOEActivity) this.f19020b.get();
                ((C1993m) this.f19021c).getClass();
                C19383o.m32797g(bOEActivity, "activity");
                return bOEActivity;
            case 4:
                C8731g gVar2 = (C8731g) this.f19020b.get();
                ((C18263b) this.f19021c).getClass();
                C19383o.m32797g(gVar2, "configuredRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C12809a.class);
                C19383o.m32796f(b2, "configuredRetrofit.v3mos…koutEndpoint::class.java)");
                return (C12809a) b2;
            case 5:
                C8731g gVar3 = (C8731g) this.f19020b.get();
                ((C20203a) this.f19021c).getClass();
                C19383o.m32797g(gVar3, "configuredV3MoshiRetrofit");
                Object b3 = gVar3.f19177a.mo74387b(C9990a.class);
                C19383o.m32796f(b3, "configuredV3MoshiRetrofi…HomeEndpoint::class.java)");
                return (C9990a) b3;
            default:
                ShopFragment shopFragment = (ShopFragment) this.f19020b.get();
                ((C19388s) this.f19021c).getClass();
                C19383o.m32797g(shopFragment, "shopFragment");
                C11216c cVar = shopFragment.getViewModel().f24771c;
                C17782b.m29841G(cVar);
                return cVar;
        }
    }
}
