package com.braze.p044ui.actions;

import android.net.Uri;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$openUriWithActionViewFromPush$1 */
final class UriAction$openUriWithActionViewFromPush$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Uri $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$openUriWithActionViewFromPush$1(Uri uri) {
        super(0);
        this.$uri = uri;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$uri, "Could not find appropriate activity to open for deep link ");
    }
}
