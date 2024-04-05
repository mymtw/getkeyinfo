package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.util.LinkedHashMap;
import p184n0.C7363c;

/* renamed from: androidx.constraintlayout.motion.widget.p */
public final class C2149p implements Comparable<C2149p> {

    /* renamed from: p */
    public static String[] f4947p = {"position", EtsyDialogFragment.OPT_X_BUTTON, "y", ResponseConstants.WIDTH, ResponseConstants.HEIGHT, "pathRotate"};

    /* renamed from: b */
    public C7363c f4948b;

    /* renamed from: c */
    public int f4949c = 0;

    /* renamed from: d */
    public float f4950d;

    /* renamed from: e */
    public float f4951e;

    /* renamed from: f */
    public float f4952f;

    /* renamed from: g */
    public float f4953g;

    /* renamed from: h */
    public float f4954h;

    /* renamed from: i */
    public float f4955i;

    /* renamed from: j */
    public float f4956j = Float.NaN;

    /* renamed from: k */
    public int f4957k = -1;

    /* renamed from: l */
    public LinkedHashMap<String, ConstraintAttribute> f4958l = new LinkedHashMap<>();

    /* renamed from: m */
    public int f4959m = 0;

    /* renamed from: n */
    public double[] f4960n = new double[18];

    /* renamed from: o */
    public double[] f4961o = new double[18];

    public C2149p() {
    }

