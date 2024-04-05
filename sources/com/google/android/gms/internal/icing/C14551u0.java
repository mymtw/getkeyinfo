package com.google.android.gms.internal.icing;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.icing.u0 */
public final class C14551u0 {

    /* renamed from: b */
    public static final C14545s0 f32707b = new C14545s0();

    /* renamed from: a */
    public final C14548t0 f32708a;

    public C14551u0() {
        C14476a1 a1Var;
        C14476a1[] a1VarArr = new C14476a1[2];
        a1VarArr[0] = C14475a0.f32614a;
        try {
            a1Var = (C14476a1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            a1Var = f32707b;
        }
        a1VarArr[1] = a1Var;
        C14548t0 t0Var = new C14548t0(a1VarArr);
        Charset charset = C14515k0.f32655a;
        this.f32708a = t0Var;
    }
}
