package com.braze.p044ui.support;

import android.net.Uri;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

/* renamed from: com.braze.ui.support.UriUtils$getQueryParameters$1 */
public final class UriUtils$getQueryParameters$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Ref$ObjectRef<Uri> $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriUtils$getQueryParameters$1(Ref$ObjectRef<Uri> ref$ObjectRef) {
        super(0);
        this.$uri = ref$ObjectRef;
    }

    public final String invoke() {
        return C0071c.m192d(C0072d.m201h("Encoded query is null for Uri: "), this.$uri.element, " Returning empty map for query parameters");
    }
}
