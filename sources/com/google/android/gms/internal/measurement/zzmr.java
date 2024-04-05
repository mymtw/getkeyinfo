package com.google.android.gms.internal.measurement;

public enum zzmr {
    DOUBLE(zzms.DOUBLE, 1),
    FLOAT(zzms.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzms.BOOLEAN, 0),
    STRING(zzms.STRING, 2),
    GROUP(r13, 3),
    zzk(r13, 2),
    BYTES(zzms.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzms.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzms zzt;

    private zzmr(zzms zzms, int i) {
        this.zzt = zzms;
    }

    public final zzms zza() {
        return this.zzt;
    }
}
