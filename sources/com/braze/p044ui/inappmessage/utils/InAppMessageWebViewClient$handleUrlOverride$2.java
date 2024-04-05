package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$2 */
public final class InAppMessageWebViewClient$handleUrlOverride$2 extends Lambda implements C19846a<String> {
    public static final InAppMessageWebViewClient$handleUrlOverride$2 INSTANCE = new InAppMessageWebViewClient$handleUrlOverride$2();

    public InAppMessageWebViewClient$handleUrlOverride$2() {
        super(0);
    }

    public final String invoke() {
        return "InAppMessageWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true.";
    }
}
