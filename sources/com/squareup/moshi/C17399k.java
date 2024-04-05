package com.squareup.moshi;

import com.squareup.moshi.CollectionJsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.squareup.moshi.k */
public final class C17399k extends CollectionJsonAdapter<Collection<Object>, Object> {
    public C17399k(JsonAdapter jsonAdapter) {
        super(jsonAdapter, (CollectionJsonAdapter.C17355a) null);
    }

    /* renamed from: b */
    public final Collection<Object> mo68383b() {
        return new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
        return fromJson(jsonReader);
    }

    public final /* bridge */ /* synthetic */ void toJson(C17412w wVar, Object obj) throws IOException {
        toJson(wVar, (Collection) obj);
    }
}
