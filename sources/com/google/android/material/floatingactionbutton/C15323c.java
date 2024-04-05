package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C15359d;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Iterator;
import p001a0.C0005b;
import p003a2.C0023f;
import p515bl.C14091a;
import p522cl.C14170b;
import p550dl.C17585k;
import p629nk.C18268a;
import p629nk.C18269b;
import p704wk.C18720c;
import p704wk.C18722d;
import p704wk.C18723e;
import p704wk.C18724f;
import p712xk.C18787a;

/* renamed from: com.google.android.material.floatingactionbutton.c */
public class C15323c {

    /* renamed from: C */
    public static final FastOutLinearInInterpolator f34330C = C18268a.f40093c;

    /* renamed from: D */
    public static final int[] f34331D = {16842919, 16842910};

    /* renamed from: E */
    public static final int[] f34332E = {16843623, 16842908, 16842910};

    /* renamed from: F */
    public static final int[] f34333F = {16842908, 16842910};

    /* renamed from: G */
    public static final int[] f34334G = {16843623, 16842910};

    /* renamed from: H */
    public static final int[] f34335H = {16842910};

    /* renamed from: I */
    public static final int[] f34336I = new int[0];

    /* renamed from: A */
    public final Matrix f34337A = new Matrix();

    /* renamed from: B */
    public C18723e f34338B;

    /* renamed from: a */
    public C15401a f34339a;

    /* renamed from: b */
    public MaterialShapeDrawable f34340b;

    /* renamed from: c */
    public Drawable f34341c;

    /* renamed from: d */
    public C18720c f34342d;

    /* renamed from: e */
    public LayerDrawable f34343e;

    /* renamed from: f */
    public boolean f34344f;

    /* renamed from: g */
    public boolean f34345g = true;

    /* renamed from: h */
    public float f34346h;

    /* renamed from: i */
    public float f34347i;

    /* renamed from: j */
    public float f34348j;

    /* renamed from: k */
    public int f34349k;

    /* renamed from: l */
    public Animator f34350l;

    /* renamed from: m */
    public C18269b f34351m;

    /* renamed from: n */
    public C18269b f34352n;

    /* renamed from: o */
    public float f34353o;

    /* renamed from: p */
    public float f34354p = 1.0f;

    /* renamed from: q */
    public int f34355q;

    /* renamed from: r */
    public int f34356r = 0;

    /* renamed from: s */
    public ArrayList<Animator.AnimatorListener> f34357s;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f34358t;

    /* renamed from: u */
    public ArrayList<C15329f> f34359u;

    /* renamed from: v */
    public final FloatingActionButton f34360v;

    /* renamed from: w */
    public final C14170b f34361w;

    /* renamed from: x */
    public final Rect f34362x = new Rect();

    /* renamed from: y */
    public final RectF f34363y = new RectF();

