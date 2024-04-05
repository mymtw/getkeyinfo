package com.google.android.gms.internal.measurement;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public enum zzms {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(ShadowDrawableWrapper.COS_45)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzix.zzb),
    ENUM((String) null),
    zzi((String) null);
    
    private final Object zzk;

    private zzms(Object obj) {
        this.zzk = obj;
    }
}
