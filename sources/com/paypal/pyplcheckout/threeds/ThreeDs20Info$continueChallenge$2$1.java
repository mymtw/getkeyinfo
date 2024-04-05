package com.paypal.pyplcheckout.threeds;

import android.content.Context;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Ref$ObjectRef;
import p160k5.C7197b;

public final class ThreeDs20Info$continueChallenge$2$1 implements C7197b {
    public final /* synthetic */ C19340c<ValidateResponseAlias> $continuation;
    public final /* synthetic */ Ref$ObjectRef<ValidateResponseAlias> $validateResponseAlias;

    public ThreeDs20Info$continueChallenge$2$1(C19340c<? super ValidateResponseAlias> cVar, Ref$ObjectRef<ValidateResponseAlias> ref$ObjectRef) {
        this.$continuation = cVar;
        this.$validateResponseAlias = ref$ObjectRef;
    }

    public final void onValidated(Context context, ValidateResponse validateResponse, String str) {
        C19340c<ValidateResponseAlias> cVar = this.$continuation;
        Ref$ObjectRef<ValidateResponseAlias> ref$ObjectRef = this.$validateResponseAlias;
        CardinalActionCode actionCode = validateResponse.getActionCode();
        T validateResponseAlias = new ValidateResponseAlias(actionCode == null ? null : actionCode.getString(), validateResponse.getErrorNumber(), validateResponse.getErrorDescription());
        ref$ObjectRef.element = validateResponseAlias;
        cVar.resumeWith(Result.m35480constructorimpl(validateResponseAlias));
    }
}
