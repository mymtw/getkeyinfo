package p266v6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import p267v7.C8217e;

/* renamed from: v6.b */
public abstract class C8210b {

    /* renamed from: a */
    public static final int[] f18030a = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: b */
    public static final int[] f18031b = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};

    /* renamed from: c */
    public static final int[] f18032c = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};

    /* renamed from: d */
    public static Object f18033d = new Object();

    /* renamed from: e */
    public static int[] f18034e = null;

    /* renamed from: v6.b$a */
    public static class C8211a {

        /* renamed from: a */
        public int[] f18035a = new int[16];

        /* renamed from: b */
        public int[] f18036b = new int[16];

        /* renamed from: c */
        public int[] f18037c = new int[16];
    }

    static {
        C8217e.m16512d("SigEd448");
    }

    /* renamed from: a */
    public static C8211a m16490a(C8211a aVar) {
        C8211a aVar2 = new C8211a();
        C3039b.m7174m(0, aVar.f18035a, aVar2.f18035a);
        C3039b.m7174m(0, aVar.f18036b, aVar2.f18036b);
        C3039b.m7174m(0, aVar.f18037c, aVar2.f18037c);
        return aVar2;
    }

    /* renamed from: b */
    public static void m16491b(boolean z, C8211a aVar, C8211a aVar2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        if (z) {
            C3039b.m7171k0(aVar.f18036b, aVar.f18035a, iArr12);
            iArr2 = iArr6;
            iArr3 = iArr9;
            iArr4 = iArr10;
            iArr = iArr11;
        } else {
            C3039b.m7182r(aVar.f18036b, aVar.f18035a, iArr12);
            iArr3 = iArr6;
            iArr2 = iArr9;
            iArr = iArr10;
            iArr4 = iArr11;
        }
        C3039b.m7145O(aVar.f18037c, aVar2.f18037c, iArr5);
        C3039b.m7158b0(iArr5, iArr6);
        C3039b.m7145O(aVar.f18035a, aVar2.f18035a, iArr7);
        C3039b.m7145O(aVar.f18036b, aVar2.f18036b, iArr8);
        C3039b.m7145O(iArr7, iArr8, iArr9);
        C3039b.m7134C(iArr9, iArr9);
        C3039b.m7182r(iArr6, iArr9, iArr);
        C3039b.m7171k0(iArr6, iArr9, iArr4);
        C3039b.m7182r(aVar2.f18035a, aVar2.f18036b, iArr9);
        C3039b.m7145O(iArr12, iArr9, iArr12);
        C3039b.m7182r(iArr8, iArr7, iArr3);
        C3039b.m7171k0(iArr8, iArr7, iArr2);
        C3039b.m7144N(iArr3);
        C3039b.m7171k0(iArr12, iArr6, iArr12);
        C3039b.m7145O(iArr12, iArr5, iArr12);
        C3039b.m7145O(iArr9, iArr5, iArr9);
        C3039b.m7145O(iArr10, iArr12, aVar2.f18035a);
        C3039b.m7145O(iArr9, iArr11, aVar2.f18036b);
        C3039b.m7145O(iArr10, iArr11, aVar2.f18037c);
    }

    /* renamed from: c */
    public static void m16492c(byte[] bArr, C8211a aVar) {
        int i;
        int i2;
        int i3;
        C8211a aVar2 = aVar;
        synchronized (f18033d) {
            try {
                int i4 = 8;
                int i5 = 5;
                int i6 = 4;
                i = 0;
                i2 = 16;
                i3 = 1;
                if (f18034e == null) {
                    C8211a aVar3 = new C8211a();
                    C3039b.m7174m(0, f18031b, aVar3.f18035a);
                    C3039b.m7174m(0, f18032c, aVar3.f18036b);
                    int[] iArr = aVar3.f18037c;
                    iArr[0] = 1;
                    for (int i7 = 1; i7 < 16; i7++) {
                        iArr[i7] = 0;
                    }
                    C8211a a = m16490a(aVar3);
                    m16493d(a);
                    C8211a[] aVarArr = new C8211a[32];
                    aVarArr[0] = m16490a(aVar3);
                    for (int i8 = 1; i8 < 32; i8++) {
                        C8211a a2 = m16490a(aVarArr[i8 - 1]);
                        aVarArr[i8] = a2;
                        m16491b(false, a, a2);
                    }
                    f18034e = new int[2560];
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < i5) {
                        C8211a[] aVarArr2 = new C8211a[i5];
                        C8211a aVar4 = new C8211a();
                        int[] iArr2 = aVar4.f18035a;
                        for (int i11 = 0; i11 < 16; i11++) {
                            iArr2[i11] = 0;
                        }
                        int[] iArr3 = aVar4.f18036b;
                        iArr3[0] = 1;
                        for (int i12 = 1; i12 < 16; i12++) {
                            iArr3[i12] = 0;
                        }
                        int[] iArr4 = aVar4.f18037c;
                        iArr4[0] = 1;
                        for (int i13 = 1; i13 < 16; i13++) {
                            iArr4[i13] = 0;
                        }
                        for (int i14 = 0; i14 < i5; i14++) {
                            m16491b(true, aVar3, aVar4);
                            m16493d(aVar3);
                            aVarArr2[i14] = m16490a(aVar3);
                            if (i9 + i14 != i4) {
                                for (int i15 = 1; i15 < 18; i15++) {
                                    m16493d(aVar3);
                                }
                            }
                        }
                        C8211a[] aVarArr3 = new C8211a[16];
                        aVarArr3[0] = aVar4;
                        int i16 = 0;
                        int i17 = 1;
                        while (i16 < i6) {
                            int i18 = 1 << i16;
                            int i19 = 0;
                            while (i19 < i18) {
                                C8211a a3 = m16490a(aVarArr3[i17 - i18]);
                                aVarArr3[i17] = a3;
                                m16491b(false, aVarArr2[i16], a3);
                                i19++;
                                i17++;
                            }
                            i16++;
                            i6 = 4;
                        }
                        for (int i20 = 0; i20 < 16; i20++) {
                            C8211a aVar5 = aVarArr3[i20];
                            int[] iArr5 = aVar5.f18037c;
                            C3039b.m7181q(iArr5, iArr5);
                            int[] iArr6 = aVar5.f18035a;
                            C3039b.m7145O(iArr6, aVar5.f18037c, iArr6);
                            int[] iArr7 = aVar5.f18036b;
                            C3039b.m7145O(iArr7, aVar5.f18037c, iArr7);
                            C3039b.m7174m(i10, aVar5.f18035a, f18034e);
                            int i21 = i10 + 16;
                            C3039b.m7174m(i21, aVar5.f18036b, f18034e);
                            i10 = i21 + 16;
                        }
                        i9++;
                        i4 = 8;
                        i5 = 5;
                        i6 = 4;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        int[] iArr8 = aVar2.f18035a;
        for (int i22 = 0; i22 < 16; i22++) {
            iArr8[i22] = 0;
        }
        int[] iArr9 = aVar2.f18036b;
        iArr9[0] = 1;
        for (int i23 = 1; i23 < 16; i23++) {
            iArr9[i23] = 0;
        }
        int[] iArr10 = aVar2.f18037c;
        iArr10[0] = 1;
        for (int i24 = 1; i24 < 16; i24++) {
            iArr10[i24] = 0;
        }
        int i25 = 15;
        int[] iArr11 = new int[15];
        for (int i26 = 0; i26 < 14; i26++) {
            int i27 = (i26 * 4) + 0;
            int i28 = i27 + 1;
            int i29 = i28 + 1;
            iArr11[0 + i26] = (bArr[i29 + 1] << 24) | (bArr[i27] & 255) | ((bArr[i28] & 255) << 8) | ((bArr[i29] & 255) << 16);
        }
        iArr11[14] = C2606m.m6132a(14, (~iArr11[0]) & 1, iArr11, f18030a, iArr11) + 4;
        C2606m.m6118M(15, iArr11, 0);
        int[] iArr12 = new int[16];
        int[] iArr13 = new int[16];
        int i30 = 17;
        while (true) {
            int i31 = i30;
            int i32 = i;
            while (i32 < 5) {
                int i33 = i;
                int i34 = i33;
                while (i33 < 5) {
                    i34 = (i34 & (~(i3 << i33))) ^ ((iArr11[i31 >>> 5] >>> (i31 & 31)) << i33);
                    i31 += 18;
                    i33++;
                }
                int i35 = (i34 >>> 4) & i3;
                int i36 = (i34 ^ (-i35)) & i25;
                int i37 = i32 * 16 * 2 * i2;
                for (int i38 = i; i38 < i2; i38++) {
                    int i39 = ((i38 ^ i36) - 1) >> 31;
                    C2606m.m6141g(i2, i39, i37, f18034e, iArr12);
                    int i40 = i37 + i2;
                    C2606m.m6141g(i2, i39, i40, f18034e, iArr13);
                    i37 = i40 + i2;
                }
                int[] iArr14 = new int[i2];
                C3039b.m7171k0(iArr14, iArr12, iArr14);
                C2606m.m6141g(i2, i35, i, iArr14, iArr12);
                int[] iArr15 = new int[i2];
                int[] iArr16 = new int[i2];
                int[] iArr17 = new int[i2];
                int[] iArr18 = new int[i2];
                int[] iArr19 = new int[i2];
                int[] iArr20 = new int[i2];
                int[] iArr21 = new int[i2];
                C3039b.m7158b0(aVar2.f18037c, iArr15);
                C3039b.m7145O(iArr12, aVar2.f18035a, iArr16);
                C3039b.m7145O(iArr13, aVar2.f18036b, iArr17);
                C3039b.m7145O(iArr16, iArr17, iArr18);
                C3039b.m7134C(iArr18, iArr18);
                C3039b.m7182r(iArr15, iArr18, iArr19);
                C3039b.m7171k0(iArr15, iArr18, iArr20);
                C3039b.m7182r(iArr12, iArr13, iArr15);
                C3039b.m7182r(aVar2.f18035a, aVar2.f18036b, iArr18);
                C3039b.m7145O(iArr15, iArr18, iArr21);
                C3039b.m7182r(iArr17, iArr16, iArr15);
                C3039b.m7171k0(iArr17, iArr16, iArr18);
                C3039b.m7144N(iArr15);
                C3039b.m7171k0(iArr21, iArr15, iArr21);
                C3039b.m7145O(iArr21, aVar2.f18037c, iArr21);
                C3039b.m7145O(iArr18, aVar2.f18037c, iArr18);
                C3039b.m7145O(iArr19, iArr21, aVar2.f18035a);
                C3039b.m7145O(iArr18, iArr20, aVar2.f18036b);
                C3039b.m7145O(iArr19, iArr20, aVar2.f18037c);
                i32++;
                i25 = 15;
                i = 0;
                i2 = 16;
                i3 = 1;
            }
            i30--;
            if (i30 >= 0) {
                m16493d(aVar);
                i25 = 15;
                i = 0;
                i2 = 16;
                i3 = 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static void m16493d(C8211a aVar) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        C3039b.m7182r(aVar.f18035a, aVar.f18036b, iArr);
        C3039b.m7158b0(iArr, iArr);
        C3039b.m7158b0(aVar.f18035a, iArr2);
        C3039b.m7158b0(aVar.f18036b, iArr3);
        C3039b.m7182r(iArr2, iArr3, iArr4);
        C3039b.m7144N(iArr4);
        C3039b.m7158b0(aVar.f18037c, iArr5);
        C3039b.m7182r(iArr5, iArr5, iArr5);
        C3039b.m7144N(iArr5);
        C3039b.m7171k0(iArr4, iArr5, iArr6);
        C3039b.m7171k0(iArr, iArr4, iArr);
        C3039b.m7171k0(iArr2, iArr3, iArr2);
        C3039b.m7145O(iArr, iArr6, aVar.f18035a);
        C3039b.m7145O(iArr4, iArr2, aVar.f18036b);
        C3039b.m7145O(iArr4, iArr6, aVar.f18037c);
    }
}
