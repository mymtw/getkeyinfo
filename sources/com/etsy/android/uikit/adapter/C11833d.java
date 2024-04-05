package com.etsy.android.uikit.adapter;

import android.content.Context;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.adapter.d */
public final class C11833d {

    /* renamed from: a */
    public int f26309a;

    /* renamed from: b */
    public int f26310b;

    /* renamed from: c */
    public int f26311c;

    /* renamed from: d */
    public int f26312d;

    public C11833d(ListingImage listingImage, Context context) {
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        this.f26310b = listingImage.getFullHeight();
        this.f26309a = listingImage.getFullWidth();
        this.f26311c = context.getResources().getDisplayMetrics().widthPixels;
        this.f26312d = C1948d.m4272d(context);
        context.getResources().getDimensionPixelSize(R.dimen.listing_pager_max_height);
        context.getResources().getDimensionPixelSize(R.dimen.listing_pager_min_height);
    }

    /* renamed from: a */
    public final float mo38309a() {
        int i = this.f26310b;
        if (i == 0) {
            return 1.0f;
        }
        float f = ((float) this.f26309a) / ((float) i);
        if (f >= 0.6f && f < 0.9f) {
            return 0.8f;
        }
        if (f >= 0.9f && f <= 1.1f) {
            return 1.0f;
        }
        if (f <= 1.1f || f > 1.4f) {
            return f;
        }
        return 1.25f;
    }
}
