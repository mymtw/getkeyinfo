package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

final class RecordJsonAdapter<T> extends JsonAdapter<T> {
    public static final JsonAdapter.C17360e FACTORY = new C17372a();

    /* renamed from: com.squareup.moshi.RecordJsonAdapter$a */
    public class C17372a implements JsonAdapter.C17360e {
        public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
            return null;
        }
    }

    public final T fromJson(JsonReader jsonReader) throws IOException {
        throw new AssertionError();
    }

    public final void toJson(C17412w wVar, T t) throws IOException {
        throw new AssertionError();
    }
}
