package com.paypal.pyplcheckout.addressbook.viewmodel;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.addressbook.AddressReviewState;
import com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addressbook.viewmodel.AddressReviewViewModel$validateAndAddAddress$1", mo70541f = "AddressReviewViewModel.kt", mo70542l = {29}, mo70543m = "invokeSuspend")
public final class AddressReviewViewModel$validateAndAddAddress$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ PortableShippingAddressRequest $portableShippingAddressRequest;
    public int label;
    public final /* synthetic */ AddressReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressReviewViewModel$validateAndAddAddress$1(AddressReviewViewModel addressReviewViewModel, PortableShippingAddressRequest portableShippingAddressRequest, C19340c<? super AddressReviewViewModel$validateAndAddAddress$1> cVar) {
        super(2, cVar);
        this.this$0 = addressReviewViewModel;
        this.$portableShippingAddressRequest = portableShippingAddressRequest;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressReviewViewModel$validateAndAddAddress$1(this.this$0, this.$portableShippingAddressRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddressReviewViewModel$validateAndAddAddress$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.this$0._addressReviewState.postValue(AddressReviewState.Loading.INSTANCE);
            ValidateAndAddAddressUseCase access$getValidateAndAddAddress$p = this.this$0.validateAndAddAddress;
            PortableShippingAddressRequest portableShippingAddressRequest = this.$portableShippingAddressRequest;
            this.label = 1;
            obj = access$getValidateAndAddAddress$p.invoke(portableShippingAddressRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0._addressReviewState.postValue(this.this$0.toAddressReviewState((ValidateAndAddAddressUseCase.AddAddressResult) obj));
        return C19394m.f43287a;
    }
}
