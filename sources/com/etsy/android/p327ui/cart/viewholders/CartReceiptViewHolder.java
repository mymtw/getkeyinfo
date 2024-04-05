package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingSocialShare;
import com.etsy.android.lib.models.apiv3.ShopSocialShare;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.cardviewelement.stats.SdlEvent;
import com.etsy.android.p327ui.cardview.viewholders.C9184i0;
import com.etsy.android.p327ui.cardview.viewholders.C9187j0;
import com.etsy.android.p327ui.cart.clicklisteners.C9285j;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartReceiptViewHolder */
public final class CartReceiptViewHolder extends C12086e<CartGroupItem> {

    /* renamed from: s */
    public static final /* synthetic */ int f20727s = 0;

    /* renamed from: c */
    public final C9285j f20728c;

    /* renamed from: d */
    public final C9184i0 f20729d;

    /* renamed from: e */
    public final TextView f20730e;

    /* renamed from: f */
    public final TextView f20731f;

    /* renamed from: g */
    public final TextView f20732g;

    /* renamed from: h */
    public final ListingFullImageView f20733h;

    /* renamed from: i */
    public final ListingFullImageView f20734i;

    /* renamed from: j */
    public final ListingFullImageView f20735j;

    /* renamed from: k */
    public final View f20736k = mo38986f(R.id.listing_image_1_card);

    /* renamed from: l */
    public final View f20737l = mo38986f(R.id.listing_image_2_card);

    /* renamed from: m */
    public final View f20738m = mo38986f(R.id.listing_image_3_card);

    /* renamed from: n */
    public final Button f20739n;

    /* renamed from: o */
    public final Button f20740o;

    /* renamed from: p */
    public final CollageButton f20741p;

    /* renamed from: q */
    public final Button f20742q;

    /* renamed from: r */
    public final TextView f20743r;

