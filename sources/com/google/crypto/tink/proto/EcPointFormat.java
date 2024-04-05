package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16531v;

public enum EcPointFormat implements C16531v.C16532a {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final C16531v.C16533b<EcPointFormat> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.EcPointFormat$a */
    public class C16399a implements C16531v.C16533b<EcPointFormat> {
    }

    /* renamed from: com.google.crypto.tink.proto.EcPointFormat$b */
    public static final class C16400b implements C16531v.C16534c {

        /* renamed from: a */
        public static final C16400b f36508a = null;

        static {
            f36508a = new C16400b();
        }

        /* renamed from: a */
        public final boolean mo58426a(int i) {
            return EcPointFormat.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16399a();
    }

    private EcPointFormat(int i) {
        this.value = i;
    }

    public static EcPointFormat forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public static C16531v.C16533b<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16531v.C16534c internalGetVerifier() {
        return C16400b.f36508a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcPointFormat valueOf(int i) {
        return forNumber(i);
    }
}
