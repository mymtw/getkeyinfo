package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.m */
public abstract class C5898m {

    /* renamed from: a */
    public static final C5899a f12593a = new C5899a();

    /* renamed from: b */
    public static final C5900b f12594b = new C5900b();

    /* renamed from: c */
    public static final C5901c f12595c = new C5901c();

    /* renamed from: d */
    public static final C5902d f12596d = new C5902d();

    /* renamed from: e */
    public static final C5903e f12597e = new C5903e();

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.m$a */
    public class C5899a implements JsonReader.C5834c<String> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            return jsonReader.mo16641r();
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.m$b */
    public class C5900b implements C5858h.C5859a<String> {
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.m$c */
    public class C5901c implements C5858h.C5859a<CharSequence> {
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.m$d */
    public class C5902d implements JsonReader.C5834c<StringBuilder> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(jsonReader.f12480i, 0, jsonReader.mo16634k());
            return sb;
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.m$e */
    public class C5903e implements JsonReader.C5834c<StringBuffer> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(jsonReader.f12480i, 0, jsonReader.mo16634k());
            return stringBuffer;
        }
    }
}
