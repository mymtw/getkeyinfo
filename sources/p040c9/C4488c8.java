package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.requests.apiv3.ShippingDetailsModule;
import com.etsy.android.p327ui.listing.ListingFragment;
import dagger.android.C17550a;
import p405nc.C13110a;
import p514bk.C14088a;
import p628nj.C18263b;

/* renamed from: c9.c8 */
public final class C4488c8 implements C17550a.C17551a {

    /* renamed from: a */
    public final C4579j1 f9801a;

    /* renamed from: b */
    public final C4690r4 f9802b;

    public C4488c8(C4579j1 j1Var, C4690r4 r4Var) {
        this.f9801a = j1Var;
        this.f9802b = r4Var;
    }

    /* renamed from: a */
    public final C17550a mo14396a(Object obj) {
        ListingFragment listingFragment = (ListingFragment) obj;
        listingFragment.getClass();
        return new C4502d8(this.f9801a, this.f9802b, new C14088a(), new C18263b(), new ShippingDetailsModule(), new C1993m(), new C18263b(), new C13110a(), listingFragment);
    }
}
