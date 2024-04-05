package com.google.protobuf;

import com.google.protobuf.C16935v;

public enum Syntax implements C16935v.C16936a {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final C16935v.C16937b<Syntax> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.Syntax$a */
    public static class C16850a implements C16935v.C16937b<Syntax> {
    }

    /* renamed from: com.google.protobuf.Syntax$b */
    public static final class C16851b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16851b f37175a = null;

        static {
            f37175a = new C16851b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return Syntax.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16850a();
    }

    private Syntax(int i) {
        this.value = i;
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static C16935v.C16937b<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16851b.f37175a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
