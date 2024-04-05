package com.paypal.android.platform.authsdk.authcommon.network;

import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$Configuration$makeAuthHeaderInterceptor$$inlined$invoke$1 */
public final class C17060xc9761cf0 implements C20000q {
    public final /* synthetic */ Authentication $authentication$inlined;

    public C17060xc9761cf0(Authentication authentication) {
        this.$authentication$inlined = authentication;
    }

    public C20018z intercept(C20000q.C20001a aVar) {
        Map<String, String> authHeaders;
        C19383o.m32798h(aVar, "chain");
        C20011u g = aVar.mo70455g();
        g.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(g);
        AuthenticationTokensProvider authTokensProvider = this.$authentication$inlined.authTokensProvider();
        if (!(authTokensProvider == null || (authHeaders = authTokensProvider.getAuthHeaders()) == null)) {
            ArrayList arrayList = new ArrayList(authHeaders.size());
            for (Map.Entry next : authHeaders.entrySet()) {
                aVar2.mo73000c((String) next.getKey(), (String) next.getValue());
                arrayList.add(aVar2);
            }
        }
        return aVar.mo70453a(aVar2.mo72999b());
    }
}
