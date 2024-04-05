package kotlinx.coroutines;

import kotlin.coroutines.C19338a;
import kotlin.coroutines.C19339b;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19722g;
import kotlinx.coroutines.internal.C19723h;

public abstract class CoroutineDispatcher extends C19338a implements C19341d {

    /* renamed from: b */
    public static final Key f43392b = new Key();

    public static final class Key extends C19339b<C19341d, CoroutineDispatcher> {
        public Key() {
            super(C19341d.C19342a.f43195b, C194621.INSTANCE);
        }
    }

    public CoroutineDispatcher() {
        super(C19341d.C19342a.f43195b);
    }

    /* renamed from: A0 */
    public abstract void mo7108A0(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: B0 */
    public void mo72075B0(CoroutineContext coroutineContext, Runnable runnable) {
        mo7108A0(coroutineContext, runnable);
    }

    /* renamed from: C0 */
    public boolean mo10805C0(CoroutineContext coroutineContext) {
        return !(this instanceof C19482c2);
    }

    /* renamed from: D0 */
    public CoroutineDispatcher mo72076D0(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return new C19723h(this, i);
        }
        throw new IllegalArgumentException(C19383o.m32802l(Integer.valueOf(i), "Expected positive parallelism level, but got ").toString());
    }

    /* renamed from: b */
    public final void mo71806b(C19340c<?> cVar) {
        ((C19722g) cVar).mo72458l();
    }

    /* renamed from: e */
    public final C19722g mo71807e(C19340c cVar) {
        return new C19722g(this, cVar);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        if (bVar instanceof C19339b) {
            C19339b bVar2 = (C19339b) bVar;
            CoroutineContext.C19337b<?> key = getKey();
            C19383o.m32797g(key, "key");
            if (key == bVar2 || bVar2.f43193c == key) {
                E e = (CoroutineContext.C19335a) bVar2.f43192b.invoke(this);
                if (e instanceof CoroutineContext.C19335a) {
                    return e;
                }
            }
        } else if (C19341d.C19342a.f43195b == bVar) {
            return this;
        }
        return null;
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        if (bVar instanceof C19339b) {
            C19339b bVar2 = (C19339b) bVar;
            CoroutineContext.C19337b<?> key = getKey();
            C19383o.m32797g(key, "key");
            if ((key == bVar2 || bVar2.f43193c == key) && ((CoroutineContext.C19335a) bVar2.f43192b.invoke(this)) != null) {
                return EmptyCoroutineContext.INSTANCE;
            }
        } else if (C19341d.C19342a.f43195b == bVar) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C19543e0.m33300R(this);
    }
}
