package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.selects.C19803d;

/* renamed from: kotlinx.coroutines.channels.q */
public interface C19515q<E> {
    /* renamed from: a */
    void mo72134a(CancellationException cancellationException);

    boolean isEmpty();

    C19502f<E> iterator();

    /* renamed from: o */
    Object mo72138o(ContinuationImpl continuationImpl);

    /* renamed from: p */
    C19803d<E> mo72139p();

    /* renamed from: q */
    C19803d<C19503g<E>> mo72140q();

    /* renamed from: w */
    Object mo72144w();

    /* renamed from: y */
    Object mo72146y(C19340c<? super C19503g<? extends E>> cVar);
}
