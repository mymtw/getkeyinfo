package com.squareup.moshi.adapters;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.util.Date;

public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    /* renamed from: a */
    public final synchronized Date fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo68426u() == JsonReader.Token.NULL) {
            jsonReader.mo68423n();
            return null;
        }
        return C17388a.m29134d(jsonReader.mo68425t());
    }

    public final void toJson(C17412w wVar, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                wVar.mo68530i();
            } else {
                wVar.mo68535x(C17388a.m29132b(date));
            }
        }
    }
}
