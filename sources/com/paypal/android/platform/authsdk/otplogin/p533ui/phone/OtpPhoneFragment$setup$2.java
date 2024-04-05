package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$setup$2", mo70541f = "OtpPhoneFragment.kt", mo70542l = {335}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$setup$2 */
public final class OtpPhoneFragment$setup$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpPhoneFragment this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$setup$2$1", mo70541f = "OtpPhoneFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$setup$2$1 */
    public static final class C170921 extends SuspendLambda implements C19861p<ChallengeResult, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C170921 r0 = new C170921(otpPhoneFragment, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ChallengeResult challengeResult, C19340c<? super C19394m> cVar) {
            return ((C170921) create(challengeResult, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                otpPhoneFragment.challengeResultLiveData.postValue((ChallengeResult) this.L$0);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneFragment$setup$2(OtpPhoneFragment otpPhoneFragment, C19340c<? super OtpPhoneFragment$setup$2> cVar) {
        super(2, cVar);
        this.this$0 = otpPhoneFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneFragment$setup$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneFragment$setup$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<ChallengeResult> challengeResultEventFlow = this.this$0.getViewModel().getChallengeResultEventFlow();
            final OtpPhoneFragment otpPhoneFragment = this.this$0;
            C170921 r1 = new C170921((C19340c<? super C170921>) null);
            this.label = 1;
            if (C0761x.m1667G(challengeResultEventFlow, r1, this) == coroutineSingletons) {
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
