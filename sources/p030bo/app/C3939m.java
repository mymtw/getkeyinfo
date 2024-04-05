package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import org.apache.commons.lang3.ClassUtils;
import p005a4.C0034a;
import p753kq.C19846a;

/* renamed from: bo.app.m */
public final class C3939m {

    /* renamed from: i */
    public static final C3940a f8851i = new C3940a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final SharedPreferences f8852a;

    /* renamed from: b */
    public final SharedPreferences f8853b;

    /* renamed from: c */
    public final Map<String, Long> f8854c;

    /* renamed from: d */
    private final AtomicBoolean f8855d = new AtomicBoolean(false);

    /* renamed from: e */
    public long f8856e;

    /* renamed from: f */
    public long f8857f;

    /* renamed from: g */
    public int f8858g;

    /* renamed from: h */
    public int f8859h;

    /* renamed from: bo.app.m$a */
    public static final class C3940a {
        private C3940a() {
        }

        public /* synthetic */ C3940a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.m$b */
    public static final class C3941b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8860b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3941b(int i) {
            super(0);
            this.f8860b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0073e.m208h(C0072d.m201h("Min time since last geofence request reset via server configuration: "), this.f8860b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: bo.app.m$c */
    public static final class C3942c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8861b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3942c(int i) {
            super(0);
            this.f8861b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0073e.m208h(C0072d.m201h("Min time since last geofence report reset via server configuration: "), this.f8861b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: bo.app.m$d */
    public static final class C3943d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3939m f8862b;

        /* renamed from: c */
        public final /* synthetic */ String f8863c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3943d(C3939m mVar, String str) {
            super(0);
            this.f8862b = mVar;
            this.f8863c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Retrieving geofence id ");
            C3939m mVar = this.f8862b;
            String str = this.f8863c;
            C19383o.m32796f(str, "reEligibilityId");
            h.append(mVar.mo13685a(str));
            h.append(" eligibility information from local storage.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$e */
    public static final class C3944e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8864b;

        /* renamed from: c */
        public final /* synthetic */ C3939m f8865c;

        /* renamed from: d */
        public final /* synthetic */ String f8866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3944e(long j, C3939m mVar, String str) {
            super(0);
            this.f8864b = j;
            this.f8865c = mVar;
            this.f8866d = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofence report suppressed since only ");
            h.append(this.f8864b);
            h.append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
            h.append(this.f8865c.f8859h);
            h.append("). id:");
            h.append(this.f8866d);
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$f */
    public static final class C3945f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8867b;

        /* renamed from: c */
        public final /* synthetic */ int f8868c;

        /* renamed from: d */
        public final /* synthetic */ String f8869d;

        /* renamed from: e */
        public final /* synthetic */ C3853k1 f8870e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3945f(long j, int i, String str, C3853k1 k1Var) {
            super(0);
            this.f8867b = j;
            this.f8868c = i;
            this.f8869d = str;
            this.f8870e = k1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofence report suppressed since only ");
            h.append(this.f8867b);
            h.append(" seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ");
            h.append(this.f8868c);
            h.append("). id:");
            h.append(this.f8869d);
            h.append(" transition:");
            h.append(this.f8870e);
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$g */
    public static final class C3946g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8871b;

        /* renamed from: c */
        public final /* synthetic */ int f8872c;

        /* renamed from: d */
        public final /* synthetic */ String f8873d;

        /* renamed from: e */
        public final /* synthetic */ C3853k1 f8874e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3946g(long j, int i, String str, C3853k1 k1Var) {
            super(0);
            this.f8871b = j;
            this.f8872c = i;
            this.f8873d = str;
            this.f8874e = k1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f8871b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f8872c + "). id:" + this.f8873d + " transition:" + this.f8874e;
        }
    }

    /* renamed from: bo.app.m$h */
    public static final class C3947h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8875b;

        /* renamed from: c */
        public final /* synthetic */ C3853k1 f8876c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3947h(String str, C3853k1 k1Var) {
            super(0);
            this.f8875b = str;
            this.f8876c = k1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofence report eligible since this geofence/transition combination has never been reported.id:");
            h.append(this.f8875b);
            h.append(" transition:");
            h.append(this.f8876c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$i */
    public static final class C3948i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8877b;

        /* renamed from: c */
        public final /* synthetic */ C3939m f8878c;

        /* renamed from: d */
        public final /* synthetic */ String f8879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3948i(long j, C3939m mVar, String str) {
            super(0);
            this.f8877b = j;
            this.f8878c = mVar;
            this.f8879d = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofence report eligible since ");
            h.append(this.f8877b);
            h.append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
            h.append(this.f8878c.f8859h);
            h.append("). id:");
            h.append(this.f8879d);
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$j */
    public static final class C3949j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8880b;

        /* renamed from: c */
        public final /* synthetic */ C3939m f8881c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3949j(long j, C3939m mVar) {
            super(0);
            this.f8880b = j;
            this.f8881c = mVar;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofence request suppressed since only ");
            h.append(this.f8880b);
            h.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
            return C0071c.m191c(h, this.f8881c.f8858g, ").");
        }
    }

    /* renamed from: bo.app.m$k */
    public static final class C3950k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8882b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3950k(long j) {
            super(0);
            this.f8882b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Long.valueOf(this.f8882b), "Ignoring rate limit for this geofence request. Elapsed time since last request:");
        }
    }

    /* renamed from: bo.app.m$l */
    public static final class C3951l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8883b;

        /* renamed from: c */
        public final /* synthetic */ C3939m f8884c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3951l(long j, C3939m mVar) {
            super(0);
            this.f8883b = j;
            this.f8884c = mVar;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8883b);
            sb.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
            return C0071c.m191c(sb, this.f8884c.f8858g, ").");
        }
    }

    /* renamed from: bo.app.m$m */
    public static final class C3952m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3952m f8885b = new C3952m();

        public C3952m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences have not been requested for the current session yet. Request is eligible.";
        }
    }

    /* renamed from: bo.app.m$n */
    public static final class C3953n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3953n f8886b = new C3953n();

        public C3953n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences have already been requested for the current session. Geofence request not eligible.";
        }
    }

