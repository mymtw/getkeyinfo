package com.braze.p044ui.actions;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$openUriWithActionView$1 */
final class UriAction$openUriWithActionView$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Bundle $extras;
    public final /* synthetic */ Uri $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$openUriWithActionView$1(Uri uri, Bundle bundle) {
        super(0);
        this.$uri = uri;
        this.$extras = bundle;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Failed to handle uri ");
        h.append(this.$uri);
        h.append(" with extras: ");
        h.append(this.$extras);
        return h.toString();
    }
}
