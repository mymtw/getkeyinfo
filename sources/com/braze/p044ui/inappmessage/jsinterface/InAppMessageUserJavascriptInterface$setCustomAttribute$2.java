package com.braze.p044ui.inappmessage.jsinterface;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomAttribute$2 */
final class InAppMessageUserJavascriptInterface$setCustomAttribute$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $jsonStringValue;
    public final /* synthetic */ String $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setCustomAttribute$2(String str, String str2) {
        super(0);
        this.$key = str;
        this.$jsonStringValue = str2;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Failed to parse custom attribute type for key: ");
        h.append(this.$key);
        h.append(" and json string value: ");
        h.append(this.$jsonStringValue);
        return h.toString();
    }
}
