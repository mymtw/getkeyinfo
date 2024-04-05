package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;
import kotlin.jvm.internal.C19383o;

public final class GetTokenClient extends PlatformServiceClient {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetTokenClient(android.content.Context r9, com.facebook.login.LoginClient.Request r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r6 = r10.getApplicationId()
            java.lang.String r0 = "request.applicationId"
            kotlin.jvm.internal.C19383o.m32796f(r6, r0)
            java.lang.String r7 = r10.getNonce()
            r3 = 65536(0x10000, float:9.18355E-41)
            r4 = 65537(0x10001, float:9.1837E-41)
            r5 = 20121101(0x133060d, float:3.288145E-38)
            r1 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.GetTokenClient.<init>(android.content.Context, com.facebook.login.LoginClient$Request):void");
    }

    public void populateRequestBundle(Bundle bundle) {
        C19383o.m32797g(bundle, "data");
    }
}
