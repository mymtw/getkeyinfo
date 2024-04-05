package com.paypal.pyplcheckout.p539ab.elmo;

import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.ab.elmo.Elmo", mo70541f = "Elmo.kt", mo70542l = {94}, mo70543m = "fetchRemoteTreatment")
/* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo$fetchRemoteTreatment$1 */
public final class Elmo$fetchRemoteTreatment$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Elmo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Elmo$fetchRemoteTreatment$1(Elmo elmo, C19340c<? super Elmo$fetchRemoteTreatment$1> cVar) {
        super(cVar);
        this.this$0 = elmo;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchRemoteTreatment((ExperimentRequest) null, this);
    }
}
