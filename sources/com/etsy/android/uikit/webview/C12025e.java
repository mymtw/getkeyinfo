package com.etsy.android.uikit.webview;

import android.webkit.CookieManager;
import com.etsy.android.lib.config.C8592b;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p287xp.C8333a;

/* renamed from: com.etsy.android.uikit.webview.e */
public final /* synthetic */ class C12025e implements C8333a {

    /* renamed from: a */
    public final /* synthetic */ C12026f f26798a;

    /* renamed from: b */
    public final /* synthetic */ Set f26799b;

    public /* synthetic */ C12025e(C12026f fVar, Set set) {
        this.f26798a = fVar;
        this.f26799b = set;
    }

    public final void run() {
        C12026f fVar = this.f26798a;
        Set<String> set = this.f26799b;
        C19383o.m32797g(fVar, "this$0");
        C19383o.m32797g(set, "$cookies");
        String f = fVar.f26801b.mo21136f(C8592b.f18819p0);
        C19383o.m32796f(f, "config.getStringValue(Et…gKeys.HTTP_HOST_ETSY_WEB)");
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        for (String cookie : set) {
            instance.setCookie(f, cookie);
        }
    }
}
