package p030bo.app;

import androidx.compose.p015ui.text.input.C1993m;
import com.braze.support.BrazeLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.C19338a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19837x0;
import kotlinx.coroutines.C19842z;
import kotlinx.coroutines.CoroutineDispatcher;
import p001a0.C0005b;
import p753kq.C19846a;

/* renamed from: bo.app.h3 */
public final class C3730h3 implements C19525d0 {

    /* renamed from: a */
    public static final C3730h3 f8514a = new C3730h3();

    /* renamed from: b */
    private static C4311z0 f8515b;

    /* renamed from: c */
    private static final C19842z f8516c;

    /* renamed from: d */
    private static final CoroutineDispatcher f8517d;

    /* renamed from: e */
    private static final CoroutineContext f8518e;

    /* renamed from: bo.app.h3$a */
    public static final class C3731a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3731a f8519b = new C3731a();

        public C3731a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cancelling children of LimitedParallelismCoroutineScope";
        }
    }

    /* renamed from: bo.app.h3$b */
    public static final class C3732b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Throwable f8520b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3732b(Throwable th) {
            super(0);
            this.f8520b = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8520b, "Child job of LimitedParallelismCoroutineScope got exception: ");
        }
    }

    /* renamed from: bo.app.h3$c */
    public static final class C3733c extends C19338a implements C19842z {
        public C3733c(C19842z.C19843a aVar) {
            super(aVar);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.f11932a;
                C3730h3 h3Var = C3730h3.f8514a;
                BrazeLogger.m11282d(brazeLogger, h3Var, BrazeLogger.Priority.E, th, new C3732b(th), 4);
                C4311z0 b = h3Var.mo13382b();
                if (b != null) {
                    b.mo13286a(th, Throwable.class);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        C3733c cVar = new C3733c(C19842z.C19843a.f43850b);
        f8516c = cVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C19383o.m32796f(newSingleThreadExecutor, "newSingleThreadExecutor()");
        CoroutineDispatcher D0 = new C19837x0(newSingleThreadExecutor).mo72076D0(1);
        f8517d = D0;
        f8518e = D0.plus(cVar).plus(C0005b.m44j());
    }

    private C3730h3() {
    }

    /* renamed from: a */
    public final void mo13381a(C4311z0 z0Var) {
        f8515b = z0Var;
    }

    /* renamed from: b */
    public final C4311z0 mo13382b() {
        return f8515b;
    }

    public CoroutineContext getCoroutineContext() {
        return f8518e;
    }

    /* renamed from: a */
    public final void mo13380a() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C3731a.f8519b, 6);
        C1993m.m4374t(getCoroutineContext());
    }
}
