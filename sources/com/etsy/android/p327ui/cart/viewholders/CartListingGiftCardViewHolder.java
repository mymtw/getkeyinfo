package com.etsy.android.p327ui.cart.viewholders;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.GiftCardInfo;
import com.etsy.android.lib.models.IFullImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartListing;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import com.etsy.android.stylekit.views.CollageContentToggleShort;
import com.etsy.android.uikit.view.C11929c;
import com.etsy.android.uikit.view.ListingFullImageView;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingGiftCardViewHolder */
public final class CartListingGiftCardViewHolder extends C9370c {

    /* renamed from: c */
    public final C9283h f20690c;

    /* renamed from: d */
    public final ListingFullImageView f20691d;

    /* renamed from: e */
    public final TextView f20692e;

    /* renamed from: f */
    public final TextView f20693f;

    /* renamed from: g */
    public final TextView f20694g;

    /* renamed from: h */
    public final CollageContentToggleShort f20695h;

    /* renamed from: i */
    public final Button f20696i;

    /* renamed from: j */
    public final Button f20697j;

    /* renamed from: k */
    public final Button f20698k;

    public CartListingGiftCardViewHolder(ViewGroup viewGroup, C9283h hVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_cart_listing_gift_card, viewGroup, false));
        this.f20690c = hVar;
        View f = mo38986f(R.id.image_listing);
        C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView");
        ListingFullImageView listingFullImageView = (ListingFullImageView) f;
        this.f20691d = listingFullImageView;
        View f2 = mo38986f(R.id.txt_total_price);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20692e = (TextView) f2;
        View f3 = mo38986f(R.id.txt_from);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.TextView");
        this.f20693f = (TextView) f3;
        View f4 = mo38986f(R.id.txt_email);
        C19383o.m32795e(f4, "null cannot be cast to non-null type android.widget.TextView");
        this.f20694g = (TextView) f4;
        View f5 = mo38986f(R.id.txt_message);
        C19383o.m32795e(f5, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggleShort");
        this.f20695h = (CollageContentToggleShort) f5;
        View f6 = mo38986f(R.id.btn_edit);
        C19383o.m32795e(f6, "null cannot be cast to non-null type android.widget.Button");
        this.f20696i = (Button) f6;
        View f7 = mo38986f(R.id.btn_remove);
        C19383o.m32795e(f7, "null cannot be cast to non-null type android.widget.Button");
        this.f20697j = (Button) f7;
        View f8 = mo38986f(R.id.txt_quantity_stepper);
        C19383o.m32795e(f8, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) f8;
        this.f20698k = button;
        button.setBackground((Drawable) null);
        button.setOnClickListener((View.OnClickListener) null);
        listingFullImageView.setImageViewTransformation(new C11929c.C11930a((int) this.itemView.getResources().getDimension(R.dimen.clg_space_12)));
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        Resources resources = this.itemView.getResources();
        BaseModel data = cartGroupItem.getData();
        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.CartListing");
        CartListing cartListing = (CartListing) data;
        GiftCardInfo giftCardInfo = cartListing.getGiftCardInfo();
        this.f20692e.setText(cartListing.getTotalPriceString());
        IFullImage giftCardDesign = giftCardInfo.getGiftCardDesign();
        if (giftCardDesign == null) {
            giftCardDesign = cartListing.getListingImage();
        }
        if (giftCardDesign != null) {
            this.f20691d.setImageInfo(giftCardDesign);
        }
        int i = 1;
        this.f20693f.setText(resources.getString(R.string.giftcard_cart_listing_from, new Object[]{giftCardInfo.getSenderName()}));
        String recipientEmail = giftCardInfo.getRecipientEmail();
        if (recipientEmail == null || recipientEmail.length() == 0) {
            ViewExtensions.m12860d(this.f20694g);
        } else {
            ViewExtensions.m12869m(this.f20694g);
            this.f20694g.setText(resources.getString(R.string.giftcard_cart_listing_email, new Object[]{recipientEmail}));
        }
        String message = giftCardInfo.getMessage();
        if (message == null || message.length() == 0) {
            ViewExtensions.m12860d(this.f20695h);
        } else {
            ViewExtensions.m12869m(this.f20695h);
            CollageContentToggleShort collageContentToggleShort = this.f20695h;
            String string = resources.getString(R.string.giftcard_cart_listing_message, new Object[]{message});
            C19383o.m32796f(string, "resources.getString(R.st…listing_message, message)");
            collageContentToggleShort.setContentText((CharSequence) string);
        }
        if (cartListing.getPurchaseQuantity() > 0) {
            i = cartListing.getPurchaseQuantity();
        }
        this.f20698k.setText(String.valueOf(i));
        this.f20698k.setVisibility(0);
        ViewExtensions.m12860d(this.f20696i);
        if (this.f20690c != null) {
            ViewExtensions.m12866j(this.f20697j, new CartListingGiftCardViewHolder$bindCartGroupItem$1(cartGroupItem, this));
        }
    }
}
