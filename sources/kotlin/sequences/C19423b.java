package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p755lq.C19875a;

/* renamed from: kotlin.sequences.b */
public final class C19423b<T> implements C19431g<T>, C19425c<T> {

    /* renamed from: a */
    public final C19431g<T> f43338a;

    /* renamed from: b */
    public final int f43339b;

    /* renamed from: kotlin.sequences.b$a */
    public static final class C19424a implements Iterator<T>, C19875a {

        /* renamed from: b */
        public final Iterator<T> f43340b;

        /* renamed from: c */
        public int f43341c;

        public C19424a(C19423b<T> bVar) {
            this.f43340b = bVar.f43338a.iterator();
            this.f43341c = bVar.f43339b;
        }

        public final boolean hasNext() {
            while (this.f43341c > 0 && this.f43340b.hasNext()) {
                this.f43340b.next();
                this.f43341c--;
            }
            return this.f43340b.hasNext();
        }

        public final T next() {
            while (this.f43341c > 0 && this.f43340b.hasNext()) {
                this.f43340b.next();
                this.f43341c--;
            }
            return this.f43340b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C19423b(C19431g<? extends T> gVar, int i) {
        C19383o.m32797g(gVar, "sequence");
        this.f43338a = gVar;
        this.f43339b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
        }
    }

    /* renamed from: a */
    public final C19431g<T> mo71994a(int i) {
        int i2 = this.f43339b + i;
        return i2 < 0 ? new C19423b(this, i) : new C19423b(this.f43338a, i2);
    }

    public final Iterator<T> iterator() {
        return new C19424a(this);
    }
}
