package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum Field$Cardinality implements C16935v.C16936a {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);
    
    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final C16935v.C16937b<Field$Cardinality> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.Field$Cardinality$a */
    public static class C16833a implements C16935v.C16937b<Field$Cardinality> {
    }

    /* renamed from: com.google.protobuf.Field$Cardinality$b */
    public static final class C16834b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16834b f37152a = null;

        static {
            f37152a = new C16834b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return Field$Cardinality.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16833a();
    }

    private Field$Cardinality(int i) {
        this.value = i;
    }

    public static Field$Cardinality forNumber(int i) {
        if (i == 0) {
            return CARDINALITY_UNKNOWN;
        }
        if (i == 1) {
            return CARDINALITY_OPTIONAL;
        }
        if (i == 2) {
            return CARDINALITY_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return CARDINALITY_REPEATED;
    }

    public static C16935v.C16937b<Field$Cardinality> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16834b.f37152a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Field$Cardinality valueOf(int i) {
        return forNumber(i);
    }
}
