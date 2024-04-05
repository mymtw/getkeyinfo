package p030bo.app;

import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4276x3;
import p753kq.C19846a;

/* renamed from: bo.app.i0 */
public final class C3769i0 extends C4121r {

    /* renamed from: t */
    public static final C3770a f8584t = new C3770a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private C4276x3 f8585r;

    /* renamed from: s */
    private final boolean f8586s;

    /* renamed from: bo.app.i0$a */
    public static final class C3770a {
        private C3770a() {
        }

        public /* synthetic */ C3770a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.i0$b */
    public static final class C3771b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3771b f8587b = new C3771b();

        public C3771b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "DataSyncRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.i0$c */
    public static final class C3772c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3772c f8588b = new C3772c();

        public C3772c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3769i0(String str, C4276x3 x3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null).mo14168a() : x3Var);
    }

    /* renamed from: a */
    public void mo13115a(C3666f2 f2Var, C3666f2 f2Var2, C3608d dVar) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3771b.f8587b, 7);
    }

    /* renamed from: b */
    public boolean mo13118b() {
        C4276x3 c = mo13433c();
        return (c != null && c.mo13244e()) && super.mo13118b();
    }

    /* renamed from: c */
    public C4276x3 mo13433c() {
        return this.f8585r;
    }

    /* renamed from: g */
    public boolean mo13434g() {
        return this.f8586s;
    }

    /* renamed from: l */
    public JSONObject mo13119l() {
        JSONObject l = super.mo13119l();
        if (l == null) {
            return null;
        }
        try {
            C4276x3 c = mo13433c();
            l.put("respond_with", c == null ? null : c.forJsonPut());
            return l;
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C3772c.f8588b, 4);
            return null;
        }
    }

    /* renamed from: a */
    public void mo13117a(Map<String, String> map) {
        boolean z;
        C19383o.m32797g(map, "existingHeaders");
        super.mo13117a(map);
        C4276x3 c = mo13433c();
        boolean z2 = false;
        boolean z3 = true;
        if (!(c != null && c.mo13244e())) {
            C4276x3 c2 = mo13433c();
            if (c2 != null && c2.mo14164x()) {
                map.put("X-Braze-FeedRequest", "true");
                z = true;
            } else {
                z = false;
            }
            C4276x3 c3 = mo13433c();
            if (c3 != null && c3.mo14165y()) {
                z2 = true;
            }
            if (z2) {
                map.put("X-Braze-TriggersRequest", "true");
            } else {
                z3 = z;
            }
            if (z3) {
                map.put("X-Braze-DataRequest", "true");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3769i0(String str, C4276x3 x3Var) {
        super(new C4179s4(C19383o.m32802l("data", str)));
        C19383o.m32797g(str, "urlBase");
        this.f8585r = x3Var;
        this.f8586s = true;
    }
}
