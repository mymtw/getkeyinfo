package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.lib.models.apiv3.cart.SavedCartListing;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.z0 */
public final class C9229z0 extends C12086e<SavedCart> {

    /* renamed from: c */
    public final View f20377c = mo38986f(R.id.cart_view_loading);

    /* renamed from: d */
    public final View f20378d = mo38986f(R.id.btn_remove);

    /* renamed from: e */
    public final Button f20379e;

    /* renamed from: f */
    public final Button f20380f;

    /* renamed from: g */
    public final TextView f20381g;

    /* renamed from: h */
    public final TextView f20382h;

    /* renamed from: i */
    public final ListingFullImageView f20383i;

    /* renamed from: j */
    public final TextView f20384j;

    /* renamed from: k */
    public final View f20385k;

    /* renamed from: l */
    public final TextView f20386l;

    /* renamed from: m */
    public final TextView f20387m;

    /* renamed from: n */
    public final ViewGroup f20388n;

    /* renamed from: o */
    public final View f20389o;

    /* renamed from: p */
    public final TextView f20390p;

    /* renamed from: q */
    public final TextView f20391q;

    /* renamed from: r */
    public final TextView f20392r;

    /* renamed from: s */
    public final View f20393s;

    /* renamed from: t */
    public final SavedCartClickHandler f20394t;

    public C9229z0(ViewGroup viewGroup, SavedCartClickHandler savedCartClickHandler) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_saved_cart_listing, viewGroup, false));
        this.f20394t = savedCartClickHandler;
        boolean c = C8914m.m17345c(this.itemView.getContext());
        this.f20379e = (Button) mo38986f(c ? R.id.btn_move_to_cart_tablet : R.id.btn_move_to_cart_phone);
        this.f20380f = (Button) mo38986f(R.id.btn_move_to_favorites);
        this.f20388n = (ViewGroup) mo38986f(R.id.cartlisting_title_and_variations);
        this.f20381g = (TextView) mo38986f(R.id.text_cartlisting_title);
        this.f20382h = (TextView) mo38986f(R.id.text_from_shop_name);
        this.f20384j = (TextView) mo38986f(R.id.text_individual_price);
        this.f20385k = mo38986f(R.id.text_plus_shipping);
        TextView textView = (TextView) mo38986f(R.id.text_original_price);
        this.f20386l = textView;
        this.f20387m = (TextView) mo38986f(R.id.text_promotion_description);
        this.f20383i = (ListingFullImageView) mo38986f(R.id.image_cartlisting);
        this.f20389o = mo38986f(R.id.variations_and_quantity);
        this.f20390p = (TextView) mo38986f(R.id.variation1_name);
        this.f20391q = (TextView) mo38986f(R.id.variation2_name);
        this.f20392r = (TextView) mo38986f(R.id.cartlisting_quantity);
        this.f20393s = mo38986f(R.id.unavailable_msg_bubble);
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        SavedCart savedCart = (SavedCart) obj;
        SavedCartListing cartListing = savedCart.getCartListing();
        if (cartListing != null) {
            C9163b1 b1Var = new C9163b1(savedCart, cartListing);
            int i = 8;
            if (b1Var.f20155d) {
                this.f20377c.setVisibility(0);
                Context context = this.itemView.getContext();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_bg_primary});
                C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList != null) {
                    obtainStyledAttributes.recycle();
                    this.f20377c.setBackgroundColor(colorStateList.getDefaultColor());
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f20377c.setVisibility(8);
            }
            this.f20381g.setText(b1Var.f20154c);
            TextView textView = this.f20382h;
            String str = b1Var.f20158g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.itemView.getResources().getString(R.string.from_shop_name, new Object[]{str}));
            Context context2 = this.itemView.getContext();
            C19383o.m32797g(context2, ResponseConstants.CONTEXT);
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.clg_color_text_primary});
            C19383o.m32796f(obtainStyledAttributes2, "context.obtainStyledAttributes(styledAttrs)");
            ColorStateList colorStateList2 = obtainStyledAttributes2.getColorStateList(0);
            if (colorStateList2 != null) {
                obtainStyledAttributes2.recycle();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(colorStateList2.getDefaultColor()), spannableStringBuilder.toString().indexOf(str), spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                C9227y0 y0Var = new C9227y0(this, new C8698l[]{b1Var.f20152a, b1Var.f20153b}, b1Var);
                this.f20388n.setOnClickListener(y0Var);
                String str2 = b1Var.f20160i;
                String str3 = b1Var.f20161j;
                if (b1Var.f20163l) {
                    this.f20386l.setVisibility(0);
                    this.f20386l.setText(str2);
                    this.f20387m.setVisibility(0);
                    this.f20387m.setText(b1Var.f20162k);
                    this.f20384j.setText(str3);
                    this.f20384j.setTextColor(C13350a.m21013d(this.itemView.getContext(), R.attr.clg_color_text_urgency));
                } else {
                    this.f20386l.setVisibility(8);
                    this.f20386l.setText("");
                    this.f20387m.setVisibility(8);
                    this.f20387m.setText("");
                    this.f20384j.setText(str2);
                    this.f20384j.setTextColor(C13350a.m21013d(this.itemView.getContext(), R.attr.clg_color_text_primary));
                }
                this.f20385k.setVisibility(b1Var.f20169r ? 0 : 8);
                ListingImage listingImage = b1Var.f20159h;
                if (listingImage != null) {
                    this.f20383i.setClickable(true);
                    this.f20383i.setVisibility(0);
                    this.f20383i.setOnClickListener(y0Var);
                    this.f20383i.setImageInfo(listingImage);
                } else {
                    this.f20383i.setVisibility(4);
                }
                this.f20389o.setVisibility(8);
                this.f20390p.setVisibility(8);
                this.f20391q.setVisibility(8);
                this.f20392r.setVisibility(8);
                if (b1Var.f20168q) {
                    this.f20389o.setVisibility(0);
                    if (b1Var.f20164m) {
                        this.f20392r.setVisibility(0);
                        this.f20392r.setText(this.f20392r.getResources().getString(R.string.quantity_sub, new Object[]{String.valueOf(b1Var.f20165n)}));
                    }
                    if (C8885d0.m17324h(b1Var.f20166o)) {
                        this.f20390p.setVisibility(0);
                        this.f20390p.setText(b1Var.f20166o);
                    }
                    if (C8885d0.m17324h(b1Var.f20167p)) {
                        this.f20391q.setVisibility(0);
                        this.f20391q.setText(b1Var.f20167p);
                    }
                }
                boolean z = b1Var.f20156e;
                this.f20393s.setVisibility(z ? 8 : 0);
                Button button = this.f20379e;
                if (z) {
                    i = 0;
                }
                button.setVisibility(i);
                this.f20379e.setOnClickListener(new C9220v0(this, new C8698l[]{savedCart, cartListing}, savedCart));
                this.f20378d.setOnClickListener(new C9222w0(this, new C8698l[]{savedCart, cartListing}, savedCart));
                this.f20380f.setOnClickListener(new C9225x0(this, new C8698l[]{savedCart, cartListing}, savedCart));
                return;
            }
            throw new IllegalStateException();
        }
    }
}
