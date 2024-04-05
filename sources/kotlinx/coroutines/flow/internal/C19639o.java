package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.C19519u;
import kotlinx.coroutines.flow.C19600e;

/* renamed from: kotlinx.coroutines.flow.internal.o */
public final class C19639o<T> implements C19600e<T> {

    /* renamed from: b */
    public final C19519u<T> f43601b;

    public C19639o(C19519u<? super T> uVar) {
        this.f43601b = uVar;
    }

    public final Object emit(T t, C19340c<? super C19394m> cVar) {
        Object E = this.f43601b.mo72188E(t, cVar);
        return E == CoroutineSingletons.COROUTINE_SUSPENDED ? E : C19394m.f43287a;
    }
}
