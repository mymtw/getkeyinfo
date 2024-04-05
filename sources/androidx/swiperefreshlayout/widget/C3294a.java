package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.swiperefreshlayout.widget.a */
public final class C3294a extends ImageView {

    /* renamed from: b */
    public Animation.AnimationListener f7662b;

    /* renamed from: c */
    public int f7663c;

    public C3294a(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C19388s.f43277h);
        this.f7663c = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5272s(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.f7663c);
        C2364y.C2368d.m5227q(this, shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f7662b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f7662b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f7663c = i;
        }
    }
}
