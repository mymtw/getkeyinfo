package p030bo.app;

import android.support.p013v4.media.C0073e;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p753kq.C19846a;

/* renamed from: bo.app.x5 */
public class C4281x5 {

    /* renamed from: f */
    public static final C4282a f9437f = new C4282a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<String> f9438a = new ArrayList(32);

    /* renamed from: b */
    private long f9439b;

    /* renamed from: c */
    private final Object f9440c = new Object();

    /* renamed from: d */
    public C4274x1 f9441d;

    /* renamed from: e */
    private boolean f9442e;

    /* renamed from: bo.app.x5$a */
    public static final class C4282a {
        private C4282a() {
        }

        public /* synthetic */ C4282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo14186a(String str, String str2, Throwable th) {
            C19383o.m32797g(str, "tag");
            C19383o.m32797g(str2, "msg");
            String str3 = DateTimeUtils.m11301c(BrazeDateFormat.ANDROID_LOGCAT) + ' ' + str + ": " + str2;
            if (th != null) {
                StringBuilder k = C0073e.m211k(str3, ": ");
                k.append(th.getMessage());
                str3 = k.toString();
            }
            String substring = str3.substring(0, Math.min(str3.length(), 1000));
            C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    /* renamed from: bo.app.x5$b */
    public static final class C4283b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4283b f9443b = new C4283b();

        public C4283b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Test user device logging is enabled.";
        }
    }

    /* renamed from: a */
    public final void mo14178a(C4274x1 x1Var) {
        C19383o.m32797g(x1Var, "<set-?>");
        this.f9441d = x1Var;
    }

    /* renamed from: b */
    public final void mo14182b() {
        synchronized (this.f9440c) {
            if (this.f9441d != null) {
                mo14183c().mo13836a((List<String>) C19327t.m32661q1(mo14184d()), this.f9439b);
            }
            mo14184d().clear();
            this.f9439b = 0;
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: c */
    public final C4274x1 mo14183c() {
        C4274x1 x1Var = this.f9441d;
        if (x1Var != null) {
            return x1Var;
        }
        C19383o.m32805o("brazeManager");
        throw null;
    }

    /* renamed from: d */
    public final List<String> mo14184d() {
        return this.f9438a;
    }

    /* renamed from: e */
    public final boolean mo14185e() {
        return this.f9442e;
    }

    /* renamed from: a */
    public final void mo14181a(boolean z) {
        synchronized (this.f9440c) {
            if (!z) {
                mo14184d().clear();
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C4283b.f9443b, 2);
            }
            C19394m mVar = C19394m.f43287a;
        }
        this.f9442e = z;
    }

    /* renamed from: a */
    public void mo14180a(String str, String str2, Throwable th) {
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(str2, "msg");
        if (this.f9442e && !C19459m.m33036e1(str2, "device_logs", false) && !C19459m.m33036e1(str2, "test_user_data", false) && !m9807a()) {
            synchronized (this.f9440c) {
                if (mo14184d().size() >= 32) {
                    mo14182b();
                }
                if ((!C19457k.m33020X0(str)) && (!C19457k.m33020X0(str2))) {
                    if (this.f9439b == 0) {
                        this.f9439b = DateTimeUtils.m11302d();
                    }
                    mo14184d().add(f9437f.mo14186a(str, str2, th));
                }
                C19394m mVar = C19394m.f43287a;
            }
        }
    }

    /* renamed from: a */
    public final void mo14179a(C4299y4 y4Var) {
        C19383o.m32797g(y4Var, "serverConfig");
        mo14181a(y4Var.mo14236l());
    }

    /* renamed from: a */
    private final boolean m9807a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        C19383o.m32796f(stackTrace, "stack");
        if (stackTrace.length == 0) {
            return true;
        }
        StackTraceElement stackTraceElement = stackTrace[1];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement2 = stackTrace[i];
            i++;
            if (C19383o.m32792b(stackTraceElement2.getClassName(), className) && C19383o.m32792b(stackTraceElement2.getMethodName(), methodName)) {
                i2++;
            }
        }
        if (i2 != 1) {
            return true;
        }
        return false;
    }
}