    public CartReceiptViewHolder(ViewGroup viewGroup, C9285j jVar, C9187j0 j0Var) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_cart_receipt_collage, viewGroup, false));
        this.f20728c = jVar;
        C9184i0 i0Var = new C9184i0(j0Var);
        this.f20729d = i0Var;
        View f = mo38986f(R.id.txt_title);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.TextView");
        this.f20730e = (TextView) f;
        View f2 = mo38986f(R.id.txt_subtitle);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20731f = (TextView) f2;
        View f3 = mo38986f(R.id.txt_description);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.TextView");
        this.f20732g = (TextView) f3;
        View f4 = mo38986f(R.id.listing_image_1);
        C19383o.m32795e(f4, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView");
        this.f20733h = (ListingFullImageView) f4;
        View f5 = mo38986f(R.id.listing_image_2);
        C19383o.m32795e(f5, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView");
        this.f20734i = (ListingFullImageView) f5;
        View f6 = mo38986f(R.id.listing_image_3);
        C19383o.m32795e(f6, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView");
        this.f20735j = (ListingFullImageView) f6;
        View f7 = mo38986f(R.id.btn_view_receipt);
        C19383o.m32795e(f7, "null cannot be cast to non-null type android.widget.Button");
        this.f20739n = (Button) f7;
        View f8 = mo38986f(R.id.btn_contact_shop);
        C19383o.m32795e(f8, "null cannot be cast to non-null type android.widget.Button");
        this.f20740o = (Button) f8;
        View f9 = mo38986f(R.id.btn_favorite_shop);
        C19383o.m32795e(f9, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageButton");
        this.f20741p = (CollageButton) f9;
        View f10 = mo38986f(R.id.btn_share);
        C19383o.m32795e(f10, "null cannot be cast to non-null type android.widget.Button");
        this.f20742q = (Button) f10;
        View f11 = mo38986f(R.id.receipt_recs_section_title);
        C19383o.m32795e(f11, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) f11;
        this.f20743r = textView;
        C2236a aVar = new C2236a();
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(R.dimen.clg_space_8);
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        View view2 = i0Var.f26988d;
        C19383o.m32796f(view2, "listingRecsListViewHolder.rootView");
        view2.setId(View.generateViewId());
        constraintLayout.addView(view2);
        aVar.mo8487e(constraintLayout);
        aVar.mo8489g(view2.getId(), 3, textView.getId(), 4, dimensionPixelOffset);
        aVar.mo8488f(view2.getId(), 6, 0, 6);
        aVar.mo8488f(view2.getId(), 7, 0, 7);
        view2.setVisibility(8);
        aVar.mo8484b(constraintLayout);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String str;
        CartGroupItem cartGroupItem = (CartGroupItem) obj;
        CartReceipt cartReceipt = (CartReceipt) (cartGroupItem != null ? cartGroupItem.getData() : null);
        if (cartReceipt != null) {
            this.f20730e.setText(cartReceipt.getTitle());
            this.f20731f.setText(cartReceipt.getSubtitle());
            this.f20732g.setText(cartReceipt.getDescription());
            TextView textView = this.f20732g;
            String description = cartReceipt.getDescription();
            C19383o.m32796f(description, "cartReceipt.description");
            textView.setVisibility(description.length() == 0 ? 8 : 0);
            ViewExtensions.m12866j(this.f20739n, new CartReceiptViewHolder$bind$1(this, cartReceipt));
            this.f20740o.setVisibility(cartReceipt.isPrivateShop() ? 8 : 0);
            ViewExtensions.m12866j(this.f20740o, new CartReceiptViewHolder$bind$2(this, cartReceipt));
            this.f20741p.setVisibility(cartReceipt.isPrivateShop() ? 8 : 0);
            mo31822g(cartReceipt);
            this.f20742q.setVisibility((cartReceipt.getListingSocialShare() == null && cartReceipt.getShopSocialShare() == null) ? 8 : 0);
            Button button = this.f20742q;
            if (cartReceipt.getListingSocialShare() != null) {
                ListingSocialShare listingSocialShare = cartReceipt.getListingSocialShare();
                C19383o.m32794d(listingSocialShare);
                str = listingSocialShare.getBtnText();
            } else if (cartReceipt.getShopSocialShare() != null) {
                ShopSocialShare shopSocialShare = cartReceipt.getShopSocialShare();
                C19383o.m32794d(shopSocialShare);
                str = shopSocialShare.getBtnText();
            } else {
                str = "";
            }
            button.setText(str);
            ViewExtensions.m12866j(this.f20742q, new CartReceiptViewHolder$bind$3(cartReceipt, this));
            this.f20736k.setVisibility(8);
            this.f20737l.setVisibility(8);
            this.f20738m.setVisibility(8);
            List<ListingImage> listingImages = cartReceipt.getListingImages();
            if (listingImages.size() > 0) {
                this.f20736k.setVisibility(0);
                this.f20733h.setImageInfo(listingImages.get(0));
                if (listingImages.size() > 1) {
                    this.f20737l.setVisibility(0);
                    this.f20734i.setImageInfo(listingImages.get(1));
                    if (listingImages.size() > 2) {
                        this.f20738m.setVisibility(0);
                        this.f20735j.setImageInfo(listingImages.get(2));
                    }
                }
            }
            ListSection listingRecommendationsSection = cartReceipt.getListingRecommendationsSection();
            if (listingRecommendationsSection != null) {
                HashMap hashMap = new HashMap();
                List<SdlEvent> listSectionEvents = listingRecommendationsSection.getListSectionEvents();
                C19383o.m32796f(listSectionEvents, "listingRecommendationsSe…       .listSectionEvents");
                Iterator it = C19382n.m32714I0(listSectionEvents).iterator();
                while (it.hasNext()) {
                    C8696j jVar = (C8696j) it.next();
                    for (Map.Entry next : jVar.f19099b.entrySet()) {
                        hashMap.put((AnalyticsProperty) next.getKey(), next.getValue());
                    }
                    this.f26962b.mo21333d(jVar.f19098a, hashMap);
                }
                this.f20743r.setText(listingRecommendationsSection.getTitle());
                this.f20743r.setVisibility(0);
                this.f20729d.mo19450a(listingRecommendationsSection);
                this.f20729d.f26988d.setVisibility(0);
                return;
            }
            this.f20743r.setVisibility(8);
            this.f20729d.f26988d.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final void mo31822g(CartReceipt cartReceipt) {
        C19383o.m32797g(cartReceipt, "cartReceipt");
        this.f20741p.setIconResource(cartReceipt.getIsFavorite() ? R.drawable.clg_icon_favorited : R.drawable.clg_icon_unfavorited);
        ViewExtensions.m12866j(this.f20741p, new CartReceiptViewHolder$bindShopFollow$1(cartReceipt, this));
    }
}
