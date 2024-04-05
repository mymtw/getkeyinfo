package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.preference.C3039b;
import com.appboy.enums.NotificationSubscriptionType;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep */
public final class SetPushNotificationSubscriptionStep extends C3039b {

    /* renamed from: c */
    public static final SetPushNotificationSubscriptionStep f12026c;

    static {
        SetPushNotificationSubscriptionStep setPushNotificationSubscriptionStep = new SetPushNotificationSubscriptionStep();
        f12026c = setPushNotificationSubscriptionStep;
        BrazeLogger.m11280b(setPushNotificationSubscriptionStep);
    }

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        return StepData.m11410c(stepData, 1, (C20057i) null, 2) && stepData.mo16200d(0);
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        NotificationSubscriptionType fromValue = NotificationSubscriptionType.Companion.fromValue(String.valueOf(stepData.mo16199b()));
        if (fromValue == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new SetPushNotificationSubscriptionStep$run$1(stepData), 7);
            return;
        }
        Braze.f11170m.mo15515f(context).mo15498m(new BaseBrazeActionStep$Companion$runOnUser$1(new SetPushNotificationSubscriptionStep$run$2(fromValue)));
    }
}
