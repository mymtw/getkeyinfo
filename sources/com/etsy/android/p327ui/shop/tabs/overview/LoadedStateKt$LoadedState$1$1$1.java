package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.material.TabKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.android.p327ui.shop.tabs.Tab;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$1$1$1 */
public final class LoadedStateKt$LoadedState$1$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ ShopViewModel $viewModel;
    public final /* synthetic */ C11224i.C11230f $viewState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedStateKt$LoadedState$1$1$1(C11224i.C11230f fVar, ShopViewModel shopViewModel) {
        super(2);
        this.$viewState = fVar;
        this.$viewModel = shopViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            List<Tab> list = this.$viewState.f24812b;
            ShopViewModel shopViewModel = this.$viewModel;
            for (Tab tab : list) {
                C1302d dVar3 = dVar;
                TabKt.m2255a(221184, 460, 0, 0, (C0640j) null, dVar3, (C1436d) null, new LoadedStateKt$LoadedState$1$1$1$1$1(shopViewModel, tab), C18263b.m30805A(dVar2, 1627969877, new LoadedStateKt$LoadedState$1$1$1$1$2(tab)), C18263b.m30805A(dVar2, -2089801706, new LoadedStateKt$LoadedState$1$1$1$1$3(tab)), tab.f24781b, false);
                shopViewModel = shopViewModel;
            }
            return;
        }
        dVar.mo5396C();
    }
}
