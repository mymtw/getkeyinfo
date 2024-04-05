package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0035b;
import p030bo.app.C3670f5;
import p753kq.C19846a;

/* renamed from: bo.app.d5 */
public class C3624d5 implements C0035b<JSONObject> {

    /* renamed from: f */
    public static final C3625a f8340f = new C3625a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C3670f5 f8341b;

    /* renamed from: c */
    private final double f8342c;

    /* renamed from: d */
    private volatile Double f8343d;

    /* renamed from: e */
    private volatile boolean f8344e;

    /* renamed from: bo.app.d5$a */
    public static final class C3625a {
        private C3625a() {
        }

        public /* synthetic */ C3625a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.d5$b */
    public static final class C3626b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ double f8345b;

        /* renamed from: c */
        public final /* synthetic */ C3624d5 f8346c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3626b(double d, C3624d5 d5Var) {
            super(0);
            this.f8345b = d;
            this.f8346c = d5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("End time '");
            h.append(this.f8345b);
            h.append("' for session is less than the start time '");
            h.append(this.f8346c.mo13214x());
            h.append("' for this session.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.d5$c */
    public static final class C3627c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3627c f8347b = new C3627c();

        public C3627c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Session Json.";
        }
    }

    public C3624d5(C3670f5 f5Var, double d, Double d2, boolean z) {
        C19383o.m32797g(f5Var, "sessionId");
        this.f8341b = f5Var;
        this.f8342c = d;
        mo13207a(d2);
        this.f8344e = z;
    }

    /* renamed from: a */
    public void mo13207a(Double d) {
        this.f8343d = d;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f8341b);
            jSONObject.put("start_time", this.f8342c);
            jSONObject.put("is_sealed", this.f8344e);
            if (mo13213w() != null) {
                jSONObject.put("end_time", mo13213w());
            }
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3627c.f8347b, 4);
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final C3670f5 mo13210n() {
        return this.f8341b;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\nSession(sessionId=");
        h.append(this.f8341b);
        h.append(", startTime=");
        h.append(this.f8342c);
        h.append(", endTime=");
        h.append(mo13213w());
        h.append(", isSealed=");
        h.append(this.f8344e);
        h.append(", duration=");
        h.append(mo13212v());
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final long mo13212v() {
        Double w = mo13213w();
        if (w == null) {
            return -1;
        }
        double doubleValue = w.doubleValue();
        long j = (long) (doubleValue - this.f8342c);
        if (j < 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3626b(doubleValue, this), 6);
        }
        return j;
    }

    /* renamed from: w */
    public Double mo13213w() {
        return this.f8343d;
    }

    /* renamed from: x */
    public final double mo13214x() {
        return this.f8342c;
    }

    /* renamed from: y */
    public final boolean mo13215y() {
        return this.f8344e;
    }

    /* renamed from: z */
    public final C4005n3 mo13216z() {
        return new C4005n3(this.f8341b, this.f8342c, mo13213w(), this.f8344e);
    }

    /* renamed from: a */
    public final void mo13208a(boolean z) {
        this.f8344e = z;
    }

    public C3624d5(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "sessionData");
        C3670f5.C3671a aVar = C3670f5.f8421d;
        String string = jSONObject.getString("session_id");
        C19383o.m32796f(string, "sessionData.getString(SESSION_ID_KEY)");
        this.f8341b = aVar.mo13298a(string);
        this.f8342c = jSONObject.getDouble("start_time");
        this.f8344e = jSONObject.getBoolean("is_sealed");
        String str = JsonUtils.f11953a;
        mo13207a((!jSONObject.has("end_time") || jSONObject.isNull("end_time")) ? null : Double.valueOf(jSONObject.optDouble("end_time")));
    }
}
