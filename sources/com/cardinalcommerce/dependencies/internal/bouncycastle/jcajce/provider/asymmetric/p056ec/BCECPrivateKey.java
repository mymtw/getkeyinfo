package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p056ec;

import androidx.appcompat.widget.C0326j;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6149b;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Hashtable;
import java.util.Vector;
import kotlinx.coroutines.C19543e0;
import p008a7.C0041a;
import p081d6.C6662a;
import p093e6.C6719a;
import p152j6.C7146d;
import p152j6.C7153k;
import p161k6.C7198a;
import p161k6.C7199b;
import p180m6.C7338b;
import p190n6.C7485a;
import p199o6.C7623d;
import p199o6.C7624e;
import p209p6.C7676c;
import p223r5.C7750c;
import p223r5.C7759g0;
import p244t5.C7999m1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p244t5.C8027v1;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey */
public class BCECPrivateKey implements C6149b, C7338b, ECPrivateKey {

    /* renamed from: a */
    private String f13324a = "EC";

    /* renamed from: b */
    private boolean f13325b;

    /* renamed from: c */
    public transient BigInteger f13326c;

    /* renamed from: d */
    public transient ECParameterSpec f13327d;

    /* renamed from: e */
    public transient C0041a f13328e;

    /* renamed from: f */
    public transient C8012r f13329f;

    public BCECPrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7623d mo17238a() {
        ECParameterSpec eCParameterSpec = this.f13327d;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13325b);
    }

    /* renamed from: b */
    public C7623d mo17324b() {
        ECParameterSpec eCParameterSpec = this.f13327d;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13325b) : ((C7485a) this.f13328e).mo19824a();
    }

    /* renamed from: c */
    public BigInteger mo17239c() {
        return this.f13326c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return mo17239c().equals(bCECPrivateKey.mo17239c()) && mo17324b().equals(bCECPrivateKey.mo17324b());
    }

    public String getAlgorithm() {
        return this.f13324a;
    }

    public byte[] getEncoded() {
        C7146d j = C15588c1.m25330j(this.f13327d, this.f13325b);
        ECParameterSpec eCParameterSpec = this.f13327d;
        int l = eCParameterSpec == null ? C19543e0.m33319l(this.f13328e, (BigInteger) null, getS()) : C19543e0.m33319l(this.f13328e, eCParameterSpec.getOrder(), getS());
        try {
            return new C6662a(new C7199b(C7153k.f15885B0, j), this.f13329f != null ? new C6719a(l, getS(), this.f13329f, j) : new C6719a(l, getS(), (C8012r) null, j), (C8027v1) null, (byte[]) null).mo20561a("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public ECParameterSpec getParams() {
        return this.f13327d;
    }

    public BigInteger getS() {
        return this.f13326c;
    }

    public int hashCode() {
        return mo17239c().hashCode() ^ mo17324b().hashCode();
    }

    public String toString() {
        return C19543e0.m33323n("EC", this.f13326c, mo17324b());
    }

    public BCECPrivateKey(String str, C6662a aVar, C0041a aVar2) {
        C0326j.m867l();
        this.f13324a = str;
        this.f13328e = aVar2;
        C7146d e = C7146d.m13814e(aVar.f14689c.f15984c);
        this.f13327d = C6171d.m12345a(e, C6171d.m12350f(this.f13328e, e));
        C8018s1 g = aVar.mo18832g();
        if (g instanceof C7999m1) {
            this.f13326c = C7999m1.m16076q(g).mo20556s();
            return;
        }
        C6719a e2 = C6719a.m13110e(g);
        this.f13326c = e2.mo18903g();
        this.f13329f = e2.mo18904l();
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, C0041a aVar) {
        C0326j.m867l();
        this.f13324a = str;
        this.f13326c = eCPrivateKeySpec.getS();
        this.f13327d = eCPrivateKeySpec.getParams();
        this.f13328e = aVar;
    }

    public BCECPrivateKey(String str, C7624e eVar, C0041a aVar) {
        C0326j.m867l();
        this.f13324a = str;
        throw null;
    }

    public BCECPrivateKey(String str, C7750c cVar, C0041a aVar) {
        C0326j.m867l();
        this.f13324a = str;
        cVar.getClass();
        this.f13326c = null;
        this.f13327d = null;
        this.f13328e = aVar;
    }

    public BCECPrivateKey(String str, C7750c cVar, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, C0041a aVar) {
        C0326j.m867l();
        this.f13324a = str;
        cVar.getClass();
        C8012r rVar = null;
        this.f13326c = null;
        this.f13328e = aVar;
        if (eCParameterSpec == null) {
            C7759g0 g0Var = cVar.f17170b;
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        }
        this.f13327d = eCParameterSpec;
        try {
            rVar = C7198a.m13862e(C8018s1.m16138m(bCECPublicKey.getEncoded())).f15982c;
        } catch (IOException unused) {
        }
        this.f13329f = rVar;
    }

    public BCECPrivateKey(String str, C7750c cVar, BCECPublicKey bCECPublicKey, C7623d dVar, C0041a aVar) {
        C8012r rVar;
        C0326j.m867l();
        this.f13324a = str;
        cVar.getClass();
        this.f13326c = null;
        this.f13328e = aVar;
        if (dVar == null) {
            C7759g0 g0Var = cVar.f17170b;
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            this.f13327d = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            this.f13327d = C6171d.m12346b(C6171d.m12348d(dVar.f16910a), dVar);
        }
        try {
            rVar = C7198a.m13862e(C8018s1.m16138m(bCECPublicKey.getEncoded())).f15982c;
        } catch (IOException unused) {
            rVar = null;
        }
        try {
            this.f13329f = rVar;
        } catch (Exception unused2) {
            this.f13329f = null;
        }
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, C0041a aVar) {
        new Hashtable();
        new Vector();
        this.f13326c = eCPrivateKey.getS();
        this.f13324a = eCPrivateKey.getAlgorithm();
        this.f13327d = eCPrivateKey.getParams();
        this.f13328e = aVar;
    }
}
