package com.braze.p044ui.inappmessage.jsinterface;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$parseProperties$1 */
public final class InAppMessageJavascriptInterface$parseProperties$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $propertiesJSON;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface$parseProperties$1(String str) {
        super(0);
        this.$propertiesJSON = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$propertiesJSON, "Failed to parse properties JSON String: ");
    }
}
