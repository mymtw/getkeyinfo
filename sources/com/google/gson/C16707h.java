package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.h */
public final class C16707h extends C16807t<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ C16807t f36923a;

    public C16707h(C16807t tVar) {
        this.f36923a = tVar;
    }

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.f36923a.mo59449a(jsonReader)).longValue()));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jsonWriter.beginArray();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f36923a.mo59450b(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
        }
        jsonWriter.endArray();
    }
}
