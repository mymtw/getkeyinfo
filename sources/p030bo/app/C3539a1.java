package p030bo.app;

import androidx.compose.foundation.layout.C0761x;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.a1 */
public final class C3539a1 implements C4232u1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4232u1 f8177a;

    /* renamed from: b */
    private final C3666f2 f8178b;

    /* renamed from: c */
    private boolean f8179c;

    /* renamed from: bo.app.a1$a */
    public static final class C3540a extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C3539a1 f8180b;

        /* renamed from: c */
        public final /* synthetic */ C4208t1 f8181c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3540a(C3539a1 a1Var, C4208t1 t1Var) {
            super(0);
            this.f8180b = a1Var;
            this.f8181c = t1Var;
        }

        /* renamed from: a */
        public final void mo13066a() {
            this.f8180b.f8177a.mo13063a(this.f8181c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo13066a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.a1$b */
    public static final class C3541b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3541b f8182b = new C3541b();

        public C3541b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    /* renamed from: bo.app.a1$c */
    public static final class C3542c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3542c f8183b = new C3542c();

        public C3542c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get all events from storage.";
        }
    }

    /* renamed from: bo.app.a1$d */
    public static final class C3543d extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C3539a1 f8184b;

        /* renamed from: c */
        public final /* synthetic */ Set<C4208t1> f8185c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3543d(C3539a1 a1Var, Set<? extends C4208t1> set) {
            super(0);
            this.f8184b = a1Var;
            this.f8185c = set;
        }

        /* renamed from: a */
        public final void mo13069a() {
            this.f8184b.f8177a.mo13064a((Set<? extends C4208t1>) this.f8185c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo13069a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.a1$e */
    public static final class C3544e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8186b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3544e(String str) {
            super(0);
            this.f8186b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8186b, "Storage provider is closed. Failed to ");
        }
    }

    @C19060c(mo70540c = "com.braze.storage.EventStorageDecorator$doCall$2", mo70541f = "EventStorageDecorator.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.a1$f */
    public static final class C3545f extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f8187b;

        /* renamed from: c */
        private /* synthetic */ Object f8188c;

        /* renamed from: d */
        public final /* synthetic */ C19846a<C19394m> f8189d;

        /* renamed from: e */
        public final /* synthetic */ C3539a1 f8190e;

        /* renamed from: f */
        public final /* synthetic */ String f8191f;

        /* renamed from: bo.app.a1$f$a */
        public static final class C3546a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f8192b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3546a(String str) {
                super(0);
                this.f8192b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f8192b, "Failed to ");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3545f(C19846a<C19394m> aVar, C3539a1 a1Var, String str, C19340c<? super C3545f> cVar) {
            super(2, cVar);
            this.f8189d = aVar;
            this.f8190e = a1Var;
            this.f8191f = str;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C3545f) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C3545f fVar = new C3545f(this.f8189d, this.f8190e, this.f8191f, cVar);
            fVar.f8188c = obj;
            return fVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8187b == 0) {
                C0761x.m1684O0(obj);
                C19525d0 d0Var = (C19525d0) this.f8188c;
                try {
                    this.f8189d.invoke();
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var, BrazeLogger.Priority.E, e, new C3546a(this.f8191f), 4);
                    this.f8190e.m8398a((Throwable) e);
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.a1$g */
    public static final class C3547g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3547g f8193b = new C3547g();

        public C3547g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log storage exception";
        }
    }

    public C3539a1(C4232u1 u1Var, C3666f2 f2Var) {
        C19383o.m32797g(u1Var, "storage");
        C19383o.m32797g(f2Var, "eventPublisher");
        this.f8177a = u1Var;
        this.f8178b = f2Var;
    }

    public void close() {
        this.f8179c = true;
    }

    /* renamed from: a */
    public Collection<C4208t1> mo13062a() {
        if (this.f8179c) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3541b.f8182b, 6);
            return EmptySet.INSTANCE;
        }
        try {
            return this.f8177a.mo13062a();
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3542c.f8183b, 4);
            m8398a((Throwable) e);
            return EmptySet.INSTANCE;
        }
    }

    /* renamed from: a */
    public void mo13063a(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        m8397a(C19383o.m32802l(t1Var, "add event "), (C19846a<C19394m>) new C3540a(this, t1Var));
    }

    /* renamed from: a */
    public void mo13064a(Set<? extends C4208t1> set) {
        C19383o.m32797g(set, "events");
        m8397a(C19383o.m32802l(set, "delete events "), (C19846a<C19394m>) new C3543d(this, set));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8398a(Throwable th) {
        try {
            this.f8178b.mo13286a(new C4007n5("A storage exception has occurred!", th), C4007n5.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3547g.f8193b, 4);
        }
    }

    /* renamed from: a */
    private final void m8397a(String str, C19846a<C19394m> aVar) {
        if (this.f8179c) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3544e(str), 6);
            return;
        }
        C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C3545f(aVar, this, str, (C19340c<? super C3545f>) null), 3);
    }
}
