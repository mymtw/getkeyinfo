package com.etsy.android.p327ui.shop.tabs.overview;

import com.etsy.android.p327ui.shop.tabs.C11222h;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.android.p327ui.shop.tabs.Tab;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$1$1$1$1$1 */
public final class LoadedStateKt$LoadedState$1$1$1$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Tab $tab;
    public final /* synthetic */ ShopViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedStateKt$LoadedState$1$1$1$1$1(ShopViewModel shopViewModel, Tab tab) {
        super(0);
        this.$viewModel = shopViewModel;
        this.$tab = tab;
    }

    public final void invoke() {
        this.$viewModel.mo36882b(new C11222h.C11223a(this.$tab));
    }
}
