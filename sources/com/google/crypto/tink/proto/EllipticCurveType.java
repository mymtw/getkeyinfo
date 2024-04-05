package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16531v;

public enum EllipticCurveType implements C16531v.C16532a {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    
    public static final int CURVE25519_VALUE = 5;
    public static final int NIST_P256_VALUE = 2;
    public static final int NIST_P384_VALUE = 3;
    public static final int NIST_P521_VALUE = 4;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    private static final C16531v.C16533b<EllipticCurveType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.EllipticCurveType$a */
    public class C16403a implements C16531v.C16533b<EllipticCurveType> {
    }

    /* renamed from: com.google.crypto.tink.proto.EllipticCurveType$b */
    public static final class C16404b implements C16531v.C16534c {

        /* renamed from: a */
        public static final C16404b f36510a = null;

        static {
            f36510a = new C16404b();
        }

        /* renamed from: a */
        public final boolean mo58426a(int i) {
            return EllipticCurveType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16403a();
    }

    private EllipticCurveType(int i) {
        this.value = i;
    }

    public static EllipticCurveType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i == 4) {
            return NIST_P521;
        }
        if (i != 5) {
            return null;
        }
        return CURVE25519;
    }

    public static C16531v.C16533b<EllipticCurveType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16531v.C16534c internalGetVerifier() {
        return C16404b.f36510a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EllipticCurveType valueOf(int i) {
        return forNumber(i);
    }
}
