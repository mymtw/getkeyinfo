package com.etsy.android.p327ui.listing.p329ui.bottombuybuttoms;

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
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.bottombuybuttoms.HorizontalBuyButtonsViewHolder */
public final class HorizontalBuyButtonsViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22397b;

    /* renamed from: c */
    public final Button f22398c;

    /* renamed from: d */
    public final Button f22399d;

    /* renamed from: e */
    public final TextSwitcher f22400e;

    /* renamed from: f */
    public final TextSwitcher f22401f;

    /* renamed from: g */
    public final Button f22402g;

    /* renamed from: h */
    public final View f22403h;

    public HorizontalBuyButtonsViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_horizontal_buy_buttons, false));
        this.f22397b = cVar;
        View findViewById = this.itemView.findViewById(R.id.button_add_to_cart);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.button_add_to_cart)");
        this.f22398c = (Button) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.button_add_to_cart_primary);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…tton_add_to_cart_primary)");
        this.f22399d = (Button) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.button_add_to_cart_text_switcher);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…dd_to_cart_text_switcher)");
        this.f22400e = (TextSwitcher) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.button_add_to_cart_text_switcher_primary);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…rt_text_switcher_primary)");
        this.f22401f = (TextSwitcher) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.button_express_checkout);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.….button_express_checkout)");
        this.f22402g = (Button) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.button_google_pay);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.button_google_pay)");
        this.f22403h = findViewById6;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10196a) {
            C10196a aVar = (C10196a) jVar;
            if (aVar.f22405b == null) {
                ViewExtensions.m12860d(this.itemView);
                return;
            }
            ViewExtensions.m12869m(this.itemView);
            if (aVar.f22404a == null) {
                ViewExtensions.m12860d(this.f22398c);
                ViewExtensions.m12860d(this.f22400e);
                ViewExtensions.m12869m(this.f22399d);
                ViewExtensions.m12869m(this.f22401f);
                ViewExtensions.m12860d(this.f22402g);
                ViewExtensions.m12860d(this.f22403h);
                mo33570f(this.f22399d, this.f22401f, aVar.f22405b);
                return;
            }
            ViewExtensions.m12869m(this.f22398c);
            ViewExtensions.m12869m(this.f22400e);
            ViewExtensions.m12860d(this.f22399d);
            ViewExtensions.m12860d(this.f22401f);
            mo33570f(this.f22398c, this.f22400e, aVar.f22405b);
            C10423j jVar2 = aVar.f22404a;
            if (jVar2 instanceof C10223a) {
                ViewExtensions.m12869m(this.f22403h);
                ViewExtensions.m12866j(this.f22403h, new HorizontalBuyButtonsViewHolder$bindGooglePay$1(this));
            } else if (jVar2 instanceof C10212a) {
                ViewExtensions.m12869m(this.f22402g);
                ViewExtensions.m12866j(this.f22402g, new HorizontalBuyButtonsViewHolder$bindExpressCheckout$1(this, (C10212a) jVar2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: f */
    public final void mo33570f(Button button, TextSwitcher textSwitcher, C10225a aVar) {
        String string = this.itemView.getResources().getString(aVar.f22489a);
        C19383o.m32796f(string, "itemView.resources.getString(cartButton.text)");
        button.setEnabled(aVar.f22491c);
        button.setContentDescription(string);
        if (!aVar.f22491c) {
            button.setText(aVar.f22489a);
            ViewExtensions.m12860d(textSwitcher);
            return;
        }
        ViewExtensions.m12869m(textSwitcher);
        if (aVar.f22490b) {
            textSwitcher.setText(string);
            this.f22397b.mo38043a(C13597g.C13680l4.f30174a);
        } else {
            textSwitcher.setCurrentText(string);
        }
        ViewExtensions.m12866j(button, new HorizontalBuyButtonsViewHolder$bindCartButton$1(this, aVar));
        button.setOnTouchListener(new C10197b(button, this, aVar));
    }
}
