package p691un;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: un.c */
public final class C18628c {

    /* renamed from: b */
    public static final String[] f41130b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    public static final int[][] f41131c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    public static final int[][] f41132d;

    /* renamed from: e */
    public static final int[][] f41133e;

    /* renamed from: a */
    public final byte[] f41134a;

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 256});
        f41132d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f41132d[0][i] = (i - 65) + 2;
        }
        f41132d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f41132d[1][i2] = (i2 - 97) + 2;
        }
        f41132d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f41132d[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = f41132d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f41132d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f41132d[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6});
        f41133e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f41133e;
        iArr6[0][4] = 0;
        int[] iArr7 = iArr6[1];
        iArr7[4] = 0;
        iArr7[0] = 28;
        iArr6[3][4] = 0;
        int[] iArr8 = iArr6[2];
        iArr8[4] = 0;
        iArr8[0] = 15;
    }

    public C18628c(byte[] bArr) {
        this.f41134a = bArr;
    }

    /* renamed from: a */
    public static LinkedList m31414a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C18630e eVar = (C18630e) it.next();
            boolean z = true;
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C18630e eVar2 = (C18630e) it2.next();
                if (eVar2.mo70141c(eVar)) {
                    z = false;
                    break;
                } else if (eVar.mo70141c(eVar2)) {
                    it2.remove();
                }
            }
            if (z) {
                linkedList2.add(eVar);
            }
        }
        return linkedList2;
    }
}
