package p728zk;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.etsy.android.R;
import java.util.Arrays;

/* renamed from: zk.p */
public final class C18960p extends C18953j<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f42272l = {533, 567, 850, 750};

    /* renamed from: m */
    public static final int[] f42273m = {1267, 1000, 333, 0};

    /* renamed from: n */
    public static final C18961a f42274n = new C18961a();

    /* renamed from: d */
    public ObjectAnimator f42275d;

    /* renamed from: e */
    public ObjectAnimator f42276e;

    /* renamed from: f */
    public final Interpolator[] f42277f;

    /* renamed from: g */
    public final C18962q f42278g;

    /* renamed from: h */
    public int f42279h = 0;

    /* renamed from: i */
    public boolean f42280i;

    /* renamed from: j */
    public float f42281j;

    /* renamed from: k */
    public Animatable2Compat.C3306a f42282k = null;

    /* renamed from: zk.p$a */
    public static class C18961a extends Property<C18960p, Float> {
        public C18961a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18960p) obj).f42281j);
        }

        public final void set(Object obj, Object obj2) {
            C18960p pVar = (C18960p) obj;
            float floatValue = ((Float) obj2).floatValue();
            pVar.f42281j = floatValue;
            int i = (int) (floatValue * 1800.0f);
            for (int i2 = 0; i2 < 4; i2++) {
                pVar.f42257b[i2] = Math.max(0.0f, Math.min(1.0f, pVar.f42277f[i2].getInterpolation(((float) (i - C18960p.f42273m[i2])) / ((float) C18960p.f42272l[i2]))));
            }
            if (pVar.f42280i) {
                Arrays.fill(pVar.f42258c, C1993m.m4375u(pVar.f42278g.f42226c[pVar.f42279h], pVar.f42256a.getAlpha()));
                pVar.f42280i = false;
            }
            pVar.f42256a.invalidateSelf();
        }
    }

    public C18960p(Context context, C18962q qVar) {
        super(2);
        this.f42278g = qVar;
        this.f42277f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: a */
    public final void mo70384a() {
        ObjectAnimator objectAnimator = this.f42275d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final void mo70385b() {
        this.f42279h = 0;
        int u = C1993m.m4375u(this.f42278g.f42226c[0], this.f42256a.getAlpha());
        int[] iArr = this.f42258c;
        iArr[0] = u;
        iArr[1] = u;
    }

    /* renamed from: c */
    public final void mo70386c(Animatable2Compat.C3306a aVar) {
        this.f42282k = aVar;
    }

    /* renamed from: d */
    public final void mo70387d() {
        ObjectAnimator objectAnimator = this.f42276e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo70384a();
            if (this.f42256a.isVisible()) {
                this.f42276e.setFloatValues(new float[]{this.f42281j, 1.0f});
                this.f42276e.setDuration((long) ((1.0f - this.f42281j) * 1800.0f));
                this.f42276e.start();
            }
        }
    }

    /* renamed from: e */
    public final void mo70388e() {
        if (this.f42275d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f42274n, new float[]{0.0f, 1.0f});
            this.f42275d = ofFloat;
            ofFloat.setDuration(1800);
            this.f42275d.setInterpolator((TimeInterpolator) null);
            this.f42275d.setRepeatCount(-1);
            this.f42275d.addListener(new C18958n(this));
        }
        if (this.f42276e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f42274n, new float[]{1.0f});
            this.f42276e = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f42276e.setInterpolator((TimeInterpolator) null);
            this.f42276e.addListener(new C18959o(this));
        }
        this.f42279h = 0;
        int u = C1993m.m4375u(this.f42278g.f42226c[0], this.f42256a.getAlpha());
        int[] iArr = this.f42258c;
        iArr[0] = u;
        iArr[1] = u;
        this.f42275d.start();
    }

    /* renamed from: f */
    public final void mo70389f() {
        this.f42282k = null;
    }
}
