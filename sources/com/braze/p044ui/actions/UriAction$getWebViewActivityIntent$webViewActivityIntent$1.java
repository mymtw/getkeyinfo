package com.braze.p044ui.actions;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$getWebViewActivityIntent$webViewActivityIntent$1 */
public final class UriAction$getWebViewActivityIntent$webViewActivityIntent$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $customWebViewActivityClassName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$getWebViewActivityIntent$webViewActivityIntent$1(String str) {
        super(0);
        this.$customWebViewActivityClassName = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$customWebViewActivityClassName, "Launching custom WebView Activity with class name: ");
    }
}
