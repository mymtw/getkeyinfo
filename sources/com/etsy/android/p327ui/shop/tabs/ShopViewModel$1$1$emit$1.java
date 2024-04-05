package com.etsy.android.p327ui.shop.tabs;

import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.ShopViewModel$1$1", mo70541f = "ShopViewModel.kt", mo70542l = {49}, mo70543m = "emit")
/* renamed from: com.etsy.android.ui.shop.tabs.ShopViewModel$1$1$emit$1 */
public final class ShopViewModel$1$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShopViewModel.C112071.C112081 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopViewModel$1$1$emit$1(ShopViewModel.C112071.C112081 r1, C19340c<? super ShopViewModel$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((C11215b) null, this);
    }
}
