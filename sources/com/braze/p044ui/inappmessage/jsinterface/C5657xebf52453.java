package com.braze.p044ui.inappmessage.jsinterface;

import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$removeFromSubscriptionGroup$1 */
public final class C5657xebf52453 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ String $subscriptionGroupId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5657xebf52453(String str) {
        super(1);
        this.$subscriptionGroupId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15730f(this.$subscriptionGroupId);
    }
}
