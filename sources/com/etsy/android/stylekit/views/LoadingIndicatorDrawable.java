package com.etsy.android.stylekit.views;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289y0.C8351c;
import p435rb.C13350a;

public final class LoadingIndicatorDrawable extends Drawable implements Animatable {
    public static final int $stable = 8;
    private final long angleAnimatorDuration;
    private final int arcColor;
    private final Paint backgroundPaint;
    /* access modifiers changed from: private */
    public final float borderWidth;
    private int currentArcMidpoint;
    private final C19285c fBounds$delegate;
    private final AnimatorSet indeterminateAnimator;
    private final Paint paint;
    private final int size;

    /* renamed from: com.etsy.android.stylekit.views.LoadingIndicatorDrawable$a */
    public /* synthetic */ class C9049a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19919a;

        static {
            int[] iArr = new int[LoadingIndicatorView.ColorScheme.values().length];
            iArr[LoadingIndicatorView.ColorScheme.LIGHT.ordinal()] = 1;
            iArr[LoadingIndicatorView.ColorScheme.INVERT.ordinal()] = 2;
            iArr[LoadingIndicatorView.ColorScheme.NORMAL.ordinal()] = 3;
            f19919a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingIndicatorDrawable(Context context, LoadingIndicatorView.ColorScheme colorScheme, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? LoadingIndicatorView.ColorScheme.NORMAL : colorScheme, (i & 4) != 0 ? false : z);
    }

    private final ValueAnimator angleValueAnimator(TimeInterpolator timeInterpolator) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 360});
        ofInt.setInterpolator(timeInterpolator);
        ofInt.setDuration(this.angleAnimatorDuration);
        ofInt.setRepeatCount(-1);
        ofInt.addUpdateListener(new C9076v(this));
        return ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: angleValueAnimator$lambda-4$lambda-3  reason: not valid java name */
    public static final void m34906angleValueAnimator$lambda4$lambda3(LoadingIndicatorDrawable loadingIndicatorDrawable, ValueAnimator valueAnimator) {
        C19383o.m32797g(loadingIndicatorDrawable, "this$0");
        C19383o.m32797g(valueAnimator, ResponseConstants.ANIMATION);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C19383o.m32795e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        loadingIndicatorDrawable.currentArcMidpoint = ((Integer) animatedValue).intValue();
        Drawable.Callback callback = loadingIndicatorDrawable.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(loadingIndicatorDrawable);
        }
    }

    private final Pair<Float, Float> getAngles() {
        int i = this.currentArcMidpoint;
        int i2 = i < 180 ? i : 360 - i;
        float f = (float) i;
        float f2 = ((float) i2) / 2.0f;
        float f3 = f - f2;
        return new Pair<>(Float.valueOf(f3 - 90.0f), Float.valueOf((f + f2) - f3));
    }

    private final RectF getFBounds() {
        return (RectF) this.fBounds$delegate.getValue();
    }

    public void draw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        canvas.drawOval(getFBounds(), this.backgroundPaint);
        Pair<Float, Float> angles = getAngles();
        Canvas canvas2 = canvas;
        canvas2.drawArc(getFBounds(), angles.component1().floatValue(), angles.component2().floatValue(), false, this.paint);
    }

    public int getIntrinsicHeight() {
        return this.size;
    }

    public int getIntrinsicWidth() {
        return this.size;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.indeterminateAnimator.isRunning();
    }

    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public void start() {
        if (!isRunning()) {
            this.indeterminateAnimator.start();
        }
    }

    public void stop() {
        if (isRunning()) {
            this.indeterminateAnimator.end();
        }
    }

    public LoadingIndicatorDrawable(Context context, LoadingIndicatorView.ColorScheme colorScheme, boolean z) {
        int i;
        int i2;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(colorScheme, "colorScheme");
        this.angleAnimatorDuration = 1200;
        float e = (float) C13350a.m21014e(Integer.valueOf(z ? 6 : 4), context);
        this.borderWidth = e;
        if (z) {
            i = C13350a.m21014e(48, context);
        } else {
            i = C13350a.m21014e(24, context);
        }
        this.size = i;
        int i3 = C9049a.f19919a[colorScheme.ordinal()];
        if (i3 == 1) {
            i2 = C13350a.m21012c(context, R.color.clg_color_white);
        } else if (i3 == 2) {
            i2 = C13350a.m21013d(context, R.attr.clg_color_text_primary_inverse);
        } else if (i3 == 3) {
            i2 = C13350a.m21013d(context, R.attr.clg_color_text_primary);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.arcColor = i2;
        this.fBounds$delegate = C19350d.m32677b(new LoadingIndicatorDrawable$fBounds$2(this));
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(e);
        paint2.setColor(i2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.paint = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(e);
        paint3.setColor(C8351c.m16666h(i2, 51));
        this.backgroundPaint = paint3;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(angleValueAnimator(new LinearInterpolator()));
        this.indeterminateAnimator = animatorSet;
    }
}
