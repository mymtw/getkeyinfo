package com.appsflyer.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.v */
public final class C5107v {
    public final boolean AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final Map<String, String> AFKeystoreWrapper;
    public final String valueOf;
    public final byte[] values;

    public C5107v() {
    }

    public C5107v(String str, byte[] bArr, String str2, Map<String, String> map) {
        this.AFInAppEventType = str;
        this.values = bArr;
        this.valueOf = str2;
        this.AFKeystoreWrapper = map;
        this.AFInAppEventParameterName = false;
    }

    public static Map<String, String> AFInAppEventType(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put(ResponseConstants.SIZE, String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }
}
