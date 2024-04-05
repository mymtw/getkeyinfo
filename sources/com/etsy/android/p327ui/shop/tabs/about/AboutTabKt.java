package com.etsy.android.p327ui.shop.tabs.about;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.about.AboutTabKt */
public final class AboutTabKt {
    /* renamed from: a */
    public static final void m19146a(ShopViewModel shopViewModel, C11224i.C11230f fVar, C1302d dVar, int i) {
        ShopViewModel shopViewModel2 = shopViewModel;
        C11224i.C11230f fVar2 = fVar;
        int i2 = i;
        C19383o.m32797g(shopViewModel2, "viewModel");
        C19383o.m32797g(fVar2, "viewState");
        ComposerImpl h = dVar.mo5440h(1347613709);
        if ((i2 & 1) != 0 || !h.mo5442i()) {
            LazyDslKt.m1771a((C1436d) null, (LazyListState) null, (C0759v) null, false, (C0718d.C0729k) null, (C1428a.C1430b) null, (C0608f) null, false, AboutTabKt$AboutTab$1.INSTANCE, h, 100663296, 255);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AboutTabKt$AboutTab$2(shopViewModel2, fVar2, i2);
        }
    }
}
