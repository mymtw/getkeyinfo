package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1", mo70541f = "SplitLoginHandler.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1 */
public final class SplitLoginHandler$handleChallenge$result$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19747k<ChallengeResult> $cancellableContinuation;
    public final /* synthetic */ C2895z<ChallengeResult> $mutableLiveData;
    public int label;
    public final /* synthetic */ SplitLoginHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginHandler$handleChallenge$result$1$1(C2895z<ChallengeResult> zVar, C19747k<? super ChallengeResult> kVar, SplitLoginHandler splitLoginHandler, C19340c<? super SplitLoginHandler$handleChallenge$result$1$1> cVar) {
        super(2, cVar);
        this.$mutableLiveData = zVar;
        this.$cancellableContinuation = kVar;
        this.this$0 = splitLoginHandler;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginHandler$handleChallenge$result$1$1(this.$mutableLiveData, this.$cancellableContinuation, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginHandler$handleChallenge$result$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C2895z<ChallengeResult> zVar = this.$mutableLiveData;
            final C19747k<ChallengeResult> kVar = this.$cancellableContinuation;
            final SplitLoginHandler splitLoginHandler = this.this$0;
            zVar.observeForever(new C2843a0() {

                @C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1$1$2", mo70541f = "SplitLoginHandler.kt", mo70542l = {117}, mo70543m = "invokeSuspend")
                /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1$1$2 */
                public static final class C171142 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return new C171142(partnerAuthEngine, challengeResult, kVar2, cVar);
                    }

                    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                        return ((C171142) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
                        if (kotlin.text.C19457k.m33019W0(r1.getError().getReason().getMessage(), com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt.BACK_PRESS, false) != false) goto L_0x0075;
                     */
                    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                        /*
                            r4 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r4.label
                            r2 = 1
                            if (r1 == 0) goto L_0x0015
                            if (r1 != r2) goto L_0x000d
                            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
                            goto L_0x0039
                        L_0x000d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r0)
                            throw r5
                        L_0x0015:
                            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
                            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine r5 = r0
                            java.util.Map<com.paypal.android.platform.authsdk.authcommon.ChallengeType, com.paypal.android.platform.authsdk.authcommon.ChallengeHandler> r5 = r5.f37645a
                            com.paypal.android.platform.authsdk.authcommon.ChallengeType r1 = com.paypal.android.platform.authsdk.authcommon.ChallengeType.OTPLogin
                            java.lang.Object r5 = r5.get(r1)
                            com.paypal.android.platform.authsdk.authcommon.ChallengeHandler r5 = (com.paypal.android.platform.authsdk.authcommon.ChallengeHandler) r5
                            if (r5 != 0) goto L_0x0028
                            r5 = 0
                            goto L_0x003b
                        L_0x0028:
                            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r1 = r6
                            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r1 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult.UnHandled) r1
                            com.paypal.android.platform.authsdk.authcommon.Challenge r1 = r1.getChallenge()
                            r4.label = r2
                            java.lang.Object r5 = r5.handleChallenge(r1, r4)
                            if (r5 != r0) goto L_0x0039
                            return r0
                        L_0x0039:
                            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r5 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r5
                        L_0x003b:
                            if (r5 != 0) goto L_0x003e
                            goto L_0x0075
                        L_0x003e:
                            kotlinx.coroutines.k<com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r0 = r3
                            boolean r1 = r5 instanceof com.paypal.android.platform.authsdk.authcommon.ChallengeResult.Failed
                            if (r1 == 0) goto L_0x0067
                            r1 = r5
                            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r1 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult.Failed) r1
                            com.paypal.android.platform.authsdk.authcommon.ChallengeError r2 = r1.getError()
                            java.lang.Error r2 = r2.getReason()
                            if (r2 == 0) goto L_0x0067
                            com.paypal.android.platform.authsdk.authcommon.ChallengeError r1 = r1.getError()
                            java.lang.Error r1 = r1.getReason()
                            java.lang.String r1 = r1.getMessage()
                            r2 = 0
                            java.lang.String r3 = "backpress"
                            boolean r1 = kotlin.text.C19457k.m33019W0(r1, r3, r2)
                            if (r1 == 0) goto L_0x0067
                            goto L_0x0075
                        L_0x0067:
                            boolean r1 = r0.mo72498f()
                            if (r1 != 0) goto L_0x0075
                            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1$1$2$1$1 r1 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1$1$2$1$1
                            r1.<init>(r5)
                            r0.mo72503v(r1, r5)
                        L_0x0075:
                            kotlin.m r5 = kotlin.C19394m.f43287a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler$handleChallenge$result$1$1.C171121.C171142.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                public final void onChanged(final ChallengeResult challengeResult) {
                    if (challengeResult instanceof ChallengeResult.Failed) {
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
                    } else if (challengeResult instanceof ChallengeResult.UnHandled) {
                        final PartnerAuthEngine partnerAuthEngine = (PartnerAuthEngine) splitLoginHandler.authCoreComponent.getChallengeRegistry();
                        C19525d0 scope = splitLoginHandler.getScope();
                        final C19747k<ChallengeResult> kVar2 = kVar;
                        C19697g.m33468f(scope, (CoroutineContext) null, (CoroutineStart) null, new C171142((C19340c<? super C171142>) null), 3);
                    } else if ((challengeResult instanceof ChallengeResult.Completed) && !kVar.mo72498f()) {
                        C19747k<ChallengeResult> kVar3 = kVar;
                        C19383o.m32796f(challengeResult, "challengeResult");
                        kVar3.mo72503v(new C19857l<Throwable, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Throwable) obj);
                                return C19394m.f43287a;
                            }

                            public final void invoke(Throwable th) {
                                C19383o.m32797g(th, "error");
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
