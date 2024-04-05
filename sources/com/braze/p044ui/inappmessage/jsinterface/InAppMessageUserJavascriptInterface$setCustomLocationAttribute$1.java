package com.braze.p044ui.inappmessage.jsinterface;

import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1 */
public final class InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ String $attribute;
    public final /* synthetic */ double $latitude;
    public final /* synthetic */ double $longitude;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1(String str, double d, double d2) {
        super(1);
        this.$attribute = str;
        this.$latitude = d;
        this.$longitude = d2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15746v(this.$attribute, this.$latitude, this.$longitude);
    }
}
