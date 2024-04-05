package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$2 */
public final class LoadedStateKt$LoadedState$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ShopViewModel $viewModel;
    public final /* synthetic */ C11224i.C11230f $viewState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedStateKt$LoadedState$2(ShopViewModel shopViewModel, C11224i.C11230f fVar, int i) {
        super(2);
        this.$viewModel = shopViewModel;
        this.$viewState = fVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LoadedStateKt.m19151a(this.$viewModel, this.$viewState, dVar, this.$$changed | 1);
    }
}
