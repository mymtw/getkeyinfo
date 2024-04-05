package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$onRenderProcessGone$1 */
public final class InAppMessageWebViewClient$onRenderProcessGone$1 extends Lambda implements C19846a<String> {
    public static final InAppMessageWebViewClient$onRenderProcessGone$1 INSTANCE = new InAppMessageWebViewClient$onRenderProcessGone$1();

    public InAppMessageWebViewClient$onRenderProcessGone$1() {
        super(0);
    }

    public final String invoke() {
        return "The webview rendering process crashed, returning true";
    }
}
