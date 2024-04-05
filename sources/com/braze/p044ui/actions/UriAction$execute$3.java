package com.braze.p044ui.actions;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$execute$3 */
public final class UriAction$execute$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ UriAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$execute$3(UriAction uriAction) {
        super(0);
        this.this$0 = uriAction;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Executing Uri action from channel ");
        h.append(this.this$0.f12015b);
        h.append(": ");
        h.append(this.this$0.f12016c);
        h.append(". UseWebView: ");
        h.append(this.this$0.f12017d);
        h.append(". Extras: ");
        h.append(this.this$0.f12014a);
        return h.toString();
    }
}
