package com.bugsnag.android.internal;

import com.bugsnag.android.repackaged.dslplatform.json.C5847e;
import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.C19389t;

/* renamed from: com.bugsnag.android.internal.e */
public final class C5769e {

    /* renamed from: a */
    public static final C5847e<Map<String, Object>> f12343a;

    /* renamed from: com.bugsnag.android.internal.e$a */
    public static final class C5770a<T> implements C5858h.C5859a<Date> {

        /* renamed from: a */
        public static final C5770a f12344a = new C5770a();
    }

    static {
        C5847e.C5854g gVar = new C5847e.C5854g();
        gVar.f12528a = new C5762b();
        C5847e<Map<String, Object>> eVar = new C5847e<>(gVar);
        f12343a = eVar;
        eVar.mo16658k(Date.class, C5770a.f12344a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Map m11567a(FileInputStream fileInputStream) {
        int read;
        C5847e<Map<String, Object>> eVar = f12343a;
        Class<Map> cls = Map.class;
        eVar.getClass();
        JsonReader jsonReader = (JsonReader) eVar.f12516i.get();
        jsonReader.f12474c = 0;
        jsonReader.f12473b = 0;
        jsonReader.f12481j = fileInputStream;
        int i = jsonReader.f12476e;
        int i2 = jsonReader.f12483l;
        if (i >= i2) {
            i = i2;
        }
        jsonReader.f12482k = i;
        byte[] bArr = jsonReader.f12479h;
        int i3 = 0;
        while (i3 < bArr.length && (read = fileInputStream.read(bArr, i3, bArr.length - i3)) != -1) {
            i3 += read;
        }
        int i4 = jsonReader.f12483l;
        if (i3 < i4) {
            i4 = i3;
        }
        jsonReader.f12482k = i4;
        jsonReader.f12476e = i3;
        try {
            Object c = eVar.mo16654c(cls, jsonReader, fileInputStream);
            jsonReader.f12479h = jsonReader.f12486o;
            jsonReader.f12483l = jsonReader.f12487p;
            jsonReader.f12473b = 0;
            jsonReader.f12476e = 0;
            jsonReader.f12482k = 0;
            jsonReader.f12481j = null;
            Map map = (Map) c;
            if (map != null) {
                C19389t.m32909c(map);
                return map;
            }
            throw new IllegalArgumentException("JSON document is invalid".toString());
        } catch (Throwable th) {
            jsonReader.f12479h = jsonReader.f12486o;
            jsonReader.f12483l = jsonReader.f12487p;
            jsonReader.f12473b = 0;
            jsonReader.f12476e = 0;
            jsonReader.f12482k = 0;
            jsonReader.f12481j = null;
            throw th;
        }
    }
}
