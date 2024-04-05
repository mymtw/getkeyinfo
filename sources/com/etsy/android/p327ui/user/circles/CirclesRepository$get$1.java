package com.etsy.android.p327ui.user.circles;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.user.circles.CirclesRepository", mo70541f = "CirclesRepository.kt", mo70542l = {41, 46, 51, 56}, mo70543m = "get")
/* renamed from: com.etsy.android.ui.user.circles.CirclesRepository$get$1 */
public final class CirclesRepository$get$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CirclesRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclesRepository$get$1(CirclesRepository circlesRepository, C19340c<? super CirclesRepository$get$1> cVar) {
        super(cVar);
        this.this$0 = circlesRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo37366a((C11512e) null, this);
    }
}
