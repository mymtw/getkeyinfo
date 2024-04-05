package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.google.gson.f */
public final class C16705f extends C16807t<Number> {
    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return Long.valueOf(jsonReader.nextLong());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(number.toString());
        }
    }
}
