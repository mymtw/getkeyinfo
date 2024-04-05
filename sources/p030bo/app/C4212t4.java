package p030bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.t4 */
public final class C4212t4 implements C4004n2 {

    /* renamed from: i */
    public static final C4213a f9345i = new C4213a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final long f9346b;

    /* renamed from: c */
    private final long f9347c;

    /* renamed from: d */
    private final int f9348d;

    /* renamed from: e */
    private final int f9349e;

    /* renamed from: f */
    private final int f9350f;

    /* renamed from: g */
    private final C3831j2 f9351g;

    /* renamed from: h */
    private final int f9352h;

    /* renamed from: bo.app.t4$a */
    public static final class C4213a {
        private C4213a() {
        }

        public /* synthetic */ C4213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.t4$b */
    public static final class C4214b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4214b f9353b = new C4214b();

        public C4214b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ScheduleConfig to JSON";
        }
    }

    public C4212t4(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "json");
        this.f9346b = jSONObject.optLong("start_time", -1);
        this.f9347c = jSONObject.optLong("end_time", -1);
        this.f9348d = jSONObject.optInt("priority", 0);
        this.f9352h = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.f9349e = jSONObject.optInt("delay", 0);
        this.f9350f = jSONObject.optInt("timeout", -1);
        this.f9351g = new C3838j4(jSONObject);
    }

    /* renamed from: a */
    public int mo13773a() {
        return this.f9350f;
    }

    /* renamed from: c */
    public long mo13774c() {
        return this.f9346b;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) mo13778t().forJsonPut();
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put("start_time", mo13774c());
            jSONObject.put("end_time", mo13776h());
            jSONObject.put("priority", mo13779u());
            jSONObject.put("min_seconds_since_last_trigger", mo13777l());
            jSONObject.put("timeout", mo13773a());
            jSONObject.put("delay", mo13775g());
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4214b.f9353b, 4);
        }
    }

    /* renamed from: g */
    public int mo13775g() {
        return this.f9349e;
    }

    /* renamed from: h */
    public long mo13776h() {
        return this.f9347c;
    }

    /* renamed from: l */
    public int mo13777l() {
        return this.f9352h;
    }

    /* renamed from: t */
    public C3831j2 mo13778t() {
        return this.f9351g;
    }

    /* renamed from: u */
    public int mo13779u() {
        return this.f9348d;
    }
}
