package com.google.common.collect;

import com.google.common.collect.Iterators;
import java.util.Iterator;

/* renamed from: com.google.common.collect.u */
public final class C16225u extends C16221t<Object> {

    /* renamed from: c */
    public final /* synthetic */ Iterable[] f36329c;

    /* renamed from: com.google.common.collect.u$a */
    public class C16226a extends C16140a<Iterator<Object>> {
        public C16226a(int i) {
            super(i, 0);
        }

        /* renamed from: a */
        public final Object mo56286a(int i) {
            return C16225u.this.f36329c[i].iterator();
        }
    }

    public C16225u(Iterable[] iterableArr) {
        this.f36329c = iterableArr;
    }

    public final Iterator<Object> iterator() {
        return new Iterators.C15986c(new C16226a(this.f36329c.length));
    }
}
