package com.paypal.pyplcheckout.threeds.usecase;

import android.app.Activity;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.PaymentContingencies;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.ThreeDSState;
import com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19656n1;

public final class StartAddCardThreeDsUseCase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "StartAddCardThreeDsUseCase";
    private final Repository repository;
    private final C19525d0 scope;
    private final C19285c state$delegate = C19350d.m32677b(StartAddCardThreeDsUseCase$state$2.INSTANCE);
    /* access modifiers changed from: private */
    public final ThreeDSUseCase threeDSUseCase;
    private C19699g1 threeDsJob;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StartAddCardThreeDsUseCase(Repository repository2, ThreeDSUseCase threeDSUseCase2, C19525d0 d0Var) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(threeDSUseCase2, "threeDSUseCase");
        C19383o.m32797g(d0Var, "scope");
        this.repository = repository2;
        this.threeDSUseCase = threeDSUseCase2;
        this.scope = d0Var;
    }

    private final C19699g1 emitState(AddCardThreeDsState addCardThreeDsState) {
        return C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new StartAddCardThreeDsUseCase$emitState$1(this, addCardThreeDsState, (C19340c<? super StartAddCardThreeDsUseCase$emitState$1>) null), 3);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchCheckoutSession(java.lang.String r20, kotlin.coroutines.C19340c<? super kotlin.C19394m> r21) throws java.lang.Exception {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$fetchCheckoutSession$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$fetchCheckoutSession$1 r2 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$fetchCheckoutSession$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$fetchCheckoutSession$1 r2 = new com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$fetchCheckoutSession$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x004b
            if (r4 == r7) goto L_0x003f
            if (r4 != r6) goto L_0x0037
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.L$0
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase r2 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r2.L$0
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase r8 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0065
        L_0x004b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            kotlinx.coroutines.flow.n1 r1 = r19.getState()
            com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState$Loading r4 = com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState.Loading.INSTANCE
            r2.L$0 = r0
            r8 = r20
            r2.L$1 = r8
            r2.label = r7
            java.lang.Object r1 = com.paypal.pyplcheckout.extensions.FlowExtensionsKt.emitOnce(r1, r4, r2)
            if (r1 != r3) goto L_0x0063
            return r3
        L_0x0063:
            r4 = r8
            r8 = r0
        L_0x0065:
            com.paypal.pyplcheckout.common.instrumentation.PLog r1 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.UPDATE_CHECKOUT_SESSION_FUNDING_OPTIONS_ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r12 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E629
            r14 = 0
            r15 = 32
            r16 = 0
            java.lang.String r13 = "update checkout session funding options attempted"
            com.paypal.pyplcheckout.common.instrumentation.PLog.status$default(r9, r10, r11, r12, r13, r14, r15, r16)
            com.paypal.pyplcheckout.services.Repository r1 = r8.repository
            r2.L$0 = r8
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = r1.updateCheckoutSessionFundingOptions(r4, r5, r2)
            if (r1 != r3) goto L_0x0088
            return r3
        L_0x0088:
            r3 = r4
            r2 = r8
        L_0x008a:
            com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptionsResponse r1 = (com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptionsResponse) r1
            com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptionsData r1 = r1.getData()
            r4 = 0
            if (r1 != 0) goto L_0x0095
            r1 = r4
            goto L_0x0099
        L_0x0095:
            com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptions r1 = r1.getUpdateCheckoutSessionFundingOptions()
        L_0x0099:
            if (r1 != 0) goto L_0x009c
            goto L_0x00a0
        L_0x009c:
            com.paypal.pyplcheckout.pojo.PaymentContingencies r4 = r1.getPaymentContingencies()
        L_0x00a0:
            if (r4 == 0) goto L_0x00e0
            java.util.List r4 = r1.getFundingOptions()
            if (r4 == 0) goto L_0x00ae
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00af
        L_0x00ae:
            r5 = r7
        L_0x00af:
            if (r5 != 0) goto L_0x00e0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.UPDATE_CHECKOUT_SESSION_FUNDING_OPTIONS_RESPONSE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            r8 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1972(0x7b4, float:2.763E-42)
            r18 = 0
            java.lang.String r12 = "update checkout session funding options success"
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.paypal.pyplcheckout.services.Repository r4 = r2.repository
            com.paypal.pyplcheckout.pojo.PaymentContingencies r5 = r1.getPaymentContingencies()
            r4.setSupportedContingencies(r5)
            com.paypal.pyplcheckout.services.Repository r4 = r2.repository
            java.util.List r1 = r1.getFundingOptions()
            r4.setFundingOptions(r1)
            r2.setSelectedFundingOption(r3)
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x00e0:
            com.paypal.pyplcheckout.common.instrumentation.PLog r2 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E608
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.NATIVE_ADD_CARD
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.UPDATE_CHECKOUT_SESSION_FUNDING_OPTIONS_RESPONSE
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 1944(0x798, float:2.724E-42)
            r15 = 0
            java.lang.String r5 = "invalid response from updateCheckoutSessionFundingOptions"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "invalid response from updateCheckoutSessionFundingOptions: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase.fetchCheckoutSession(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C19656n1<AddCardThreeDsState> getState() {
        return (C19656n1) this.state$delegate.getValue();
    }

    private final boolean isFinalState(ThreeDSState threeDSState) {
        return (threeDSState instanceof ThreeDSState.Finished) || (threeDSState instanceof ThreeDSState.Error);
    }

    private final void launchThreeDs(Activity activity) {
        this.threeDsJob = C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new StartAddCardThreeDsUseCase$launchThreeDs$1(this, activity, (C19340c<? super StartAddCardThreeDsUseCase$launchThreeDs$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void onThreeDsState(ThreeDSState threeDSState) {
        C19699g1 g1Var;
        if (threeDSState.getSource() == ThreeDSSource.ADD_CARD) {
            boolean z = true;
            if (!(threeDSState instanceof ThreeDSState.Started)) {
                z = threeDSState instanceof ThreeDSState.Loading;
            }
            if (z) {
                emitState(AddCardThreeDsState.ResolvingThreeDs.INSTANCE);
            } else if (threeDSState instanceof ThreeDSState.Finished) {
                this.repository.setSupportedContingencies((PaymentContingencies) null);
                emitState(AddCardThreeDsState.Success.INSTANCE);
            } else if (threeDSState instanceof ThreeDSState.Error) {
                emitState(new AddCardThreeDsState.Error(new AddCardThreeDsException("Error starting ThreeDs flow")));
            } else if (threeDSState instanceof ThreeDSState.None) {
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                PLog.i$default(str, "ThreeDSState NONE on StartAddThreeDsUseCase", 0, 4, (Object) null);
            }
            if (isFinalState(threeDSState) && (g1Var = this.threeDsJob) != null) {
                g1Var.mo72134a((CancellationException) null);
            }
        }
    }

    private final void setSelectedFundingOption(String str) {
        List<FundingOption> fundingOptions = this.repository.getFundingOptions();
        T t = null;
        if (fundingOptions != null) {
            Iterator<T> it = fundingOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C19383o.m32792b(((FundingOption) next).getFundingInstrument().getId(), str)) {
                    t = next;
                    break;
                }
            }
            t = (FundingOption) t;
        }
        if (t == null) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            PLog.e$default(str2, "No matching Funding Option for " + str, (Throwable) null, 0, 12, (Object) null);
            return;
        }
        this.repository.setSelectedFundingOption((FundingOption) t);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object startThreeDsFlow(android.app.Activity r5, java.lang.String r6, kotlin.coroutines.C19340c<? super kotlin.C19394m> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$startThreeDsFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$startThreeDsFlow$1 r0 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$startThreeDsFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$startThreeDsFlow$1 r0 = new com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$startThreeDsFlow$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r6 = r0.L$0
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase r6 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x002f }
            goto L_0x004a
        L_0x002f:
            r5 = move-exception
            goto L_0x0050
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            r0.L$0 = r4     // Catch:{ Exception -> 0x004e }
            r0.L$1 = r5     // Catch:{ Exception -> 0x004e }
            r0.label = r3     // Catch:{ Exception -> 0x004e }
            java.lang.Object r6 = r4.fetchCheckoutSession(r6, r0)     // Catch:{ Exception -> 0x004e }
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r6 = r4
        L_0x004a:
            r6.launchThreeDs(r5)     // Catch:{ Exception -> 0x002f }
            goto L_0x0058
        L_0x004e:
            r5 = move-exception
            r6 = r4
        L_0x0050:
            com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState$Error r7 = new com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState$Error
            r7.<init>(r5)
            r6.emitState(r7)
        L_0x0058:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase.startThreeDsFlow(android.app.Activity, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(android.app.Activity r5, java.lang.String r6, kotlin.coroutines.C19340c<? super kotlinx.coroutines.flow.C19689x1<? extends com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$invoke$1 r0 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$invoke$1 r0 = new com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$invoke$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase r5 = (com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            kotlinx.coroutines.flow.n1 r7 = r4.getState()
            com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState$Loading r2 = com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState.Loading.INSTANCE
            r7.mo72331a(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.startThreeDsFlow(r5, r6, r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r5 = r4
        L_0x004b:
            kotlinx.coroutines.flow.n1 r5 = r5.getState()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase.invoke(android.app.Activity, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
