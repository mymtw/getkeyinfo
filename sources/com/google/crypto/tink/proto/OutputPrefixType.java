package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16531v;

public enum OutputPrefixType implements C16531v.C16532a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final C16531v.C16533b<OutputPrefixType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.OutputPrefixType$a */
    public class C16413a implements C16531v.C16533b<OutputPrefixType> {
    }

    /* renamed from: com.google.crypto.tink.proto.OutputPrefixType$b */
    public static final class C16414b implements C16531v.C16534c {

        /* renamed from: a */
        public static final C16414b f36515a = null;

        static {
            f36515a = new C16414b();
        }

        /* renamed from: a */
        public final boolean mo58426a(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16413a();
    }

    private OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static C16531v.C16533b<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16531v.C16534c internalGetVerifier() {
        return C16414b.f36515a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }
}
