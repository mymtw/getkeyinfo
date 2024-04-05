package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.gson.g */
public final class C16706g extends C16807t<AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ C16807t f36922a;

    public C16706g(C16807t tVar) {
        this.f36922a = tVar;
    }

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        return new AtomicLong(((Number) this.f36922a.mo59449a(jsonReader)).longValue());
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        this.f36922a.mo59450b(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
    }
}
