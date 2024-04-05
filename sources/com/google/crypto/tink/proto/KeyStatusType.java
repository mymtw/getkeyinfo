package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16531v;

public enum KeyStatusType implements C16531v.C16532a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final C16531v.C16533b<KeyStatusType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.KeyStatusType$a */
    public class C16411a implements C16531v.C16533b<KeyStatusType> {
    }

    /* renamed from: com.google.crypto.tink.proto.KeyStatusType$b */
    public static final class C16412b implements C16531v.C16534c {

        /* renamed from: a */
        public static final C16412b f36514a = null;

        static {
            f36514a = new C16412b();
        }

        /* renamed from: a */
        public final boolean mo58426a(int i) {
            return KeyStatusType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16411a();
    }

    private KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static C16531v.C16533b<KeyStatusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16531v.C16534c internalGetVerifier() {
        return C16412b.f36514a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }
}
