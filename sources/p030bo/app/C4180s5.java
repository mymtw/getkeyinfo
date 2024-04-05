package p030bo.app;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONException;
import p753kq.C19846a;

/* renamed from: bo.app.s5 */
public final class C4180s5 extends C4121r {

    /* renamed from: C */
    public static final C4181a f9280C = new C4181a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C3615d1 f9281A;

    /* renamed from: B */
    private final boolean f9282B;

    /* renamed from: r */
    private final C4215t5 f9283r;

    /* renamed from: s */
    private final C4173s2 f9284s;

    /* renamed from: t */
    private final C4274x1 f9285t;

    /* renamed from: u */
    private final String f9286u;

    /* renamed from: v */
    private final long f9287v;

    /* renamed from: w */
    private final long f9288w;

    /* renamed from: x */
    private final long f9289x;

    /* renamed from: y */
    private final C4275x2 f9290y;

    /* renamed from: z */
    private C4276x3 f9291z;

    /* renamed from: bo.app.s5$a */
    public static final class C4181a {
        private C4181a() {
        }

        public /* synthetic */ C4181a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.s5$b */
    public static final class C4182b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4182b f9292b = new C4182b();

        public C4182b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Template request failed. Attempting to log in-app message template request failure.";
        }
    }

    /* renamed from: bo.app.s5$c */
    public static final class C4183c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4183c f9293b = new C4183c();

        public C4183c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger ID not found. Not logging in-app message template request failure.";
        }
    }

    /* renamed from: bo.app.s5$d */
    public static final class C4184d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4184d f9294b = new C4184d();

        public C4184d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* renamed from: bo.app.s5$e */
    public static final class C4185e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f9295b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4185e(long j) {
            super(0);
            this.f9295b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0087d.m236f(C0072d.m201h("Template request has not yet expired. It expires at time: "), this.f9295b, ". Proceeding with retry.");
        }
    }

    /* renamed from: bo.app.s5$f */
    public static final class C4186f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f9296b;

        /* renamed from: c */
        public final /* synthetic */ C4180s5 f9297c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4186f(long j, C4180s5 s5Var) {
            super(0);
            this.f9296b = j;
            this.f9297c = s5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Template request expired at time: ");
            h.append(this.f9296b);
            h.append(" and is not eligible for a response retry. Not retrying or performing any fallback triggers. ");
            h.append(this.f9297c);
            return h.toString();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4180s5(java.lang.String r17, p030bo.app.C4215t5 r18, p030bo.app.C4173s2 r19, p030bo.app.C4274x1 r20, java.lang.String r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "urlBase"
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            java.lang.String r5 = "templatedTriggeredAction"
            kotlin.jvm.internal.C19383o.m32797g(r2, r5)
            java.lang.String r5 = "triggerEvent"
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            java.lang.String r5 = "brazeManager"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            bo.app.s4 r5 = new bo.app.s4
            java.lang.String r6 = "template"
            java.lang.String r1 = kotlin.jvm.internal.C19383o.m32802l(r6, r1)
            r5.<init>((java.lang.String) r1)
            r0.<init>(r5)
            r0.f9283r = r2
            r0.f9284s = r3
            r0.f9285t = r4
            java.lang.String r1 = r18.mo14111z()
            r0.f9286u = r1
            bo.app.n2 r1 = r18.mo13680f()
            long r3 = r0.m9592a((p030bo.app.C4004n2) r1)
            r0.f9287v = r3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r5 = 1
            long r7 = r1.toMillis(r5)
            long r3 = java.lang.Math.min(r3, r7)
            r0.f9288w = r3
            long r7 = r18.mo14110A()
            r0.f9289x = r7
            r0.f9290y = r2
            bo.app.x3$a r1 = new bo.app.x3$a
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 15
            r15 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2 = r21
            bo.app.x3$a r1 = r1.mo14172b((java.lang.String) r2)
            bo.app.x3 r1 = r1.mo14168a()
            r0.f9291z = r1
            bo.app.d1 r1 = new bo.app.d1
            int r2 = (int) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r3.toMillis(r5)
            int r3 = (int) r3
            r1.<init>(r2, r3)
            r0.f9281A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4180s5.<init>(java.lang.String, bo.app.t5, bo.app.s2, bo.app.x1, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo13115a(C3666f2 f2Var, C3666f2 f2Var2, C3608d dVar) {
        C5483a aVar;
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        mo13571m().mo13191c();
        if (dVar == null) {
            aVar = null;
        } else {
            aVar = dVar.mo13180h();
        }
        if (aVar != null) {
            dVar.mo13180h().mo15954G(this.f9283r.mo13782y());
        } else {
            mo14067x();
        }
    }

    /* renamed from: b */
    public boolean mo13118b() {
        return this.f9282B;
    }

    /* renamed from: c */
    public C4276x3 mo13433c() {
        return this.f9291z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[Catch:{ JSONException -> 0x005d }] */
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
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "trigger_id"
            java.lang.String r4 = r8.f9286u     // Catch:{ JSONException -> 0x005d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r3 = "trigger_event_type"
            bo.app.s2 r4 = r8.f9284s     // Catch:{ JSONException -> 0x005d }
            java.lang.String r4 = r4.mo13075d()     // Catch:{ JSONException -> 0x005d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r3 = "data"
            bo.app.s2 r4 = r8.f9284s     // Catch:{ JSONException -> 0x005d }
            bo.app.t1 r4 = r4.mo13262a()     // Catch:{ JSONException -> 0x005d }
            if (r4 != 0) goto L_0x002b
            r4 = r1
            goto L_0x0031
        L_0x002b:
            java.lang.Object r4 = r4.forJsonPut()     // Catch:{ JSONException -> 0x005d }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ JSONException -> 0x005d }
        L_0x0031:
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r3 = "template"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x005d }
            bo.app.x3 r2 = r8.mo13433c()     // Catch:{ JSONException -> 0x005d }
            r3 = 1
            if (r2 != 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            boolean r2 = r2.mo14166z()     // Catch:{ JSONException -> 0x005d }
            if (r2 != r3) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            if (r3 == 0) goto L_0x005c
            java.lang.String r2 = "respond_with"
            bo.app.x3 r3 = r8.mo13433c()     // Catch:{ JSONException -> 0x005d }
            if (r3 != 0) goto L_0x0055
            r3 = r1
            goto L_0x0059
        L_0x0055:
            org.json.JSONObject r3 = r3.forJsonPut()     // Catch:{ JSONException -> 0x005d }
        L_0x0059:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x005d }
        L_0x005c:
            return r0
        L_0x005d:
            r0 = move-exception
            r5 = r0
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W
            bo.app.s5$d r6 = p030bo.app.C4180s5.C4184d.f9294b
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4180s5.mo13119l():org.json.JSONObject");
    }

    /* renamed from: t */
    public C3615d1 mo13571m() {
        return this.f9281A;
    }

    /* renamed from: u */
    public final long mo14064u() {
        return this.f9289x;
    }

    /* renamed from: v */
    public final C4173s2 mo14065v() {
        return this.f9284s;
    }

    /* renamed from: w */
    public final C4275x2 mo14066w() {
        return this.f9290y;
    }

    /* renamed from: x */
    public final void mo14067x() {
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, C4182b.f9292b, 6);
        if (C19457k.m33020X0(this.f9286u)) {
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C4183c.f9293b, 7);
            return;
        }
        try {
            C4208t1 a = C3787j.f8608h.mo13466a(this.f9286u, InAppMessageFailureType.TEMPLATE_REQUEST);
            if (a != null) {
                this.f9285t.mo13838a(a);
            }
        } catch (JSONException e) {
            this.f9285t.mo13841b((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo13567a(C3666f2 f2Var, C3666f2 f2Var2, C3961m2 m2Var) {
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        C19383o.m32797g(m2Var, "responseError");
        super.mo13567a(f2Var, f2Var2, m2Var);
        mo14067x();
        if (m2Var instanceof C3674g) {
            f2Var.mo13286a(new C3967m6(this.f9284s, this.f9283r), C3967m6.class);
        }
    }

    /* renamed from: a */
    public boolean mo13568a(C3961m2 m2Var) {
        C19383o.m32797g(m2Var, "responseError");
        if (!(m2Var instanceof C4075p3) && !(m2Var instanceof C4235u4)) {
            return false;
        }
        long e = this.f9284s.mo13265e() + this.f9287v;
        TimeZone timeZone = DateTimeUtils.f11946a;
        if (System.currentTimeMillis() < e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4185e(e), 6);
            return true;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4186f(e, this), 7);
        return false;
    }

    /* renamed from: a */
    private final long m9592a(C4004n2 n2Var) {
        if (n2Var.mo13773a() == -1) {
            return TimeUnit.SECONDS.toMillis((long) (n2Var.mo13775g() + 30));
        }
        return (long) n2Var.mo13773a();
    }
}
