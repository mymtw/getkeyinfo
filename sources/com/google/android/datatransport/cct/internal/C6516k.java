package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.k */
public abstract class C6516k {
    private static final String LOG_TAG = "LogResponseInternal";

    public static C6516k create(long j) {
        return new AutoValue_LogResponse(j);
    }

    public static C6516k fromJson(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return create(Long.parseLong(jsonReader.nextString()));
                } else {
                    C6516k create = create(jsonReader.nextLong());
                    jsonReader.close();
                    return create;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long getNextRequestWaitMillis();
}
