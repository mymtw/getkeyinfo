package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import android.widget.ImageView;
import androidx.activity.C0114h;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder$bindDisplayListings$$inlined$doOnNextLayout$1 */
public final class C11537xd6ea9b14 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ImageView $displayListingImageView$inlined;
    public final /* synthetic */ String $url$inlined;

    public C11537xd6ea9b14(ImageView imageView, String str) {
        this.$displayListingImageView$inlined = imageView;
        this.$url$inlined = str;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        C0114h.m272C0(this.$displayListingImageView$inlined).load(this.$url$inlined).mo16816M(this.$displayListingImageView$inlined);
    }
}