    /* renamed from: z */
    public final RectF f34364z = new RectF();

    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    public class C15324a extends MatrixEvaluator {
        public C15324a() {
        }

        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C15323c.this.f34354p = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    public class C15325b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f34366a;

        /* renamed from: b */
        public final /* synthetic */ float f34367b;

        /* renamed from: c */
        public final /* synthetic */ float f34368c;

        /* renamed from: d */
        public final /* synthetic */ float f34369d;

        /* renamed from: e */
        public final /* synthetic */ float f34370e;

        /* renamed from: f */
        public final /* synthetic */ float f34371f;

        /* renamed from: g */
        public final /* synthetic */ float f34372g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f34373h;

        public C15325b(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f34366a = f;
            this.f34367b = f2;
            this.f34368c = f3;
            this.f34369d = f4;
            this.f34370e = f5;
            this.f34371f = f6;
            this.f34372g = f7;
            this.f34373h = matrix;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C15323c.this.f34360v.setAlpha(C18268a.m30884a(this.f34366a, this.f34367b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = C15323c.this.f34360v;
            float f = this.f34368c;
            floatingActionButton.setScaleX(((this.f34369d - f) * floatValue) + f);
            FloatingActionButton floatingActionButton2 = C15323c.this.f34360v;
            float f2 = this.f34370e;
            floatingActionButton2.setScaleY(((this.f34369d - f2) * floatValue) + f2);
            C15323c cVar = C15323c.this;
            float f3 = this.f34371f;
            float f4 = this.f34372g;
            cVar.f34354p = C0023f.m103b(f4, f3, floatValue, f3);
            cVar.mo54054a(C0023f.m103b(f4, f3, floatValue, f3), this.f34373h);
            C15323c.this.f34360v.setImageMatrix(this.f34373h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$c */
    public class C15326c extends C15332i {
        public C15326c(C18724f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public final float mo54071a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$d */
    public class C15327d extends C15332i {

        /* renamed from: e */
        public final /* synthetic */ C15323c f34375e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15327d(C18724f fVar) {
            super(fVar);
            this.f34375e = fVar;
        }

        /* renamed from: a */
        public final float mo54071a() {
            C15323c cVar = this.f34375e;
            return cVar.f34346h + cVar.f34347i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$e */
    public class C15328e extends C15332i {

        /* renamed from: e */
        public final /* synthetic */ C15323c f34376e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15328e(C18724f fVar) {
            super(fVar);
            this.f34376e = fVar;
        }

        /* renamed from: a */
        public final float mo54071a() {
            C15323c cVar = this.f34376e;
            return cVar.f34346h + cVar.f34348j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$f */
    public interface C15329f {
        /* renamed from: a */
        void mo54045a();

        /* renamed from: b */
        void mo54046b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$g */
    public interface C15330g {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$h */
    public class C15331h extends C15332i {

        /* renamed from: e */
        public final /* synthetic */ C15323c f34377e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15331h(C18724f fVar) {
            super(fVar);
            this.f34377e = fVar;
        }

        /* renamed from: a */
        public final float mo54071a() {
            return this.f34377e.f34346h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$i */
    public abstract class C15332i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f34378a;

        /* renamed from: b */
        public float f34379b;

        /* renamed from: c */
        public float f34380c;

        /* renamed from: d */
        public final /* synthetic */ C15323c f34381d;

        public C15332i(C18724f fVar) {
            this.f34381d = fVar;
        }

        /* renamed from: a */
        public abstract float mo54071a();

        public final void onAnimationEnd(Animator animator) {
            C15323c cVar = this.f34381d;
            float f = (float) ((int) this.f34380c);
            MaterialShapeDrawable materialShapeDrawable = cVar.f34340b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setElevation(f);
            }
            this.f34378a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f34378a) {
                MaterialShapeDrawable materialShapeDrawable = this.f34381d.f34340b;
                this.f34379b = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.getElevation();
                this.f34380c = mo54071a();
                this.f34378a = true;
            }
            C15323c cVar = this.f34381d;
            float f = this.f34379b;
            float animatedFraction = (float) ((int) ((valueAnimator.getAnimatedFraction() * (this.f34380c - f)) + f));
            MaterialShapeDrawable materialShapeDrawable2 = cVar.f34340b;
            if (materialShapeDrawable2 != null) {
                materialShapeDrawable2.setElevation(animatedFraction);
            }
        }
    }

    public C15323c(FloatingActionButton floatingActionButton, FloatingActionButton.C15319c cVar) {
        this.f34360v = floatingActionButton;
        this.f34361w = cVar;
        C15359d dVar = new C15359d();
        C18724f fVar = (C18724f) this;
        dVar.mo54196a(f34331D, m24891d(new C15328e(fVar)));
        dVar.mo54196a(f34332E, m24891d(new C15327d(fVar)));
        dVar.mo54196a(f34333F, m24891d(new C15327d(fVar)));
        dVar.mo54196a(f34334G, m24891d(new C15327d(fVar)));
        dVar.mo54196a(f34335H, m24891d(new C15331h(fVar)));
        dVar.mo54196a(f34336I, m24891d(new C15326c(fVar)));
        this.f34353o = floatingActionButton.getRotation();
    }

    /* renamed from: d */
    public static ValueAnimator m24891d(C15332i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f34330C);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    public final void mo54054a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f34360v.getDrawable();
        if (drawable != null && this.f34355q != 0) {
            RectF rectF = this.f34363y;
            RectF rectF2 = this.f34364z;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f34355q;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f34355q;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: b */
    public final AnimatorSet mo54055b(C18269b bVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f34360v, View.ALPHA, new float[]{f});
        bVar.mo69812f("opacity").mo69817a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f34360v, View.SCALE_X, new float[]{f2});
        bVar.mo69812f(ResponseConstants.SCALE).mo69817a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C18722d());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f34360v, View.SCALE_Y, new float[]{f2});
        bVar.mo69812f(ResponseConstants.SCALE).mo69817a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C18722d());
        }
        arrayList.add(ofFloat3);
        mo54054a(f3, this.f34337A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f34360v, new ImageMatrixProperty(), new C15324a(), new Matrix[]{new Matrix(this.f34337A)});
        bVar.mo69812f("iconScale").mo69817a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C15588c1.m25289K0(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet mo54056c(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C15325b(this.f34360v.getAlpha(), f, this.f34360v.getScaleX(), f2, this.f34360v.getScaleY(), this.f34354p, f3, new Matrix(this.f34337A)));
        arrayList.add(ofFloat);
        C15588c1.m25289K0(animatorSet, arrayList);
        animatorSet.setDuration((long) C18787a.m31705c(R.attr.motionDurationLong1, this.f34360v.getContext(), this.f34360v.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C18787a.m31706d(this.f34360v.getContext(), R.attr.motionEasingStandard, C18268a.f40092b));
        return animatorSet;
    }

    /* renamed from: e */
    public float mo54057e() {
        throw null;
    }

    /* renamed from: f */
    public void mo54058f(Rect rect) {
        int sizeDimension = this.f34344f ? (this.f34349k - this.f34360v.getSizeDimension()) / 2 : 0;
        float e = this.f34345g ? mo54057e() + this.f34348j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) e));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (e * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: g */
    public void mo54059g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    /* renamed from: h */
    public void mo54060h() {
        throw null;
    }

    /* renamed from: i */
    public void mo54061i() {
        throw null;
    }

    /* renamed from: j */
    public void mo54062j(int[] iArr) {
        throw null;
    }

    /* renamed from: k */
    public void mo54063k(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: l */
    public final void mo54064l() {
        ArrayList<C15329f> arrayList = this.f34359u;
        if (arrayList != null) {
            Iterator<C15329f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo54045a();
            }
        }
    }

    /* renamed from: m */
    public void mo54065m(ColorStateList colorStateList) {
        Drawable drawable = this.f34341c;
        if (drawable != null) {
            drawable.setTintList(C14091a.m21809c(colorStateList));
        }
    }

    /* renamed from: n */
    public final void mo54066n(C15401a aVar) {
        this.f34339a = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.f34340b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        Drawable drawable = this.f34341c;
        if (drawable instanceof C17585k) {
            ((C17585k) drawable).setShapeAppearanceModel(aVar);
        }
        C18720c cVar = this.f34342d;
        if (cVar != null) {
            cVar.f41492o = aVar;
            cVar.invalidateSelf();
        }
    }

    /* renamed from: o */
    public boolean mo54067o() {
        throw null;
    }

    /* renamed from: p */
    public void mo54068p() {
        throw null;
    }

    /* renamed from: q */
    public final void mo54069q() {
        Rect rect = this.f34362x;
        mo54058f(rect);
        C0005b.m24R(this.f34343e, "Didn't initialize content background");
        if (mo54067o()) {
            C15323c.super.setBackgroundDrawable(new InsetDrawable(this.f34343e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            C14170b bVar = this.f34361w;
            LayerDrawable layerDrawable = this.f34343e;
            FloatingActionButton.C15319c cVar = (FloatingActionButton.C15319c) bVar;
            if (layerDrawable != null) {
                C15323c.super.setBackgroundDrawable(layerDrawable);
            } else {
                cVar.getClass();
            }
        }
        C14170b bVar2 = this.f34361w;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton.C15319c cVar2 = (FloatingActionButton.C15319c) bVar2;
        FloatingActionButton.this.shadowPadding.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.setPadding(floatingActionButton.imagePadding + i, FloatingActionButton.this.imagePadding + i2, FloatingActionButton.this.imagePadding + i3, FloatingActionButton.this.imagePadding + i4);
    }
}
