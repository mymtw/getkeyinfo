package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.C19814c;
import org.json.JSONArray;
import p514bk.C14088a;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.a5 */
public final class C3551a5 {

    /* renamed from: f */
    public static final C3552a f8202f = new C3552a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C4035o2 f8203a;

    /* renamed from: b */
    private final SharedPreferences f8204b;

    /* renamed from: c */
    private final ReentrantLock f8205c = new ReentrantLock();

    /* renamed from: d */
    private final C19814c f8206d = C14088a.m21779d();

    /* renamed from: e */
    private C4299y4 f8207e;

    /* renamed from: bo.app.a5$a */
    public static final class C3552a {
        private C3552a() {
        }

        public /* synthetic */ C3552a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.a5$b */
    public static final class C3553b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3553b f8208b = new C3553b();

        public C3553b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not allowing server config info unlock. Returning null.";
        }
    }

    /* renamed from: bo.app.a5$c */
    public static final class C3554c extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f8209b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3554c(JSONArray jSONArray) {
            super(1);
            this.f8209b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo13098a(int i) {
            return Boolean.valueOf(this.f8209b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo13098a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.a5$d */
    public static final class C3555d extends Lambda implements C19857l<Integer, String> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f8210b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3555d(JSONArray jSONArray) {
            super(1);
            this.f8210b = jSONArray;
        }

        /* renamed from: a */
        public final String mo13099a(int i) {
            Object obj = this.f8210b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo13099a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.a5$e */
    public static final class C3556e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3556e f8211b = new C3556e();

        public C3556e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
        }
    }

    /* renamed from: bo.app.a5$f */
    public static final class C3557f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3557f f8212b = new C3557f();

        public C3557f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Attempting to unlock server config info.";
        }
    }

    /* renamed from: bo.app.a5$g */
    public static final class C3558g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3558g f8213b = new C3558g();

        public C3558g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unlocking config info lock.";
        }
    }

    /* renamed from: bo.app.a5$h */
    public static final class C3559h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3559h f8214b = new C3559h();

        public C3559h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Server config updated for Content Cards from disabled to enabled";
        }
    }

    /* renamed from: bo.app.a5$i */
    public static final class C3560i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3560i f8215b = new C3560i();

        public C3560i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not persist server config to shared preferences.";
        }
    }

    /* renamed from: bo.app.a5$j */
    public static final class C3561j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4299y4 f8216b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3561j(C4299y4 y4Var) {
            super(0);
            this.f8216b = y4Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8216b, "Finishing updating server config to ");
        }
    }

    public C3551a5(Context context, String str, C4035o2 o2Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "apiKey");
        C19383o.m32797g(o2Var, "serverConfigUpdateListener");
        this.f8203a = o2Var;
        this.f8204b = C3965m5.m9151a(context, C19383o.m32802l(str, "com.braze.storage.server_config."), (String) null, 2, (Object) null);
        m8415q();
    }

    /* renamed from: q */
    private final void m8415q() {
        C4299y4 y4Var = new C4299y4(0, (Set) null, (Set) null, (Set) null, 0, 0, 0, false, false, false, 0, false, false, 8191, (DefaultConstructorMarker) null);
        y4Var.mo14215a(mo13080b());
        y4Var.mo14220b(mo13082c());
        y4Var.mo14224c(mo13083d());
        y4Var.mo14214a(mo13084e());
        y4Var.mo14219b(mo13086g());
        y4Var.mo14223c(mo13088i());
        y4Var.mo14218b(mo13087h());
        y4Var.mo14213a(mo13085f());
        y4Var.mo14225c(mo13093n());
        y4Var.mo14227d(mo13094o());
        y4Var.mo14228e(mo13095p());
        y4Var.mo14216a(mo13091l());
        y4Var.mo14221b(mo13092m());
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            mo13079a(y4Var);
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13079a(C4299y4 y4Var) {
        this.f8207e = y4Var;
    }

    /* renamed from: b */
    public final Set<String> mo13080b() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Set<String> a = j == null ? null : j.mo14212a();
            if (a == null) {
                a = m8414a("blacklisted_attributes");
            }
            return a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final Set<String> mo13082c() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Set<String> b = j == null ? null : j.mo14217b();
            if (b == null) {
                b = m8414a("blacklisted_events");
            }
            return b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final Set<String> mo13083d() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Set<String> c = j == null ? null : j.mo14222c();
            if (c == null) {
                c = m8414a("blacklisted_purchases");
            }
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final long mo13084e() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Long valueOf = j == null ? null : Long.valueOf(j.mo14226d());
            return valueOf == null ? this.f8204b.getLong("config_time", 0) : valueOf.longValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public final int mo13085f() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Integer valueOf = j == null ? null : Integer.valueOf(j.mo14232h());
            return valueOf == null ? this.f8204b.getInt("geofences_max_num_to_register", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final long mo13086g() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Long valueOf = j == null ? null : Long.valueOf(j.mo14233i());
            return valueOf == null ? this.f8204b.getLong("messaging_session_timeout", -1) : valueOf.longValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final int mo13087h() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Integer valueOf = j == null ? null : Integer.valueOf(j.mo14234j());
            return valueOf == null ? this.f8204b.getInt("geofences_min_time_since_last_report", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    public final int mo13088i() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Integer valueOf = j == null ? null : Integer.valueOf(j.mo14235k());
            return valueOf == null ? this.f8204b.getInt("geofences_min_time_since_last_request", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public final C4299y4 mo13089j() {
        return this.f8207e;
    }

    /* renamed from: k */
    public final boolean mo13090k() {
        return mo13084e() <= 0;
    }

    /* renamed from: l */
    public final boolean mo13091l() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Boolean valueOf = j == null ? null : Boolean.valueOf(j.mo14237m());
            return valueOf == null ? this.f8204b.getBoolean("content_cards_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final boolean mo13092m() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Boolean valueOf = j == null ? null : Boolean.valueOf(j.mo14229e());
            return valueOf == null ? this.f8204b.getBoolean("ephemeral_events_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final boolean mo13093n() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Boolean valueOf = j == null ? null : Boolean.valueOf(j.mo14230f());
            return valueOf == null ? this.f8204b.getBoolean("geofences_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: o */
    public final boolean mo13094o() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Boolean valueOf = j == null ? null : Boolean.valueOf(j.mo14231g());
            return valueOf == null ? this.f8204b.getBoolean("geofences_enabled_set", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: p */
    public final boolean mo13095p() {
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            C4299y4 j = mo13089j();
            Boolean valueOf = j == null ? null : Boolean.valueOf(j.mo14236l());
            return valueOf == null ? this.f8204b.getBoolean("test_user_device_logging_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: r */
    public final void mo13096r() {
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, C3557f.f8212b, 6);
        if (this.f8206d.mo72640b()) {
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3558g.f8213b, 7);
            this.f8206d.mo72642d((Object) null);
        }
    }

    /* renamed from: a */
    public final Pair<Long, Boolean> mo13078a() {
        if (this.f8206d.mo72639a((Object) null)) {
            return new Pair<>(Long.valueOf(mo13084e()), Boolean.valueOf(mo13090k()));
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C3553b.f8208b, 6);
        return null;
    }

    /* renamed from: b */
    public final void mo13081b(C4299y4 y4Var) {
        C19383o.m32797g(y4Var, "serverConfig");
        boolean z = !mo13091l() && y4Var.mo14237m();
        ReentrantLock reentrantLock = this.f8205c;
        reentrantLock.lock();
        try {
            mo13079a(y4Var);
            C19394m mVar = C19394m.f43287a;
            if (z) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3559h.f8214b, 7);
                this.f8203a.mo13146a();
            }
            try {
                SharedPreferences.Editor edit = this.f8204b.edit();
                if (y4Var.mo14217b() != null) {
                    edit.putString("blacklisted_events", new JSONArray(y4Var.mo14217b()).toString());
                }
                if (y4Var.mo14212a() != null) {
                    edit.putString("blacklisted_attributes", new JSONArray(y4Var.mo14212a()).toString());
                }
                if (y4Var.mo14222c() != null) {
                    edit.putString("blacklisted_purchases", new JSONArray(y4Var.mo14222c()).toString());
                }
                edit.putLong("config_time", y4Var.mo14226d());
                edit.putInt("geofences_min_time_since_last_request", y4Var.mo14235k());
                edit.putInt("geofences_min_time_since_last_report", y4Var.mo14234j());
                edit.putInt("geofences_max_num_to_register", y4Var.mo14232h());
                edit.putBoolean("geofences_enabled", y4Var.mo14230f());
                edit.putBoolean("geofences_enabled_set", y4Var.mo14231g());
                edit.putLong("messaging_session_timeout", y4Var.mo14233i());
                edit.putBoolean("test_user_device_logging_enabled", y4Var.mo14236l());
                edit.putBoolean("content_cards_enabled", y4Var.mo14237m());
                edit.putBoolean("ephemeral_events_enabled", y4Var.mo14229e());
                edit.apply();
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3560i.f8215b, 4);
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3561j(y4Var), 6);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[Catch:{ Exception -> 0x005b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<java.lang.String> m8414a(java.lang.String r7) {
        /*
            r6 = this;
            android.content.SharedPreferences r0 = r6.f8204b     // Catch:{ Exception -> 0x005b }
            java.lang.String r1 = ""
            java.lang.String r7 = r0.getString(r7, r1)     // Catch:{ Exception -> 0x005b }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x005b }
            r0.<init>()     // Catch:{ Exception -> 0x005b }
            r1 = 0
            if (r7 == 0) goto L_0x0019
            boolean r2 = kotlin.text.C19457k.m33020X0(r7)     // Catch:{ Exception -> 0x005b }
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = r1
            goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            if (r2 != 0) goto L_0x006d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x005b }
            r2.<init>(r7)     // Catch:{ Exception -> 0x005b }
            int r7 = r2.length()     // Catch:{ Exception -> 0x005b }
            pq.i r7 = kotlin.jvm.internal.C19388s.m32816D0(r1, r7)     // Catch:{ Exception -> 0x005b }
            kotlin.collections.s r7 = kotlin.collections.C19327t.m32633O0(r7)     // Catch:{ Exception -> 0x005b }
            bo.app.a5$c r1 = new bo.app.a5$c     // Catch:{ Exception -> 0x005b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x005b }
            kotlin.sequences.e r7 = kotlin.sequences.SequencesKt___SequencesKt.m32984o1(r7, r1)     // Catch:{ Exception -> 0x005b }
            bo.app.a5$d r1 = new bo.app.a5$d     // Catch:{ Exception -> 0x005b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x005b }
            kotlin.sequences.n r7 = kotlin.sequences.SequencesKt___SequencesKt.m32985p1(r7, r1)     // Catch:{ Exception -> 0x005b }
            kotlin.sequences.g<T> r1 = r7.f43362a     // Catch:{ Exception -> 0x005b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x005b }
        L_0x0045:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x005b }
            if (r2 == 0) goto L_0x006d
            kq.l<T, R> r2 = r7.f43363b     // Catch:{ Exception -> 0x005b }
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x005b }
            java.lang.Object r2 = r2.invoke(r3)     // Catch:{ Exception -> 0x005b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x005b }
            r0.add(r2)     // Catch:{ Exception -> 0x005b }
            goto L_0x0045
        L_0x005b:
            r7 = move-exception
            r3 = r7
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.E
            bo.app.a5$e r4 = p030bo.app.C3551a5.C3556e.f8211b
            r5 = 4
            r1 = r6
            com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3551a5.m8414a(java.lang.String):java.util.Set");
    }
}
