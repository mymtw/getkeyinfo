package kotlin.coroutines;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import java.io.Serializable;
import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19861p;

public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.C19335a element;
    private final CoroutineContext left;

    public static final class Serialized implements Serializable {
        public static final C19334a Companion = new C19334a();
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        /* renamed from: kotlin.coroutines.CombinedContext$Serialized$a */
        public static final class C19334a {
        }

        public Serialized(CoroutineContext[] coroutineContextArr) {
            C19383o.m32797g(coroutineContextArr, "elements");
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext plus : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(plus);
            }
            return coroutineContext;
        }

        public final CoroutineContext[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(CoroutineContext coroutineContext, CoroutineContext.C19335a aVar) {
        C19383o.m32797g(coroutineContext, "left");
        C19383o.m32797g(aVar, "element");
        this.left = coroutineContext;
        this.element = aVar;
    }

    private final Object writeReplace() {
        int i = mo71798i();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[i];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(C19394m.f43287a, new CombinedContext$writeReplace$1(coroutineContextArr, ref$IntRef));
        if (ref$IntRef.element == i) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.mo71798i() != mo71798i()) {
                return false;
            }
            CombinedContext combinedContext2 = this;
            while (true) {
                CoroutineContext.C19335a aVar = combinedContext2.element;
                if (C19383o.m32792b(combinedContext.get(aVar.getKey()), aVar)) {
                    CoroutineContext coroutineContext = combinedContext2.left;
                    if (!(coroutineContext instanceof CombinedContext)) {
                        C19383o.m32795e(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.C19335a aVar2 = (CoroutineContext.C19335a) coroutineContext;
                        z = C19383o.m32792b(combinedContext.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) coroutineContext;
                } else {
                    z = false;
                    break;
                }
            }
            return z;
        }
    }

    public <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(this.left.fold(r, pVar), this.element);
    }

    public <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = combinedContext.element.get(bVar);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(bVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    /* renamed from: i */
    public final int mo71798i() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        if (this.element.get(bVar) != null) {
            return this.left;
        }
        CoroutineContext minusKey = this.left.minusKey(bVar);
        return minusKey == this.left ? this : minusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(minusKey, this.element);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }

    public String toString() {
        return C0391c.m1057c(C0326j.m866k('['), (String) fold("", CombinedContext$toString$1.INSTANCE), ']');
    }
}
