package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import p568fn.C17782b;

/* renamed from: com.google.android.gms.internal.common.c */
public final class C14463c<E> extends C14465e<Object> {

    /* renamed from: b */
    public final int f32594b;

    /* renamed from: c */
    public int f32595c;

    /* renamed from: d */
    public final zzag<E> f32596d;

    public C14463c(zzag<E> zzag, int i) {
        int size = zzag.size();
        C17782b.m29835C0(i, size);
        this.f32594b = size;
        this.f32595c = i;
        this.f32596d = zzag;
    }

    /* renamed from: a */
    public final boolean hasNext() {
        return this.f32595c < this.f32594b;
    }

    /* renamed from: b */
    public final boolean hasPrevious() {
        return this.f32595c > 0;
    }

    /* renamed from: c */
    public final Object next() {
        if (hasNext()) {
            int i = this.f32595c;
            this.f32595c = i + 1;
            return this.f32596d.get(i);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f32595c - 1;
            this.f32595c = i;
            return this.f32596d.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f32595c;
    }

    public final int previousIndex() {
        return this.f32595c - 1;
    }
}
