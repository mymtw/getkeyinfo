package androidx.constraintlayout.motion.widget;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import p184n0.C7361b;

/* renamed from: androidx.constraintlayout.motion.widget.s */
public abstract class C2170s {

    /* renamed from: a */
    public C7361b f5011a;

    /* renamed from: b */
    public int f5012b = 0;

    /* renamed from: c */
    public int[] f5013c = new int[10];

    /* renamed from: d */
    public float[][] f5014d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e */
    public int f5015e;

    /* renamed from: f */
    public String f5016f;

    /* renamed from: g */
    public float[] f5017g = new float[3];

    /* renamed from: h */
    public boolean f5018h = false;

    /* renamed from: i */
    public long f5019i;

    /* renamed from: j */
    public float f5020j = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    public static class C2171a extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setAlpha(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    public static class C2172b extends C2170s {

        /* renamed from: k */
        public String f5021k;

        /* renamed from: l */
        public SparseArray<ConstraintAttribute> f5022l;

        /* renamed from: m */
        public SparseArray<float[]> f5023m = new SparseArray<>();

        /* renamed from: n */
        public float[] f5024n;

        /* renamed from: o */
        public float[] f5025o;

        public C2172b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f5021k = str.split(",")[1];
            this.f5022l = sparseArray;
        }

        /* renamed from: c */
        public final void mo8186c(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            this.f5011a.mo19649d((double) f, this.f5024n);
            float[] fArr = this.f5024n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f5019i;
            if (Float.isNaN(this.f5020j)) {
                float a = eVar.mo8140a(this.f5021k, view);
                this.f5020j = a;
                if (Float.isNaN(a)) {
                    this.f5020j = 0.0f;
                }
            }
            float f4 = (float) ((((((double) j2) * 1.0E-9d) * ((double) f2)) + ((double) this.f5020j)) % 1.0d);
            this.f5020j = f4;
            this.f5019i = j;
            float a2 = mo8184a(f4);
            this.f5018h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f5025o;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f5018h;
                float f5 = this.f5024n[i];
                this.f5018h = z | (((double) f5) != ShadowDrawableWrapper.COS_45);
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            this.f5022l.valueAt(0).mo8405g(view, this.f5025o);
            if (f2 != 0.0f) {
                this.f5018h = true;
            }
            return this.f5018h;
        }

        /* renamed from: e */
        public final void mo8188e(int i) {
            int size = this.f5022l.size();
            int d = this.f5022l.valueAt(0).mo8404d();
            double[] dArr = new double[size];
            int i2 = d + 2;
            this.f5024n = new float[i2];
            this.f5025o = new float[d];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f5022l.keyAt(i3);
                float[] valueAt = this.f5023m.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f5022l.valueAt(i3).mo8403c(this.f5024n);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f5024n;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                double[] dArr3 = dArr2[i3];
                dArr3[d] = (double) valueAt[0];
                dArr3[d + 1] = (double) valueAt[1];
            }
            this.f5011a = C7361b.m14167a(i, dArr, dArr2);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$c */
    public static class C2173c extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setElevation(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$d */
    public static class C2174d extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$e */
    public static class C2175e extends C2170s {

        /* renamed from: k */
        public boolean f5026k = false;

        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo8185b(f, j, view, eVar));
            } else if (this.f5026k) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f5026k = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo8185b(f, j, view, eVar))});
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$f */
    public static class C2176f extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setRotation(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$g */
    public static class C2177g extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setRotationX(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$h */
    public static class C2178h extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setRotationY(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$i */
    public static class C2179i extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setScaleX(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$j */
    public static class C2180j extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setScaleY(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$k */
    public static class C2181k extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setTranslationX(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$l */
    public static class C2182l extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setTranslationY(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$m */
    public static class C2183m extends C2170s {
        /* renamed from: d */
        public final boolean mo8187d(float f, long j, View view, C2119e eVar) {
            view.setTranslationZ(mo8185b(f, j, view, eVar));
            return this.f5018h;
        }
    }

    /* renamed from: a */
    public final float mo8184a(float f) {
        float abs;
        switch (this.f5012b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * 6.2831855f));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * 6.2831855f));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public final float mo8185b(float f, long j, View view, C2119e eVar) {
        long j2 = j;
        View view2 = view;
        C2119e eVar2 = eVar;
        this.f5011a.mo19649d((double) f, this.f5017g);
        float[] fArr = this.f5017g;
        boolean z = true;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f5018h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f5020j)) {
            float a = eVar2.mo8140a(this.f5016f, view2);
            this.f5020j = a;
            if (Float.isNaN(a)) {
                this.f5020j = 0.0f;
            }
        }
        int i2 = i;
        float f3 = (float) ((((((double) (j2 - this.f5019i)) * 1.0E-9d) * ((double) f2)) + ((double) this.f5020j)) % 1.0d);
        this.f5020j = f3;
        String str = this.f5016f;
        if (!eVar2.f4814a.containsKey(view2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f3});
            eVar2.f4814a.put(view2, hashMap);
        } else {
            HashMap hashMap2 = eVar2.f4814a.get(view2);
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f3});
                eVar2.f4814a.put(view2, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap2.put(str, fArr2);
            }
        }
        this.f5019i = j2;
        float f4 = this.f5017g[0];
        float a2 = (mo8184a(this.f5020j) * f4) + this.f5017g[2];
        if (f4 == 0.0f && i2 == 0) {
            z = false;
        }
        this.f5018h = z;
        return a2;
    }

    /* renamed from: c */
    public void mo8186c(float f, float f2, float f3, int i, int i2) {
        int[] iArr = this.f5013c;
        int i3 = this.f5015e;
        iArr[i3] = i;
        float[] fArr = this.f5014d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f5012b = Math.max(this.f5012b, i2);
        this.f5015e++;
    }

    /* renamed from: d */
    public abstract boolean mo8187d(float f, long j, View view, C2119e eVar);

    /* renamed from: e */
    public void mo8188e(int i) {
        int i2 = this.f5015e;
        if (i2 == 0) {
            StringBuilder h = C0072d.m201h("Error no points added to ");
            h.append(this.f5016f);
            Log.e("SplineSet", h.toString());
            return;
        }
        int[] iArr = this.f5013c;
        float[][] fArr = this.f5014d;
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
                        float[] fArr2 = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = fArr2;
                        i9++;
                    }
                    i8++;
                }
                int i12 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i12;
                float[] fArr3 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = fArr3;
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
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.f5013c;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] != iArr3[i16 - 1]) {
                i17++;
            }
            i16++;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        double[] dArr = new double[i17];
        int[] iArr4 = new int[2];
        iArr4[1] = 3;
        iArr4[0] = i17;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
        int i18 = 0;
        for (int i19 = 0; i19 < this.f5015e; i19++) {
            if (i19 > 0) {
                int[] iArr5 = this.f5013c;
                if (iArr5[i19] == iArr5[i19 - 1]) {
                }
            }
            dArr[i18] = ((double) this.f5013c[i19]) * 0.01d;
            double[] dArr3 = dArr2[i18];
            float[] fArr4 = this.f5014d[i19];
            dArr3[0] = (double) fArr4[0];
            dArr3[1] = (double) fArr4[1];
            dArr3[2] = (double) fArr4[2];
            i18++;
        }
        this.f5011a = C7361b.m14167a(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f5016f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f5015e; i++) {
            StringBuilder k = C0073e.m211k(str, "[");
            k.append(this.f5013c[i]);
            k.append(" , ");
            k.append(decimalFormat.format(this.f5014d[i]));
            k.append("] ");
            str = k.toString();
        }
        return str;
    }
}
