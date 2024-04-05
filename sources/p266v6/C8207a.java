package p266v6;

import androidx.datastore.preferences.protobuf.C2606m;
import p267v7.C8217e;

/* renamed from: v6.a */
public abstract class C8207a {

    /* renamed from: a */
    public static final int[] f18014a = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* renamed from: b */
    public static final int[] f18015b = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* renamed from: c */
    public static final int[] f18016c = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* renamed from: d */
    public static final int[] f18017d = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* renamed from: e */
    public static final int[] f18018e = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* renamed from: f */
    public static Object f18019f = new Object();

    /* renamed from: g */
    public static int[] f18020g = null;

    /* renamed from: v6.a$a */
    public static class C8208a {

        /* renamed from: a */
        public int[] f18021a = new int[10];

        /* renamed from: b */
        public int[] f18022b = new int[10];

        /* renamed from: c */
        public int[] f18023c = new int[10];

        /* renamed from: d */
        public int[] f18024d = new int[10];

        /* renamed from: e */
        public int[] f18025e = new int[10];
    }

    /* renamed from: v6.a$b */
    public static class C8209b {

        /* renamed from: a */
        public int[] f18026a = new int[10];

        /* renamed from: b */
        public int[] f18027b = new int[10];

        /* renamed from: c */
        public int[] f18028c = new int[10];

        /* renamed from: d */
        public int[] f18029d = new int[10];
    }

    static {
        C8217e.m16512d("SigEd25519 no Ed25519 collisions");
    }

    /* renamed from: a */
    public static C8209b m16485a(C8208a aVar) {
        C8209b bVar = new C8209b();
        C2606m.m6145k(0, aVar.f18021a, bVar.f18026a);
        C2606m.m6145k(0, aVar.f18022b, bVar.f18027b);
        C2606m.m6145k(0, aVar.f18023c, bVar.f18028c);
        C2606m.m6109D(aVar.f18024d, aVar.f18025e, bVar.f18029d);
        return bVar;
    }

    /* renamed from: b */
    public static void m16486b(C8209b bVar) {
        C8209b bVar2 = new C8209b();
        m16487c(false, bVar, bVar, bVar2);
        C8209b[] bVarArr = new C8209b[32];
        C8209b bVar3 = new C8209b();
        C2606m.m6145k(0, bVar.f18026a, bVar3.f18026a);
        C2606m.m6145k(0, bVar.f18027b, bVar3.f18027b);
        C2606m.m6145k(0, bVar.f18028c, bVar3.f18028c);
        C2606m.m6145k(0, bVar.f18029d, bVar3.f18029d);
        bVarArr[0] = bVar3;
        for (int i = 1; i < 32; i++) {
            C8209b bVar4 = bVarArr[i - 1];
            C8209b bVar5 = new C8209b();
            bVarArr[i] = bVar5;
            m16487c(false, bVar4, bVar2, bVar5);
        }
    }

    /* renamed from: c */
    public static void m16487c(boolean z, C8209b bVar, C8209b bVar2, C8209b bVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        C8209b bVar4 = bVar;
        C8209b bVar5 = bVar2;
        C8209b bVar6 = bVar3;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        int[] iArr11 = new int[10];
        int[] iArr12 = new int[10];
        if (z) {
            iArr4 = iArr7;
            iArr3 = iArr8;
            iArr2 = iArr10;
            iArr = iArr11;
        } else {
            iArr3 = iArr7;
            iArr4 = iArr8;
            iArr = iArr10;
            iArr2 = iArr11;
        }
        C2606m.m6150p(bVar4.f18027b, bVar4.f18026a, iArr6, iArr5);
        C2606m.m6150p(bVar5.f18027b, bVar5.f18026a, iArr4, iArr3);
        C2606m.m6109D(iArr5, iArr7, iArr5);
        C2606m.m6109D(iArr6, iArr8, iArr6);
        C2606m.m6109D(bVar4.f18029d, bVar5.f18029d, iArr7);
        C2606m.m6109D(iArr7, f18017d, iArr7);
        C2606m.m6109D(bVar4.f18028c, bVar5.f18028c, iArr8);
        C2606m.m6149o(iArr8, iArr8, iArr8);
        C2606m.m6150p(iArr6, iArr5, iArr12, iArr9);
        C2606m.m6150p(iArr8, iArr7, iArr2, iArr);
        C2606m.m6108C(iArr2);
        C2606m.m6109D(iArr9, iArr10, bVar6.f18026a);
        int[] iArr13 = iArr11;
        C2606m.m6109D(iArr13, iArr12, bVar6.f18027b);
        C2606m.m6109D(iArr10, iArr13, bVar6.f18028c);
        C2606m.m6109D(iArr9, iArr12, bVar6.f18029d);
    }

