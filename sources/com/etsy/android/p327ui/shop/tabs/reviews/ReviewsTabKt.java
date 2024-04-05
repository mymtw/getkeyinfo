package com.etsy.android.p327ui.shop.tabs.reviews;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.collagecompose.ThemeKt;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.reviews.ReviewsTabKt */
public final class ReviewsTabKt {
    /* renamed from: a */
    public static final void m19156a(ShopViewModel shopViewModel, C11224i.C11230f fVar, C1302d dVar, int i) {
        C19383o.m32797g(shopViewModel, "viewModel");
        C19383o.m32797g(fVar, "viewState");
        ComposerImpl h = dVar.mo5440h(-1903898853);
        if ((i & 1) != 0 || !h.mo5442i()) {
            ThemeKt.m19959a(false, ComposableSingletons$ReviewsTabKt.f24824b, h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ReviewsTabKt$ReviewsTab$1(shopViewModel, fVar, i);
        }
    }
}
