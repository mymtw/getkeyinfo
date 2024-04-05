package com.etsy.android.p327ui.shop.tabs.overview;

import com.etsy.android.p327ui.shop.tabs.C11215b;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.GenericErrorStateKt$GenericErrorState$1$1$1$1$1 */
public final class GenericErrorStateKt$GenericErrorState$1$1$1$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C11215b $retryEvent;
    public final /* synthetic */ ShopViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenericErrorStateKt$GenericErrorState$1$1$1$1$1(ShopViewModel shopViewModel, C11215b bVar) {
        super(0);
        this.$viewModel = shopViewModel;
        this.$retryEvent = bVar;
    }

    public final void invoke() {
        this.$viewModel.mo36882b(this.$retryEvent);
    }
}
