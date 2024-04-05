package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p514bk.C14088a;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.w */
public final class C19522w<E> extends C19521v<E> {

    /* renamed from: g */
    public final C19857l<E, C19394m> f43457g;

    public C19522w(Object obj, C19753l lVar, C19857l lVar2) {
        super(obj, lVar);
        this.f43457g = lVar2;
    }

    /* renamed from: A */
    public final boolean mo72219A() {
        if (!super.mo72219A()) {
            return false;
        }
        mo72218K();
        return true;
    }

    /* renamed from: K */
    public final void mo72218K() {
        C19857l<E, C19394m> lVar = this.f43457g;
        E e = this.f43455e;
        CoroutineContext context = this.f43456f.getContext();
        UndeliveredElementException b = OnUndeliveredElementKt.m33527b(lVar, e, (UndeliveredElementException) null);
        if (b != null) {
            C14088a.m21785m(b, context);
        }
    }
}
