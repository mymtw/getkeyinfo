package com.paypal.pyplcheckout.addcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.utils.CardValidationUtilKt;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addcard.AddCardViewModel$addCard$1", mo70541f = "AddCardViewModel.kt", mo70542l = {135}, mo70543m = "invokeSuspend")
public final class AddCardViewModel$addCard$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ AppCompatActivity $activity;
    public final /* synthetic */ String $cardNumber;
    public final /* synthetic */ String $csc;
    public final /* synthetic */ String $expiry;
    public final /* synthetic */ String $zipCode;
    public int label;
    public final /* synthetic */ AddCardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardViewModel$addCard$1(AddCardViewModel addCardViewModel, String str, AppCompatActivity appCompatActivity, String str2, String str3, String str4, C19340c<? super AddCardViewModel$addCard$1> cVar) {
        super(2, cVar);
        this.this$0 = addCardViewModel;
        this.$expiry = str;
        this.$activity = appCompatActivity;
        this.$cardNumber = str2;
        this.$csc = str3;
        this.$zipCode = str4;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddCardViewModel$addCard$1(this.this$0, this.$expiry, this.$activity, this.$cardNumber, this.$csc, this.$zipCode, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddCardViewModel$addCard$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.this$0.events.fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.TRUE));
            this.this$0.handleNameError();
            Pair<String, String> splitExpiration = CardValidationUtilKt.splitExpiration(this.$expiry);
            AddCardUseCase access$getAddCardUseCase$p = this.this$0.addCardUseCase;
            AppCompatActivity appCompatActivity = this.$activity;
            String str = this.$cardNumber;
            String str2 = this.$csc;
            String str3 = this.$zipCode;
            this.label = 1;
            obj2 = access$getAddCardUseCase$p.m35155invokebMdYcbs(appCompatActivity, str, splitExpiration.component1(), splitExpiration.component2(), str2, str3, this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            obj2 = ((Result) obj).m35488unboximpl();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Result.m35486isSuccessimpl(obj2)) {
            if (Result.m35485isFailureimpl(obj2)) {
                obj2 = null;
            }
            FundingInstrument fundingInstrument = (FundingInstrument) obj2;
            if (fundingInstrument == null) {
                return C19394m.f43287a;
            }
            this.this$0.handleAddCardSuccess(fundingInstrument);
            this.this$0.showEmptyState();
        } else {
            Throwable r12 = Result.m35483exceptionOrNullimpl(obj2);
            if (r12 == null) {
                return C19394m.f43287a;
            }
            this.this$0.handleAddCardErrors(r12, this.$activity);
        }
        return C19394m.f43287a;
    }
}
