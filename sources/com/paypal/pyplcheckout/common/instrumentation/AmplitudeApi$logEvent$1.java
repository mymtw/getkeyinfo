package com.paypal.pyplcheckout.common.instrumentation;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi", mo70541f = "AmplitudeApi.kt", mo70542l = {178, 65, 66}, mo70543m = "logEvent")
public final class AmplitudeApi$logEvent$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AmplitudeApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeApi$logEvent$1(AmplitudeApi amplitudeApi, C19340c<? super AmplitudeApi$logEvent$1> cVar) {
        super(cVar);
        this.this$0 = amplitudeApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logEvent((AmplitudeEvent) null, 0, this);
    }
}
