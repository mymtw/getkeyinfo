package com.braze.p044ui.inappmessage.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.C5483a;
import com.braze.p044ui.inappmessage.listeners.C5673c;
import com.braze.p044ui.inappmessage.listeners.C5674d;
import com.braze.p044ui.support.UriUtils;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.login.LoginFragment;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19699g1;
import p114g4.C6861b;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient */
public class InAppMessageWebViewClient extends WebViewClient {
    private static final String APPBOY_INAPP_MESSAGE_SCHEME = "appboy";
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
    private static final String AUTHORITY_NAME_NEWSFEED = "feed";
    private static final String BRIDGE_JS_FILE = "appboy-html-in-app-message-javascript-component.js";
    public static final C5691a Companion = new C5691a();
    public static final String JAVASCRIPT_PREFIX = "javascript:";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener = new AtomicBoolean(false);
    private boolean hasPageFinishedLoading;
    private final C5483a inAppMessage;
    private final C5673c inAppMessageWebViewClientListener;
    private C19699g1 markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private C5674d webViewClientStateListener;

    /* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$a */
    public static final class C5691a {
        /* renamed from: a */
        public static Bundle m11466a(String str) {
            C19383o.m32797g(str, "url");
            Bundle bundle = new Bundle();
            if (C19457k.m33020X0(str)) {
                return bundle;
            }
            Uri parse = Uri.parse(str);
            C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            for (Map.Entry next : UriUtils.m11473b(parse).entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            return bundle;
        }
    }

    public InAppMessageWebViewClient(Context context2, C5483a aVar, C5673c cVar) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(aVar, "inAppMessage");
        this.context = context2;
        this.inAppMessage = aVar;
        this.inAppMessageWebViewClientListener = cVar;
        this.maxOnPageFinishedWaitTimeMs = new BrazeConfigurationProvider(context2).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
    }

    private final void appendBridgeJavascript(WebView webView) {
        try {
            AssetManager assets = this.context.getAssets();
            C19383o.m32796f(assets, "context.assets");
            webView.loadUrl(C19383o.m32802l(BrazeFileUtils.m11239c(assets), JAVASCRIPT_PREFIX));
        } catch (Exception e) {
            C6861b.m13319e().mo18985f(false);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5692x8d903b54.INSTANCE, 4);
        }
    }

    public static final Bundle getBundleFromUrl(String str) {
        Companion.getClass();
        return C5691a.m11466a(str);
    }

    private final boolean handleUrlOverride(String str) {
        if (this.inAppMessageWebViewClientListener == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, InAppMessageWebViewClient$handleUrlOverride$1.INSTANCE, 6);
            return true;
        } else if (C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, InAppMessageWebViewClient$handleUrlOverride$2.INSTANCE, 6);
            return true;
        } else {
            Uri parse = Uri.parse(str);
            Companion.getClass();
            Bundle a = C5691a.m11466a(str);
            if (parse.getScheme() == null || !C19383o.m32792b(parse.getScheme(), APPBOY_INAPP_MESSAGE_SCHEME)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageWebViewClient$handleUrlOverride$4(parse), 7);
                this.inAppMessageWebViewClientListener.onOtherUrlAction(this.inAppMessage, str, a);
                return true;
            }
            String authority = parse.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                if (hashCode != -1801488983) {
                    if (hashCode != 3138974) {
                        if (hashCode == 94756344 && authority.equals("close")) {
                            this.inAppMessageWebViewClientListener.onCloseAction(this.inAppMessage, str, a);
                        }
                    } else if (authority.equals(AUTHORITY_NAME_NEWSFEED)) {
                        this.inAppMessageWebViewClientListener.onNewsfeedAction(this.inAppMessage, str, a);
                    }
                } else if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                    this.inAppMessageWebViewClientListener.onCustomEventAction(this.inAppMessage, str, a);
                }
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageWebViewClient$handleUrlOverride$3(parse), 7);
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void markPageFinished() {
        C5674d dVar = this.webViewClientStateListener;
        if (dVar != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageWebViewClient$markPageFinished$1$1.INSTANCE, 6);
            dVar.onPageFinished();
        }
    }

    public void onPageFinished(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        appendBridgeJavascript(webView);
        C5674d dVar = this.webViewClientStateListener;
        if (dVar != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageWebViewClient$onPageFinished$1$1.INSTANCE, 6);
            dVar.onPageFinished();
        }
        this.hasPageFinishedLoading = true;
        C19699g1 g1Var = this.markPageFinishedJob;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.markPageFinishedJob = null;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(renderProcessGoneDetail, "detail");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, InAppMessageWebViewClient$onRenderProcessGone$1.INSTANCE, 6);
        return true;
    }

    public final void setWebViewClientStateListener(C5674d dVar) {
        if (dVar == null || !this.hasPageFinishedLoading || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
            this.markPageFinishedJob = BrazeCoroutineScope.m11007c(Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), new InAppMessageWebViewClient$setWebViewClientStateListener$1(this, (C19340c<? super InAppMessageWebViewClient$setWebViewClientStateListener$1>) null));
        } else {
            dVar.onPageFinished();
        }
        this.webViewClientStateListener = dVar;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(webResourceRequest, LoginFragment.EXTRA_REQUEST);
        String uri = webResourceRequest.getUrl().toString();
        C19383o.m32796f(uri, "request.url.toString()");
        return handleUrlOverride(uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        return handleUrlOverride(str);
    }
}
