package com.paypal.android.platform.authsdk.authcommon.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.model.DeviceInfo;
import com.paypal.pyplcheckout.BuildConfig;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p260v0.C8184a;

public final class DeviceInfoFactory {
    public static final DeviceInfoFactory INSTANCE = new DeviceInfoFactory();
    private static final SparseArray<String> deviceKeyTypes = new DeviceInfoFactory$deviceKeyTypes$1();
    private static final SparseArray<String> networkTypes = new DeviceInfoFactory$networkTypes$1();

    private DeviceInfoFactory() {
    }

    private final String lookupNetworkCarrier(TelephonyManager telephonyManager) {
        String str = "Unknown";
        if (Build.VERSION.SDK_INT <= 28) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!TextUtils.isEmpty(networkOperatorName)) {
                str = networkOperatorName;
            }
            C19383o.m32796f(str, "{\n            // Telepho…_networkCarrier\n        }");
        }
        return str;
    }

    private final String lookupNetworkType(Context context, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT > 28 || C8184a.m16458a(context.getApplicationContext(), "android.permission.READ_PHONE_STATE") == 0) {
            return "Unknown";
        }
        String str = networkTypes.get(telephonyManager.getNetworkType());
        C19383o.m32796f(str, "networkTypes.get(telephonyManager.networkType)");
        String str2 = str;
        return TextUtils.isEmpty(str2) ? "Unknown" : str2;
    }

    private final String lookupPhoneType(TelephonyManager telephonyManager) {
        String str = deviceKeyTypes.get(telephonyManager.getPhoneType());
        C19383o.m32796f(str, "deviceKeyTypes.get(telephonyManager.phoneType)");
        String str2 = str;
        return TextUtils.isEmpty(str2) ? "ANDROIDGSM_UNDEFINED" : str2;
    }

    public final DeviceInfo create(Context context) {
        boolean z;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Context applicationContext = context.getApplicationContext();
        Object systemService = context.getApplicationContext().getSystemService(ResponseConstants.PHONE);
        if (systemService != null) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            String string = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
            C19383o.m32796f(string, "getString(appContext.con…ttings.Secure.ANDROID_ID)");
            String str = Build.VERSION.RELEASE;
            C19383o.m32796f(str, BuildConfig.Build_Type);
            String str2 = Build.MANUFACTURER;
            C19383o.m32796f(str2, "MANUFACTURER");
            String str3 = Build.MODEL;
            C19383o.m32796f(str3, "MODEL");
            String lookupNetworkType = lookupNetworkType(applicationContext, telephonyManager);
            String lookupNetworkCarrier = lookupNetworkCarrier(telephonyManager);
            String str4 = Build.DEVICE;
            C19383o.m32796f(str4, "DEVICE");
            String lookupPhoneType = lookupPhoneType(telephonyManager);
            String str5 = Build.PRODUCT;
            if (!C19383o.m32792b(str5, "sdk") && !C19383o.m32792b(str5, "google_sdk")) {
                String str6 = Build.FINGERPRINT;
                C19383o.m32796f(str6, "FINGERPRINT");
                if (!C19459m.m33036e1(str6, "generic", false)) {
                    z = false;
                    return new DeviceInfo(string, (String) null, "Android", str, str2, str3, "Android", lookupNetworkType, lookupNetworkCarrier, str4, lookupPhoneType, z);
                }
            }
            z = true;
            return new DeviceInfo(string, (String) null, "Android", str, str2, str3, "Android", lookupNetworkType, lookupNetworkCarrier, str4, lookupPhoneType, z);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }
}
