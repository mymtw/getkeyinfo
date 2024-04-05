package com.etsy.android.uikit.webview;

import android.annotation.SuppressLint;
import android.support.p013v4.media.C0072d;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.currency.C8629a;
import kotlin.jvm.internal.C19383o;
import p409o9.C13138q;
import p425q9.C13265p;
import p486y9.C13888d;

/* renamed from: com.etsy.android.uikit.webview.h */
public final class C12028h {

    /* renamed from: a */
    public final C8618c f26806a;

    /* renamed from: b */
    public final C13888d f26807b;

    /* renamed from: c */
    public final C8629a f26808c;

    /* renamed from: d */
    public final C13265p f26809d;

    public C12028h(C8618c cVar, C13888d dVar, C8629a aVar, C13265p pVar) {
        C19383o.m32797g(dVar, "locale");
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(pVar, "session");
        this.f26806a = cVar;
        this.f26807b = dVar;
        this.f26808c = aVar;
        this.f26809d = pVar;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public final void mo38912a(WebView webView, WebViewClient webViewClient, EtsyChromeClient etsyChromeClient) {
        C19383o.m32797g(webView, "webView");
        C19383o.m32797g(etsyChromeClient, "webChromeClient");
        if (C0326j.m869n(BuildTarget.Companion)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setWebViewClient(webViewClient);
        webView.setWebChromeClient(etsyChromeClient);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString(C13138q.m20808a().mo45852b(webView.getSettings().getUserAgentString()));
        webView.requestFocus(130);
        CookieManager instance = CookieManager.getInstance();
        String f = this.f26806a.mo21136f(C8592b.f18819p0);
        C19383o.m32796f(f, "etsyConfigMap.getStringV…gKeys.HTTP_HOST_ETSY_WEB)");
        instance.setAcceptCookie(true);
        StringBuilder h = C0072d.m201h("Accept-Language=");
        h.append(this.f26807b.mo46718b().getLanguage());
        instance.setCookie(f, h.toString());
        instance.setCookie(f, "Browsing-Region=" + this.f26807b.mo46719c().getCountry());
        instance.setCookie(f, "Browsing-Currency=" + this.f26808c.mo21246a());
        StringBuilder sb = new StringBuilder();
        sb.append("etala_override=");
        String str = C13138q.m20808a().f28895a;
        C19383o.m32796f(str, "getInstance().uuid");
        sb.append("0." + str + ".0.0.0.0");
        instance.setCookie(f, sb.toString());
    }
}
