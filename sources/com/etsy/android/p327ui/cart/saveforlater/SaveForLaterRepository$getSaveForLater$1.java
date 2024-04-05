package com.etsy.android.p327ui.cart.saveforlater;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository", mo70541f = "SaveForLaterRepository.kt", mo70542l = {17}, mo70543m = "getSaveForLater")
/* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository$getSaveForLater$1 */
public final class SaveForLaterRepository$getSaveForLater$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SaveForLaterRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveForLaterRepository$getSaveForLater$1(SaveForLaterRepository saveForLaterRepository, C19340c<? super SaveForLaterRepository$getSaveForLater$1> cVar) {
        super(cVar);
        this.this$0 = saveForLaterRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo31768a(this);
    }
}
