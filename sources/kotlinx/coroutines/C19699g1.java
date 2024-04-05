package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.C19434j;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.g1 */
public interface C19699g1 extends CoroutineContext.C19335a {

    /* renamed from: d1 */
    public static final /* synthetic */ int f43634d1 = 0;

    /* renamed from: kotlinx.coroutines.g1$a */
    public static final class C19700a {
        /* renamed from: a */
        public static /* synthetic */ C19766p0 m33480a(C19699g1 g1Var, boolean z, C19746j1 j1Var, int i) {
            boolean z2 = false;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return g1Var.mo72396f0(z, z2, j1Var);
        }
    }

    /* renamed from: kotlinx.coroutines.g1$b */
    public static final class C19701b implements CoroutineContext.C19337b<C19699g1> {

        /* renamed from: b */
        public static final /* synthetic */ C19701b f43635b = new C19701b();
    }

    /* renamed from: a */
    void mo72134a(CancellationException cancellationException);

    /* renamed from: c0 */
    Object mo72394c0(C19340c<? super C19394m> cVar);

    /* renamed from: f */
    boolean mo72395f();

    /* renamed from: f0 */
    C19766p0 mo72396f0(boolean z, boolean z2, C19857l<? super Throwable, C19394m> lVar);

    /* renamed from: g */
    C19434j mo72397g();

    /* renamed from: h */
    CancellationException mo72398h();

    boolean isActive();

    boolean isCancelled();

    /* renamed from: j */
    C19762o mo72400j(C19749k1 k1Var);

    /* renamed from: k */
    C19766p0 mo72401k(C19857l<? super Throwable, C19394m> lVar);

    boolean start();
}
