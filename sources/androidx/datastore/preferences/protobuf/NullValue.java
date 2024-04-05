package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2631w;

public enum NullValue implements C2631w.C2632a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final C2631w.C2633b<NullValue> internalValueMap = null;
    private final int value;

    /* renamed from: androidx.datastore.preferences.protobuf.NullValue$a */
    public static class C2527a implements C2631w.C2633b<NullValue> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.NullValue$b */
    public static final class C2528b implements C2631w.C2634c {

        /* renamed from: a */
        public static final C2528b f5801a = null;

        static {
            f5801a = new C2528b();
        }

        /* renamed from: a */
        public final boolean mo9451a(int i) {
            return NullValue.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C2527a();
    }

    private NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static C2631w.C2633b<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static C2631w.C2634c internalGetVerifier() {
        return C2528b.f5801a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
