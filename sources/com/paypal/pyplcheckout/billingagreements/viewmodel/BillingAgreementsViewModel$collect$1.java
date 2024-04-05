package com.paypal.pyplcheckout.billingagreements.viewmodel;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2895z;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementBalancePreference;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19689x1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel$collect$1", mo70541f = "BillingAgreementsViewModel.kt", mo70542l = {174}, mo70543m = "invokeSuspend")
public final class BillingAgreementsViewModel$collect$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ BillingAgreementsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillingAgreementsViewModel$collect$1(BillingAgreementsViewModel billingAgreementsViewModel, C19340c<? super BillingAgreementsViewModel$collect$1> cVar) {
        super(2, cVar);
        this.this$0 = billingAgreementsViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new BillingAgreementsViewModel$collect$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BillingAgreementsViewModel$collect$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19689x1<BillingAgreementState> invoke = this.this$0.billingAgreementsGetTypeUseCase.invoke();
            final BillingAgreementsViewModel billingAgreementsViewModel = this.this$0;
            C172001 r1 = new C19600e() {
                public final Object emit(BillingAgreementState billingAgreementState, C19340c<? super C19394m> cVar) {
                    billingAgreementsViewModel._baPurchaseTextState.postValue(billingAgreementsViewModel.mapPurchaseTextState(billingAgreementState));
                    billingAgreementsViewModel._baInfoHeaderState.postValue(billingAgreementsViewModel.mapInfoHeaderState(billingAgreementState));
                    billingAgreementsViewModel._baTermsState.postValue(billingAgreementsViewModel.mapTermsState(billingAgreementState));
                    C2895z access$get_baToggleState$p = billingAgreementsViewModel._baToggleState;
                    BillingAgreementsViewModel billingAgreementsViewModel = billingAgreementsViewModel;
                    access$get_baToggleState$p.postValue(billingAgreementsViewModel.mapToggleState((BillingAgreementBalancePreference) billingAgreementsViewModel.getBalancePreference().getValue()));
                    billingAgreementsViewModel._baTermsFooterState.postValue(billingAgreementsViewModel.mapTermsFooterState(billingAgreementState));
                    if (billingAgreementsViewModel.shouldFallbackToWeb(billingAgreementState)) {
                        PYPLCheckoutUtils.fallBack$default(billingAgreementsViewModel.pyplCheckoutUtils, "billing agreements", PEnums.FallbackReason.UNSUPPORTED_FLOW, PEnums.FallbackCategory.FEATURE_NOT_SUPPORTED, "Unsupported BA Flow", (PEnums.TransitionName) null, ErrorReason.FEATURE_NOT_SUPPORTED_ERROR, new UnsupportedOperationException("Unsupported BA Flow"), 16, (Object) null);
                    }
                    return C19394m.f43287a;
                }
            };
            this.label = 1;
            if (invoke.collect(r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
