package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.google.gson.s */
public final class C16805s extends C16807t<Object> {

    /* renamed from: a */
    public final /* synthetic */ C16807t f37125a;

    public C16805s(C16807t tVar) {
        this.f37125a = tVar;
    }

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return this.f37125a.mo59449a(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.f37125a.mo59450b(jsonWriter, obj);
        }
    }
}
