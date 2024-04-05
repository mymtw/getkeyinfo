package com.etsy.android.p327ui.cart.saveforlater;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel", mo70541f = "SaveForLaterViewModel.kt", mo70542l = {37}, mo70543m = "getSaveForLater")
/* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterViewModel$getSaveForLater$1 */
final class SaveForLaterViewModel$getSaveForLater$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SaveForLaterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveForLaterViewModel$getSaveForLater$1(SaveForLaterViewModel saveForLaterViewModel, C19340c<? super SaveForLaterViewModel$getSaveForLater$1> cVar) {
        super(cVar);
        this.this$0 = saveForLaterViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SaveForLaterViewModel.m17713b(this.this$0, this);
    }
}
