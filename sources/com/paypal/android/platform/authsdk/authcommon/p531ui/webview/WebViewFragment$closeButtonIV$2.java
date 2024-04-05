package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import android.view.View;
import android.widget.ImageView;
import com.paypal.android.platform.authsdk.C17049R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.WebViewFragment$closeButtonIV$2 */
public final class WebViewFragment$closeButtonIV$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ WebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewFragment$closeButtonIV$2(WebViewFragment webViewFragment) {
        super(0);
        this.this$0 = webViewFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m35121invoke$lambda0(WebViewFragment webViewFragment, View view) {
        C19383o.m32797g(webViewFragment, "this$0");
        webViewFragment.getViewModel().onClose();
    }

    public final ImageView invoke() {
        View view = this.this$0.getView();
        ImageView imageView = view == null ? null : (ImageView) view.findViewById(C17049R.C17051id.iv_close);
        if (imageView != null) {
            imageView.setOnClickListener(new C17067b(this.this$0));
        }
        return imageView;
    }
}
