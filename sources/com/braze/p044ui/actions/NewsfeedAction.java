package com.braze.p044ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.p043ui.activities.AppboyFeedActivity;
import com.appsflyer.AppsFlyerProperties;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.actions.NewsfeedAction */
public final class NewsfeedAction implements C5623a {

    /* renamed from: a */
    public final Bundle f12013a;

    public NewsfeedAction(Bundle bundle, Channel channel) {
        C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
        this.f12013a = bundle;
    }

    /* renamed from: a */
    public final void mo16178a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            Intent intent = new Intent(context, AppboyFeedActivity.class);
            Bundle bundle = this.f12013a;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, NewsfeedAction$execute$1.INSTANCE, 4);
        }
    }
}
