package com.appboy.services;

import android.content.Context;
import com.braze.Braze;
import com.braze.support.BrazeLogger;

@Deprecated
public class AppboyLocationService {
    private static final String TAG = BrazeLogger.m11287i(AppboyLocationService.class);

    @Deprecated
    public static void requestInitialization(Context context) {
        BrazeLogger.m11285g(TAG, "Location permissions were granted. Requesting geofence and location initialization.");
        Braze.f11170m.mo15515f(context).mo15484A();
    }
}
