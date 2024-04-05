package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$addUriChallengeEvents$1", mo70541f = "OtpPhoneFragment.kt", mo70542l = {343}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$addUriChallengeEvents$1 */
public final class OtpPhoneFragment$addUriChallengeEvents$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpPhoneFragment this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$addUriChallengeEvents$1$1", mo70541f = "OtpPhoneFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$addUriChallengeEvents$1$1 */
    public static final class C170891 extends SuspendLambda implements C19861p<Pair<? extends String, ? extends String>, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C170891 r0 = new C170891(otpPhoneFragment, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Pair<String, String> pair, C19340c<? super C19394m> cVar) {
            return ((C170891) create(pair, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                Pair pair = (Pair) this.L$0;
                OtpPhoneViewModel access$getViewModel = otpPhoneFragment.getViewModel();
                Challenge access$getChallenge$p = otpPhoneFragment.challenge;
                if (access$getChallenge$p != null) {
                    access$getViewModel.onHandleUriChallenge$auth_sdk_thirdPartyRelease(access$getChallenge$p.getRequestId(), (String) pair.getFirst(), (String) pair.getSecond());
                    return C19394m.f43287a;
                }
                C19383o.m32805o("challenge");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneFragment$addUriChallengeEvents$1(OtpPhoneFragment otpPhoneFragment, C19340c<? super OtpPhoneFragment$addUriChallengeEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = otpPhoneFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneFragment$addUriChallengeEvents$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneFragment$addUriChallengeEvents$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<Pair<String, String>> uriChallengeEventFlow = this.this$0.getViewModel().getUriChallengeEventFlow();
            final OtpPhoneFragment otpPhoneFragment = this.this$0;
            C170891 r1 = new C170891((C19340c<? super C170891>) null);
            this.label = 1;
            if (C0761x.m1667G(uriChallengeEventFlow, r1, this) == coroutineSingletons) {
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
