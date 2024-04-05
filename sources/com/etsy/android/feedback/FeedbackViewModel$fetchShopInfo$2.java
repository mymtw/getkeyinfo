package com.etsy.android.feedback;

import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.p327ui.shop.C11311z0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class FeedbackViewModel$fetchShopInfo$2 extends Lambda implements C19857l<C11311z0, C19394m> {
    public final /* synthetic */ FeedbackViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$fetchShopInfo$2(FeedbackViewModel feedbackViewModel) {
        super(1);
        this.this$0 = feedbackViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11311z0) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11311z0 z0Var) {
        if (z0Var instanceof C11311z0.C11313b) {
            FeedbackViewModel feedbackViewModel = this.this$0;
            C11311z0.C11313b bVar = (C11311z0.C11313b) z0Var;
            Shop shop = bVar.f24963a;
            feedbackViewModel.getClass();
            C19383o.m32797g(shop, ResponseConstants.SHOP);
            feedbackViewModel.f14279q = shop;
            this.this$0.f14275m.postValue(new FeedbackViewModel.C6440b.C6444d(bVar.f24963a));
            return;
        }
        this.this$0.f14275m.postValue(FeedbackViewModel.C6440b.C6442b.f14292a);
    }
}
