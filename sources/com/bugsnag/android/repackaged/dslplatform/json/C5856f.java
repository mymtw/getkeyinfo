package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.f */
public final class C5856f implements JsonReader.C5834c<Object> {

    /* renamed from: a */
    public final /* synthetic */ JsonReader.C5833b f12543a;

    public C5856f(JsonReader.C5833b bVar) {
        this.f12543a = bVar;
    }

    /* renamed from: a */
    public final Object mo16650a(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo16645u()) {
            return null;
        }
        if (jsonReader.f12475d == 123) {
            jsonReader.mo16626c();
            return this.f12543a.mo16649a();
        }
        throw jsonReader.mo16629f("Expecting '{' for object start");
    }
}
