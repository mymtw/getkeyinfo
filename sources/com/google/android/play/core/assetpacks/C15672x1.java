package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C15714z;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p614ll.C18200b;

/* renamed from: com.google.android.play.core.assetpacks.x1 */
public final class C15672x1 {

    /* renamed from: a */
    public final C15583b0 f35401a;

    /* renamed from: b */
    public final C15714z f35402b;

    /* renamed from: c */
    public final C15608h1 f35403c;

    /* renamed from: d */
    public final C15714z f35404d;

    /* renamed from: e */
    public final C15671x0 f35405e;

    /* renamed from: f */
    public final C18200b f35406f;

    /* renamed from: g */
    public final C15581a2 f35407g;

    public C15672x1(C15583b0 b0Var, C15714z zVar, C15608h1 h1Var, C15714z zVar2, C15671x0 x0Var, C18200b bVar, C15581a2 a2Var) {
        this.f35401a = b0Var;
        this.f35402b = zVar;
        this.f35403c = h1Var;
        this.f35404d = zVar2;
        this.f35405e = x0Var;
        this.f35406f = bVar;
        this.f35407g = a2Var;
    }

    /* renamed from: a */
    public final void mo55505a(C15660u1 u1Var) {
        C15583b0 b0Var = this.f35401a;
        int i = u1Var.f35355c;
        long j = u1Var.f35356d;
        b0Var.getClass();
        File file = new File(b0Var.mo55377c((String) u1Var.f29575b, i, j), "_packs");
        C15583b0 b0Var2 = this.f35401a;
        int i2 = u1Var.f35355c;
        long j2 = u1Var.f35356d;
        b0Var2.getClass();
        File file2 = new File(new File(b0Var2.mo55377c((String) u1Var.f29575b, i2, j2), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new zzck(String.format("Cannot find pack files to move for pack %s.", new Object[]{(String) u1Var.f29575b}), u1Var.f29574a);
        }
        File j3 = this.f35401a.mo55382j((String) u1Var.f29575b, u1Var.f35355c, u1Var.f35356d);
        j3.mkdirs();
        if (file.renameTo(j3)) {
            new File(this.f35401a.mo55382j((String) u1Var.f29575b, u1Var.f35355c, u1Var.f35356d), "merge.tmp").delete();
            C15583b0 b0Var3 = this.f35401a;
            int i3 = u1Var.f35355c;
            long j4 = u1Var.f35356d;
            b0Var3.getClass();
            File file3 = new File(b0Var3.mo55382j((String) u1Var.f29575b, i3, j4), "_metadata");
            file3.mkdirs();
            if (file2.renameTo(file3)) {
                if (this.f35406f.mo69733a()) {
                    try {
                        this.f35407g.mo55372b((String) u1Var.f29575b, u1Var.f35355c, u1Var.f35356d, u1Var.f35357e);
                        ((Executor) this.f35404d.zza()).execute(new C15668w1(this, u1Var));
                    } catch (IOException e) {
                        throw new zzck(String.format("Could not write asset pack version tag for pack %s: %s", new Object[]{(String) u1Var.f29575b, e.getMessage()}), u1Var.f29574a);
                    }
                } else {
                    C15583b0 b0Var4 = this.f35401a;
                    b0Var4.getClass();
                    ((Executor) this.f35404d.zza()).execute(new C15664v1(b0Var4, 0));
                }
                C15608h1 h1Var = this.f35403c;
                int i4 = u1Var.f35355c;
                long j5 = u1Var.f35356d;
                h1Var.getClass();
                h1Var.mo55412d(new C15679z0(h1Var, (String) u1Var.f29575b, i4, j5));
                this.f35405e.mo55504a((String) u1Var.f29575b);
                ((C15677y2) this.f35402b.zza()).mo55464a(u1Var.f29574a, (String) u1Var.f29575b);
                return;
            }
            throw new zzck("Cannot move metadata files to final location.", u1Var.f29574a);
        }
        throw new zzck("Cannot move merged pack files to final location.", u1Var.f29574a);
    }
}
