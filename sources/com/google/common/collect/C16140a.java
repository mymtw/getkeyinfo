package com.google.common.collect;

import com.google.common.base.C15794l;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a */
public abstract class C16140a<E> extends C16174g2<E> {

    /* renamed from: b */
    public final int f36242b;

    /* renamed from: c */
    public int f36243c;

    public C16140a(int i, int i2) {
        C15794l.m25618l(i2, i);
        this.f36242b = i;
        this.f36243c = i2;
    }

    /* renamed from: a */
    public abstract E mo56286a(int i);

    public final boolean hasNext() {
        return this.f36243c < this.f36242b;
    }

    public final boolean hasPrevious() {
        return this.f36243c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f36243c;
            this.f36243c = i + 1;
            return mo56286a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f36243c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f36243c - 1;
            this.f36243c = i;
            return mo56286a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f36243c - 1;
    }
}
