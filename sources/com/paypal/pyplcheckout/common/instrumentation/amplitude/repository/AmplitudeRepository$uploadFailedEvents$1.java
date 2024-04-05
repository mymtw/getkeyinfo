package com.paypal.pyplcheckout.common.instrumentation.amplitude.repository;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository", mo70541f = "AmplitudeRepository.kt", mo70542l = {118, 119, 125, 129}, mo70543m = "uploadFailedEvents")
public final class AmplitudeRepository$uploadFailedEvents$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AmplitudeRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeRepository$uploadFailedEvents$1(AmplitudeRepository amplitudeRepository, C19340c<? super AmplitudeRepository$uploadFailedEvents$1> cVar) {
        super(cVar);
        this.this$0 = amplitudeRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadFailedEvents(this);
    }
}
