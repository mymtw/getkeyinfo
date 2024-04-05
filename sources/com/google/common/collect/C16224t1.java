package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.collect.t1 */
public final class C16224t1 extends Sets.C16083b<Object> {

    /* renamed from: b */
    public final /* synthetic */ Set f36327b;

    /* renamed from: c */
    public final /* synthetic */ Set f36328c;

    public C16224t1(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f36327b = immutableSet;
        this.f36328c = immutableSet2;
    }

    public final boolean contains(Object obj) {
        return this.f36327b.contains(obj) && this.f36328c.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f36327b.containsAll(collection) && this.f36328c.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.f36328c, this.f36327b);
    }

    public final Iterator iterator() {
        return new C16220s1(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f36327b) {
            if (this.f36328c.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
