package com.etsy.android.p327ui.cart.viewholders;

import android.support.p013v4.media.C0072d;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.Promotion;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cart.viewholders.PromotionViewHolder */
public final class PromotionViewHolder extends C9370c {

    /* renamed from: c */
    public final C9282g f20744c;

    /* renamed from: d */
    public final TextView f20745d;

    /* renamed from: e */
    public final TextView f20746e;

    /* renamed from: f */
    public final TextView f20747f;

    /* renamed from: g */
    public final ImageButton f20748g;

    public PromotionViewHolder(ViewGroup viewGroup, C9282g gVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_promotion, viewGroup, false));
        this.f20744c = gVar;
        View f = mo38986f(R.id.txt_coupon_code);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.TextView");
        this.f20745d = (TextView) f;
        View f2 = mo38986f(R.id.txt_coupon_description);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20746e = (TextView) f2;
        View f3 = mo38986f(R.id.txt_price_discount);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.TextView");
        this.f20747f = (TextView) f3;
        View f4 = mo38986f(R.id.button_remove);
        C19383o.m32795e(f4, "null cannot be cast to non-null type android.widget.ImageButton");
        this.f20748g = (ImageButton) f4;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        BaseModel data = cartGroupItem.getData();
        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.Promotion");
        Promotion promotion = (Promotion) data;
        StringBuilder h = C0072d.m201h("<b>");
        h.append(promotion.getCode());
        h.append("</b>");
        Spanned fromHtml = Html.fromHtml(h.toString());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(fromHtml);
        this.f20745d.setText(spannableStringBuilder);
        if (C18263b.m30839d0(promotion.getDescription())) {
            ViewExtensions.m12869m(this.f20746e);
            this.f20746e.setText(promotion.getDescription());
        } else {
            ViewExtensions.m12860d(this.f20746e);
            this.f20746e.setText("");
        }
        if (promotion.getPrice() != null) {
            ViewExtensions.m12869m(this.f20747f);
            this.f20747f.setText(String.valueOf(promotion.getPrice()));
        } else {
            ViewExtensions.m12860d(this.f20747f);
            this.f20747f.setText("");
        }
        ImageButton imageButton = this.f20748g;
        imageButton.setContentDescription(imageButton.getResources().getString(R.string.coupon_code_remove_coupon, new Object[]{promotion.getCode()}));
        ServerDrivenAction action = cartGroupItem.getAction(ServerDrivenAction.TYPE_DELETE_COUPON);
        if (action == null || this.f20744c == null) {
            ViewExtensions.m12860d(this.f20748g);
            return;
        }
        ViewExtensions.m12869m(this.f20748g);
        ViewExtensions.m12866j(this.f20748g, new PromotionViewHolder$bindCartGroupItem$1(this, action));
    }
}
