package com.braze.p044ui;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1 */
public final class BrazeWebViewActivity$createWebChromeClient$1 extends WebChromeClient {
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C19383o.m32797g(consoleMessage, "cm");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1(consoleMessage), 7);
        return true;
    }
}
