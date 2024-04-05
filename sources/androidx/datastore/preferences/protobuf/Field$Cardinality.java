package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2631w;

public enum Field$Cardinality implements C2631w.C2632a {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);
    
    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final C2631w.C2633b<Field$Cardinality> internalValueMap = null;
    private final int value;

    /* renamed from: androidx.datastore.preferences.protobuf.Field$Cardinality$a */
    public static class C2516a implements C2631w.C2633b<Field$Cardinality> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Field$Cardinality$b */
    public static final class C2517b implements C2631w.C2634c {

        /* renamed from: a */
        public static final C2517b f5791a = null;

        static {
            f5791a = new C2517b();
        }

        /* renamed from: a */
        public final boolean mo9451a(int i) {
            return Field$Cardinality.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C2516a();
    }

    private Field$Cardinality(int i) {
        this.value = i;
    }

    public static Field$Cardinality forNumber(int i) {
        if (i == 0) {
            return CARDINALITY_UNKNOWN;
        }
        if (i == 1) {
            return CARDINALITY_OPTIONAL;
        }
        if (i == 2) {
            return CARDINALITY_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return CARDINALITY_REPEATED;
    }

    public static C2631w.C2633b<Field$Cardinality> internalGetValueMap() {
        return internalValueMap;
    }

    public static C2631w.C2634c internalGetVerifier() {
        return C2517b.f5791a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Field$Cardinality valueOf(int i) {
        return forNumber(i);
    }
}
