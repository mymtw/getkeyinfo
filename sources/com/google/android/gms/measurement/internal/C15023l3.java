package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14636f2;
import com.google.android.gms.internal.measurement.C14699k0;
import com.google.android.gms.internal.measurement.C14722la;
import p193o.C7499g;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
public final class C15023l3 extends C7499g<String, C14699k0> {

    /* renamed from: a */
    public final /* synthetic */ C15041n3 f33654a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15023l3(C15041n3 n3Var) {
        super(20);
        this.f33654a = n3Var;
    }

    public final Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        C15041n3 n3Var = this.f33654a;
        n3Var.mo51942h();
        Preconditions.checkNotEmpty(str);
        C14722la.m23700b();
        if (!((C15103u3) n3Var.f33681b).f33878h.mo51973p((String) null, C14959e2.f33426q0) || !n3Var.mo52256m(str)) {
            return null;
        }
        if (!n3Var.f33703h.containsKey(str) || n3Var.f33703h.getOrDefault(str, null) == null) {
            n3Var.mo52262s(str);
        } else {
            n3Var.mo52263t(str, (C14636f2) n3Var.f33703h.getOrDefault(str, null));
        }
        return (C14699k0) n3Var.f33705j.snapshot().get(str);
    }
}
