package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;
import kotlin.reflect.C19421p;
import p081d6.C6662a;
import p117g7.C6889b;
import p161k6.C7199b;
import p181m7.C7339a;
import p181m7.C7340b;
import p191n7.C7486a;
import p191n7.C7487b;
import p191n7.C7489d;
import p191n7.C7490e;
import p244t5.C8027v1;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.a */
public class C6212a implements PrivateKey {

    /* renamed from: a */
    private C6889b f13525a;

    public C6212a(C6889b bVar) {
        this.f13525a = bVar;
    }

    /* renamed from: a */
    public int mo17548a() {
        return this.f13525a.f15252c;
    }

    /* renamed from: b */
    public int mo17549b() {
        return this.f13525a.f15253d;
    }

    /* renamed from: c */
    public C7487b mo17550c() {
        return this.f13525a.f15254e;
    }

    /* renamed from: d */
    public C7490e mo17551d() {
        return this.f13525a.f15255f;
    }

    /* renamed from: e */
    public C7489d mo17552e() {
        return this.f13525a.f15256g;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6212a)) {
            return false;
        }
        C6212a aVar = (C6212a) obj;
        return mo17548a() == aVar.mo17548a() && mo17549b() == aVar.mo17549b() && mo17550c().equals(aVar.mo17550c()) && mo17551d().equals(aVar.mo17551d()) && mo17552e().equals(aVar.mo17552e()) && mo17554f().equals(aVar.mo17554f());
    }

    /* renamed from: f */
    public C7486a mo17554f() {
        return this.f13525a.f15257h;
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new C6662a(new C7199b(C7339a.f16301c), new C7340b(mo17548a(), mo17549b(), mo17550c(), mo17551d(), mo17552e(), C19421p.m32955t(this.f13525a.f15251b)), (C8027v1) null, (byte[]) null).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        C6889b bVar = this.f13525a;
        int hashCode = bVar.f15255f.hashCode();
        int hashCode2 = this.f13525a.f15256g.hashCode();
        return this.f13525a.f15257h.hashCode() + ((hashCode2 + ((hashCode + (((((bVar.f15253d * 37) + bVar.f15252c) * 37) + bVar.f15254e.f16693b) * 37)) * 37)) * 37);
    }
}
