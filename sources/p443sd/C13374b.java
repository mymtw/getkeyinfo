package p443sd;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;

/* renamed from: sd.b */
public final class C13374b extends C10424k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13374b(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_more_from_shop_title, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (!(jVar instanceof C13373a)) {
            throw new IllegalStateException();
        }
    }
}
