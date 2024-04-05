package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.EmptyCart;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p423pf.C13232c;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.l */
public final class C9193l extends C12086e<EmptyCart> {

    /* renamed from: c */
    public final C13232c f20281c;

    /* renamed from: d */
    public final TextView f20282d;

    /* renamed from: e */
    public final Button f20283e;

    public C9193l(ViewGroup viewGroup, C13232c cVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_empty_cart, viewGroup, false));
        this.f20281c = cVar;
        View findViewById = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.title)");
        this.f20282d = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.button);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.button)");
        this.f20283e = (Button) findViewById2;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        EmptyCart emptyCart = (EmptyCart) obj;
        if (emptyCart != null) {
            this.f20282d.setText(emptyCart.getTitle());
            if (!C18263b.m30839d0(emptyCart.getLinkTitle()) || !C18263b.m30839d0(emptyCart.getDeepLinkUrl())) {
                this.f20283e.setText("");
                ViewExtensions.m12860d(this.f20283e);
                return;
            }
            this.f20283e.setText(emptyCart.getLinkTitle());
            ViewExtensions.m12869m(this.f20283e);
            ViewExtensions.m12866j(this.f20283e, new EmptyCartViewHolder$bind$1(this, emptyCart));
        }
    }
}
