package com.braze.p044ui.actions;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$execute$2 */
public final class UriAction$execute$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ UriAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$execute$2(UriAction uriAction) {
        super(0);
        this.this$0 = uriAction;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Executing BrazeActions uri:\n'");
        h.append(this.this$0.f12016c);
        h.append('\'');
        return h.toString();
    }
}
