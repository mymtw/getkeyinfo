package com.paypal.checkout.merchanttoken;

import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.NetworkObject;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;

public final class CreateLsatTokenAction {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ERROR_ACCESS_TOKEN_MISSING = "Create LSAT response body did not contain access_token.";
    public static final String ERROR_RESPONSE_BODY_NULL = "Create LSAT response body was null.";
    public static final String ERROR_RESPONSE_BODY_TO_STRING_FAILED = "Unable to convert response body to a string.";
    public static final String ERROR_UNABLE_TO_CREATE_ACCESS_TOKEN = "Unable to create LSAT token after three attempts.";
    private final String clientId;
    private final CoroutineDispatcher ioDispatcher;
    private final LsatTokenRequestFactory lsatTokenRequestFactory;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CreateLsatTokenAction(DebugConfigManager debugConfigManager, LsatTokenRequestFactory lsatTokenRequestFactory2, C20009t tVar, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(debugConfigManager, "debugConfigManager");
        C19383o.m32797g(lsatTokenRequestFactory2, "lsatTokenRequestFactory");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.lsatTokenRequestFactory = lsatTokenRequestFactory2;
        this.okHttpClient = tVar;
        this.ioDispatcher = coroutineDispatcher;
        this.clientId = debugConfigManager.getClientId();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getResponse(int r13, kotlin.coroutines.C19340c<? super okhttp3.C20018z> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$1 r0 = (com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$1 r0 = new com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "clientId"
            r5 = 2
            r6 = 3
            r7 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r7) goto L_0x0042
            if (r2 == r5) goto L_0x0038
            if (r2 != r6) goto L_0x0030
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x0097
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            int r13 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction r2 = (com.paypal.checkout.merchanttoken.CreateLsatTokenAction) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x008b
        L_0x0042:
            int r13 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction r2 = (com.paypal.checkout.merchanttoken.CreateLsatTokenAction) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ IOException -> 0x004c }
            goto L_0x0071
        L_0x004c:
            r14 = move-exception
            goto L_0x0076
        L_0x004e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            com.paypal.checkout.merchanttoken.LsatTokenRequestFactory r14 = r12.lsatTokenRequestFactory
            java.lang.String r2 = r12.clientId
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            okhttp3.u r14 = r14.create(r2)
            kotlinx.coroutines.CoroutineDispatcher r2 = r12.ioDispatcher     // Catch:{ IOException -> 0x0074 }
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$2 r8 = new com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$2     // Catch:{ IOException -> 0x0074 }
            r8.<init>(r12, r14, r3)     // Catch:{ IOException -> 0x0074 }
            r0.L$0 = r12     // Catch:{ IOException -> 0x0074 }
            r0.I$0 = r13     // Catch:{ IOException -> 0x0074 }
            r0.label = r7     // Catch:{ IOException -> 0x0074 }
            java.lang.Object r14 = kotlinx.coroutines.C19697g.m33471i(r0, r2, r8)     // Catch:{ IOException -> 0x0074 }
            if (r14 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r12
        L_0x0071:
            okhttp3.z r14 = (okhttp3.C20018z) r14     // Catch:{ IOException -> 0x004c }
            goto L_0x0099
        L_0x0074:
            r14 = move-exception
            r2 = r12
        L_0x0076:
            if (r13 >= r6) goto L_0x009a
            r8 = 150(0x96, double:7.4E-322)
            int r14 = r13 + 1
            long r10 = (long) r14
            long r10 = r10 * r8
            r0.L$0 = r2
            r0.I$0 = r13
            r0.label = r5
            java.lang.Object r14 = p628nj.C18263b.m30814I(r10, r0)
            if (r14 != r1) goto L_0x008b
            return r1
        L_0x008b:
            int r13 = r13 + r7
            r0.L$0 = r3
            r0.label = r6
            java.lang.Object r14 = r2.getResponse(r13, r0)
            if (r14 != r1) goto L_0x0097
            return r1
        L_0x0097:
            okhttp3.z r14 = (okhttp3.C20018z) r14
        L_0x0099:
            return r14
        L_0x009a:
            com.paypal.checkout.merchanttoken.CreateLsatTokenException r13 = new com.paypal.checkout.merchanttoken.CreateLsatTokenException
            java.lang.String r0 = r2.clientId
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            r13.<init>(r0, r14)
            java.lang.String r14 = "Unable to create LSAT token after three attempts."
            r2.logError(r14, r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.merchanttoken.CreateLsatTokenAction.getResponse(int, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ Object getResponse$default(CreateLsatTokenAction createLsatTokenAction, int i, C19340c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return createLsatTokenAction.getResponse(i, cVar);
    }

    private final void logError(String str, CreateLsatTokenException createLsatTokenException) {
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E569, C0326j.m864i("Unable to create the LSAT Token for the given Client ID: ", this.clientId), str, createLsatTokenException, PEnums.TransitionName.NATIVE_XO_POST_LSAT_CREATE_TOKEN, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execute(kotlin.coroutines.C19340c<? super java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "clientId"
            boolean r1 = r7 instanceof com.paypal.checkout.merchanttoken.CreateLsatTokenAction$execute$1
            if (r1 == 0) goto L_0x0015
            r1 = r7
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction$execute$1 r1 = (com.paypal.checkout.merchanttoken.CreateLsatTokenAction$execute$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction$execute$1 r1 = new com.paypal.checkout.merchanttoken.CreateLsatTokenAction$execute$1
            r1.<init>(r6, r7)
        L_0x001a:
            java.lang.Object r7 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0036
            if (r3 != r5) goto L_0x002e
            java.lang.Object r1 = r1.L$0
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction r1 = (com.paypal.checkout.merchanttoken.CreateLsatTokenAction) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0046
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            r7 = 0
            r1.L$0 = r6
            r1.label = r5
            java.lang.Object r7 = getResponse$default(r6, r7, r1, r5, r4)
            if (r7 != r2) goto L_0x0045
            return r2
        L_0x0045:
            r1 = r6
        L_0x0046:
            okhttp3.z r7 = (okhttp3.C20018z) r7
            okhttp3.a0 r7 = r7.f44368i     // Catch:{ NullPointerException -> 0x008f }
            kotlin.jvm.internal.C19383o.m32794d(r7)     // Catch:{ NullPointerException -> 0x008f }
            java.lang.String r2 = r7.mo72844g()     // Catch:{ IOException -> 0x0078 }
            kotlin.reflect.C19421p.m32917E(r7, r4)     // Catch:{ NullPointerException -> 0x008f }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0065 }
            r7.<init>(r2)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r2 = "access_token"
            java.lang.String r7 = r7.getString(r2)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r2 = "{\n            val respon…\"access_token\")\n        }"
            kotlin.jvm.internal.C19383o.m32796f(r7, r2)     // Catch:{ JSONException -> 0x0065 }
            return r7
        L_0x0065:
            r7 = move-exception
            com.paypal.checkout.merchanttoken.CreateLsatTokenException r2 = new com.paypal.checkout.merchanttoken.CreateLsatTokenException
            java.lang.String r3 = r1.clientId
            kotlin.jvm.internal.C19383o.m32796f(r3, r0)
            r2.<init>(r3, r7)
            java.lang.String r7 = "Create LSAT response body did not contain access_token."
            r1.logError(r7, r2)
            throw r2
        L_0x0076:
            r2 = move-exception
            goto L_0x0089
        L_0x0078:
            r2 = move-exception
            com.paypal.checkout.merchanttoken.CreateLsatTokenException r3 = new com.paypal.checkout.merchanttoken.CreateLsatTokenException     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r1.clientId     // Catch:{ all -> 0x0076 }
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)     // Catch:{ all -> 0x0076 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "Unable to convert response body to a string."
            r1.logError(r2, r3)     // Catch:{ all -> 0x0076 }
            throw r3     // Catch:{ all -> 0x0076 }
        L_0x0089:
            throw r2     // Catch:{ all -> 0x008a }
        L_0x008a:
            r3 = move-exception
            kotlin.reflect.C19421p.m32917E(r7, r2)     // Catch:{ NullPointerException -> 0x008f }
            throw r3     // Catch:{ NullPointerException -> 0x008f }
        L_0x008f:
            r7 = move-exception
            com.paypal.checkout.merchanttoken.CreateLsatTokenException r2 = new com.paypal.checkout.merchanttoken.CreateLsatTokenException
            java.lang.String r3 = r1.clientId
            kotlin.jvm.internal.C19383o.m32796f(r3, r0)
            r2.<init>(r3, r7)
            java.lang.String r7 = "Create LSAT response body was null."
            r1.logError(r7, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.merchanttoken.CreateLsatTokenAction.execute(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreateLsatTokenAction(DebugConfigManager debugConfigManager, LsatTokenRequestFactory lsatTokenRequestFactory2, C20009t tVar, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(debugConfigManager, lsatTokenRequestFactory2, (i & 4) != 0 ? NetworkObject.INSTANCE.getOkHttpClient() : tVar, (i & 8) != 0 ? C19760n0.f43720b : coroutineDispatcher);
    }
}
