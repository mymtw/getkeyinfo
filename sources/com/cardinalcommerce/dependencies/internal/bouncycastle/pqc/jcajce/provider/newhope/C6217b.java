package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.newhope;

import androidx.compose.foundation.layout.C0761x;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.p059a.C6208c;
import java.io.IOException;
import p129h7.C6959b;
import p161k6.C7198a;
import p171l7.C7270b;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.newhope.b */
public class C6217b implements C6208c {

    /* renamed from: b */
    public transient C6959b f13531b;

    public C6217b(C7198a aVar) {
        this.f13531b = (C6959b) C7270b.m13930a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6217b)) {
            return false;
        }
        return C8212a.m16500g(C8212a.m16504k(this.f13531b.f15442b), C8212a.m16504k(((C6217b) obj).f13531b.f15442b));
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return C0761x.m1721g(this.f13531b).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C8212a.m16495b(C8212a.m16504k(this.f13531b.f15442b));
    }
}
