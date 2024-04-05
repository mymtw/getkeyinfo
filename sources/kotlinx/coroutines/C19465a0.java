package kotlinx.coroutines;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0761x;
import java.lang.Thread;
import java.util.List;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.C19435k;
import kotlin.sequences.SequencesKt___SequencesKt;
import p568fn.C17782b;

/* renamed from: kotlinx.coroutines.a0 */
public final class C19465a0 {

    /* renamed from: a */
    public static final List<C19842z> f43395a = C17782b.m29867g0(SequencesKt___SequencesKt.m32989t1(C19435k.m33000j1(C0073e.m212l())));

    /* renamed from: a */
    public static final void m33079a(Throwable th, CoroutineContext coroutineContext) {
        Throwable th2;
        for (C19842z handleException : f43395a) {
            try {
                handleException.handleException(coroutineContext, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C17782b.m29886t(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C17782b.m29886t(th, new DiagnosticCoroutineContextException(coroutineContext));
            Result.m35480constructorimpl(C19394m.f43287a);
        } catch (Throwable th4) {
            Result.m35480constructorimpl(C0761x.m1673J(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
