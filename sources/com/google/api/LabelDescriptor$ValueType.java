package com.google.api;

import com.google.protobuf.C16935v;

public enum LabelDescriptor$ValueType implements C16935v.C16936a {
    STRING(0),
    BOOL(1),
    INT64(2),
    UNRECOGNIZED(-1);
    
    public static final int BOOL_VALUE = 1;
    public static final int INT64_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final C16935v.C16937b<LabelDescriptor$ValueType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.LabelDescriptor$ValueType$a */
    public class C15746a implements C16935v.C16937b<LabelDescriptor$ValueType> {
    }

    /* renamed from: com.google.api.LabelDescriptor$ValueType$b */
    public static final class C15747b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15747b f35533a = null;

        static {
            f35533a = new C15747b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return LabelDescriptor$ValueType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15746a();
    }

    private LabelDescriptor$ValueType(int i) {
        this.value = i;
    }

    public static LabelDescriptor$ValueType forNumber(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return BOOL;
        }
        if (i != 2) {
            return null;
        }
        return INT64;
    }

    public static C16935v.C16937b<LabelDescriptor$ValueType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15747b.f35533a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LabelDescriptor$ValueType valueOf(int i) {
        return forNumber(i);
    }
}
