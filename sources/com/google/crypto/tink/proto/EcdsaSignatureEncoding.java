package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16531v;

public enum EcdsaSignatureEncoding implements C16531v.C16532a {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);
    
    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    private static final C16531v.C16533b<EcdsaSignatureEncoding> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.EcdsaSignatureEncoding$a */
    public class C16401a implements C16531v.C16533b<EcdsaSignatureEncoding> {
    }

    /* renamed from: com.google.crypto.tink.proto.EcdsaSignatureEncoding$b */
    public static final class C16402b implements C16531v.C16534c {

        /* renamed from: a */
        public static final C16402b f36509a = null;

        static {
            f36509a = new C16402b();
        }

        /* renamed from: a */
        public final boolean mo58426a(int i) {
            return EcdsaSignatureEncoding.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16401a();
    }

    private EcdsaSignatureEncoding(int i) {
        this.value = i;
    }

    public static EcdsaSignatureEncoding forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i == 1) {
            return IEEE_P1363;
        }
        if (i != 2) {
            return null;
        }
        return DER;
    }

    public static C16531v.C16533b<EcdsaSignatureEncoding> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16531v.C16534c internalGetVerifier() {
        return C16402b.f36509a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcdsaSignatureEncoding valueOf(int i) {
        return forNumber(i);
    }
}
