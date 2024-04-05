package com.etsy.android.p327ui.shop.tabs;

import androidx.compose.runtime.C1302d;
import com.etsy.android.p327ui.shop.tabs.overview.ShopScreenComposableKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$onCreateView$view$1$1 */
public final class ShopFragment$onCreateView$view$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFragment$onCreateView$view$1$1(ShopFragment shopFragment) {
        super(2);
        this.this$0 = shopFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            ShopScreenComposableKt.m19153a(this.this$0.getViewModel(), dVar, 8);
        } else {
            dVar.mo5396C();
        }
    }
}
