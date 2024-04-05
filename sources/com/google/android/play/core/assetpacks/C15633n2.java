package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.play.core.assetpacks.n2 */
public final class C15633n2 {

    /* renamed from: b */
    public static final C15032m3 f35261b = new C15032m3("VerifySliceTaskHandler");

    /* renamed from: a */
    public final C15583b0 f35262a;

    public C15633n2(C15583b0 b0Var) {
        this.f35262a = b0Var;
    }

    /* renamed from: a */
    public final void mo55475a(C15629m2 m2Var) {
        File k = this.f35262a.mo55383k((String) m2Var.f29575b, m2Var.f35243c, m2Var.f35244d, m2Var.f35245e);
        if (k.exists()) {
            try {
                C15583b0 b0Var = this.f35262a;
                int i = m2Var.f35243c;
                long j = m2Var.f35244d;
                String str = m2Var.f35245e;
                b0Var.getClass();
                File file = new File(new File(new File(b0Var.mo55377c((String) m2Var.f29575b, i, j), "_slices"), "_metadata"), str);
                if (file.exists()) {
                    try {
                        if (C15640p1.m25455a(C15625l2.m25435a(k, file)).equals(m2Var.f35246f)) {
                            f35261b.mo52245e("Verification of slice %s of pack %s successful.", m2Var.f35245e, (String) m2Var.f29575b);
                            File l = this.f35262a.mo55384l((String) m2Var.f29575b, m2Var.f35243c, m2Var.f35244d, m2Var.f35245e);
                            if (!l.exists()) {
                                l.mkdirs();
                            }
                            if (!k.renameTo(l)) {
                                throw new zzck(String.format("Failed to move slice %s after verification.", new Object[]{m2Var.f35245e}), m2Var.f29574a);
                            }
                            return;
                        }
                        throw new zzck(String.format("Verification failed for slice %s.", new Object[]{m2Var.f35245e}), m2Var.f29574a);
                    } catch (NoSuchAlgorithmException e) {
                        throw new zzck("SHA256 algorithm not supported.", e, m2Var.f29574a);
                    } catch (IOException e2) {
                        throw new zzck(String.format("Could not digest file during verification for slice %s.", new Object[]{m2Var.f35245e}), e2, m2Var.f29574a);
                    }
                } else {
                    throw new zzck(String.format("Cannot find metadata files for slice %s.", new Object[]{m2Var.f35245e}), m2Var.f29574a);
                }
            } catch (IOException e3) {
                throw new zzck(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{m2Var.f35245e}), e3, m2Var.f29574a);
            }
        } else {
            throw new zzck(String.format("Cannot find unverified files for slice %s.", new Object[]{m2Var.f35245e}), m2Var.f29574a);
        }
    }
}
