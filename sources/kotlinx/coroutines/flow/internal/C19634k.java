package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19597d;

/* renamed from: kotlinx.coroutines.flow.internal.k */
public interface C19634k<T> extends C19597d<T> {

    /* renamed from: kotlinx.coroutines.flow.internal.k$a */
    public static final class C19635a {
        /* renamed from: a */
        public static /* synthetic */ C19597d m33421a(C19634k kVar, CoroutineDispatcher coroutineDispatcher, int i, BufferOverflow bufferOverflow, int i2) {
            CoroutineContext coroutineContext = coroutineDispatcher;
            if ((i2 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return kVar.mo72332b(coroutineContext, i, bufferOverflow);
        }
    }

    /* renamed from: b */
    C19597d<T> mo72332b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);
}
