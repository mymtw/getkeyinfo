package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.collagecompose.ThemeKt;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.UnavailableErrorStateKt */
public final class UnavailableErrorStateKt {
    /* renamed from: a */
    public static final void m19154a(ShopViewModel shopViewModel, C11224i.C11227c cVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(shopViewModel, "viewModel");
        C19383o.m32797g(cVar, "viewState");
        ComposerImpl h = dVar.mo5440h(558321315);
        if ((i & 112) == 0) {
            i2 = (h.mo5408I(cVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !h.mo5442i()) {
            ThemeKt.m19959a(false, C18263b.m30805A(h, -1760119329, new UnavailableErrorStateKt$UnavailableErrorState$1(cVar)), h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new UnavailableErrorStateKt$UnavailableErrorState$2(shopViewModel, cVar, i);
        }
    }
}
