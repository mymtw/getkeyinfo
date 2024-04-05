package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0070b;
import com.google.android.gms.internal.icing.C14502h;
import com.google.android.gms.internal.icing.C14506i;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.icing.i */
public abstract class C14506i<MessageType extends C14506i<MessageType, BuilderType>, BuilderType extends C14502h<MessageType, BuilderType>> implements C14480b1 {
    public int zza = 0;

    /* renamed from: a */
    public int mo49757a() {
        throw null;
    }

    /* renamed from: d */
    public void mo49758d(int i) {
        throw null;
    }

    public final zzcf zzg() {
        try {
            C14491e0 e0Var = (C14491e0) this;
            int c = e0Var.mo49741c();
            zzcf zzcf = zzcf.zzb;
            byte[] bArr = new byte[c];
            Logger logger = C14541r.f32685b;
            C14538q qVar = new C14538q(bArr, c);
            C14524m1<?> a = C14512j1.f32651c.mo49820a(e0Var.getClass());
            C14544s sVar = qVar.f32687a;
            if (sVar == null) {
                sVar = new C14544s(qVar);
            }
            a.mo49765d(e0Var, sVar);
            if (c - qVar.f32682f == 0) {
                return new zzcd(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0070b.m184f(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}
