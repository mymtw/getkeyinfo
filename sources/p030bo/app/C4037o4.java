package p030bo.app;

import androidx.compose.foundation.layout.C0761x;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.facebook.login.LoginFragment;
import kotlin.C19394m;
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

/* renamed from: bo.app.o4 */
public final class C4037o4 implements C3926l2 {

    /* renamed from: a */
    private final C3689g2 f9008a;

    /* renamed from: b */
    private final C3666f2 f9009b;

    /* renamed from: c */
    private final C3666f2 f9010c;

    /* renamed from: d */
    private final C3661f1 f9011d;

    /* renamed from: e */
    private final C3551a5 f9012e;

    /* renamed from: f */
    private final C3517a0 f9013f;

    /* renamed from: g */
    private final C4274x1 f9014g;

    /* renamed from: bo.app.o4$a */
    public static final class C4038a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4038a f9015b = new C4038a();

        public C4038a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    @C19060c(mo70540c = "com.braze.requests.RequestExecutor$execute$2", mo70541f = "RequestExecutor.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.o4$b */
    public static final class C4039b extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9016b;

        /* renamed from: c */
        public final /* synthetic */ C4037o4 f9017c;

        /* renamed from: d */
        public final /* synthetic */ C4296y1 f9018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4039b(C4037o4 o4Var, C4296y1 y1Var, C19340c<? super C4039b> cVar) {
            super(2, cVar);
            this.f9017c = o4Var;
            this.f9018d = y1Var;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C4039b) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C4039b(this.f9017c, this.f9018d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f9016b == 0) {
                C0761x.m1684O0(obj);
                this.f9017c.m9296a(this.f9018d);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.o4$c */
    public static final class C4040c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4040c f9019b = new C4040c();

        public C4040c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    public C4037o4(C3689g2 g2Var, C3666f2 f2Var, C3666f2 f2Var2, C3661f1 f1Var, C3551a5 a5Var, C3517a0 a0Var, C4274x1 x1Var) {
        C19383o.m32797g(g2Var, "httpConnector");
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(f2Var2, "externalEventPublisher");
        C19383o.m32797g(f1Var, "feedStorageProvider");
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        C19383o.m32797g(a0Var, "contentCardsStorageProvider");
        C19383o.m32797g(x1Var, "brazeManager");
        this.f9008a = g2Var;
        this.f9009b = f2Var;
        this.f9010c = f2Var2;
        this.f9011d = f1Var;
        this.f9012e = a5Var;
        this.f9013f = a0Var;
        this.f9014g = x1Var;
    }

    /* renamed from: b */
    public void mo13660b(C3854k2 k2Var) {
        C19383o.m32797g(k2Var, LoginFragment.EXTRA_REQUEST);
        C4296y1 y1Var = k2Var instanceof C4296y1 ? (C4296y1) k2Var : null;
        if (y1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4038a.f9015b, 6);
        } else {
            C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C4039b(this, y1Var, (C19340c<? super C4039b>) null), 3);
        }
    }

    /* renamed from: a */
    public void mo13659a(C3854k2 k2Var) {
        C19383o.m32797g(k2Var, LoginFragment.EXTRA_REQUEST);
        C4296y1 y1Var = k2Var instanceof C4296y1 ? (C4296y1) k2Var : null;
        if (y1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4040c.f9019b, 6);
        } else {
            m9296a(y1Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9296a(C4296y1 y1Var) {
        new C4152s(y1Var, this.f9008a, this.f9009b, this.f9010c, this.f9011d, this.f9014g, this.f9012e, this.f9013f).mo14037c();
    }
}
