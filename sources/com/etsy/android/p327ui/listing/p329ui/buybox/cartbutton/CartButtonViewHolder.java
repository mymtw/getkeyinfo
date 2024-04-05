package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton;

import android.annotation.SuppressLint;
import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextSwitcher;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.CartButtonViewHolder */
public final class CartButtonViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22486b;

    /* renamed from: c */
    public final Button f22487c;

    /* renamed from: d */
    public final TextSwitcher f22488d;

    public CartButtonViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_add_to_cart, false));
        this.f22486b = cVar;
        View findViewById = this.itemView.findViewById(R.id.button_add_to_cart);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.button_add_to_cart)");
        this.f22487c = (Button) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.button_add_to_cart_text_switcher);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…dd_to_cart_text_switcher)");
        this.f22488d = (TextSwitcher) findViewById2;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10225a) {
            C10225a aVar = (C10225a) jVar;
            String string = this.itemView.getResources().getString(aVar.f22489a);
            C19383o.m32796f(string, "itemView.resources.getString(uiModel.text)");
            this.f22487c.setEnabled(aVar.f22491c);
            this.f22487c.setContentDescription(string);
            if (!aVar.f22491c) {
                this.f22487c.setText(aVar.f22489a);
                ViewExtensions.m12860d(this.f22488d);
                return;
            }
            ViewExtensions.m12869m(this.f22488d);
            if (aVar.f22490b) {
                this.f22488d.setText(string);
                this.f22486b.mo38043a(C13597g.C13680l4.f30174a);
            } else {
                this.f22488d.setCurrentText(string);
            }
            ViewExtensions.m12866j(this.f22487c, new CartButtonViewHolder$bind$1(this, jVar));
            this.f22487c.setOnTouchListener(new C10227b(this, jVar));
            return;
        }
        throw new IllegalStateException();
    }
}
