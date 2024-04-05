package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.collagecompose.ThemeKt;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadingStateKt */
public final class LoadingStateKt {
    /* renamed from: a */
    public static final void m19152a(ShopViewModel shopViewModel, C1302d dVar, int i) {
        C19383o.m32797g(shopViewModel, "viewModel");
        ComposerImpl h = dVar.mo5440h(265645012);
        if ((i & 1) != 0 || !h.mo5442i()) {
            ThemeKt.m19959a(false, ComposableSingletons$LoadingStateKt.f24813a, h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LoadingStateKt$LoadingState$1(shopViewModel, i);
        }
    }
}
