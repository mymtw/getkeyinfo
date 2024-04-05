package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;
import p755lq.C19875a;

/* renamed from: kotlin.sequences.f */
public final class C19429f<T> implements C19431g<T> {

    /* renamed from: a */
    public final C19846a<T> f43350a;

    /* renamed from: b */
    public final C19857l<T, T> f43351b;

    /* renamed from: kotlin.sequences.f$a */
    public static final class C19430a implements Iterator<T>, C19875a {

        /* renamed from: b */
        public T f43352b;

        /* renamed from: c */
        public int f43353c = -2;

        /* renamed from: d */
        public final /* synthetic */ C19429f<T> f43354d;

        public C19430a(C19429f<T> fVar) {
            this.f43354d = fVar;
        }

        /* renamed from: a */
        public final void mo72002a() {
            T t;
            if (this.f43353c == -2) {
                t = this.f43354d.f43350a.invoke();
            } else {
                C19857l<T, T> lVar = this.f43354d.f43351b;
                T t2 = this.f43352b;
                C19383o.m32794d(t2);
                t = lVar.invoke(t2);
            }
            this.f43352b = t;
            this.f43353c = t == null ? 0 : 1;
        }

        public final boolean hasNext() {
            if (this.f43353c < 0) {
                mo72002a();
            }
            return this.f43353c == 1;
        }

        public final T next() {
            if (this.f43353c < 0) {
                mo72002a();
            }
            if (this.f43353c != 0) {
                T t = this.f43352b;
                C19383o.m32795e(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f43353c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C19429f(C19846a<? extends T> aVar, C19857l<? super T, ? extends T> lVar) {
        C19383o.m32797g(lVar, "getNextValue");
        this.f43350a = aVar;
        this.f43351b = lVar;
    }

    public final Iterator<T> iterator() {
        return new C19430a(this);
    }
}
