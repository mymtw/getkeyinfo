package com.braze.p044ui.actions.brazeactions.steps;

import com.appboy.enums.NotificationSubscriptionType;
import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep$run$2 */
public final class SetPushNotificationSubscriptionStep$run$2 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ NotificationSubscriptionType $subscriptionType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetPushNotificationSubscriptionStep$run$2(NotificationSubscriptionType notificationSubscriptionType) {
        super(1);
        this.$subscriptionType = notificationSubscriptionType;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15748x(this.$subscriptionType);
    }
}