    /* renamed from: d */
    public static void m16488d(byte[] bArr, C8208a aVar) {
        int i;
        int i2;
        C8208a aVar2 = aVar;
        synchronized (f18019f) {
            try {
                int i3 = 3;
                i = 0;
                i2 = 8;
                int i4 = 10;
                boolean z = true;
                if (f18020g == null) {
                    C8209b bVar = new C8209b();
                    int[] iArr = f18015b;
                    C2606m.m6145k(0, iArr, bVar.f18026a);
                    int[] iArr2 = f18016c;
                    C2606m.m6145k(0, iArr2, bVar.f18027b);
                    C2606m.m6133a0(bVar.f18028c);
                    C2606m.m6109D(bVar.f18026a, bVar.f18027b, bVar.f18029d);
                    m16486b(bVar);
                    C8208a aVar3 = new C8208a();
                    C2606m.m6145k(0, iArr, aVar3.f18021a);
                    C2606m.m6145k(0, iArr2, aVar3.f18022b);
                    C2606m.m6133a0(aVar3.f18023c);
                    C2606m.m6145k(0, aVar3.f18021a, aVar3.f18024d);
                    C2606m.m6145k(0, aVar3.f18022b, aVar3.f18025e);
                    f18020g = new int[1920];
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < 8) {
                        C8209b[] bVarArr = new C8209b[4];
                        C8209b bVar2 = new C8209b();
                        int[] iArr3 = bVar2.f18026a;
                        for (int i7 = 0; i7 < i4; i7++) {
                            iArr3[i7] = 0;
                        }
                        C2606m.m6133a0(bVar2.f18027b);
                        C2606m.m6133a0(bVar2.f18028c);
                        int[] iArr4 = bVar2.f18029d;
                        for (int i8 = 0; i8 < i4; i8++) {
                            iArr4[i8] = 0;
                        }
                        for (int i9 = 0; i9 < 4; i9++) {
                            m16487c(z, bVar2, m16485a(aVar3), bVar2);
                            m16489e(aVar3);
                            bVarArr[i9] = m16485a(aVar3);
                            if (i5 + i9 != i4) {
                                for (int i10 = z; i10 < 8; i10++) {
                                    m16489e(aVar3);
                                }
                            }
                        }
                        C8209b[] bVarArr2 = new C8209b[8];
                        bVarArr2[0] = bVar2;
                        int i11 = 0;
                        int i12 = z;
                        while (i11 < i3) {
                            int i13 = (z ? 1 : 0) << i11;
                            int i14 = 0;
                            while (i14 < i13) {
                                C8209b bVar3 = bVarArr2[i12 - i13];
                                C8209b bVar4 = bVarArr[i11];
                                C8209b bVar5 = new C8209b();
                                bVarArr2[i12] = bVar5;
                                m16487c(false, bVar3, bVar4, bVar5);
                                i14++;
                                i12++;
                            }
                            i11++;
                            i3 = 3;
                            z = true;
                        }
                        for (int i15 = 0; i15 < 8; i15++) {
                            C8209b bVar6 = bVarArr2[i15];
                            int[] iArr5 = new int[10];
                            int[] iArr6 = new int[10];
                            int[] iArr7 = bVar6.f18028c;
                            C2606m.m6149o(iArr7, iArr7, iArr5);
                            C2606m.m6157w(iArr5, iArr6);
                            C2606m.m6109D(bVar6.f18026a, iArr6, iArr5);
                            C2606m.m6109D(bVar6.f18027b, iArr6, iArr6);
                            int[] iArr8 = new int[10];
                            int[] iArr9 = new int[10];
                            int[] iArr10 = new int[10];
                            C2606m.m6150p(iArr6, iArr5, iArr8, iArr9);
                            C2606m.m6109D(iArr5, iArr6, iArr10);
                            C2606m.m6109D(iArr10, f18018e, iArr10);
                            C2606m.m6127V(iArr8);
                            C2606m.m6127V(iArr9);
                            C2606m.m6145k(i6, iArr8, f18020g);
                            int i16 = i6 + 10;
                            C2606m.m6145k(i16, iArr9, f18020g);
                            int i17 = i16 + 10;
                            C2606m.m6145k(i17, iArr10, f18020g);
                            i6 = i17 + 10;
                        }
                        i5++;
                        i3 = 3;
                        i4 = 10;
                        z = true;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        int[] iArr11 = aVar2.f18021a;
        for (int i18 = 0; i18 < 10; i18++) {
            iArr11[i18] = 0;
        }
        C2606m.m6133a0(aVar2.f18022b);
        C2606m.m6133a0(aVar2.f18023c);
        int[] iArr12 = aVar2.f18024d;
        for (int i19 = 0; i19 < 10; i19++) {
            iArr12[i19] = 0;
        }
        C2606m.m6133a0(aVar2.f18025e);
        int[] iArr13 = new int[8];
        for (int i20 = 0; i20 < 8; i20++) {
            int i21 = (i20 * 4) + 0;
            int i22 = i21 + 1;
            int i23 = i22 + 1;
            iArr13[0 + i20] = (bArr[i23 + 1] << 24) | (bArr[i21] & 255) | ((bArr[i22] & 255) << 8) | ((bArr[i23] & 255) << 16);
        }
        C2606m.m6132a(8, (~iArr13[0]) & 1, iArr13, f18014a, iArr13);
        C2606m.m6118M(8, iArr13, 1);
        for (int i24 = 0; i24 < 8; i24++) {
            int i25 = iArr13[i24];
            int i26 = ((i25 >>> 7) ^ i25) & 11141290;
            int i27 = i25 ^ (i26 ^ (i26 << 7));
            int i28 = ((i27 >>> 14) ^ i27) & 52428;
            int i29 = i27 ^ (i28 ^ (i28 << 14));
            int i30 = ((i29 >>> 4) ^ i29) & 15728880;
            int i31 = i29 ^ (i30 ^ (i30 << 4));
            int i32 = ((i31 >>> 8) ^ i31) & 65280;
            iArr13[i24] = i31 ^ (i32 ^ (i32 << 8));
        }
        int[] iArr14 = new int[10];
        int[] iArr15 = new int[10];
        int[] iArr16 = new int[10];
        int i33 = 28;
        while (true) {
            int i34 = i;
            while (i34 < i2) {
                int i35 = iArr13[i34] >>> i33;
                int i36 = (i35 >>> 3) & 1;
                int i37 = (i35 ^ (-i36)) & 7;
                int i38 = 10;
                int i39 = i34 * 8 * 3 * 10;
                int i40 = i;
                while (i40 < i2) {
                    int i41 = ((i40 ^ i37) - 1) >> 31;
                    C2606m.m6141g(10, i41, i39, f18020g, iArr14);
                    int i42 = i39 + 10;
                    C2606m.m6141g(10, i41, i42, f18020g, iArr15);
                    int i43 = i42 + 10;
                    C2606m.m6141g(10, i41, i43, f18020g, iArr16);
                    i39 = i43 + 10;
                    i40++;
                    i2 = 8;
                }
                int i44 = 0 - i36;
                int i45 = 0;
                while (i45 < i38) {
                    int i46 = iArr14[i45];
                    int i47 = iArr15[i45];
                    int i48 = (i46 ^ i47) & i44;
                    iArr14[i45] = i46 ^ i48;
                    iArr15[i45] = i47 ^ i48;
                    i45++;
                    i38 = 10;
                }
                int i49 = i38;
                for (int i50 = 0; i50 < i49; i50++) {
                    iArr16[i50] = (iArr16[i50] ^ i44) - i44;
                }
                int[] iArr17 = new int[i49];
                int[] iArr18 = new int[i49];
                int[] iArr19 = new int[i49];
                int[] iArr20 = aVar2.f18024d;
                int[] iArr21 = new int[i49];
                int[] iArr22 = new int[i49];
                int[] iArr23 = aVar2.f18025e;
                C2606m.m6150p(aVar2.f18022b, aVar2.f18021a, iArr18, iArr17);
                C2606m.m6109D(iArr17, iArr15, iArr17);
                C2606m.m6109D(iArr18, iArr14, iArr18);
                C2606m.m6109D(aVar2.f18024d, aVar2.f18025e, iArr19);
                C2606m.m6109D(iArr19, iArr16, iArr19);
                C2606m.m6150p(iArr18, iArr17, iArr23, iArr20);
                C2606m.m6150p(aVar2.f18023c, iArr19, iArr22, iArr21);
                C2606m.m6108C(iArr22);
                C2606m.m6109D(iArr20, iArr21, aVar2.f18021a);
                C2606m.m6109D(iArr22, iArr23, aVar2.f18022b);
                C2606m.m6109D(iArr21, iArr22, aVar2.f18023c);
                i34++;
                i = 0;
                i2 = 8;
            }
            i33 -= 4;
            if (i33 >= 0) {
                m16489e(aVar);
                i = 0;
                i2 = 8;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m16489e(C8208a aVar) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = aVar.f18024d;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = aVar.f18025e;
        C2606m.m6119N(aVar.f18021a, iArr);
        C2606m.m6119N(aVar.f18022b, iArr2);
        C2606m.m6119N(aVar.f18023c, iArr3);
        C2606m.m6149o(iArr3, iArr3, iArr3);
        C2606m.m6150p(iArr, iArr2, iArr7, iArr6);
        C2606m.m6149o(aVar.f18021a, aVar.f18022b, iArr4);
        C2606m.m6119N(iArr4, iArr4);
        for (int i = 0; i < 10; i++) {
            iArr4[i] = iArr7[i] - iArr4[i];
        }
        C2606m.m6149o(iArr3, iArr6, iArr5);
        C2606m.m6108C(iArr5);
        C2606m.m6109D(iArr4, iArr5, aVar.f18021a);
        C2606m.m6109D(iArr6, iArr7, aVar.f18022b);
        C2606m.m6109D(iArr5, iArr6, aVar.f18023c);
    }
}
