package com.braze.p044ui.inappmessage.jsinterface;

import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1 */
public final class InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1(String str, String str2) {
        super(1);
        this.$key = str;
        this.$value = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15727b(this.$key, this.$value);
    }
}
