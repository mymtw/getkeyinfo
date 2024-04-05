package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.e0 */
public final class C2573e0<K, V> {

    /* renamed from: a */
    public final C2574a<K, V> f5853a;

    /* renamed from: b */
    public final K f5854b = "";

    /* renamed from: c */
    public final V f5855c;

    /* renamed from: androidx.datastore.preferences.protobuf.e0$a */
    public static class C2574a<K, V> {

        /* renamed from: a */
        public final WireFormat$FieldType f5856a;

        /* renamed from: b */
        public final K f5857b = "";

        /* renamed from: c */
        public final WireFormat$FieldType f5858c;

        /* renamed from: d */
        public final V f5859d;

        public C2574a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
            this.f5856a = wireFormat$FieldType;
            this.f5858c = wireFormat$FieldType2;
            this.f5859d = preferencesProto$Value;
        }
    }

    public C2573e0(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
        this.f5853a = new C2574a<>(wireFormat$FieldType, wireFormat$FieldType2, preferencesProto$Value);
        this.f5855c = preferencesProto$Value;
    }

    /* renamed from: a */
    public static <K, V> int m5774a(C2574a<K, V> aVar, K k, V v) {
        return C2621s.m6245b(aVar.f5858c, 2, v) + C2621s.m6245b(aVar.f5856a, 1, k);
    }

    /* renamed from: b */
    public static <K, V> void m5775b(CodedOutputStream codedOutputStream, C2574a<K, V> aVar, K k, V v) throws IOException {
        C2621s.m6251o(codedOutputStream, aVar.f5856a, 1, k);
        C2621s.m6251o(codedOutputStream, aVar.f5858c, 2, v);
    }
}
