package com.braze.p044ui.inappmessage.jsinterface;

import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addAlias$1 */
public final class InAppMessageUserJavascriptInterface$addAlias$1 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ String $alias;
    public final /* synthetic */ String $label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$addAlias$1(String str, String str2) {
        super(1);
        this.$alias = str;
        this.$label = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15726a(this.$alias, this.$label);
    }
}
