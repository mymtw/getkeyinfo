package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.n */
public abstract class C16800n {
    /* renamed from: a */
    public final C16802p mo59635a() {
        if (this instanceof C16802p) {
            return (C16802p) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: c */
    public final C16803q mo59636c() {
        if (this instanceof C16803q) {
            return (C16803q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: e */
    public String mo59630e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            TypeAdapters.f37037A.mo59450b(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
