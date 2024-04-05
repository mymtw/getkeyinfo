package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.internal.ThreadContextKt;
import p568fn.C17782b;
import p753kq.C19861p;

public final class UndispatchedContextCollector<T> implements C19600e<T> {

    /* renamed from: b */
    public final CoroutineContext f43584b;

    /* renamed from: c */
    public final Object f43585c;

    /* renamed from: d */
    public final C19861p<T, C19340c<? super C19394m>, Object> f43586d;

    public UndispatchedContextCollector(C19600e<? super T> eVar, CoroutineContext coroutineContext) {
        this.f43584b = coroutineContext;
        this.f43585c = ThreadContextKt.m33529b(coroutineContext);
        this.f43586d = new UndispatchedContextCollector$emitRef$1(eVar, (C19340c<? super UndispatchedContextCollector$emitRef$1>) null);
    }

    public final Object emit(T t, C19340c<? super C19394m> cVar) {
        Object t0 = C17782b.m29887t0(this.f43584b, t, this.f43585c, this.f43586d, cVar);
        return t0 == CoroutineSingletons.COROUTINE_SUSPENDED ? t0 : C19394m.f43287a;
    }
}
