package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19453g;
import org.json.JSONObject;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.j3 */
public final class C3832j3 implements C3689g2 {

    /* renamed from: a */
    private final C3689g2 f8700a;

    /* renamed from: bo.app.j3$a */
    public static final class C3833a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4179s4 f8701b;

        /* renamed from: c */
        public final /* synthetic */ Map<String, String> f8702c;

        /* renamed from: d */
        public final /* synthetic */ JSONObject f8703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3833a(C4179s4 s4Var, Map<String, String> map, JSONObject jSONObject) {
            super(0);
            this.f8701b = s4Var;
            this.f8702c = map;
            this.f8703d = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C4135r1.m9503a(this.f8701b, this.f8702c, this.f8703d);
        }
    }

    /* renamed from: bo.app.j3$b */
    public static final class C3834b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3832j3 f8704b;

        /* renamed from: c */
        public final /* synthetic */ C4179s4 f8705c;

        /* renamed from: d */
        public final /* synthetic */ Map<String, String> f8706d;

        /* renamed from: e */
        public final /* synthetic */ C19285c<String> f8707e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f8708f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3834b(C3832j3 j3Var, C4179s4 s4Var, Map<String, String> map, C19285c<String> cVar, JSONObject jSONObject) {
            super(0);
            this.f8704b = j3Var;
            this.f8705c = s4Var;
            this.f8706d = map;
            this.f8707e = cVar;
            this.f8708f = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f8704b.m8937a(this.f8705c, this.f8706d, this.f8707e.getValue(), this.f8708f);
        }
    }

    /* renamed from: bo.app.j3$c */
    public static final class C3835c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3835c f8709b = new C3835c();

        public C3835c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging request: ";
        }
    }

    /* renamed from: bo.app.j3$d */
    public static final class C3836d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8710b;

        /* renamed from: c */
        public final /* synthetic */ C19285c<String> f8711c;

        /* renamed from: d */
        public final /* synthetic */ long f8712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3836d(JSONObject jSONObject, C19285c<String> cVar, long j) {
            super(0);
            this.f8710b = jSONObject;
            this.f8711c = cVar;
            this.f8712d = j;
        }

        /* renamed from: a */
        public final String invoke() {
            JSONObject jSONObject = this.f8710b;
            String f = jSONObject == null ? "none" : JsonUtils.m11315f(jSONObject);
            StringBuilder h = C0072d.m201h("Result(id = ");
            h.append(this.f8711c.getValue());
            h.append(" time = ");
            h.append(this.f8712d);
            h.append("ms)\n");
            h.append(f);
            return h.toString();
        }
    }

    /* renamed from: bo.app.j3$e */
    public static final class C3837e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3837e f8713b = new C3837e();

        public C3837e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging result: ";
        }
    }

    public C3832j3(C3689g2 g2Var) {
        C19383o.m32797g(g2Var, "httpConnector");
        this.f8700a = g2Var;
    }

    /* renamed from: a */
    public Pair<JSONObject, Map<String, String>> mo13326a(C4179s4 s4Var, Map<String, String> map, JSONObject jSONObject) {
        C19383o.m32797g(s4Var, "requestTarget");
        C19383o.m32797g(map, "requestHeaders");
        C19383o.m32797g(jSONObject, "payload");
        C19285c b = C19350d.m32677b(new C3833a(s4Var, map, jSONObject));
        m8938a(s4Var, map, (C19285c<String>) b, jSONObject);
        long currentTimeMillis = System.currentTimeMillis();
        Pair<JSONObject, Map<String, String>> a = this.f8700a.mo13326a(s4Var, map, jSONObject);
        m8939a(a.getFirst(), (C19285c<String>) b, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    /* renamed from: a */
    private final void m8938a(C4179s4 s4Var, Map<String, String> map, C19285c<String> cVar, JSONObject jSONObject) {
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3834b(this, s4Var, map, cVar, jSONObject), 7);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3835c.f8709b, 4);
        }
    }

    /* renamed from: a */
    private final void m8939a(JSONObject jSONObject, C19285c<String> cVar, long j) {
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3836d(jSONObject, cVar, j), 7);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3837e.f8713b, 4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m8937a(C4179s4 s4Var, Map<String, String> map, String str, JSONObject jSONObject) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Making request with id => \"");
        sb.append(str);
        sb.append("\"\n            |to url: ");
        sb.append(s4Var);
        sb.append("\n            \n            |with headers:\n            ");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add("|\"" + ((String) next.getKey()) + "\" => \"" + ((String) next.getValue()) + JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        sb.append(C19327t.m32644Z0(arrayList, "\n", (String) null, (String) null, (C19857l) null, 62));
        sb.append("\n            |\n            |");
        if (jSONObject == null) {
            str2 = "";
        } else {
            str2 = C19383o.m32802l(JsonUtils.m11315f(jSONObject), "and JSON :\n");
        }
        sb.append(str2);
        sb.append("\n        ");
        return C19453g.m33014R0(sb.toString());
    }
}
