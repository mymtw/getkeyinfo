package kotlinx.coroutines.reactive;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19753l;
import p514bk.C14088a;
import p762or.C20023b;

/* renamed from: kotlinx.coroutines.reactive.a */
public final class C19775a {
    /* renamed from: a */
    public static final void m33727a(CoroutineContext coroutineContext, String str) {
        C14088a.m21785m(new IllegalStateException('\'' + str + "' was called after the publisher already signalled being in a terminal state"), coroutineContext);
    }

    /* renamed from: b */
    public static Object m33728b(Mode mode, ContinuationImpl continuationImpl) {
        C19753l lVar = new C19753l(1, C19388s.m32873m0(continuationImpl));
        lVar.mo72548n();
        C19776b[] bVarArr = C19779e.f43739a;
        int length = bVarArr.length;
        int i = 0;
        C20023b bVar = null;
        while (i < length) {
            C19776b bVar2 = bVarArr[i];
            i++;
            bVar = bVar2.mo72579a();
        }
        bVar.subscribe(new AwaitKt$awaitOne$2$1(lVar, mode, (Object) null));
        Object l = lVar.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }
}
