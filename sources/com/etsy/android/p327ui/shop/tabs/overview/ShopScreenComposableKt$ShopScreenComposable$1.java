package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.runtime.C1302d;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.ShopScreenComposableKt$ShopScreenComposable$1 */
public final class ShopScreenComposableKt$ShopScreenComposable$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ ShopViewModel $viewModel;
    public final /* synthetic */ C11224i $viewState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopScreenComposableKt$ShopScreenComposable$1(C11224i iVar, ShopViewModel shopViewModel) {
        super(2);
        this.$viewState = iVar;
        this.$viewModel = shopViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C11224i iVar = this.$viewState;
            if (C19383o.m32792b(iVar, C11224i.C11225a.f24805a)) {
                dVar.mo5465u(-1903801532);
                dVar.mo5406H();
            } else if (iVar instanceof C11224i.C11229e) {
                dVar.mo5465u(-1903801454);
                LoadingStateKt.m19152a(this.$viewModel, dVar, 8);
                dVar.mo5406H();
            } else if (iVar instanceof C11224i.C11230f) {
                dVar.mo5465u(-1903801352);
                LoadedStateKt.m19151a(this.$viewModel, (C11224i.C11230f) this.$viewState, dVar, 72);
                dVar.mo5406H();
            } else if (C19383o.m32792b(iVar, C11224i.C11226b.f24806a)) {
                dVar.mo5465u(-1903801244);
                dVar.mo5406H();
            } else if (iVar instanceof C11224i.C11227c) {
                dVar.mo5465u(-1903801158);
                UnavailableErrorStateKt.m19154a(this.$viewModel, (C11224i.C11227c) this.$viewState, dVar, 8);
                dVar.mo5406H();
            } else if (iVar instanceof C11224i.C11228d) {
                dVar.mo5465u(-1903801040);
                GenericErrorStateKt.m19150a(this.$viewModel, (C11224i.C11228d) this.$viewState, dVar, 8);
                dVar.mo5406H();
            } else {
                dVar.mo5465u(-1903800959);
                dVar.mo5406H();
            }
        } else {
            dVar.mo5396C();
        }
    }
}
