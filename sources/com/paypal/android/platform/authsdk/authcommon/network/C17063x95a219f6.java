package com.paypal.android.platform.authsdk.authcommon.network;

import com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient;
import okhttp3.C20000q;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$Configuration$sslPinningInterceptor$$inlined$invoke$1 */
public final class C17063x95a219f6 implements C20000q {
    public final /* synthetic */ PayPalOkHttpClient.SslPinningConfiguration $sslPinningConfiguration$inlined;

    public C17063x95a219f6(PayPalOkHttpClient.SslPinningConfiguration sslPinningConfiguration) {
        this.$sslPinningConfiguration$inlined = sslPinningConfiguration;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[Catch:{ SSLPeerUnverifiedException -> 0x003e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.C20018z intercept(okhttp3.C20000q.C20001a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C19383o.m32798h(r5, r0)
            r0 = 0
            com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration r1 = r4.$sslPinningConfiguration$inlined     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            boolean r1 = r1.getPermissive()     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            if (r1 == 0) goto L_0x0017
            okhttp3.u r1 = r5.mo70455g()     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            okhttp3.z r0 = r5.mo70453a(r1)     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            goto L_0x0054
        L_0x0017:
            okhttp3.u r1 = r5.mo70455g()     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            okhttp3.p r1 = r1.f44342b     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            java.lang.String r1 = r1.f44243e     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            okhttp3.internal.connection.g r2 = r5.mo70454b()     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            if (r2 != 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            okhttp3.Handshake r2 = r2.f44179d     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            r2 = r0
            goto L_0x0030
        L_0x002c:
            java.util.List r2 = r2.mo72830a()     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
        L_0x0030:
            if (r2 != 0) goto L_0x0034
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
        L_0x0034:
            com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration r3 = r4.$sslPinningConfiguration$inlined     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            okhttp3.CertificatePinner r3 = r3.getCertificatePinner()     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            r3.mo72823a(r1, r2)     // Catch:{ SSLPeerUnverifiedException -> 0x003e }
            goto L_0x0054
        L_0x003e:
            r1 = move-exception
            com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration r2 = r4.$sslPinningConfiguration$inlined
            kq.l r2 = r2.getCertificatePinningFailureListener()
            java.lang.String r3 = r1.getMessage()
            r2.invoke(r3)
            com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration r2 = r4.$sslPinningConfiguration$inlined
            boolean r2 = r2.getThrowExceptionWhenCertificatePinningFails()
            if (r2 != 0) goto L_0x005f
        L_0x0054:
            if (r0 != 0) goto L_0x005e
            okhttp3.u r0 = r5.mo70455g()
            okhttp3.z r0 = r5.mo70453a(r0)
        L_0x005e:
            return r0
        L_0x005f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.network.C17063x95a219f6.intercept(okhttp3.q$a):okhttp3.z");
    }
}
