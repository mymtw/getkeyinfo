package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p716xo.C18829b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$onCreateView$3", mo70541f = "OtpPhoneFragment.kt", mo70542l = {133}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$onCreateView$3 */
public final class OtpPhoneFragment$onCreateView$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpPhoneFragment this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$onCreateView$3$1", mo70541f = "OtpPhoneFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$onCreateView$3$1 */
    public static final class C170901 extends SuspendLambda implements C19861p<OtpPhoneViewState, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C170901 r0 = new C170901(otpPhoneFragment, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(OtpPhoneViewState otpPhoneViewState, C19340c<? super C19394m> cVar) {
            return ((C170901) create(otpPhoneViewState, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                OtpPhoneViewState otpPhoneViewState = (OtpPhoneViewState) this.L$0;
                if (otpPhoneViewState instanceof OtpPhoneViewState.Ready) {
                    otpPhoneFragment.handleReady((OtpPhoneViewState.Ready) otpPhoneViewState);
                } else if (otpPhoneViewState instanceof OtpPhoneViewState.Loading) {
                    otpPhoneFragment.handleLoading((OtpPhoneViewState.Loading) otpPhoneViewState);
                } else if (otpPhoneViewState instanceof OtpPhoneViewState.Error) {
                    otpPhoneFragment.handleError((OtpPhoneViewState.Error) otpPhoneViewState);
                } else if (!(otpPhoneViewState instanceof OtpPhoneViewState.Back)) {
                    if (otpPhoneViewState instanceof OtpPhoneViewState.AlternateLogin) {
                        if (((OtpPhoneViewState.AlternateLogin) otpPhoneViewState).getShowErrorScreen()) {
                            OtpErrorFragment.Companion companion = OtpErrorFragment.Companion;
                            C18829b access$getAuthHandlerProviders$p = otpPhoneFragment.authHandlerProviders;
                            if (access$getAuthHandlerProviders$p != null) {
                                Challenge access$getChallenge$p = otpPhoneFragment.challenge;
                                if (access$getChallenge$p != null) {
                                    OtpErrorFragment fragment = companion.getFragment(access$getAuthHandlerProviders$p, access$getChallenge$p, otpPhoneFragment.challengeResultLiveData);
                                    C18829b access$getAuthHandlerProviders$p2 = otpPhoneFragment.authHandlerProviders;
                                    if (access$getAuthHandlerProviders$p2 != null) {
                                        access$getAuthHandlerProviders$p2.getAuthProviders().getAuthPresenter().onViewPresentRequested(fragment, false);
                                    } else {
                                        C19383o.m32805o("authHandlerProviders");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("challenge");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("authHandlerProviders");
                                throw null;
                            }
                        } else {
                            C2895z access$getChallengeResultLiveData$p = otpPhoneFragment.challengeResultLiveData;
                            Challenge access$getChallenge$p2 = otpPhoneFragment.challenge;
                            if (access$getChallenge$p2 != null) {
                                access$getChallengeResultLiveData$p.postValue(new ChallengeResult.Failed(access$getChallenge$p2.getRequestId(), new ChallengeError.Failure(new Error("triggeredWebAuth"))));
                            } else {
                                C19383o.m32805o("challenge");
                                throw null;
                            }
                        }
                    } else if (!(otpPhoneViewState instanceof OtpPhoneViewState.GetCode)) {
                        boolean z = otpPhoneViewState instanceof OtpPhoneViewState.Close;
                    }
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneFragment$onCreateView$3(OtpPhoneFragment otpPhoneFragment, C19340c<? super OtpPhoneFragment$onCreateView$3> cVar) {
        super(2, cVar);
        this.this$0 = otpPhoneFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneFragment$onCreateView$3(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneFragment$onCreateView$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<OtpPhoneViewState> viewStateFlow = this.this$0.getViewModel().getViewStateFlow();
            final OtpPhoneFragment otpPhoneFragment = this.this$0;
            C170901 r1 = new C170901((C19340c<? super C170901>) null);
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
