package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.auto.value.AutoValue;
import p132hh.C6963a;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.d */
public abstract class C6529d {
    private static final String DEFAULT_BACKEND_NAME = "cct";

    public static C6529d create(Context context, C6963a aVar, C6963a aVar2) {
        return new AutoValue_CreationContext(context, aVar, aVar2, DEFAULT_BACKEND_NAME);
    }

    public abstract Context getApplicationContext();

    public abstract String getBackendName();

    public abstract C6963a getMonotonicClock();

    public abstract C6963a getWallClock();

    public static C6529d create(Context context, C6963a aVar, C6963a aVar2, String str) {
        return new AutoValue_CreationContext(context, aVar, aVar2, str);
    }
}
