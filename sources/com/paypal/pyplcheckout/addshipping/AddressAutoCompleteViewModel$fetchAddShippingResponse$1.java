package com.paypal.pyplcheckout.addshipping;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteResponse;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.Repository;
import java.io.IOException;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$fetchAddShippingResponse$1", mo70541f = "AddressAutoCompleteViewModel.kt", mo70542l = {99}, mo70543m = "invokeSuspend")
public final class AddressAutoCompleteViewModel$fetchAddShippingResponse$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ AddressAutoCompleteRequest $request;
    public int label;
    public final /* synthetic */ AddressAutoCompleteViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAutoCompleteViewModel$fetchAddShippingResponse$1(AddressAutoCompleteViewModel addressAutoCompleteViewModel, AddressAutoCompleteRequest addressAutoCompleteRequest, C19340c<? super AddressAutoCompleteViewModel$fetchAddShippingResponse$1> cVar) {
        super(2, cVar);
        this.this$0 = addressAutoCompleteViewModel;
        this.$request = addressAutoCompleteRequest;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressAutoCompleteViewModel$fetchAddShippingResponse$1(this.this$0, this.$request, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddressAutoCompleteViewModel$fetchAddShippingResponse$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PLog.decision$default(PEnums.TransitionName.AUTO_ADDRESS_ATTEMPTED, PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
            Repository access$getRepository$p = this.this$0.repository;
            AddressAutoCompleteRequest addressAutoCompleteRequest = this.$request;
            this.label = 1;
            obj2 = access$getRepository$p.getAddressAutoComplete(addressAutoCompleteRequest, this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
                obj2 = obj;
            } catch (IOException e) {
                PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
                PEnums.EventCode eventCode = PEnums.EventCode.E623;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                PLog.error$default(errorType, eventCode, message, (String) null, e, PEnums.TransitionName.AUTO_ADDRESS_FAILED, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1992, (Object) null);
                this.this$0.instrumentError(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PLog.decision$default(PEnums.TransitionName.AUTO_ADDRESS_SUCCESS, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
        this.this$0._autoCompleteAddShippingResponse.postValue(new Pair(this.$request.getInput(), (AddressAutoCompleteResponse) obj2));
        return C19394m.f43287a;
    }
}
