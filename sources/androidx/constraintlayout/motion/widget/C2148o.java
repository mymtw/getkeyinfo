package androidx.constraintlayout.motion.widget;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p184n0.C7359a;
import p184n0.C7361b;
import p184n0.C7363c;

/* renamed from: androidx.constraintlayout.motion.widget.o */
public final class C2148o {

    /* renamed from: a */
    public View f4921a;

    /* renamed from: b */
    public int f4922b;

    /* renamed from: c */
    public int f4923c = -1;

    /* renamed from: d */
    public C2149p f4924d = new C2149p();

    /* renamed from: e */
    public C2149p f4925e = new C2149p();

    /* renamed from: f */
    public C2147n f4926f = new C2147n();

    /* renamed from: g */
    public C2147n f4927g = new C2147n();

    /* renamed from: h */
    public C7361b[] f4928h;

    /* renamed from: i */
    public C7359a f4929i;

    /* renamed from: j */
    public float f4930j = Float.NaN;

    /* renamed from: k */
    public float f4931k = 0.0f;

    /* renamed from: l */
    public float f4932l = 1.0f;

    /* renamed from: m */
    public int[] f4933m;

    /* renamed from: n */
    public double[] f4934n;

    /* renamed from: o */
    public double[] f4935o;

    /* renamed from: p */
    public String[] f4936p;

    /* renamed from: q */
    public int[] f4937q;

    /* renamed from: r */
    public float[] f4938r = new float[4];

    /* renamed from: s */
    public ArrayList<C2149p> f4939s = new ArrayList<>();

    /* renamed from: t */
    public float[] f4940t = new float[1];

    /* renamed from: u */
    public ArrayList<C2116c> f4941u = new ArrayList<>();

    /* renamed from: v */
    public HashMap<String, C2170s> f4942v;

    /* renamed from: w */
    public HashMap<String, C2154r> f4943w;

    /* renamed from: x */
    public HashMap<String, C2123h> f4944x;

    /* renamed from: y */
    public C2145m[] f4945y;

    /* renamed from: z */
    public int f4946z = -1;

