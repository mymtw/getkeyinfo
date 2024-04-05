package p375jd;

import android.content.Context;
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
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;
import p628nj.C18263b;

/* renamed from: jd.f */
public final class C12976f extends C10424k {

    /* renamed from: b */
    public final C10156h f28574b;

    /* renamed from: c */
    public final TextView f28575c;

    /* renamed from: d */
    public final TextView f28576d;

    /* renamed from: e */
    public final TextView f28577e;

    /* renamed from: f */
    public final TextView f28578f;

    /* renamed from: g */
    public final LoadingIndicatorView f28579g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12976f(ViewGroup viewGroup, C10156h hVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_price_with_discount, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f28574b = hVar;
        View findViewById = this.itemView.findViewById(R.id.text_discount_price);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_discount_price)");
        this.f28575c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_original_price);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.text_original_price)");
        TextView textView = (TextView) findViewById2;
        this.f28576d = textView;
        View findViewById3 = this.itemView.findViewById(R.id.text_shipping_price);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.text_shipping_price)");
        this.f28577e = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.text_discount_description);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…ext_discount_description)");
        this.f28578f = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.price_loading_indicator);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.….price_loading_indicator)");
        this.f28579g = (LoadingIndicatorView) findViewById5;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        C19394m mVar;
        if (jVar instanceof C12974d) {
            C12974d dVar = (C12974d) jVar;
            this.f28575c.setText(dVar.f28564a);
            this.f28576d.setText(dVar.f28565b);
            this.f28576d.setContentDescription(this.itemView.getContext().getResources().getString(R.string.old_price, new Object[]{this.f28576d.getText()}));
            this.f28575c.setContentDescription(this.itemView.getContext().getResources().getString(R.string.new_price, new Object[]{this.f28575c.getText()}));
            TextView textView = this.f28575c;
            Context context = this.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_urgency));
            C10563f fVar = dVar.f28566c;
            if (fVar == null || !C18263b.m30839d0(fVar.f23164j) || !this.f28574b.f22335a.mo21132b(C8592b.C8601i.f18897k)) {
                ViewExtensions.m12860d(this.f28577e);
            } else {
                this.f28577e.setText(this.itemView.getContext().getResources().getString(R.string.inline_shipping_price, new Object[]{dVar.f28566c.f23164j}));
                ViewExtensions.m12869m(this.f28577e);
            }
            String str = dVar.f28568e;
            if (str != null) {
                this.f28578f.setText(str);
                ViewExtensions.m12869m(this.f28578f);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f28578f);
            }
            if (dVar.f28569f) {
                ViewExtensions.m12869m(this.f28579g);
                this.f28575c.setAlpha(0.6f);
                return;
            }
            ViewExtensions.m12860d(this.f28579g);
            this.f28575c.setAlpha(1.0f);
            return;
        }
        throw new IllegalArgumentException();
    }
}
