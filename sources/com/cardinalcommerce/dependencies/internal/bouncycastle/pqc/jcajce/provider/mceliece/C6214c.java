package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;
import p081d6.C6662a;
import p117g7.C6892e;
import p161k6.C7199b;
import p181m7.C7339a;
import p181m7.C7342d;
import p191n7.C7486a;
import p191n7.C7487b;
import p191n7.C7489d;
import p191n7.C7490e;
import p244t5.C8027v1;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.c */
public class C6214c implements PrivateKey {

    /* renamed from: a */
    private C6892e f13527a;

    public C6214c(C6892e eVar) {
        this.f13527a = eVar;
    }

    /* renamed from: a */
    public int mo17568a() {
        return this.f13527a.f15261b;
    }

    /* renamed from: b */
    public int mo17569b() {
        return this.f13527a.f15262c;
    }

    /* renamed from: c */
    public C7487b mo17570c() {
        return this.f13527a.f15263d;
    }

    /* renamed from: d */
    public C7490e mo17571d() {
        return this.f13527a.f15264e;
    }

    /* renamed from: e */
    public C7486a mo17572e() {
        return this.f13527a.f15265f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6214c)) {
            return false;
        }
        C6214c cVar = (C6214c) obj;
        return mo17568a() == cVar.mo17568a() && mo17569b() == cVar.mo17569b() && mo17570c().equals(cVar.mo17570c()) && mo17571d().equals(cVar.mo17571d()) && mo17572e().equals(cVar.mo17572e()) && mo17574f().equals(cVar.mo17574f()) && mo17575g().equals(cVar.mo17575g());
    }

    /* renamed from: f */
    public C7489d mo17574f() {
        return this.f13527a.f15266g;
    }

    /* renamed from: g */
    public C7489d mo17575g() {
        return this.f13527a.f15267h;
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        C6892e eVar = this.f13527a;
        try {
            return new C6662a(new C7199b(C7339a.f16300b), new C7342d(eVar.f15261b, eVar.f15262c, eVar.f15263d, eVar.f15264e, eVar.f15266g, eVar.f15267h, eVar.f15265f), (C8027v1) null, (byte[]) null).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        C6892e eVar = this.f13527a;
        int hashCode = eVar.f15264e.hashCode();
        int hashCode2 = this.f13527a.f15266g.hashCode();
        int hashCode3 = this.f13527a.f15267h.hashCode();
        return this.f13527a.f15265f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((((eVar.f15262c * 37) + eVar.f15261b) * 37) + eVar.f15263d.f16693b) * 37)) * 37)) * 37)) * 37);
    }
}