    /* renamed from: c */
    public static boolean m4619c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: f */
    public static void m4620f(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f4 = f7;
            } else if (i2 == 2) {
                f6 = f7;
            } else if (i2 == 3) {
                f3 = f7;
            } else if (i2 == 4) {
                f5 = f7;
            }
        }
        float f8 = f4 - ((0.0f * f3) / 2.0f);
        float f9 = f6 - ((0.0f * f5) / 2.0f);
        fArr[0] = (((f3 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f5 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* renamed from: a */
    public final void mo8158a(C2236a.C2237a aVar) {
        this.f4948b = C7363c.m14180c(aVar.f5378c.f5448c);
        C2236a.C2239c cVar = aVar.f5378c;
        this.f4957k = cVar.f5449d;
        this.f4956j = cVar.f5452g;
        this.f4949c = cVar.f5450e;
        float f = aVar.f5377b.f5457e;
        for (String next : aVar.f5381f.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f5381f.get(next);
            if (constraintAttribute.f5354b != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.f4958l.put(next, constraintAttribute);
            }
        }
    }

    public final int compareTo(Object obj) {
        return Float.compare(this.f4951e, ((C2149p) obj).f4951e);
    }

    /* renamed from: e */
    public final void mo8160e(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f4952f;
        float f2 = this.f4953g;
        float f3 = this.f4954h;
        float f4 = this.f4955i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public C2149p(int i, int i2, C2140j jVar, C2149p pVar, C2149p pVar2) {
        float f;
        int i3;
        C2140j jVar2 = jVar;
        C2149p pVar3 = pVar;
        C2149p pVar4 = pVar2;
        int i4 = jVar2.f4864o;
        if (i4 == 1) {
            C2149p pVar5 = pVar3;
            float f2 = ((float) jVar2.f4794a) / 100.0f;
            this.f4950d = f2;
            this.f4949c = jVar2.f4857h;
            float f3 = Float.isNaN(jVar2.f4858i) ? f2 : jVar2.f4858i;
            float f4 = Float.isNaN(jVar2.f4859j) ? f2 : jVar2.f4859j;
            float f5 = pVar4.f4954h - pVar5.f4954h;
            float f6 = pVar4.f4955i - pVar5.f4955i;
            this.f4951e = this.f4950d;
            f2 = !Float.isNaN(jVar2.f4860k) ? jVar2.f4860k : f2;
            float f7 = pVar5.f4952f;
            float f8 = pVar5.f4954h;
            float f9 = pVar5.f4953g;
            float f10 = pVar5.f4955i;
            float f11 = ((pVar4.f4954h / 2.0f) + pVar4.f4952f) - ((f8 / 2.0f) + f7);
            float f12 = ((pVar4.f4955i / 2.0f) + pVar4.f4953g) - ((f10 / 2.0f) + f9);
            float f13 = f11 * f2;
            float f14 = f5 * f3;
            float f15 = f14 / 2.0f;
            this.f4952f = (float) ((int) ((f7 + f13) - f15));
            float f16 = f2 * f12;
            float f17 = f6 * f4;
            float f18 = f17 / 2.0f;
            this.f4953g = (float) ((int) ((f9 + f16) - f18));
            this.f4954h = (float) ((int) (f8 + f14));
            this.f4955i = (float) ((int) (f10 + f17));
            float f19 = Float.isNaN(jVar2.f4861l) ? 0.0f : jVar2.f4861l;
            this.f4959m = 1;
            C2149p pVar6 = pVar;
            float f20 = (float) ((int) ((pVar6.f4952f + f13) - f15));
            float f21 = (float) ((int) ((pVar6.f4953g + f16) - f18));
            this.f4952f = f20 + ((-f12) * f19);
            this.f4953g = f21 + (f11 * f19);
            this.f4948b = C7363c.m14180c(jVar2.f4855f);
            this.f4957k = jVar2.f4856g;
        } else if (i4 != 2) {
            float f22 = ((float) jVar2.f4794a) / 100.0f;
            this.f4950d = f22;
            this.f4949c = jVar2.f4857h;
            float f23 = Float.isNaN(jVar2.f4858i) ? f22 : jVar2.f4858i;
            float f24 = Float.isNaN(jVar2.f4859j) ? f22 : jVar2.f4859j;
            float f25 = pVar4.f4954h;
            float f26 = pVar3.f4954h;
            float f27 = f25 - f26;
            float f28 = pVar4.f4955i;
            float f29 = pVar3.f4955i;
            float f30 = f28 - f29;
            this.f4951e = this.f4950d;
            float f31 = pVar3.f4952f;
            float f32 = pVar3.f4953g;
            float f33 = ((f25 / 2.0f) + pVar4.f4952f) - ((f26 / 2.0f) + f31);
            float f34 = ((f28 / 2.0f) + pVar4.f4953g) - ((f29 / 2.0f) + f32);
            float f35 = f27 * f23;
            float f36 = f35 / 2.0f;
            this.f4952f = (float) ((int) (((f33 * f22) + f31) - f36));
            float f37 = f30 * f24;
            float f38 = f37 / 2.0f;
            this.f4953g = (float) ((int) (((f34 * f22) + f32) - f38));
            this.f4954h = (float) ((int) (f26 + f35));
            this.f4955i = (float) ((int) (f29 + f37));
            float f39 = Float.isNaN(jVar2.f4860k) ? f22 : jVar2.f4860k;
            float f40 = Float.isNaN(jVar2.f4863n) ? 0.0f : jVar2.f4863n;
            f22 = !Float.isNaN(jVar2.f4861l) ? jVar2.f4861l : f22;
            if (Float.isNaN(jVar2.f4862m)) {
                i3 = 2;
                f = 0.0f;
            } else {
                f = jVar2.f4862m;
                i3 = 2;
            }
            this.f4959m = i3;
            C2149p pVar7 = pVar;
            this.f4952f = (float) ((int) (((f * f34) + ((f39 * f33) + pVar7.f4952f)) - f36));
            this.f4953g = (float) ((int) (((f34 * f22) + ((f33 * f40) + pVar7.f4953g)) - f38));
            this.f4948b = C7363c.m14180c(jVar2.f4855f);
            this.f4957k = jVar2.f4856g;
        } else {
            C2149p pVar8 = pVar3;
            float f41 = ((float) jVar2.f4794a) / 100.0f;
            this.f4950d = f41;
            this.f4949c = jVar2.f4857h;
            float f42 = Float.isNaN(jVar2.f4858i) ? f41 : jVar2.f4858i;
            float f43 = Float.isNaN(jVar2.f4859j) ? f41 : jVar2.f4859j;
            float f44 = pVar4.f4954h;
            float f45 = pVar8.f4954h;
            float f46 = f44 - f45;
            float f47 = pVar4.f4955i;
            float f48 = pVar8.f4955i;
            float f49 = f47 - f48;
            this.f4951e = this.f4950d;
            float f50 = pVar8.f4952f;
            float f51 = pVar8.f4953g;
            float f52 = (f44 / 2.0f) + pVar4.f4952f;
            float f53 = (f47 / 2.0f) + pVar4.f4953g;
            float f54 = f46 * f42;
            this.f4952f = (float) ((int) ((((f52 - ((f45 / 2.0f) + f50)) * f41) + f50) - (f54 / 2.0f)));
            float f55 = f49 * f43;
            this.f4953g = (float) ((int) ((((f53 - ((f48 / 2.0f) + f51)) * f41) + f51) - (f55 / 2.0f)));
            this.f4954h = (float) ((int) (f45 + f54));
            this.f4955i = (float) ((int) (f48 + f55));
            this.f4959m = 3;
            C2140j jVar3 = jVar;
            if (!Float.isNaN(jVar3.f4860k)) {
                this.f4952f = (float) ((int) (jVar3.f4860k * ((float) ((int) (((float) i) - this.f4954h)))));
            }
            if (!Float.isNaN(jVar3.f4861l)) {
                this.f4953g = (float) ((int) (jVar3.f4861l * ((float) ((int) (((float) i2) - this.f4955i)))));
            }
            this.f4948b = C7363c.m14180c(jVar3.f4855f);
            this.f4957k = jVar3.f4856g;
        }
    }
}
