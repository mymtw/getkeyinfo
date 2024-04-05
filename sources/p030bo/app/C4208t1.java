package p030bo.app;

import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p005a4.C0035b;

/* renamed from: bo.app.t1 */
public interface C4208t1 extends C0035b<JSONObject> {

    /* renamed from: a */
    public static final C4209a f9343a = C4209a.f9344a;

    /* renamed from: bo.app.t1$a */
    public static final class C4209a {

        /* renamed from: a */
        public static final /* synthetic */ C4209a f9344a = new C4209a();

        private C4209a() {
        }
    }

    /* renamed from: a */
    void mo13445a(C3670f5 f5Var);

    /* renamed from: a */
    void mo13446a(String str);

    /* renamed from: d */
    boolean mo13447d();

    /* synthetic */ Object forJsonPut();

    /* renamed from: j */
    C3600c1 mo13451j();

    /* renamed from: k */
    JSONObject mo13452k();

    /* renamed from: n */
    C3670f5 mo13453n();

    /* renamed from: p */
    String mo14106p() {
        String jSONObject = ((JSONObject) forJsonPut()).toString();
        C19383o.m32796f(jSONObject, "forJsonPut().toString()");
        return jSONObject;
    }

    /* renamed from: r */
    String mo13454r();
}
