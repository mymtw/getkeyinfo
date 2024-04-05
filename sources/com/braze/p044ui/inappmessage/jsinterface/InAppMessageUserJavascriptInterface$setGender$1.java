package com.braze.p044ui.inappmessage.jsinterface;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setGender$1 */
public final class InAppMessageUserJavascriptInterface$setGender$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $genderString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setGender$1(String str) {
        super(0);
        this.$genderString = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$genderString, "Failed to parse gender in Braze HTML in-app message javascript interface with gender: ");
    }
}
