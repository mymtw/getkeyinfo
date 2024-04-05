package kotlinx.coroutines;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.k */
public interface C19747k<T> extends C19340c<T> {
    /* renamed from: D */
    boolean mo72495D(Throwable th);

    /* renamed from: J */
    C19736t mo72496J(Object obj, LockFreeLinkedListNode.C19712a aVar, C19857l lVar);

    /* renamed from: O */
    void mo72497O(C19857l<? super Throwable, C19394m> lVar);

    /* renamed from: f */
    boolean mo72498f();

    /* renamed from: i */
    C19736t mo72499i(Object obj, Object obj2);

    boolean isActive();

    /* renamed from: m */
    void mo72501m();

    /* renamed from: s */
    C19736t mo72502s(Throwable th);

    /* renamed from: v */
    void mo72503v(C19857l lVar, Object obj);

    /* renamed from: z */
    void mo72504z(CoroutineDispatcher coroutineDispatcher, C19394m mVar);
}
