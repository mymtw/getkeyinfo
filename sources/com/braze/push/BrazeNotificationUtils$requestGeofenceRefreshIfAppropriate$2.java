package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2 INSTANCE = new BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2();

    public BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2() {
        super(0);
    }

    public final String invoke() {
        return "Geofence sync key not included in push payload or false. Not syncing geofences.";
    }
}
