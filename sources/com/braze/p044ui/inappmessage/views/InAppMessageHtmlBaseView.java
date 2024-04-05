package com.braze.p044ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.view.C2348w0;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.braze.p044ui.inappmessage.listeners.C5674d;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.p044ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p010a9.C0048b;
import p114g4.C6861b;
import p226r8.C7784a;
import p241t2.C7943d;
import p760nr.C19921a;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements C5697c {
    public static final String APPBOY_BRIDGE_PREFIX = "appboyInternalBridge";
    public static final String BRAZE_BRIDGE_PREFIX = "brazeInternalBridge";
    private static final String FILE_URI_SCHEME_PREFIX = "file://";
    private static final String FINISHED_WEBVIEW_URL = "about:blank";
    private static final String HTML_ENCODING = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    /* access modifiers changed from: private */
    public static final String TAG = BrazeLogger.m11287i(InAppMessageHtmlBaseView.class);
    private InAppMessageWebViewClient mInAppMessageWebViewClient;
    private boolean mIsFinished = false;
    public WebView mMessageWebView;

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$a */
    public class C5694a extends WebChromeClient {
        public final Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String access$000 = InAppMessageHtmlBaseView.TAG;
            StringBuilder h = C0072d.m201h("Braze HTML In-app Message log. Line: ");
            h.append(consoleMessage.lineNumber());
            h.append(". SourceId: ");
            h.append(consoleMessage.sourceId());
            h.append(". Log Level: ");
            h.append(consoleMessage.messageLevel());
            h.append(". Message: ");
            h.append(consoleMessage.message());
            BrazeLogger.m11285g(access$000, h.toString());
            return true;
        }
    }

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract /* synthetic */ void applyWindowInsets(C2348w0 w0Var);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !C6861b.m13319e().f15219a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InAppMessageViewUtils.m11461a();
        return true;
    }

    public void finishWebViewDisplay() {
        BrazeLogger.m11285g(TAG, "Finishing WebView display");
        this.mIsFinished = true;
        WebView webView = this.mMessageWebView;
        if (webView != null) {
            webView.loadUrl(FINISHED_WEBVIEW_URL);
            this.mMessageWebView.onPause();
            this.mMessageWebView.removeAllViews();
            this.mMessageWebView = null;
        }
    }

    public View getMessageClickableView() {
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView getMessageWebView() {
        Class cls = WebSettingsBoundaryInterface.class;
        if (this.mIsFinished) {
            BrazeLogger.m11292n(TAG, "Cannot return the WebView for an already finished message");
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.m11285g(TAG, "Cannot find WebView. getWebViewViewId() returned 0.");
            return null;
        }
        WebView webView = this.mMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        this.mMessageWebView = webView2;
        if (webView2 == null) {
            String str = TAG;
            BrazeLogger.m11285g(str, "findViewById for " + webViewViewId + " returned null. Returning null for WebView.");
            return null;
        }
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        this.mMessageWebView.setLayerType(2, (Paint) null);
        this.mMessageWebView.setBackgroundColor(0);
        try {
            if (WebViewFeatureInternal.isSupported("FORCE_DARK") && ViewUtils.m11481g(getContext())) {
                WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.FORCE_DARK;
                if (webViewFeatureInternal.isSupportedByFramework()) {
                    settings.setForceDark(2);
                } else if (webViewFeatureInternal.isSupportedByWebView()) {
                    ((WebSettingsBoundaryInterface) new C7784a((Object) (WebSettingsBoundaryInterface) C19921a.m34065a(cls, ((WebkitToCompatConverterBoundaryInterface) C7943d.C7944a.f17414a.f17418a).convertSettings(settings))).f17221b).setForceDark(2);
                } else {
                    throw WebViewFeatureInternal.getUnsupportedOperationException();
                }
            }
            if (WebViewFeatureInternal.isSupported("FORCE_DARK_STRATEGY")) {
                if (WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
                    ((WebSettingsBoundaryInterface) new C7784a((Object) (WebSettingsBoundaryInterface) C19921a.m34065a(cls, ((WebkitToCompatConverterBoundaryInterface) C7943d.C7944a.f17414a.f17418a).convertSettings(settings))).f17221b).setForceDarkBehavior(1);
                } else {
                    throw WebViewFeatureInternal.getUnsupportedOperationException();
                }
            }
        } catch (Throwable th) {
            BrazeLogger.m11286h(TAG, "Failed to set dark mode WebView settings", th);
        }
        this.mMessageWebView.setWebChromeClient(new C5694a());
        return this.mMessageWebView;
    }

    public abstract int getWebViewViewId();

    public abstract /* synthetic */ boolean hasAppliedWindowInsets();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !C6861b.m13319e().f15219a) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.m11461a();
        return true;
    }

    public void setHtmlPageFinishedListener(C5674d dVar) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.mInAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(dVar);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        getMessageWebView().setWebViewClient(inAppMessageWebViewClient);
        this.mInAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public void setWebViewContent(String str, String str2) {
        getMessageWebView().loadDataWithBaseURL(C0048b.m163a(FILE_URI_SCHEME_PREFIX, str2, "/"), str, HTML_MIME_TYPE, "utf-8", (String) null);
    }

    public void setWebViewContent(String str) {
        getMessageWebView().loadDataWithBaseURL("file:///", str, HTML_MIME_TYPE, "utf-8", (String) null);
    }
}
