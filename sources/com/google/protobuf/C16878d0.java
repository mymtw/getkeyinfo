package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.d0 */
public final class C16878d0<K, V> {

    /* renamed from: a */
    public final C16879a<K, V> f37194a;

    /* renamed from: b */
    public final K f37195b = "";

    /* renamed from: c */
    public final V f37196c;

    /* renamed from: com.google.protobuf.d0$a */
    public static class C16879a<K, V> {

        /* renamed from: a */
        public final WireFormat$FieldType f37197a;

        /* renamed from: b */
        public final K f37198b = "";

        /* renamed from: c */
        public final WireFormat$FieldType f37199c;

        /* renamed from: d */
        public final V f37200d;

        public C16879a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
            this.f37197a = wireFormat$FieldType;
            this.f37199c = wireFormat$FieldType2;
            this.f37200d = obj;
        }
    }

    public C16878d0(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
        this.f37194a = new C16879a<>(wireFormat$FieldType, wireFormat$FieldType2, obj);
        this.f37196c = obj;
    }

    /* renamed from: a */
    public static <K, V> int m28068a(C16879a<K, V> aVar, K k, V v) {
        return C16925r.m28362b(aVar.f37199c, 2, v) + C16925r.m28362b(aVar.f37197a, 1, k);
    }

    /* renamed from: b */
    public static <K, V> void m28069b(CodedOutputStream codedOutputStream, C16879a<K, V> aVar, K k, V v) throws IOException {
        C16925r.m28368o(codedOutputStream, aVar.f37197a, 1, k);
        C16925r.m28368o(codedOutputStream, aVar.f37199c, 2, v);
    }
}
