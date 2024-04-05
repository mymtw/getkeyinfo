package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0015b;
import p003a2.C0023f;
import p753kq.C19846a;

/* renamed from: bo.app.k6 */
public final class C3866k6 implements C4258w2 {

    /* renamed from: c */
    public static final C3867a f8749c = new C3867a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f8750a;

    /* renamed from: b */
    private final Map<String, Long> f8751b = m8994a();

    /* renamed from: bo.app.k6$a */
    public static final class C3867a {
        private C3867a() {
        }

        public /* synthetic */ C3867a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.k6$b */
    public static final class C3868b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8752b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3868b(C4275x2 x2Var) {
            super(0);
            this.f8752b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Triggered action id ");
            h.append(this.f8752b.getId());
            h.append(" always eligible via configuration. Returning true for eligibility status");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k6$c */
    public static final class C3869c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8753b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3869c(C4275x2 x2Var) {
            super(0);
            this.f8753b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Triggered action id ");
            h.append(this.f8753b.getId());
            h.append(" always eligible via never having been triggered. Returning true for eligibility status");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k6$d */
    public static final class C3870d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8754b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3870d(C4275x2 x2Var) {
            super(0);
            this.f8754b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Triggered action id ");
            h.append(this.f8754b.getId());
            h.append(" no longer eligible due to having been triggered in the past and is only eligible once.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k6$e */
    public static final class C3871e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8755b;

        /* renamed from: c */
        public final /* synthetic */ C3831j2 f8756c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3871e(long j, C3831j2 j2Var) {
            super(0);
            this.f8755b = j;
            this.f8756c = j2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Trigger action is re-eligible for display since ");
            h.append(DateTimeUtils.m11302d() - this.f8755b);
            h.append(" seconds have passed since the last time it was triggered (minimum interval: ");
            h.append(this.f8756c.mo13543q());
            h.append(").");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k6$f */
    public static final class C3872f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8757b;

        /* renamed from: c */
        public final /* synthetic */ C3831j2 f8758c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3872f(long j, C3831j2 j2Var) {
            super(0);
            this.f8757b = j;
            this.f8758c = j2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Trigger action is not re-eligible for display since only ");
            h.append(DateTimeUtils.m11302d() - this.f8757b);
            h.append(" seconds have passed since the last time it was triggered (minimum interval: ");
            h.append(this.f8758c.mo13543q());
            h.append(").");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k6$g */
    public static final class C3873g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8759b;

        /* renamed from: c */
        public final /* synthetic */ long f8760c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3873g(C4275x2 x2Var, long j) {
            super(0);
            this.f8759b = x2Var;
            this.f8760c = j;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Updating re-eligibility for action Id ");
            h.append(this.f8759b.getId());
            h.append(" to time ");
            return C0015b.m91j(h, this.f8760c, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: bo.app.k6$h */
    public static final class C3874h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8761b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3874h(String str) {
            super(0);
            this.f8761b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Deleting outdated triggered action id "), this.f8761b, " from stored re-eligibility list. In-memory re-eligibility list is unchanged.");
        }
    }

    /* renamed from: bo.app.k6$i */
    public static final class C3875i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8762b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3875i(String str) {
            super(0);
            this.f8762b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Retaining triggered action "), this.f8762b, " in re-eligibility list.");
        }
    }

    /* renamed from: bo.app.k6$j */
    public static final class C3876j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8763b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3876j(String str) {
            super(0);
            this.f8763b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Retrieving triggered action id ");
            h.append(this.f8763b);
            h.append(" eligibility information from local storage.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k6$k */
    public static final class C3877k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3877k f8764b = new C3877k();

        public C3877k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored re-eligibility information.";
        }
    }

    public C3866k6(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.appboy.storage.triggers.re_eligibility"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f8750a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo13581a(C4275x2 x2Var, long j) {
        C19383o.m32797g(x2Var, "triggeredAction");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3873g(x2Var, j), 7);
        this.f8751b.put(x2Var.getId(), Long.valueOf(j));
        this.f8750a.edit().putLong(x2Var.getId(), j).apply();
    }

    /* renamed from: b */
    public boolean mo13582b(C4275x2 x2Var) {
        C19383o.m32797g(x2Var, "triggeredAction");
        C3831j2 t = x2Var.mo13680f().mo13778t();
        if (t.mo13542o()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3868b(x2Var), 7);
            return true;
        } else if (!this.f8751b.containsKey(x2Var.getId())) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3869c(x2Var), 7);
            return true;
        } else if (t.mo13544s()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3870d(x2Var), 7);
            return false;
        } else {
            Long l = this.f8751b.get(x2Var.getId());
            long longValue = l == null ? 0 : l.longValue();
            long d = DateTimeUtils.m11302d() + ((long) x2Var.mo13680f().mo13775g());
            Integer q = t.mo13543q();
            if (d >= ((long) (q == null ? 0 : q.intValue())) + longValue) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3871e(longValue, t), 7);
                return true;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3872f(longValue, t), 7);
            return false;
        }
    }

    /* renamed from: a */
    private final Map<String, Long> m8994a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String next : this.f8750a.getAll().keySet()) {
                long j = this.f8750a.getLong(next, 0);
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3876j(next), 7);
                C19383o.m32796f(next, "actionId");
                concurrentHashMap.put(next, Long.valueOf(j));
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3877k.f8764b, 4);
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    public void mo13390a(List<? extends C4275x2> list) {
        C19383o.m32797g(list, "triggeredActions");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (C4275x2 id : list) {
            arrayList.add(id.getId());
        }
        SharedPreferences.Editor edit = this.f8750a.edit();
        for (T t : C19327t.m32664t1(this.f8751b.keySet())) {
            if (!arrayList.contains(t)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3874h(t), 7);
                edit.remove(t);
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3875i(t), 7);
            }
        }
        edit.apply();
    }
}
