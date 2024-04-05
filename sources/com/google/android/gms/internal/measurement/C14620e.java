package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
public final class C14620e implements Iterator<C14763p> {

    /* renamed from: b */
    public int f32816b = 0;

    /* renamed from: c */
    public final /* synthetic */ C14633f f32817c;

    public C14620e(C14633f fVar) {
        this.f32817c = fVar;
    }

    public final boolean hasNext() {
        return this.f32816b < this.f32817c.mo50490m();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f32816b < this.f32817c.mo50490m()) {
            C14633f fVar = this.f32817c;
            int i = this.f32816b;
            this.f32816b = i + 1;
            return fVar.mo50491n(i);
        }
        throw new NoSuchElementException(C0072d.m200g(32, "Out of bounds index: ", this.f32816b));
    }
}
