package p030bo.app;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.b1 */
public final class C3575b1 {

    /* renamed from: a */
    private final C4232u1 f8237a;

    /* renamed from: b */
    private boolean f8238b;

    /* renamed from: bo.app.b1$a */
    public static final class C3576a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f8239b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3576a(C4208t1 t1Var) {
            super(0);
            this.f8239b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8239b, "Storage manager is closed. Not adding event: ");
        }
    }

    /* renamed from: bo.app.b1$b */
    public static final class C3577b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Set<C4208t1> f8240b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3577b(Set<? extends C4208t1> set) {
            super(0);
            this.f8240b = set;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8240b, "Storage manager is closed. Not deleting events: ");
        }
    }

    /* renamed from: bo.app.b1$c */
    public static final class C3578c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3578c f8241b = new C3578c();

        public C3578c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storage manager is closed. Not starting offline recovery.";
        }
    }

    /* renamed from: bo.app.b1$d */
    public static final class C3579d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3579d f8242b = new C3579d();

        public C3579d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Started offline event recovery task.";
        }
    }

    /* renamed from: bo.app.b1$e */
    public static final class C3580e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f8243b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3580e(C4208t1 t1Var) {
            super(0);
            this.f8243b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8243b, "Adding event to dispatch from storage: ");
        }
    }

    public C3575b1(C4232u1 u1Var) {
        C19383o.m32797g(u1Var, "brazeEventStorageProvider");
        this.f8237a = u1Var;
    }

    /* renamed from: a */
    public final void mo13126a(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        if (this.f8238b) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3576a(t1Var), 6);
            return;
        }
        this.f8237a.mo13063a(t1Var);
    }

    /* renamed from: a */
    public final void mo13127a(Set<? extends C4208t1> set) {
        C19383o.m32797g(set, "events");
        if (this.f8238b) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3577b(set), 6);
            return;
        }
        this.f8237a.mo13064a(set);
    }

    /* renamed from: a */
    public final void mo13124a() {
        this.f8238b = true;
        this.f8237a.close();
    }

    /* renamed from: a */
    public final void mo13125a(C3620d2 d2Var) {
        C19383o.m32797g(d2Var, "dispatchManager");
        if (this.f8238b) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3578c.f8241b, 6);
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3579d.f8242b, 7);
        Iterator it = C19327t.m32636R0(this.f8237a.mo13062a()).iterator();
        while (it.hasNext()) {
            C4208t1 t1Var = (C4208t1) it.next();
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3580e(t1Var), 6);
            d2Var.mo13196a(t1Var);
        }
    }
}
