package p030bo.app;

import com.appboy.enums.SdkFlavor;
import com.braze.Braze;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p301z3.C8432b;
import p753kq.C19846a;

/* renamed from: bo.app.r */
public abstract class C4121r extends C4006n4 implements C4296y1 {

    /* renamed from: q */
    public static final C4122a f9157q = new C4122a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private Long f9158b;

    /* renamed from: c */
    private String f9159c;

    /* renamed from: d */
    private String f9160d;

    /* renamed from: e */
    private String f9161e;

    /* renamed from: f */
    private C3821j0 f9162f;

    /* renamed from: g */
    private String f9163g;

    /* renamed from: h */
    private String f9164h;

    /* renamed from: i */
    private SdkFlavor f9165i;

    /* renamed from: j */
    private C4298y3 f9166j;

    /* renamed from: k */
    private C4276x3 f9167k;

    /* renamed from: l */
    private C3845k f9168l;

    /* renamed from: m */
    private String f9169m;

    /* renamed from: n */
    private String f9170n;

    /* renamed from: o */
    private EnumSet<BrazeSdkMetadata> f9171o;

    /* renamed from: p */
    private final boolean f9172p;

    /* renamed from: bo.app.r$a */
    public static final class C4122a {
        private C4122a() {
        }

        public /* synthetic */ C4122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.r$b */
    public static final class C4123b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4123b f9173b = new C4123b();

