package p759nq;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19410j;

/* renamed from: nq.a */
public final class C19919a<T> implements C19920b {

    /* renamed from: b */
    public T f43934b;

    /* renamed from: a */
    public final void mo72822a(Object obj, C19410j<?> jVar, T t) {
        C19383o.m32797g(jVar, "property");
        C19383o.m32797g(t, "value");
        this.f43934b = t;
    }

    public final T getValue(Object obj, C19410j<?> jVar) {
        C19383o.m32797g(jVar, "property");
        T t = this.f43934b;
        if (t != null) {
            return t;
        }
        StringBuilder h = C0072d.m201h("Property ");
        h.append(jVar.getName());
        h.append(" should be initialized before get.");
        throw new IllegalStateException(h.toString());
    }
}
