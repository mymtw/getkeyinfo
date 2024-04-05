package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import android.view.View;
import android.widget.ImageView;
import com.paypal.android.platform.authsdk.C17049R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.WebViewFragment$logoIV$2 */
public final class WebViewFragment$logoIV$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ WebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewFragment$logoIV$2(WebViewFragment webViewFragment) {
        super(0);
        this.this$0 = webViewFragment;
    }

    public final ImageView invoke() {
        View view = this.this$0.getView();
        if (view == null) {
            return null;
        }
        return (ImageView) view.findViewById(C17049R.C17051id.iv_logo);
    }
}
