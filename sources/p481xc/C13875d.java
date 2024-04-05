package p481xc;

import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p370ie.C12948h;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: xc.d */
public final class C13875d {
    /* renamed from: a */
    public static C13574d.C13576b.C13591o m21403a(ListingViewState listingViewState, C13597g.C13631e4 e4Var) {
        C19383o.m32797g(e4Var, "event");
        EtsyAction.C8658a aVar = EtsyAction.Companion;
        String b = listingViewState.mo33467b();
        C19383o.m32797g(b, "referrer");
        EtsyAction etsyAction = e4Var.f30107a;
        C19383o.m32797g(etsyAction, "signInAction");
        return new C13574d.C13576b.C13591o(new C12948h(b, etsyAction, e4Var.f30109c, e4Var.f30108b, (String) null, (String) null, 32));
    }
}
