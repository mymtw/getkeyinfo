package p040c9;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.shop.ShopSectionListingsFragment;
import com.etsy.android.shophome.C8992f;
import com.etsy.android.shophome.C8994h;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p357gf.C12796e;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.db */
public final class C4505db implements C17550a {

    /* renamed from: b */
    public final C0761x f9932b;

    /* renamed from: c */
    public final C4579j1 f9933c;

    public C4505db(C4579j1 j1Var, C0761x xVar) {
        this.f9933c = j1Var;
        this.f9932b = xVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ShopSectionListingsFragment shopSectionListingsFragment = (ShopSectionListingsFragment) obj;
        shopSectionListingsFragment.session = (C13265p) this.f9933c.f10101F0.get();
        shopSectionListingsFragment.schedulers = new C13461f();
        C0761x xVar = this.f9932b;
        C8731g gVar = (C8731g) this.f9933c.f10091D0.get();
        xVar.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C8992f.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…ingsEndpoint::class.java)");
        shopSectionListingsFragment.repository = new C8994h((C8992f) b);
        shopSectionListingsFragment.elkLogger = this.f9933c.f10131L0.get();
        shopSectionListingsFragment.adImpressionRepository = this.f9933c.f10336x3.get();
        shopSectionListingsFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f9933c));
    }
}
