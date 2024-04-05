package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15095t3;
import com.google.android.play.core.internal.C15714z;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.g2 */
public final class C15605g2 {

    /* renamed from: a */
    public final C15583b0 f35156a;

    /* renamed from: b */
    public final C15714z f35157b;

    /* renamed from: c */
    public final C15608h1 f35158c;

    /* renamed from: d */
    public final C15714z f35159d;

    /* renamed from: e */
    public final C15671x0 f35160e;

    public C15605g2(C15583b0 b0Var, C15714z zVar, C15608h1 h1Var, C15714z zVar2, C15671x0 x0Var) {
        this.f35156a = b0Var;
        this.f35157b = zVar;
        this.f35158c = h1Var;
        this.f35159d = zVar2;
        this.f35160e = x0Var;
    }

    /* renamed from: a */
    public final void mo55405a(C15601f2 f2Var) {
        File j = this.f35156a.mo55382j((String) f2Var.f29575b, f2Var.f35139c, f2Var.f35141e);
        if (j.exists()) {
            File j2 = this.f35156a.mo55382j((String) f2Var.f29575b, f2Var.f35140d, f2Var.f35141e);
            j2.mkdirs();
            if (j.renameTo(j2)) {
                ((Executor) this.f35159d.zza()).execute(new C15095t3((Object) this, (Object) f2Var, 1));
                C15608h1 h1Var = this.f35158c;
                int i = f2Var.f35140d;
                long j3 = f2Var.f35141e;
                h1Var.getClass();
                h1Var.mo55412d(new C15679z0(h1Var, (String) f2Var.f29575b, i, j3));
                this.f35160e.mo55504a((String) f2Var.f29575b);
                ((C15677y2) this.f35157b.zza()).mo55464a(f2Var.f29574a, (String) f2Var.f29575b);
                return;
            }
            throw new zzck(String.format("Cannot promote pack %s from %s to %s", new Object[]{(String) f2Var.f29575b, j.getAbsolutePath(), j2.getAbsolutePath()}), f2Var.f29574a);
        }
        throw new zzck(String.format("Cannot find pack files to promote for pack %s at %s", new Object[]{(String) f2Var.f29575b, j.getAbsolutePath()}), f2Var.f29574a);
    }
}
