package androidx.constraintlayout.motion.widget;

import android.support.p013v4.media.C0073e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import p184n0.C7361b;

/* renamed from: androidx.constraintlayout.motion.widget.r */
public abstract class C2154r {

    /* renamed from: a */
    public C7361b f5003a;

    /* renamed from: b */
    public int[] f5004b = new int[10];

    /* renamed from: c */
    public float[] f5005c = new float[10];

    /* renamed from: d */
    public int f5006d;

    /* renamed from: e */
    public String f5007e;

    /* renamed from: androidx.constraintlayout.motion.widget.r$a */
    public static class C2155a extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setAlpha(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$b */
    public static class C2156b extends C2154r {

        /* renamed from: f */
        public SparseArray<ConstraintAttribute> f5008f;

        /* renamed from: g */
        public float[] f5009g;

        public C2156b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f5008f = sparseArray;
        }

        /* renamed from: b */
        public final void mo8180b(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            this.f5003a.mo19649d((double) f, this.f5009g);
            this.f5008f.valueAt(0).mo8405g(view, this.f5009g);
        }

        /* renamed from: d */
        public final void mo8182d(int i) {
            int size = this.f5008f.size();
            int d = this.f5008f.valueAt(0).mo8404d();
            double[] dArr = new double[size];
            this.f5009g = new float[d];
            int[] iArr = new int[2];
            iArr[1] = d;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f5008f.keyAt(i2)) * 0.01d;
                this.f5008f.valueAt(i2).mo8403c(this.f5009g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f5009g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f5003a = C7361b.m14167a(i, dArr, dArr2);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$c */
    public static class C2157c extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setElevation(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$d */
    public static class C2158d extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$e */
    public static class C2159e extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setPivotX(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$f */
    public static class C2160f extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setPivotY(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$g */
    public static class C2161g extends C2154r {

        /* renamed from: f */
        public boolean f5010f = false;

        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo8179a(f));
            } else if (!this.f5010f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f5010f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo8179a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$h */
    public static class C2162h extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setRotation(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$i */
    public static class C2163i extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setRotationX(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$j */
    public static class C2164j extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setRotationY(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$k */
    public static class C2165k extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setScaleX(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$l */
    public static class C2166l extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setScaleY(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$m */
    public static class C2167m extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setTranslationX(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$n */
    public static class C2168n extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setTranslationY(mo8179a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$o */
    public static class C2169o extends C2154r {
        /* renamed from: c */
        public final void mo8181c(float f, View view) {
            view.setTranslationZ(mo8179a(f));
        }
    }

    /* renamed from: a */
    public final float mo8179a(float f) {
        return (float) this.f5003a.mo19647b((double) f);
    }

    /* renamed from: b */
    public void mo8180b(float f, int i) {
        int[] iArr = this.f5004b;
        if (iArr.length < this.f5006d + 1) {
            this.f5004b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5005c;
            this.f5005c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5004b;
        int i2 = this.f5006d;
        iArr2[i2] = i;
        this.f5005c[i2] = f;
        this.f5006d = i2 + 1;
    }

    /* renamed from: c */
    public abstract void mo8181c(float f, View view);

    /* renamed from: d */
    public void mo8182d(int i) {
        int i2 = this.f5006d;
        if (i2 != 0) {
            int[] iArr = this.f5004b;
            float[] fArr = this.f5005c;
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2 - 1;
            iArr2[1] = 0;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int i7 = iArr[i6];
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < i6) {
                        int i10 = iArr[i8];
                        if (i10 <= i7) {
                            int i11 = iArr[i9];
                            iArr[i9] = i10;
                            iArr[i8] = i11;
                            float f = fArr[i9];
                            fArr[i9] = fArr[i8];
                            fArr[i8] = f;
                            i9++;
                        }
                        i8++;
                    }
                    int i12 = iArr[i9];
                    iArr[i9] = iArr[i6];
                    iArr[i6] = i12;
                    float f2 = fArr[i9];
                    fArr[i9] = fArr[i6];
                    fArr[i6] = f2;
                    int i13 = i3 + 1;
                    iArr2[i3] = i9 - 1;
                    int i14 = i13 + 1;
                    iArr2[i13] = i5;
                    int i15 = i14 + 1;
                    iArr2[i14] = i6;
                    i3 = i15 + 1;
                    iArr2[i15] = i9 + 1;
                }
            }
            int i16 = 1;
            for (int i17 = 1; i17 < this.f5006d; i17++) {
                int[] iArr3 = this.f5004b;
                if (iArr3[i17 - 1] != iArr3[i17]) {
                    i16++;
                }
            }
            double[] dArr = new double[i16];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i16;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
            int i18 = 0;
            for (int i19 = 0; i19 < this.f5006d; i19++) {
                if (i19 > 0) {
                    int[] iArr5 = this.f5004b;
                    if (iArr5[i19] == iArr5[i19 - 1]) {
                    }
                }
                dArr[i18] = ((double) this.f5004b[i19]) * 0.01d;
                dArr2[i18][0] = (double) this.f5005c[i19];
                i18++;
            }
            this.f5003a = C7361b.m14167a(i, dArr, dArr2);
        }
    }

    public final String toString() {
        String str = this.f5007e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f5006d; i++) {
            StringBuilder k = C0073e.m211k(str, "[");
            k.append(this.f5004b[i]);
            k.append(" , ");
            k.append(decimalFormat.format((double) this.f5005c[i]));
            k.append("] ");
            str = k.toString();
        }
        return str;
    }
}
