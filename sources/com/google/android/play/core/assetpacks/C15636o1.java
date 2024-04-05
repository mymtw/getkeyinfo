package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C15682a0;
import com.google.android.play.core.internal.C15684b0;
import com.google.android.play.core.internal.C15686c0;
import java.io.File;

/* renamed from: com.google.android.play.core.assetpacks.o1 */
public final class C15636o1 implements C15686c0 {

    /* renamed from: b */
    public final C15686c0 f35264b;

    /* renamed from: c */
    public final C15686c0 f35265c;

    /* renamed from: d */
    public final C15686c0 f35266d;

    /* renamed from: e */
    public final C15686c0 f35267e;

    /* renamed from: f */
    public final C15686c0 f35268f;

    /* renamed from: g */
    public final C15686c0 f35269g;

    /* renamed from: h */
    public final C15686c0 f35270h;

    public C15636o1(C15686c0 c0Var, C15682a0 a0Var, C15686c0 c0Var2, C15669w2 w2Var, C15686c0 c0Var3, C15686c0 c0Var4, C15686c0 c0Var5) {
        this.f35264b = c0Var;
        this.f35265c = a0Var;
        this.f35266d = c0Var2;
        this.f35267e = w2Var;
        this.f35268f = c0Var3;
        this.f35269g = c0Var4;
        this.f35270h = c0Var5;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        String str = (String) this.f35264b.zza();
        Object zza = this.f35265c.zza();
        Object zza2 = this.f35266d.zza();
        Context a = ((C15669w2) this.f35267e).mo55501a();
        Object zza3 = this.f35268f.zza();
        return new C15632n1(str != null ? new File(a.getExternalFilesDir((String) null), str) : a.getExternalFilesDir((String) null), (C15674y) zza, (C15671x0) zza2, a, (C15589c2) zza3, C15684b0.m25502a(this.f35269g), (C15581a2) this.f35270h.zza());
    }
}
