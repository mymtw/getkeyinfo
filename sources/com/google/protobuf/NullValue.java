package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum NullValue implements C16935v.C16936a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final C16935v.C16937b<NullValue> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.NullValue$a */
    public static class C16844a implements C16935v.C16937b<NullValue> {
    }

    /* renamed from: com.google.protobuf.NullValue$b */
    public static final class C16845b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16845b f37162a = null;

        static {
            f37162a = new C16845b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return NullValue.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16844a();
    }

    private NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static C16935v.C16937b<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16845b.f37162a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
