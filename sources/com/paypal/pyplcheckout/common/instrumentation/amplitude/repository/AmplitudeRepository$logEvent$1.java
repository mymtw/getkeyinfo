package com.paypal.pyplcheckout.common.instrumentation.amplitude.repository;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository", mo70541f = "AmplitudeRepository.kt", mo70542l = {79, 81}, mo70543m = "logEvent")
public final class AmplitudeRepository$logEvent$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AmplitudeRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeRepository$logEvent$1(AmplitudeRepository amplitudeRepository, C19340c<? super AmplitudeRepository$logEvent$1> cVar) {
        super(cVar);
        this.this$0 = amplitudeRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logEvent((String) null, (JSONObject) null, this);
    }
}
