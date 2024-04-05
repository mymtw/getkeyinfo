package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16531v;

public enum HashType implements C16531v.C16532a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final C16531v.C16533b<HashType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.HashType$a */
    public class C16405a implements C16531v.C16533b<HashType> {
    }

    /* renamed from: com.google.crypto.tink.proto.HashType$b */
    public static final class C16406b implements C16531v.C16534c {

        /* renamed from: a */
        public static final C16406b f36511a = null;

        static {
            f36511a = new C16406b();
        }

        /* renamed from: a */
        public final boolean mo58426a(int i) {
            return HashType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16405a();
    }

    private HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public static C16531v.C16533b<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16531v.C16534c internalGetVerifier() {
        return C16406b.f36511a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}
