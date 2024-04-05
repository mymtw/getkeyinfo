package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$markPageFinished$1$1 */
public final class InAppMessageWebViewClient$markPageFinished$1$1 extends Lambda implements C19846a<String> {
    public static final InAppMessageWebViewClient$markPageFinished$1$1 INSTANCE = new InAppMessageWebViewClient$markPageFinished$1$1();

    public InAppMessageWebViewClient$markPageFinished$1$1() {
        super(0);
    }

    public final String invoke() {
        return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
    }
}
