package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import android.util.Log;
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

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$addUriChallengeEvents$1", mo70541f = "SplitLoginFragment.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$addUriChallengeEvents$1 */
public final class SplitLoginFragment$addUriChallengeEvents$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ SplitLoginFragment this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$addUriChallengeEvents$1$1", mo70541f = "SplitLoginFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$addUriChallengeEvents$1$1 */
    public static final class C171081 extends SuspendLambda implements C19861p<Pair<? extends String, ? extends String>, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C171081 r0 = new C171081(splitLoginFragment, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Pair<String, String> pair, C19340c<? super C19394m> cVar) {
            return ((C171081) create(pair, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                Pair pair = (Pair) this.L$0;
                Log.e("Observe eventFlow", "yes");
                SplitLoginViewModel viewModel = splitLoginFragment.getViewModel();
                Challenge access$getChallenge$p = splitLoginFragment.challenge;
                if (access$getChallenge$p != null) {
                    viewModel.onHandleUriChallenge$auth_sdk_thirdPartyRelease(access$getChallenge$p.getRequestId(), (String) pair.getFirst(), (String) pair.getSecond());
                    return C19394m.f43287a;
                }
                C19383o.m32805o("challenge");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginFragment$addUriChallengeEvents$1(SplitLoginFragment splitLoginFragment, C19340c<? super SplitLoginFragment$addUriChallengeEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginFragment$addUriChallengeEvents$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginFragment$addUriChallengeEvents$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<Pair<String, String>> uriChallengeEventFlow = this.this$0.getViewModel().getUriChallengeEventFlow();
            final SplitLoginFragment splitLoginFragment = this.this$0;
            C171081 r1 = new C171081((C19340c<? super C171081>) null);
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
