package androidx.webkit;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p231s2.C7803a;
import p231s2.C7805c;
import p241t2.C7941b;
import p241t2.C7942c;
import p241t2.C7943d;
import p241t2.C7949h;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, (C7805c) new C7942c(invocationHandler));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i, (C7803a) new C7941b(invocationHandler));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceRequest, (C7805c) new C7942c(webResourceError));
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i, (C7803a) new C7941b(safeBrowsingResponse));
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, C7805c cVar) {
        int i;
        CharSequence charSequence;
        if (WebViewFeatureInternal.isSupported("WEB_RESOURCE_ERROR_GET_CODE") && WebViewFeatureInternal.isSupported("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            C7942c cVar2 = (C7942c) cVar;
            cVar2.getClass();
            WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE;
            if (webViewFeatureInternal.isSupportedByFramework()) {
                if (cVar2.f17412a == null) {
                    C7949h hVar = C7943d.C7944a.f17414a;
                    cVar2.f17412a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) hVar.f17418a).convertWebResourceError(Proxy.getInvocationHandler(cVar2.f17413b));
                }
                i = cVar2.f17412a.getErrorCode();
            } else if (webViewFeatureInternal.isSupportedByWebView()) {
                i = cVar2.mo20480a().getErrorCode();
            } else {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            WebViewFeatureInternal webViewFeatureInternal2 = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION;
            if (webViewFeatureInternal2.isSupportedByFramework()) {
                if (cVar2.f17412a == null) {
                    C7949h hVar2 = C7943d.C7944a.f17414a;
                    cVar2.f17412a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) hVar2.f17418a).convertWebResourceError(Proxy.getInvocationHandler(cVar2.f17413b));
                }
                charSequence = cVar2.f17412a.getDescription();
            } else if (webViewFeatureInternal2.isSupportedByWebView()) {
                charSequence = cVar2.mo20480a().getDescription();
            } else {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            onReceivedError(webView, i, charSequence.toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, C7803a aVar) {
        if (WebViewFeatureInternal.isSupported("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            aVar.mo20346a();
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
