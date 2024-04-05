package com.google.android.gms.measurement.internal;

import java.util.HashSet;
import p193o.C7494b;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
public final class C15090s7 extends C14928a7 {

    /* renamed from: e */
    public String f33840e;

    /* renamed from: f */
    public HashSet f33841f;

    /* renamed from: g */
    public C7494b f33842g;

    /* renamed from: h */
    public Long f33843h;

    /* renamed from: i */
    public Long f33844i;

    public C15090s7(C14973f7 f7Var) {
        super(f7Var);
    }

    /* renamed from: j */
    public final void mo51944j() {
    }

    /* renamed from: k */
    public final C15045n7 mo52314k(Integer num) {
        if (this.f33842g.containsKey(num)) {
            return (C15045n7) this.f33842g.getOrDefault(num, null);
        }
        C15045n7 n7Var = new C15045n7(this, this.f33840e);
        this.f33842g.put(num, n7Var);
        return n7Var;
    }
}
