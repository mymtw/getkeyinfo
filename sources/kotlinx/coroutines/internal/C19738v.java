package kotlinx.coroutines.internal;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19841y1;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.internal.v */
public final class C19738v<T> implements C19841y1<T> {

    /* renamed from: b */
    public final T f43689b;

    /* renamed from: c */
    public final ThreadLocal<T> f43690c;

    /* renamed from: d */
    public final C19739w f43691d;

    public C19738v(Integer num, ThreadLocal threadLocal) {
        this.f43689b = num;
        this.f43690c = threadLocal;
        this.f43691d = new C19739w(threadLocal);
    }

    /* renamed from: G */
    public final void mo72118G(Object obj) {
        this.f43690c.set(obj);
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        if (C19383o.m32792b(this.f43691d, bVar)) {
            return this;
        }
        return null;
    }

    public final CoroutineContext.C19337b<?> getKey() {
        return this.f43691d;
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        return C19383o.m32792b(this.f43691d, bVar) ? EmptyCoroutineContext.INSTANCE : this;
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ThreadLocal(value=");
        h.append(this.f43689b);
        h.append(", threadLocal = ");
        h.append(this.f43690c);
        h.append(')');
        return h.toString();
    }

    /* renamed from: x0 */
    public final T mo72122x0(CoroutineContext coroutineContext) {
        T t = this.f43690c.get();
        this.f43690c.set(this.f43689b);
        return t;
    }
}
