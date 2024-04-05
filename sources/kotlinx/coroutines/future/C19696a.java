package kotlinx.coroutines.future;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.CompletionException;
import java.util.function.BiConsumer;
import kotlin.Result;
import kotlin.coroutines.C19340c;

/* renamed from: kotlinx.coroutines.future.a */
public final class C19696a<T> implements BiConsumer<T, Throwable> {
    public volatile C19340c<? super T> cont;

    public final void accept(Object obj, Object obj2) {
        Throwable cause;
        Throwable th = (Throwable) obj2;
        C19340c<? super T> cVar = this.cont;
        if (cVar != null) {
            if (th == null) {
                cVar.resumeWith(Result.m35480constructorimpl(obj));
                return;
            }
            CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
            if (!(completionException == null || (cause = completionException.getCause()) == null)) {
                th = cause;
            }
            cVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
        }
    }
}
