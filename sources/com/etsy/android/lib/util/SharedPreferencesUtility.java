package com.etsy.android.lib.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.datatypes.EtsyId;

@Deprecated
public final class SharedPreferencesUtility {

    public enum WriteMode {
        MERGE,
        OVERWRITE
    }

    /* renamed from: a */
    public static EtsyId m17314a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("EtsyUserPrefs", 0);
        return sharedPreferences.contains("etsyUserId") ? new EtsyId(String.valueOf(sharedPreferences.getInt("etsyUserId", -1))) : new EtsyId(sharedPreferences.getString("etsyUserIdString", ""));
    }
}
