package com.braze.p044ui;

import android.content.Context;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.enums.Channel;
import com.braze.p044ui.actions.UriAction;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.facebook.login.LoginFragment;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1 */
public final class BrazeWebViewActivity$createWebViewClient$1 extends WebViewClient {
    public final /* synthetic */ BrazeWebViewActivity this$0;

    public BrazeWebViewActivity$createWebViewClient$1(BrazeWebViewActivity brazeWebViewActivity) {
        this.this$0 = brazeWebViewActivity;
    }

    private final Boolean handleUrlOverride(Context context, String str) {
        try {
            if (C19327t.m32634P0(Uri.parse(str).getScheme(), BrazeFileUtils.f11886b)) {
                return null;
            }
            UriAction a = BrazeDeeplinkHandler.f12011a.mo16169a(str, this.this$0.getIntent().getExtras(), false, Channel.UNKNOWN);
            if (a == null) {
                return Boolean.FALSE;
            }
            a.mo16178a(context);
            this.this$0.finish();
            return Boolean.TRUE;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1(str), 4);
            return null;
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(renderProcessGoneDetail, "detail");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, BrazeWebViewActivity$createWebViewClient$1$onRenderProcessGone$1.INSTANCE, 6);
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(webResourceRequest, LoginFragment.EXTRA_REQUEST);
        Context context = webView.getContext();
        C19383o.m32796f(context, "view.context");
        String uri = webResourceRequest.getUrl().toString();
        C19383o.m32796f(uri, "request.url.toString()");
        Boolean handleUrlOverride = handleUrlOverride(context, uri);
        return handleUrlOverride == null ? super.shouldOverrideUrlLoading(webView, webResourceRequest) : handleUrlOverride.booleanValue();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        Context context = webView.getContext();
        C19383o.m32796f(context, "view.context");
        Boolean handleUrlOverride = handleUrlOverride(context, str);
        return handleUrlOverride == null ? super.shouldOverrideUrlLoading(webView, str) : handleUrlOverride.booleanValue();
    }
}
