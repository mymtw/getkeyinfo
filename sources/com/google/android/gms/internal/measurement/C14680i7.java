package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
public final class C14680i7 implements Iterator<Map.Entry> {

    /* renamed from: b */
    public int f32879b = -1;

    /* renamed from: c */
    public boolean f32880c;

    /* renamed from: d */
    public Iterator<Map.Entry> f32881d;

    /* renamed from: e */
    public final /* synthetic */ C14706k7 f32882e;

    public /* synthetic */ C14680i7(C14706k7 k7Var) {
        this.f32882e = k7Var;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry> mo50594a() {
        if (this.f32881d == null) {
            this.f32881d = this.f32882e.f32915d.entrySet().iterator();
        }
        return this.f32881d;
    }

    public final boolean hasNext() {
        if (this.f32879b + 1 < this.f32882e.f32914c.size()) {
            return true;
        }
        if (!this.f32882e.f32915d.isEmpty()) {
            return mo50594a().hasNext();
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f32880c = true;
        int i = this.f32879b + 1;
        this.f32879b = i;
        return i < this.f32882e.f32914c.size() ? this.f32882e.f32914c.get(this.f32879b) : mo50594a().next();
    }

    public final void remove() {
        if (this.f32880c) {
            this.f32880c = false;
            C14706k7 k7Var = this.f32882e;
            int i = C14706k7.f32912h;
            k7Var.mo50639f();
            if (this.f32879b < this.f32882e.f32914c.size()) {
                C14706k7 k7Var2 = this.f32882e;
                int i2 = this.f32879b;
                this.f32879b = i2 - 1;
                k7Var2.mo50635d(i2);
                return;
            }
            mo50594a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
