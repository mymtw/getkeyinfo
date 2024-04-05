package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import p231s2.C7804b;

public class FrameworkServiceWorkerClient extends ServiceWorkerClient {
    private final C7804b mImpl;

    public FrameworkServiceWorkerClient(C7804b bVar) {
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        throw null;
    }
}
