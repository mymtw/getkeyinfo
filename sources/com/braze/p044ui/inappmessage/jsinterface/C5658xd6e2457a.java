package com.braze.p044ui.inappmessage.jsinterface;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$1 */
public final class C5658xd6e2457a extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5658xd6e2457a(String str) {
        super(0);
        this.$key = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$key, "Failed to set custom attribute array for key ");
    }
}
