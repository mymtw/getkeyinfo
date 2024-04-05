package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;

/* renamed from: kotlinx.coroutines.flow.internal.f */
public final class C19629f<T> extends C19628e<T, T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19629f(C19633j jVar, CoroutineDispatcher coroutineDispatcher, int i, BufferOverflow bufferOverflow, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineDispatcher, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow, jVar);
    }

    /* renamed from: g */
    public final C19626c<T> mo72261g(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new C19629f(i, coroutineContext, bufferOverflow, this.f43594e);
    }

    /* renamed from: h */
    public final C19597d<T> mo72341h() {
        return this.f43594e;
    }

    /* renamed from: j */
    public final Object mo72351j(C19600e<? super T> eVar, C19340c<? super C19394m> cVar) {
        Object collect = this.f43594e.collect(eVar, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }

    public C19629f(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, C19597d dVar) {
        super(i, coroutineContext, bufferOverflow, dVar);
    }
}
