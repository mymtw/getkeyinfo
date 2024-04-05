package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.JsonUtils;
import com.facebook.login.LoginFragment;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p005a4.C0034a;
import p753kq.C19846a;

/* renamed from: bo.app.d */
public final class C3608d {

    /* renamed from: j */
    public static final C3613e f8306j = new C3613e((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final JSONObject f8307a;

    /* renamed from: b */
    private final Map<String, String> f8308b;

    /* renamed from: c */
    private final C4309z f8309c;

    /* renamed from: d */
    private final C5483a f8310d;

    /* renamed from: e */
    private final List<C4275x2> f8311e;

    /* renamed from: f */
    private final C4299y4 f8312f;

    /* renamed from: g */
    private final List<C0034a> f8313g;

    /* renamed from: h */
    private final JSONArray f8314h;

    /* renamed from: i */
    private final C3961m2 f8315i;

    /* renamed from: bo.app.d$a */
    public static final class C3609a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3608d f8316b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3609a(C3608d dVar) {
            super(0);
            this.f8316b = dVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8316b.mo13178f(), "Encountered Exception processing Content Cards response: ");
        }
    }

    /* renamed from: bo.app.d$b */
    public static final class C3610b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3608d f8317b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3610b(C3608d dVar) {
            super(0);
            this.f8317b = dVar;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Found ");
            h.append(this.f8317b.mo13181i().size());
            h.append(" triggered actions in server response.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.d$c */
    public static final class C3611c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8318b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3611c(JSONObject jSONObject) {
            super(0);
            this.f8318b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f(this.f8318b), "Got server config: ");
        }
    }

    /* renamed from: bo.app.d$d */
    public static final class C3612d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8319b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3612d(JSONObject jSONObject) {
            super(0);
            this.f8319b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8319b, "Encountered Exception processing server config: ");
        }
    }

    /* renamed from: bo.app.d$e */
    public static final class C3613e {
        private C3613e() {
        }

        public /* synthetic */ C3613e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3961m2 mo13186a(JSONObject jSONObject, C4296y1 y1Var) {
            C19383o.m32797g(jSONObject, "jsonObject");
            C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
            String e = JsonUtils.m11314e("error", jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("auth_error");
            if (optJSONObject != null) {
                return new C4235u4(y1Var, optJSONObject.optInt("error_code", -1), JsonUtils.m11314e("reason", optJSONObject), e);
            } else if (C19383o.m32792b(e, "invalid_api_key")) {
                return new C3690g3(e, y1Var);
            } else {
                if (e != null) {
                    return new C3674g(e, y1Var);
                }
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b A[SYNTHETIC, Splitter:B:14:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3608d(kotlin.Pair<? extends org.json.JSONObject, ? extends java.util.Map<java.lang.String, java.lang.String>> r9, p030bo.app.C4296y1 r10, p030bo.app.C4274x1 r11) {
        /*
            r8 = this;
            java.lang.String r0 = "responseData"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r0 = "brazeManager"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r8.<init>()
            java.lang.Object r0 = r9.getFirst()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r8.f8307a = r0
            java.lang.Object r9 = r9.getSecond()
            java.util.Map r9 = (java.util.Map) r9
            r8.f8308b = r9
            java.lang.String r9 = "feed"
            org.json.JSONArray r9 = r0.optJSONArray(r9)
            r8.f8314h = r9
            bo.app.d$e r9 = f8306j
            bo.app.m2 r9 = r9.mo13186a(r0, r10)
            r8.f8315i = r9
            r1 = 0
            if (r9 != 0) goto L_0x004f
            boolean r9 = r10 instanceof p030bo.app.C3570b0
            if (r9 == 0) goto L_0x004f
            bo.app.z r9 = new bo.app.z     // Catch:{ Exception -> 0x003f }
            r9.<init>((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x003f }
            goto L_0x0050
        L_0x003f:
            r9 = move-exception
            r5 = r9
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W
            bo.app.d$a r6 = new bo.app.d$a
            r6.<init>(r8)
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
        L_0x004f:
            r9 = r1
        L_0x0050:
            r8.f8309c = r9
            org.json.JSONObject r9 = r8.f8307a
            java.lang.String r10 = "triggers"
            org.json.JSONArray r9 = r9.optJSONArray(r10)
            java.util.List r9 = p030bo.app.C3843j6.m8953a((org.json.JSONArray) r9, (p030bo.app.C4274x1) r11)
            r8.f8311e = r9
            if (r9 == 0) goto L_0x0071
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.V
            bo.app.d$b r6 = new bo.app.d$b
            r6.<init>(r8)
            r5 = 0
            r7 = 6
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
        L_0x0071:
            org.json.JSONObject r9 = r8.f8307a
            java.lang.String r10 = "config"
            org.json.JSONObject r9 = r9.optJSONObject(r10)
            if (r9 == 0) goto L_0x00a6
            bo.app.y4 r10 = new bo.app.y4     // Catch:{ Exception -> 0x0093 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0093 }
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0090 }
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.V     // Catch:{ Exception -> 0x0090 }
            r5 = 0
            bo.app.d$c r6 = new bo.app.d$c     // Catch:{ Exception -> 0x0090 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x0090 }
            r7 = 6
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00a7
        L_0x0090:
            r0 = move-exception
            r5 = r0
            goto L_0x0097
        L_0x0093:
            r10 = move-exception
            r0 = r10
            r5 = r0
            r10 = r1
        L_0x0097:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W
            bo.app.d$d r6 = new bo.app.d$d
            r6.<init>(r9)
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
            goto L_0x00a7
        L_0x00a6:
            r10 = r1
        L_0x00a7:
            r8.f8312f = r10
            org.json.JSONObject r9 = r8.f8307a
            java.lang.String r10 = "templated_message"
            org.json.JSONObject r9 = r9.optJSONObject(r10)
            com.braze.models.inappmessage.a r9 = p030bo.app.C3843j6.m8951a((org.json.JSONObject) r9, (p030bo.app.C4274x1) r11)
            r8.f8310d = r9
            org.json.JSONObject r9 = r8.f8307a
            java.lang.String r10 = "geofences"
            org.json.JSONArray r9 = r9.optJSONArray(r10)
            if (r9 == 0) goto L_0x00c5
            java.util.List r1 = p030bo.app.C3725h1.m8742a(r9)
        L_0x00c5:
            r8.f8313g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3608d.<init>(kotlin.Pair, bo.app.y1, bo.app.x1):void");
    }

    /* renamed from: a */
    public final C4309z mo13173a() {
        return this.f8309c;
    }

    /* renamed from: b */
    public final C3961m2 mo13174b() {
        return this.f8315i;
    }

    /* renamed from: c */
    public final JSONArray mo13175c() {
        return this.f8314h;
    }

    /* renamed from: d */
    public final List<C0034a> mo13176d() {
        return this.f8313g;
    }

    /* renamed from: e */
    public final Map<String, String> mo13177e() {
        return this.f8308b;
    }

    /* renamed from: f */
    public final JSONObject mo13178f() {
        return this.f8307a;
    }

    /* renamed from: g */
    public final C4299y4 mo13179g() {
        return this.f8312f;
    }

    /* renamed from: h */
    public final C5483a mo13180h() {
        return this.f8310d;
    }

    /* renamed from: i */
    public final List<C4275x2> mo13181i() {
        return this.f8311e;
    }
}
