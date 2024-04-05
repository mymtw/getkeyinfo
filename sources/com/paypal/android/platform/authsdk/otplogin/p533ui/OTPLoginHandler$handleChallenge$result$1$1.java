package com.paypal.android.platform.authsdk.otplogin.p533ui;

import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2895z;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationState;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19747k;
import okhttp3.C20018z;
import p716xo.C18834f;
import p732zo.C18973a;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$result$1$1", mo70541f = "OTPLoginHandler.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$result$1$1 */
public final class OTPLoginHandler$handleChallenge$result$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19747k<ChallengeResult> $cancellableContinuation;
    public final /* synthetic */ Challenge $challenge;
    public final /* synthetic */ Ref$BooleanRef $endFlow;
    public final /* synthetic */ C2895z<ChallengeResult> $mutableLiveData;
    public final /* synthetic */ OTPLoginData $otpLoginInput;
    public int label;
    public final /* synthetic */ OTPLoginHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OTPLoginHandler$handleChallenge$result$1$1(C2895z<ChallengeResult> zVar, Ref$BooleanRef ref$BooleanRef, OTPLoginHandler oTPLoginHandler, OTPLoginData oTPLoginData, Challenge challenge, C19747k<? super ChallengeResult> kVar, C19340c<? super OTPLoginHandler$handleChallenge$result$1$1> cVar) {
        super(2, cVar);
        this.$mutableLiveData = zVar;
        this.$endFlow = ref$BooleanRef;
        this.this$0 = oTPLoginHandler;
        this.$otpLoginInput = oTPLoginData;
        this.$challenge = challenge;
        this.$cancellableContinuation = kVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OTPLoginHandler$handleChallenge$result$1$1(this.$mutableLiveData, this.$endFlow, this.this$0, this.$otpLoginInput, this.$challenge, this.$cancellableContinuation, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OTPLoginHandler$handleChallenge$result$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C2895z<ChallengeResult> zVar = this.$mutableLiveData;
            final Ref$BooleanRef ref$BooleanRef = this.$endFlow;
            final OTPLoginHandler oTPLoginHandler = this.this$0;
            final OTPLoginData oTPLoginData = this.$otpLoginInput;
            final Challenge challenge = this.$challenge;
            final C19747k<ChallengeResult> kVar = this.$cancellableContinuation;
            zVar.observeForever(new C2843a0() {
                public final void onChanged(ChallengeResult challengeResult) {
                    Error reason;
                    Ref$BooleanRef ref$BooleanRef = ref$BooleanRef;
                    ref$BooleanRef.element = false;
                    if (challengeResult instanceof ChallengeResult.Completed) {
                        ref$BooleanRef.element = true;
                        oTPLoginHandler.tokenStore.f41705a = ((ChallengeResult.Completed) challengeResult).getData().getUserAccessToken();
                        C18834f access$getTokenStore$p = oTPLoginHandler.tokenStore;
                        AuthenticationState authenticationState = AuthenticationState.LoggedIn;
                        access$getTokenStore$p.getClass();
                        C19383o.m32797g(authenticationState, "<set-?>");
                        access$getTokenStore$p.f41706b = authenticationState;
                    } else if ((challengeResult instanceof ChallengeResult.Failed) && (reason = ((ChallengeResult.Failed) challengeResult).getError().getReason()) != null) {
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        if (C19383o.m32792b(reason.getMessage(), "triggeredWebAuth")) {
                            ref$BooleanRef2.element = true;
                        }
                    }
                    if (challengeResult instanceof ChallengeResult.UnHandled) {
                        C2895z zVar = new C2895z();
                        OTPLoginData oTPLoginData = (OTPLoginData) new C16708i().mo59458e(OTPLoginData.class, ((Challenge.OTPLogin) ((ChallengeResult.UnHandled) challengeResult).getChallenge()).getJsonInput());
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        if (oTPLoginData.isOtpSent() || oTPLoginHandler.isAutoSMSEnabled(oTPLoginData)) {
                            OTPLoginHandler oTPLoginHandler = oTPLoginHandler;
                            OTPLoginData oTPLoginData2 = oTPLoginData;
                            C19383o.m32796f(oTPLoginData2, "otpLoginInput");
                            ref$ObjectRef.element = oTPLoginHandler.returnOTPPhoneFragment(oTPLoginData2, challenge, zVar);
                        }
                        final Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                        final OTPLoginHandler oTPLoginHandler2 = oTPLoginHandler;
                        final C19747k<ChallengeResult> kVar = kVar;
                        zVar.observeForever(new C2843a0() {
                            public final void onChanged(final ChallengeResult challengeResult) {
                                Error reason;
                                Ref$BooleanRef ref$BooleanRef = ref$BooleanRef3;
                                ref$BooleanRef.element = false;
                                if (challengeResult instanceof ChallengeResult.Completed) {
                                    ref$BooleanRef.element = true;
                                    ChallengeResult.Completed completed = (ChallengeResult.Completed) challengeResult;
                                    oTPLoginHandler2.tokenStore.f41705a = completed.getData().getUserAccessToken();
                                    C18834f access$getTokenStore$p = oTPLoginHandler2.tokenStore;
                                    AuthenticationState authenticationState = AuthenticationState.LoggedIn;
                                    access$getTokenStore$p.getClass();
                                    C19383o.m32797g(authenticationState, "<set-?>");
                                    access$getTokenStore$p.f41706b = authenticationState;
                                    String riskVisitorId = completed.getData().getRiskVisitorId();
                                    if (riskVisitorId != null) {
                                        new C18973a(oTPLoginHandler2.context).encryptAndAddToPreference("riskVisitorId", riskVisitorId);
                                    }
                                } else if ((challengeResult instanceof ChallengeResult.Failed) && (reason = ((ChallengeResult.Failed) challengeResult).getError().getReason()) != null) {
                                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef3;
                                    if (C19383o.m32792b(reason.getMessage(), "triggeredWebAuth")) {
                                        ref$BooleanRef2.element = true;
                                    }
                                }
                                if (challengeResult instanceof ChallengeResult.Failed) {
                                    ChallengeResult.Failed failed = (ChallengeResult.Failed) challengeResult;
                                    if (failed.getError().getReason() != null && C19457k.m33019W0(failed.getError().getReason().getMessage(), ConstantsKt.BACK_PRESS, false)) {
                                        return;
                                    }
                                }
                                if (!kVar.mo72498f()) {
                                    C19747k<ChallengeResult> kVar = kVar;
                                    C19383o.m32796f(challengeResult, "challengeResult");
                                    kVar.mo72503v(new C19857l<Throwable, C19394m>() {
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((Throwable) obj);
                                            return C19394m.f43287a;
                                        }

                                        public final void invoke(Throwable th) {
                                            C19383o.m32797g(th, "error");
                                        }
                                    }, challengeResult);
                                }
                                Fragment fragment = (Fragment) ref$ObjectRef.element;
                                if (fragment != null) {
                                    OTPLoginHandler oTPLoginHandler = oTPLoginHandler2;
                                    Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef3;
                                    if (FragmentUtils.Companion.isFragmentAlive(fragment)) {
                                        oTPLoginHandler.authProviders.getAuthPresenter().onViewDismissRequested(fragment, ref$BooleanRef3.element);
                                    }
                                }
                            }
                        });
                    } else if (!kVar.mo72498f()) {
                        C19747k<ChallengeResult> kVar2 = kVar;
                        C19383o.m32796f(challengeResult, "challengeResult");
                        final Challenge challenge = challenge;
                        kVar2.mo72503v(new C19857l<Throwable, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Throwable) obj);
                                return C19394m.f43287a;
                            }

                            public final void invoke(Throwable th) {
                                C19383o.m32797g(th, "error");
                                new ChallengeResult.UnHandled(new Challenge.OTPLogin(challenge.getRequestId(), (String) null), "", (ChallengeType) null, (String) null, (C20018z) null, (Object) null, (Error) null, (C19857l) null, 252, (DefaultConstructorMarker) null);
                            }
                        }, challengeResult);
                    }
                }
            });
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
