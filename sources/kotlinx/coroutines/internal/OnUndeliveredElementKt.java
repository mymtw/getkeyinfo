package kotlinx.coroutines.internal;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19857l;

public final class OnUndeliveredElementKt {
    /* renamed from: a */
    public static final <E> C19857l<Throwable, C19394m> m33526a(C19857l<? super E, C19394m> lVar, E e, CoroutineContext coroutineContext) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> UndeliveredElementException m33527b(C19857l<? super E, C19394m> lVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(C19383o.m32802l(e, "Exception in undelivered element handler for "), th);
            }
            C17782b.m29886t(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }
}
