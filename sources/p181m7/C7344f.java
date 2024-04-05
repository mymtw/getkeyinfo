package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import kotlin.jvm.internal.C19388s;
import p153j7.C7154a;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.f */
public final class C7344f extends C8005o1 {

    /* renamed from: b */
    public C7999m1 f16331b;

    /* renamed from: c */
    public C7959a f16332c;

    /* renamed from: d */
    public byte[][] f16333d;

    /* renamed from: e */
    public byte[] f16334e;

    /* renamed from: f */
    public byte[][] f16335f;

    /* renamed from: g */
    public byte[] f16336g;

    /* renamed from: h */
    public byte[] f16337h;

    /* renamed from: i */
    public C7154a[] f16338i;

    public C7344f(C8021t1 t1Var) {
        C8021t1 t1Var2 = t1Var;
        int i = 0;
        if (t1Var2.mo20523q(0) instanceof C7999m1) {
            this.f16331b = C7999m1.m16076q(t1Var2.mo20523q(0));
        } else {
            this.f16332c = C7959a.m15938q(t1Var2.mo20523q(0));
        }
        C8021t1 t1Var3 = (C8021t1) t1Var2.mo20523q(1);
        this.f16333d = new byte[t1Var3.mo20525y()][];
        for (int i2 = 0; i2 < t1Var3.mo20525y(); i2++) {
            this.f16333d[i2] = ((C8008p1) t1Var3.mo20523q(i2)).mo20541v();
        }
        this.f16334e = ((C8008p1) ((C8021t1) t1Var2.mo20523q(2)).mo20523q(0)).mo20541v();
        C8021t1 t1Var4 = (C8021t1) t1Var2.mo20523q(3);
        this.f16335f = new byte[t1Var4.mo20525y()][];
        for (int i3 = 0; i3 < t1Var4.mo20525y(); i3++) {
            this.f16335f[i3] = ((C8008p1) t1Var4.mo20523q(i3)).mo20541v();
        }
        this.f16336g = ((C8008p1) ((C8021t1) t1Var2.mo20523q(4)).mo20523q(0)).mo20541v();
        this.f16337h = ((C8008p1) ((C8021t1) t1Var2.mo20523q(5)).mo20523q(0)).mo20541v();
        C8021t1 t1Var5 = (C8021t1) t1Var2.mo20523q(6);
        byte[][][][] bArr = new byte[t1Var5.mo20525y()][][][];
        byte[][][][] bArr2 = new byte[t1Var5.mo20525y()][][][];
        byte[][][] bArr3 = new byte[t1Var5.mo20525y()][][];
        byte[][] bArr4 = new byte[t1Var5.mo20525y()][];
        int i4 = 0;
        while (i4 < t1Var5.mo20525y()) {
            C8021t1 t1Var6 = (C8021t1) t1Var5.mo20523q(i4);
            C8021t1 t1Var7 = (C8021t1) t1Var6.mo20523q(i);
            bArr[i4] = new byte[t1Var7.mo20525y()][][];
            for (int i5 = i; i5 < t1Var7.mo20525y(); i5++) {
                C8021t1 t1Var8 = (C8021t1) t1Var7.mo20523q(i5);
                bArr[i4][i5] = new byte[t1Var8.mo20525y()][];
                for (int i6 = 0; i6 < t1Var8.mo20525y(); i6++) {
                    bArr[i4][i5][i6] = ((C8008p1) t1Var8.mo20523q(i6)).mo20541v();
                }
            }
            C8021t1 t1Var9 = (C8021t1) t1Var6.mo20523q(1);
            bArr2[i4] = new byte[t1Var9.mo20525y()][][];
            for (int i7 = 0; i7 < t1Var9.mo20525y(); i7++) {
                C8021t1 t1Var10 = (C8021t1) t1Var9.mo20523q(i7);
                bArr2[i4][i7] = new byte[t1Var10.mo20525y()][];
                for (int i8 = 0; i8 < t1Var10.mo20525y(); i8++) {
                    bArr2[i4][i7][i8] = ((C8008p1) t1Var10.mo20523q(i8)).mo20541v();
                }
            }
            C8021t1 t1Var11 = (C8021t1) t1Var6.mo20523q(2);
            bArr3[i4] = new byte[t1Var11.mo20525y()][];
            for (int i9 = 0; i9 < t1Var11.mo20525y(); i9++) {
                bArr3[i4][i9] = ((C8008p1) t1Var11.mo20523q(i9)).mo20541v();
            }
            bArr4[i4] = ((C8008p1) t1Var6.mo20523q(3)).mo20541v();
            i4++;
            i = 0;
        }
        int length = this.f16337h.length - 1;
        this.f16338i = new C7154a[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.f16337h;
            int i11 = i10 + 1;
            this.f16338i[i10] = new C7154a(bArr5[i10], bArr5[i11], C19388s.m32809A(bArr[i10]), C19388s.m32809A(bArr2[i10]), C19388s.m32895y(bArr3[i10]), C19388s.m32821G(bArr4[i10]));
            i10 = i11;
        }
    }

