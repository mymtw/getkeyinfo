package com.squareup.moshi;

import com.squareup.moshi.CollectionJsonAdapter;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.squareup.moshi.l */
public final class C17400l extends CollectionJsonAdapter<Set<Object>, Object> {
    public C17400l(JsonAdapter jsonAdapter) {
        super(jsonAdapter, (CollectionJsonAdapter.C17355a) null);
    }

    /* renamed from: b */
    public final Collection mo68383b() {
        return new LinkedHashSet();
    }

    public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
        return fromJson(jsonReader);
    }

    public final /* bridge */ /* synthetic */ void toJson(C17412w wVar, Object obj) throws IOException {
        toJson(wVar, (Collection) obj);
    }
}
