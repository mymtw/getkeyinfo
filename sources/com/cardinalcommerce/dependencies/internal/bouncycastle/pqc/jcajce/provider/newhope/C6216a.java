package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.newhope;

import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.p059a.C6207b;
import java.io.IOException;
import p001a0.C0005b;
import p081d6.C6662a;
import p129h7.C6958a;
import p171l7.C7269a;
import p244t5.C8027v1;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.newhope.a */
public class C6216a implements C6207b {

    /* renamed from: b */
    public transient C6958a f13529b;

    /* renamed from: c */
    public transient C8027v1 f13530c;

    public C6216a(C6662a aVar) {
        this.f13530c = aVar.f14691e;
        this.f13529b = (C6958a) C7269a.m13929a(aVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6216a)) {
            return false;
        }
        short[] l = C8212a.m16505l(this.f13529b.f15441b);
        short[] l2 = C8212a.m16505l(((C6216a) obj).f13529b.f15441b);
        if (l != l2) {
            if (l == null || l2 == null || l.length != l2.length) {
                return false;
            }
            for (int i = 0; i != l.length; i++) {
                if (l[i] != l2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return C0005b.m49m(this.f13529b, this.f13530c).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return C8212a.m16498e(C8212a.m16505l(this.f13529b.f15441b));
    }
}
