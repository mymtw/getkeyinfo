package com.etsy.android.lib.network;

import android.text.TextUtils;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p409o9.C13138q;
import p628nj.C18263b;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.a0 */
public final class C8722a0 implements C20000q {
    public final C20018z intercept(C20000q.C20001a aVar) {
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        uVar.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
        HashMap hashMap = new HashMap();
        hashMap.put("oauth_version", "2.0");
        hashMap.put("x-api-key", C0761x.m1697V());
        C18263b.f40057V.f29137c.getClass();
        XAuthAccessToken xAuthAccessToken = C18263b.f40057V.f29137c.f29107a;
        if (xAuthAccessToken != null && !TextUtils.isEmpty(xAuthAccessToken.getXAuthToken())) {
            hashMap.put("Authorization", String.format("Bearer %s", new Object[]{xAuthAccessToken.getXAuthToken()}));
        }
        C13138q a = C13138q.m20808a();
        a.getClass();
        hashMap.put("User-agent", a.mo45852b(System.getProperty("http.agent")));
        hashMap.put("X-Etsy-Device", C13138q.m20808a().f28895a);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            C19383o.m32796f(str, "key");
            C19383o.m32796f(str2, "value");
            aVar2.mo72998a(str, str2);
        }
        return fVar.mo70453a(aVar2.mo72999b());
    }
}
