package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.i */
public abstract class C5860i {

    /* renamed from: a */
    public static final C5861a f12546a = new C5861a();

    /* renamed from: b */
    public static final C5862b f12547b = new C5862b();

    /* renamed from: c */
    public static final C5863c f12548c = new C5863c();

    /* renamed from: d */
    public static final C5864d f12549d = new C5864d();

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.i$a */
    public class C5861a implements JsonReader.C5834c<URI> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            return URI.create(jsonReader.mo16641r());
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.i$b */
    public class C5862b implements C5858h.C5859a<URI> {
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.i$c */
    public class C5863c implements JsonReader.C5834c<InetAddress> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            char[] cArr;
            if (jsonReader.mo16645u()) {
                return null;
            }
            if (jsonReader.f12475d == 34) {
                int i = jsonReader.f12473b;
                int i2 = 0;
                while (true) {
                    try {
                        cArr = jsonReader.f12477f;
                        if (i2 >= cArr.length) {
                            break;
                        }
                        int i3 = i + 1;
                        byte b = jsonReader.f12479h[i];
                        if (b == 34) {
                            i = i3;
                            break;
                        }
                        int i4 = i2 + 1;
                        cArr[i2] = (char) b;
                        i2 = i4;
                        i = i3;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw jsonReader.mo16630g(0, "JSON string was not closed with a double quote");
                    }
                }
                if (i <= jsonReader.f12476e) {
                    jsonReader.f12473b = i;
                    return InetAddress.getByName(new String(cArr, 0, i2));
                }
                throw jsonReader.mo16630g(0, "JSON string was not closed with a double quote");
            }
            throw jsonReader.mo16629f("Expecting '\"' for string start");
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.i$d */
    public class C5864d implements C5858h.C5859a<InetAddress> {
    }
}