        public C4123b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger dispatch completed. Alerting subscribers.";
        }
    }

    /* renamed from: bo.app.r$c */
    public static final class C4124c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9174b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4124c(String str) {
            super(0);
            this.f9174b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9174b, "Error occurred while executing Braze request: ");
        }
    }

    /* renamed from: bo.app.r$d */
    public static final class C4125d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4125d f9175b = new C4125d();

        public C4125d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* renamed from: bo.app.r$e */
    public static final class C4126e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4126e f9176b = new C4126e();

        public C4126e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                        !! WARNING !!                         **";
        }
    }

    /* renamed from: bo.app.r$f */
    public static final class C4127f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4127f f9177b = new C4127f();

        public C4127f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**  The current API key/endpoint combination is invalid. This   **";
        }
    }

    /* renamed from: bo.app.r$g */
    public static final class C4128g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4128g f9178b = new C4128g();

        public C4128g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "** is potentially an integration error. Please ensure that your **";
        }
    }

    /* renamed from: bo.app.r$h */
    public static final class C4129h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4129h f9179b = new C4129h();

        public C4129h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**     API key AND custom endpoint information are correct.     **";
        }
    }

    /* renamed from: bo.app.r$i */
    public static final class C4130i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4121r f9180b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4130i(C4121r rVar) {
            super(0);
            this.f9180b = rVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9180b.mo13972n(), ">> API key    : ");
        }
    }

    /* renamed from: bo.app.r$j */
    public static final class C4131j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4121r f9181b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4131j(C4121r rVar) {
            super(0);
            this.f9181b = rVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9181b.mo13570h(), ">> Request Uri: ");
        }
    }

    /* renamed from: bo.app.r$k */
    public static final class C4132k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4132k f9182b = new C4132k();

        public C4132k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* renamed from: bo.app.r$l */
    public static final class C4133l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4133l f9183b = new C4133l();

        public C4133l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4121r(C4179s4 s4Var) {
        super(s4Var);
        C19383o.m32797g(s4Var, "requestTarget");
    }

    /* renamed from: a */
    public void mo13958a(Long l) {
        this.f9158b = l;
    }

    /* renamed from: a */
    public boolean mo13568a(C3961m2 m2Var) {
        C19383o.m32797g(m2Var, "responseError");
        return false;
    }

    /* renamed from: b */
    public void mo13960b(String str) {
        this.f9159c = str;
    }

    /* renamed from: c */
    public void mo13961c(String str) {
        this.f9163g = str;
    }

    /* renamed from: d */
    public C4298y3 mo13962d() {
        return this.f9166j;
    }

    /* renamed from: e */
    public void mo13965e(String str) {
        this.f9164h = str;
    }

    /* renamed from: f */
    public void mo13967f(String str) {
        this.f9160d = str;
    }

    /* renamed from: g */
    public void mo13968g(String str) {
        this.f9161e = str;
    }

    /* renamed from: h */
    public C4179s4 mo13570h() {
        Braze.Companion companion = Braze.f11170m;
        return new C4179s4(Braze.Companion.m10671d(this.f8968a.mo14060a()));
    }

    /* renamed from: i */
    public EnumSet<BrazeSdkMetadata> mo13969i() {
        return this.f9171o;
    }

    /* renamed from: j */
    public Long mo13970j() {
        return this.f9158b;
    }

    /* renamed from: k */
    public String mo13971k() {
        return this.f9169m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e7 A[Catch:{ JSONException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8 A[Catch:{ JSONException -> 0x00f7 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo13119l() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.mo13973o()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "device_id"
            java.lang.String r2 = r7.mo13973o()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0014:
            java.lang.Long r1 = r7.mo13970j()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "time"
            java.lang.Long r2 = r7.mo13970j()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0023:
            java.lang.String r1 = r7.mo13972n()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "api_key"
            java.lang.String r2 = r7.mo13972n()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0032:
            java.lang.String r1 = r7.mo13977s()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = r7.mo13977s()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0041:
            java.lang.String r1 = r7.mo13975q()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "app_version"
            java.lang.String r2 = r7.mo13975q()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0050:
            java.lang.String r1 = r7.mo13974p()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x005f
            boolean r1 = kotlin.text.C19457k.m33020X0(r1)     // Catch:{ JSONException -> 0x00f7 }
            if (r1 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r1 = 0
            goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "app_version_code"
            java.lang.String r2 = r7.mo13974p()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00f7 }
        L_0x006b:
            bo.app.j0 r1 = r7.mo13966f()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 != 0) goto L_0x0072
            goto L_0x0081
        L_0x0072:
            boolean r2 = r1.mo13244e()     // Catch:{ JSONException -> 0x00f7 }
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = "device"
            org.json.JSONObject r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0081:
            bo.app.y3 r1 = r7.mo13962d()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 != 0) goto L_0x0088
            goto L_0x0097
        L_0x0088:
            boolean r2 = r1.mo13244e()     // Catch:{ JSONException -> 0x00f7 }
            if (r2 != 0) goto L_0x0097
            java.lang.String r2 = "attributes"
            org.json.JSONArray r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00f7 }
        L_0x0097:
            bo.app.k r1 = r7.mo13964e()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 != 0) goto L_0x009e
            goto L_0x00d1
        L_0x009e:
            boolean r2 = r1.mo13244e()     // Catch:{ JSONException -> 0x00f7 }
            if (r2 != 0) goto L_0x00d1
            java.lang.String r2 = "events"
            java.util.Set r1 = r1.mo13553b()     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r3 = com.braze.support.JsonUtils.f11953a     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)     // Catch:{ JSONException -> 0x00f7 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00f7 }
            r3.<init>()     // Catch:{ JSONException -> 0x00f7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x00f7 }
        L_0x00ba:
            boolean r4 = r1.hasNext()     // Catch:{ JSONException -> 0x00f7 }
            if (r4 == 0) goto L_0x00ce
            java.lang.Object r4 = r1.next()     // Catch:{ JSONException -> 0x00f7 }
            a4.b r4 = (p005a4.C0035b) r4     // Catch:{ JSONException -> 0x00f7 }
            java.lang.Object r4 = r4.forJsonPut()     // Catch:{ JSONException -> 0x00f7 }
            r3.put(r4)     // Catch:{ JSONException -> 0x00f7 }
            goto L_0x00ba
        L_0x00ce:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x00f7 }
        L_0x00d1:
            com.appboy.enums.SdkFlavor r1 = r7.mo13976r()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 != 0) goto L_0x00d8
            goto L_0x00e1
        L_0x00d8:
            java.lang.String r2 = "sdk_flavor"
            java.lang.String r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00f7 }
        L_0x00e1:
            java.util.EnumSet r1 = r7.mo13969i()     // Catch:{ JSONException -> 0x00f7 }
            if (r1 != 0) goto L_0x00e8
            goto L_0x00f6
        L_0x00e8:
            java.lang.String r2 = "sdk_metadata"
            com.braze.enums.BrazeSdkMetadata$a r3 = com.braze.enums.BrazeSdkMetadata.Companion     // Catch:{ JSONException -> 0x00f7 }
            r3.getClass()     // Catch:{ JSONException -> 0x00f7 }
            org.json.JSONArray r1 = com.braze.enums.BrazeSdkMetadata.C5418a.m11018a(r1)     // Catch:{ JSONException -> 0x00f7 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00f7 }
        L_0x00f6:
            return r0
        L_0x00f7:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.r$l r5 = p030bo.app.C4121r.C4133l.f9183b
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4121r.mo13119l():org.json.JSONObject");
    }

    /* renamed from: m */
    public C4172s1 mo13571m() {
        return new C3615d1((int) TimeUnit.MINUTES.toMillis(5), 0, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public String mo13972n() {
        return this.f9160d;
    }

    /* renamed from: o */
    public String mo13973o() {
        return this.f9159c;
    }

    /* renamed from: p */
    public String mo13974p() {
        return this.f9164h;
    }

    /* renamed from: q */
    public String mo13975q() {
        return this.f9163g;
    }

    /* renamed from: r */
    public SdkFlavor mo13976r() {
        return this.f9165i;
    }

    /* renamed from: s */
    public String mo13977s() {
        return this.f9161e;
    }

    public String toString() {
        return JsonUtils.m11315f(mo13119l());
    }

    /* renamed from: a */
    public void mo13954a(C3821j0 j0Var) {
        this.f9162f = j0Var;
    }

    /* renamed from: b */
    public boolean mo13118b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo13966f());
        arrayList.add(mo13962d());
        arrayList.add(mo13964e());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3637e2 e2Var = (C3637e2) it.next();
            if (e2Var != null && !e2Var.mo13244e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public C4276x3 mo13433c() {
        return this.f9167k;
    }

    /* renamed from: d */
    public void mo13963d(String str) {
        this.f9169m = str;
    }

    /* renamed from: e */
    public C3845k mo13964e() {
        return this.f9168l;
    }

    /* renamed from: f */
    public C3821j0 mo13966f() {
        return this.f9162f;
    }

    /* renamed from: g */
    public boolean mo13434g() {
        return this.f9172p;
    }

    /* renamed from: a */
    public void mo13957a(SdkFlavor sdkFlavor) {
        this.f9165i = sdkFlavor;
    }

    /* renamed from: a */
    public void mo13956a(C4298y3 y3Var) {
        this.f9166j = y3Var;
    }

    /* renamed from: a */
    public void mo13955a(C3845k kVar) {
        this.f9168l = kVar;
    }

    /* renamed from: a */
    public String mo13114a() {
        return this.f9170n;
    }

    /* renamed from: a */
    public void mo13116a(String str) {
        this.f9170n = str;
    }

    /* renamed from: a */
    public void mo13959a(EnumSet<BrazeSdkMetadata> enumSet) {
        this.f9171o = enumSet;
    }

    /* renamed from: b */
    public void mo13569b(C3666f2 f2Var) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C4276x3 c = mo13433c();
        boolean z = true;
        if (c == null || !c.mo14165y()) {
            z = false;
        }
        if (z) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4123b.f9173b, 7);
            f2Var.mo13286a(new C3593b6(this), C3593b6.class);
        }
    }

    /* renamed from: a */
    public void mo13567a(C3666f2 f2Var, C3666f2 f2Var2, C3961m2 m2Var) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        C19383o.m32797g(m2Var, "responseError");
        String a = m2Var.mo13306a();
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C4124c(a), 6);
        if (m2Var instanceof C3690g3) {
            f2Var.mo13286a(m2Var, C3690g3.class);
            BrazeLogger brazeLogger2 = brazeLogger;
            BrazeLogger.Priority priority2 = priority;
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, C4125d.f9175b, 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, C4126e.f9176b, 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, C4127f.f9177b, 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, C4128g.f9178b, 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, C4129h.f9179b, 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, new C4130i(this), 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, new C4131j(this), 6);
            BrazeLogger.m11282d(brazeLogger2, this, priority2, (Throwable) null, C4132k.f9182b, 6);
        }
        if (m2Var instanceof C4235u4) {
            f2Var2.mo13286a(new C8432b((C4235u4) m2Var), C8432b.class);
        }
    }

    /* renamed from: a */
    public void mo13566a(C3666f2 f2Var) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C4276x3 c = mo13433c();
        boolean z = true;
        if (c == null || !c.mo14165y()) {
            z = false;
        }
        if (z) {
            f2Var.mo13286a(new C3606c6(this), C3606c6.class);
        }
    }

    /* renamed from: a */
    public void mo13117a(Map<String, String> map) {
        C19383o.m32797g(map, "existingHeaders");
        map.put("X-Braze-Api-Key", mo13972n());
        String k = mo13971k();
        if (!(k == null || k.length() == 0)) {
            map.put("X-Braze-Auth-Signature", mo13971k());
        }
    }
}
