package com.etsy.android.p327ui.user.purchases;

import android.os.Bundle;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesFragment$onViewCreated$1 */
public final class PurchasesFragment$onViewCreated$1 extends Lambda implements C19861p<String, Bundle, C19394m> {
    public final /* synthetic */ PurchasesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesFragment$onViewCreated$1(PurchasesFragment purchasesFragment) {
        super(2);
        this.this$0 = purchasesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Bundle) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, Bundle bundle) {
        C19383o.m32797g(str, "<anonymous parameter 0>");
        C19383o.m32797g(bundle, "data");
        this.this$0.handleOnReviewUpdated(bundle);
    }
}
