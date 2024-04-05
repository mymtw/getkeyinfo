package com.braze.p044ui;

import android.support.p013v4.media.C0072d;
import android.webkit.ConsoleMessage;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1 */
public final class BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ ConsoleMessage $cm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1(ConsoleMessage consoleMessage) {
        super(0);
        this.$cm = consoleMessage;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Braze WebView Activity log. Line: ");
        h.append(this.$cm.lineNumber());
        h.append(". SourceId: ");
        h.append(this.$cm.sourceId());
        h.append(". Log Level: ");
        h.append(this.$cm.messageLevel());
        h.append(". Message: ");
        h.append(this.$cm.message());
        return h.toString();
    }
}
