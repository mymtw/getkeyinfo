package com.google.android.gms.internal.icing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.icing.s1 */
public final class C14546s1 implements Iterator<Map.Entry> {

    /* renamed from: b */
    public int f32695b = -1;

    /* renamed from: c */
    public boolean f32696c;

    /* renamed from: d */
    public Iterator<Map.Entry> f32697d;

    /* renamed from: e */
    public final /* synthetic */ C14552u1 f32698e;

    public /* synthetic */ C14546s1(C14552u1 u1Var) {
        this.f32698e = u1Var;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry> mo49912a() {
        if (this.f32697d == null) {
            this.f32697d = this.f32698e.f32712d.entrySet().iterator();
        }
        return this.f32697d;
    }

    public final boolean hasNext() {
        if (this.f32695b + 1 < this.f32698e.f32711c.size()) {
            return true;
        }
        if (!this.f32698e.f32712d.isEmpty()) {
            return mo49912a().hasNext();
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f32696c = true;
        int i = this.f32695b + 1;
        this.f32695b = i;
        return i < this.f32698e.f32711c.size() ? this.f32698e.f32711c.get(this.f32695b) : mo49912a().next();
    }

    public final void remove() {
        if (this.f32696c) {
            this.f32696c = false;
            C14552u1 u1Var = this.f32698e;
            int i = C14552u1.f32709h;
            u1Var.mo49936e();
            if (this.f32695b < this.f32698e.f32711c.size()) {
                C14552u1 u1Var2 = this.f32698e;
                int i2 = this.f32695b;
                this.f32695b = i2 - 1;
                u1Var2.mo49932c(i2);
                return;
            }
            mo49912a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
