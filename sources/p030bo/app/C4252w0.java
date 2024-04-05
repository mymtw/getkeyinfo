package p030bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.w0 */
public final class C4252w0 implements C4074p2 {

    /* renamed from: a */
    private final C4074p2 f9399a;

    /* renamed from: b */
    private final C3666f2 f9400b;

    /* renamed from: bo.app.w0$a */
    public static final class C4253a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4253a f9401b = new C4253a();

        public C4253a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to delete the sealed session from the storage.";
        }
    }

    /* renamed from: bo.app.w0$b */
    public static final class C4254b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4254b f9402b = new C4254b();

        public C4254b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error occured while publishing exception.";
        }
    }

    /* renamed from: bo.app.w0$c */
    public static final class C4255c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4255c f9403b = new C4255c();

        public C4255c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get the active session from the storage.";
        }
    }

    /* renamed from: bo.app.w0$d */
    public static final class C4256d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4256d f9404b = new C4256d();

        public C4256d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to upsert active session in the storage.";
        }
    }

    public C4252w0(C4074p2 p2Var, C3666f2 f2Var) {
        C19383o.m32797g(p2Var, "sessionStorageManager");
        C19383o.m32797g(f2Var, "eventPublisher");
        this.f9399a = p2Var;
        this.f9400b = f2Var;
    }

    /* renamed from: a */
    public C3624d5 mo13672a() {
        try {
            return this.f9399a.mo13672a();
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4255c.f9403b, 4);
            mo14140a(this.f9400b, e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo13673a(C3624d5 d5Var) {
        C19383o.m32797g(d5Var, "session");
        try {
            this.f9399a.mo13673a(d5Var);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4256d.f9404b, 4);
            mo14140a(this.f9400b, e);
        }
    }

    /* renamed from: a */
    public void mo13674a(String str) {
        C19383o.m32797g(str, "sessionId");
        try {
            this.f9399a.mo13674a(str);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4253a.f9401b, 4);
            mo14140a(this.f9400b, e);
        }
    }

    /* renamed from: a */
    public final void mo14140a(C3666f2 f2Var, Throwable th) {
        C19383o.m32797g(f2Var, "eventPublisher");
        C19383o.m32797g(th, "throwable");
        try {
            f2Var.mo13286a(new C4007n5("A storage exception has occurred. Please view the stack trace for more details.", th), C4007n5.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4254b.f9402b, 4);
        }
    }
}
