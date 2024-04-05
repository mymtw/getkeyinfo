package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2631w;

public enum Syntax implements C2631w.C2632a {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final C2631w.C2633b<Syntax> internalValueMap = null;
    private final int value;

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$a */
    public static class C2533a implements C2631w.C2633b<Syntax> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$b */
    public static final class C2534b implements C2631w.C2634c {

        /* renamed from: a */
        public static final C2534b f5814a = null;

        static {
            f5814a = new C2534b();
        }

        /* renamed from: a */
        public final boolean mo9451a(int i) {
            return Syntax.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C2533a();
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

    public static C2631w.C2633b<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static C2631w.C2634c internalGetVerifier() {
        return C2534b.f5814a;
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
