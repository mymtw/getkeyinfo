package com.etsy.android.p327ui.shop.tabs;

import com.etsy.android.uikit.AppBarHelper;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$appBarHelper$2 */
public final class ShopFragment$appBarHelper$2 extends Lambda implements C19846a<AppBarHelper> {
    public final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFragment$appBarHelper$2(ShopFragment shopFragment) {
        super(0);
        this.this$0 = shopFragment;
    }

    public final AppBarHelper invoke() {
        return this.this$0.getAppBarHelperProvider().get();
    }
}
