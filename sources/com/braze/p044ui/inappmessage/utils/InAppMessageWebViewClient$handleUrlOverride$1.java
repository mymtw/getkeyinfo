package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$1 */
public final class InAppMessageWebViewClient$handleUrlOverride$1 extends Lambda implements C19846a<String> {
    public static final InAppMessageWebViewClient$handleUrlOverride$1 INSTANCE = new InAppMessageWebViewClient$handleUrlOverride$1();

    public InAppMessageWebViewClient$handleUrlOverride$1() {
        super(0);
    }

    public final String invoke() {
        return "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
    }
}
