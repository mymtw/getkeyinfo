package p277w8;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p072ad.AdImpressionsDatabase;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.user.inappnotifications.C11587z;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p296y8.C8401b;
import p466vc.C13573c;
import p514bk.C14088a;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: w8.h */
public final class C8270h implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18130a;

    /* renamed from: b */
    public final C19011a f18131b;

    /* renamed from: c */
    public final Object f18132c;

    public /* synthetic */ C8270h(Object obj, C19011a aVar, int i) {
        this.f18130a = i;
        this.f18132c = obj;
        this.f18131b = aVar;
    }

    public final Object get() {
        switch (this.f18130a) {
            case 0:
                AdImpressionsDatabase adImpressionsDatabase = (AdImpressionsDatabase) this.f18131b.get();
                ((C0761x) this.f18132c).getClass();
                C19383o.m32797g(adImpressionsDatabase, "database");
                C8401b p = adImpressionsDatabase.mo18063p();
                C17782b.m29841G(p);
                return p;
            case 1:
                ListingFragment listingFragment = (ListingFragment) this.f18131b.get();
                ((C14088a) this.f18132c).getClass();
                C19383o.m32797g(listingFragment, "listingFragment");
                C13573c cVar = listingFragment.getViewModel().f22222c;
                C17782b.m29841G(cVar);
                return cVar;
            default:
                C8731g gVar = (C8731g) this.f18131b.get();
                ((C17782b) this.f18132c).getClass();
                C19383o.m32797g(gVar, "configuredRetrofit");
                Object b = gVar.f19177a.mo74387b(C11587z.class);
                C19383o.m32796f(b, "configuredRetrofit.v3mos…atesEndpoint::class.java)");
                return (C11587z) b;
        }
    }
}
