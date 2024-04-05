package com.braze.p044ui.inappmessage.jsinterface;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$1 */
public final class C5662x2f580add extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $subscriptionType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5662x2f580add(String str) {
        super(0);
        this.$subscriptionType = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$subscriptionType, "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ");
    }
}
