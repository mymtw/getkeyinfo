package com.squareup.moshi;

import com.squareup.moshi.adapters.C17388a;
import java.io.IOException;
import java.util.Date;

public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    private final com.squareup.moshi.adapters.Rfc3339DateJsonAdapter delegate = new com.squareup.moshi.adapters.Rfc3339DateJsonAdapter();

    public final Object fromJson(JsonReader jsonReader) throws IOException {
        return this.delegate.fromJson(jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this.delegate) {
            if (date == null) {
                wVar.mo68530i();
            } else {
                wVar.mo68535x(C17388a.m29132b(date));
            }
        }
    }
}
