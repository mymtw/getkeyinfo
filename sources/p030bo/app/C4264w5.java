package p030bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.w5 */
public final class C4264w5 extends C4121r {

    /* renamed from: v */
    public static final C4265a f9411v = new C4265a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final List<String> f9412r;

    /* renamed from: s */
    private final long f9413s;

    /* renamed from: t */
    private String f9414t;

    /* renamed from: u */
    private final boolean f9415u = true;

    /* renamed from: bo.app.w5$a */
    public static final class C4265a {
        private C4265a() {
        }

        public /* synthetic */ C4265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.w5$b */
    public static final class C4266b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4266b f9416b = new C4266b();

        public C4266b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "TestUserDeviceLog executed successfully.";
        }
    }

    /* renamed from: bo.app.w5$c */
    public static final class C4267c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4267c f9417b = new C4267c();

        public C4267c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4264w5(String str, List<String> list, long j, String str2) {
        super(new C4179s4(C19383o.m32802l("data", str)));
        C19383o.m32797g(str, "urlBase");
        C19383o.m32797g(list, "deviceLogs");
        this.f9412r = list;
        this.f9413s = j;
        this.f9414t = str2;
    }

    /* renamed from: a */
    public String mo13114a() {
        return this.f9414t;
    }

    /* renamed from: b */
    public boolean mo13118b() {
        return this.f9412r.isEmpty() && super.mo13118b();
    }

    /* renamed from: g */
    public boolean mo13434g() {
        return this.f9415u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[Catch:{ JSONException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[Catch:{ JSONException -> 0x0051 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo13119l() {
        /*
            r8 = this;
            org.json.JSONObject r0 = super.mo13119l()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0051 }
            r2.<init>()     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r3 = "time"
            long r4 = r8.f9413s     // Catch:{ JSONException -> 0x0051 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r3 = r8.mo13114a()     // Catch:{ JSONException -> 0x0051 }
            if (r3 == 0) goto L_0x0023
            boolean r3 = kotlin.text.C19457k.m33020X0(r3)     // Catch:{ JSONException -> 0x0051 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = 1
        L_0x0024:
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = "user_id"
            java.lang.String r4 = r8.mo13114a()     // Catch:{ JSONException -> 0x0051 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0051 }
        L_0x002f:
            java.util.List<java.lang.String> r3 = r8.f9412r     // Catch:{ JSONException -> 0x0051 }
            boolean r3 = r3.isEmpty()     // Catch:{ JSONException -> 0x0051 }
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = "device_logs"
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0051 }
            java.util.List<java.lang.String> r5 = r8.f9412r     // Catch:{ JSONException -> 0x0051 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0051 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0051 }
        L_0x0043:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0051 }
            r3.<init>()     // Catch:{ JSONException -> 0x0051 }
            r3.put(r2)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r2 = "test_user_data"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0051 }
            return r0
        L_0x0051:
            r0 = move-exception
            r5 = r0
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            bo.app.w5$c r6 = p030bo.app.C4264w5.C4267c.f9417b
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4264w5.mo13119l():org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo13116a(String str) {
        this.f9414t = str;
    }

    /* renamed from: a */
    public void mo13115a(C3666f2 f2Var, C3666f2 f2Var2, C3608d dVar) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4266b.f9416b, 7);
    }
}
