package com.etsy.android.p327ui.shop.viewholder;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.StarSeller;
import com.etsy.android.lib.models.StarSellerBadge;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.view.FullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p438re.C13361d;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.viewholder.m */
public final class C11288m extends C12086e<C11283k> {

    /* renamed from: c */
    public final C13361d f24916c;

    /* renamed from: d */
    public final C8672b f24917d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11288m(ViewGroup viewGroup, C13361d dVar, C8703p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shop_home_info_redesign, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(dVar, "clickHandler");
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f24916c = dVar;
        this.f24917d = pVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ShopV3 shopV3;
        String str;
        C11283k kVar = (C11283k) obj;
        Resources resources = this.itemView.getResources();
        if (kVar != null && (shopV3 = kVar.f24907a) != null) {
            ((FullImageView) this.itemView.findViewById(R.id.shop_home_info_icon)).setImageInfo(shopV3.getShopIcon(), 1);
            ((CollageHeadingTextView) this.itemView.findViewById(R.id.shop_home_info_name)).setText(shopV3.getName());
            StarSeller starSeller = shopV3.getStarSeller();
            StarSellerBadge badge = starSeller != null ? starSeller.getBadge() : null;
            View findViewById = this.itemView.findViewById(R.id.star_seller_badge_layout);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.…star_seller_badge_layout)");
            ViewGroup viewGroup = (ViewGroup) findViewById;
            if (badge != null) {
                ((TextView) this.itemView.findViewById(R.id.star_seller_badge_label)).setText(badge.getLabel());
                viewGroup.setOnClickListener(new C11286l(this, badge));
                ViewExtensions.m12869m(viewGroup);
                C8672b bVar = this.f24917d;
                bVar.mo21333d(badge.getEventName() + "_badge_viewed", (Map<? extends AnalyticsProperty, Object>) null);
            } else {
                ViewExtensions.m12860d(viewGroup);
            }
            CollageRatingView collageRatingView = (CollageRatingView) this.itemView.findViewById(R.id.shop_home_info_rating);
            if (shopV3.getAverageRating() > ShadowDrawableWrapper.COS_45) {
                ViewExtensions.m12869m(collageRatingView);
                collageRatingView.setRating((float) shopV3.getAverageRating());
                collageRatingView.setText(resources.getString(R.string.parentheses, new Object[]{String.valueOf(shopV3.getTotalRatingCount())}));
                ViewExtensions.m12869m(this.itemView.findViewById(R.id.shop_home_info_sales_rating_divider));
            } else {
                ViewExtensions.m12860d(collageRatingView);
                ViewExtensions.m12860d(this.itemView.findViewById(R.id.shop_home_info_sales_rating_divider));
            }
            TextView textView = (TextView) this.itemView.findViewById(R.id.shop_home_info_location);
            if (C18263b.m30837c0(shopV3.getLocation())) {
                ViewExtensions.m12869m(textView);
                textView.setText(shopV3.getLocation());
            } else {
                ViewExtensions.m12860d(textView);
            }
            ((TextView) this.itemView.findViewById(R.id.shop_home_info_sales)).setText(resources.getQuantityString(R.plurals.sales_pl_nt_sentence_case, shopV3.getSoldCount(), new Object[]{Integer.valueOf(shopV3.getSoldCount())}));
            Button button = (Button) this.itemView.findViewById(R.id.shop_home_info_follow_button);
            View findViewById2 = this.itemView.findViewById(R.id.shop_home_info_follow_button);
            C19383o.m32796f(findViewById2, "itemView.findViewById(R.…_home_info_follow_button)");
            Button button2 = (Button) findViewById2;
            Resources resources2 = button2.getResources();
            CollageButton collageButton = (CollageButton) button2;
            collageButton.setIconResource(kVar.f24908b ? R.drawable.clg_icon_favorited : R.drawable.clg_icon_unfavorited);
            StringBuilder sb = new StringBuilder();
            sb.append(resources2.getString(R.string.favorite_shop));
            sb.append(' ');
            sb.append(shopV3.getName());
            sb.append(' ');
            if (kVar.f24908b) {
                StringBuilder h = C0072d.m201h(", ");
                h.append(resources2.getString(R.string.selected_content_description));
                str = h.toString();
            } else {
                str = "";
            }
            sb.append(str);
            collageButton.setContentDescription(sb.toString());
            ViewExtensions.m12866j(collageButton, new ShopHomeInfoRedesignViewHolder$bindShopFollow$1$1(this, kVar, collageButton, resources2, shopV3));
            Button button3 = (Button) this.itemView.findViewById(R.id.shop_home_info_contact_button);
            button3.setContentDescription(resources.getString(R.string.contact) + ' ' + shopV3.getName());
            ViewExtensions.m12866j(button3, new ShopHomeInfoRedesignViewHolder$bind$1$1$4$1(this));
        }
    }
}
