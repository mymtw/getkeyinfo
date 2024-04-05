package p728zk;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.Arrays;

/* renamed from: zk.m */
public final class C18956m extends C18953j<ObjectAnimator> {

    /* renamed from: j */
    public static final C18957a f42263j = new C18957a();

    /* renamed from: d */
    public ObjectAnimator f42264d;

    /* renamed from: e */
    public FastOutSlowInInterpolator f42265e;

    /* renamed from: f */
    public final C18962q f42266f;

    /* renamed from: g */
    public int f42267g = 1;

    /* renamed from: h */
    public boolean f42268h;

    /* renamed from: i */
    public float f42269i;

    /* renamed from: zk.m$a */
    public static class C18957a extends Property<C18956m, Float> {
        public C18957a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18956m) obj).f42269i);
        }

        public final void set(Object obj, Object obj2) {
            C18956m mVar = (C18956m) obj;
            float floatValue = ((Float) obj2).floatValue();
            mVar.f42269i = floatValue;
            float[] fArr = mVar.f42257b;
            fArr[0] = 0.0f;
            float f = ((float) (((int) (floatValue * 333.0f)) - 0)) / ((float) 667);
            float interpolation = mVar.f42265e.getInterpolation(f);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = mVar.f42257b;
            float interpolation2 = mVar.f42265e.getInterpolation(f + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = mVar.f42257b;
            fArr3[5] = 1.0f;
            if (mVar.f42268h && fArr3[3] < 1.0f) {
                int[] iArr = mVar.f42258c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = C1993m.m4375u(mVar.f42266f.f42226c[mVar.f42267g], mVar.f42256a.getAlpha());
                mVar.f42268h = false;
            }
            mVar.f42256a.invalidateSelf();
        }
    }

    public C18956m(C18962q qVar) {
        super(3);
        this.f42266f = qVar;
        this.f42265e = new FastOutSlowInInterpolator();
    }

    /* renamed from: a */
    public final void mo70384a() {
        ObjectAnimator objectAnimator = this.f42264d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final void mo70385b() {
        this.f42268h = true;
        this.f42267g = 1;
        Arrays.fill(this.f42258c, C1993m.m4375u(this.f42266f.f42226c[0], this.f42256a.getAlpha()));
    }

    /* renamed from: c */
    public final void mo70386c(Animatable2Compat.C3306a aVar) {
    }

    /* renamed from: d */
    public final void mo70387d() {
    }

    /* renamed from: e */
    public final void mo70388e() {
        if (this.f42264d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f42263j, new float[]{0.0f, 1.0f});
            this.f42264d = ofFloat;
            ofFloat.setDuration(333);
            this.f42264d.setInterpolator((TimeInterpolator) null);
            this.f42264d.setRepeatCount(-1);
            this.f42264d.addListener(new C18955l(this));
        }
        this.f42268h = true;
        this.f42267g = 1;
        Arrays.fill(this.f42258c, C1993m.m4375u(this.f42266f.f42226c[0], this.f42256a.getAlpha()));
        this.f42264d.start();
    }

    /* renamed from: f */
    public final void mo70389f() {
    }
}
