package com.paypal.android.platform.authsdk.authcommon.network;

import com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$Configuration$riskHeaderInterceptor$$inlined$invoke$1 */
public final class C17061xa1f0ac37 implements C20000q {
    public final /* synthetic */ PayPalOkHttpClient.RiskConfiguration $riskConfiguration$inlined;

    public C17061xa1f0ac37(PayPalOkHttpClient.RiskConfiguration riskConfiguration) {
        this.$riskConfiguration$inlined = riskConfiguration;
    }

    public C20018z intercept(C20000q.C20001a aVar) {
        C19383o.m32798h(aVar, "chain");
        C20011u g = aVar.mo70455g();
        g.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(g);
        for (Map.Entry next : this.$riskConfiguration$inlined.getRiskHeaderProvider().getHeaders().entrySet()) {
            aVar2.mo73000c((String) next.getKey(), (String) next.getValue());
        }
        return aVar.mo70453a(aVar2.mo72999b());
    }
}
