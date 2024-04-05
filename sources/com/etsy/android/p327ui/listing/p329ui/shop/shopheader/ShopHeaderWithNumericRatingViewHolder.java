package com.etsy.android.p327ui.listing.p329ui.shop.shopheader;

import android.content.res.Resources;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.session.C0087d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.shop.shopheader.ShopHeaderWithNumericRatingViewHolder */
public final class ShopHeaderWithNumericRatingViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f23379b;

    /* renamed from: c */
    public final View f23380c;

    /* renamed from: d */
    public final CollageHeadingTextView f23381d;

    /* renamed from: e */
    public final AppCompatTextView f23382e;

    /* renamed from: f */
    public final AppCompatTextView f23383f;

    /* renamed from: g */
    public final NumericRatingView f23384g;

    /* renamed from: h */
    public final ImageView f23385h;

    /* renamed from: i */
    public final View f23386i;

    /* renamed from: j */
    public final TextView f23387j;

    /* renamed from: k */
    public final RequestManager f23388k;

    /* renamed from: l */
    public final int f23389l = C0087d.m233b(this.itemView, R.dimen.gen_avatar_corners_small);

    public ShopHeaderWithNumericRatingViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_shop_header_numeric_rating, false));
        this.f23379b = cVar;
        View findViewById = this.itemView.findViewById(R.id.shop_header_background);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.shop_header_background)");
        this.f23380c = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.shop_header_name);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.shop_header_name)");
        CollageHeadingTextView collageHeadingTextView = (CollageHeadingTextView) findViewById2;
        this.f23381d = collageHeadingTextView;
        View findViewById3 = this.itemView.findViewById(R.id.shop_header_sales);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.shop_header_sales)");
        this.f23382e = (AppCompatTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.shop_header_location);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.shop_header_location)");
        this.f23383f = (AppCompatTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.shop_rating_numeric);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.shop_rating_numeric)");
        NumericRatingView numericRatingView = (NumericRatingView) findViewById5;
        this.f23384g = numericRatingView;
        View findViewById6 = this.itemView.findViewById(R.id.shop_header_avatar);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.shop_header_avatar)");
        this.f23385h = (ImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.star_seller_badge_layout);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.…star_seller_badge_layout)");
        this.f23386i = findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.star_seller_badge_label);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.….star_seller_badge_label)");
        this.f23387j = (TextView) findViewById8;
        RequestManager with = Glide.with(this.itemView);
        C19383o.m32796f(with, "with(itemView)");
        this.f23388k = with;
        AccessibilityClassNames accessibilityClassNames = AccessibilityClassNames.BUTTON;
        ViewsExtensionsKt.m17423b(collageHeadingTextView, accessibilityClassNames);
        ViewsExtensionsKt.m17423b(numericRatingView, accessibilityClassNames);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10644a) {
            ViewExtensions.m12866j(this.f23380c, new ShopHeaderWithNumericRatingViewHolder$bind$1(this));
            C10644a aVar = (C10644a) jVar;
            this.f23381d.setText(aVar.f23390a);
            ViewExtensions.m12866j(this.f23384g, new ShopHeaderWithNumericRatingViewHolder$bind$2(this));
            this.f23384g.setRatingData(aVar.f23392c, aVar.f23393d, aVar.f23394e, aVar.f23395f);
            C10644a.C10646b bVar = aVar.f23391b;
            if (bVar instanceof C10644a.C10646b.C10647a) {
                ViewExtensions.m12869m(this.f23383f);
                ViewExtensions.m12860d(this.f23382e);
                this.f23383f.setText(((C10644a.C10646b.C10647a) aVar.f23391b).f23405a);
            } else if (bVar instanceof C10644a.C10646b.C10648b) {
                ViewExtensions.m12860d(this.f23383f);
                ViewExtensions.m12869m(this.f23382e);
                Resources resources = this.itemView.getContext().getResources();
                C10644a.C10646b.C10648b bVar2 = (C10644a.C10646b.C10648b) aVar.f23391b;
                String quantityString = resources.getQuantityString(R.plurals.sales_pl_nt_sentence_case, bVar2.f23407b, new Object[]{bVar2.f23406a});
                C19383o.m32796f(quantityString, "itemView.context.resourc…esCount\n                )");
                this.f23382e.setText(quantityString);
            }
            String str = aVar.f23396g;
            if (str != null) {
                this.f23388k.load(str).mo16829a(C6128g.m12231I(new C6105w(this.f23389l))).mo16816M(this.f23385h);
            }
            C10644a.C10645a aVar2 = aVar.f23397h;
            if (aVar2.f23398a) {
                ViewExtensions.m12869m(this.f23386i);
                ViewExtensions.m12866j(this.f23386i, new ShopHeaderWithNumericRatingViewHolder$bind$4$1(this));
                this.f23387j.setText(aVar2.f23399b);
                this.f23379b.mo38043a(C13597g.C13673k4.f30167a);
                return;
            }
            ViewExtensions.m12860d(this.f23386i);
            this.f23386i.setOnClickListener((View.OnClickListener) null);
            this.f23387j.setText("");
            return;
        }
        throw new IllegalArgumentException();
    }
}
