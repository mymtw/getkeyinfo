package p728zk;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;

/* renamed from: zk.f */
public final class C18944f extends C18953j<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f42236l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    public static final int[] f42237m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    public static final int[] f42238n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    public static final C18945a f42239o = new C18945a();

    /* renamed from: p */
    public static final C18946b f42240p = new C18946b();

    /* renamed from: d */
    public ObjectAnimator f42241d;

    /* renamed from: e */
    public ObjectAnimator f42242e;

    /* renamed from: f */
    public final FastOutSlowInInterpolator f42243f;

    /* renamed from: g */
    public final C18947g f42244g;

    /* renamed from: h */
    public int f42245h = 0;

    /* renamed from: i */
    public float f42246i;

    /* renamed from: j */
    public float f42247j;

    /* renamed from: k */
    public Animatable2Compat.C3306a f42248k = null;

    /* renamed from: zk.f$a */
    public static class C18945a extends Property<C18944f, Float> {
        public C18945a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18944f) obj).f42246i);
        }

        public final void set(Object obj, Object obj2) {
            C18944f fVar = (C18944f) obj;
            float floatValue = ((Float) obj2).floatValue();
            fVar.f42246i = floatValue;
            int i = (int) (5400.0f * floatValue);
            float[] fArr = fVar.f42257b;
            float f = floatValue * 1520.0f;
            fArr[0] = -20.0f + f;
            fArr[1] = f;
            for (int i2 = 0; i2 < 4; i2++) {
                float f2 = (float) 667;
                float[] fArr2 = fVar.f42257b;
                fArr2[1] = (fVar.f42243f.getInterpolation(((float) (i - C18944f.f42236l[i2])) / f2) * 250.0f) + fArr2[1];
                float f3 = ((float) (i - C18944f.f42237m[i2])) / f2;
                float[] fArr3 = fVar.f42257b;
                fArr3[0] = (fVar.f42243f.getInterpolation(f3) * 250.0f) + fArr3[0];
            }
            float[] fArr4 = fVar.f42257b;
            float f4 = fArr4[0];
            float f5 = fArr4[1];
            float f6 = ((f5 - f4) * fVar.f42247j) + f4;
            fArr4[0] = f6;
            fArr4[0] = f6 / 360.0f;
            fArr4[1] = f5 / 360.0f;
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                float f7 = ((float) (i - C18944f.f42238n[i3])) / ((float) 333);
                if (f7 >= 0.0f && f7 <= 1.0f) {
                    int i4 = i3 + fVar.f42245h;
                    int[] iArr = fVar.f42244g.f42226c;
                    int length = i4 % iArr.length;
                    fVar.f42258c[0] = ArgbEvaluatorCompat.getInstance().evaluate(fVar.f42243f.getInterpolation(f7), Integer.valueOf(C1993m.m4375u(iArr[length], fVar.f42256a.getAlpha())), Integer.valueOf(C1993m.m4375u(fVar.f42244g.f42226c[(length + 1) % iArr.length], fVar.f42256a.getAlpha()))).intValue();
                    break;
                }
                i3++;
            }
            fVar.f42256a.invalidateSelf();
        }
    }

    /* renamed from: zk.f$b */
    public static class C18946b extends Property<C18944f, Float> {
        public C18946b() {
            super(Float.class, "completeEndFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18944f) obj).f42247j);
        }

        public final void set(Object obj, Object obj2) {
            ((C18944f) obj).f42247j = ((Float) obj2).floatValue();
        }
    }

    public C18944f(C18947g gVar) {
        super(1);
        this.f42244g = gVar;
        this.f42243f = new FastOutSlowInInterpolator();
    }

    /* renamed from: a */
    public final void mo70384a() {
        ObjectAnimator objectAnimator = this.f42241d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final void mo70385b() {
        this.f42245h = 0;
        this.f42258c[0] = C1993m.m4375u(this.f42244g.f42226c[0], this.f42256a.getAlpha());
        this.f42247j = 0.0f;
    }

    /* renamed from: c */
    public final void mo70386c(Animatable2Compat.C3306a aVar) {
        this.f42248k = aVar;
    }

    /* renamed from: d */
    public final void mo70387d() {
        ObjectAnimator objectAnimator = this.f42242e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f42256a.isVisible()) {
                this.f42242e.start();
            } else {
                mo70384a();
            }
        }
    }

    /* renamed from: e */
    public final void mo70388e() {
        if (this.f42241d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f42239o, new float[]{0.0f, 1.0f});
            this.f42241d = ofFloat;
            ofFloat.setDuration(5400);
            this.f42241d.setInterpolator((TimeInterpolator) null);
            this.f42241d.setRepeatCount(-1);
            this.f42241d.addListener(new C18942d(this));
        }
        if (this.f42242e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f42240p, new float[]{0.0f, 1.0f});
            this.f42242e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f42242e.setInterpolator(this.f42243f);
            this.f42242e.addListener(new C18943e(this));
        }
        this.f42245h = 0;
        this.f42258c[0] = C1993m.m4375u(this.f42244g.f42226c[0], this.f42256a.getAlpha());
        this.f42247j = 0.0f;
        this.f42241d.start();
    }

    /* renamed from: f */
    public final void mo70389f() {
        this.f42248k = null;
    }
}
