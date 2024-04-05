package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: com.appsflyer.internal.y */
final class C5112y {

    /* renamed from: com.appsflyer.internal.y$c */
    public static final class C5113c {
        public static final C5112y values = new C5112y();
    }

    /* renamed from: com.appsflyer.internal.y$e */
    public static final class C5114e {
        public final String AFInAppEventType;
        public final String valueOf;
        public final String values;

        public C5114e(String str, String str2, String str3) {
            this.values = str;
            this.AFInAppEventType = str2;
            this.valueOf = str3;
        }
    }

    public static C5114e AFInAppEventParameterName(Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "unknown";
        String str5 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!AFInAppEventType(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str4 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str4 = "MOBILE";
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(ResponseConstants.PHONE);
            str = telephonyManager.getSimOperatorName();
            try {
                str2 = telephonyManager.getNetworkOperatorName();
                if ((str2 == null || str2.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str2 = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                String str6 = str;
                str3 = null;
                str5 = str6;
                AFLogger.AFKeystoreWrapper("Exception while collecting network info. ", th);
                String str7 = str3;
                str = str5;
                str2 = str7;
                return new C5114e(str4, str2, str);
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = null;
            AFLogger.AFKeystoreWrapper("Exception while collecting network info. ", th);
            String str72 = str3;
            str = str5;
            str2 = str72;
            return new C5114e(str4, str2, str);
        }
        return new C5114e(str4, str2, str);
    }

    private static boolean AFInAppEventType(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
