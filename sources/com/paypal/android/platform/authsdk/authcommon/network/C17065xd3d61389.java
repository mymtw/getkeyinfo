package com.paypal.android.platform.authsdk.authcommon.network;

import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$Configuration$makeUserAgentHeaderInterceptor$1 */
public final class C17065xd3d61389 implements C20000q {
    public C20018z intercept(C20000q.C20001a aVar) {
        String str;
        C19383o.m32797g(aVar, "chain");
        C20011u g = aVar.mo70455g();
        g.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(g);
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            str = null;
        }
        if (str != null) {
            aVar2.mo73000c("User-Agent", str);
        }
        return aVar.mo70453a(aVar2.mo72999b());
    }
}
