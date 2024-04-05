package com.braze.p044ui.inappmessage.jsinterface;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setDateOfBirth$1 */
public final class InAppMessageUserJavascriptInterface$setDateOfBirth$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $monthInt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setDateOfBirth$1(int i) {
        super(0);
        this.$monthInt = i;
    }

    public final String invoke() {
        return C19383o.m32802l(Integer.valueOf(this.$monthInt), "Failed to parse month for value ");
    }
}
