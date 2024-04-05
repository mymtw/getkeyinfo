package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.favorites.C9792b;
import com.etsy.android.p327ui.favorites.C9899x;
import com.etsy.android.p327ui.favorites.recommendations.C9871a;
import com.etsy.android.p327ui.favorites.recommendations.C9875e;
import com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment;
import com.etsy.android.p327ui.util.C11786n;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p383ke.C12995a;
import p425q9.C13265p;
import p456ua.C13461f;
import p500ze.C13961b;
import p500ze.C13962c;

/* renamed from: c9.k5 */
public final class C4597k5 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10384b;

    public C4597k5(C4579j1 j1Var) {
        this.f10384b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CollectionContainerFragment collectionContainerFragment = (CollectionContainerFragment) obj;
        collectionContainerFragment.session = (C13265p) this.f10384b.f10101F0.get();
        collectionContainerFragment.collectionHeaderEligibility = new C9792b(this.f10384b.mo14404m());
        collectionContainerFragment.tabsWithIconsEligibility = new C9899x(this.f10384b.mo14404m());
        collectionContainerFragment.recommendationsOnFavoritesEligibility = new C9875e(this.f10384b.mo14404m());
        C11786n c = C4579j1.m10252c(this.f10384b);
        C4579j1 j1Var = this.f10384b;
        C12995a aVar = j1Var.f10292p;
        C8731g gVar = (C8731g) j1Var.f10091D0.get();
        aVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C13962c.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        collectionContainerFragment.presenter = new C9871a(this.f10384b.f10198Y2.get(), c, new C13961b((C13962c) b, this.f10384b.f10146O0.get()), new C13461f(), (C13265p) this.f10384b.f10101F0.get());
    }
}
