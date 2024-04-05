package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p755lq.C19875a;

/* renamed from: kotlin.sequences.e */
public final class C19427e<T> implements C19431g<T> {

    /* renamed from: a */
    public final C19431g<T> f43343a;

    /* renamed from: b */
    public final boolean f43344b;

    /* renamed from: c */
    public final C19857l<T, Boolean> f43345c;

    /* renamed from: kotlin.sequences.e$a */
    public static final class C19428a implements Iterator<T>, C19875a {

        /* renamed from: b */
        public final Iterator<T> f43346b;

        /* renamed from: c */
        public int f43347c = -1;

        /* renamed from: d */
        public T f43348d;

        /* renamed from: e */
        public final /* synthetic */ C19427e<T> f43349e;

        public C19428a(C19427e<T> eVar) {
            this.f43349e = eVar;
            this.f43346b = eVar.f43343a.iterator();
        }

        /* renamed from: a */
        public final void mo71998a() {
            while (this.f43346b.hasNext()) {
                T next = this.f43346b.next();
                if (this.f43349e.f43345c.invoke(next).booleanValue() == this.f43349e.f43344b) {
                    this.f43348d = next;
                    this.f43347c = 1;
                    return;
                }
            }
            this.f43347c = 0;
        }

        public final boolean hasNext() {
            if (this.f43347c == -1) {
                mo71998a();
            }
            return this.f43347c == 1;
        }

        public final T next() {
            if (this.f43347c == -1) {
                mo71998a();
            }
            if (this.f43347c != 0) {
                T t = this.f43348d;
                this.f43348d = null;
                this.f43347c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C19427e(C19431g<? extends T> gVar, boolean z, C19857l<? super T, Boolean> lVar) {
        C19383o.m32797g(lVar, "predicate");
        this.f43343a = gVar;
        this.f43344b = z;
        this.f43345c = lVar;
    }

    public final Iterator<T> iterator() {
        return new C19428a(this);
    }
}
