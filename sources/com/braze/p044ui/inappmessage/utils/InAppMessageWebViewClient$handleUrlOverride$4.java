package com.braze.p044ui.inappmessage.utils;

import android.net.Uri;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$4 */
public final class InAppMessageWebViewClient$handleUrlOverride$4 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Uri $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageWebViewClient$handleUrlOverride$4(Uri uri) {
        super(0);
        this.$uri = uri;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$uri, "Uri scheme was null or not an appboy url. Uri: ");
    }
}
