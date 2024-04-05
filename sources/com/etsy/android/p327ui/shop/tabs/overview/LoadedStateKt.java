package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.collagecompose.ThemeKt;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt */
public final class LoadedStateKt {
    /* renamed from: a */
    public static final void m19151a(ShopViewModel shopViewModel, C11224i.C11230f fVar, C1302d dVar, int i) {
        C19383o.m32797g(shopViewModel, "viewModel");
        C19383o.m32797g(fVar, "viewState");
        ComposerImpl h = dVar.mo5440h(1979990283);
        ThemeKt.m19959a(false, C18263b.m30805A(h, 1214224455, new LoadedStateKt$LoadedState$1(fVar, shopViewModel)), h, 48, 1);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LoadedStateKt$LoadedState$2(shopViewModel, fVar, i);
        }
    }
}
