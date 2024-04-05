package com.paypal.pyplcheckout.services;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.AddShippingAddressResponse;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class AddShippingApi {
    /* access modifiers changed from: private */
    public final String accessToken;
    /* access modifiers changed from: private */
    public final DebugConfigManager debugConfigManager;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final C20011u.C20012a requestBuilder;

    public AddShippingApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.accessToken = str;
        this.requestBuilder = aVar;
        this.dispatcher = coroutineDispatcher;
        this.okHttpClient = tVar;
        this.debugConfigManager = debugConfigManager2;
    }

    public final Object addShipping(PortableShippingAddressRequest portableShippingAddressRequest, C19340c<? super AddShippingAddressResponse> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new AddShippingApi$addShipping$2(this, portableShippingAddressRequest, (C19340c<? super AddShippingApi$addShipping$2>) null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AddShippingApi(java.lang.String r7, okhttp3.C20011u.C20012a r8, kotlinx.coroutines.CoroutineDispatcher r9, okhttp3.C20009t r10, com.paypal.pyplcheckout.model.DebugConfigManager r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 2
            if (r13 == 0) goto L_0x0009
            okhttp3.u$a r8 = new okhttp3.u$a
            r8.<init>()
        L_0x0009:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0010
            rq.a r9 = kotlinx.coroutines.C19760n0.f43720b
        L_0x0010:
            r3 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L_0x001b
            com.paypal.pyplcheckout.services.api.NetworkObject r8 = com.paypal.pyplcheckout.services.api.NetworkObject.INSTANCE
            okhttp3.t r10 = r8.getOkHttpClient()
        L_0x001b:
            r4 = r10
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0029
            com.paypal.pyplcheckout.model.DebugConfigManager r11 = com.paypal.pyplcheckout.model.DebugConfigManager.getInstance()
            java.lang.String r8 = "getInstance()"
            kotlin.jvm.internal.C19383o.m32796f(r11, r8)
        L_0x0029:
            r5 = r11
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.AddShippingApi.<init>(java.lang.String, okhttp3.u$a, kotlinx.coroutines.CoroutineDispatcher, okhttp3.t, com.paypal.pyplcheckout.model.DebugConfigManager, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
