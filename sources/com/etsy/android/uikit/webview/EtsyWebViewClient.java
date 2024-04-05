package com.etsy.android.uikit.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0326j;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8915n;
import java.util.List;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;
import p628nj.C18263b;

public class EtsyWebViewClient extends WebViewClient implements C2857f {
    private boolean attemptedAuth;
    private final C7091a compositeDisposable = new C7091a();
    public C8618c configMap;
    private ProgressBar progressBar;
    private final C12026f redirectCookiesRepository;
    private final C13461f schedulers;

    public EtsyWebViewClient(C8618c cVar, ProgressBar progressBar2, C12026f fVar, C13461f fVar2) {
        this.progressBar = progressBar2;
        this.configMap = cVar;
        this.redirectCookiesRepository = fVar;
        this.schedulers = fVar2;
    }

    private boolean isSignInUrl(Uri uri) {
        if (uri.getPathSegments().isEmpty()) {
            return false;
        }
        String str = uri.getPathSegments().get(0);
        if (str.equals("signin") || str.equals("join")) {
            return true;
        }
        if (uri.getPathSegments().size() < 2) {
            return false;
        }
        String str2 = uri.getPathSegments().get(1);
        return str2.equals("signin") || str2.equals("join");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$shouldOverrideUrlLoading$1(WebView webView, Uri uri, Throwable th) throws Exception {
        C8694h.f19097a.mo21309d("Error occurred while attempting to harvest cookies.", th);
        lambda$shouldOverrideUrlLoading$0(webView, uri);
    }

    /* access modifiers changed from: private */
    /* renamed from: onInterceptAttempted */
    public void lambda$shouldOverrideUrlLoading$0(WebView webView, Uri uri) {
        this.attemptedAuth = true;
        goToRedirectUrl(webView, uri.getQueryParameter("from_page"));
    }

    private boolean shouldAttemptCookieInjection(Uri uri) {
        if (!this.attemptedAuth && C18263b.f40057V.mo45960e() && C8915n.m17353e(uri.getHost())) {
            return isSignInUrl(uri);
        }
        return false;
    }

    private void tearDown() {
        this.compositeDisposable.mo19405d();
        this.progressBar = null;
    }

    public void goToRedirectUrl(WebView webView, String str) {
        Uri uri;
        if (C8885d0.m17323g(str)) {
            uri = Uri.parse(str);
            if (!C8885d0.m17323g(uri.getHost())) {
                if (!str.startsWith("/")) {
                    str = C0326j.m864i("/", str);
                }
                StringBuilder sb = new StringBuilder();
                List<String> list = C8591a.f18700r;
                sb.append(C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0));
                sb.append(str);
                uri = Uri.parse(sb.toString());
            }
        } else {
            List<String> list2 = C8591a.f18700r;
            uri = Uri.parse(C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0));
        }
        webView.loadUrl(uri.toString());
    }

    public /* bridge */ /* synthetic */ void onCreate(C2887s sVar) {
    }

    public void onDestroy(C2887s sVar) {
        tearDown();
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null && progressBar2.getVisibility() == 8) {
            this.progressBar.setVisibility(0);
            this.progressBar.setProgress(0);
        }
    }

    public /* bridge */ /* synthetic */ void onPause(C2887s sVar) {
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C8694h hVar = C8694h.f19097a;
        hVar.mo21306a("Webview received error code: " + i + " with error description: " + str);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C8694h hVar = C8694h.f19097a;
        hVar.mo21306a("Webview received SSL error: " + sslError);
        List<String> list = C8591a.f18700r;
        C8591a aVar = C18263b.f40056T;
        if (aVar.f18705e.equals(aVar.f18701a)) {
            hVar.mo21313g("Webview proceeding with SSL error on dev.");
            sslErrorHandler.proceed();
            return;
        }
        sslErrorHandler.cancel();
    }

    public /* bridge */ /* synthetic */ void onResume(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onStart(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onStop(C2887s sVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if ((r0.f26801b.mo21132b(com.etsy.android.lib.config.C8592b.f18814n1) && r0.f26801b.mo21132b(com.etsy.android.lib.config.C8592b.f18817o1)) == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        /*
            r7 = this;
            android.net.Uri r9 = android.net.Uri.parse(r9)
            boolean r0 = r7.shouldAttemptCookieInjection(r9)
            r1 = 0
            if (r0 == 0) goto L_0x00e8
            com.etsy.android.uikit.webview.f r0 = r7.redirectCookiesRepository
            r0.getClass()
            okhttp3.n$a r2 = new okhttp3.n$a
            r3 = 0
            r4 = 1
            r2.<init>(r1)
            java.lang.String r5 = "redirect_id"
            java.lang.String r6 = "10"
            r2.mo72947a(r5, r6)
            com.etsy.android.lib.config.c r5 = r0.f26801b
            com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.f18744L0
            java.lang.String r5 = r5.mo21136f(r6)
            if (r5 != 0) goto L_0x002a
            java.lang.String r5 = ""
        L_0x002a:
            java.lang.String r6 = "api_key"
            r2.mo72947a(r6, r5)
            com.etsy.android.lib.config.c r5 = r0.f26801b
            com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.f18811m1
            boolean r5 = r5.mo21132b(r6)
            if (r5 == 0) goto L_0x0051
            com.etsy.android.lib.network.t r5 = r0.f26803d
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r5 = r5.mo30124a()
            if (r5 == 0) goto L_0x0047
            java.util.Set r5 = r5.getCookies()
            if (r5 != 0) goto L_0x0049
        L_0x0047:
            kotlin.collections.EmptySet r5 = kotlin.collections.EmptySet.INSTANCE
        L_0x0049:
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0051
            r5 = r4
            goto L_0x0052
        L_0x0051:
            r5 = r1
        L_0x0052:
            if (r5 == 0) goto L_0x006d
            com.etsy.android.lib.config.c r5 = r0.f26801b
            com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.f18814n1
            boolean r5 = r5.mo21132b(r6)
            if (r5 == 0) goto L_0x006a
            com.etsy.android.lib.config.c r5 = r0.f26801b
            com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.f18817o1
            boolean r5 = r5.mo21132b(r6)
            if (r5 == 0) goto L_0x006a
            r5 = r4
            goto L_0x006b
        L_0x006a:
            r5 = r1
        L_0x006b:
            if (r5 != 0) goto L_0x006e
        L_0x006d:
            r1 = r4
        L_0x006e:
            if (r1 == 0) goto L_0x009b
            q9.p r1 = r0.f26800a
            q9.d r1 = r1.f29137c
            com.etsy.android.lib.network.oauth2.XAuthAccessToken r1 = r1.f29107a
            if (r1 == 0) goto L_0x007c
            java.lang.String r3 = r1.getXAuthToken()
        L_0x007c:
            q9.p r1 = r0.f26800a
            boolean r1 = r1.mo45960e()
            if (r1 == 0) goto L_0x008b
            if (r3 == 0) goto L_0x008b
            java.lang.String r1 = "token"
            r2.mo72947a(r1, r3)
        L_0x008b:
            com.etsy.android.uikit.webview.c r0 = r0.f26802c
            okhttp3.n r1 = new okhttp3.n
            java.util.ArrayList r3 = r2.f44231a
            java.util.ArrayList r2 = r2.f44232b
            r1.<init>(r3, r2)
            tp.a r0 = r0.mo38908a(r1)
            goto L_0x00b5
        L_0x009b:
            com.etsy.android.lib.network.t r1 = r0.f26803d
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r1 = r1.mo30124a()
            if (r1 == 0) goto L_0x00a9
            java.util.Set r1 = r1.getCookies()
            if (r1 != 0) goto L_0x00ab
        L_0x00a9:
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.INSTANCE
        L_0x00ab:
            com.etsy.android.uikit.webview.e r2 = new com.etsy.android.uikit.webview.e
            r2.<init>(r0, r1)
            io.reactivex.internal.operators.completable.b r0 = new io.reactivex.internal.operators.completable.b
            r0.<init>(r2)
        L_0x00b5:
            ua.f r1 = r7.schedulers
            r1.getClass()
            tp.r r1 = p456ua.C13461f.m21235b()
            r0.getClass()
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r2 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r2.<init>(r0, r1)
            ua.f r0 = r7.schedulers
            r0.getClass()
            tp.r r0 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.completable.CompletableObserveOn r1 = new io.reactivex.internal.operators.completable.CompletableObserveOn
            r1.<init>(r2, r0)
            com.etsy.android.uikit.webview.a r0 = new com.etsy.android.uikit.webview.a
            r0.<init>(r7, r8, r9)
            com.etsy.android.uikit.webview.b r2 = new com.etsy.android.uikit.webview.b
            r2.<init>(r7, r8, r9)
            io.reactivex.internal.observers.CallbackCompletableObserver r8 = r1.mo20608c(r2, r0)
            io.reactivex.disposables.a r9 = r7.compositeDisposable
            r9.mo19403b(r8)
            return r4
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.webview.EtsyWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
