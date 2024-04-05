package p375jd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: jd.c */
public final class C12973c extends C10424k {

    /* renamed from: b */
    public final C10156h f28560b;

    /* renamed from: c */
    public final TextView f28561c;

    /* renamed from: d */
    public final LoadingIndicatorView f28562d;

    /* renamed from: e */
    public final TextView f28563e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12973c(ViewGroup viewGroup, C10156h hVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_price, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f28560b = hVar;
        View findViewById = this.itemView.findViewById(R.id.text_price);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_price)");
        this.f28561c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.price_loading_indicator);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.….price_loading_indicator)");
        this.f28562d = (LoadingIndicatorView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.text_shipping_price);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.text_shipping_price)");
        this.f28563e = (TextView) findViewById3;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C12971a) {
            C12971a aVar = (C12971a) jVar;
            this.f28561c.setText(aVar.f28554a);
            C10563f fVar = aVar.f28555b;
            if (fVar == null || !C18263b.m30839d0(fVar.f23164j) || !this.f28560b.f22335a.mo21132b(C8592b.C8601i.f18897k)) {
                ViewExtensions.m12860d(this.f28563e);
            } else {
                this.f28563e.setText(this.itemView.getContext().getResources().getString(R.string.inline_shipping_price, new Object[]{aVar.f28555b.f23164j}));
                ViewExtensions.m12869m(this.f28563e);
            }
            if (aVar.f28557d) {
                ViewExtensions.m12869m(this.f28562d);
                this.f28561c.setAlpha(0.6f);
                return;
            }
            ViewExtensions.m12860d(this.f28562d);
            this.f28561c.setAlpha(1.0f);
            return;
        }
        throw new IllegalArgumentException();
    }
}
