package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import p744gq.C19059b;
import p768rq.C20153b;

public final class CoroutineContextKt {
    /* renamed from: a */
    public static final CoroutineContext m33060a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean b = m33061b(coroutineContext);
        boolean b2 = m33061b(coroutineContext2);
        if (!b && !b2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, z));
        if (b2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.INSTANCE);
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    /* renamed from: b */
    public static final boolean m33061b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.INSTANCE)).booleanValue();
    }

    /* renamed from: c */
    public static final CoroutineContext m33062c(C19525d0 d0Var, CoroutineContext coroutineContext) {
        CoroutineContext a = m33060a(d0Var.getCoroutineContext(), coroutineContext, true);
        C20153b bVar = C19760n0.f43719a;
        return (a == bVar || a.get(C19341d.C19342a.f43195b) != null) ? a : a.plus(bVar);
    }

    /* renamed from: d */
    public static final C19527d2<?> m33063d(C19340c<?> cVar, CoroutineContext coroutineContext, Object obj) {
        C19527d2<?> d2Var = null;
        if (!(cVar instanceof C19059b)) {
            return null;
        }
        if (!(coroutineContext.get(C19545e2.f43500b) != null)) {
            return null;
        }
        C19059b bVar = (C19059b) cVar;
        while (true) {
            if (!(bVar instanceof C19748k0) && (bVar = bVar.getCallerFrame()) != null) {
                if (bVar instanceof C19527d2) {
                    d2Var = (C19527d2) bVar;
                    break;
                }
            } else {
                break;
            }
        }
        if (d2Var != null) {
            d2Var.f43459e.set(new Pair(coroutineContext, obj));
        }
        return d2Var;
    }
}
