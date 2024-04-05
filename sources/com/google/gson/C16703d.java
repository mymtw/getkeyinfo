package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.google.gson.d */
public final class C16703d extends C16807t<Number> {
    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return Double.valueOf(jsonReader.nextDouble());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            jsonWriter.nullValue();
            return;
        }
        C16708i.m27683b(number.doubleValue());
        jsonWriter.value(number);
    }
}
