package com.squareup.moshi.internal;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

public final class NullSafeJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NullSafeJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public final T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo68426u() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        jsonReader.mo68423n();
        return null;
    }

    public final void toJson(C17412w wVar, T t) throws IOException {
        if (t == null) {
            wVar.mo68530i();
        } else {
            this.delegate.toJson(wVar, t);
        }
    }

    public final String toString() {
        return this.delegate + ".nullSafe()";
    }
}
