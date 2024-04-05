package p171l7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6174a;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6175b;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6177d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6194p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6195q;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6200t;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6202v;
import java.io.IOException;
import p081d6.C6662a;
import p129h7.C6958a;
import p141i7.C6996a;
import p162k7.C7206a;
import p181m7.C7339a;
import p181m7.C7346h;
import p181m7.C7347i;
import p181m7.C7348j;
import p181m7.C7351m;
import p223r5.C7770q;
import p244t5.C7959a;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p265v5.C8206a;
import p267v7.C8212a;

/* renamed from: l7.a */
public final class C7269a {
    /* renamed from: a */
    public static C7770q m13929a(C6662a aVar) {
        C7959a aVar2 = aVar.f14689c.f15983b;
        C7959a aVar3 = C8206a.f18007d;
        String str = aVar2.f17434b;
        String str2 = aVar3.f17434b;
        if (str.length() > str2.length() && str.charAt(str2.length()) == '.' && str.startsWith(str2)) {
            return new C6996a(((Integer) C7277c.f16134l.get(aVar.f14689c.f15983b)).intValue(), C8008p1.m16103q(aVar.mo18832g()).mo20541v());
        } else if (aVar2.equals(C8206a.f18004a)) {
            return new C7206a(C8008p1.m16103q(aVar.mo18832g()).mo20541v(), C7277c.m13937a(C7346h.m14113e(aVar.f14689c.f15984c)));
        } else {
            if (aVar2.equals(C8206a.f18013j)) {
                byte[] v = C8008p1.m16103q(aVar.mo18832g()).mo20541v();
                int length = v.length / 2;
                short[] sArr = new short[length];
                for (int i = 0; i != length; i++) {
                    int i2 = i * 2;
                    sArr[i] = (short) (((v[i2 + 1] & 255) << 8) | (v[i2] & 255));
                }
                return new C6958a(sArr);
            }
            C7351m mVar = null;
            if (aVar2.equals(C8206a.f18005b)) {
                C7347i e = C7347i.m14115e(aVar.f14689c.f15984c);
                C7959a aVar4 = e.f16349d.f15983b;
                C8018s1 g = aVar.mo18832g();
                if (g instanceof C7351m) {
                    mVar = (C7351m) g;
                } else if (g != null) {
                    mVar = new C7351m(C8021t1.m16151s(g));
                }
                try {
                    C6202v.C6203a aVar5 = new C6202v.C6203a(new C6200t(e.f16348c, C7277c.m13940d(aVar4)));
                    aVar5.f13512b = mVar.f16362b;
                    aVar5.f13513c = C6177d.m12380f(C8212a.m16504k(mVar.f16363c));
                    aVar5.f13514d = C6177d.m12380f(C8212a.m16504k(mVar.f16364d));
                    aVar5.f13515e = C6177d.m12380f(C8212a.m16504k(mVar.f16365e));
                    aVar5.f13516f = C6177d.m12380f(C8212a.m16504k(mVar.f16366f));
                    if (C8212a.m16504k(mVar.f16367g) != null) {
                        aVar5.f13517g = ((C6174a) C6177d.m12376b(C8212a.m16504k(mVar.f16367g), C6174a.class)).mo17504a(aVar4);
                    }
                    return new C6202v(aVar5);
                } catch (ClassNotFoundException e2) {
                    StringBuilder h = C0072d.m201h("ClassNotFoundException processing BDS state: ");
                    h.append(e2.getMessage());
                    throw new IOException(h.toString());
                }
            } else if (aVar2.equals(C7339a.f16305g)) {
                C7348j e3 = C7348j.m14117e(aVar.f14689c.f15984c);
                C7959a aVar6 = e3.f16353e.f15983b;
                try {
                    C8018s1 g2 = aVar.mo18832g();
                    if (g2 instanceof C7351m) {
                        mVar = (C7351m) g2;
                    } else if (g2 != null) {
                        mVar = new C7351m(C8021t1.m16151s(g2));
                    }
                    C6195q.C6196a aVar7 = new C6195q.C6196a(new C6194p(e3.f16351c, e3.f16352d, C7277c.m13940d(aVar6)));
                    aVar7.f13486b = (long) mVar.f16362b;
                    aVar7.f13487c = C6177d.m12380f(C8212a.m16504k(mVar.f16363c));
                    aVar7.f13488d = C6177d.m12380f(C8212a.m16504k(mVar.f16364d));
                    aVar7.f13489e = C6177d.m12380f(C8212a.m16504k(mVar.f16365e));
                    aVar7.f13490f = C6177d.m12380f(C8212a.m16504k(mVar.f16366f));
                    if (C8212a.m16504k(mVar.f16367g) != null) {
                        aVar7.f13491g = ((C6175b) C6177d.m12376b(C8212a.m16504k(mVar.f16367g), C6175b.class)).mo17510a(aVar6);
                    }
                    return new C6195q(aVar7);
                } catch (ClassNotFoundException e4) {
                    StringBuilder h2 = C0072d.m201h("ClassNotFoundException processing BDS state: ");
                    h2.append(e4.getMessage());
                    throw new IOException(h2.toString());
                }
            } else {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
        }
    }
}
