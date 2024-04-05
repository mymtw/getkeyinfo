package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.user.profile.UserProfileFragment;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p336dc.C12646d;
import p357gf.C12796e;
import p383ke.C12995a;
import p425q9.C13265p;
import p456ua.C13461f;
import p500ze.C13961b;
import p500ze.C13962c;

/* renamed from: c9.xb */
public final class C4775xb implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10762b;

    public C4775xb(C4579j1 j1Var) {
        this.f10762b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        UserProfileFragment userProfileFragment = (UserProfileFragment) obj;
        C4579j1 j1Var = this.f10762b;
        C12995a aVar = j1Var.f10292p;
        C8731g gVar = (C8731g) j1Var.f10091D0.get();
        aVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C13962c.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        userProfileFragment.userProfileRepository = new C13961b((C13962c) b, this.f10762b.f10146O0.get());
        userProfileFragment.rxSchedulers = new C13461f();
        userProfileFragment.session = (C13265p) this.f10762b.f10101F0.get();
        userProfileFragment.optInEligibility = new C12646d(this.f10762b.f10314t1.get(), this.f10762b.f10139M3.get(), this.f10762b.f10114H3.get());
        userProfileFragment.adImpressionRepository = this.f10762b.f10336x3.get();
        userProfileFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f10762b));
    }
}
