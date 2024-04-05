package com.google.api;

import com.google.protobuf.C16935v;

public enum Property$PropertyType implements C16935v.C16936a {
    UNSPECIFIED(0),
    INT64(1),
    BOOL(2),
    STRING(3),
    DOUBLE(4),
    UNRECOGNIZED(-1);
    
    public static final int BOOL_VALUE = 2;
    public static final int DOUBLE_VALUE = 4;
    public static final int INT64_VALUE = 1;
    public static final int STRING_VALUE = 3;
    public static final int UNSPECIFIED_VALUE = 0;
    private static final C16935v.C16937b<Property$PropertyType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.Property$PropertyType$a */
    public class C15754a implements C16935v.C16937b<Property$PropertyType> {
    }

    /* renamed from: com.google.api.Property$PropertyType$b */
    public static final class C15755b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15755b f35538a = null;

        static {
            f35538a = new C15755b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return Property$PropertyType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15754a();
    }

    private Property$PropertyType(int i) {
        this.value = i;
    }

    public static Property$PropertyType forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return INT64;
        }
        if (i == 2) {
            return BOOL;
        }
        if (i == 3) {
            return STRING;
        }
        if (i != 4) {
            return null;
        }
        return DOUBLE;
    }

    public static C16935v.C16937b<Property$PropertyType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15755b.f35538a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Property$PropertyType valueOf(int i) {
        return forNumber(i);
    }
}
