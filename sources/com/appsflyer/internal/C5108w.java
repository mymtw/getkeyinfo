package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: com.appsflyer.internal.w */
final class C5108w {

    /* renamed from: com.appsflyer.internal.w$e */
    public static final class C5109e {
        public static final C5108w valueOf = new C5108w();
    }

    private static boolean AFInAppEventType(Context context, String[] strArr) {
        for (String values : strArr) {
            if (C4964aa.values(context, values)) {
                return true;
            }
        }
        return false;
    }

    public final Location AFInAppEventType(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Location lastKnownLocation = AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if (lastKnownLocation2 != null || lastKnownLocation == null) {
                if ((lastKnownLocation == null && lastKnownLocation2 != null) || DateUtils.MILLIS_PER_MINUTE >= lastKnownLocation.getTime() - lastKnownLocation2.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