    public C7344f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C7154a[] aVarArr) {
        this.f16331b = new C7999m1(1);
        this.f16333d = C19388s.m32893x(sArr);
        this.f16334e = C19388s.m32891w(sArr2);
        this.f16335f = C19388s.m32893x(sArr3);
        this.f16336g = C19388s.m32891w(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.f16337h = bArr;
        this.f16338i = aVarArr;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        C7984h1 h1Var = this.f16331b;
        if (h1Var == null) {
            h1Var = this.f16332c;
        }
        iVar.mo55343b(h1Var);
        C15567i iVar2 = new C15567i(2);
        int i = 0;
        while (true) {
            byte[][] bArr = this.f16333d;
            if (i >= bArr.length) {
                break;
            }
            iVar2.mo55343b(new C7964b0(bArr[i]));
            i++;
        }
        iVar.mo55343b(new C7976f0(iVar2));
        C15567i iVar3 = new C15567i(2);
        iVar3.mo55343b(new C7964b0(this.f16334e));
        iVar.mo55343b(new C7976f0(iVar3));
        C15567i iVar4 = new C15567i(2);
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f16335f;
            if (i2 >= bArr2.length) {
                break;
            }
            iVar4.mo55343b(new C7964b0(bArr2[i2]));
            i2++;
        }
        iVar.mo55343b(new C7976f0(iVar4));
        C15567i iVar5 = new C15567i(2);
        iVar5.mo55343b(new C7964b0(this.f16336g));
        iVar.mo55343b(new C7976f0(iVar5));
        C15567i iVar6 = new C15567i(2);
        iVar6.mo55343b(new C7964b0(this.f16337h));
        iVar.mo55343b(new C7976f0(iVar6));
        C15567i iVar7 = new C15567i(2);
        for (int i3 = 0; i3 < this.f16338i.length; i3++) {
            C15567i iVar8 = new C15567i(2);
            byte[][][] z = C19388s.m32897z(this.f16338i[i3].f15917d);
            C15567i iVar9 = new C15567i(2);
            for (byte[][] bArr3 : z) {
                C15567i iVar10 = new C15567i(2);
                int i4 = 0;
                while (true) {
                    if (i4 >= bArr3.length) {
                        break;
                    }
                    iVar10.mo55343b(new C7964b0(bArr3[i4]));
                    i4++;
                }
                iVar9.mo55343b(new C7976f0(iVar10));
            }
            iVar8.mo55343b(new C7976f0(iVar9));
            byte[][][] z2 = C19388s.m32897z(this.f16338i[i3].f15918e);
            C15567i iVar11 = new C15567i(2);
            for (byte[][] bArr4 : z2) {
                C15567i iVar12 = new C15567i(2);
                int i5 = 0;
                while (true) {
                    if (i5 >= bArr4.length) {
                        break;
                    }
                    iVar12.mo55343b(new C7964b0(bArr4[i5]));
                    i5++;
                }
                iVar11.mo55343b(new C7976f0(iVar12));
            }
            iVar8.mo55343b(new C7976f0(iVar11));
            byte[][] x = C19388s.m32893x(this.f16338i[i3].f15919f);
            C15567i iVar13 = new C15567i(2);
            for (byte[] b0Var : x) {
                iVar13.mo55343b(new C7964b0(b0Var));
            }
            iVar8.mo55343b(new C7976f0(iVar13));
            iVar8.mo55343b(new C7964b0(C19388s.m32891w(this.f16338i[i3].f15920g)));
            iVar7.mo55343b(new C7976f0(iVar8));
        }
        iVar.mo55343b(new C7976f0(iVar7));
        return new C7976f0(iVar);
    }
}
