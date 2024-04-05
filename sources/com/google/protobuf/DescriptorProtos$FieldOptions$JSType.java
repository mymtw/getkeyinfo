package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum DescriptorProtos$FieldOptions$JSType implements C16935v.C16936a {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);
    
    public static final int JS_NORMAL_VALUE = 0;
    public static final int JS_NUMBER_VALUE = 2;
    public static final int JS_STRING_VALUE = 1;
    private static final C16935v.C16937b<DescriptorProtos$FieldOptions$JSType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$JSType$a */
    public class C16827a implements C16935v.C16937b<DescriptorProtos$FieldOptions$JSType> {
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$JSType$b */
    public static final class C16828b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16828b f37149a = null;

        static {
            f37149a = new C16828b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return DescriptorProtos$FieldOptions$JSType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16827a();
    }

    private DescriptorProtos$FieldOptions$JSType(int i) {
        this.value = i;
    }

    public static DescriptorProtos$FieldOptions$JSType forNumber(int i) {
        if (i == 0) {
            return JS_NORMAL;
        }
        if (i == 1) {
            return JS_STRING;
        }
        if (i != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    public static C16935v.C16937b<DescriptorProtos$FieldOptions$JSType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16828b.f37149a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$FieldOptions$JSType valueOf(int i) {
        return forNumber(i);
    }
}
