package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import p003a2.C0023f;

public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final int[] COLORS = {-16777216};
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    public boolean mFinishing;
    private Resources mResources;
    private final C3282c mRing;
    private float mRotation;
    public float mRotationCount;

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$a */
    public class C3280a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C3282c f7626a;

        public C3280a(C3282c cVar) {
            this.f7626a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.updateRingColor(floatValue, this.f7626a);
            CircularProgressDrawable.this.applyTransformation(floatValue, this.f7626a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$b */
    public class C3281b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C3282c f7628a;

        public C3281b(C3282c cVar) {
            this.f7628a = cVar;
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.applyTransformation(1.0f, this.f7628a, true);
            C3282c cVar = this.f7628a;
            cVar.f7640k = cVar.f7634e;
            cVar.f7641l = cVar.f7635f;
            cVar.f7642m = cVar.f7636g;
            cVar.mo12247a((cVar.f7639j + 1) % cVar.f7638i.length);
            CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
            if (circularProgressDrawable.mFinishing) {
                circularProgressDrawable.mFinishing = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                C3282c cVar2 = this.f7628a;
                if (cVar2.f7643n) {
                    cVar2.f7643n = false;
                    return;
                }
                return;
            }
            circularProgressDrawable.mRotationCount += 1.0f;
        }

        public final void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.mRotationCount = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$c */
    public static class C3282c {

        /* renamed from: a */
        public final RectF f7630a = new RectF();

        /* renamed from: b */
        public final Paint f7631b;

        /* renamed from: c */
        public final Paint f7632c;

        /* renamed from: d */
        public final Paint f7633d;

        /* renamed from: e */
        public float f7634e;

        /* renamed from: f */
        public float f7635f;

        /* renamed from: g */
        public float f7636g;

        /* renamed from: h */
        public float f7637h;

        /* renamed from: i */
        public int[] f7638i;

        /* renamed from: j */
        public int f7639j;

        /* renamed from: k */
        public float f7640k;

        /* renamed from: l */
        public float f7641l;

        /* renamed from: m */
        public float f7642m;

        /* renamed from: n */
        public boolean f7643n;

        /* renamed from: o */
        public Path f7644o;

        /* renamed from: p */
        public float f7645p;

        /* renamed from: q */
        public float f7646q;

        /* renamed from: r */
        public int f7647r;

        /* renamed from: s */
        public int f7648s;

        /* renamed from: t */
        public int f7649t;

        /* renamed from: u */
        public int f7650u;

        public C3282c() {
            Paint paint = new Paint();
            this.f7631b = paint;
            Paint paint2 = new Paint();
            this.f7632c = paint2;
            Paint paint3 = new Paint();
            this.f7633d = paint3;
            this.f7634e = 0.0f;
            this.f7635f = 0.0f;
            this.f7636g = 0.0f;
            this.f7637h = 5.0f;
            this.f7645p = 1.0f;
            this.f7649t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: a */
        public final void mo12247a(int i) {
            this.f7639j = i;
            this.f7650u = this.f7638i[i];
        }
    }

    public CircularProgressDrawable(Context context) {
        context.getClass();
        this.mResources = context.getResources();
        C3282c cVar = new C3282c();
        this.mRing = cVar;
        cVar.f7638i = COLORS;
        cVar.mo12247a(0);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, C3282c cVar) {
        updateRingColor(f, cVar);
        float f2 = cVar.f7640k;
        float f3 = cVar.f7641l;
        cVar.f7634e = (((f3 - MIN_PROGRESS_ARC) - f2) * f) + f2;
        cVar.f7635f = f3;
        float f4 = cVar.f7642m;
        cVar.f7636g = C0023f.m103b((float) (Math.floor((double) (cVar.f7642m / MAX_PROGRESS_ARC)) + 1.0d), f4, f, f4);
    }

    private int evaluateColorChange(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    private float getRotation() {
        return this.mRotation;
    }

    private void setRotation(float f) {
        this.mRotation = f;
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        C3282c cVar = this.mRing;
        float f5 = this.mResources.getDisplayMetrics().density;
        float f6 = f2 * f5;
        cVar.f7637h = f6;
        cVar.f7631b.setStrokeWidth(f6);
        cVar.f7646q = f * f5;
        cVar.mo12247a(0);
        cVar.f7647r = (int) (f3 * f5);
        cVar.f7648s = (int) (f4 * f5);
    }

    private void setupAnimators() {
        C3282c cVar = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C3280a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new C3281b(cVar));
        this.mAnimator = ofFloat;
    }

    public void applyTransformation(float f, C3282c cVar, boolean z) {
        float f2;
        float f3;
        if (this.mFinishing) {
            applyFinishTranslation(f, cVar);
        } else if (f != 1.0f || z) {
            float f4 = cVar.f7642m;
            if (f < 0.5f) {
                f2 = cVar.f7640k;
                f3 = (MATERIAL_INTERPOLATOR.getInterpolation(f / 0.5f) * 0.79f) + MIN_PROGRESS_ARC + f2;
            } else {
                float f5 = cVar.f7640k + 0.79f;
                float f6 = f5;
                f2 = f5 - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + MIN_PROGRESS_ARC);
                f3 = f6;
            }
            float f7 = (f + this.mRotationCount) * GROUP_FULL_ROTATION;
            cVar.f7634e = f2;
            cVar.f7635f = f3;
            cVar.f7636g = (RING_ROTATION * f) + f4;
            setRotation(f7);
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        C3282c cVar = this.mRing;
        RectF rectF = cVar.f7630a;
        float f = cVar.f7646q;
        float f2 = (cVar.f7637h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) cVar.f7647r) * cVar.f7645p) / 2.0f, cVar.f7637h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = cVar.f7634e;
        float f4 = cVar.f7636g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((cVar.f7635f + f4) * 360.0f) - f5;
        cVar.f7631b.setColor(cVar.f7650u);
        cVar.f7631b.setAlpha(cVar.f7649t);
        float f7 = cVar.f7637h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cVar.f7633d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, cVar.f7631b);
        if (cVar.f7643n) {
            Path path = cVar.f7644o;
            if (path == null) {
                Path path2 = new Path();
                cVar.f7644o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            cVar.f7644o.moveTo(0.0f, 0.0f);
            cVar.f7644o.lineTo(((float) cVar.f7647r) * cVar.f7645p, 0.0f);
            Path path3 = cVar.f7644o;
            float f9 = cVar.f7645p;
            path3.lineTo((((float) cVar.f7647r) * f9) / 2.0f, ((float) cVar.f7648s) * f9);
            cVar.f7644o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) cVar.f7647r) * cVar.f7645p) / 2.0f), (cVar.f7637h / 2.0f) + rectF.centerY());
            cVar.f7644o.close();
            cVar.f7632c.setColor(cVar.f7650u);
            cVar.f7632c.setAlpha(cVar.f7649t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(cVar.f7644o, cVar.f7632c);
            canvas.restore();
        }
        canvas.restore();
    }

    public int getAlpha() {
        return this.mRing.f7649t;
    }

    public boolean getArrowEnabled() {
        return this.mRing.f7643n;
    }

    public float getArrowHeight() {
        return (float) this.mRing.f7648s;
    }

    public float getArrowScale() {
        return this.mRing.f7645p;
    }

    public float getArrowWidth() {
        return (float) this.mRing.f7647r;
    }

    public int getBackgroundColor() {
        return this.mRing.f7633d.getColor();
    }

    public float getCenterRadius() {
        return this.mRing.f7646q;
    }

    public int[] getColorSchemeColors() {
        return this.mRing.f7638i;
    }

    public float getEndTrim() {
        return this.mRing.f7635f;
    }

    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.mRing.f7636g;
    }

    public float getStartTrim() {
        return this.mRing.f7634e;
    }

    public Paint.Cap getStrokeCap() {
        return this.mRing.f7631b.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.mRing.f7637h;
    }

    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    public void setAlpha(int i) {
        this.mRing.f7649t = i;
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        C3282c cVar = this.mRing;
        cVar.f7647r = (int) f;
        cVar.f7648s = (int) f2;
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        C3282c cVar = this.mRing;
        if (cVar.f7643n != z) {
            cVar.f7643n = z;
        }
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        C3282c cVar = this.mRing;
        if (f != cVar.f7645p) {
            cVar.f7645p = f;
        }
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        this.mRing.f7633d.setColor(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.mRing.f7646q = f;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.f7631b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        C3282c cVar = this.mRing;
        cVar.f7638i = iArr;
        cVar.mo12247a(0);
        this.mRing.mo12247a(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.mRing.f7636g = f;
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        C3282c cVar = this.mRing;
        cVar.f7634e = f;
        cVar.f7635f = f2;
        invalidateSelf();
    }

    public void setStrokeCap(Paint.Cap cap) {
        this.mRing.f7631b.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        C3282c cVar = this.mRing;
        cVar.f7637h = f;
        cVar.f7631b.setStrokeWidth(f);
        invalidateSelf();
    }

    public void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(CENTER_RADIUS_LARGE, STROKE_WIDTH_LARGE, 12.0f, 6.0f);
        } else {
            setSizeParameters(CENTER_RADIUS, STROKE_WIDTH, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void start() {
        this.mAnimator.cancel();
        C3282c cVar = this.mRing;
        float f = cVar.f7634e;
        cVar.f7640k = f;
        float f2 = cVar.f7635f;
        cVar.f7641l = f2;
        cVar.f7642m = cVar.f7636g;
        if (f2 != f) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666);
            this.mAnimator.start();
            return;
        }
        cVar.mo12247a(0);
        C3282c cVar2 = this.mRing;
        cVar2.f7640k = 0.0f;
        cVar2.f7641l = 0.0f;
        cVar2.f7642m = 0.0f;
        cVar2.f7634e = 0.0f;
        cVar2.f7635f = 0.0f;
        cVar2.f7636g = 0.0f;
        this.mAnimator.setDuration(1332);
        this.mAnimator.start();
    }

    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        C3282c cVar = this.mRing;
        if (cVar.f7643n) {
            cVar.f7643n = false;
        }
        cVar.mo12247a(0);
        C3282c cVar2 = this.mRing;
        cVar2.f7640k = 0.0f;
        cVar2.f7641l = 0.0f;
        cVar2.f7642m = 0.0f;
        cVar2.f7634e = 0.0f;
        cVar2.f7635f = 0.0f;
        cVar2.f7636g = 0.0f;
        invalidateSelf();
    }

    public void updateRingColor(float f, C3282c cVar) {
        if (f > 0.75f) {
            int[] iArr = cVar.f7638i;
            int i = cVar.f7639j;
            cVar.f7650u = evaluateColorChange((f - 0.75f) / 0.25f, iArr[i], iArr[(i + 1) % iArr.length]);
            return;
        }
        cVar.f7650u = cVar.f7638i[cVar.f7639j];
    }
}
