package p081d6;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p161k6.C7199b;
import p244t5.C7964b0;
import p244t5.C7966c;
import p244t5.C7976f0;
import p244t5.C7992k0;
import p244t5.C7994l;
import p244t5.C7999m1;
import p244t5.C8000n;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p244t5.C8023u0;
import p244t5.C8027v1;
import p267v7.C8214b;

/* renamed from: d6.a */
public final class C6662a extends C8005o1 {

    /* renamed from: b */
    public C7999m1 f14688b;

    /* renamed from: c */
    public C7199b f14689c;

    /* renamed from: d */
    public C8008p1 f14690d;

    /* renamed from: e */
    public C8027v1 f14691e;

    /* renamed from: f */
    public C8012r f14692f;

    public C6662a() {
        throw null;
    }

    public C6662a(C7199b bVar, C8005o1 o1Var, C8027v1 v1Var, byte[] bArr) {
        this.f14688b = new C7999m1(bArr != null ? C8214b.f18041b : C8214b.f18040a);
        this.f14689c = bVar;
        this.f14690d = new C7964b0(o1Var);
        this.f14691e = v1Var;
        this.f14692f = bArr == null ? null : new C8012r(bArr);
    }

    public C6662a(C8021t1 t1Var) {
        C8027v1 v1Var;
        C8012r rVar;
        Enumeration w = t1Var.mo20524w();
        C7999m1 q = C7999m1.m16076q(w.nextElement());
        this.f14688b = q;
        BigInteger s = q.mo20556s();
        if (s.compareTo(C8214b.f18040a) < 0 || s.compareTo(C8214b.f18041b) > 0) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        int intValue = s.intValue();
        this.f14689c = C7199b.m13865e(w.nextElement());
        this.f14690d = C8008p1.m16103q(w.nextElement());
        int i = -1;
        while (w.hasMoreElements()) {
            C7966c cVar = (C7966c) w.nextElement();
            int i2 = cVar.f17445b;
            if (i2 > i) {
                if (i2 == 0) {
                    C8018s1 s2 = cVar.mo20528s();
                    if (cVar.f17446c) {
                        v1Var = cVar instanceof C8000n ? new C7994l(s2) : new C8023u0(s2);
                    } else if (s2 instanceof C8027v1) {
                        v1Var = (C8027v1) s2;
                    } else if (s2 instanceof C8021t1) {
                        C8021t1 t1Var2 = (C8021t1) s2;
                        v1Var = cVar instanceof C8000n ? new C7994l(t1Var2.mo20574v()) : new C8023u0(t1Var2.mo20574v());
                    } else {
                        StringBuilder h = C0072d.m201h("unknown object in getInstance: ");
                        h.append(cVar.getClass().getName());
                        throw new IllegalArgumentException(h.toString());
                    }
                    this.f14691e = v1Var;
                } else if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (intValue >= 1) {
                    C8018s1 s3 = cVar.mo20528s();
                    if (s3 instanceof C8012r) {
                        rVar = C8012r.m16120v(s3);
                    } else {
                        byte[] v = ((C8008p1) s3).mo20541v();
                        if (v.length >= 1) {
                            byte b = v[0];
                            int length = v.length - 1;
                            byte[] bArr = new byte[length];
                            if (length != 0) {
                                System.arraycopy(v, 1, bArr, 0, v.length - 1);
                            }
                            rVar = new C8012r(b, bArr);
                        } else {
                            throw new IllegalArgumentException("truncated BIT STRING detected");
                        }
                    }
                    this.f14692f = rVar;
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i = i2;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
    }

    /* renamed from: e */
    public static C6662a m13032e(C8018s1 s1Var) {
        if (s1Var instanceof C6662a) {
            return (C6662a) s1Var;
        }
        if (s1Var != null) {
            return new C6662a(C8021t1.m16151s(s1Var));
        }
        return null;
    }

    /* renamed from: g */
    public final C8018s1 mo18832g() {
        return C8018s1.m16138m(this.f14690d.mo20541v());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f14688b);
        iVar.mo55343b(this.f14689c);
        iVar.mo55343b(this.f14690d);
        C8027v1 v1Var = this.f14691e;
        if (v1Var != null) {
            iVar.mo55343b(new C7992k0(false, 0, v1Var));
        }
        C8012r rVar = this.f14692f;
        if (rVar != null) {
            iVar.mo55343b(new C7992k0(false, 1, rVar));
        }
        return new C7976f0(iVar);
    }
}
