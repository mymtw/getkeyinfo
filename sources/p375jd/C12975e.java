package p375jd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;

/* renamed from: jd.e */
public final class C12975e extends C10424k {

    /* renamed from: b */
    public final TextView f28570b;

    /* renamed from: c */
    public final TextView f28571c;

    /* renamed from: d */
    public final TextView f28572d;

    /* renamed from: e */
    public final LoadingIndicatorView f28573e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12975e(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_price_with_discount_redesign, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.text_discount_price);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_discount_price)");
        this.f28570b = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_original_price);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.text_original_price)");
        TextView textView = (TextView) findViewById2;
        this.f28571c = textView;
        View findViewById3 = this.itemView.findViewById(R.id.text_discount_description);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…ext_discount_description)");
        this.f28572d = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.price_loading_indicator);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.….price_loading_indicator)");
        this.f28573e = (LoadingIndicatorView) findViewById4;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        C19394m mVar;
        if (jVar instanceof C12974d) {
            C12974d dVar = (C12974d) jVar;
            this.f28570b.setText(dVar.f28564a);
            this.f28571c.setText(dVar.f28565b);
            this.f28571c.setContentDescription(this.itemView.getContext().getResources().getString(R.string.old_price, new Object[]{this.f28571c.getText()}));
            this.f28570b.setContentDescription(this.itemView.getContext().getResources().getString(R.string.new_price, new Object[]{this.f28570b.getText()}));
            TextView textView = this.f28570b;
            Context context = this.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_urgency));
            String str = dVar.f28568e;
            if (str != null) {
                this.f28572d.setText(str);
                ViewExtensions.m12869m(this.f28572d);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f28572d);
            }
            if (dVar.f28569f) {
                ViewExtensions.m12869m(this.f28573e);
                this.f28570b.setAlpha(0.6f);
                return;
            }
            ViewExtensions.m12860d(this.f28573e);
            this.f28570b.setAlpha(1.0f);
            return;
        }
        throw new IllegalArgumentException();
    }
}
