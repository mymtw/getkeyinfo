package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* renamed from: com.google.firebase.encoders.proto.a */
public final class C16547a implements Protobuf {

    /* renamed from: a */
    public final int f36721a;

    /* renamed from: b */
    public final Protobuf.IntEncoding f36722b;

    public C16547a(int i, Protobuf.IntEncoding intEncoding) {
        this.f36721a = i;
        this.f36722b = intEncoding;
    }

    public final Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        Protobuf protobuf = (Protobuf) obj;
        return this.f36721a == ((C16547a) protobuf).f36721a && this.f36722b.equals(((C16547a) protobuf).f36722b);
    }

    public final int hashCode() {
        return (this.f36721a ^ 14552422) + (this.f36722b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f36721a + "intEncoding=" + this.f36722b + ')';
    }
}
