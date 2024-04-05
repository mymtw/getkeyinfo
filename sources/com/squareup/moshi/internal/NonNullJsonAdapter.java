package com.squareup.moshi.internal;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public final T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo68426u() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        StringBuilder h = C0072d.m201h("Unexpected null at ");
        h.append(jsonReader.getPath());
        throw new JsonDataException(h.toString());
    }

    public final void toJson(C17412w wVar, T t) throws IOException {
        if (t != null) {
            this.delegate.toJson(wVar, t);
            return;
        }
        StringBuilder h = C0072d.m201h("Unexpected null at ");
        h.append(wVar.getPath());
        throw new JsonDataException(h.toString());
    }

    public final String toString() {
        return this.delegate + ".nonNull()";
    }
}
