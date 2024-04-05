package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum Field$Kind implements C16935v.C16936a {
    TYPE_UNKNOWN(0),
    TYPE_DOUBLE(1),
    TYPE_FLOAT(2),
    TYPE_INT64(3),
    TYPE_UINT64(4),
    TYPE_INT32(5),
    TYPE_FIXED64(6),
    TYPE_FIXED32(7),
    TYPE_BOOL(8),
    TYPE_STRING(9),
    TYPE_GROUP(10),
    TYPE_MESSAGE(11),
    TYPE_BYTES(12),
    TYPE_UINT32(13),
    TYPE_ENUM(14),
    TYPE_SFIXED32(15),
    TYPE_SFIXED64(16),
    TYPE_SINT32(17),
    TYPE_SINT64(18),
    UNRECOGNIZED(-1);
    
    public static final int TYPE_BOOL_VALUE = 8;
    public static final int TYPE_BYTES_VALUE = 12;
    public static final int TYPE_DOUBLE_VALUE = 1;
    public static final int TYPE_ENUM_VALUE = 14;
    public static final int TYPE_FIXED32_VALUE = 7;
    public static final int TYPE_FIXED64_VALUE = 6;
    public static final int TYPE_FLOAT_VALUE = 2;
    public static final int TYPE_GROUP_VALUE = 10;
    public static final int TYPE_INT32_VALUE = 5;
    public static final int TYPE_INT64_VALUE = 3;
    public static final int TYPE_MESSAGE_VALUE = 11;
    public static final int TYPE_SFIXED32_VALUE = 15;
    public static final int TYPE_SFIXED64_VALUE = 16;
    public static final int TYPE_SINT32_VALUE = 17;
    public static final int TYPE_SINT64_VALUE = 18;
    public static final int TYPE_STRING_VALUE = 9;
    public static final int TYPE_UINT32_VALUE = 13;
    public static final int TYPE_UINT64_VALUE = 4;
    public static final int TYPE_UNKNOWN_VALUE = 0;
    private static final C16935v.C16937b<Field$Kind> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.Field$Kind$a */
    public static class C16835a implements C16935v.C16937b<Field$Kind> {
    }

    /* renamed from: com.google.protobuf.Field$Kind$b */
    public static final class C16836b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16836b f37153a = null;

        static {
            f37153a = new C16836b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return Field$Kind.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16835a();
    }

    private Field$Kind(int i) {
        this.value = i;
    }

    public static Field$Kind forNumber(int i) {
        switch (i) {
            case 0:
                return TYPE_UNKNOWN;
            case 1:
                return TYPE_DOUBLE;
            case 2:
                return TYPE_FLOAT;
            case 3:
                return TYPE_INT64;
            case 4:
                return TYPE_UINT64;
            case 5:
                return TYPE_INT32;
            case 6:
                return TYPE_FIXED64;
            case 7:
                return TYPE_FIXED32;
            case 8:
                return TYPE_BOOL;
            case 9:
                return TYPE_STRING;
            case 10:
                return TYPE_GROUP;
            case 11:
                return TYPE_MESSAGE;
            case 12:
                return TYPE_BYTES;
            case 13:
                return TYPE_UINT32;
            case 14:
                return TYPE_ENUM;
            case 15:
                return TYPE_SFIXED32;
            case 16:
                return TYPE_SFIXED64;
            case 17:
                return TYPE_SINT32;
            case 18:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<Field$Kind> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16836b.f37153a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Field$Kind valueOf(int i) {
        return forNumber(i);
    }
}
