package p030bo.app;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p005a4.C0035b;

/* renamed from: bo.app.w3 */
public final class C4259w3 implements C0035b<JSONObject>, C3637e2 {

    /* renamed from: d */
    public static final C4260a f9405d = new C4260a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final long f9406b;

    /* renamed from: c */
    private final boolean f9407c;

    /* renamed from: bo.app.w3$a */
    public static final class C4260a {
        private C4260a() {
        }

        public /* synthetic */ C4260a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4259w3(long j, boolean z) {
        this.f9406b = j;
        this.f9407c = z;
    }

    /* renamed from: e */
    public boolean mo13244e() {
        return !this.f9407c;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f9406b);
        return jSONObject;
    }
}
