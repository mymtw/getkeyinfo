package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.c */
public abstract class C5840c {

    /* renamed from: a */
    public static final boolean[] f12502a = new boolean[0];

    /* renamed from: b */
    public static final C5841a f12503b = new C5841a();

    /* renamed from: c */
    public static final C5842b f12504c = new C5842b();

    /* renamed from: d */
    public static final C5843c f12505d = new C5843c();

    /* renamed from: e */
    public static final C5844d f12506e = new C5844d();

    /* renamed from: f */
    public static final C5845e f12507f = new C5845e();

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.c$a */
    public class C5841a implements JsonReader.C5834c<Boolean> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(C5840c.m11629a(jsonReader));
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.c$b */
    public class C5842b implements JsonReader.C5834c<Boolean> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            return Boolean.valueOf(C5840c.m11629a(jsonReader));
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.c$c */
    public class C5843c implements C5858h.C5859a<Boolean> {
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.c$d */
    public class C5844d implements JsonReader.C5834c<boolean[]> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            if (jsonReader.f12475d == 91) {
                jsonReader.mo16626c();
                if (jsonReader.f12475d == 93) {
                    return C5840c.f12502a;
                }
                boolean[] zArr = new boolean[4];
                zArr[0] = C5840c.m11629a(jsonReader);
                int i = 1;
                while (jsonReader.mo16626c() == 44) {
                    jsonReader.mo16626c();
                    if (i == zArr.length) {
                        zArr = Arrays.copyOf(zArr, zArr.length << 1);
                    }
                    zArr[i] = C5840c.m11629a(jsonReader);
                    i++;
                }
                jsonReader.mo16625b();
                return Arrays.copyOf(zArr, i);
            }
            throw jsonReader.mo16629f("Expecting '[' for boolean array start");
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.c$e */
    public class C5845e implements C5858h.C5859a<boolean[]> {
    }

    /* renamed from: a */
    public static boolean m11629a(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo16646v()) {
            return true;
        }
        if (jsonReader.mo16643t()) {
            return false;
        }
        throw jsonReader.mo16630g(0, "Found invalid boolean value");
    }
}
