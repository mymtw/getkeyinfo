package p277w8;

import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import androidx.room.C3259y;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.useraction.UserActionRoomDatabase;
import com.etsy.android.p072ad.AdImpressionsDatabase;
import com.etsy.android.p327ui.conversation.details.ccm.C9492a;
import com.etsy.android.p327ui.favorites.C9900y;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.shop.C11169j;
import com.google.android.play.core.assetpacks.C15588c1;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p040c9.C4479c;
import p286x8.C8328b;
import p405nc.C13110a;
import p409o9.C13138q;
import p470w9.C13796d;
import p514bk.C14088a;
import p568fn.C17782b;
import p628nj.C18263b;
import p740eq.C19011a;
import p769rr.C20164a;

/* renamed from: w8.g */
public final class C8269g implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18127a;

    /* renamed from: b */
    public final C19011a f18128b;

    /* renamed from: c */
    public final Object f18129c;

    public /* synthetic */ C8269g(Object obj, C19011a aVar, int i) {
        this.f18127a = i;
        this.f18129c = obj;
        this.f18128b = aVar;
    }

    public final Object get() {
        switch (this.f18127a) {
            case 0:
                AdImpressionsDatabase adImpressionsDatabase = (AdImpressionsDatabase) this.f18128b.get();
                ((C0761x) this.f18129c).getClass();
                C19383o.m32797g(adImpressionsDatabase, "database");
                C8328b o = adImpressionsDatabase.mo18062o();
                C17782b.m29841G(o);
                return o;
            case 1:
                Context context = (Context) this.f18128b.get();
                ((C4479c) this.f18129c).getClass();
                if (C13138q.f28894h == null) {
                    C13138q.f28894h = new C13138q(context);
                }
                C13138q a = C13138q.m20808a();
                C17782b.m29841G(a);
                return a;
            case 2:
                C17414y yVar = (C17414y) this.f18128b.get();
                ((C15588c1) this.f18129c).getClass();
                C19383o.m32797g(yVar, "moshi");
                return new C20164a(yVar);
            case 3:
                C8731g gVar = (C8731g) this.f18128b.get();
                ((C13110a) this.f18129c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C13796d.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…esV3Endpoint::class.java)");
                return (C13796d) b;
            case 4:
                Context context2 = (Context) this.f18128b.get();
                ((C19543e0) this.f18129c).getClass();
                C19383o.m32797g(context2, ResponseConstants.CONTEXT);
                return C3259y.m7913a(context2.getApplicationContext(), UserActionRoomDatabase.class, "userActions").mo11987b();
            case 5:
                C8731g gVar2 = (C8731g) this.f18128b.get();
                ((C18263b) this.f18129c).getClass();
                C19383o.m32797g(gVar2, "retrofit");
                Object b2 = gVar2.f19177a.mo74387b(C9492a.class);
                C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…ailsEndpoint::class.java)");
                return (C9492a) b2;
            case 6:
                C8731g gVar3 = (C8731g) this.f18128b.get();
                ((C18263b) this.f18129c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b3 = gVar3.f19177a.mo74387b(C9900y.class);
                C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…tionEndpoint::class.java)");
                return (C9900y) b3;
            case 7:
                ListingFragment listingFragment = (ListingFragment) this.f18128b.get();
                ((C14088a) this.f18129c).getClass();
                C19383o.m32797g(listingFragment, "listingFragment");
                C10101d dVar = listingFragment.getViewModel().f22223d;
                C17782b.m29841G(dVar);
                return dVar;
            default:
                C8731g gVar4 = (C8731g) this.f18128b.get();
                ((C15588c1) this.f18129c).getClass();
                C19383o.m32797g(gVar4, "configuredV3MoshiRetrofit");
                Object b4 = gVar4.f19177a.mo74387b(C11169j.class);
                C19383o.m32796f(b4, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
                return (C11169j) b4;
        }
    }
}
