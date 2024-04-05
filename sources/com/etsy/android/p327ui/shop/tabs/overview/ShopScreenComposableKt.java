package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.android.util.C12065v;
import com.etsy.collagecompose.ThemeKt;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.ShopScreenComposableKt */
public final class ShopScreenComposableKt {
    /* renamed from: a */
    public static final void m19153a(ShopViewModel shopViewModel, C1302d dVar, int i) {
        C19383o.m32797g(shopViewModel, "viewModel");
        ComposerImpl h = dVar.mo5440h(1017544544);
        ThemeKt.m19959a(false, C18263b.m30805A(h, 391351204, new ShopScreenComposableKt$ShopScreenComposable$1((C11224i) C12065v.m19873a(shopViewModel.f24773e, h).getValue(), shopViewModel)), h, 48, 1);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ShopScreenComposableKt$ShopScreenComposable$2(shopViewModel, i);
        }
    }
}
