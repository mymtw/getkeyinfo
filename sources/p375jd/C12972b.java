package p375jd;

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
import kotlin.jvm.internal.C19383o;

/* renamed from: jd.b */
public final class C12972b extends C10424k {

    /* renamed from: b */
    public final TextView f28558b;

    /* renamed from: c */
    public final LoadingIndicatorView f28559c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12972b(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_price_redesign, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.text_price);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_price)");
        this.f28558b = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.price_loading_indicator);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.….price_loading_indicator)");
        this.f28559c = (LoadingIndicatorView) findViewById2;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C12971a) {
            C12971a aVar = (C12971a) jVar;
            this.f28558b.setText(aVar.f28554a);
            if (aVar.f28557d) {
                ViewExtensions.m12869m(this.f28559c);
                this.f28558b.setAlpha(0.6f);
                return;
            }
            ViewExtensions.m12860d(this.f28559c);
            this.f28558b.setAlpha(1.0f);
            return;
        }
        throw new IllegalArgumentException();
    }
}
