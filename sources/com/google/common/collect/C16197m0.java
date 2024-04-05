package com.google.common.collect;

import com.google.common.base.C15794l;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.collect.m0 */
public final class C16197m0 extends C16221t<Object> {

    /* renamed from: c */
    public final /* synthetic */ Iterable f36299c;

    /* renamed from: d */
    public final /* synthetic */ int f36300d;

    /* renamed from: com.google.common.collect.m0$a */
    public class C16198a implements Iterator<Object> {

        /* renamed from: b */
        public boolean f36301b = true;

        /* renamed from: c */
        public final /* synthetic */ Iterator f36302c;

        public C16198a(Iterator it) {
            this.f36302c = it;
        }

        public final boolean hasNext() {
            return this.f36302c.hasNext();
        }

        public final Object next() {
            Object next = this.f36302c.next();
            this.f36301b = false;
            return next;
        }

        public final void remove() {
            C16203o.m26218e(!this.f36301b);
            this.f36302c.remove();
        }
    }

    public C16197m0(Iterable iterable, int i) {
        this.f36299c = iterable;
        this.f36300d = i;
    }

    public final Iterator<Object> iterator() {
        Iterable iterable = this.f36299c;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.f36300d), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i = this.f36300d;
        it.getClass();
        C15794l.m25614h(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new C16198a(it);
    }
}
