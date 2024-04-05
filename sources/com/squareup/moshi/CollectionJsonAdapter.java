package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    public static final JsonAdapter.C17360e FACTORY = new C17355a();
    private final JsonAdapter<T> elementAdapter;

    /* renamed from: com.squareup.moshi.CollectionJsonAdapter$a */
    public class C17355a implements JsonAdapter.C17360e {
        public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
            Class<?> c = C17387a0.m29125c(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (c == List.class || c == Collection.class) {
                return new C17399k(yVar.mo68557b(C17387a0.m29123a(type, Collection.class))).nullSafe();
            }
            if (c == Set.class) {
                return new C17400l(yVar.mo68557b(C17387a0.m29123a(type, Collection.class))).nullSafe();
            }
            return null;
        }
    }

    public /* synthetic */ CollectionJsonAdapter(JsonAdapter jsonAdapter, C17355a aVar) {
        this(jsonAdapter);
    }

    /* renamed from: a */
    public final C fromJson(JsonReader jsonReader) throws IOException {
        C b = mo68383b();
        jsonReader.mo68409a();
        while (jsonReader.mo68414f()) {
            b.add(this.elementAdapter.fromJson(jsonReader));
        }
        jsonReader.mo68412d();
        return b;
    }

    /* renamed from: b */
    public abstract C mo68383b();

    /* renamed from: c */
    public final void toJson(C17412w wVar, C c) throws IOException {
        wVar.mo68521a();
        for (Object json : c) {
            this.elementAdapter.toJson(wVar, json);
        }
        wVar.mo68525e();
    }

    public final String toString() {
        return this.elementAdapter + ".collection()";
    }

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }
}
