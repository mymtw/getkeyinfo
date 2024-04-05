package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.oauth2.OAuth2Repository;
import com.etsy.android.lib.util.C8890e0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import p346fa.C12703a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.network.oauth2.s */
public final class C8769s {

    /* renamed from: a */
    public final C8618c f19293a;

    /* renamed from: b */
    public final C8793t f19294b;

    /* renamed from: c */
    public final C8890e0 f19295c;

    /* renamed from: d */
    public final C12703a f19296d;

    public C8769s(C8618c cVar, C8793t tVar, C8890e0 e0Var, C12703a aVar) {
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(tVar, "oAuth2Repository");
        C19383o.m32797g(e0Var, "systemTime");
        C19383o.m32797g(aVar, "grafana");
        this.f19293a = cVar;
        this.f19294b = tVar;
        this.f19295c = e0Var;
        this.f19296d = aVar;
    }

    /* renamed from: a */
    public final C20011u mo30082a(C20011u uVar) {
        String str;
        String str2;
        C20011u uVar2 = uVar;
        C19383o.m32797g(uVar2, "originalRequest");
        C20011u.C20012a aVar = new C20011u.C20012a(uVar2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("oauth_version", "2.0");
        String f = this.f19293a.mo21136f(C8592b.f18744L0);
        C19383o.m32796f(f, "configMap.getStringValue(EtsyConfigKeys.API_KEY)");
        linkedHashMap.put("x-api-key", f);
        OAuth2AccessToken a = this.f19294b.mo30039a();
        if (a == null || !C18263b.m30837c0(a.getAccessToken())) {
            String str3 = "format(format, *args)";
            C18263b.f40057V.f29137c.getClass();
            if (C18263b.f40057V.f29137c.f29107a != null) {
                try {
                    str = (String) this.f19294b.getAccessToken().mo20656d();
                } catch (OAuth2Repository.OAuth2TokenException unused) {
                    this.f19296d.mo45475b("OAuth2SigningStrategy.ExchangingTokenError", 0.01d);
                    str = null;
                }
                if (C18263b.m30837c0(str)) {
                    String format = String.format("Bearer %s", Arrays.copyOf(new Object[]{str}, 1));
                    C19383o.m32796f(format, str3);
                    linkedHashMap.put("Authorization", format);
                }
            } else {
                this.f19296d.mo45475b("OAuth2SigningStrategy.NoOAuth2OrXAuthTokenAvailable", 0.01d);
            }
        } else {
            long expirationTime = a.getExpirationTime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f19295c.getClass();
            String str4 = "format(format, *args)";
            if (expirationTime < timeUnit.toSeconds(System.currentTimeMillis())) {
                try {
                    str2 = this.f19294b.mo30040b().mo20656d();
                } catch (OAuth2Repository.OAuth2TokenException unused2) {
                    this.f19296d.mo45475b("OAuth2SigningStrategy.RefreshingTokenError", 0.01d);
                    str2 = null;
                }
                if (C18263b.m30837c0(str2)) {
                    String format2 = String.format("Bearer %s", Arrays.copyOf(new Object[]{str2}, 1));
                    C19383o.m32796f(format2, str4);
                    linkedHashMap.put("Authorization", format2);
                }
            } else {
                String format3 = String.format("Bearer %s", Arrays.copyOf(new Object[]{a.getAccessToken()}, 1));
                C19383o.m32796f(format3, str4);
                linkedHashMap.put("Authorization", format3);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aVar.mo73000c((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar.mo72999b();
    }
}
