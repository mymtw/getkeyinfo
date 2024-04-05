package p768rq;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C19834w0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C19723h;
import kotlinx.coroutines.internal.C19737u;

/* renamed from: rq.a */
public final class C20152a extends C19834w0 implements Executor {

    /* renamed from: c */
    public static final C20152a f44633c = new C20152a();

    /* renamed from: d */
    public static final C19723h f44634d;

    static {
        C20162k kVar = C20162k.f44649c;
        int i = C19737u.f43688a;
        if (64 >= i) {
            i = 64;
        }
        f44634d = (C19723h) kVar.mo72076D0(C0761x.m1682N0("kotlinx.coroutines.io.parallelism", i, 0, 0, 12));
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        f44634d.mo7108A0(coroutineContext, runnable);
    }

    /* renamed from: B0 */
    public final void mo72075B0(CoroutineContext coroutineContext, Runnable runnable) {
        f44634d.mo72075B0(coroutineContext, runnable);
    }

    /* renamed from: D0 */
    public final CoroutineDispatcher mo72076D0(int i) {
        throw null;
    }

    /* renamed from: E0 */
    public final Executor mo72680E0() {
        return this;
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        mo7108A0(EmptyCoroutineContext.INSTANCE, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
