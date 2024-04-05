package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum DescriptorProtos$FileOptions$OptimizeMode implements C16935v.C16936a {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);
    
    public static final int CODE_SIZE_VALUE = 2;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final int SPEED_VALUE = 1;
    private static final C16935v.C16937b<DescriptorProtos$FileOptions$OptimizeMode> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$a */
    public class C16829a implements C16935v.C16937b<DescriptorProtos$FileOptions$OptimizeMode> {
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$b */
    public static final class C16830b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16830b f37150a = null;

        static {
            f37150a = new C16830b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return DescriptorProtos$FileOptions$OptimizeMode.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16829a();
    }

    private DescriptorProtos$FileOptions$OptimizeMode(int i) {
        this.value = i;
    }

    public static DescriptorProtos$FileOptions$OptimizeMode forNumber(int i) {
        if (i == 1) {
            return SPEED;
        }
        if (i == 2) {
            return CODE_SIZE;
        }
        if (i != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    public static C16935v.C16937b<DescriptorProtos$FileOptions$OptimizeMode> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16830b.f37150a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$FileOptions$OptimizeMode valueOf(int i) {
        return forNumber(i);
    }
}
