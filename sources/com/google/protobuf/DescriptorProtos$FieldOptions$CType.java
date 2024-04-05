package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum DescriptorProtos$FieldOptions$CType implements C16935v.C16936a {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);
    
    public static final int CORD_VALUE = 1;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final C16935v.C16937b<DescriptorProtos$FieldOptions$CType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$CType$a */
    public class C16825a implements C16935v.C16937b<DescriptorProtos$FieldOptions$CType> {
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$CType$b */
    public static final class C16826b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16826b f37148a = null;

        static {
            f37148a = new C16826b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return DescriptorProtos$FieldOptions$CType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16825a();
    }

    private DescriptorProtos$FieldOptions$CType(int i) {
        this.value = i;
    }

    public static DescriptorProtos$FieldOptions$CType forNumber(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return CORD;
        }
        if (i != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    public static C16935v.C16937b<DescriptorProtos$FieldOptions$CType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16826b.f37148a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$FieldOptions$CType valueOf(int i) {
        return forNumber(i);
    }
}
