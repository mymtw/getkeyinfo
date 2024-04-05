package com.etsy.android.uikit.webview;

import android.webkit.CookieManager;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19952i;
import okhttp3.C19984j;
import okhttp3.C19997p;

/* renamed from: com.etsy.android.uikit.webview.d */
public final class C12024d implements C19984j {

    /* renamed from: b */
    public final C8618c f26797b;

    public C12024d(C8618c cVar) {
        C19383o.m32797g(cVar, "config");
        this.f26797b = cVar;
    }

    /* renamed from: a */
    public final List<C19952i> mo38909a(C19997p pVar) {
        C19383o.m32797g(pVar, "url");
        return new ArrayList();
    }

    /* renamed from: i */
    public final void mo38910i(C19997p pVar, List<C19952i> list) {
        C19383o.m32797g(pVar, "url");
        if (C19383o.m32792b(pVar.mo72965b(), "/externalredirect")) {
            String f = this.f26797b.mo21136f(C8592b.f18819p0);
            C19383o.m32796f(f, "config.getStringValue(Et…gKeys.HTTP_HOST_ETSY_WEB)");
            CookieManager instance = CookieManager.getInstance();
            instance.setAcceptCookie(true);
            for (C19952i iVar : list) {
                instance.setCookie(f, iVar.toString());
            }
        }
    }
}