    public C2148o(View view) {
        this.f4921a = view;
        this.f4922b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* renamed from: a */
    public final float mo8152a(float[] fArr, float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f4932l;
            if (((double) f4) != 1.0d) {
                float f5 = this.f4931k;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = (f - f5) * f4;
                }
            }
        }
        C7363c cVar = this.f4924d.f4948b;
        float f6 = Float.NaN;
        Iterator<C2149p> it = this.f4939s.iterator();
        while (it.hasNext()) {
            C2149p next = it.next();
            C7363c cVar2 = next.f4948b;
            if (cVar2 != null) {
                float f7 = next.f4950d;
                if (f7 < f) {
                    cVar = cVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f4950d;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) cVar.mo19654a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo19655b(d);
            }
        }
        return f;
    }

    /* renamed from: b */
    public final void mo8153b(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float a = mo8152a(this.f4940t, f);
        C7361b[] bVarArr = this.f4928h;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) a;
            bVarArr[0].mo19651f(d, this.f4935o);
            this.f4928h[0].mo19648c(d, this.f4934n);
            float f4 = this.f4940t[0];
            while (true) {
                dArr = this.f4935o;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            C7359a aVar = this.f4929i;
            if (aVar != null) {
                double[] dArr2 = this.f4934n;
                if (dArr2.length > 0) {
                    aVar.mo19648c(d, dArr2);
                    this.f4929i.mo19651f(d, this.f4935o);
                    C2149p pVar = this.f4924d;
                    int[] iArr = this.f4933m;
                    double[] dArr3 = this.f4935o;
                    double[] dArr4 = this.f4934n;
                    pVar.getClass();
                    C2149p.m4620f(f2, f3, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            C2149p pVar2 = this.f4924d;
            int[] iArr2 = this.f4933m;
            double[] dArr5 = this.f4934n;
            pVar2.getClass();
            C2149p.m4620f(f2, f3, fArr, iArr2, dArr, dArr5);
            return;
        }
        C2149p pVar3 = this.f4925e;
        float f5 = pVar3.f4952f;
        C2149p pVar4 = this.f4924d;
        float f6 = f5 - pVar4.f4952f;
        float f7 = pVar3.f4953g - pVar4.f4953g;
        fArr[0] = (((pVar3.f4954h - pVar4.f4954h) + f6) * f2) + ((1.0f - f2) * f6);
        fArr[1] = (((pVar3.f4955i - pVar4.f4955i) + f7) * f3) + ((1.0f - f3) * f7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03f9 A[SYNTHETIC, Splitter:B:197:0x03f9] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x046c A[SYNTHETIC, Splitter:B:210:0x046c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8154c(float r26, long r27, android.view.View r29, androidx.constraintlayout.motion.widget.C2119e r30) {
        /*
            r25 = this;
            r0 = r25
            r7 = r29
            r1 = 0
            r2 = r26
            float r8 = r0.mo8152a(r1, r2)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r2 = r0.f4943w
            if (r2 == 0) goto L_0x0027
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.r r3 = (androidx.constraintlayout.motion.widget.C2154r) r3
            r3.mo8181c(r8, r7)
            goto L_0x0017
        L_0x0027:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r2 = r0.f4942v
            r9 = 0
            if (r2 == 0) goto L_0x0057
            java.util.Collection r2 = r2.values()
            java.util.Iterator r10 = r2.iterator()
            r11 = r1
            r12 = r9
        L_0x0036:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r10.next()
            androidx.constraintlayout.motion.widget.s r1 = (androidx.constraintlayout.motion.widget.C2170s) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C2170s.C2174d
            if (r2 == 0) goto L_0x004a
            r11 = r1
            androidx.constraintlayout.motion.widget.s$d r11 = (androidx.constraintlayout.motion.widget.C2170s.C2174d) r11
            goto L_0x0036
        L_0x004a:
            r2 = r8
            r3 = r27
            r5 = r29
            r6 = r30
            boolean r1 = r1.mo8187d(r2, r3, r5, r6)
            r12 = r12 | r1
            goto L_0x0036
        L_0x0057:
            r11 = r1
            r12 = r9
        L_0x0059:
            n0.b[] r1 = r0.f4928h
            if (r1 == 0) goto L_0x04e0
            r1 = r1[r9]
            double r13 = (double) r8
            double[] r2 = r0.f4934n
            r1.mo19648c(r13, r2)
            n0.b[] r1 = r0.f4928h
            r1 = r1[r9]
            double[] r2 = r0.f4935o
            r1.mo19651f(r13, r2)
            n0.a r1 = r0.f4929i
            if (r1 == 0) goto L_0x0081
            double[] r2 = r0.f4934n
            int r3 = r2.length
            if (r3 <= 0) goto L_0x0081
            r1.mo19648c(r13, r2)
            n0.a r1 = r0.f4929i
            double[] r2 = r0.f4935o
            r1.mo19651f(r13, r2)
        L_0x0081:
            androidx.constraintlayout.motion.widget.p r1 = r0.f4924d
            int[] r2 = r0.f4933m
            double[] r3 = r0.f4934n
            double[] r4 = r0.f4935o
            float r5 = r1.f4952f
            float r6 = r1.f4953g
            float r9 = r1.f4954h
            float r10 = r1.f4955i
            int r15 = r2.length
            if (r15 == 0) goto L_0x00b0
            double[] r15 = r1.f4960n
            int r15 = r15.length
            r26 = r5
            int r5 = r2.length
            int r5 = r5 + -1
            r5 = r2[r5]
            if (r15 > r5) goto L_0x00b2
            int r5 = r2.length
            int r5 = r5 + -1
            r5 = r2[r5]
            int r5 = r5 + 1
            double[] r15 = new double[r5]
            r1.f4960n = r15
            double[] r5 = new double[r5]
            r1.f4961o = r5
            goto L_0x00b2
        L_0x00b0:
            r26 = r5
        L_0x00b2:
            double[] r5 = r1.f4960n
            r15 = r9
            r16 = r10
            r9 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r5, r9)
            r5 = 0
        L_0x00bd:
            int r9 = r2.length
            if (r5 >= r9) goto L_0x00d1
            double[] r9 = r1.f4960n
            r10 = r2[r5]
            r17 = r3[r5]
            r9[r10] = r17
            double[] r9 = r1.f4961o
            r17 = r4[r5]
            r9[r10] = r17
            int r5 = r5 + 1
            goto L_0x00bd
        L_0x00d1:
            r2 = 0
            r3 = 2143289344(0x7fc00000, float:NaN)
            r4 = 0
            r5 = 0
            r9 = 0
            r10 = 0
            r19 = r13
            r17 = r16
            r16 = r10
            r10 = r9
            r9 = r6
            r6 = r26
        L_0x00e2:
            double[] r13 = r1.f4960n
            int r14 = r13.length
            if (r2 >= r14) goto L_0x0133
            r21 = r13[r2]
            boolean r13 = java.lang.Double.isNaN(r21)
            if (r13 == 0) goto L_0x00f0
            goto L_0x0130
        L_0x00f0:
            double[] r13 = r1.f4960n
            r23 = r13[r2]
            boolean r13 = java.lang.Double.isNaN(r23)
            if (r13 == 0) goto L_0x00fd
            r13 = 0
            goto L_0x0105
        L_0x00fd:
            double[] r13 = r1.f4960n
            r23 = r13[r2]
            r13 = 0
            double r13 = r23 + r13
        L_0x0105:
            float r13 = (float) r13
            double[] r14 = r1.f4961o
            r18 = r13
            r13 = r14[r2]
            float r13 = (float) r13
            r14 = 1
            if (r2 == r14) goto L_0x012d
            r14 = 2
            if (r2 == r14) goto L_0x0128
            r14 = 3
            if (r2 == r14) goto L_0x0124
            r14 = 4
            if (r2 == r14) goto L_0x0120
            r13 = 5
            if (r2 == r13) goto L_0x011d
            goto L_0x0130
        L_0x011d:
            r3 = r18
            goto L_0x0130
        L_0x0120:
            r10 = r13
            r17 = r18
            goto L_0x0130
        L_0x0124:
            r4 = r13
            r15 = r18
            goto L_0x0130
        L_0x0128:
            r16 = r13
            r9 = r18
            goto L_0x0130
        L_0x012d:
            r5 = r13
            r6 = r18
        L_0x0130:
            int r2 = r2 + 1
            goto L_0x00e2
        L_0x0133:
            boolean r1 = java.lang.Float.isNaN(r3)
            if (r1 == 0) goto L_0x0147
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L_0x0144
            r7.setRotation(r1)
        L_0x0144:
            r26 = r11
            goto L_0x016b
        L_0x0147:
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 == 0) goto L_0x0150
            r1 = 0
        L_0x0150:
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r2
            float r4 = r4 + r5
            float r10 = r10 / r2
            float r10 = r10 + r16
            double r1 = (double) r1
            double r13 = (double) r3
            r26 = r11
            double r10 = (double) r10
            double r3 = (double) r4
            double r3 = java.lang.Math.atan2(r10, r3)
            double r3 = java.lang.Math.toDegrees(r3)
            double r3 = r3 + r13
            double r3 = r3 + r1
            float r1 = (float) r3
            r7.setRotation(r1)
        L_0x016b:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r1
            int r2 = (int) r6
            float r9 = r9 + r1
            int r1 = (int) r9
            float r6 = r6 + r15
            int r3 = (int) r6
            float r9 = r9 + r17
            int r4 = (int) r9
            int r5 = r3 - r2
            int r6 = r4 - r1
            int r9 = r29.getMeasuredWidth()
            if (r5 != r9) goto L_0x0189
            int r9 = r29.getMeasuredHeight()
            if (r6 == r9) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r9 = 0
            goto L_0x018a
        L_0x0189:
            r9 = 1
        L_0x018a:
            if (r9 == 0) goto L_0x0199
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r7.measure(r5, r6)
        L_0x0199:
            r7.layout(r2, r1, r3, r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r1 = r0.f4943w
            if (r1 == 0) goto L_0x01d4
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x01a8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.r r2 = (androidx.constraintlayout.motion.widget.C2154r) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.motion.widget.C2154r.C2158d
            if (r3 == 0) goto L_0x01a8
            androidx.constraintlayout.motion.widget.r$d r2 = (androidx.constraintlayout.motion.widget.C2154r.C2158d) r2
            double[] r3 = r0.f4935o
            r4 = 0
            r4 = r3[r4]
            r6 = 1
            r9 = r3[r6]
            float r2 = r2.mo8179a(r8)
            double r3 = java.lang.Math.atan2(r9, r4)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            float r2 = r2 + r3
            r7.setRotation(r2)
            goto L_0x01a8
        L_0x01d4:
            if (r26 == 0) goto L_0x01fe
            double[] r1 = r0.f4935o
            r2 = 0
            r9 = r1[r2]
            r2 = 1
            r13 = r1[r2]
            r1 = r26
            r2 = r8
            r3 = r27
            r5 = r29
            r6 = r30
            float r1 = r1.mo8185b(r2, r3, r5, r6)
            double r2 = java.lang.Math.atan2(r13, r9)
            double r2 = java.lang.Math.toDegrees(r2)
            float r2 = (float) r2
            float r1 = r1 + r2
            r7.setRotation(r1)
            r11 = r26
            boolean r1 = r11.f5018h
            r1 = r1 | r12
            r12 = r1
        L_0x01fe:
            r1 = 1
        L_0x01ff:
            n0.b[] r2 = r0.f4928h
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0225
            r2 = r2[r1]
            float[] r3 = r0.f4938r
            r4 = r19
            r2.mo19649d(r4, r3)
            androidx.constraintlayout.motion.widget.p r2 = r0.f4924d
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f4958l
            java.lang.String[] r3 = r0.f4936p
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            float[] r3 = r0.f4938r
            r2.mo8405g(r7, r3)
            int r1 = r1 + 1
            goto L_0x01ff
        L_0x0225:
            androidx.constraintlayout.motion.widget.n r1 = r0.f4926f
            int r2 = r1.f4905c
            if (r2 != 0) goto L_0x0250
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0236
            int r1 = r1.f4906d
            r7.setVisibility(r1)
            goto L_0x0250
        L_0x0236:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0244
            androidx.constraintlayout.motion.widget.n r1 = r0.f4927g
            int r1 = r1.f4906d
            r7.setVisibility(r1)
            goto L_0x0250
        L_0x0244:
            androidx.constraintlayout.motion.widget.n r2 = r0.f4927g
            int r2 = r2.f4906d
            int r1 = r1.f4906d
            if (r2 == r1) goto L_0x0250
            r1 = 0
            r7.setVisibility(r1)
        L_0x0250:
            androidx.constraintlayout.motion.widget.m[] r1 = r0.f4945y
            if (r1 == 0) goto L_0x04db
            r1 = 0
        L_0x0255:
            androidx.constraintlayout.motion.widget.m[] r2 = r0.f4945y
            int r3 = r2.length
            if (r1 >= r3) goto L_0x04db
            r2 = r2[r1]
            int r3 = r2.f4889j
            r4 = -1
            if (r3 == r4) goto L_0x02c1
            android.view.View r3 = r2.f4890k
            if (r3 != 0) goto L_0x0273
            android.view.ViewParent r3 = r29.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r2.f4889j
            android.view.View r3 = r3.findViewById(r4)
            r2.f4890k = r3
        L_0x0273:
            android.graphics.RectF r3 = r2.f4901v
            android.view.View r4 = r2.f4890k
            boolean r5 = r2.f4900u
            androidx.constraintlayout.motion.widget.C2145m.m4607e(r3, r4, r5)
            android.graphics.RectF r3 = r2.f4902w
            boolean r4 = r2.f4900u
            androidx.constraintlayout.motion.widget.C2145m.m4607e(r3, r7, r4)
            android.graphics.RectF r3 = r2.f4901v
            android.graphics.RectF r4 = r2.f4902w
            boolean r3 = r3.intersect(r4)
            if (r3 == 0) goto L_0x02a8
            boolean r3 = r2.f4892m
            if (r3 == 0) goto L_0x0296
            r3 = 0
            r2.f4892m = r3
            r4 = 1
            goto L_0x0298
        L_0x0296:
            r3 = 0
            r4 = r3
        L_0x0298:
            boolean r5 = r2.f4894o
            if (r5 == 0) goto L_0x02a1
            r2.f4894o = r3
            r3 = 1
            r5 = 1
            goto L_0x02a3
        L_0x02a1:
            r3 = 1
            r5 = 0
        L_0x02a3:
            r2.f4893n = r3
            r3 = 0
            goto L_0x0342
        L_0x02a8:
            r3 = 1
            boolean r4 = r2.f4892m
            if (r4 != 0) goto L_0x02b1
            r2.f4892m = r3
            r4 = r3
            goto L_0x02b2
        L_0x02b1:
            r4 = 0
        L_0x02b2:
            boolean r5 = r2.f4893n
            if (r5 == 0) goto L_0x02bb
            r5 = 0
            r2.f4893n = r5
            r5 = r3
            goto L_0x02bc
        L_0x02bb:
            r5 = 0
        L_0x02bc:
            r2.f4894o = r3
            r3 = r5
            goto L_0x0341
        L_0x02c1:
            boolean r3 = r2.f4892m
            if (r3 == 0) goto L_0x02d7
            float r3 = r2.f4895p
            float r4 = r8 - r3
            float r5 = r2.f4899t
            float r5 = r5 - r3
            float r5 = r5 * r4
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x02e8
            r3 = 0
            r2.f4892m = r3
            r3 = 1
            goto L_0x02e9
        L_0x02d7:
            float r3 = r2.f4895p
            float r3 = r8 - r3
            float r3 = java.lang.Math.abs(r3)
            float r4 = r2.f4891l
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x02e8
            r3 = 1
            r2.f4892m = r3
        L_0x02e8:
            r3 = 0
        L_0x02e9:
            r4 = r3
            boolean r3 = r2.f4893n
            if (r3 == 0) goto L_0x0304
            float r3 = r2.f4895p
            float r5 = r8 - r3
            float r6 = r2.f4899t
            float r6 = r6 - r3
            float r6 = r6 * r5
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0315
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0315
            r3 = 0
            r2.f4893n = r3
            r3 = 1
            goto L_0x0316
        L_0x0304:
            float r3 = r2.f4895p
            float r3 = r8 - r3
            float r3 = java.lang.Math.abs(r3)
            float r5 = r2.f4891l
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0315
            r3 = 1
            r2.f4893n = r3
        L_0x0315:
            r3 = 0
        L_0x0316:
            boolean r5 = r2.f4894o
            if (r5 == 0) goto L_0x0330
            float r5 = r2.f4895p
            float r6 = r8 - r5
            float r9 = r2.f4899t
            float r9 = r9 - r5
            float r9 = r9 * r6
            r5 = 0
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0341
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0341
            r5 = 0
            r2.f4894o = r5
            r5 = 1
            goto L_0x0342
        L_0x0330:
            float r5 = r2.f4895p
            float r5 = r8 - r5
            float r5 = java.lang.Math.abs(r5)
            float r6 = r2.f4891l
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0341
            r5 = 1
            r2.f4894o = r5
        L_0x0341:
            r5 = 0
        L_0x0342:
            r2.f4899t = r8
            if (r3 != 0) goto L_0x034a
            if (r4 != 0) goto L_0x034a
            if (r5 == 0) goto L_0x0355
        L_0x034a:
            android.view.ViewParent r6 = r29.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = (androidx.constraintlayout.motion.widget.MotionLayout) r6
            int r9 = r2.f4888i
            r6.fireTrigger(r9, r5, r8)
        L_0x0355:
            int r6 = r2.f4885f
            r9 = -1
            if (r6 != r9) goto L_0x035c
            r6 = r7
            goto L_0x0368
        L_0x035c:
            android.view.ViewParent r6 = r29.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = (androidx.constraintlayout.motion.widget.MotionLayout) r6
            int r9 = r2.f4885f
            android.view.View r6 = r6.findViewById(r9)
        L_0x0368:
            java.lang.String r9 = "Could not find method \""
            java.lang.String r10 = "Exception in call \""
            java.lang.String r11 = " "
            java.lang.String r13 = "\"on class "
            java.lang.String r14 = "KeyTrigger"
            if (r3 == 0) goto L_0x03ed
            java.lang.String r3 = r2.f4886g
            if (r3 == 0) goto L_0x03ed
            java.lang.reflect.Method r3 = r2.f4897r
            if (r3 != 0) goto L_0x03b9
            java.lang.Class r3 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x038e }
            java.lang.String r15 = r2.f4886g     // Catch:{ NoSuchMethodException -> 0x038e }
            r26 = r12
            r12 = 0
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ NoSuchMethodException -> 0x0390 }
            java.lang.reflect.Method r3 = r3.getMethod(r15, r12)     // Catch:{ NoSuchMethodException -> 0x0390 }
            r2.f4897r = r3     // Catch:{ NoSuchMethodException -> 0x0390 }
            goto L_0x03bb
        L_0x038e:
            r26 = r12
        L_0x0390:
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r9)
            java.lang.String r12 = r2.f4886g
            r3.append(r12)
            r3.append(r13)
            java.lang.Class r12 = r6.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r3.append(r12)
            r3.append(r11)
            java.lang.String r12 = androidx.constraintlayout.motion.widget.C2114a.m4567c(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r14, r3)
            goto L_0x03bb
        L_0x03b9:
            r26 = r12
        L_0x03bb:
            java.lang.reflect.Method r3 = r2.f4897r     // Catch:{ Exception -> 0x03c4 }
            r12 = 0
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x03c4 }
            r3.invoke(r6, r12)     // Catch:{ Exception -> 0x03c4 }
            goto L_0x03ef
        L_0x03c4:
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r10)
            java.lang.String r12 = r2.f4886g
            r3.append(r12)
            r3.append(r13)
            java.lang.Class r12 = r6.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r3.append(r12)
            r3.append(r11)
            java.lang.String r12 = androidx.constraintlayout.motion.widget.C2114a.m4567c(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r14, r3)
            goto L_0x03ef
        L_0x03ed:
            r26 = r12
        L_0x03ef:
            if (r5 == 0) goto L_0x0462
            java.lang.String r3 = r2.f4887h
            if (r3 == 0) goto L_0x0462
            java.lang.reflect.Method r3 = r2.f4898s
            if (r3 != 0) goto L_0x0431
            java.lang.Class r3 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x0409 }
            java.lang.String r5 = r2.f4887h     // Catch:{ NoSuchMethodException -> 0x0409 }
            r12 = 0
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ NoSuchMethodException -> 0x0409 }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r12)     // Catch:{ NoSuchMethodException -> 0x0409 }
            r2.f4898s = r3     // Catch:{ NoSuchMethodException -> 0x0409 }
            goto L_0x0431
        L_0x0409:
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r9)
            java.lang.String r5 = r2.f4887h
            r3.append(r5)
            r3.append(r13)
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r3.append(r5)
            r3.append(r11)
            java.lang.String r5 = androidx.constraintlayout.motion.widget.C2114a.m4567c(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r14, r3)
        L_0x0431:
            java.lang.reflect.Method r3 = r2.f4898s     // Catch:{ Exception -> 0x043a }
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x043a }
            r3.invoke(r6, r5)     // Catch:{ Exception -> 0x043a }
            goto L_0x0462
        L_0x043a:
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r10)
            java.lang.String r5 = r2.f4887h
            r3.append(r5)
            r3.append(r13)
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r3.append(r5)
            r3.append(r11)
            java.lang.String r5 = androidx.constraintlayout.motion.widget.C2114a.m4567c(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r14, r3)
        L_0x0462:
            if (r4 == 0) goto L_0x04d5
            java.lang.String r3 = r2.f4884e
            if (r3 == 0) goto L_0x04d5
            java.lang.reflect.Method r3 = r2.f4896q
            if (r3 != 0) goto L_0x04a4
            java.lang.Class r3 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x047c }
            java.lang.String r4 = r2.f4884e     // Catch:{ NoSuchMethodException -> 0x047c }
            r5 = 0
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x047c }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x047c }
            r2.f4896q = r3     // Catch:{ NoSuchMethodException -> 0x047c }
            goto L_0x04a4
        L_0x047c:
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r9)
            java.lang.String r4 = r2.f4884e
            r3.append(r4)
            r3.append(r13)
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C2114a.m4567c(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r14, r3)
        L_0x04a4:
            java.lang.reflect.Method r3 = r2.f4896q     // Catch:{ Exception -> 0x04ad }
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04ad }
            r3.invoke(r6, r4)     // Catch:{ Exception -> 0x04ad }
            goto L_0x04d5
        L_0x04ad:
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r10)
            java.lang.String r2 = r2.f4884e
            r3.append(r2)
            r3.append(r13)
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = androidx.constraintlayout.motion.widget.C2114a.m4567c(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.e(r14, r2)
        L_0x04d5:
            int r1 = r1 + 1
            r12 = r26
            goto L_0x0255
        L_0x04db:
            r26 = r12
            r12 = r26
            goto L_0x052a
        L_0x04e0:
            androidx.constraintlayout.motion.widget.p r1 = r0.f4924d
            float r2 = r1.f4952f
            androidx.constraintlayout.motion.widget.p r3 = r0.f4925e
            float r4 = r3.f4952f
            float r2 = p003a2.C0023f.m103b(r4, r2, r8, r2)
            float r4 = r1.f4953g
            float r5 = r3.f4953g
            float r4 = p003a2.C0023f.m103b(r5, r4, r8, r4)
            float r5 = r1.f4954h
            float r6 = r3.f4954h
            float r9 = p003a2.C0023f.m103b(r6, r5, r8, r5)
            float r1 = r1.f4955i
            float r3 = r3.f4955i
            float r10 = p003a2.C0023f.m103b(r3, r1, r8, r1)
            r11 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r11
            int r13 = (int) r2
            float r4 = r4 + r11
            int r11 = (int) r4
            float r2 = r2 + r9
            int r2 = (int) r2
            float r4 = r4 + r10
            int r4 = (int) r4
            int r9 = r2 - r13
            int r10 = r4 - r11
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x051a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0527
        L_0x051a:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
            r7.measure(r3, r1)
        L_0x0527:
            r7.layout(r13, r11, r2, r4)
        L_0x052a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.h> r1 = r0.f4944x
            if (r1 == 0) goto L_0x0566
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0536:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0566
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.h r2 = (androidx.constraintlayout.motion.widget.C2123h) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.motion.widget.C2123h.C2128e
            if (r3 == 0) goto L_0x0562
            androidx.constraintlayout.motion.widget.h$e r2 = (androidx.constraintlayout.motion.widget.C2123h.C2128e) r2
            double[] r3 = r0.f4935o
            r4 = 0
            r4 = r3[r4]
            r6 = 1
            r9 = r3[r6]
            float r2 = r2.mo8142a(r8)
            double r3 = java.lang.Math.atan2(r9, r4)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            float r2 = r2 + r3
            r7.setRotation(r2)
            goto L_0x0536
        L_0x0562:
            r2.mo8144c(r8, r7)
            goto L_0x0536
        L_0x0566:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C2148o.mo8154c(float, long, android.view.View, androidx.constraintlayout.motion.widget.e):boolean");
    }

    /* renamed from: d */
    public final void mo8155d(C2149p pVar) {
        pVar.f4952f = (float) ((int) this.f4921a.getX());
        pVar.f4953g = (float) ((int) this.f4921a.getY());
        pVar.f4954h = (float) this.f4921a.getWidth();
        pVar.f4955i = (float) this.f4921a.getHeight();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0290, code lost:
        r7 = r18;
        r5 = r19;
        r2 = r29;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0298, code lost:
        r19 = r13;
        r18 = r17;
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x029e, code lost:
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a0, code lost:
        r6 = r20;
        r20 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a4, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c5, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02dc, code lost:
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ff, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0304, code lost:
        r23 = r2;
        r7 = r18;
        r5 = r19;
        r2 = r29;
        r19 = r13;
        r18 = r17;
        r13 = r21;
        r21 = r6;
        r6 = r20;
        r20 = r14;
        r14 = r16;
        r16 = r3;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03d3, code lost:
        r21 = r6;
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03db, code lost:
        r21 = r6;
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ff, code lost:
        r20 = r14;
        r14 = r16;
        r16 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0405, code lost:
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0451, code lost:
        switch(r16) {
            case 0: goto L_0x04b2;
            case 1: goto L_0x04ac;
            case 2: goto L_0x04a6;
            case 3: goto L_0x04a0;
            case 4: goto L_0x049a;
            case 5: goto L_0x0494;
            case 6: goto L_0x048e;
            case 7: goto L_0x0488;
            case 8: goto L_0x0482;
            case 9: goto L_0x047c;
            case 10: goto L_0x0476;
            case 11: goto L_0x0470;
            case 12: goto L_0x046a;
            case 13: goto L_0x0464;
            case 14: goto L_0x045e;
            case 15: goto L_0x0458;
            default: goto L_0x0454;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0454, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0458, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2155a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x045e, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2155a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0464, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2158d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x046a, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2157c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0470, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2162h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0476, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2160f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x047c, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2159e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0482, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2155a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0488, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2166l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x048e, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2165k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0494, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2161g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x049a, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2169o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04a0, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2168n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04a6, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2167m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04ac, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2164j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04b2, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2154r.C2163i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04b7, code lost:
        r17 = r14;
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0631, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0633, code lost:
        r14 = r17;
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0672, code lost:
        r15 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06a3, code lost:
        r14 = r17;
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06c9, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06ca, code lost:
        switch(r15) {
            case 0: goto L_0x0717;
            case 1: goto L_0x0711;
            case 2: goto L_0x070b;
            case 3: goto L_0x0705;
            case 4: goto L_0x06ff;
            case 5: goto L_0x06f9;
            case 6: goto L_0x06f3;
            case 7: goto L_0x06ed;
            case 8: goto L_0x06e7;
            case 9: goto L_0x06e1;
            case 10: goto L_0x06db;
            case 11: goto L_0x06d5;
            default: goto L_0x06cd;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06cd, code lost:
        r16 = r13;
        r17 = r14;
        r13 = r46;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06d5, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2171a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06db, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2174d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06e1, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2173c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06e7, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2176f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06ed, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2180j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06f3, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2179i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06f9, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2175e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06ff, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2183m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0705, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2182l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x070b, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2181k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0711, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2178h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0717, code lost:
        r15 = new androidx.constraintlayout.motion.widget.C2170s.C2177g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x071c, code lost:
        r16 = r13;
        r17 = r14;
        r15.f5019i = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07f3, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0830, code lost:
        r13 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x084a, code lost:
        r4 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0861, code lost:
        r12 = r17;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0867, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0868, code lost:
        r12 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x086a, code lost:
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x088e, code lost:
        r13 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x088f, code lost:
        switch(r13) {
            case 0: goto L_0x0a66;
            case 1: goto L_0x0a40;
            case 2: goto L_0x0a1a;
            case 3: goto L_0x09f3;
            case 4: goto L_0x09cc;
            case 5: goto L_0x09a5;
            case 6: goto L_0x097e;
            case 7: goto L_0x0957;
            case 8: goto L_0x0930;
            case 9: goto L_0x0909;
            case 10: goto L_0x08e2;
            case 11: goto L_0x08b5;
            default: goto L_0x0892;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0892, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
        android.util.Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + r6 + "\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08b5, code lost:
        r13 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08bd, code lost:
        if (java.lang.Float.isNaN(r13.f4868f) != false) goto L_0x08dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08bf, code lost:
        r16 = r12;
        r17 = r4;
        r33.mo8186c(r13.f4868f, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08dc, code lost:
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08e2, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08ee, code lost:
        if (java.lang.Float.isNaN(r13.f4873k) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08f0, code lost:
        r33.mo8186c(r13.f4873k, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0909, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0915, code lost:
        if (java.lang.Float.isNaN(r13.f4869g) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0917, code lost:
        r33.mo8186c(r13.f4869g, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0930, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x093c, code lost:
        if (java.lang.Float.isNaN(r13.f4870h) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x093e, code lost:
        r33.mo8186c(r13.f4870h, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0957, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0963, code lost:
        if (java.lang.Float.isNaN(r13.f4875m) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0965, code lost:
        r33.mo8186c(r13.f4875m, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x097e, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x098a, code lost:
        if (java.lang.Float.isNaN(r13.f4874l) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x098c, code lost:
        r33.mo8186c(r13.f4874l, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09a5, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09b1, code lost:
        if (java.lang.Float.isNaN(r13.f4879q) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09b3, code lost:
        r33.mo8186c(r13.f4879q, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09cc, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x09d8, code lost:
        if (java.lang.Float.isNaN(r13.f4878p) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x09da, code lost:
        r33.mo8186c(r13.f4878p, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09f3, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x09ff, code lost:
        if (java.lang.Float.isNaN(r13.f4877o) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0a01, code lost:
        r33.mo8186c(r13.f4877o, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0a1a, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0a26, code lost:
        if (java.lang.Float.isNaN(r13.f4876n) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0a28, code lost:
        r33.mo8186c(r13.f4876n, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0a40, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0a4c, code lost:
        if (java.lang.Float.isNaN(r13.f4872j) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0a4e, code lost:
        r33.mo8186c(r13.f4872j, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0a66, code lost:
        r13 = r47;
        r17 = r4;
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0a72, code lost:
        if (java.lang.Float.isNaN(r13.f4871i) != false) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a74, code lost:
        r33.mo8186c(r13.f4871i, r13.f4881s, r13.f4882t, r13.f4794a, r13.f4880r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0a8b, code lost:
        r6 = r45;
        r15 = r46;
        r4 = r17;
        r14 = r18;
        r12 = r29;
        r17 = r16;
        r16 = r0;
        r0 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0eba, code lost:
        r46 = r0;
        r9 = r16;
        r0 = r18;
        r15 = r19;
        r14 = r28;
        r10 = r30;
        r13 = r31;
        r12 = r33;
        r7 = r35;
        r16 = r6;
        r18 = r17;
        r6 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0edc, code lost:
        r46 = r0;
        r9 = r16;
        r0 = r18;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0ee4, code lost:
        r14 = r28;
        r10 = r30;
        r13 = r31;
        r12 = r33;
        r6 = r34;
        r7 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0f28, code lost:
        r7 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0f4e, code lost:
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0f53, code lost:
        r46 = r0;
        r21 = r9;
        r9 = r16;
        r0 = r18;
        r15 = r19;
        r14 = r28;
        r13 = r31;
        r12 = r33;
        r16 = r10;
        r18 = r17;
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0f7b, code lost:
        r46 = r0;
        r21 = r9;
        r9 = r16;
        r0 = r18;
        r15 = r19;
        r14 = r28;
        r13 = r31;
        r12 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x100d, code lost:
        r46 = r0;
        r21 = r9;
        r9 = r16;
        r0 = r18;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x103c, code lost:
        r46 = r0;
        r21 = r9;
        r9 = r16;
        r0 = r18;
        r16 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x1063, code lost:
        r21 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x1067, code lost:
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x1073, code lost:
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x10c2, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x10c4, code lost:
        switch(r16) {
            case 0: goto L_0x111c;
            case 1: goto L_0x1116;
            case 2: goto L_0x1110;
            case 3: goto L_0x110a;
            case 4: goto L_0x1104;
            case 5: goto L_0x10fe;
            case 6: goto L_0x10f8;
            case 7: goto L_0x10f2;
            case 8: goto L_0x10ec;
            case 9: goto L_0x10e6;
            case 10: goto L_0x10e0;
            case 11: goto L_0x10da;
            case 12: goto L_0x10d4;
            case 13: goto L_0x10ce;
            default: goto L_0x10c7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x10c7, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x10c9, code lost:
        r17 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x10ce, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2124a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x10d4, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2124a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x10da, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2128e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x10e0, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2127d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x10e6, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2130g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x10ec, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2124a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x10f2, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2134k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x10f8, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2133j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x10fe, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2129f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x1104, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2137n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x110a, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2136m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x1110, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2135l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x1116, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2132i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x111c, code lost:
        r16 = new androidx.constraintlayout.motion.widget.C2123h.C2131h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x1312, code lost:
        r14 = r16;
        r0 = r17;
        r12 = r19;
        r15 = r20;
        r11 = r23;
        r13 = r29;
        r10 = r30;
        r3 = r34;
        r9 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x133a, code lost:
        r9 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x133f, code lost:
        r10 = r0;
        r0 = r28;
        r3 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x1362, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x1363, code lost:
        r9 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x1372, code lost:
        r14 = r16;
        r12 = r19;
        r15 = r20;
        r11 = r23;
        r13 = r29;
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x1382, code lost:
        r15 = r10;
        r14 = r16;
        r12 = r19;
        r11 = r23;
        r13 = r29;
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x13c3, code lost:
        r14 = r16;
        r12 = r19;
        r15 = r20;
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x1415, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x1432, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x1436, code lost:
        r28 = r0;
        r16 = r15;
        r0 = r17;
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x1458, code lost:
        r28 = r0;
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x147a, code lost:
        r18 = r0;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x1483, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x14a2, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x14a4, code lost:
        switch(r16) {
            case 0: goto L_0x14e8;
            case 1: goto L_0x14e3;
            case 2: goto L_0x14de;
            case 3: goto L_0x14d9;
            case 4: goto L_0x14d4;
            case 5: goto L_0x14cf;
            case 6: goto L_0x14ca;
            case 7: goto L_0x14c5;
            case 8: goto L_0x14c0;
            case 9: goto L_0x14bb;
            case 10: goto L_0x14b6;
            case 11: goto L_0x14b1;
            case 12: goto L_0x14ac;
            default: goto L_0x14a7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x14a7, code lost:
        r16 = r0;
        r0 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x14ac, code lost:
        r16 = r0;
        r0 = r1.f4818h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x14b1, code lost:
        r16 = r0;
        r0 = r1.f4821k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x14b6, code lost:
        r16 = r0;
        r0 = r1.f4824n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x14bb, code lost:
        r16 = r0;
        r0 = r1.f4822l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x14c0, code lost:
        r16 = r0;
        r0 = r1.f4823m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x14c5, code lost:
        r16 = r0;
        r0 = r1.f4828r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x14ca, code lost:
        r16 = r0;
        r0 = r1.f4827q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x14cf, code lost:
        r16 = r0;
        r0 = r1.f4819i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x14d4, code lost:
        r16 = r0;
        r0 = r1.f4831u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x14d9, code lost:
        r16 = r0;
        r0 = r1.f4830t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x14de, code lost:
        r16 = r0;
        r0 = r1.f4829s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x14e3, code lost:
        r16 = r0;
        r0 = r1.f4826p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x14e8, code lost:
        r16 = r0;
        r0 = r1.f4825o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x14f0, code lost:
        if (java.lang.Float.isNaN(r0) != false) goto L_0x1522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x14f2, code lost:
        r7 = r2.get(r7);
        r17 = r2;
        r2 = r1.f4794a;
        r34 = r3;
        r3 = r1.f4816f;
        r20 = r5;
        r5 = r1.f4820j;
        r47 = r6;
        r19 = r8;
        r23 = r1;
        r35 = r9;
        r7.f4838f.add(new androidx.constraintlayout.motion.widget.C2123h.C2138o(r2, r1.f4817g, r1.f4818h, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x151b, code lost:
        if (r5 == -1) goto L_0x151f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x151d, code lost:
        r7.f4837e = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x151f, code lost:
        r7.f4836d = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x1522, code lost:
        r23 = r1;
        r17 = r2;
        r34 = r3;
        r20 = r5;
        r47 = r6;
        r19 = r8;
        r35 = r9;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8156e(int r44, int r45, long r46) {
        /*
            r43 = this;
            r0 = r43
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.f4946z
            r6 = -1
            if (r5 == r6) goto L_0x0024
            androidx.constraintlayout.motion.widget.p r6 = r0.f4924d
            r6.f4957k = r5
        L_0x0024:
            androidx.constraintlayout.motion.widget.n r5 = r0.f4926f
            androidx.constraintlayout.motion.widget.n r6 = r0.f4927g
            float r7 = r5.f4904b
            float r8 = r6.f4904b
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r8)
            java.lang.String r8 = "alpha"
            if (r7 == 0) goto L_0x0037
            r2.add(r8)
        L_0x0037:
            float r7 = r5.f4907e
            float r9 = r6.f4907e
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r9)
            java.lang.String r9 = "elevation"
            if (r7 == 0) goto L_0x0046
            r2.add(r9)
        L_0x0046:
            int r7 = r5.f4906d
            int r10 = r6.f4906d
            if (r7 == r10) goto L_0x0057
            int r11 = r5.f4905c
            if (r11 != 0) goto L_0x0057
            if (r7 == 0) goto L_0x0054
            if (r10 != 0) goto L_0x0057
        L_0x0054:
            r2.add(r8)
        L_0x0057:
            float r7 = r5.f4908f
            float r10 = r6.f4908f
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r10)
            java.lang.String r10 = "rotation"
            if (r7 == 0) goto L_0x0066
            r2.add(r10)
        L_0x0066:
            float r7 = r5.f4918p
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r11 = "transitionPathRotate"
            if (r7 == 0) goto L_0x0078
            float r7 = r6.f4918p
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x007b
        L_0x0078:
            r2.add(r11)
        L_0x007b:
            float r7 = r5.f4919q
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r12 = "progress"
            if (r7 == 0) goto L_0x008d
            float r7 = r6.f4919q
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x0090
        L_0x008d:
            r2.add(r12)
        L_0x0090:
            float r7 = r5.f4909g
            float r13 = r6.f4909g
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r13)
            java.lang.String r13 = "rotationX"
            if (r7 == 0) goto L_0x009f
            r2.add(r13)
        L_0x009f:
            float r7 = r5.f4910h
            float r14 = r6.f4910h
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r14)
            java.lang.String r14 = "rotationY"
            if (r7 == 0) goto L_0x00ae
            r2.add(r14)
        L_0x00ae:
            float r7 = r5.f4913k
            float r15 = r6.f4913k
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r15)
            java.lang.String r15 = "transformPivotX"
            if (r7 == 0) goto L_0x00bd
            r2.add(r15)
        L_0x00bd:
            float r7 = r5.f4914l
            r16 = r13
            float r13 = r6.f4914l
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r13)
            java.lang.String r13 = "transformPivotY"
            if (r7 == 0) goto L_0x00ce
            r2.add(r13)
        L_0x00ce:
            float r7 = r5.f4911i
            r17 = r14
            float r14 = r6.f4911i
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r14)
            java.lang.String r14 = "scaleX"
            if (r7 == 0) goto L_0x00df
            r2.add(r14)
        L_0x00df:
            float r7 = r5.f4912j
            r18 = r12
            float r12 = r6.f4912j
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r12)
            java.lang.String r12 = "scaleY"
            if (r7 == 0) goto L_0x00f0
            r2.add(r12)
        L_0x00f0:
            float r7 = r5.f4915m
            r19 = r14
            float r14 = r6.f4915m
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r14)
            java.lang.String r14 = "translationX"
            if (r7 == 0) goto L_0x0101
            r2.add(r14)
        L_0x0101:
            float r7 = r5.f4916n
            r20 = r14
            float r14 = r6.f4916n
            boolean r7 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r7, r14)
            java.lang.String r14 = "translationY"
            if (r7 == 0) goto L_0x0112
            r2.add(r14)
        L_0x0112:
            float r5 = r5.f4917o
            float r6 = r6.f4917o
            boolean r5 = androidx.constraintlayout.motion.widget.C2147n.m4611c(r5, r6)
            java.lang.String r6 = "translationZ"
            if (r5 == 0) goto L_0x0121
            r2.add(r6)
        L_0x0121:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r5 = r0.f4941u
            if (r5 == 0) goto L_0x01d2
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x012a:
            boolean r21 = r5.hasNext()
            if (r21 == 0) goto L_0x01c9
            java.lang.Object r21 = r5.next()
            r22 = r5
            r5 = r21
            androidx.constraintlayout.motion.widget.c r5 = (androidx.constraintlayout.motion.widget.C2116c) r5
            r21 = r14
            boolean r14 = r5 instanceof androidx.constraintlayout.motion.widget.C2140j
            if (r14 == 0) goto L_0x0190
            androidx.constraintlayout.motion.widget.j r5 = (androidx.constraintlayout.motion.widget.C2140j) r5
            androidx.constraintlayout.motion.widget.p r14 = new androidx.constraintlayout.motion.widget.p
            r29 = r6
            androidx.constraintlayout.motion.widget.p r6 = r0.f4924d
            r30 = r12
            androidx.constraintlayout.motion.widget.p r12 = r0.f4925e
            r23 = r14
            r24 = r44
            r25 = r45
            r26 = r5
            r27 = r6
            r28 = r12
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r6 = r0.f4939s
            int r6 = java.util.Collections.binarySearch(r6, r14)
            if (r6 != 0) goto L_0x017f
            java.lang.String r12 = " KeyPath positon \""
            java.lang.StringBuilder r12 = android.support.p013v4.media.C0072d.m201h(r12)
            r23 = r15
            float r15 = r14.f4951e
            r12.append(r15)
            java.lang.String r15 = "\" outside of range"
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "MotionController"
            android.util.Log.e(r15, r12)
            goto L_0x0181
        L_0x017f:
            r23 = r15
        L_0x0181:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r12 = r0.f4939s
            int r6 = -r6
            r15 = -1
            int r6 = r6 + r15
            r12.add(r6, r14)
            int r5 = r5.f4866e
            if (r5 == r15) goto L_0x01bd
            r0.f4923c = r5
            goto L_0x01bd
        L_0x0190:
            r29 = r6
            r30 = r12
            r23 = r15
            boolean r6 = r5 instanceof androidx.constraintlayout.motion.widget.C2120f
            if (r6 == 0) goto L_0x019e
            r5.mo8137b(r3)
            goto L_0x01bd
        L_0x019e:
            boolean r6 = r5 instanceof androidx.constraintlayout.motion.widget.C2143l
            if (r6 == 0) goto L_0x01a6
            r5.mo8137b(r1)
            goto L_0x01bd
        L_0x01a6:
            boolean r6 = r5 instanceof androidx.constraintlayout.motion.widget.C2145m
            if (r6 == 0) goto L_0x01b7
            if (r7 != 0) goto L_0x01b1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x01b1:
            androidx.constraintlayout.motion.widget.m r5 = (androidx.constraintlayout.motion.widget.C2145m) r5
            r7.add(r5)
            goto L_0x01bd
        L_0x01b7:
            r5.mo8139d(r4)
            r5.mo8137b(r2)
        L_0x01bd:
            r14 = r21
            r5 = r22
            r15 = r23
            r6 = r29
            r12 = r30
            goto L_0x012a
        L_0x01c9:
            r29 = r6
            r30 = r12
            r21 = r14
            r23 = r15
            goto L_0x01db
        L_0x01d2:
            r29 = r6
            r30 = r12
            r21 = r14
            r23 = r15
            r7 = 0
        L_0x01db:
            r5 = 0
            if (r7 == 0) goto L_0x01e8
            androidx.constraintlayout.motion.widget.m[] r5 = new androidx.constraintlayout.motion.widget.C2145m[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            androidx.constraintlayout.motion.widget.m[] r5 = (androidx.constraintlayout.motion.widget.C2145m[]) r5
            r0.f4945y = r5
        L_0x01e8:
            boolean r5 = r2.isEmpty()
            java.lang.String r6 = "waveVariesBy"
            java.lang.String r7 = ","
            java.lang.String r14 = "waveOffset"
            java.lang.String r15 = "CUSTOM,"
            r22 = 11
            r24 = 10
            r25 = 9
            r26 = 8
            r27 = 5
            if (r5 != 0) goto L_0x0584
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f4943w = r5
            java.util.Iterator r5 = r2.iterator()
        L_0x020b:
            boolean r28 = r5.hasNext()
            if (r28 == 0) goto L_0x0503
            java.lang.Object r28 = r5.next()
            r12 = r28
            java.lang.String r12 = (java.lang.String) r12
            boolean r28 = r12.startsWith(r15)
            if (r28 == 0) goto L_0x0281
            r45 = r5
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            java.lang.String[] r28 = r12.split(r7)
            r31 = 1
            r32 = r3
            r3 = r28[r31]
            r28 = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r2 = r0.f4941u
            java.util.Iterator r2 = r2.iterator()
        L_0x0238:
            boolean r31 = r2.hasNext()
            if (r31 == 0) goto L_0x0261
            java.lang.Object r31 = r2.next()
            r33 = r2
            r2 = r31
            androidx.constraintlayout.motion.widget.c r2 = (androidx.constraintlayout.motion.widget.C2116c) r2
            r31 = r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r7 = r2.f4797d
            if (r7 != 0) goto L_0x024f
            goto L_0x025c
        L_0x024f:
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r7 = (androidx.constraintlayout.widget.ConstraintAttribute) r7
            if (r7 == 0) goto L_0x025c
            int r2 = r2.f4794a
            r5.append(r2, r7)
        L_0x025c:
            r7 = r31
            r2 = r33
            goto L_0x0238
        L_0x0261:
            r31 = r7
            androidx.constraintlayout.motion.widget.r$b r2 = new androidx.constraintlayout.motion.widget.r$b
            r2.<init>(r12, r5)
            r7 = r18
            r5 = r19
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r6
            r17 = r16
            r6 = r20
            r20 = r14
            r14 = r2
            r2 = r29
            goto L_0x04bb
        L_0x0281:
            r28 = r2
            r32 = r3
            r45 = r5
            r31 = r7
            int r2 = r12.hashCode()
            switch(r2) {
                case -1249320806: goto L_0x042f;
                case -1249320805: goto L_0x0408;
                case -1225497657: goto L_0x03e0;
                case -1225497656: goto L_0x03c1;
                case -1225497655: goto L_0x03aa;
                case -1001078227: goto L_0x0380;
                case -908189618: goto L_0x0351;
                case -908189617: goto L_0x0320;
                case -797520672: goto L_0x02f7;
                case -760884510: goto L_0x02eb;
                case -760884509: goto L_0x02df;
                case -40300674: goto L_0x02d3;
                case -4379043: goto L_0x02c7;
                case 37232917: goto L_0x02bc;
                case 92909918: goto L_0x02b2;
                case 156108012: goto L_0x02a8;
                default: goto L_0x0290;
            }
        L_0x0290:
            r7 = r18
            r5 = r19
            r2 = r29
            r3 = r30
        L_0x0298:
            r19 = r13
            r18 = r17
            r13 = r21
        L_0x029e:
            r21 = r6
        L_0x02a0:
            r6 = r20
            r20 = r14
        L_0x02a4:
            r14 = r16
            goto L_0x044f
        L_0x02a8:
            boolean r2 = r12.equals(r14)
            if (r2 != 0) goto L_0x02af
            goto L_0x0290
        L_0x02af:
            r2 = 15
            goto L_0x02c5
        L_0x02b2:
            boolean r2 = r12.equals(r8)
            if (r2 != 0) goto L_0x02b9
            goto L_0x0290
        L_0x02b9:
            r2 = 14
            goto L_0x02c5
        L_0x02bc:
            boolean r2 = r12.equals(r11)
            if (r2 != 0) goto L_0x02c3
            goto L_0x0290
        L_0x02c3:
            r2 = 13
        L_0x02c5:
            r3 = r2
            goto L_0x02dc
        L_0x02c7:
            boolean r2 = r12.equals(r9)
            if (r2 != 0) goto L_0x02ce
            goto L_0x0290
        L_0x02ce:
            r2 = r23
            r3 = 12
            goto L_0x0304
        L_0x02d3:
            boolean r2 = r12.equals(r10)
            if (r2 != 0) goto L_0x02da
            goto L_0x0290
        L_0x02da:
            r3 = r22
        L_0x02dc:
            r2 = r23
            goto L_0x0304
        L_0x02df:
            boolean r2 = r12.equals(r13)
            if (r2 != 0) goto L_0x02e6
            goto L_0x0290
        L_0x02e6:
            r2 = r23
            r3 = r24
            goto L_0x0304
        L_0x02eb:
            r2 = r23
            boolean r3 = r12.equals(r2)
            if (r3 != 0) goto L_0x02f4
            goto L_0x02ff
        L_0x02f4:
            r3 = r25
            goto L_0x0304
        L_0x02f7:
            r2 = r23
            boolean r3 = r12.equals(r6)
            if (r3 != 0) goto L_0x0302
        L_0x02ff:
            r23 = r2
            goto L_0x0290
        L_0x0302:
            r3 = r26
        L_0x0304:
            r23 = r2
            r7 = r18
            r5 = r19
            r2 = r29
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r6
            r6 = r20
            r20 = r14
            r14 = r16
            r16 = r3
            r3 = r30
            goto L_0x0451
        L_0x0320:
            r2 = r23
            r3 = r30
            boolean r5 = r12.equals(r3)
            if (r5 != 0) goto L_0x0334
            r23 = r2
            r7 = r18
            r5 = r19
            r2 = r29
            goto L_0x0298
        L_0x0334:
            r5 = 7
            r23 = r2
            r7 = r18
            r2 = r29
            r18 = r17
            r41 = r16
            r16 = r5
            r5 = r19
            r19 = r13
            r13 = r21
            r21 = r6
            r6 = r20
            r20 = r14
            r14 = r41
            goto L_0x0451
        L_0x0351:
            r5 = r19
            r2 = r23
            r3 = r30
            boolean r7 = r12.equals(r5)
            if (r7 != 0) goto L_0x0369
            r23 = r2
            r19 = r13
            r7 = r18
            r13 = r21
            r2 = r29
            goto L_0x03d3
        L_0x0369:
            r7 = 6
            r23 = r2
            r19 = r13
            r13 = r21
            r2 = r29
            r21 = r6
            r6 = r20
            r20 = r14
            r14 = r16
            r16 = r7
            r7 = r18
            goto L_0x0405
        L_0x0380:
            r7 = r18
            r5 = r19
            r2 = r23
            r3 = r30
            boolean r18 = r12.equals(r7)
            r19 = r13
            if (r18 != 0) goto L_0x0398
            r18 = r17
            r13 = r21
            r2 = r29
            goto L_0x029e
        L_0x0398:
            r18 = r17
            r13 = r21
            r2 = r29
            r21 = r6
            r6 = r20
            r20 = r14
            r14 = r16
            r16 = r27
            goto L_0x0451
        L_0x03aa:
            r7 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            boolean r18 = r12.equals(r2)
            if (r18 != 0) goto L_0x03ba
            goto L_0x0298
        L_0x03ba:
            r18 = 4
            r19 = r13
            r13 = r21
            goto L_0x03db
        L_0x03c1:
            r7 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            boolean r18 = r12.equals(r13)
            if (r18 != 0) goto L_0x03d9
        L_0x03d3:
            r21 = r6
            r18 = r17
            goto L_0x02a0
        L_0x03d9:
            r18 = 3
        L_0x03db:
            r21 = r6
            r6 = r20
            goto L_0x03ff
        L_0x03e0:
            r7 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            r21 = r6
            r6 = r20
            boolean r18 = r12.equals(r6)
            if (r18 != 0) goto L_0x03fd
            r20 = r14
            r14 = r16
            r18 = r17
            goto L_0x044f
        L_0x03fd:
            r18 = 2
        L_0x03ff:
            r20 = r14
            r14 = r16
            r16 = r18
        L_0x0405:
            r18 = r17
            goto L_0x0451
        L_0x0408:
            r7 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            r21 = r6
            r6 = r20
            r20 = r14
            r14 = r17
            boolean r17 = r12.equals(r14)
            if (r17 != 0) goto L_0x0426
            r18 = r14
            goto L_0x02a4
        L_0x0426:
            r17 = 1
            r18 = r14
            r14 = r16
            r16 = r17
            goto L_0x0451
        L_0x042f:
            r7 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r6
            r6 = r20
            r20 = r14
            r14 = r16
            boolean r16 = r12.equals(r14)
            if (r16 != 0) goto L_0x044c
            goto L_0x044f
        L_0x044c:
            r16 = 0
            goto L_0x0451
        L_0x044f:
            r16 = -1
        L_0x0451:
            switch(r16) {
                case 0: goto L_0x04b2;
                case 1: goto L_0x04ac;
                case 2: goto L_0x04a6;
                case 3: goto L_0x04a0;
                case 4: goto L_0x049a;
                case 5: goto L_0x0494;
                case 6: goto L_0x048e;
                case 7: goto L_0x0488;
                case 8: goto L_0x0482;
                case 9: goto L_0x047c;
                case 10: goto L_0x0476;
                case 11: goto L_0x0470;
                case 12: goto L_0x046a;
                case 13: goto L_0x0464;
                case 14: goto L_0x045e;
                case 15: goto L_0x0458;
                default: goto L_0x0454;
            }
        L_0x0454:
            r16 = 0
            goto L_0x04b7
        L_0x0458:
            androidx.constraintlayout.motion.widget.r$a r16 = new androidx.constraintlayout.motion.widget.r$a
            r16.<init>()
            goto L_0x04b7
        L_0x045e:
            androidx.constraintlayout.motion.widget.r$a r16 = new androidx.constraintlayout.motion.widget.r$a
            r16.<init>()
            goto L_0x04b7
        L_0x0464:
            androidx.constraintlayout.motion.widget.r$d r16 = new androidx.constraintlayout.motion.widget.r$d
            r16.<init>()
            goto L_0x04b7
        L_0x046a:
            androidx.constraintlayout.motion.widget.r$c r16 = new androidx.constraintlayout.motion.widget.r$c
            r16.<init>()
            goto L_0x04b7
        L_0x0470:
            androidx.constraintlayout.motion.widget.r$h r16 = new androidx.constraintlayout.motion.widget.r$h
            r16.<init>()
            goto L_0x04b7
        L_0x0476:
            androidx.constraintlayout.motion.widget.r$f r16 = new androidx.constraintlayout.motion.widget.r$f
            r16.<init>()
            goto L_0x04b7
        L_0x047c:
            androidx.constraintlayout.motion.widget.r$e r16 = new androidx.constraintlayout.motion.widget.r$e
            r16.<init>()
            goto L_0x04b7
        L_0x0482:
            androidx.constraintlayout.motion.widget.r$a r16 = new androidx.constraintlayout.motion.widget.r$a
            r16.<init>()
            goto L_0x04b7
        L_0x0488:
            androidx.constraintlayout.motion.widget.r$l r16 = new androidx.constraintlayout.motion.widget.r$l
            r16.<init>()
            goto L_0x04b7
        L_0x048e:
            androidx.constraintlayout.motion.widget.r$k r16 = new androidx.constraintlayout.motion.widget.r$k
            r16.<init>()
            goto L_0x04b7
        L_0x0494:
            androidx.constraintlayout.motion.widget.r$g r16 = new androidx.constraintlayout.motion.widget.r$g
            r16.<init>()
            goto L_0x04b7
        L_0x049a:
            androidx.constraintlayout.motion.widget.r$o r16 = new androidx.constraintlayout.motion.widget.r$o
            r16.<init>()
            goto L_0x04b7
        L_0x04a0:
            androidx.constraintlayout.motion.widget.r$n r16 = new androidx.constraintlayout.motion.widget.r$n
            r16.<init>()
            goto L_0x04b7
        L_0x04a6:
            androidx.constraintlayout.motion.widget.r$m r16 = new androidx.constraintlayout.motion.widget.r$m
            r16.<init>()
            goto L_0x04b7
        L_0x04ac:
            androidx.constraintlayout.motion.widget.r$j r16 = new androidx.constraintlayout.motion.widget.r$j
            r16.<init>()
            goto L_0x04b7
        L_0x04b2:
            androidx.constraintlayout.motion.widget.r$i r16 = new androidx.constraintlayout.motion.widget.r$i
            r16.<init>()
        L_0x04b7:
            r17 = r14
            r14 = r16
        L_0x04bb:
            if (r14 != 0) goto L_0x04da
            r29 = r2
            r30 = r3
            r16 = r17
            r17 = r18
            r14 = r20
            r2 = r28
            r3 = r32
            r20 = r6
            r18 = r7
            r6 = r21
            r7 = r31
            r21 = r13
            r13 = r19
            r19 = r5
            goto L_0x04ff
        L_0x04da:
            r14.f5007e = r12
            r16 = r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r6 = r0.f4943w
            r6.put(r12, r14)
            r29 = r2
            r30 = r3
            r14 = r20
            r6 = r21
            r2 = r28
            r3 = r32
            r21 = r13
            r20 = r16
            r16 = r17
            r17 = r18
            r13 = r19
            r19 = r5
            r18 = r7
            r7 = r31
        L_0x04ff:
            r5 = r45
            goto L_0x020b
        L_0x0503:
            r28 = r2
            r32 = r3
            r31 = r7
            r7 = r18
            r5 = r19
            r13 = r21
            r2 = r29
            r3 = r30
            r21 = r6
            r18 = r17
            r17 = r16
            r16 = r20
            r20 = r14
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r6 = r0.f4941u
            if (r6 == 0) goto L_0x053b
            java.util.Iterator r6 = r6.iterator()
        L_0x0525:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x053b
            java.lang.Object r12 = r6.next()
            androidx.constraintlayout.motion.widget.c r12 = (androidx.constraintlayout.motion.widget.C2116c) r12
            boolean r14 = r12 instanceof androidx.constraintlayout.motion.widget.C2117d
            if (r14 == 0) goto L_0x0525
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r14 = r0.f4943w
            r12.mo8136a(r14)
            goto L_0x0525
        L_0x053b:
            androidx.constraintlayout.motion.widget.n r6 = r0.f4926f
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r12 = r0.f4943w
            r14 = 0
            r6.mo8149a(r12, r14)
            androidx.constraintlayout.motion.widget.n r6 = r0.f4927g
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r12 = r0.f4943w
            r14 = 100
            r6.mo8149a(r12, r14)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r6 = r0.f4943w
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0556:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x059e
            java.lang.Object r12 = r6.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r14 = r4.containsKey(r12)
            if (r14 == 0) goto L_0x0573
            java.lang.Object r14 = r4.get(r12)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L_0x0574
        L_0x0573:
            r14 = 0
        L_0x0574:
            r45 = r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r6 = r0.f4943w
            java.lang.Object r6 = r6.get(r12)
            androidx.constraintlayout.motion.widget.r r6 = (androidx.constraintlayout.motion.widget.C2154r) r6
            r6.mo8182d(r14)
            r6 = r45
            goto L_0x0556
        L_0x0584:
            r28 = r2
            r32 = r3
            r31 = r7
            r7 = r18
            r5 = r19
            r13 = r21
            r2 = r29
            r3 = r30
            r21 = r6
            r18 = r17
            r17 = r16
            r16 = r20
            r20 = r14
        L_0x059e:
            boolean r6 = r1.isEmpty()
            java.lang.String r12 = "CUSTOM"
            if (r6 != 0) goto L_0x0af7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r6 = r0.f4942v
            if (r6 != 0) goto L_0x05b1
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0.f4942v = r6
        L_0x05b1:
            java.util.Iterator r1 = r1.iterator()
        L_0x05b5:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x073c
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r14 = r0.f4942v
            boolean r14 = r14.containsKey(r6)
            if (r14 == 0) goto L_0x05ca
            goto L_0x05b5
        L_0x05ca:
            boolean r14 = r6.startsWith(r15)
            if (r14 == 0) goto L_0x0624
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r45 = r1
            r1 = r31
            java.lang.String[] r19 = r6.split(r1)
            r23 = 1
            r1 = r19[r23]
            r19 = r15
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r15 = r0.f4941u
            java.util.Iterator r15 = r15.iterator()
        L_0x05e9:
            boolean r23 = r15.hasNext()
            if (r23 == 0) goto L_0x0612
            java.lang.Object r23 = r15.next()
            r29 = r15
            r15 = r23
            androidx.constraintlayout.motion.widget.c r15 = (androidx.constraintlayout.motion.widget.C2116c) r15
            r23 = r4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r15.f4797d
            if (r4 != 0) goto L_0x0600
            goto L_0x060d
        L_0x0600:
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            if (r4 == 0) goto L_0x060d
            int r15 = r15.f4794a
            r14.append(r15, r4)
        L_0x060d:
            r4 = r23
            r15 = r29
            goto L_0x05e9
        L_0x0612:
            r23 = r4
            androidx.constraintlayout.motion.widget.s$b r1 = new androidx.constraintlayout.motion.widget.s$b
            r1.<init>(r6, r14)
            r15 = r1
            r1 = r16
            r4 = r18
            r16 = r13
            r13 = r46
            goto L_0x0724
        L_0x0624:
            r45 = r1
            r23 = r4
            r19 = r15
            int r1 = r6.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x06ba;
                case -1249320805: goto L_0x06a8;
                case -1225497657: goto L_0x0698;
                case -1225497656: goto L_0x068f;
                case -1225497655: goto L_0x0686;
                case -1001078227: goto L_0x0676;
                case -908189618: goto L_0x066a;
                case -908189617: goto L_0x0661;
                case -40300674: goto L_0x0657;
                case -4379043: goto L_0x064d;
                case 37232917: goto L_0x0643;
                case 92909918: goto L_0x0639;
                default: goto L_0x0631;
            }
        L_0x0631:
            r1 = r16
        L_0x0633:
            r14 = r17
            r4 = r18
            goto L_0x06c9
        L_0x0639:
            boolean r1 = r6.equals(r8)
            if (r1 != 0) goto L_0x0640
            goto L_0x0631
        L_0x0640:
            r1 = r22
            goto L_0x0672
        L_0x0643:
            boolean r1 = r6.equals(r11)
            if (r1 != 0) goto L_0x064a
            goto L_0x0631
        L_0x064a:
            r1 = r24
            goto L_0x0672
        L_0x064d:
            boolean r1 = r6.equals(r9)
            if (r1 != 0) goto L_0x0654
            goto L_0x0631
        L_0x0654:
            r1 = r25
            goto L_0x0672
        L_0x0657:
            boolean r1 = r6.equals(r10)
            if (r1 != 0) goto L_0x065e
            goto L_0x0631
        L_0x065e:
            r1 = r26
            goto L_0x0672
        L_0x0661:
            boolean r1 = r6.equals(r3)
            if (r1 != 0) goto L_0x0668
            goto L_0x0631
        L_0x0668:
            r1 = 7
            goto L_0x0672
        L_0x066a:
            boolean r1 = r6.equals(r5)
            if (r1 != 0) goto L_0x0671
            goto L_0x0631
        L_0x0671:
            r1 = 6
        L_0x0672:
            r15 = r1
            r1 = r16
            goto L_0x06a3
        L_0x0676:
            boolean r1 = r6.equals(r7)
            if (r1 != 0) goto L_0x067d
            goto L_0x0631
        L_0x067d:
            r1 = r16
            r14 = r17
            r4 = r18
            r15 = r27
            goto L_0x06ca
        L_0x0686:
            boolean r1 = r6.equals(r2)
            if (r1 != 0) goto L_0x068d
            goto L_0x0631
        L_0x068d:
            r1 = 4
            goto L_0x0672
        L_0x068f:
            boolean r1 = r6.equals(r13)
            if (r1 != 0) goto L_0x0696
            goto L_0x0631
        L_0x0696:
            r1 = 3
            goto L_0x0672
        L_0x0698:
            r1 = r16
            boolean r4 = r6.equals(r1)
            if (r4 != 0) goto L_0x06a1
            goto L_0x0633
        L_0x06a1:
            r4 = 2
            r15 = r4
        L_0x06a3:
            r14 = r17
            r4 = r18
            goto L_0x06ca
        L_0x06a8:
            r1 = r16
            r4 = r18
            boolean r14 = r6.equals(r4)
            if (r14 != 0) goto L_0x06b5
            r14 = r17
            goto L_0x06c9
        L_0x06b5:
            r14 = 1
            r15 = r14
            r14 = r17
            goto L_0x06ca
        L_0x06ba:
            r1 = r16
            r14 = r17
            r4 = r18
            boolean r15 = r6.equals(r14)
            if (r15 != 0) goto L_0x06c7
            goto L_0x06c9
        L_0x06c7:
            r15 = 0
            goto L_0x06ca
        L_0x06c9:
            r15 = -1
        L_0x06ca:
            switch(r15) {
                case 0: goto L_0x0717;
                case 1: goto L_0x0711;
                case 2: goto L_0x070b;
                case 3: goto L_0x0705;
                case 4: goto L_0x06ff;
                case 5: goto L_0x06f9;
                case 6: goto L_0x06f3;
                case 7: goto L_0x06ed;
                case 8: goto L_0x06e7;
                case 9: goto L_0x06e1;
                case 10: goto L_0x06db;
                case 11: goto L_0x06d5;
                default: goto L_0x06cd;
            }
        L_0x06cd:
            r16 = r13
            r17 = r14
            r13 = r46
            r15 = 0
            goto L_0x0724
        L_0x06d5:
            androidx.constraintlayout.motion.widget.s$a r15 = new androidx.constraintlayout.motion.widget.s$a
            r15.<init>()
            goto L_0x071c
        L_0x06db:
            androidx.constraintlayout.motion.widget.s$d r15 = new androidx.constraintlayout.motion.widget.s$d
            r15.<init>()
            goto L_0x071c
        L_0x06e1:
            androidx.constraintlayout.motion.widget.s$c r15 = new androidx.constraintlayout.motion.widget.s$c
            r15.<init>()
            goto L_0x071c
        L_0x06e7:
            androidx.constraintlayout.motion.widget.s$f r15 = new androidx.constraintlayout.motion.widget.s$f
            r15.<init>()
            goto L_0x071c
        L_0x06ed:
            androidx.constraintlayout.motion.widget.s$j r15 = new androidx.constraintlayout.motion.widget.s$j
            r15.<init>()
            goto L_0x071c
        L_0x06f3:
            androidx.constraintlayout.motion.widget.s$i r15 = new androidx.constraintlayout.motion.widget.s$i
            r15.<init>()
            goto L_0x071c
        L_0x06f9:
            androidx.constraintlayout.motion.widget.s$e r15 = new androidx.constraintlayout.motion.widget.s$e
            r15.<init>()
            goto L_0x071c
        L_0x06ff:
            androidx.constraintlayout.motion.widget.s$m r15 = new androidx.constraintlayout.motion.widget.s$m
            r15.<init>()
            goto L_0x071c
        L_0x0705:
            androidx.constraintlayout.motion.widget.s$l r15 = new androidx.constraintlayout.motion.widget.s$l
            r15.<init>()
            goto L_0x071c
        L_0x070b:
            androidx.constraintlayout.motion.widget.s$k r15 = new androidx.constraintlayout.motion.widget.s$k
            r15.<init>()
            goto L_0x071c
        L_0x0711:
            androidx.constraintlayout.motion.widget.s$h r15 = new androidx.constraintlayout.motion.widget.s$h
            r15.<init>()
            goto L_0x071c
        L_0x0717:
            androidx.constraintlayout.motion.widget.s$g r15 = new androidx.constraintlayout.motion.widget.s$g
            r15.<init>()
        L_0x071c:
            r16 = r13
            r17 = r14
            r13 = r46
            r15.f5019i = r13
        L_0x0724:
            if (r15 != 0) goto L_0x0727
            goto L_0x072e
        L_0x0727:
            r15.f5016f = r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r13 = r0.f4942v
            r13.put(r6, r15)
        L_0x072e:
            r18 = r4
            r13 = r16
            r15 = r19
            r4 = r23
            r16 = r1
            r1 = r45
            goto L_0x05b5
        L_0x073c:
            r23 = r4
            r19 = r15
            r1 = r16
            r4 = r18
            r16 = r13
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r6 = r0.f4941u
            if (r6 == 0) goto L_0x0ab5
            java.util.Iterator r6 = r6.iterator()
        L_0x074e:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0ab5
            java.lang.Object r13 = r6.next()
            androidx.constraintlayout.motion.widget.c r13 = (androidx.constraintlayout.motion.widget.C2116c) r13
            boolean r14 = r13 instanceof androidx.constraintlayout.motion.widget.C2143l
            if (r14 == 0) goto L_0x0a9d
            androidx.constraintlayout.motion.widget.l r13 = (androidx.constraintlayout.motion.widget.C2143l) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r14 = r0.f4942v
            r13.getClass()
            java.util.Set r15 = r14.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x076d:
            boolean r18 = r15.hasNext()
            if (r18 == 0) goto L_0x0a9d
            java.lang.Object r18 = r15.next()
            r45 = r6
            r6 = r18
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r18 = r14.get(r6)
            r33 = r18
            androidx.constraintlayout.motion.widget.s r33 = (androidx.constraintlayout.motion.widget.C2170s) r33
            boolean r18 = r6.startsWith(r12)
            if (r18 == 0) goto L_0x07e2
            r18 = r14
            r14 = 7
            java.lang.String r6 = r6.substring(r14)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.f4797d
            java.lang.Object r6 = r14.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x07db
            r14 = r33
            androidx.constraintlayout.motion.widget.s$b r14 = (androidx.constraintlayout.motion.widget.C2170s.C2172b) r14
            r46 = r15
            int r15 = r13.f4794a
            r29 = r12
            float r12 = r13.f4881s
            int r0 = r13.f4880r
            r30 = r4
            float r4 = r13.f4882t
            r47 = r13
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r13 = r14.f5022l
            r13.append(r15, r6)
            android.util.SparseArray<float[]> r6 = r14.f5023m
            r13 = 2
            float[] r13 = new float[r13]
            r31 = 0
            r13[r31] = r12
            r12 = 1
            r13[r12] = r4
            r6.append(r15, r13)
            int r4 = r14.f5012b
            int r0 = java.lang.Math.max(r4, r0)
            r14.f5012b = r0
            r0 = r43
            r6 = r45
            r15 = r46
            r13 = r47
            r14 = r18
            r12 = r29
            r4 = r30
            goto L_0x076d
        L_0x07db:
            r0 = r43
            r6 = r45
            r14 = r18
            goto L_0x076d
        L_0x07e2:
            r30 = r4
            r29 = r12
            r47 = r13
            r18 = r14
            r46 = r15
            int r0 = r6.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x087f;
                case -1249320805: goto L_0x086d;
                case -1225497657: goto L_0x0859;
                case -1225497656: goto L_0x084e;
                case -1225497655: goto L_0x0842;
                case -1001078227: goto L_0x0834;
                case -908189618: goto L_0x0828;
                case -908189617: goto L_0x081f;
                case -40300674: goto L_0x0815;
                case -4379043: goto L_0x080b;
                case 37232917: goto L_0x0801;
                case 92909918: goto L_0x07f7;
                default: goto L_0x07f3;
            }
        L_0x07f3:
            r0 = r16
            goto L_0x0861
        L_0x07f7:
            boolean r0 = r6.equals(r8)
            if (r0 != 0) goto L_0x07fe
            goto L_0x07f3
        L_0x07fe:
            r0 = r22
            goto L_0x084a
        L_0x0801:
            boolean r0 = r6.equals(r11)
            if (r0 != 0) goto L_0x0808
            goto L_0x07f3
        L_0x0808:
            r0 = r24
            goto L_0x084a
        L_0x080b:
            boolean r0 = r6.equals(r9)
            if (r0 != 0) goto L_0x0812
            goto L_0x07f3
        L_0x0812:
            r0 = r25
            goto L_0x084a
        L_0x0815:
            boolean r0 = r6.equals(r10)
            if (r0 != 0) goto L_0x081c
            goto L_0x07f3
        L_0x081c:
            r0 = r26
            goto L_0x084a
        L_0x081f:
            boolean r0 = r6.equals(r3)
            if (r0 != 0) goto L_0x0826
            goto L_0x07f3
        L_0x0826:
            r0 = 7
            goto L_0x0830
        L_0x0828:
            boolean r0 = r6.equals(r5)
            if (r0 != 0) goto L_0x082f
            goto L_0x07f3
        L_0x082f:
            r0 = 6
        L_0x0830:
            r13 = r0
            r0 = r16
            goto L_0x0868
        L_0x0834:
            boolean r0 = r6.equals(r7)
            if (r0 != 0) goto L_0x083b
            goto L_0x07f3
        L_0x083b:
            r0 = r16
            r12 = r17
            r13 = r27
            goto L_0x086a
        L_0x0842:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L_0x0849
            goto L_0x07f3
        L_0x0849:
            r0 = 4
        L_0x084a:
            r4 = r0
            r0 = r16
            goto L_0x0867
        L_0x084e:
            r0 = r16
            boolean r4 = r6.equals(r0)
            if (r4 != 0) goto L_0x0857
            goto L_0x0861
        L_0x0857:
            r4 = 3
            goto L_0x0867
        L_0x0859:
            r0 = r16
            boolean r4 = r6.equals(r1)
            if (r4 != 0) goto L_0x0866
        L_0x0861:
            r12 = r17
            r4 = r30
            goto L_0x088e
        L_0x0866:
            r4 = 2
        L_0x0867:
            r13 = r4
        L_0x0868:
            r12 = r17
        L_0x086a:
            r4 = r30
            goto L_0x088f
        L_0x086d:
            r0 = r16
            r4 = r30
            boolean r12 = r6.equals(r4)
            if (r12 != 0) goto L_0x087a
            r12 = r17
            goto L_0x088e
        L_0x087a:
            r12 = 1
            r13 = r12
            r12 = r17
            goto L_0x088f
        L_0x087f:
            r0 = r16
            r12 = r17
            r4 = r30
            boolean r13 = r6.equals(r12)
            if (r13 != 0) goto L_0x088c
            goto L_0x088e
        L_0x088c:
            r13 = 0
            goto L_0x088f
        L_0x088e:
            r13 = -1
        L_0x088f:
            switch(r13) {
                case 0: goto L_0x0a66;
                case 1: goto L_0x0a40;
                case 2: goto L_0x0a1a;
                case 3: goto L_0x09f3;
                case 4: goto L_0x09cc;
                case 5: goto L_0x09a5;
                case 6: goto L_0x097e;
                case 7: goto L_0x0957;
                case 8: goto L_0x0930;
                case 9: goto L_0x0909;
                case 10: goto L_0x08e2;
                case 11: goto L_0x08b5;
                default: goto L_0x0892;
            }
        L_0x0892:
            r13 = r47
            r17 = r4
            r16 = r12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "UNKNOWN addValues \""
            r4.append(r12)
            r4.append(r6)
            java.lang.String r6 = "\""
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "KeyTimeCycles"
            android.util.Log.e(r6, r4)
            goto L_0x0a8b
        L_0x08b5:
            r13 = r47
            float r6 = r13.f4868f
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x08dc
            int r6 = r13.f4794a
            float r14 = r13.f4868f
            float r15 = r13.f4881s
            r16 = r12
            int r12 = r13.f4880r
            r17 = r4
            float r4 = r13.f4882t
            r34 = r14
            r35 = r15
            r36 = r4
            r37 = r6
            r38 = r12
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x08dc:
            r17 = r4
            r16 = r12
            goto L_0x0a8b
        L_0x08e2:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4873k
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4873k
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x0909:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4869g
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4869g
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x0930:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4870h
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4870h
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x0957:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4875m
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4875m
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x097e:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4874l
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4874l
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x09a5:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4879q
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4879q
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x09cc:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4878p
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4878p
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x09f3:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4877o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4877o
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x0a1a:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4876n
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4876n
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x0a40:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4872j
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4872j
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
            goto L_0x0a8b
        L_0x0a66:
            r13 = r47
            r17 = r4
            r16 = r12
            float r4 = r13.f4871i
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0a8b
            int r4 = r13.f4794a
            float r6 = r13.f4871i
            float r12 = r13.f4881s
            int r14 = r13.f4880r
            float r15 = r13.f4882t
            r34 = r6
            r35 = r12
            r36 = r15
            r37 = r4
            r38 = r14
            r33.mo8186c(r34, r35, r36, r37, r38)
        L_0x0a8b:
            r6 = r45
            r15 = r46
            r4 = r17
            r14 = r18
            r12 = r29
            r17 = r16
            r16 = r0
            r0 = r43
            goto L_0x076d
        L_0x0a9d:
            r45 = r6
            r29 = r12
            r0 = r16
            r16 = r17
            r17 = r4
            r6 = r45
            r4 = r17
            r12 = r29
            r17 = r16
            r16 = r0
            r0 = r43
            goto L_0x074e
        L_0x0ab5:
            r29 = r12
            r0 = r16
            r16 = r17
            r17 = r4
            r4 = r43
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r6 = r4.f4942v
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0ac9:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0b03
            java.lang.Object r12 = r6.next()
            java.lang.String r12 = (java.lang.String) r12
            r13 = r23
            boolean r14 = r13.containsKey(r12)
            if (r14 == 0) goto L_0x0ae8
            java.lang.Object r14 = r13.get(r12)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L_0x0ae9
        L_0x0ae8:
            r14 = 0
        L_0x0ae9:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r15 = r4.f4942v
            java.lang.Object r12 = r15.get(r12)
            androidx.constraintlayout.motion.widget.s r12 = (androidx.constraintlayout.motion.widget.C2170s) r12
            r12.mo8188e(r14)
            r23 = r13
            goto L_0x0ac9
        L_0x0af7:
            r4 = r0
            r29 = r12
            r0 = r13
            r19 = r15
            r1 = r16
            r16 = r17
            r17 = r18
        L_0x0b03:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r6 = r4.f4939s
            int r6 = r6.size()
            int r6 = r6 + 2
            androidx.constraintlayout.motion.widget.p[] r12 = new androidx.constraintlayout.motion.widget.C2149p[r6]
            androidx.constraintlayout.motion.widget.p r13 = r4.f4924d
            r14 = 0
            r12[r14] = r13
            int r13 = r6 + -1
            androidx.constraintlayout.motion.widget.p r15 = r4.f4925e
            r12[r13] = r15
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r13 = r4.f4939s
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0b27
            int r13 = r4.f4923c
            r15 = -1
            if (r13 != r15) goto L_0x0b27
            r4.f4923c = r14
        L_0x0b27:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r13 = r4.f4939s
            java.util.Iterator r13 = r13.iterator()
            r14 = 1
        L_0x0b2e:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0b41
            java.lang.Object r15 = r13.next()
            androidx.constraintlayout.motion.widget.p r15 = (androidx.constraintlayout.motion.widget.C2149p) r15
            int r18 = r14 + 1
            r12[r14] = r15
            r14 = r18
            goto L_0x0b2e
        L_0x0b41:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            androidx.constraintlayout.motion.widget.p r14 = r4.f4925e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.f4958l
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0b52:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0b94
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r45 = r14
            androidx.constraintlayout.motion.widget.p r14 = r4.f4924d
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.f4958l
            boolean r14 = r14.containsKey(r15)
            if (r14 == 0) goto L_0x0b89
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = r1
            r1 = r19
            r14.append(r1)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r1 = r28
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L_0x0b8d
            r13.add(r15)
            goto L_0x0b8d
        L_0x0b89:
            r18 = r1
            r1 = r28
        L_0x0b8d:
            r14 = r45
            r28 = r1
            r1 = r18
            goto L_0x0b52
        L_0x0b94:
            r18 = r1
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r13.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r4.f4936p = r1
            int r1 = r1.length
            int[] r1 = new int[r1]
            r4.f4937q = r1
            r1 = 0
        L_0x0ba7:
            java.lang.String[] r13 = r4.f4936p
            int r14 = r13.length
            if (r1 >= r14) goto L_0x0bdd
            r13 = r13[r1]
            int[] r14 = r4.f4937q
            r15 = 0
            r14[r1] = r15
            r14 = 0
        L_0x0bb4:
            if (r14 >= r6) goto L_0x0bda
            r15 = r12[r14]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r15.f4958l
            boolean r15 = r15.containsKey(r13)
            if (r15 == 0) goto L_0x0bd7
            int[] r15 = r4.f4937q
            r19 = r15[r1]
            r14 = r12[r14]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.f4958l
            java.lang.Object r13 = r14.get(r13)
            androidx.constraintlayout.widget.ConstraintAttribute r13 = (androidx.constraintlayout.widget.ConstraintAttribute) r13
            int r13 = r13.mo8404d()
            int r13 = r13 + r19
            r15[r1] = r13
            goto L_0x0bda
        L_0x0bd7:
            int r14 = r14 + 1
            goto L_0x0bb4
        L_0x0bda:
            int r1 = r1 + 1
            goto L_0x0ba7
        L_0x0bdd:
            r1 = 0
            r1 = r12[r1]
            int r1 = r1.f4957k
            r14 = -1
            if (r1 == r14) goto L_0x0be7
            r1 = 1
            goto L_0x0be8
        L_0x0be7:
            r1 = 0
        L_0x0be8:
            int r13 = r13.length
            int r13 = r13 + 18
            boolean[] r14 = new boolean[r13]
            r15 = 1
        L_0x0bee:
            if (r15 >= r6) goto L_0x0c5d
            r19 = r0
            r0 = r12[r15]
            int r23 = r15 + -1
            r28 = r2
            r2 = r12[r23]
            r0.getClass()
            r23 = 0
            boolean r30 = r14[r23]
            r31 = r7
            float r7 = r0.f4951e
            r33 = r5
            float r5 = r2.f4951e
            boolean r5 = androidx.constraintlayout.motion.widget.C2149p.m4619c(r7, r5)
            r5 = r30 | r5
            r14[r23] = r5
            r5 = 1
            boolean r5 = r14[r5]
            float r7 = r0.f4952f
            r30 = r3
            float r3 = r2.f4952f
            boolean r3 = androidx.constraintlayout.motion.widget.C2149p.m4619c(r7, r3)
            r3 = r3 | r1
            r3 = r3 | r5
            r5 = 1
            r14[r5] = r3
            r3 = 2
            boolean r3 = r14[r3]
            float r5 = r0.f4953g
            float r7 = r2.f4953g
            boolean r5 = androidx.constraintlayout.motion.widget.C2149p.m4619c(r5, r7)
            r5 = r5 | r1
            r3 = r3 | r5
            r5 = 2
            r14[r5] = r3
            r3 = 3
            boolean r3 = r14[r3]
            float r5 = r0.f4954h
            float r7 = r2.f4954h
            boolean r5 = androidx.constraintlayout.motion.widget.C2149p.m4619c(r5, r7)
            r3 = r3 | r5
            r5 = 3
            r14[r5] = r3
            r3 = 4
            boolean r5 = r14[r3]
            float r0 = r0.f4955i
            float r2 = r2.f4955i
            boolean r0 = androidx.constraintlayout.motion.widget.C2149p.m4619c(r0, r2)
            r0 = r0 | r5
            r14[r3] = r0
            int r15 = r15 + 1
            r0 = r19
            r2 = r28
            r3 = r30
            r7 = r31
            r5 = r33
            goto L_0x0bee
        L_0x0c5d:
            r19 = r0
            r28 = r2
            r30 = r3
            r33 = r5
            r31 = r7
            r0 = 0
            r1 = 1
        L_0x0c69:
            if (r1 >= r13) goto L_0x0c74
            boolean r2 = r14[r1]
            if (r2 == 0) goto L_0x0c71
            int r0 = r0 + 1
        L_0x0c71:
            int r1 = r1 + 1
            goto L_0x0c69
        L_0x0c74:
            int[] r1 = new int[r0]
            r4.f4933m = r1
            double[] r1 = new double[r0]
            r4.f4934n = r1
            double[] r0 = new double[r0]
            r4.f4935o = r0
            r0 = 0
            r1 = 1
        L_0x0c82:
            if (r1 >= r13) goto L_0x0c92
            boolean r2 = r14[r1]
            if (r2 == 0) goto L_0x0c8f
            int[] r2 = r4.f4933m
            int r3 = r0 + 1
            r2[r0] = r1
            r0 = r3
        L_0x0c8f:
            int r1 = r1 + 1
            goto L_0x0c82
        L_0x0c92:
            int[] r0 = r4.f4933m
            int r0 = r0.length
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 1
            r1[r2] = r0
            r0 = 0
            r1[r0] = r6
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            double[][] r0 = (double[][]) r0
            double[] r1 = new double[r6]
            r2 = 0
        L_0x0ca9:
            if (r2 >= r6) goto L_0x0d09
            r3 = r12[r2]
            r5 = r0[r2]
            int[] r7 = r4.f4933m
            r13 = 6
            float[] r13 = new float[r13]
            float r14 = r3.f4951e
            r15 = 0
            r13[r15] = r14
            float r14 = r3.f4952f
            r15 = 1
            r13[r15] = r14
            float r14 = r3.f4953g
            r15 = 2
            r13[r15] = r14
            float r14 = r3.f4954h
            r15 = 3
            r13[r15] = r14
            float r14 = r3.f4955i
            r15 = 4
            r13[r15] = r14
            float r3 = r3.f4956j
            r13[r27] = r3
            r3 = 0
            r14 = 0
        L_0x0cd3:
            int r15 = r7.length
            if (r3 >= r15) goto L_0x0cf7
            r15 = r7[r3]
            r23 = r7
            r7 = 6
            if (r15 >= r7) goto L_0x0cea
            int r7 = r14 + 1
            r15 = r13[r15]
            r34 = r9
            r35 = r10
            double r9 = (double) r15
            r5[r14] = r9
            r14 = r7
            goto L_0x0cee
        L_0x0cea:
            r34 = r9
            r35 = r10
        L_0x0cee:
            int r3 = r3 + 1
            r7 = r23
            r9 = r34
            r10 = r35
            goto L_0x0cd3
        L_0x0cf7:
            r34 = r9
            r35 = r10
            r3 = r12[r2]
            float r3 = r3.f4950d
            double r9 = (double) r3
            r1[r2] = r9
            int r2 = r2 + 1
            r9 = r34
            r10 = r35
            goto L_0x0ca9
        L_0x0d09:
            r34 = r9
            r35 = r10
            r3 = 0
        L_0x0d0e:
            int[] r5 = r4.f4933m
            int r7 = r5.length
            if (r3 >= r7) goto L_0x0d43
            r5 = r5[r3]
            java.lang.String[] r7 = androidx.constraintlayout.motion.widget.C2149p.f4947p
            r9 = 6
            if (r5 >= r9) goto L_0x0d40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int[] r9 = r4.f4933m
            r9 = r9[r3]
            r7 = r7[r9]
            java.lang.String r9 = " ["
            java.lang.String r5 = p003a2.C0023f.m110k(r5, r7, r9)
            r7 = 0
        L_0x0d2c:
            if (r7 >= r6) goto L_0x0d40
            java.lang.StringBuilder r5 = android.support.p013v4.media.C0072d.m201h(r5)
            r9 = r0[r7]
            r13 = r9[r3]
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            int r7 = r7 + 1
            goto L_0x0d2c
        L_0x0d40:
            int r3 = r3 + 1
            goto L_0x0d0e
        L_0x0d43:
            java.lang.String[] r3 = r4.f4936p
            int r3 = r3.length
            int r3 = r3 + 1
            n0.b[] r3 = new p184n0.C7361b[r3]
            r4.f4928h = r3
            r3 = 0
        L_0x0d4d:
            java.lang.String[] r5 = r4.f4936p
            int r7 = r5.length
            if (r3 >= r7) goto L_0x0e00
            r5 = r5[r3]
            r7 = 0
            r9 = 0
            r10 = 0
            r13 = 0
        L_0x0d58:
            if (r7 >= r6) goto L_0x0de5
            r14 = r12[r7]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.f4958l
            boolean r14 = r14.containsKey(r5)
            if (r14 == 0) goto L_0x0dd9
            if (r13 != 0) goto L_0x0d87
            double[] r10 = new double[r6]
            r13 = r12[r7]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.f4958l
            java.lang.Object r13 = r13.get(r5)
            androidx.constraintlayout.widget.ConstraintAttribute r13 = (androidx.constraintlayout.widget.ConstraintAttribute) r13
            int r13 = r13.mo8404d()
            r14 = 2
            int[] r14 = new int[r14]
            r15 = 1
            r14[r15] = r13
            r13 = 0
            r14[r13] = r6
            java.lang.Class r13 = java.lang.Double.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r13, r14)
            double[][] r13 = (double[][]) r13
        L_0x0d87:
            r14 = r12[r7]
            float r15 = r14.f4950d
            r23 = r3
            double r2 = (double) r15
            r10[r9] = r2
            r2 = r13[r9]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r14.f4958l
            java.lang.Object r3 = r3.get(r5)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            int r14 = r3.mo8404d()
            r15 = 1
            if (r14 != r15) goto L_0x0dae
            float r3 = r3.mo8402b()
            double r14 = (double) r3
            r3 = 0
            r2[r3] = r14
        L_0x0da9:
            r46 = r5
            r47 = r13
            goto L_0x0dd4
        L_0x0dae:
            int r14 = r3.mo8404d()
            float[] r15 = new float[r14]
            r3.mo8403c(r15)
            r3 = 0
            r36 = 0
        L_0x0dba:
            if (r3 >= r14) goto L_0x0da9
            int r37 = r36 + 1
            r46 = r5
            r5 = r15[r3]
            r47 = r13
            r38 = r14
            double r13 = (double) r5
            r2[r36] = r13
            int r3 = r3 + 1
            r5 = r46
            r13 = r47
            r36 = r37
            r14 = r38
            goto L_0x0dba
        L_0x0dd4:
            int r9 = r9 + 1
            r13 = r47
            goto L_0x0ddd
        L_0x0dd9:
            r23 = r3
            r46 = r5
        L_0x0ddd:
            int r7 = r7 + 1
            r5 = r46
            r3 = r23
            goto L_0x0d58
        L_0x0de5:
            r23 = r3
            double[] r2 = java.util.Arrays.copyOf(r10, r9)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r13, r9)
            double[][] r3 = (double[][]) r3
            n0.b[] r5 = r4.f4928h
            int r7 = r23 + 1
            int r9 = r4.f4923c
            n0.b r2 = p184n0.C7361b.m14167a(r9, r2, r3)
            r5[r7] = r2
            r3 = r7
            goto L_0x0d4d
        L_0x0e00:
            n0.b[] r2 = r4.f4928h
            int r3 = r4.f4923c
            n0.b r0 = p184n0.C7361b.m14167a(r3, r1, r0)
            r1 = 0
            r2[r1] = r0
            r0 = r12[r1]
            int r0 = r0.f4957k
            r2 = -1
            if (r0 == r2) goto L_0x0e4c
            int[] r0 = new int[r6]
            double[] r2 = new double[r6]
            r3 = 2
            int[] r5 = new int[r3]
            r7 = 1
            r5[r7] = r3
            r5[r1] = r6
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r3 = 0
        L_0x0e27:
            if (r3 >= r6) goto L_0x0e45
            r5 = r12[r3]
            int r7 = r5.f4957k
            r0[r3] = r7
            float r7 = r5.f4950d
            double r9 = (double) r7
            r2[r3] = r9
            r7 = r1[r3]
            float r9 = r5.f4952f
            double r9 = (double) r9
            r13 = 0
            r7[r13] = r9
            float r5 = r5.f4953g
            double r9 = (double) r5
            r5 = 1
            r7[r5] = r9
            int r3 = r3 + 1
            goto L_0x0e27
        L_0x0e45:
            n0.a r3 = new n0.a
            r3.<init>(r0, r2, r1)
            r4.f4929i = r3
        L_0x0e4c:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f4944x = r0
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r0 = r4.f4941u
            if (r0 == 0) goto L_0x1596
            java.util.Iterator r0 = r32.iterator()
            r1 = 2143289344(0x7fc00000, float:NaN)
        L_0x0e5d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x125d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r29
            boolean r5 = r2.startsWith(r3)
            if (r5 == 0) goto L_0x0e91
            androidx.constraintlayout.motion.widget.h$b r5 = new androidx.constraintlayout.motion.widget.h$b
            r5.<init>()
            r46 = r0
            r9 = r5
            r0 = r18
            r15 = r19
            r5 = r20
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            r18 = r17
            r17 = r16
            goto L_0x1122
        L_0x0e91:
            int r5 = r2.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x10a0;
                case -1249320805: goto L_0x1076;
                case -1225497657: goto L_0x1047;
                case -1225497656: goto L_0x101d;
                case -1225497655: goto L_0x0ff7;
                case -1001078227: goto L_0x0fd0;
                case -908189618: goto L_0x0fa4;
                case -908189617: goto L_0x0f6b;
                case -797520672: goto L_0x0f40;
                case -40300674: goto L_0x0f2c;
                case -4379043: goto L_0x0f07;
                case 37232917: goto L_0x0ed4;
                case 92909918: goto L_0x0eaf;
                case 156108012: goto L_0x0ea3;
                default: goto L_0x0e98;
            }
        L_0x0e98:
            r46 = r0
            r9 = r16
            r0 = r18
            r15 = r19
            r5 = r20
            goto L_0x0ee4
        L_0x0ea3:
            r5 = r20
            boolean r6 = r2.equals(r5)
            if (r6 != 0) goto L_0x0eac
            goto L_0x0eb7
        L_0x0eac:
            r6 = 13
            goto L_0x0eba
        L_0x0eaf:
            r5 = r20
            boolean r6 = r2.equals(r8)
            if (r6 != 0) goto L_0x0eb8
        L_0x0eb7:
            goto L_0x0edc
        L_0x0eb8:
            r6 = 12
        L_0x0eba:
            r46 = r0
            r9 = r16
            r0 = r18
            r15 = r19
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r7 = r35
            r16 = r6
            r18 = r17
            r6 = r34
            goto L_0x10c4
        L_0x0ed4:
            r5 = r20
            boolean r6 = r2.equals(r11)
            if (r6 != 0) goto L_0x0ef2
        L_0x0edc:
            r46 = r0
            r9 = r16
            r0 = r18
            r15 = r19
        L_0x0ee4:
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            goto L_0x1067
        L_0x0ef2:
            r46 = r0
            r9 = r16
            r0 = r18
            r15 = r19
            r16 = r22
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            goto L_0x0f28
        L_0x0f07:
            r5 = r20
            r6 = r34
            boolean r7 = r2.equals(r6)
            if (r7 != 0) goto L_0x0f16
            r9 = r21
            r7 = r35
            goto L_0x0f4e
        L_0x0f16:
            r46 = r0
            r9 = r16
            r0 = r18
            r15 = r19
            r16 = r24
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
        L_0x0f28:
            r7 = r35
            goto L_0x1073
        L_0x0f2c:
            r5 = r20
            r6 = r34
            r7 = r35
            boolean r9 = r2.equals(r7)
            if (r9 != 0) goto L_0x0f3b
            r9 = r21
            goto L_0x0f4e
        L_0x0f3b:
            r9 = r21
            r10 = r25
            goto L_0x0f53
        L_0x0f40:
            r5 = r20
            r9 = r21
            r6 = r34
            r7 = r35
            boolean r10 = r2.equals(r9)
            if (r10 != 0) goto L_0x0f51
        L_0x0f4e:
            r10 = r30
            goto L_0x0f7b
        L_0x0f51:
            r10 = r26
        L_0x0f53:
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r15 = r19
            r14 = r28
            r13 = r31
            r12 = r33
            r16 = r10
            r18 = r17
            r10 = r30
            goto L_0x10c4
        L_0x0f6b:
            r5 = r20
            r9 = r21
            r10 = r30
            r6 = r34
            r7 = r35
            boolean r12 = r2.equals(r10)
            if (r12 != 0) goto L_0x0f8d
        L_0x0f7b:
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r15 = r19
            r14 = r28
            r13 = r31
            r12 = r33
            goto L_0x1067
        L_0x0f8d:
            r12 = 7
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r15 = r19
            r14 = r28
            r13 = r31
            r16 = r12
            r18 = r17
            r12 = r33
            goto L_0x10c4
        L_0x0fa4:
            r5 = r20
            r9 = r21
            r10 = r30
            r12 = r33
            r6 = r34
            r7 = r35
            boolean r13 = r2.equals(r12)
            if (r13 != 0) goto L_0x0fbb
            r14 = r28
            r13 = r31
            goto L_0x100d
        L_0x0fbb:
            r13 = 6
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r15 = r19
            r14 = r28
            r16 = r13
            r18 = r17
            r13 = r31
            goto L_0x10c4
        L_0x0fd0:
            r5 = r20
            r9 = r21
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            boolean r14 = r2.equals(r13)
            if (r14 != 0) goto L_0x0fe7
            r14 = r28
            goto L_0x100d
        L_0x0fe7:
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r15 = r19
            r16 = r27
            r14 = r28
            goto L_0x1073
        L_0x0ff7:
            r5 = r20
            r9 = r21
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            boolean r15 = r2.equals(r14)
            if (r15 != 0) goto L_0x1018
        L_0x100d:
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r15 = r19
            goto L_0x1067
        L_0x1018:
            r15 = r19
            r19 = 4
            goto L_0x103c
        L_0x101d:
            r15 = r19
            r5 = r20
            r9 = r21
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            boolean r19 = r2.equals(r15)
            if (r19 != 0) goto L_0x103a
            r46 = r0
            r0 = r18
            goto L_0x1063
        L_0x103a:
            r19 = 3
        L_0x103c:
            r46 = r0
            r21 = r9
            r9 = r16
            r0 = r18
            r16 = r19
            goto L_0x1073
        L_0x1047:
            r46 = r0
            r0 = r18
            r15 = r19
            r5 = r20
            r9 = r21
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            boolean r18 = r2.equals(r0)
            if (r18 != 0) goto L_0x106b
        L_0x1063:
            r21 = r9
            r9 = r16
        L_0x1067:
            r18 = r17
            goto L_0x10c2
        L_0x106b:
            r18 = 2
            r21 = r9
            r9 = r16
            r16 = r18
        L_0x1073:
            r18 = r17
            goto L_0x10c4
        L_0x1076:
            r46 = r0
            r9 = r17
            r0 = r18
            r15 = r19
            r5 = r20
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            boolean r17 = r2.equals(r9)
            if (r17 != 0) goto L_0x1097
            r18 = r9
            r9 = r16
            goto L_0x10c2
        L_0x1097:
            r17 = 1
            r18 = r9
            r9 = r16
            r16 = r17
            goto L_0x10c4
        L_0x10a0:
            r46 = r0
            r9 = r16
            r0 = r18
            r15 = r19
            r5 = r20
            r14 = r28
            r10 = r30
            r13 = r31
            r12 = r33
            r6 = r34
            r7 = r35
            r18 = r17
            boolean r16 = r2.equals(r9)
            if (r16 != 0) goto L_0x10bf
            goto L_0x10c2
        L_0x10bf:
            r16 = 0
            goto L_0x10c4
        L_0x10c2:
            r16 = -1
        L_0x10c4:
            switch(r16) {
                case 0: goto L_0x111c;
                case 1: goto L_0x1116;
                case 2: goto L_0x1110;
                case 3: goto L_0x110a;
                case 4: goto L_0x1104;
                case 5: goto L_0x10fe;
                case 6: goto L_0x10f8;
                case 7: goto L_0x10f2;
                case 8: goto L_0x10ec;
                case 9: goto L_0x10e6;
                case 10: goto L_0x10e0;
                case 11: goto L_0x10da;
                case 12: goto L_0x10d4;
                case 13: goto L_0x10ce;
                default: goto L_0x10c7;
            }
        L_0x10c7:
            r16 = 0
        L_0x10c9:
            r17 = r9
            r9 = r16
            goto L_0x1122
        L_0x10ce:
            androidx.constraintlayout.motion.widget.h$a r16 = new androidx.constraintlayout.motion.widget.h$a
            r16.<init>()
            goto L_0x10c9
        L_0x10d4:
            androidx.constraintlayout.motion.widget.h$a r16 = new androidx.constraintlayout.motion.widget.h$a
            r16.<init>()
            goto L_0x10c9
        L_0x10da:
            androidx.constraintlayout.motion.widget.h$e r16 = new androidx.constraintlayout.motion.widget.h$e
            r16.<init>()
            goto L_0x10c9
        L_0x10e0:
            androidx.constraintlayout.motion.widget.h$d r16 = new androidx.constraintlayout.motion.widget.h$d
            r16.<init>()
            goto L_0x10c9
        L_0x10e6:
            androidx.constraintlayout.motion.widget.h$g r16 = new androidx.constraintlayout.motion.widget.h$g
            r16.<init>()
            goto L_0x10c9
        L_0x10ec:
            androidx.constraintlayout.motion.widget.h$a r16 = new androidx.constraintlayout.motion.widget.h$a
            r16.<init>()
            goto L_0x10c9
        L_0x10f2:
            androidx.constraintlayout.motion.widget.h$k r16 = new androidx.constraintlayout.motion.widget.h$k
            r16.<init>()
            goto L_0x10c9
        L_0x10f8:
            androidx.constraintlayout.motion.widget.h$j r16 = new androidx.constraintlayout.motion.widget.h$j
            r16.<init>()
            goto L_0x10c9
        L_0x10fe:
            androidx.constraintlayout.motion.widget.h$f r16 = new androidx.constraintlayout.motion.widget.h$f
            r16.<init>()
            goto L_0x10c9
        L_0x1104:
            androidx.constraintlayout.motion.widget.h$n r16 = new androidx.constraintlayout.motion.widget.h$n
            r16.<init>()
            goto L_0x10c9
        L_0x110a:
            androidx.constraintlayout.motion.widget.h$m r16 = new androidx.constraintlayout.motion.widget.h$m
            r16.<init>()
            goto L_0x10c9
        L_0x1110:
            androidx.constraintlayout.motion.widget.h$l r16 = new androidx.constraintlayout.motion.widget.h$l
            r16.<init>()
            goto L_0x10c9
        L_0x1116:
            androidx.constraintlayout.motion.widget.h$i r16 = new androidx.constraintlayout.motion.widget.h$i
            r16.<init>()
            goto L_0x10c9
        L_0x111c:
            androidx.constraintlayout.motion.widget.h$h r16 = new androidx.constraintlayout.motion.widget.h$h
            r16.<init>()
            goto L_0x10c9
        L_0x1122:
            if (r9 != 0) goto L_0x1138
            r20 = r0
            r34 = r6
            r35 = r7
            r30 = r10
            r28 = r11
            r23 = r12
            r19 = r13
            r29 = r14
            r16 = r15
            goto L_0x1245
        L_0x1138:
            r20 = r0
            int r0 = r9.f4837e
            r16 = r15
            r15 = 1
            if (r0 != r15) goto L_0x1143
            r0 = 1
            goto L_0x1144
        L_0x1143:
            r0 = 0
        L_0x1144:
            if (r0 == 0) goto L_0x1230
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x1230
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 99
            float r1 = (float) r1
            r15 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 / r1
            r28 = 0
            r1 = 0
            r19 = 0
            r30 = r28
            r32 = r30
            r29 = r14
            r14 = r19
            r19 = r13
        L_0x1164:
            r13 = 100
            if (r14 >= r13) goto L_0x1225
            float r13 = (float) r14
            float r13 = r13 * r15
            r34 = r6
            r35 = r7
            double r6 = (double) r13
            r36 = r6
            androidx.constraintlayout.motion.widget.p r6 = r4.f4924d
            n0.c r6 = r6.f4948b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r7 = r4.f4939s
            java.util.Iterator r7 = r7.iterator()
            r23 = 0
            r28 = 2143289344(0x7fc00000, float:NaN)
        L_0x117f:
            boolean r38 = r7.hasNext()
            if (r38 == 0) goto L_0x11b1
            java.lang.Object r38 = r7.next()
            r47 = r7
            r7 = r38
            androidx.constraintlayout.motion.widget.p r7 = (androidx.constraintlayout.motion.widget.C2149p) r7
            r38 = r15
            n0.c r15 = r7.f4948b
            if (r15 == 0) goto L_0x11ac
            r39 = r15
            float r15 = r7.f4950d
            int r40 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r40 >= 0) goto L_0x11a2
            r23 = r15
            r6 = r39
            goto L_0x11ac
        L_0x11a2:
            boolean r15 = java.lang.Float.isNaN(r28)
            if (r15 == 0) goto L_0x11ac
            float r7 = r7.f4950d
            r28 = r7
        L_0x11ac:
            r7 = r47
            r15 = r38
            goto L_0x117f
        L_0x11b1:
            r38 = r15
            if (r6 == 0) goto L_0x11d0
            boolean r7 = java.lang.Float.isNaN(r28)
            if (r7 == 0) goto L_0x11bd
            r28 = 1065353216(0x3f800000, float:1.0)
        L_0x11bd:
            float r13 = r13 - r23
            float r28 = r28 - r23
            float r13 = r13 / r28
            r7 = r12
            double r12 = (double) r13
            double r12 = r6.mo19654a(r12)
            float r6 = (float) r12
            float r6 = r6 * r28
            float r6 = r6 + r23
            double r12 = (double) r6
            goto L_0x11d3
        L_0x11d0:
            r7 = r12
            r12 = r36
        L_0x11d3:
            n0.b[] r6 = r4.f4928h
            r15 = 0
            r6 = r6[r15]
            double[] r15 = r4.f4934n
            r6.mo19648c(r12, r15)
            androidx.constraintlayout.motion.widget.p r6 = r4.f4924d
            int[] r12 = r4.f4933m
            double[] r13 = r4.f4934n
            r15 = 0
            r6.mo8160e(r12, r13, r0, r15)
            if (r14 <= 0) goto L_0x1202
            double r12 = (double) r1
            r1 = 1
            r1 = r0[r1]
            r23 = r7
            double r6 = (double) r1
            double r6 = r30 - r6
            r1 = r0[r15]
            r30 = r10
            r28 = r11
            double r10 = (double) r1
            double r10 = r32 - r10
            double r6 = java.lang.Math.hypot(r6, r10)
            double r6 = r6 + r12
            float r1 = (float) r6
            goto L_0x1208
        L_0x1202:
            r23 = r7
            r30 = r10
            r28 = r11
        L_0x1208:
            r6 = r0[r15]
            double r6 = (double) r6
            r10 = 1
            r10 = r0[r10]
            double r10 = (double) r10
            int r14 = r14 + 1
            r32 = r6
            r12 = r23
            r6 = r34
            r7 = r35
            r15 = r38
            r41 = r10
            r11 = r28
            r10 = r30
            r30 = r41
            goto L_0x1164
        L_0x1225:
            r34 = r6
            r35 = r7
            r30 = r10
            r28 = r11
            r23 = r12
            goto L_0x123e
        L_0x1230:
            r34 = r6
            r35 = r7
            r30 = r10
            r28 = r11
            r23 = r12
            r19 = r13
            r29 = r14
        L_0x123e:
            r9.f4835c = r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.h> r0 = r4.f4944x
            r0.put(r2, r9)
        L_0x1245:
            r0 = r46
            r31 = r19
            r33 = r23
            r11 = r28
            r28 = r29
            r29 = r3
            r19 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            r20 = r5
            goto L_0x0e5d
        L_0x125d:
            r5 = r20
            r3 = r29
            r23 = r33
            r20 = r18
            r29 = r28
            r28 = r11
            r18 = r17
            r17 = r16
            r16 = r19
            r19 = r31
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r0 = r4.f4941u
            java.util.Iterator r0 = r0.iterator()
        L_0x1277:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x157c
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.c r1 = (androidx.constraintlayout.motion.widget.C2116c) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C2120f
            if (r2 == 0) goto L_0x154e
            androidx.constraintlayout.motion.widget.f r1 = (androidx.constraintlayout.motion.widget.C2120f) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.h> r2 = r4.f4944x
            r1.getClass()
            java.util.Set r6 = r2.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x1296:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x154e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = r7.startsWith(r3)
            if (r9 == 0) goto L_0x1307
            r9 = 7
            java.lang.String r9 = r7.substring(r9)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r10 = r1.f4797d
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.widget.ConstraintAttribute r9 = (androidx.constraintlayout.widget.ConstraintAttribute) r9
            if (r9 == 0) goto L_0x12e9
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r10 = r9.f5354b
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r11 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r10 != r11) goto L_0x12e9
            java.lang.Object r7 = r2.get(r7)
            androidx.constraintlayout.motion.widget.h r7 = (androidx.constraintlayout.motion.widget.C2123h) r7
            int r10 = r1.f4794a
            int r11 = r1.f4816f
            int r12 = r1.f4820j
            float r13 = r1.f4817g
            float r14 = r1.f4818h
            float r15 = r9.mo8402b()
            r46 = r0
            java.util.ArrayList<androidx.constraintlayout.motion.widget.h$o> r0 = r7.f4838f
            r21 = r3
            androidx.constraintlayout.motion.widget.h$o r3 = new androidx.constraintlayout.motion.widget.h$o
            r3.<init>(r10, r13, r14, r15)
            r0.add(r3)
            r0 = -1
            if (r12 == r0) goto L_0x12e4
            r7.f4837e = r12
        L_0x12e4:
            r7.f4836d = r11
            r7.f4834b = r9
            goto L_0x12ed
        L_0x12e9:
            r46 = r0
            r21 = r3
        L_0x12ed:
            r47 = r6
            r14 = r16
            r16 = r17
            r12 = r19
            r15 = r20
            r11 = r23
            r13 = r29
            r10 = r30
            r23 = r1
            r17 = r2
            r20 = r5
            r19 = r8
            goto L_0x1530
        L_0x1307:
            r46 = r0
            r21 = r3
            int r0 = r7.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x1486;
                case -1249320805: goto L_0x1462;
                case -1225497657: goto L_0x1440;
                case -1225497656: goto L_0x141c;
                case -1225497655: goto L_0x1401;
                case -1001078227: goto L_0x13de;
                case -908189618: goto L_0x13b3;
                case -908189617: goto L_0x138f;
                case -40300674: goto L_0x1366;
                case -4379043: goto L_0x1355;
                case 37232917: goto L_0x1345;
                case 92909918: goto L_0x1330;
                case 156108012: goto L_0x1326;
                default: goto L_0x1312;
            }
        L_0x1312:
            r14 = r16
            r0 = r17
            r12 = r19
            r15 = r20
            r11 = r23
            r13 = r29
            r10 = r30
            r3 = r34
            r9 = r35
            goto L_0x14a2
        L_0x1326:
            boolean r0 = r7.equals(r5)
            if (r0 != 0) goto L_0x132d
            goto L_0x1312
        L_0x132d:
            r0 = 12
            goto L_0x133f
        L_0x1330:
            boolean r0 = r7.equals(r8)
            if (r0 != 0) goto L_0x133d
            r0 = r28
            r3 = r34
        L_0x133a:
            r9 = r35
            goto L_0x1372
        L_0x133d:
            r0 = r22
        L_0x133f:
            r10 = r0
            r0 = r28
            r3 = r34
            goto L_0x1363
        L_0x1345:
            r0 = r28
            boolean r3 = r7.equals(r0)
            if (r3 != 0) goto L_0x1350
            r3 = r34
            goto L_0x135f
        L_0x1350:
            r9 = r24
            r3 = r34
            goto L_0x1362
        L_0x1355:
            r0 = r28
            r3 = r34
            boolean r9 = r7.equals(r3)
            if (r9 != 0) goto L_0x1360
        L_0x135f:
            goto L_0x133a
        L_0x1360:
            r9 = r25
        L_0x1362:
            r10 = r9
        L_0x1363:
            r9 = r35
            goto L_0x1382
        L_0x1366:
            r0 = r28
            r3 = r34
            r9 = r35
            boolean r10 = r7.equals(r9)
            if (r10 != 0) goto L_0x1380
        L_0x1372:
            r14 = r16
            r12 = r19
            r15 = r20
            r11 = r23
            r13 = r29
            r10 = r30
            goto L_0x1458
        L_0x1380:
            r10 = r26
        L_0x1382:
            r15 = r10
            r14 = r16
            r12 = r19
            r11 = r23
            r13 = r29
            r10 = r30
            goto L_0x1436
        L_0x138f:
            r0 = r28
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r11 = r7.equals(r10)
            if (r11 != 0) goto L_0x13a0
            r11 = r23
            goto L_0x13c3
        L_0x13a0:
            r11 = 7
            r28 = r0
            r14 = r16
            r0 = r17
            r12 = r19
            r15 = r20
            r13 = r29
            r16 = r11
            r11 = r23
            goto L_0x14a4
        L_0x13b3:
            r11 = r23
            r0 = r28
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r12 = r7.equals(r11)
            if (r12 != 0) goto L_0x13cd
        L_0x13c3:
            r14 = r16
            r12 = r19
            r15 = r20
            r13 = r29
            goto L_0x1458
        L_0x13cd:
            r12 = 6
            r28 = r0
            r14 = r16
            r0 = r17
            r15 = r20
            r13 = r29
            r16 = r12
            r12 = r19
            goto L_0x14a4
        L_0x13de:
            r12 = r19
            r11 = r23
            r0 = r28
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r13 = r7.equals(r12)
            if (r13 != 0) goto L_0x13f3
            r13 = r29
            goto L_0x1415
        L_0x13f3:
            r28 = r0
            r14 = r16
            r0 = r17
            r15 = r20
            r16 = r27
            r13 = r29
            goto L_0x14a4
        L_0x1401:
            r12 = r19
            r11 = r23
            r0 = r28
            r13 = r29
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r14 = r7.equals(r13)
            if (r14 != 0) goto L_0x1418
        L_0x1415:
            r14 = r16
            goto L_0x1432
        L_0x1418:
            r14 = r16
            r15 = 4
            goto L_0x1436
        L_0x141c:
            r14 = r16
            r12 = r19
            r11 = r23
            r0 = r28
            r13 = r29
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r15 = r7.equals(r14)
            if (r15 != 0) goto L_0x1435
        L_0x1432:
            r15 = r20
            goto L_0x1458
        L_0x1435:
            r15 = 3
        L_0x1436:
            r28 = r0
            r16 = r15
            r0 = r17
            r15 = r20
            goto L_0x14a4
        L_0x1440:
            r14 = r16
            r12 = r19
            r15 = r20
            r11 = r23
            r0 = r28
            r13 = r29
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r16 = r7.equals(r15)
            if (r16 != 0) goto L_0x145d
        L_0x1458:
            r28 = r0
            r0 = r18
            goto L_0x147a
        L_0x145d:
            r16 = 2
            r28 = r0
            goto L_0x1483
        L_0x1462:
            r14 = r16
            r0 = r18
            r12 = r19
            r15 = r20
            r11 = r23
            r13 = r29
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r16 = r7.equals(r0)
            if (r16 != 0) goto L_0x147f
        L_0x147a:
            r18 = r0
            r0 = r17
            goto L_0x14a2
        L_0x147f:
            r16 = 1
            r18 = r0
        L_0x1483:
            r0 = r17
            goto L_0x14a4
        L_0x1486:
            r14 = r16
            r0 = r17
            r12 = r19
            r15 = r20
            r11 = r23
            r13 = r29
            r10 = r30
            r3 = r34
            r9 = r35
            boolean r16 = r7.equals(r0)
            if (r16 != 0) goto L_0x149f
            goto L_0x14a2
        L_0x149f:
            r16 = 0
            goto L_0x14a4
        L_0x14a2:
            r16 = -1
        L_0x14a4:
            switch(r16) {
                case 0: goto L_0x14e8;
                case 1: goto L_0x14e3;
                case 2: goto L_0x14de;
                case 3: goto L_0x14d9;
                case 4: goto L_0x14d4;
                case 5: goto L_0x14cf;
                case 6: goto L_0x14ca;
                case 7: goto L_0x14c5;
                case 8: goto L_0x14c0;
                case 9: goto L_0x14bb;
                case 10: goto L_0x14b6;
                case 11: goto L_0x14b1;
                case 12: goto L_0x14ac;
                default: goto L_0x14a7;
            }
        L_0x14a7:
            r16 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x14ec
        L_0x14ac:
            r16 = r0
            float r0 = r1.f4818h
            goto L_0x14ec
        L_0x14b1:
            r16 = r0
            float r0 = r1.f4821k
            goto L_0x14ec
        L_0x14b6:
            r16 = r0
            float r0 = r1.f4824n
            goto L_0x14ec
        L_0x14bb:
            r16 = r0
            float r0 = r1.f4822l
            goto L_0x14ec
        L_0x14c0:
            r16 = r0
            float r0 = r1.f4823m
            goto L_0x14ec
        L_0x14c5:
            r16 = r0
            float r0 = r1.f4828r
            goto L_0x14ec
        L_0x14ca:
            r16 = r0
            float r0 = r1.f4827q
            goto L_0x14ec
        L_0x14cf:
            r16 = r0
            float r0 = r1.f4819i
            goto L_0x14ec
        L_0x14d4:
            r16 = r0
            float r0 = r1.f4831u
            goto L_0x14ec
        L_0x14d9:
            r16 = r0
            float r0 = r1.f4830t
            goto L_0x14ec
        L_0x14de:
            r16 = r0
            float r0 = r1.f4829s
            goto L_0x14ec
        L_0x14e3:
            r16 = r0
            float r0 = r1.f4826p
            goto L_0x14ec
        L_0x14e8:
            r16 = r0
            float r0 = r1.f4825o
        L_0x14ec:
            boolean r17 = java.lang.Float.isNaN(r0)
            if (r17 != 0) goto L_0x1522
            java.lang.Object r7 = r2.get(r7)
            androidx.constraintlayout.motion.widget.h r7 = (androidx.constraintlayout.motion.widget.C2123h) r7
            r17 = r2
            int r2 = r1.f4794a
            r34 = r3
            int r3 = r1.f4816f
            r20 = r5
            int r5 = r1.f4820j
            r47 = r6
            float r6 = r1.f4817g
            r19 = r8
            float r8 = r1.f4818h
            r23 = r1
            java.util.ArrayList<androidx.constraintlayout.motion.widget.h$o> r1 = r7.f4838f
            r35 = r9
            androidx.constraintlayout.motion.widget.h$o r9 = new androidx.constraintlayout.motion.widget.h$o
            r9.<init>(r2, r6, r8, r0)
            r1.add(r9)
            r0 = -1
            if (r5 == r0) goto L_0x151f
            r7.f4837e = r5
        L_0x151f:
            r7.f4836d = r3
            goto L_0x1530
        L_0x1522:
            r23 = r1
            r17 = r2
            r34 = r3
            r20 = r5
            r47 = r6
            r19 = r8
            r35 = r9
        L_0x1530:
            r0 = r46
            r6 = r47
            r30 = r10
            r29 = r13
            r2 = r17
            r8 = r19
            r5 = r20
            r3 = r21
            r1 = r23
            r23 = r11
            r19 = r12
            r20 = r15
            r17 = r16
            r16 = r14
            goto L_0x1296
        L_0x154e:
            r46 = r0
            r21 = r3
            r14 = r16
            r16 = r17
            r12 = r19
            r15 = r20
            r11 = r23
            r13 = r29
            r10 = r30
            r20 = r5
            r19 = r8
            r0 = r46
            r30 = r10
            r23 = r11
            r29 = r13
            r17 = r16
            r8 = r19
            r5 = r20
            r3 = r21
            r19 = r12
            r16 = r14
            r20 = r15
            goto L_0x1277
        L_0x157c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.h> r0 = r4.f4944x
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x1586:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x1596
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.h r1 = (androidx.constraintlayout.motion.widget.C2123h) r1
            r1.mo8145d()
            goto L_0x1586
        L_0x1596:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C2148o.mo8156e(int, int, long):void");
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h(" start: x: ");
        h.append(this.f4924d.f4952f);
        h.append(" y: ");
        h.append(this.f4924d.f4953g);
        h.append(" end: x: ");
        h.append(this.f4925e.f4952f);
        h.append(" y: ");
        h.append(this.f4925e.f4953g);
        return h.toString();
    }
}
