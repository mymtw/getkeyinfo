package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.C4986ag;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
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
                AFLogger.AFInAppEventType("MultipleInstallBroadcastReceiver called");
                C4986ag.AFInAppEventType().AFInAppEventType(context, intent);
                for (ResolveInfo next : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
                    String action = intent.getAction();
                    if (next.activityInfo.packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(next.activityInfo.name)) {
                        StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
                        sb.append(next.activityInfo.name);
                        AFLogger.AFInAppEventType(sb.toString());
                        try {
                            ((BroadcastReceiver) Class.forName(next.activityInfo.name).newInstance()).onReceive(context, intent);
                        } catch (Throwable th2) {
                            StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                            sb2.append(next.activityInfo.name);
                            AFLogger.AFKeystoreWrapper(sb2.toString(), th2);
                        }
                    }
                }
                return;
            }
            C4986ag.AFInAppEventType().AFInAppEventType(context, str);
        }
    }
}
