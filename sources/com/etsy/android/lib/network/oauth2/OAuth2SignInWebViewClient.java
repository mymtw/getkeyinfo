package com.etsy.android.lib.network.oauth2;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.util.C8915n;
import com.google.logging.type.LogSeverity;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;
import p628nj.C18263b;

public final class OAuth2SignInWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    private final View errorView;
    private final C8761k oAuth2Authentication;
    private final C8762l oAuth2EventHandler;
    private final ProgressBar progressBar;

    public OAuth2SignInWebViewClient(ProgressBar progressBar2, View view, C8761k kVar, C8762l lVar) {
        C19383o.m32797g(progressBar2, "progressBar");
        C19383o.m32797g(view, "errorView");
        C19383o.m32797g(kVar, "oAuth2Authentication");
        C19383o.m32797g(lVar, "oAuth2EventHandler");
        this.progressBar = progressBar2;
        this.errorView = view;
        this.oAuth2Authentication = kVar;
        this.oAuth2EventHandler = lVar;
    }

    private final boolean isDevUrlAllowed(String str) {
        try {
            String host = Uri.parse(str).getHost();
            List<String> list = C8591a.f18700r;
            String f = C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0);
            C19383o.m32796f(f, "getInstance().etsyConfig…gKeys.HTTP_HOST_ETSY_WEB)");
            return C19457k.m33019W0(host, Uri.parse(f).getHost(), false);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private final boolean isUrlAllowed(String str) {
        Uri uri;
        List<String> list = C8591a.f18700r;
        C8591a aVar = C18263b.f40056T;
        if (aVar.f18705e.equals(aVar.f18701a)) {
            return isDevUrlAllowed(str);
        }
        try {
            uri = Uri.parse(str);
        } catch (NullPointerException unused) {
            uri = null;
        }
        return uri != null && C8915n.m17353e(uri.getHost());
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ProgressBar progressBar2 = this.progressBar;
        progressBar2.setProgress(0);
        progressBar2.setVisibility(0);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "description");
        C19383o.m32797g(str2, "failingUrl");
        super.onReceivedError(webView, i, str, str2);
        C8694h a = LogCatKt.m17045a();
        a.mo21306a("Webview received error code: " + i + " with error description: " + str);
        webView.setVisibility(8);
        this.progressBar.setVisibility(8);
        this.errorView.setVisibility(0);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(sslErrorHandler, "handler");
        C19383o.m32797g(sslError, "error");
        C8694h hVar = C8694h.f19097a;
        hVar.mo21306a("Webview received SSL error: " + sslError);
        List<String> list = C8591a.f18700r;
        C8591a aVar = C18263b.f40056T;
        if (aVar.f18705e.equals(aVar.f18701a)) {
            LogCatKt.m17045a().mo21313g("Webview proceeding with SSL error on dev.");
            sslErrorHandler.proceed();
            return;
        }
        sslErrorHandler.cancel();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        if (this.oAuth2Authentication.mo30075b(str)) {
            this.oAuth2EventHandler.mo30080a(str);
            return true;
        } else if (isUrlAllowed(str)) {
            return false;
        } else {
            onReceivedError(webView, LogSeverity.WARNING_VALUE, "Attempted to navigate to disallowed url " + str + ClassUtils.PACKAGE_SEPARATOR_CHAR, str);
            return true;
        }
    }
}
