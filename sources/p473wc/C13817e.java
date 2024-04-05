package p473wc;

import android.os.Bundle;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: wc.e */
public final class C13817e {
    /* renamed from: a */
    public static C13574d.C13576b.C13585i m21368a(ListingViewState listingViewState, C13597g.C13692n2 n2Var) {
        C13597g.C13692n2 n2Var2 = n2Var;
        C19383o.m32797g(n2Var2, "event");
        return new C13574d.C13576b.C13585i(new ShopHomeKey(listingViewState.mo33467b(), new EtsyId(n2Var2.f30194a), n2Var2.f30196c, (Map) null, String.valueOf(n2Var2.f30195b), (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1000, (DefaultConstructorMarker) null));
    }
}
