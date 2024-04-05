package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.FavoriteHolder$bind$lambda-2$$inlined$doOnNextLayout$1  reason: invalid class name */
public final class FavoriteHolder$bind$lambda2$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Context $context$inlined;
    public final /* synthetic */ ListingCard $favorite$inlined;
    public final /* synthetic */ View $this_apply$inlined;

    public FavoriteHolder$bind$lambda2$$inlined$doOnNextLayout$1(View view, Context context, ListingCard listingCard) {
        this.$this_apply$inlined = view;
        this.$context$inlined = context;
        this.$favorite$inlined = listingCard;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        int measuredWidth = ((ImageView) this.$this_apply$inlined.findViewById(R.id.favorites_create_list_image)).getMeasuredWidth();
        GlideRequests B0 = C0114h.m270B0(this.$context$inlined);
        ListingImage img = this.$favorite$inlined.getImg();
        B0.load(img != null ? C0761x.m1711b1(img, measuredWidth) : null).mo46136d0().mo16816M((ImageView) this.$this_apply$inlined.findViewById(R.id.favorites_create_list_image));
    }
}
