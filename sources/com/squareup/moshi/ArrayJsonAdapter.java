package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

final class ArrayJsonAdapter extends JsonAdapter<Object> {
    public static final JsonAdapter.C17360e FACTORY = new C17352a();
    private final JsonAdapter<Object> elementAdapter;
    private final Class<?> elementClass;

    /* renamed from: com.squareup.moshi.ArrayJsonAdapter$a */
    public class C17352a implements JsonAdapter.C17360e {
        public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
            Type genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
            if (genericComponentType != null && set.isEmpty()) {
                return new ArrayJsonAdapter(C17387a0.m29125c(genericComponentType), yVar.mo68557b(genericComponentType)).nullSafe();
            }
            return null;
        }
    }

    public ArrayJsonAdapter(Class<?> cls, JsonAdapter<Object> jsonAdapter) {
        this.elementClass = cls;
        this.elementAdapter = jsonAdapter;
    }

    public final Object fromJson(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo68409a();
        while (jsonReader.mo68414f()) {
            arrayList.add(this.elementAdapter.fromJson(jsonReader));
        }
        jsonReader.mo68412d();
        Object newInstance = Array.newInstance(this.elementClass, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) throws IOException {
        wVar.mo68521a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.elementAdapter.toJson(wVar, Array.get(obj, i));
        }
        wVar.mo68525e();
    }

    public final String toString() {
        return this.elementAdapter + ".array()";
    }
}
