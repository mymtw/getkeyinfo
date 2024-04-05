package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p184n0.C7361b;
import p184n0.C7367f;

/* renamed from: androidx.constraintlayout.motion.widget.h */
public abstract class C2123h {

    /* renamed from: a */
    public C2126c f4833a;

    /* renamed from: b */
    public ConstraintAttribute f4834b;

    /* renamed from: c */
    public String f4835c;

    /* renamed from: d */
    public int f4836d = 0;

    /* renamed from: e */
    public int f4837e = 0;

    /* renamed from: f */
    public ArrayList<C2138o> f4838f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.h$a */
    public static class C2124a extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setAlpha(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$b */
    public static class C2125b extends C2123h {

        /* renamed from: g */
        public float[] f4839g = new float[1];

        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            this.f4839g[0] = mo8142a(f);
            this.f4834b.mo8405g(view, this.f4839g);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$c */
    public static class C2126c {

        /* renamed from: a */
        public C7367f f4840a = new C7367f();

        /* renamed from: b */
        public float[] f4841b;

        /* renamed from: c */
        public double[] f4842c;

        /* renamed from: d */
        public float[] f4843d;

        /* renamed from: e */
        public float[] f4844e;

        /* renamed from: f */
        public C7361b f4845f;

        /* renamed from: g */
        public double[] f4846g;

        /* renamed from: h */
        public double[] f4847h;

        public C2126c(int i, int i2) {
            new HashMap();
            this.f4840a.f16423d = i;
            this.f4841b = new float[i2];
            this.f4842c = new double[i2];
            this.f4843d = new float[i2];
            this.f4844e = new float[i2];
            float[] fArr = new float[i2];
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$d */
    public static class C2127d extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setElevation(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$e */
    public static class C2128e extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$f */
    public static class C2129f extends C2123h {

        /* renamed from: g */
        public boolean f4848g = false;

        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo8142a(f));
            } else if (!this.f4848g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f4848g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo8142a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$g */
    public static class C2130g extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setRotation(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$h */
    public static class C2131h extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setRotationX(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$i */
    public static class C2132i extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setRotationY(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$j */
    public static class C2133j extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setScaleX(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$k */
    public static class C2134k extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setScaleY(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$l */
    public static class C2135l extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setTranslationX(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$m */
    public static class C2136m extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setTranslationY(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$n */
    public static class C2137n extends C2123h {
        /* renamed from: c */
        public final void mo8144c(float f, View view) {
            view.setTranslationZ(mo8142a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.h$o */
    public static class C2138o {

        /* renamed from: a */
        public int f4849a;

        /* renamed from: b */
        public float f4850b;

        /* renamed from: c */
        public float f4851c;

        /* renamed from: d */
        public float f4852d;

        public C2138o(int i, float f, float f2, float f3) {
            this.f4849a = i;
            this.f4850b = f3;
            this.f4851c = f2;
            this.f4852d = f;
        }
    }

    /* renamed from: a */
    public final float mo8142a(float f) {
        C2126c cVar = this.f4833a;
        C7361b bVar = cVar.f4845f;
        if (bVar != null) {
            bVar.mo19648c((double) f, cVar.f4846g);
        } else {
            double[] dArr = cVar.f4846g;
            dArr[0] = (double) cVar.f4844e[0];
            dArr[1] = (double) cVar.f4841b[0];
        }
        return (float) ((cVar.f4840a.mo19662d((double) f) * cVar.f4846g[1]) + cVar.f4846g[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
        r6 = r6 * r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        r6 = r6 * r8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo8143b(float r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.constraintlayout.motion.widget.h$c r2 = r0.f4833a
            n0.b r3 = r2.f4845f
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x001c
            double r8 = (double) r1
            double[] r10 = r2.f4847h
            r3.mo19651f(r8, r10)
            n0.b r3 = r2.f4845f
            double[] r10 = r2.f4846g
            r3.mo19648c(r8, r10)
            goto L_0x0022
        L_0x001c:
            double[] r3 = r2.f4847h
            r3[r4] = r6
            r3[r5] = r6
        L_0x0022:
            n0.f r3 = r2.f4840a
            double r8 = (double) r1
            double r10 = r3.mo19662d(r8)
            n0.f r1 = r2.f4840a
            int r3 = r1.f16423d
            r12 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            r16 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r3) {
                case 1: goto L_0x0090;
                case 2: goto L_0x0079;
                case 3: goto L_0x0073;
                case 4: goto L_0x006d;
                case 5: goto L_0x0059;
                case 6: goto L_0x0048;
                default: goto L_0x0039;
            }
        L_0x0039:
            double r6 = r1.mo19660b(r8)
            double r6 = r6 * r12
            double r8 = r1.mo19661c(r8)
            double r8 = r8 * r12
            double r8 = java.lang.Math.cos(r8)
            goto L_0x008f
        L_0x0048:
            double r6 = r1.mo19660b(r8)
            double r6 = r6 * r16
            double r8 = r1.mo19661c(r8)
            double r8 = r8 * r16
            double r8 = r8 + r14
            double r8 = r8 % r16
            double r8 = r8 - r14
            goto L_0x008f
        L_0x0059:
            r6 = -4604611780675359464(0xc01921fb54442d18, double:-6.283185307179586)
            double r14 = r1.mo19660b(r8)
            double r14 = r14 * r6
            double r6 = r1.mo19661c(r8)
            double r6 = r6 * r12
            double r6 = java.lang.Math.sin(r6)
            goto L_0x0077
        L_0x006d:
            double r6 = r1.mo19660b(r8)
            double r6 = -r6
            goto L_0x0077
        L_0x0073:
            double r6 = r1.mo19660b(r8)
        L_0x0077:
            double r6 = r6 * r14
            goto L_0x0090
        L_0x0079:
            double r6 = r1.mo19660b(r8)
            double r6 = r6 * r16
            double r8 = r1.mo19661c(r8)
            double r8 = r8 * r16
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r8 = r8 + r12
            double r8 = r8 % r16
            double r8 = r8 - r14
            double r8 = java.lang.Math.signum(r8)
        L_0x008f:
            double r6 = r6 * r8
        L_0x0090:
            double[] r1 = r2.f4847h
            r3 = r1[r4]
            r8 = r1[r5]
            double r10 = r10 * r8
            double r10 = r10 + r3
            double[] r1 = r2.f4846g
            r2 = r1[r5]
            double r6 = r6 * r2
            double r6 = r6 + r10
            float r1 = (float) r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C2123h.mo8143b(float):float");
    }

    /* renamed from: c */
    public abstract void mo8144c(float f, View view);

    @TargetApi(19)
    /* renamed from: d */
    public final void mo8145d() {
        int i;
        int size = this.f4838f.size();
        if (size != 0) {
            Collections.sort(this.f4838f, new C2122g());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f4833a = new C2126c(this.f4836d, size);
            Iterator<C2138o> it = this.f4838f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C2138o next = it.next();
                float f = next.f4852d;
                dArr[i2] = ((double) f) * 0.01d;
                double[] dArr3 = dArr2[i2];
                float f2 = next.f4850b;
                dArr3[0] = (double) f2;
                float f3 = next.f4851c;
                dArr3[1] = (double) f3;
                C2126c cVar = this.f4833a;
                cVar.f4842c[i2] = ((double) next.f4849a) / 100.0d;
                cVar.f4843d[i2] = f;
                cVar.f4844e[i2] = f3;
                cVar.f4841b[i2] = f2;
                i2++;
            }
            C2126c cVar2 = this.f4833a;
            int length = cVar2.f4842c.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[0] = length;
            double[][] dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            float[] fArr = cVar2.f4841b;
            cVar2.f4846g = new double[(fArr.length + 1)];
            cVar2.f4847h = new double[(fArr.length + 1)];
            if (cVar2.f4842c[0] > ShadowDrawableWrapper.COS_45) {
                cVar2.f4840a.mo19659a(ShadowDrawableWrapper.COS_45, cVar2.f4843d[0]);
            }
            double[] dArr5 = cVar2.f4842c;
            int length2 = dArr5.length - 1;
            if (dArr5[length2] < 1.0d) {
                cVar2.f4840a.mo19659a(1.0d, cVar2.f4843d[length2]);
            }
            for (int i3 = 0; i3 < dArr4.length; i3++) {
                dArr4[i3][0] = (double) cVar2.f4844e[i3];
                int i4 = 0;
                while (true) {
                    float[] fArr2 = cVar2.f4841b;
                    if (i4 >= fArr2.length) {
                        break;
                    }
                    dArr4[i4][1] = (double) fArr2[i4];
                    i4++;
                }
                cVar2.f4840a.mo19659a(cVar2.f4842c[i3], cVar2.f4843d[i3]);
            }
            C7367f fVar = cVar2.f4840a;
            int i5 = 0;
            double d = 0.0d;
            while (true) {
                float[] fArr3 = fVar.f16420a;
                if (i5 >= fArr3.length) {
                    break;
                }
                d += (double) fArr3[i5];
                i5++;
            }
            int i6 = 1;
            double d2 = 0.0d;
            while (true) {
                float[] fArr4 = fVar.f16420a;
                if (i6 >= fArr4.length) {
                    break;
                }
                int i7 = i6 - 1;
                double[] dArr6 = fVar.f16421b;
                d2 = ((dArr6[i6] - dArr6[i7]) * ((double) ((fArr4[i7] + fArr4[i6]) / 2.0f))) + d2;
                i6++;
            }
            int i8 = 0;
            while (true) {
                float[] fArr5 = fVar.f16420a;
                if (i8 >= fArr5.length) {
                    break;
                }
                fArr5[i8] = (float) (((double) fArr5[i8]) * (d / d2));
                i8++;
            }
            fVar.f16422c[0] = 0.0d;
            int i9 = 1;
            while (true) {
                float[] fArr6 = fVar.f16420a;
                if (i9 >= fArr6.length) {
                    break;
                }
                int i10 = i9 - 1;
                double[] dArr7 = fVar.f16421b;
                double d3 = dArr7[i9] - dArr7[i10];
                double[] dArr8 = fVar.f16422c;
                dArr8[i9] = (d3 * ((double) ((fArr6[i10] + fArr6[i9]) / 2.0f))) + dArr8[i10];
                i9++;
            }
            double[] dArr9 = cVar2.f4842c;
            if (dArr9.length > 1) {
                i = 0;
                cVar2.f4845f = C7361b.m14167a(0, dArr9, dArr4);
            } else {
                i = 0;
                cVar2.f4845f = null;
            }
            C7361b.m14167a(i, dArr, dArr2);
        }
    }

    public final String toString() {
        String str = this.f4835c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C2138o> it = this.f4838f.iterator();
        while (it.hasNext()) {
            C2138o next = it.next();
            StringBuilder k = C0073e.m211k(str, "[");
            k.append(next.f4849a);
            k.append(" , ");
            k.append(decimalFormat.format((double) next.f4850b));
            k.append("] ");
            str = k.toString();
        }
        return str;
    }
}
