package p030bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.j4 */
public final class C3838j4 implements C3831j2 {

    /* renamed from: c */
    public static final C3839a f8714c = new C3839a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final int f8715b;

    /* renamed from: bo.app.j4$a */
    public static final class C3839a {
        private C3839a() {
        }

        public /* synthetic */ C3839a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.j4$b */
    public static final class C3840b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3840b f8716b = new C3840b();

        public C3840b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ReEligibilityConfig to JSON";
        }
    }

    public C3838j4(int i) {
        this.f8715b = i;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            return new JSONObject().put("re_eligibility", this.f8715b);
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3840b.f8716b, 4);
            return null;
        }
    }

    /* renamed from: o */
    public boolean mo13542o() {
        return this.f8715b == 0;
    }

    /* renamed from: q */
    public Integer mo13543q() {
        int i = this.f8715b;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: s */
    public boolean mo13544s() {
        return this.f8715b == -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3838j4(JSONObject jSONObject) {
        this(jSONObject.optInt("re_eligibility", -1));
        C19383o.m32797g(jSONObject, "json");
    }
}
