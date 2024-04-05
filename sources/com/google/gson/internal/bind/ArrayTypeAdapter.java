package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p675sn.C18541a;

public final class ArrayTypeAdapter<E> extends C16807t<Object> {

    /* renamed from: c */
    public static final C16808u f36994c = new C16808u() {
        /* renamed from: a */
        public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
            Type type = aVar.getType();
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(iVar, iVar.mo59460g(C18541a.get(genericComponentType)), C$Gson$Types.m27701f(genericComponentType));
        }
    };

    /* renamed from: a */
    public final Class<E> f36995a;

    /* renamed from: b */
    public final C16785d f36996b;

    public ArrayTypeAdapter(C16708i iVar, C16807t<E> tVar, Class<E> cls) {
        this.f36996b = new C16785d(iVar, tVar, cls);
        this.f36995a = cls;
    }

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f36996b.mo59449a(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f36995a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f36996b.mo59450b(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
