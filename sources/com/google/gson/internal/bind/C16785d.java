package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p675sn.C18541a;

/* renamed from: com.google.gson.internal.bind.d */
public final class C16785d<T> extends C16807t<T> {

    /* renamed from: a */
    public final C16708i f37101a;

    /* renamed from: b */
    public final C16807t<T> f37102b;

    /* renamed from: c */
    public final Type f37103c;

    public C16785d(C16708i iVar, C16807t<T> tVar, Type type) {
        this.f37101a = iVar;
        this.f37102b = tVar;
        this.f37103c = type;
    }

    /* renamed from: a */
    public final T mo59449a(JsonReader jsonReader) throws IOException {
        return this.f37102b.mo59449a(jsonReader);
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, T t) throws IOException {
        C16807t<T> tVar = this.f37102b;
        Type type = this.f37103c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f37103c) {
            tVar = this.f37101a.mo59460g(C18541a.get(type));
            if (tVar instanceof ReflectiveTypeAdapterFactory.C16736a) {
                C16807t<T> tVar2 = this.f37102b;
                if (!(tVar2 instanceof ReflectiveTypeAdapterFactory.C16736a)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.mo59450b(jsonWriter, t);
    }
}
