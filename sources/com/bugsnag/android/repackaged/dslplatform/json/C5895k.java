package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.k */
public abstract class C5895k {

    /* renamed from: a */
    public static final C5896a f12592a = new C5896a();

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.k$a */
    public class C5896a implements JsonReader.C5834c<LinkedHashMap> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            return C5895k.m11692a(jsonReader);
        }
    }

    /* renamed from: a */
    public static LinkedHashMap<String, Object> m11692a(JsonReader jsonReader) throws IOException {
        byte c;
        if (jsonReader.f12475d != 123) {
            throw jsonReader.mo16629f("Expecting '{' for map start");
        } else if (jsonReader.mo16626c() == 125) {
            return new LinkedHashMap<>(0);
        } else {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(jsonReader.mo16639p(), m11693b(jsonReader));
            while (true) {
                c = jsonReader.mo16626c();
                if (c != 44) {
                    break;
                }
                jsonReader.mo16626c();
                linkedHashMap.put(jsonReader.mo16639p(), m11693b(jsonReader));
            }
            if (c == 125) {
                return linkedHashMap;
            }
            throw jsonReader.mo16629f("Expecting '}' for map end");
        }
    }

    /* renamed from: b */
    public static Serializable m11693b(JsonReader jsonReader) throws IOException {
        byte c;
        byte b = jsonReader.f12475d;
        if (b == 34) {
            return jsonReader.mo16641r();
        }
        if (b != 91) {
            if (b != 102) {
                if (b != 110) {
                    if (b != 116) {
                        return b != 123 ? C5865j.m11659h(jsonReader) : m11692a(jsonReader);
                    }
                    if (jsonReader.mo16646v()) {
                        return Boolean.TRUE;
                    }
                    throw jsonReader.mo16630g(0, "Expecting 'true' for true constant");
                } else if (jsonReader.mo16645u()) {
                    return null;
                } else {
                    throw jsonReader.mo16630g(0, "Expecting 'null' for null constant");
                }
            } else if (jsonReader.mo16643t()) {
                return Boolean.FALSE;
            } else {
                throw jsonReader.mo16630g(0, "Expecting 'false' for false constant");
            }
        } else if (b != 91) {
            throw jsonReader.mo16629f("Expecting '[' for list start");
        } else if (jsonReader.mo16626c() == 93) {
            return new ArrayList(0);
        } else {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(m11693b(jsonReader));
            while (true) {
                c = jsonReader.mo16626c();
                if (c != 44) {
                    break;
                }
                jsonReader.mo16626c();
                arrayList.add(m11693b(jsonReader));
            }
            if (c == 93) {
                return arrayList;
            }
            throw jsonReader.mo16629f("Expecting ']' for list end");
        }
    }
}
