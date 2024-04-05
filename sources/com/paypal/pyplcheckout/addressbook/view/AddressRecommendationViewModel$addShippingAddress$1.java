package com.paypal.pyplcheckout.addressbook.view;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewState;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import com.paypal.pyplcheckout.utils.Result;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewModel$addShippingAddress$1", mo70541f = "AddressRecommendationViewModel.kt", mo70542l = {38}, mo70543m = "invokeSuspend")
public final class AddressRecommendationViewModel$addShippingAddress$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ PortableShippingAddressRequest $portableShippingAddressRequest;
    public int label;
    public final /* synthetic */ AddressRecommendationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressRecommendationViewModel$addShippingAddress$1(AddressRecommendationViewModel addressRecommendationViewModel, PortableShippingAddressRequest portableShippingAddressRequest, C19340c<? super AddressRecommendationViewModel$addShippingAddress$1> cVar) {
        super(2, cVar);
        this.this$0 = addressRecommendationViewModel;
        this.$portableShippingAddressRequest = portableShippingAddressRequest;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressRecommendationViewModel$addShippingAddress$1(this.this$0, this.$portableShippingAddressRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddressRecommendationViewModel$addShippingAddress$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            AddShippingUseCase access$getAddShippingUseCase$p = this.this$0.addShippingUseCase;
            PortableShippingAddressRequest portableShippingAddressRequest = this.$portableShippingAddressRequest;
            this.label = 1;
            obj = access$getAddShippingUseCase$p.invoke(portableShippingAddressRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            Result.Success success = (Result.Success) result;
            if (((List) success.getValue()) != null) {
                this.this$0._addressRecommendationViewState.postValue(new AddressRecommendationViewState.ShowSuccessfulAddAddressState((List) success.getValue()));
            }
        } else if (result instanceof Result.Error) {
            this.this$0._addressRecommendationViewState.postValue(AddressRecommendationViewState.ShowErrorState.INSTANCE);
        }
        return C19394m.f43287a;
    }
}
