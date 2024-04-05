package com.google.android.exoplayer2.source.hls;

import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.source.hls.d */
public final class C14311d implements C14320h {

    /* renamed from: b */
    public static final int[] f31865b = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a */
    public static void m22477a(int i, ArrayList arrayList) {
        int[] iArr = f31865b;
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }
}
