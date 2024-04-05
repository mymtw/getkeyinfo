package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.collagecompose.ThemeKt;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.GenericErrorStateKt */
public final class GenericErrorStateKt {
    /* renamed from: a */
    public static final void m19150a(ShopViewModel shopViewModel, C11224i.C11228d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(shopViewModel, "viewModel");
        C19383o.m32797g(dVar, "viewState");
        ComposerImpl h = dVar2.mo5440h(1563699998);
        ThemeKt.m19959a(false, C18263b.m30805A(h, 1666681946, new GenericErrorStateKt$GenericErrorState$1(dVar, shopViewModel)), h, 48, 1);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new GenericErrorStateKt$GenericErrorState$2(shopViewModel, dVar, i);
        }
    }
}
