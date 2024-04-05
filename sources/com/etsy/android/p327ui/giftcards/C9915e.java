package com.etsy.android.p327ui.giftcards;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.models.GiftCardDesign;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.ArrayList;
import p213q2.C7717a;
import p455u9.C13450d;

/* renamed from: com.etsy.android.ui.giftcards.e */
public final class C9915e extends C7717a {

    /* renamed from: d */
    public ArrayList<GiftCardDesign> f21868d = new ArrayList<>();

    /* renamed from: e */
    public TrackingOnClickListener f21869e;

    public C9915e(TrackingOnClickListener trackingOnClickListener) {
        this.f21869e = trackingOnClickListener;
    }

    /* renamed from: h */
    public final void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: j */
    public final int mo20184j() {
        return this.f21868d.size();
    }

    /* renamed from: m */
    public final float mo20187m() {
        return 0.94f;
    }

    /* renamed from: n */
    public final Object mo10625n(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) View.inflate(viewGroup.getContext(), R.layout.view_gift_card_design, (ViewGroup) null);
        viewGroup.addView(imageView);
        imageView.setTag(Integer.valueOf(i));
        imageView.setOnClickListener(this.f21869e);
        String urlBanner = this.f21868d.get(i).getUrlBanner();
        if (C0761x.m1714c1(imageView, urlBanner)) {
            C0761x.m1705Z(new C13450d(imageView, urlBanner));
        }
        return imageView;
    }

    /* renamed from: o */
    public final boolean mo10626o(View view, Object obj) {
        return view == obj;
    }
}
