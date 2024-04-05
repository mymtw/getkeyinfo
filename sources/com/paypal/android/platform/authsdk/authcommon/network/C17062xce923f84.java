package com.paypal.android.platform.authsdk.authcommon.network;

import com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$Configuration$setupAdditionalHeaderProviders$$inlined$-addInterceptor$1 */
public final class C17062xce923f84 implements C20000q {
    public final /* synthetic */ PayPalOkHttpClient.Configuration this$0;

    public C17062xce923f84(PayPalOkHttpClient.Configuration configuration) {
        this.this$0 = configuration;
    }

    public C20018z intercept(C20000q.C20001a aVar) {
        C19383o.m32798h(aVar, "chain");
        C20011u g = aVar.mo70455g();
        g.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(g);
        for (PayPalOkHttpClient.HeadersProvider headers : this.this$0.getAdditionalHeaderProviders()) {
            for (Map.Entry next : headers.getHeaders().entrySet()) {
                aVar2.mo72998a((String) next.getKey(), (String) next.getValue());
            }
        }
        return aVar.mo70453a(aVar2.mo72999b());
    }
}
