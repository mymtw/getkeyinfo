package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: com.appsflyer.internal.d */
final class C5085d {
    private IntentFilter AFInAppEventType = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.d$b */
    public static final class C5086b {
        public final float AFInAppEventType;
        public final String values;

        public C5086b(float f, String str) {
            this.AFInAppEventType = f;
            this.values = str;
        }
    }

    /* renamed from: com.appsflyer.internal.d$e */
    public static final class C5087e {
        public static final C5085d AFInAppEventType = new C5085d();
    }

    public final C5086b AFKeystoreWrapper(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.AFInAppEventType);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra(ResponseConstants.STATUS, -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : Constants.APPBOY_PUSH_ACCENT_KEY;
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra(ResponseConstants.SCALE, -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C5086b(f, str);
    }
}
