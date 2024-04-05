package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1313c;
import com.bumptech.glide.load.resource.bitmap.C6077b;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Map;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
public final class C14597c2 {

    /* renamed from: a */
    public final C6077b f32774a;

    /* renamed from: b */
    public final C14598c3 f32775b;

    /* renamed from: c */
    public final C14598c3 f32776c;

    /* renamed from: d */
    public final C1313c f32777d;

    public C14597c2() {
        C6077b bVar = new C6077b();
        this.f32774a = bVar;
        C14598c3 c3Var = new C14598c3((C14598c3) null, bVar);
        this.f32776c = c3Var;
        this.f32775b = c3Var.mo50399b();
        C1313c cVar = new C1313c();
        this.f32777d = cVar;
        c3Var.mo50404g("require", new C14762ob(cVar));
        ((Map) cVar.f2868b).put("internal.platform", C14687j1.f32894b);
        c3Var.mo50404g("runtime.counter", new C14672i(Double.valueOf(ShadowDrawableWrapper.COS_45)));
    }

    /* renamed from: a */
    public final C14763p mo50398a(C14598c3 c3Var, C14817t3... t3VarArr) {
        C14763p pVar = C14763p.f33033g0;
        for (C14817t3 e1 : t3VarArr) {
            pVar = C0761x.m1718e1(e1);
            C19388s.m32830K0(this.f32776c);
            if ((pVar instanceof C14776q) || (pVar instanceof C14750o)) {
                pVar = this.f32774a.mo17028c(c3Var, pVar);
            }
        }
        return pVar;
    }
}
