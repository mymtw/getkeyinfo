package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum DescriptorProtos$MethodOptions$IdempotencyLevel implements C16935v.C16936a {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);
    
    public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
    public static final int IDEMPOTENT_VALUE = 2;
    public static final int NO_SIDE_EFFECTS_VALUE = 1;
    private static final C16935v.C16937b<DescriptorProtos$MethodOptions$IdempotencyLevel> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$a */
    public class C16831a implements C16935v.C16937b<DescriptorProtos$MethodOptions$IdempotencyLevel> {
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$b */
    public static final class C16832b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16832b f37151a = null;

        static {
            f37151a = new C16832b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16831a();
    }

    private DescriptorProtos$MethodOptions$IdempotencyLevel(int i) {
        this.value = i;
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int i) {
        if (i == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    public static C16935v.C16937b<DescriptorProtos$MethodOptions$IdempotencyLevel> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16832b.f37151a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(int i) {
        return forNumber(i);
    }
}
