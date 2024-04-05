package com.braze.p044ui.actions.brazeactions;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$4 */
public final class BrazeActionParser$execute$4 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Uri $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$execute$4(Uri uri) {
        super(0);
        this.$uri = uri;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Failed to parse uri as a Braze Action.\n'");
        h.append(this.$uri);
        h.append('\'');
        return h.toString();
    }
}
