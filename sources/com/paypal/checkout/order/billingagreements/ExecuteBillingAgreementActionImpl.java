package com.paypal.checkout.order.billingagreements;

import androidx.appcompat.widget.C0326j;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.Repository;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C19928a0;
import okhttp3.C20009t;
import okhttp3.C20018z;

public final class ExecuteBillingAgreementActionImpl implements ExecuteBillingAgreementAction {
    private final BillingAgreementsRepository billingAgreementsRepository;
    /* access modifiers changed from: private */
    public final CreateLsatTokenAction createLsatTokenAction;
    /* access modifiers changed from: private */
    public final ExecuteBillingAgreementRequestFactory executeBillingAgreementRequestFactory;
    private final C16708i gson;
    private final CoroutineDispatcher ioDispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final Repository repository;

    public ExecuteBillingAgreementActionImpl(BillingAgreementsRepository billingAgreementsRepository2, CreateLsatTokenAction createLsatTokenAction2, ExecuteBillingAgreementRequestFactory executeBillingAgreementRequestFactory2, Repository repository2, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(billingAgreementsRepository2, "billingAgreementsRepository");
        C19383o.m32797g(createLsatTokenAction2, "createLsatTokenAction");
        C19383o.m32797g(executeBillingAgreementRequestFactory2, "executeBillingAgreementRequestFactory");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.billingAgreementsRepository = billingAgreementsRepository2;
        this.createLsatTokenAction = createLsatTokenAction2;
        this.executeBillingAgreementRequestFactory = executeBillingAgreementRequestFactory2;
        this.repository = repository2;
        this.okHttpClient = tVar;
        this.gson = iVar;
        this.ioDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final ExecuteBillingAgreementResult.Error createError(String str, String str2) {
        logError(str, str2);
        return new ExecuteBillingAgreementResult.Error(str, str2);
    }

    public static /* synthetic */ ExecuteBillingAgreementResult.Error createError$default(ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ExecuteBillingAgreementResult.Error.DEFAULT_ERROR_MESSAGE;
        }
        return executeBillingAgreementActionImpl.createError(str, str2);
    }

    /* access modifiers changed from: private */
    public final Object createLsatToken(C19340c<? super String> cVar) {
        return C19697g.m33471i(cVar, this.ioDispatcher, new ExecuteBillingAgreementActionImpl$createLsatToken$2(this, (C19340c<? super ExecuteBillingAgreementActionImpl$createLsatToken$2>) null));
    }

    /* access modifiers changed from: private */
    public final Object fetchBillingAgreementId(String str, String str2, C19340c<? super ExecuteBillingAgreementResult> cVar) {
        return C19697g.m33471i(cVar, this.ioDispatcher, new ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2(this, str, str2, (C19340c<? super ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2>) null));
    }

    private final void logError(String str, String str2) {
        PLog pLog = PLog.INSTANCE;
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E000, str, str2, (Throwable) null, PEnums.TransitionName.BA_EXECUTE_RESPONSE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
    }

    /* access modifiers changed from: private */
    public final ExecuteBillingAgreementResult.Error parseBillingIdError(C20018z zVar) {
        String g;
        ExecuteBillingAgreementResult.Error error;
        C19928a0 a0Var = zVar.f44368i;
        ExecuteBillingAgreementResult.Error error2 = null;
        if (!(a0Var == null || (g = a0Var.mo72844g()) == null)) {
            try {
                Object e = this.gson.mo59458e(GetBillingIdError.class, g);
                C19383o.m32796f(e, "gson.fromJson(bodyString…llingIdError::class.java)");
                GetBillingIdError getBillingIdError = (GetBillingIdError) e;
                String errorName = getBillingIdError.getErrorName();
                if (errorName == null) {
                    errorName = "";
                }
                String message = getBillingIdError.getMessage();
                error = createError(errorName, "Error executing Billing Agreement: " + message);
            } catch (Throwable th) {
                error = createError(ExecuteBillingAgreementResult.Error.ERROR_REASON_BA_ID_FAILED, C0326j.m864i("Error executing Billing Agreement: ", th.getMessage()));
            }
            error2 = error;
        }
        return error2 == null ? createError(ExecuteBillingAgreementResult.Error.ERROR_REASON_BA_ID_FAILED, "Empty error response from the server") : error2;
    }

    /* access modifiers changed from: private */
    public final ExecuteBillingAgreementResult parseBillingIdResponse(C20018z zVar) {
        ExecuteBillingAgreementResult.Success success;
        String g;
        C19928a0 a0Var = zVar.f44368i;
        if (a0Var == null || (g = a0Var.mo72844g()) == null) {
            success = null;
        } else {
            Object e = this.gson.mo59458e(GetBillingIdResponse.class, g);
            C19383o.m32796f(e, "gson.fromJson(bodyString…ngIdResponse::class.java)");
            GetBillingIdResponse getBillingIdResponse = (GetBillingIdResponse) e;
            success = new ExecuteBillingAgreementResult.Success(getBillingIdResponse.getBillingId(), getBillingIdResponse.getState());
        }
        return success == null ? createError$default(this, ExecuteBillingAgreementResult.Error.ERROR_REASON_EMPTY_RESPONSE, (String) null, 2, (Object) null) : success;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[PHI: r7 
      PHI: (r7v7 java.lang.Object) = (r7v10 java.lang.Object), (r7v1 java.lang.Object) binds: [B:29:0x0071, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execute(kotlin.coroutines.C19340c<? super com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$execute$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$execute$1 r0 = (com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$execute$1 r0 = new com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$execute$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r3) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0074
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.L$0
            com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl r3 = (com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x003f }
            goto L_0x0065
        L_0x003f:
            r7 = move-exception
            goto L_0x0077
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository r7 = r6.billingAgreementsRepository
            java.lang.String r7 = r7.getBillingAgreementToken()
            java.lang.String r2 = com.paypal.pyplcheckout.utils.StringExtensionsKt.nullIfNullOrEmpty(r7)
            if (r2 != 0) goto L_0x0057
            java.lang.String r7 = "No Billing Token when trying to execute billing agreement"
            com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult$Error r7 = createError$default(r6, r7, r5, r4, r5)
            return r7
        L_0x0057:
            r0.L$0 = r6     // Catch:{ Exception -> 0x0075 }
            r0.L$1 = r2     // Catch:{ Exception -> 0x0075 }
            r0.label = r3     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r7 = r6.createLsatToken(r0)     // Catch:{ Exception -> 0x0075 }
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r3 = r6
        L_0x0065:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x003f }
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r3.fetchBillingAgreementId(r2, r7, r0)
            if (r7 != r1) goto L_0x0074
            return r1
        L_0x0074:
            return r7
        L_0x0075:
            r7 = move-exception
            r3 = r6
        L_0x0077:
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L_0x007f
            java.lang.String r7 = ""
        L_0x007f:
            java.lang.String r0 = "LSAT failed while executing BA token."
            com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult$Error r7 = r3.createError(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl.execute(kotlin.coroutines.c):java.lang.Object");
    }
}
