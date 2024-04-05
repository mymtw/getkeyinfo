package com.paypal.pyplcheckout.threeds;

import androidx.compose.foundation.layout.C0761x;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p160k5.C7196a;

public final class ThreeDsDecisionFlowInfo$init$2$1 implements C7196a {
    public final /* synthetic */ C19340c<String> $continuation;
    public final /* synthetic */ ThreeDsDecisionFlowInfo this$0;

    public ThreeDsDecisionFlowInfo$init$2$1(C19340c<? super String> cVar, ThreeDsDecisionFlowInfo threeDsDecisionFlowInfo) {
        this.$continuation = cVar;
        this.this$0 = threeDsDecisionFlowInfo;
    }

    public void onSetupCompleted(String str) {
        C19383o.m32797g(str, "consumerSessionId");
        this.$continuation.resumeWith(Result.m35480constructorimpl(str));
    }

    public void onValidated(ValidateResponse validateResponse, String str) {
        C19383o.m32797g(validateResponse, "validateResponse");
        C19383o.m32797g(str, "serverJwt");
        this.$continuation.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(this.this$0.threeDSFailure(new ValidateResponseAlias(validateResponse.getActionCode().getString(), validateResponse.getErrorNumber(), validateResponse.getErrorDescription())))));
    }
}