    /* renamed from: bo.app.m$o */
    public static final class C3954o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8887b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3954o(String str) {
            super(0);
            this.f8887b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8887b, "Exception trying to parse re-eligibility id: ");
        }
    }

    /* renamed from: bo.app.m$p */
    public static final class C3955p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8888b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3955p(String str) {
            super(0);
            this.f8888b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Deleting outdated id ");
            h.append(this.f8888b);
            h.append(" from re-eligibility list.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$q */
    public static final class C3956q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8889b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3956q(String str) {
            super(0);
            this.f8889b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Retaining id ");
            h.append(this.f8889b);
            h.append(" in re-eligibility list.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.m$r */
    public static final class C3957r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8890b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3957r(long j) {
            super(0);
            this.f8890b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Long.valueOf(this.f8890b), "Updating the last successful location request time to: ");
        }
    }

    public C3939m(Context context, String str, C3551a5 a5Var, C3666f2 f2Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "apiKey");
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        C19383o.m32797g(f2Var, "internalIEventMessenger");
        f2Var.mo13287a(new C3629d7(this, 0), C3651e5.class);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(str, "com.appboy.managers.geofences.eligibility.global."), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f8852a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(C19383o.m32802l(str, "com.appboy.managers.geofences.eligibility.individual."), 0);
        C19383o.m32796f(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f8853b = sharedPreferences2;
        this.f8854c = mo13687a(sharedPreferences2);
        this.f8856e = sharedPreferences.getLong("last_request_global", 0);
        this.f8857f = sharedPreferences.getLong("last_report_global", 0);
        this.f8858g = a5Var.mo13088i();
        this.f8859h = a5Var.mo13087h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9117a(C3939m mVar, C3651e5 e5Var) {
        C19383o.m32797g(mVar, "this$0");
        mVar.f8855d.set(false);
    }

    /* renamed from: a */
    public final boolean mo13691a(long j, C0034a aVar, C3853k1 k1Var) {
        int i;
        long j2 = j;
        C0034a aVar2 = aVar;
        C3853k1 k1Var2 = k1Var;
        C19383o.m32797g(aVar2, "geofence");
        C19383o.m32797g(k1Var2, "transitionType");
        String str = aVar2.f78c;
        long j3 = j2 - this.f8857f;
        if (((long) this.f8859h) > j3) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3944e(j3, this, str), 7);
            return false;
        }
        String a = mo13686a(str, k1Var2);
        if (k1Var2 == C3853k1.ENTER) {
            i = aVar2.f82g;
        } else {
            i = aVar2.f83h;
        }
        int i2 = i;
        if (this.f8854c.containsKey(a)) {
            Long l = this.f8854c.get(a);
            if (l != null) {
                long longValue = j2 - l.longValue();
                if (((long) i2) > longValue) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3945f(longValue, i2, str, k1Var), 7);
                    return false;
                }
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3946g(longValue, i2, str, k1Var), 7);
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3947h(str, k1Var2), 7);
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3948i(j3, this, str), 7);
        this.f8854c.put(a, Long.valueOf(j));
        this.f8853b.edit().putLong(a, j2).apply();
        this.f8857f = j2;
        this.f8852a.edit().putLong("last_report_global", j2).apply();
        return true;
    }

    /* renamed from: a */
    public final void mo13690a(List<C0034a> list) {
        C19383o.m32797g(list, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0034a aVar : list) {
            linkedHashSet.add(aVar.f78c);
        }
        HashSet hashSet = new HashSet(this.f8854c.keySet());
        SharedPreferences.Editor edit = this.f8853b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C19383o.m32796f(str, "reEligibilityId");
            if (!linkedHashSet.contains(mo13685a(str))) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3955p(str), 7);
                this.f8854c.remove(str);
                edit.remove(str);
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3956q(str), 7);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo13692a(boolean z, long j) {
        long j2 = j - this.f8856e;
        if (z || ((long) this.f8858g) <= j2) {
            if (z) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3950k(j2), 7);
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3951l(j2, this), 7);
            }
            if (this.f8855d.compareAndSet(false, true)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3952m.f8885b, 7);
                return true;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3953n.f8886b, 7);
            return false;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3949j(j2, this), 7);
        return false;
    }

    /* renamed from: a */
    public final void mo13688a(long j) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3957r(j), 7);
        this.f8856e = j;
        this.f8852a.edit().putLong("last_request_global", this.f8856e).apply();
    }

    /* renamed from: a */
    public final String mo13685a(String str) {
        C19383o.m32797g(str, "reEligibilityId");
        try {
            return new Regex("_").split(str, 2).get(1);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C3954o(str), 4);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo13686a(String str, C3853k1 k1Var) {
        C19383o.m32797g(str, "geofenceId");
        C19383o.m32797g(k1Var, "transitionType");
        StringBuilder sb = new StringBuilder();
        String str2 = k1Var.toString();
        Locale locale = Locale.US;
        C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
        String lowerCase = str2.toLowerCase(locale);
        C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        sb.append('_');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo13689a(C4299y4 y4Var) {
        C19383o.m32797g(y4Var, "serverConfig");
        int k = y4Var.mo14235k();
        if (k >= 0) {
            this.f8858g = k;
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3941b(k), 6);
        }
        int j = y4Var.mo14234j();
        if (j >= 0) {
            this.f8859h = j;
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3942c(j), 6);
        }
    }

    /* renamed from: a */
    public final Map<String, Long> mo13687a(SharedPreferences sharedPreferences) {
        C19383o.m32797g(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            return concurrentHashMap;
        }
        Set<String> keySet = all.keySet();
        if (keySet.isEmpty()) {
            return concurrentHashMap;
        }
        for (String next : keySet) {
            long j = sharedPreferences.getLong(next, 0);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3943d(this, next), 7);
            C19383o.m32796f(next, "reEligibilityId");
            concurrentHashMap.put(next, Long.valueOf(j));
        }
        return concurrentHashMap;
    }
}
