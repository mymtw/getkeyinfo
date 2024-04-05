package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import kotlin.jvm.internal.C19388s;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.g */
public final class C7345g extends C8005o1 {

    /* renamed from: b */
    public C7999m1 f16339b;

    /* renamed from: c */
    public C7959a f16340c;

    /* renamed from: d */
    public C7999m1 f16341d;

    /* renamed from: e */
    public byte[][] f16342e;

    /* renamed from: f */
    public byte[][] f16343f;

    /* renamed from: g */
    public byte[] f16344g;

    public C7345g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f16339b = new C7999m1(0);
        this.f16341d = new C7999m1((long) i);
        this.f16342e = C19388s.m32893x(sArr);
        this.f16343f = C19388s.m32893x(sArr2);
        this.f16344g = C19388s.m32891w(sArr3);
    }

    public C7345g(C8021t1 t1Var) {
        if (t1Var.mo20523q(0) instanceof C7999m1) {
            this.f16339b = C7999m1.m16076q(t1Var.mo20523q(0));
        } else {
            this.f16340c = C7959a.m15938q(t1Var.mo20523q(0));
        }
        this.f16341d = C7999m1.m16076q(t1Var.mo20523q(1));
        C8021t1 s = C8021t1.m16151s(t1Var.mo20523q(2));
        this.f16342e = new byte[s.mo20525y()][];
        for (int i = 0; i < s.mo20525y(); i++) {
            this.f16342e[i] = C8008p1.m16103q(s.mo20523q(i)).mo20541v();
        }
        C8021t1 t1Var2 = (C8021t1) t1Var.mo20523q(3);
        this.f16343f = new byte[t1Var2.mo20525y()][];
        for (int i2 = 0; i2 < t1Var2.mo20525y(); i2++) {
            this.f16343f[i2] = C8008p1.m16103q(t1Var2.mo20523q(i2)).mo20541v();
        }
        this.f16344g = C8008p1.m16103q(((C8021t1) t1Var.mo20523q(4)).mo20523q(0)).mo20541v();
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        C7984h1 h1Var = this.f16339b;
        if (h1Var == null) {
            h1Var = this.f16340c;
        }
        iVar.mo55343b(h1Var);
        iVar.mo55343b(this.f16341d);
        C15567i iVar2 = new C15567i(2);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f16342e;
            if (i2 >= bArr.length) {
                break;
            }
            iVar2.mo55343b(new C7964b0(bArr[i2]));
            i2++;
        }
        iVar.mo55343b(new C7976f0(iVar2));
        C15567i iVar3 = new C15567i(2);
        while (true) {
            byte[][] bArr2 = this.f16343f;
            if (i < bArr2.length) {
                iVar3.mo55343b(new C7964b0(bArr2[i]));
                i++;
            } else {
                iVar.mo55343b(new C7976f0(iVar3));
                C15567i iVar4 = new C15567i(2);
                iVar4.mo55343b(new C7964b0(this.f16344g));
                iVar.mo55343b(new C7976f0(iVar4));
                return new C7976f0(iVar);
            }
        }
    }
}
