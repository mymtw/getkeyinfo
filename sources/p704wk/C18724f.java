package p704wk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.etsy.android.R;
import com.google.android.material.floatingactionbutton.C15323c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import p260v0.C8184a;
import p515bl.C14091a;

/* renamed from: wk.f */
public final class C18724f extends C15323c {

    /* renamed from: wk.f$a */
    public static class C18725a extends MaterialShapeDrawable {
        public C18725a(C15401a aVar) {
            super(aVar);
        }

        public final boolean isStateful() {
            return true;
        }
    }

    public C18724f(FloatingActionButton floatingActionButton, FloatingActionButton.C15319c cVar) {
        super(floatingActionButton, cVar);
    }

    /* renamed from: e */
    public final float mo54057e() {
        return this.f34360v.getElevation();
    }

    /* renamed from: f */
    public final void mo54058f(Rect rect) {
        if (FloatingActionButton.this.compatPadding) {
            super.mo54058f(rect);
            return;
        }
        if (!(!this.f34344f || this.f34360v.getSizeDimension() >= this.f34349k)) {
            int sizeDimension = (this.f34349k - this.f34360v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: g */
    public final void mo54059g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        MaterialShapeDrawable s = mo70218s();
        this.f34340b = s;
        s.setTintList(colorStateList);
        if (mode != null) {
            this.f34340b.setTintMode(mode);
        }
        this.f34340b.initializeElevationOverlay(this.f34360v.getContext());
        if (i > 0) {
            Context context = this.f34360v.getContext();
            C15401a aVar = this.f34339a;
            aVar.getClass();
            C18720c cVar = new C18720c(aVar);
            Object obj = C8184a.f17966a;
            int a = C8184a.C8188d.m16468a(context, R.color.design_fab_stroke_top_outer_color);
            int a2 = C8184a.C8188d.m16468a(context, R.color.design_fab_stroke_top_inner_color);
            int a3 = C8184a.C8188d.m16468a(context, R.color.design_fab_stroke_end_inner_color);
            int a4 = C8184a.C8188d.m16468a(context, R.color.design_fab_stroke_end_outer_color);
            cVar.f41486i = a;
            cVar.f41487j = a2;
            cVar.f41488k = a3;
            cVar.f41489l = a4;
            float f = (float) i;
            if (cVar.f41485h != f) {
                cVar.f41485h = f;
                cVar.f41479b.setStrokeWidth(f * 1.3333f);
                cVar.f41491n = true;
                cVar.invalidateSelf();
            }
            if (colorStateList != null) {
                cVar.f41490m = colorStateList.getColorForState(cVar.getState(), cVar.f41490m);
            }
            cVar.f41493p = colorStateList;
            cVar.f41491n = true;
            cVar.invalidateSelf();
            this.f34342d = cVar;
            C18720c cVar2 = this.f34342d;
            cVar2.getClass();
            MaterialShapeDrawable materialShapeDrawable = this.f34340b;
            materialShapeDrawable.getClass();
            drawable = new LayerDrawable(new Drawable[]{cVar2, materialShapeDrawable});
        } else {
            this.f34342d = null;
            drawable = this.f34340b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C14091a.m21809c(colorStateList2), drawable, (Drawable) null);
        this.f34341c = rippleDrawable;
        this.f34343e = rippleDrawable;
    }

    /* renamed from: h */
    public final void mo54060h() {
    }

    /* renamed from: i */
    public final void mo54061i() {
        mo54069q();
    }

    /* renamed from: j */
    public final void mo54062j(int[] iArr) {
    }

    /* renamed from: k */
    public final void mo54063k(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C15323c.f34331D, mo70217r(f, f3));
        stateListAnimator.addState(C15323c.f34332E, mo70217r(f, f2));
        stateListAnimator.addState(C15323c.f34333F, mo70217r(f, f2));
        stateListAnimator.addState(C15323c.f34334G, mo70217r(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f34360v, "elevation", new float[]{f}).setDuration(0));
        arrayList.add(ObjectAnimator.ofFloat(this.f34360v, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C15323c.f34330C);
        stateListAnimator.addState(C15323c.f34335H, animatorSet);
        stateListAnimator.addState(C15323c.f34336I, mo70217r(0.0f, 0.0f));
        this.f34360v.setStateListAnimator(stateListAnimator);
        if (mo54067o()) {
            mo54069q();
        }
    }

    /* renamed from: m */
    public final void mo54065m(ColorStateList colorStateList) {
        Drawable drawable = this.f34341c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C14091a.m21809c(colorStateList));
        } else {
            super.mo54065m(colorStateList);
        }
    }

    /* renamed from: o */
    public final boolean mo54067o() {
        if (!FloatingActionButton.this.compatPadding) {
            if (!this.f34344f || this.f34360v.getSizeDimension() >= this.f34349k) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void mo54068p() {
    }

    /* renamed from: r */
    public final AnimatorSet mo70217r(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f34360v, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f34360v, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C15323c.f34330C);
        return animatorSet;
    }

    /* renamed from: s */
    public final MaterialShapeDrawable mo70218s() {
        C15401a aVar = this.f34339a;
        aVar.getClass();
        return new C18725a(aVar);
    }
}
