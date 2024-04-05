package com.google.protobuf;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(ShadowDrawableWrapper.COS_45)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ByteString.EMPTY),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object defaultDefault;

    private WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
