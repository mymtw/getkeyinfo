package p030bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.i1 */
public final class C3773i1 extends C4121r {

    /* renamed from: t */
    public static final C3774a f8589t = new C3774a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final C4208t1 f8590r;

    /* renamed from: s */
    private final boolean f8591s;

    /* renamed from: bo.app.i1$a */
    public static final class C3774a {
        private C3774a() {
        }

        public /* synthetic */ C3774a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.i1$b */
    public static final class C3775b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3775b f8592b = new C3775b();

        public C3775b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "GeofenceRefreshRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.i1$c */
    public static final class C3776c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3776c f8593b = new C3776c();

        public C3776c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating geofence refresh request. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3773i1(String str, C4257w1 w1Var) {
        super(new C4179s4(C19383o.m32802l("geofence/request", str)));
        C19383o.m32797g(str, "urlBase");
        C19383o.m32797g(w1Var, "location");
        this.f8590r = C3787j.f8608h.mo13461a(w1Var);
    }

    /* renamed from: a */
    public void mo13115a(C3666f2 f2Var, C3666f2 f2Var2, C3608d dVar) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3775b.f8592b, 7);
    }

    /* renamed from: b */
    public boolean mo13118b() {
        return this.f8591s;
    }

    /* renamed from: l */
    public JSONObject mo13119l() {
        JSONObject l = super.mo13119l();
        if (l == null) {
            return null;
        }
        try {
            C4208t1 t1Var = this.f8590r;
            if (t1Var != null) {
                l.put("location_event", t1Var.forJsonPut());
            }
            return l;
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C3776c.f8593b, 4);
            return null;
        }
    }
}
