package com.paypal.pyplcheckout.addshipping.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteResponse;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class AddressAutoCompleteApi {
    /* access modifiers changed from: private */
    public final String accessToken;
    /* access modifiers changed from: private */
    public final DebugConfigManager debugConfigManager;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final C20011u.C20012a requestBuilder;
    /* access modifiers changed from: private */
    public final String sessionId;

    public AddressAutoCompleteApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, String str2, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(str2, "sessionId");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.accessToken = str;
        this.requestBuilder = aVar;
        this.dispatcher = coroutineDispatcher;
        this.okHttpClient = tVar;
        this.sessionId = str2;
        this.debugConfigManager = debugConfigManager2;
    }

    public final Object getAddressAutoComplete(AddressAutoCompleteRequest addressAutoCompleteRequest, C19340c<? super AddressAutoCompleteResponse> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new AddressAutoCompleteApi$getAddressAutoComplete$2(this, addressAutoCompleteRequest, (C19340c<? super AddressAutoCompleteApi$getAddressAutoComplete$2>) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AddressAutoCompleteApi(java.lang.String r8, okhttp3.C20011u.C20012a r9, kotlinx.coroutines.CoroutineDispatcher r10, okhttp3.C20009t r11, java.lang.String r12, com.paypal.pyplcheckout.model.DebugConfigManager r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L_0x0009
            okhttp3.u$a r9 = new okhttp3.u$a
            r9.<init>()
        L_0x0009:
            r2 = r9
            r9 = r14 & 4
            if (r9 == 0) goto L_0x0010
            rq.a r10 = kotlinx.coroutines.C19760n0.f43720b
        L_0x0010:
            r3 = r10
            r9 = r14 & 8
            if (r9 == 0) goto L_0x001b
            com.paypal.pyplcheckout.services.api.NetworkObject r9 = com.paypal.pyplcheckout.services.api.NetworkObject.INSTANCE
            okhttp3.t r11 = r9.getOkHttpClient()
        L_0x001b:
            r4 = r11
            r9 = r14 & 16
            if (r9 == 0) goto L_0x0026
            java.lang.String r9 = "randomUUID().toString()"
            java.lang.String r12 = android.support.p013v4.media.C0069a.m174e(r9)
        L_0x0026:
            r5 = r12
            r9 = r14 & 32
            if (r9 == 0) goto L_0x0034
            com.paypal.pyplcheckout.model.DebugConfigManager r13 = com.paypal.pyplcheckout.model.DebugConfigManager.getInstance()
            java.lang.String r9 = "getInstance()"
            kotlin.jvm.internal.C19383o.m32796f(r13, r9)
        L_0x0034:
            r6 = r13
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addshipping.api.AddressAutoCompleteApi.<init>(java.lang.String, okhttp3.u$a, kotlinx.coroutines.CoroutineDispatcher, okhttp3.t, java.lang.String, com.paypal.pyplcheckout.model.DebugConfigManager, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
