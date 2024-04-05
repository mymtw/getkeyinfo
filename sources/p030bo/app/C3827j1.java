package p030bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.j1 */
public final class C3827j1 extends C4121r {

    /* renamed from: t */
    public static final C3828a f8695t = new C3828a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final C4208t1 f8696r;

    /* renamed from: s */
    private final boolean f8697s;

    /* renamed from: bo.app.j1$a */
    public static final class C3828a {
        private C3828a() {
        }

        public /* synthetic */ C3828a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.j1$b */
    public static final class C3829b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3829b f8698b = new C3829b();

        public C3829b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "GeofenceReportRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.j1$c */
    public static final class C3830c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3830c f8699b = new C3830c();

        public C3830c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating geofence report request. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3827j1(String str, C4208t1 t1Var) {
        super(new C4179s4(C19383o.m32802l("geofence/report", str)));
        C19383o.m32797g(str, "urlBase");
        C19383o.m32797g(t1Var, "geofenceEvent");
        this.f8696r = t1Var;
    }

    /* renamed from: a */
    public void mo13115a(C3666f2 f2Var, C3666f2 f2Var2, C3608d dVar) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3829b.f8698b, 7);
    }

    /* renamed from: b */
    public boolean mo13118b() {
        return this.f8697s;
    }

    /* renamed from: l */
    public JSONObject mo13119l() {
        JSONObject l = super.mo13119l();
        if (l == null) {
            return null;
        }
        try {
            l.put("geofence_event", this.f8696r.forJsonPut());
            return l;
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C3830c.f8699b, 4);
            return null;
        }
    }
}
