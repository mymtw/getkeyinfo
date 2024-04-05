package com.etsy.android.p327ui.cart.googlepay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import androidx.profileinstaller.C3069k;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p480xb.C13869b;

/* renamed from: com.etsy.android.ui.cart.googlepay.f */
public final class C9308f {

    /* renamed from: a */
    public final C9303a f20543a;

    /* renamed from: b */
    public C13869b f20544b;

    /* renamed from: c */
    public final GooglePayDataContract f20545c;

    /* renamed from: d */
    public final C9309a f20546d = new C9309a();

    /* renamed from: e */
    public final WeakReference<Activity> f20547e;

    /* renamed from: com.etsy.android.ui.cart.googlepay.f$a */
    public final class C9309a {

        /* renamed from: a */
        public WebView f20548a;

        /* renamed from: b */
        public View f20549b;

        public C9309a() {
        }

        @JavascriptInterface
        public final void initInterface() {
            C13869b bVar = C9308f.this.f20544b;
            if (bVar != null) {
                C19383o.m32794d(bVar);
                String str = bVar.f30521a;
                C13869b bVar2 = C9308f.this.f20544b;
                C19383o.m32794d(bVar2);
                String str2 = bVar2.f30527g;
                C13869b bVar3 = C9308f.this.f20544b;
                C19383o.m32794d(bVar3);
                String str3 = bVar3.f30528h;
                WebView webView = this.f20548a;
                C19383o.m32794d(webView);
                webView.post(new C9307e(this, str, str2, str3, 0));
                C9308f.this.getClass();
            }
        }

        @JavascriptInterface
        public final void requestCardChange() {
            WebView webView = this.f20548a;
            C19383o.m32794d(webView);
            webView.post(new C9306d(0, C9308f.this, this));
        }

        @JavascriptInterface
        public final void requestPaymentData() {
            WebView webView = this.f20548a;
            C19383o.m32794d(webView);
            webView.post(new C3069k(C9308f.this, 2));
        }
    }

    public C9308f(FragmentActivity fragmentActivity, C9303a aVar, C13869b bVar, GooglePayDataContract googlePayDataContract) {
        C19383o.m32797g(fragmentActivity, "activity");
        C19383o.m32797g(aVar, "googlePayHelper");
        this.f20543a = aVar;
        this.f20544b = bVar;
        this.f20545c = googlePayDataContract;
        this.f20547e = new WeakReference<>(fragmentActivity);
    }

    /* renamed from: a */
    public final void mo31656a(int i, int i2, Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        View view = this.f20546d.f20549b;
        C19383o.m32794d(view);
        view.setVisibility(8);
        C9303a aVar = this.f20543a;
        GooglePayDataContract googlePayDataContract = this.f20545c;
        C19383o.m32794d(googlePayDataContract);
        aVar.mo31652a(context, googlePayDataContract, i, i2, intent, new GooglePayWebViewHelper$handleActivityResult$1(this));
    }
}
