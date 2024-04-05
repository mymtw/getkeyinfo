package com.etsy.android.p327ui.shop.tabs.items;

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
import com.etsy.collagecompose.C12159j;
import com.etsy.collagecompose.DimensKt;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.items.ItemsTabKt */
public final class ItemsTabKt {
    /* renamed from: a */
    public static final void m19149a(LazyListState lazyListState, ShopViewModel shopViewModel, C11224i.C11230f fVar, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        LazyListState lazyListState2 = lazyListState;
        ShopViewModel shopViewModel2 = shopViewModel;
        C11224i.C11230f fVar2 = fVar;
        int i3 = i;
        C19383o.m32797g(lazyListState2, "state");
        C19383o.m32797g(shopViewModel2, "viewModel");
        C19383o.m32797g(fVar2, "viewState");
        ComposerImpl h = dVar.mo5440h(-1019084083);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(lazyListState2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            composerImpl = h;
            LazyDslKt.m1771a(C15588c1.m25279F0(C1436d.C1437a.f3125b, ((C12159j) h.mo5410J(DimensKt.f27051e)).f27178f), lazyListState, (C0759v) null, false, (C0718d.C0729k) null, (C1428a.C1430b) null, (C0608f) null, false, ItemsTabKt$ItemsTab$1.INSTANCE, h, ((i2 << 3) & 112) | 100663296, 252);
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new ItemsTabKt$ItemsTab$2(lazyListState2, shopViewModel2, fVar2, i3);
        }
    }
}
