package p241t2;

import android.annotation.SuppressLint;
import android.webkit.SafeBrowsingResponse;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p231s2.C7803a;
import p241t2.C7943d;
import p760nr.C19921a;

/* renamed from: t2.b */
public final class C7941b extends C7803a {

    /* renamed from: a */
    public SafeBrowsingResponse f17410a;

    /* renamed from: b */
    public SafeBrowsingResponseBoundaryInterface f17411b;

    public C7941b(InvocationHandler invocationHandler) {
        this.f17411b = (SafeBrowsingResponseBoundaryInterface) C19921a.m34065a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final void mo20346a() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            if (this.f17410a == null) {
                C7949h hVar = C7943d.C7944a.f17414a;
                this.f17410a = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) hVar.f17418a).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f17411b));
            }
            this.f17410a.showInterstitial(true);
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            if (this.f17411b == null) {
                C7949h hVar2 = C7943d.C7944a.f17414a;
                this.f17411b = (SafeBrowsingResponseBoundaryInterface) C19921a.m34065a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) hVar2.f17418a).convertSafeBrowsingResponse((Object) this.f17410a));
            }
            this.f17411b.showInterstitial(true);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public C7941b(SafeBrowsingResponse safeBrowsingResponse) {
        this.f17410a = safeBrowsingResponse;
    }
}
