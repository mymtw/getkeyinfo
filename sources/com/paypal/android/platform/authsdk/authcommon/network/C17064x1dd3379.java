package com.paypal.android.platform.authsdk.authcommon.network;

import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$Configuration$makeRequestIdHeaderInterceptor$1 */
public final class C17064x1dd3379 implements C20000q {
    private final String generatePayPalRequestId() {
        String uuid = UUID.randomUUID().toString();
        C19383o.m32796f(uuid, "randomUUID()\n                    .toString()");
        String lowerCase = C19457k.m33023a1(uuid, HelpFormatter.DEFAULT_OPT_PREFIX, "", false).toLowerCase();
        C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public C20018z intercept(C20000q.C20001a aVar) {
        C19383o.m32797g(aVar, "chain");
        C20011u g = aVar.mo70455g();
        g.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(g);
        aVar2.mo73000c("paypal-request-id", generatePayPalRequestId());
        return aVar.mo70453a(aVar2.mo72999b());
    }
}
