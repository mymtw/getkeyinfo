package p191n7;

import java.io.Serializable;

/* renamed from: n7.f */
public final class C7491f {

    /* renamed from: a */
    public Object f16699a;

    /* renamed from: b */
    public Object f16700b;

    /* renamed from: c */
    public Serializable f16701c;

    /* renamed from: d */
    public Object f16702d;

    /* JADX WARNING: type inference failed for: r14v3, types: [n7.e[], java.io.Serializable] */
    public C7491f(C7487b bVar, C7490e eVar) {
        int i;
        int a;
        int[] iArr;
        this.f16699a = bVar;
        this.f16700b = eVar;
        int[] iArr2 = eVar.f16698c;
        int i2 = -1;
        int length = iArr2.length - 1;
        length = iArr2[length] == 0 ? -1 : length;
        this.f16701c = new C7490e[length];
        int i3 = 0;
        while (true) {
            i = length >> 1;
            if (i3 >= i) {
                break;
            }
            int i4 = i3 << 1;
            int[] iArr3 = new int[(i4 + 1)];
            iArr3[i4] = 1;
            ((C7490e[]) this.f16701c)[i3] = new C7490e((C7487b) this.f16699a, iArr3);
            i3++;
        }
        while (i < length) {
            int i5 = i << 1;
            int[] iArr4 = new int[(i5 + 1)];
            iArr4[i5] = 1;
            C7490e eVar2 = new C7490e((C7487b) this.f16699a, iArr4);
            C7490e[] eVarArr = (C7490e[]) this.f16701c;
            int[] iArr5 = eVar2.f16698c;
            int[] iArr6 = ((C7490e) this.f16700b).f16698c;
            int d = C7490e.m14424d(iArr6);
            if (d != -1) {
                int length2 = iArr5.length;
                int[] iArr7 = new int[length2];
                int d2 = C7490e.m14424d(iArr6);
                int a2 = eVar2.f16696a.mo19829a(d2 == -1 ? 0 : iArr6[d2]);
                System.arraycopy(iArr5, 0, iArr7, 0, length2);
                while (d <= C7490e.m14424d(iArr7)) {
                    C7487b bVar2 = eVar2.f16696a;
                    int d3 = C7490e.m14424d(iArr7);
                    int b = bVar2.mo19830b(d3 == -1 ? 0 : iArr7[d3], a2);
                    int d4 = C7490e.m14424d(iArr7) - d;
                    int d5 = C7490e.m14424d(iArr6);
                    if (d5 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr8 = new int[(d5 + d4 + 1)];
                        System.arraycopy(iArr6, 0, iArr8, d4, d5 + 1);
                        iArr = iArr8;
                    }
                    iArr7 = eVar2.mo19840b(eVar2.mo19841c(b, iArr), iArr7);
                }
                eVarArr[i] = new C7490e(eVar2.f16696a, iArr7);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int[] iArr9 = ((C7490e) this.f16700b).f16698c;
        int length3 = iArr9.length - 1;
        i2 = iArr9[length3] != 0 ? length3 : i2;
        C7490e[] eVarArr2 = new C7490e[i2];
        int i6 = i2 - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            eVarArr2[i7] = new C7490e(((C7490e[]) this.f16701c)[i7]);
        }
        this.f16702d = new C7490e[i2];
        while (i6 >= 0) {
            ((C7490e[]) this.f16702d)[i6] = new C7490e((C7487b) this.f16699a, i6);
            i6--;
        }
        int i8 = 0;
        while (i8 < i2) {
            if (eVarArr2[i8].mo19839a(i8) == 0) {
                int i9 = i8 + 1;
                boolean z = false;
                while (i9 < i2) {
                    if (eVarArr2[i9].mo19839a(i8) != 0) {
                        C7490e eVar3 = eVarArr2[i8];
                        eVarArr2[i8] = eVarArr2[i9];
                        eVarArr2[i9] = eVar3;
                        C7490e[] eVarArr3 = (C7490e[]) this.f16702d;
                        C7490e eVar4 = eVarArr3[i8];
                        eVarArr3[i8] = eVarArr3[i9];
                        eVarArr3[i9] = eVar4;
                        i9 = i2;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int a3 = ((C7487b) this.f16699a).mo19829a(eVarArr2[i8].mo19839a(i8));
            C7490e eVar5 = eVarArr2[i8];
            if (eVar5.f16696a.mo19831c(a3)) {
                eVar5.f16698c = eVar5.mo19841c(a3, eVar5.f16698c);
                eVar5.mo19845g();
                C7490e eVar6 = ((C7490e[]) this.f16702d)[i8];
                if (eVar6.f16696a.mo19831c(a3)) {
                    eVar6.f16698c = eVar6.mo19841c(a3, eVar6.f16698c);
                    eVar6.mo19845g();
                    for (int i10 = 0; i10 < i2; i10++) {
                        if (!(i10 == i8 || (a = eVarArr2[i10].mo19839a(i8)) == 0)) {
                            C7490e f = eVarArr2[i8].mo19844f(a);
                            C7490e f2 = ((C7490e[]) this.f16702d)[i8].mo19844f(a);
                            C7490e eVar7 = eVarArr2[i10];
                            eVar7.f16698c = eVar7.mo19840b(eVar7.f16698c, f.f16698c);
                            eVar7.mo19845g();
                            C7490e eVar8 = ((C7490e[]) this.f16702d)[i10];
                            eVar8.f16698c = eVar8.mo19840b(eVar8.f16698c, f2.f16698c);
                            eVar8.mo19845g();
                        }
                    }
                    i8++;
                } else {
                    throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                }
            } else {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
        }
    }
}
