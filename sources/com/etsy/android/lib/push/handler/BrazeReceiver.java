package com.etsy.android.lib.push.handler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0761x;
import com.appboy.Constants;
import com.braze.push.BrazeNotificationUtils;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p346fa.C12703a;
import p568fn.C17782b;

public final class BrazeReceiver extends BroadcastReceiver {
    public static final int $stable = 8;
    public C8618c etsyConfigMap;
    public C12703a grafana;
    public C8694h logcat;

    private final void logNotificationDuration(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey(Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
            long j = extras.getLong(Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - j);
            C8694h logcat2 = getLogcat();
            logcat2.mo21310e("Notification active for " + seconds + " seconds.");
        }
    }

    public final C8618c getEtsyConfigMap() {
        C8618c cVar = this.etsyConfigMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("etsyConfigMap");
        throw null;
    }

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final C8694h getLogcat() {
        C8694h hVar = this.logcat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logcat");
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        C0761x.m1734m0(this, context);
        String action = intent.getAction();
        getLogcat().mo21310e("Received intent with action " + action);
        logNotificationDuration(intent);
        if (C19383o.m32792b(action, Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED)) {
            getLogcat().mo21310e("Received push notification.");
        } else if (C19383o.m32792b(action, Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED)) {
            BrazeNotificationUtils.m11202d(context, intent);
        } else if (C19383o.m32792b(action, Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED)) {
            getLogcat().mo21310e("Received push notification deleted intent.");
        } else {
            if (getEtsyConfigMap().mo21132b(C8592b.f18832t1)) {
                if (action != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < action.length(); i++) {
                        char charAt = action.charAt(i);
                        if (!C17782b.m29863c0(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    C19383o.m32796f(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
                    str = ClassUtils.PACKAGE_SEPARATOR_CHAR + sb2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                getGrafana().mo45474a("braze.unsupportedaction" + str);
            }
            getLogcat().mo21310e("Ignoring intent with unsupported action " + action);
        }
    }

    public final void setEtsyConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.etsyConfigMap = cVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setLogcat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logcat = hVar;
    }
}
