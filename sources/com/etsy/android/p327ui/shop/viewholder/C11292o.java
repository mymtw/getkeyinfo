package com.etsy.android.p327ui.shop.viewholder;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11178m0;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.view.RatingIconView;
import com.etsy.android.uikit.view.TopAlignedCompoundDrawable;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import p357gf.C12793b;

/* renamed from: com.etsy.android.ui.shop.viewholder.o */
public final class C11292o extends C12086e<ShopV3> {

    /* renamed from: c */
    public final TextView f24922c = ((TextView) this.itemView.findViewById(R.id.shop_name));

    /* renamed from: d */
    public final TextView f24923d = ((TextView) this.itemView.findViewById(R.id.shop_summary));

    /* renamed from: e */
    public final RatingIconView f24924e = ((RatingIconView) this.itemView.findViewById(R.id.shop_rating));

    /* renamed from: f */
    public final TextView f24925f = ((TextView) this.itemView.findViewById(R.id.shop_headline));

    /* renamed from: g */
    public final Calendar f24926g;

    /* renamed from: h */
    public final TextView f24927h = ((TextView) this.itemView.findViewById(R.id.shop_num_reviews));

    /* renamed from: i */
    public final TopAlignedCompoundDrawable f24928i;

    /* renamed from: j */
    public C11178m0 f24929j;

    /* renamed from: k */
    public final C11143e1 f24930k;

    public C11292o(ViewGroup viewGroup, C11178m0 m0Var, C11192q0 q0Var) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_info, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.shop_info_review_click_region);
        this.f24928i = new TopAlignedCompoundDrawable(C12793b.m20434a(R.drawable.sk_ic_location, this.itemView.getContext(), R.color.sk_gray_50));
        this.f24926g = Calendar.getInstance();
        this.f24929j = m0Var;
        this.f24930k = q0Var;
        findViewById.setOnClickListener(new C11290n(this));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ShopV3 shopV3 = (ShopV3) obj;
        this.f24922c.setText(shopV3.getName());
        ArrayList arrayList = new ArrayList(3);
        Resources resources = this.itemView.getResources();
        String location = shopV3.getLocation();
        boolean g = C8885d0.m17323g(location);
        TopAlignedCompoundDrawable topAlignedCompoundDrawable = g ? this.f24928i : null;
        if (g) {
            arrayList.add(location);
        }
        int soldCount = shopV3.getSoldCount();
        String quantityString = resources.getQuantityString(R.plurals.sales_pl_nt_sentence_case, soldCount, new Object[]{Integer.valueOf(soldCount)});
        this.f24923d.setCompoundDrawablesWithIntrinsicBounds(topAlignedCompoundDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        arrayList.add(quantityString);
        Date openDate = shopV3.getOpenDate();
        if ((C8914m.m17345c(this.itemView.getContext()) || !g) && openDate.getTime() > 0) {
            this.f24926g.setTime(openDate);
            arrayList.add(resources.getString(R.string.since, new Object[]{String.valueOf(this.f24926g.get(1))}));
        }
        this.f24923d.setText(StringUtils.join((Iterable<?>) arrayList, "  •  "));
        if (shopV3.getAverageRating() > ShadowDrawableWrapper.COS_45) {
            this.f24924e.setRating((float) shopV3.getAverageRating());
            this.f24927h.setText(resources.getString(R.string.parentheses, new Object[]{String.valueOf(shopV3.getTotalRatingCount())}));
        } else {
            this.f24924e.setVisibility(8);
            this.f24927h.setVisibility(8);
        }
        if (this.f24925f != null) {
            String a = ((C11192q0) this.f24930k).mo36861a(shopV3.getHeadline(), shopV3.getHeadlineTranslated());
            if (C8885d0.m17323g(a)) {
                this.f24925f.setVisibility(0);
                this.f24925f.setText(a);
                return;
            }
            this.f24925f.setVisibility(8);
        }
    }
}
