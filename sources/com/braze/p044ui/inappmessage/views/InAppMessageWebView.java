package com.braze.p044ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import p114g4.C6861b;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageWebView */
public class InAppMessageWebView extends WebView {
    public InAppMessageWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !C6861b.m13319e().f15219a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InAppMessageViewUtils.m11461a();
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !C6861b.m13319e().f15219a) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.m11461a();
        return true;
    }
}
