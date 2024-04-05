package com.etsy.android.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

public final class SocialShareBroadcastReceiver extends BroadcastReceiver {
    public static final int $stable = 8;
    public static final C8985a Companion = new C8985a();
    public static final int REQUEST_CODE = 0;
    public C8672b analyticsTracker;

    /* renamed from: com.etsy.android.share.SocialShareBroadcastReceiver$a */
    public static final class C8985a {
    }

    public final C8672b getAnalyticsTracker() {
        C8672b bVar = this.analyticsTracker;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("analyticsTracker");
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        C0761x.m1734m0(this, context);
        C8672b analyticsTracker2 = getAnalyticsTracker();
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.TARGET_NAME;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        analyticsTracker2.mo21333d("share_target_tapped", C19421p.m32931U(new Pair(predefinedAnalyticsProperty, componentName != null ? componentName.getPackageName() : null)));
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.analyticsTracker = bVar;
    }
}
