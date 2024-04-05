package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.C4986ag;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            try {
                str = intent.getStringExtra("referrer");
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper("error in BroadcastReceiver ", th);
                str = null;
            }
            if (str == null || C4986ag.AFInAppEventParameterName(context).getString("referrer", (String) null) == null) {
                String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
                long currentTimeMillis = System.currentTimeMillis();
                if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= NetworkRetryInterceptor.DEFAULT_RETRY_DELAY) {
                    AFLogger.AFInAppEventType("SingleInstallBroadcastReceiver called");
                    C4986ag.AFInAppEventType().AFInAppEventType(context, intent);
                    AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            C4986ag.AFInAppEventType().AFInAppEventType(context, str);
        }
    }
}
