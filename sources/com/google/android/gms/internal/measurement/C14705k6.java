package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.k6 */
public final class C14705k6 {

    /* renamed from: b */
    public static final C14679i6 f32910b = new C14679i6();

    /* renamed from: a */
    public final C14692j6 f32911a;

    public C14705k6() {
        C14783q6 q6Var;
        C14783q6[] q6VarArr = new C14783q6[2];
        q6VarArr[0] = C14769p5.f33045a;
        try {
            q6Var = (C14783q6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            q6Var = f32910b;
        }
        q6VarArr[1] = q6Var;
        C14692j6 j6Var = new C14692j6(q6VarArr);
        Charset charset = C14575a6.f32740a;
        this.f32911a = j6Var;
    }
}
