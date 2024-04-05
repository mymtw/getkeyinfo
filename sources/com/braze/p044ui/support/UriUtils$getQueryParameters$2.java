package com.braze.p044ui.support;

import android.net.Uri;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

/* renamed from: com.braze.ui.support.UriUtils$getQueryParameters$2 */
public final class UriUtils$getQueryParameters$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Ref$ObjectRef<Uri> $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriUtils$getQueryParameters$2(Ref$ObjectRef<Uri> ref$ObjectRef) {
        super(0);
        this.$uri = ref$ObjectRef;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$uri.element, "Failed to map the query parameters of Uri: ");
    }
}
