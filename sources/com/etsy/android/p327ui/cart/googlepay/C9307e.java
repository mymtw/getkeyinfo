package com.etsy.android.p327ui.cart.googlepay;

import android.view.View;
import android.webkit.WebView;
import com.braze.p044ui.inappmessage.utils.InAppMessageWebViewClient;
import com.etsy.android.p327ui.cart.googlepay.C9308f;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p595ji.C17993e;

/* renamed from: com.etsy.android.ui.cart.googlepay.e */
public final /* synthetic */ class C9307e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f20538b;

    /* renamed from: c */
    public final /* synthetic */ Object f20539c;

    /* renamed from: d */
    public final /* synthetic */ Object f20540d;

    /* renamed from: e */
    public final /* synthetic */ Object f20541e;

    /* renamed from: f */
    public final /* synthetic */ Object f20542f;

    public /* synthetic */ C9307e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f20538b = i;
        this.f20539c = obj;
        this.f20540d = obj2;
        this.f20541e = obj3;
        this.f20542f = obj4;
    }

    public final void run() {
        switch (this.f20538b) {
            case 0:
                C9308f.C9309a aVar = (C9308f.C9309a) this.f20539c;
                String str = (String) this.f20540d;
                String str2 = (String) this.f20541e;
                String str3 = (String) this.f20542f;
                C19383o.m32797g(aVar, "this$0");
                C19383o.m32797g(str, "$paymentDesc");
                C19383o.m32797g(str2, "$cardType");
                C19383o.m32797g(str3, "$cardDetails");
                StringBuilder sb = new StringBuilder();
                sb.append("Etsy.GooglePay.bindGooglePayData('");
                sb.append(str);
                sb.append("', '");
                sb.append(str2);
                sb.append("', '");
                String k = C0023f.m110k(sb, str3, "');");
                WebView webView = aVar.f20548a;
                C19383o.m32794d(webView);
                webView.loadUrl(InAppMessageWebViewClient.JAVASCRIPT_PREFIX + k);
                View view = aVar.f20549b;
                C19383o.m32794d(view);
                view.setVisibility(8);
                return;
            default:
                ((C14347j) this.f20540d).mo47689r(((C14347j.C14348a) this.f20539c).f32161a, (C14344i.C14345a) this.f20541e, (C17993e) this.f20542f);
                return;
        }
    }
}
