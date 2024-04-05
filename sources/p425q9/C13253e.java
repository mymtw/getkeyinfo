package p425q9;

import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.handlers.C10169i;
import com.etsy.android.p327ui.search.C10745e;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.filters.C10766d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10993f;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11011p;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository;
import com.etsy.android.p327ui.user.auth.C11479g;
import com.etsy.android.p327ui.user.auth.C11484j;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p456ua.C13461f;
import p466vc.C13573c;
import p486y9.C13888d;
import p491ye.C13921e;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: q9.e */
public final class C13253e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f29110a;

    /* renamed from: b */
    public final C19011a f29111b;

    /* renamed from: c */
    public final C19011a f29112c;

    public /* synthetic */ C13253e(C19011a aVar, C19011a aVar2, int i) {
        this.f29110a = i;
        this.f29111b = aVar;
        this.f29112c = aVar2;
    }

    public final Object get() {
        switch (this.f29110a) {
            case 0:
                C13252d dVar = new C13252d();
                C13461f fVar = (C13461f) this.f29111b.get();
                dVar.f29109c = (C8809t) this.f29112c.get();
                return dVar;
            case 1:
                return new C10169i((C10156h) this.f29111b.get(), (C13573c) this.f29112c.get());
            case 2:
                return new C10745e((C10865h) this.f29111b.get(), (C12741o) this.f29112c.get());
            case 3:
                return new C10766d((C10993f) this.f29111b.get(), (C13888d) this.f29112c.get());
            case 4:
                return new SearchWithAdsRepository((C11011p) this.f29111b.get(), (C17414y) this.f29112c.get());
            case 5:
                return new C11479g((C11484j) this.f29111b.get(), (C12741o) this.f29112c.get());
            default:
                return new C13921e((C13943a) this.f29111b.get(), (C8890e0) this.f29112c.get());
        }
    }
}
