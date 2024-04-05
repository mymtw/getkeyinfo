package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import p231s2.C7806d;
import p241t2.C7948g;

public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    private C7806d mWebViewRenderProcessClient;

    public WebViewRenderProcessClientFrameworkAdapter(C7806d dVar) {
    }

    public C7806d getFrameworkRenderProcessClient() {
        return null;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        if (C7948g.f17417a.get(webViewRenderProcess) == null) {
            C7948g.f17417a.put(webViewRenderProcess, new C7948g(webViewRenderProcess));
        }
        throw null;
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        if (C7948g.f17417a.get(webViewRenderProcess) == null) {
            C7948g.f17417a.put(webViewRenderProcess, new C7948g(webViewRenderProcess));
        }
        throw null;
    }
}
