package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.PhoneNumberViewState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment$setup$3", mo70541f = "OtpLoginFragment.kt", mo70542l = {191}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment$setup$3 */
public final class OtpLoginFragment$setup$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpLoginFragment this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment$setup$3$1", mo70541f = "OtpLoginFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment$setup$3$1 */
    public static final class C170831 extends SuspendLambda implements C19861p<PhoneNumberViewState, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C170831 r0 = new C170831(otpLoginFragment, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PhoneNumberViewState phoneNumberViewState, C19340c<? super C19394m> cVar) {
            return ((C170831) create(phoneNumberViewState, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                PhoneNumberViewState phoneNumberViewState = (PhoneNumberViewState) this.L$0;
                if (C19383o.m32792b(phoneNumberViewState, PhoneNumberViewState.Loading.INSTANCE)) {
                    otpLoginFragment.bindLoadingView();
                } else if (phoneNumberViewState instanceof PhoneNumberViewState.SinglePhoneNumber) {
                    otpLoginFragment.bindPhoneNumberText((PhoneNumberViewState.SinglePhoneNumber) phoneNumberViewState);
                } else if (phoneNumberViewState instanceof PhoneNumberViewState.MultiplePhoneNumbers) {
                    otpLoginFragment.bindMultiplePhoneNumbersText((PhoneNumberViewState.MultiplePhoneNumbers) phoneNumberViewState);
                } else if (!(phoneNumberViewState instanceof PhoneNumberViewState.Error) && (phoneNumberViewState instanceof PhoneNumberViewState.AlternateLogin)) {
                    otpLoginFragment.launchGenericErrorFragment();
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpLoginFragment$setup$3(OtpLoginFragment otpLoginFragment, C19340c<? super OtpLoginFragment$setup$3> cVar) {
        super(2, cVar);
        this.this$0 = otpLoginFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpLoginFragment$setup$3(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpLoginFragment$setup$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<PhoneNumberViewState> viewStateFlow = this.this$0.getViewModel().getViewStateFlow();
            final OtpLoginFragment otpLoginFragment = this.this$0;
            C170831 r1 = new C170831((C19340c<? super C170831>) null);
            this.label = 1;
            if (C0761x.m1667G(viewStateFlow, r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
