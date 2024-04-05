package p030bo.app;

import com.braze.support.BrazeLogger;
import com.facebook.login.LoginFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.s0 */
public final class C4170s0 implements C3926l2 {

    /* renamed from: a */
    private final C3666f2 f9268a;

    /* renamed from: b */
    private boolean f9269b;

    /* renamed from: c */
    private final List<C4296y1> f9270c = new ArrayList();

    /* renamed from: bo.app.s0$a */
    public static final class C4171a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4171a f9271b = new C4171a();

        public C4171a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Short circuiting execution of network request and immediately marking it as succeeded.";
        }
    }

    public C4170s0(C3666f2 f2Var, boolean z) {
        C19383o.m32797g(f2Var, "internalEventPublisher");
        this.f9268a = f2Var;
        this.f9269b = z;
    }

    /* renamed from: c */
    private final void m9576c(C3854k2 k2Var) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4171a.f9271b, 3);
        C3666f2 f2Var = this.f9268a;
        k2Var.mo13115a(f2Var, f2Var, (C3608d) null);
        k2Var.mo13569b(this.f9268a);
        if (k2Var instanceof C4296y1) {
            this.f9268a.mo13286a(new C4134r0((C4296y1) k2Var), C4134r0.class);
        }
    }

    /* renamed from: a */
    public void mo13659a(C3854k2 k2Var) {
        C19383o.m32797g(k2Var, LoginFragment.EXTRA_REQUEST);
        m9576c(k2Var);
    }

    /* renamed from: b */
    public void mo13660b(C3854k2 k2Var) {
        C19383o.m32797g(k2Var, LoginFragment.EXTRA_REQUEST);
        m9576c(k2Var);
    }
}
