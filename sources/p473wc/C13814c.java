package p473wc;

import android.os.Bundle;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: wc.c */
public final class C13814c {
    /* renamed from: a */
    public static C13574d.C13576b.C13585i m21367a(ListingViewState listingViewState, C13597g.C13685m2 m2Var) {
        C19383o.m32797g(m2Var, "event");
        return new C13574d.C13576b.C13585i(new ListingKey(listingViewState.mo33467b(), new EtsyId(m2Var.f30185a), false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
    }
}
