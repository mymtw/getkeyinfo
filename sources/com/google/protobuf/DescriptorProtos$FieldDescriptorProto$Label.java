package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum DescriptorProtos$FieldDescriptorProto$Label implements C16935v.C16936a {
    LABEL_OPTIONAL(1),
    LABEL_REQUIRED(2),
    LABEL_REPEATED(3);
    
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static final C16935v.C16937b<DescriptorProtos$FieldDescriptorProto$Label> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$a */
    public class C16821a implements C16935v.C16937b<DescriptorProtos$FieldDescriptorProto$Label> {
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$b */
    public static final class C16822b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16822b f37146a = null;

        static {
            f37146a = new C16822b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return DescriptorProtos$FieldDescriptorProto$Label.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16821a();
    }

    private DescriptorProtos$FieldDescriptorProto$Label(int i) {
        this.value = i;
    }

    public static DescriptorProtos$FieldDescriptorProto$Label forNumber(int i) {
        if (i == 1) {
            return LABEL_OPTIONAL;
        }
        if (i == 2) {
            return LABEL_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    public static C16935v.C16937b<DescriptorProtos$FieldDescriptorProto$Label> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16822b.f37146a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$FieldDescriptorProto$Label valueOf(int i) {
        return forNumber(i);
    }
}
