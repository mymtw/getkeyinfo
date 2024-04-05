package com.braze.p044ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.C2348w0;
import com.appboy.p043ui.C4940R;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageHtmlView */
public class InAppMessageHtmlView extends InAppMessageHtmlBaseView {
    public InAppMessageHtmlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void applyWindowInsets(C2348w0 w0Var) {
    }

    public int getWebViewViewId() {
        return C4940R.C4942id.com_braze_inappmessage_html_webview;
    }

    public boolean hasAppliedWindowInsets() {
        return true;
    }
}
