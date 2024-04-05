package com.squareup.moshi.adapters;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.squareup.moshi.adapters.b */
public final class C17389b extends JsonAdapter<Object> {

    /* renamed from: a */
    public final /* synthetic */ Object f37951a;

    /* renamed from: b */
    public final /* synthetic */ PolymorphicJsonAdapterFactory f37952b;

    public C17389b(PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactory, Object obj) {
        this.f37952b = polymorphicJsonAdapterFactory;
        this.f37951a = obj;
    }

    public final Object fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.mo68411c0();
        return this.f37951a;
    }

    public final void toJson(C17412w wVar, Object obj) throws IOException {
        StringBuilder h = C0072d.m201h("Expected one of ");
        h.append(this.f37952b.f37948d);
        h.append(" but found ");
        h.append(obj);
        h.append(", a ");
        h.append(obj.getClass());
        h.append(". Register this subtype.");
        throw new IllegalArgumentException(h.toString());
    }
}
