package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.x0 */
public final class C4270x0 {

    /* renamed from: b */
    public static final C4271a f9421b = new C4271a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final long f9422c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    private final SharedPreferences f9423a;

    /* renamed from: bo.app.x0$a */
    public static final class C4271a {
        private C4271a() {
        }

        public /* synthetic */ C4271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo14159a(C4208t1 t1Var) {
            C19383o.m32797g(t1Var, "event");
            String a = C3734h4.f8521j.mo13386a(t1Var);
            return t1Var.mo13451j() + a;
        }
    }

    /* renamed from: bo.app.x0$b */
    public static final class C4272b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Map.Entry<String, ? extends Object> f9424b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4272b(Map.Entry<String, ? extends Object> entry) {
            super(0);
            this.f9424b = entry;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9424b, "Failed to get expiration time. Deleting entry: ");
        }
    }

    /* renamed from: bo.app.x0$c */
    public static final class C4273c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9425b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4273c(C4208t1 t1Var) {
            super(0);
            this.f9425b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9425b, "Event already seen in cache. Ignoring duplicate: ");
        }
    }

    public C4270x0(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.appboy.storage.event_data_validator"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f9423a = sharedPreferences;
        mo14156a();
    }

    /* renamed from: b */
    private final boolean m9756b(String str) {
        return this.f9423a.contains(str);
    }

    /* renamed from: a */
    public boolean mo14158a(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        if (t1Var.mo13451j() != C3600c1.PUSH_CLICKED) {
            return true;
        }
        mo14156a();
        String a = f9421b.mo14159a(t1Var);
        if (m9756b(a)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4273c(t1Var), 7);
            return false;
        }
        TimeZone timeZone = DateTimeUtils.f11946a;
        mo14157a(System.currentTimeMillis() + f9422c, a);
        return true;
    }

    /* renamed from: a */
    private final void m9755a(String str) {
        this.f9423a.edit().remove(str).apply();
    }

    /* renamed from: a */
    public final void mo14157a(long j, String str) {
        C19383o.m32797g(str, "eventKey");
        this.f9423a.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final void mo14156a() {
        TimeZone timeZone = DateTimeUtils.f11946a;
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry next : this.f9423a.getAll().entrySet()) {
            try {
                Object value = next.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                } else if (currentTimeMillis >= ((Long) value).longValue()) {
                    Object key = next.getKey();
                    C19383o.m32796f(key, "entry.key");
                    m9755a((String) key);
                }
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C4272b(next), 4);
                Object key2 = next.getKey();
                C19383o.m32796f(key2, "entry.key");
                m9755a((String) key2);
            }
        }
    }
}
