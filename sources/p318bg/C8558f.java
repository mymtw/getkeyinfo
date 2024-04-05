package p318bg;

import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import kotlin.jvm.internal.C19383o;
import p318bg.C8551a;
import p401mg.C13080a;

/* renamed from: bg.f */
public final class C8558f {
    static {
        new C8558f();
    }

    /* renamed from: a */
    public static final void m16954a(C8551a aVar, C8551a aVar2) {
        Class<C8558f> cls = C8558f.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(aVar, EtsyDialogFragment.OPT_X_BUTTON);
                C19383o.m32797g(aVar2, "b");
                int[] iArr = aVar.f18622c;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                float[] fArr = aVar.f18621b;
                float[] fArr2 = aVar2.f18621b;
                for (int i4 = 0; i4 < i; i4++) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        for (int i6 = 0; i6 < i3; i6++) {
                            int i7 = (i5 * i3) + (i4 * i2 * i3) + i6;
                            fArr[i7] = fArr[i7] + fArr2[i6];
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: b */
    public static final C8551a m16955b(C8551a[] aVarArr) {
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            int i = aVarArr[0].f18622c[0];
            int i2 = 0;
            for (C8551a aVar : aVarArr) {
                i2 += aVar.f18622c[1];
            }
            C8551a aVar2 = new C8551a(new int[]{i, i2});
            float[] fArr = aVar2.f18621b;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (C8551a aVar3 : aVarArr) {
                    float[] fArr2 = aVar3.f18621b;
                    int i5 = aVar3.f18622c[1];
                    System.arraycopy(fArr2, i3 * i5, fArr, i4, i5);
                    i4 += i5;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final C8551a m16956c(C8551a aVar, C8551a aVar2) {
        C8551a aVar3 = aVar;
        C8551a aVar4 = aVar2;
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(aVar3, EtsyDialogFragment.OPT_X_BUTTON);
            C19383o.m32797g(aVar4, "w");
            int[] iArr = aVar3.f18622c;
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int[] iArr2 = aVar4.f18622c;
            int i5 = iArr2[0];
            int i6 = (i3 - i5) + 1;
            int i7 = iArr2[2];
            C8551a aVar5 = new C8551a(new int[]{i2, i6, i7});
            float[] fArr = aVar3.f18621b;
            float[] fArr2 = aVar5.f18621b;
            float[] fArr3 = aVar4.f18621b;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i;
                while (i9 < i7) {
                    int i10 = i;
                    while (i10 < i6) {
                        float f = 0.0f;
                        while (i < i5) {
                            for (int i11 = 0; i11 < i4; i11++) {
                                f = (fArr[((i + i10) * i4) + (i3 * i4 * i8) + i11] * fArr3[(((i * i4) + i11) * i7) + i9]) + f;
                            }
                            i++;
                        }
                        fArr2[(i10 * i7) + (i6 * i7 * i8) + i9] = f;
                        i10++;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return aVar5;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final C8551a m16957d(C8551a aVar, C8551a aVar2, C8551a aVar3) {
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(aVar, EtsyDialogFragment.OPT_X_BUTTON);
            C19383o.m32797g(aVar2, "w");
            C19383o.m32797g(aVar3, "b");
            int i = aVar.f18622c[0];
            int i2 = aVar3.f18622c[0];
            C8551a h = m16961h(aVar, aVar2);
            float[] fArr = aVar3.f18621b;
            float[] fArr2 = h.f18621b;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return h;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: e */
    public static final C8551a m16958e(String[] strArr, C8551a aVar) {
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(aVar, "w");
            int length = strArr.length;
            int i = aVar.f18622c[1];
            C8551a aVar2 = new C8551a(new int[]{length, 128, i});
            float[] fArr = aVar2.f18621b;
            float[] fArr2 = aVar.f18621b;
            for (int i2 = 0; i2 < length; i2++) {
                int[] c = C8559g.f18641a.mo21080c(strArr[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, c[i3] * i, fArr, (i * i3) + (i * 128 * i2), i);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m16959f(C8551a aVar) {
        Class<C8558f> cls = C8558f.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(aVar, EtsyDialogFragment.OPT_X_BUTTON);
                int[] iArr = aVar.f18622c;
                if (1 < iArr.length) {
                    int length = iArr.length;
                    int i = 1;
                    for (int i2 = 1; i2 < length; i2++) {
                        i *= aVar.f18622c[i2];
                    }
                    int[] iArr2 = new int[2];
                    for (int i3 = 0; i3 < 1; i3++) {
                        iArr2[i3] = aVar.f18622c[i3];
                    }
                    iArr2[1] = i;
                    aVar.f18622c = iArr2;
                    int a = C8551a.C8552a.m16952a(iArr2);
                    float[] fArr = new float[a];
                    System.arraycopy(aVar.f18621b, 0, fArr, 0, Math.min(aVar.f18620a, a));
                    aVar.f18621b = fArr;
                    aVar.f18620a = a;
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: g */
    public static final C8551a m16960g(C8551a aVar, int i) {
        C8551a aVar2 = aVar;
        int i2 = i;
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(aVar2, EtsyDialogFragment.OPT_X_BUTTON);
            int[] iArr = aVar2.f18622c;
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = (i5 - i2) + 1;
            C8551a aVar3 = new C8551a(new int[]{i4, i7, i6});
            float[] fArr = aVar2.f18621b;
            float[] fArr2 = aVar3.f18621b;
            int i8 = 0;
            while (i8 < i4) {
                int i9 = i3;
                while (i9 < i6) {
                    int i10 = i3;
                    while (i10 < i7) {
                        int i11 = i10 * i6;
                        int i12 = (i8 * i7 * i6) + i11 + i9;
                        int i13 = (i8 * i5 * i6) + i11 + i9;
                        fArr2[i12] = Float.MIN_VALUE;
                        for (int i14 = i3; i14 < i2; i14++) {
                            fArr2[i12] = Math.max(fArr2[i12], fArr[(i14 * i6) + i13]);
                        }
                        i10++;
                        i3 = 0;
                    }
                    i9++;
                    i3 = 0;
                }
                i8++;
                i3 = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: h */
    public static final C8551a m16961h(C8551a aVar, C8551a aVar2) {
        C8551a aVar3 = aVar;
        C8551a aVar4 = aVar2;
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(aVar3, EtsyDialogFragment.OPT_X_BUTTON);
            C19383o.m32797g(aVar4, "w");
            int i = aVar3.f18622c[0];
            int[] iArr = aVar4.f18622c;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C8551a aVar5 = new C8551a(new int[]{i, i3});
            float[] fArr = aVar3.f18621b;
            float[] fArr2 = aVar4.f18621b;
            float[] fArr3 = aVar5.f18621b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr3[i6];
                    }
                }
            }
            return aVar5;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m16962i(C8551a aVar) {
        Class<C8558f> cls = C8558f.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(aVar, EtsyDialogFragment.OPT_X_BUTTON);
                float[] fArr = aVar.f18621b;
                int length = fArr.length;
                for (int i = 0; i < length; i++) {
                    if (fArr[i] < ((float) 0)) {
                        fArr[i] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: j */
    public static final void m16963j(C8551a aVar) {
        Class<C8558f> cls = C8558f.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(aVar, EtsyDialogFragment.OPT_X_BUTTON);
                int[] iArr = aVar.f18622c;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr = aVar.f18621b;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 * i2;
                    int i5 = i4 + i2;
                    float f = Float.MIN_VALUE;
                    float f2 = 0.0f;
                    for (int i6 = i4; i6 < i5; i6++) {
                        float f3 = fArr[i6];
                        if (f3 > f) {
                            f = f3;
                        }
                    }
                    for (int i7 = i4; i7 < i5; i7++) {
                        float exp = (float) Math.exp((double) (fArr[i7] - f));
                        fArr[i7] = exp;
                        f2 += exp;
                    }
                    while (i4 < i5) {
                        fArr[i4] = fArr[i4] / f2;
                        i4++;
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: k */
    public static final C8551a m16964k(C8551a aVar) {
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18622c;
            int i = iArr[0];
            int i2 = iArr[1];
            C8551a aVar2 = new C8551a(new int[]{i2, i});
            float[] fArr = aVar.f18621b;
            float[] fArr2 = aVar2.f18621b;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: l */
    public static final C8551a m16965l(C8551a aVar) {
        Class<C8558f> cls = C8558f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18622c;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            C8551a aVar2 = new C8551a(new int[]{i3, i2, i});
            float[] fArr = aVar.f18621b;
            float[] fArr2 = aVar2.f18621b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i5 * i) + (i6 * i * i2) + i4] = fArr[(i5 * i3) + (i4 * i2 * i3) + i6];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }
}
