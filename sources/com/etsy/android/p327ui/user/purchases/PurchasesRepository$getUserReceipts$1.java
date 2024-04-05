package com.etsy.android.p327ui.user.purchases;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.user.purchases.PurchasesRepository", mo70541f = "PurchasesRepository.kt", mo70542l = {61, 74, 105}, mo70543m = "getUserReceipts")
/* renamed from: com.etsy.android.ui.user.purchases.PurchasesRepository$getUserReceipts$1 */
public final class PurchasesRepository$getUserReceipts$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PurchasesRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesRepository$getUserReceipts$1(PurchasesRepository purchasesRepository, C19340c<? super PurchasesRepository$getUserReceipts$1> cVar) {
        super(cVar);
        this.this$0 = purchasesRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo37701a((C11632c) null, this);
    }
}
