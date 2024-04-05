package com.google.api;

import com.google.protobuf.C16935v;

public enum FieldBehavior implements C16935v.C16936a {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);
    
    public static final int FIELD_BEHAVIOR_UNSPECIFIED_VALUE = 0;
    public static final int IMMUTABLE_VALUE = 5;
    public static final int INPUT_ONLY_VALUE = 4;
    public static final int OPTIONAL_VALUE = 1;
    public static final int OUTPUT_ONLY_VALUE = 3;
    public static final int REQUIRED_VALUE = 2;
    private static final C16935v.C16937b<FieldBehavior> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.FieldBehavior$a */
    public class C15744a implements C16935v.C16937b<FieldBehavior> {
    }

    /* renamed from: com.google.api.FieldBehavior$b */
    public static final class C15745b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15745b f35532a = null;

        static {
            f35532a = new C15745b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return FieldBehavior.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15744a();
    }

    private FieldBehavior(int i) {
        this.value = i;
    }

    public static FieldBehavior forNumber(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    public static C16935v.C16937b<FieldBehavior> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15745b.f35532a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FieldBehavior valueOf(int i) {
        return forNumber(i);
    }
}
