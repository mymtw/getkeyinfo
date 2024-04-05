package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.WindowManager;
import androidx.compose.p015ui.platform.C1830f0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.etsy.android.R;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p003a2.C0015b;
import p003a2.C0023f;
import p289y0.C8354f;
import p550dl.C17575a;
import p550dl.C17585k;
import p597jl.C18008a;
import p597jl.C18009b;
import p597jl.C18014c;
import p597jl.C18021j;
import p597jl.C18022k;
import p597jl.C18025l;
import p597jl.C18032s;
import p597jl.C18033t;
import p597jl.C18034u;
import p597jl.C18035v;
import p629nk.C18268a;
import p712xk.C18787a;

public final class MaterialContainerTransform extends Transition {
    private static final C15551d DEFAULT_ENTER_THRESHOLDS = new C15551d(new C15550c(0.0f, 0.25f), new C15550c(0.0f, 1.0f), new C15550c(0.0f, 1.0f), new C15550c(0.0f, 0.75f));
    private static final C15551d DEFAULT_ENTER_THRESHOLDS_ARC = new C15551d(new C15550c(0.1f, 0.4f), new C15550c(0.1f, 1.0f), new C15550c(0.1f, 1.0f), new C15550c(0.1f, 0.9f));
    private static final C15551d DEFAULT_RETURN_THRESHOLDS = new C15551d(new C15550c(0.6f, 0.9f), new C15550c(0.0f, 1.0f), new C15550c(0.0f, 0.9f), new C15550c(0.3f, 0.9f));
    private static final C15551d DEFAULT_RETURN_THRESHOLDS_ARC = new C15551d(new C15550c(0.6f, 0.9f), new C15550c(0.0f, 0.9f), new C15550c(0.0f, 0.9f), new C15550c(0.2f, 0.9f));
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private boolean appliedThemeValues = false;
    private int containerColor = 0;
    private boolean drawDebugEnabled = false;
    private int drawingViewId = 16908290;
    private boolean elevationShadowEnabled;
    private int endContainerColor = 0;
    private float endElevation;
    private C15401a endShapeAppearanceModel;
    private View endView;
    private int endViewId = -1;
    private int fadeMode = 0;
    private C15550c fadeProgressThresholds;
    private int fitMode = 0;
    /* access modifiers changed from: private */
    public boolean holdAtEndEnabled = false;
    private boolean pathMotionCustom = false;
    private C15550c scaleMaskProgressThresholds;
    private C15550c scaleProgressThresholds;
    private int scrimColor = 1375731712;
    private C15550c shapeMaskProgressThresholds;
    private int startContainerColor = 0;
    private float startElevation;
    private C15401a startShapeAppearanceModel;
    private View startView;
    private int startViewId = -1;
    private int transitionDirection = 0;

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$a */
    public class C15548a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C15552e f34946a;

        public C15548a(C15552e eVar) {
            this.f34946a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C15552e eVar = this.f34946a;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (eVar.f34969L != animatedFraction) {
                eVar.mo55303d(animatedFraction);
            }
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$b */
    public class C15549b extends C18032s {

        /* renamed from: a */
        public final /* synthetic */ View f34947a;

        /* renamed from: b */
        public final /* synthetic */ C15552e f34948b;

        /* renamed from: c */
        public final /* synthetic */ View f34949c;

        /* renamed from: d */
        public final /* synthetic */ View f34950d;

        public C15549b(View view, C15552e eVar, View view2, View view3) {
            this.f34947a = view;
            this.f34948b = eVar;
            this.f34949c = view2;
            this.f34950d = view3;
        }

        public final void onTransitionEnd(Transition transition) {
            MaterialContainerTransform.this.removeListener(this);
            if (!MaterialContainerTransform.this.holdAtEndEnabled) {
                this.f34949c.setAlpha(1.0f);
                this.f34950d.setAlpha(1.0f);
                View view = this.f34947a;
                ((ViewOverlay) (view == null ? null : new C1830f0(view)).f4088a).remove(this.f34948b);
            }
        }

        public final void onTransitionStart(Transition transition) {
            View view = this.f34947a;
            ((ViewOverlay) (view == null ? null : new C1830f0(view)).f4088a).add(this.f34948b);
            this.f34949c.setAlpha(0.0f);
            this.f34950d.setAlpha(0.0f);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$c */
    public static class C15550c {

        /* renamed from: a */
        public final float f34952a;

        /* renamed from: b */
        public final float f34953b;

        public C15550c(float f, float f2) {
            this.f34952a = f;
            this.f34953b = f2;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d */
    public static class C15551d {

        /* renamed from: a */
        public final C15550c f34954a;

        /* renamed from: b */
        public final C15550c f34955b;

        /* renamed from: c */
        public final C15550c f34956c;

        /* renamed from: d */
        public final C15550c f34957d;

        public C15551d(C15550c cVar, C15550c cVar2, C15550c cVar3, C15550c cVar4) {
            this.f34954a = cVar;
            this.f34955b = cVar2;
            this.f34956c = cVar3;
            this.f34957d = cVar4;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$e */
    public static final class C15552e extends Drawable {

        /* renamed from: A */
        public final C15551d f34958A;

        /* renamed from: B */
        public final C18008a f34959B;

        /* renamed from: C */
        public final C18021j f34960C;

        /* renamed from: D */
        public final boolean f34961D;

        /* renamed from: E */
        public final Paint f34962E;

        /* renamed from: F */
        public final Path f34963F;

        /* renamed from: G */
        public C18014c f34964G;

        /* renamed from: H */
        public C18025l f34965H;

        /* renamed from: I */
        public RectF f34966I;

        /* renamed from: J */
        public float f34967J;

        /* renamed from: K */
        public float f34968K;

        /* renamed from: L */
        public float f34969L;

        /* renamed from: a */
        public final View f34970a;

        /* renamed from: b */
        public final RectF f34971b;

        /* renamed from: c */
        public final C15401a f34972c;

        /* renamed from: d */
        public final float f34973d;

        /* renamed from: e */
        public final View f34974e;

        /* renamed from: f */
        public final RectF f34975f;

        /* renamed from: g */
        public final C15401a f34976g;

        /* renamed from: h */
        public final float f34977h;

        /* renamed from: i */
        public final Paint f34978i;

        /* renamed from: j */
        public final Paint f34979j;

        /* renamed from: k */
        public final Paint f34980k;

        /* renamed from: l */
        public final Paint f34981l = new Paint();

        /* renamed from: m */
        public final Paint f34982m;

        /* renamed from: n */
        public final C15558a f34983n;

        /* renamed from: o */
        public final PathMeasure f34984o;

        /* renamed from: p */
        public final float f34985p;

        /* renamed from: q */
        public final float[] f34986q;

        /* renamed from: r */
        public final boolean f34987r;

        /* renamed from: s */
        public final float f34988s;

        /* renamed from: t */
        public final float f34989t;

        /* renamed from: u */
        public final boolean f34990u;

        /* renamed from: v */
        public final MaterialShapeDrawable f34991v;

        /* renamed from: w */
        public final RectF f34992w;

        /* renamed from: x */
        public final RectF f34993x;

        /* renamed from: y */
        public final RectF f34994y;

        /* renamed from: z */
        public final RectF f34995z;

        public C15552e(PathMotion pathMotion, View view, RectF rectF, C15401a aVar, float f, View view2, RectF rectF2, C15401a aVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, C18008a aVar3, C18021j jVar, C15551d dVar, boolean z3) {
            RectF rectF3 = rectF;
            RectF rectF4 = rectF2;
            Paint paint = new Paint();
            this.f34978i = paint;
            Paint paint2 = new Paint();
            this.f34979j = paint2;
            Paint paint3 = new Paint();
            this.f34980k = paint3;
            Paint paint4 = new Paint();
            this.f34982m = paint4;
            this.f34983n = new C15558a();
            float[] fArr = new float[2];
            this.f34986q = fArr;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f34991v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f34962E = paint5;
            this.f34963F = new Path();
            this.f34970a = view;
            this.f34971b = rectF3;
            this.f34972c = aVar;
            this.f34973d = f;
            this.f34974e = view2;
            this.f34975f = rectF4;
            this.f34976g = aVar2;
            this.f34977h = f2;
            this.f34987r = z;
            this.f34990u = z2;
            this.f34959B = aVar3;
            this.f34960C = jVar;
            this.f34958A = dVar;
            this.f34961D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f34988s = (float) displayMetrics.widthPixels;
            this.f34989t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF5 = new RectF(rectF3);
            this.f34992w = rectF5;
            this.f34993x = new RectF(rectF5);
            RectF rectF6 = new RectF(rectF5);
            this.f34994y = rectF6;
            this.f34995z = new RectF(rectF6);
            PointF pointF = new PointF(rectF.centerX(), rectF3.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF4.top);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f34984o = pathMeasure;
            this.f34985p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF7 = C18035v.f39454a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i4, i4, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            mo55303d(0.0f);
        }

        /* renamed from: a */
        public final void mo55300a(Canvas canvas) {
            mo55302c(canvas, this.f34980k);
            Rect bounds = getBounds();
            RectF rectF = this.f34994y;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = this.f34965H.f39431b;
            int i = this.f34964G.f39411b;
            if (i > 0) {
                int save = canvas.save();
                canvas.translate(f, f2);
                canvas.scale(f3, f3);
                if (i < 255) {
                    RectF rectF2 = C18035v.f39454a;
                    rectF2.set(bounds);
                    canvas.saveLayerAlpha(rectF2, i);
                }
                this.f34974e.draw(canvas);
                canvas.restoreToCount(save);
            }
        }

        /* renamed from: b */
        public final void mo55301b(Canvas canvas) {
            mo55302c(canvas, this.f34979j);
            Rect bounds = getBounds();
            RectF rectF = this.f34992w;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = this.f34965H.f39430a;
            int i = this.f34964G.f39410a;
            if (i > 0) {
                int save = canvas.save();
                canvas.translate(f, f2);
                canvas.scale(f3, f3);
                if (i < 255) {
                    RectF rectF2 = C18035v.f39454a;
                    rectF2.set(bounds);
                    canvas.saveLayerAlpha(rectF2, i);
                }
                this.f34970a.draw(canvas);
                canvas.restoreToCount(save);
            }
        }

        /* renamed from: c */
        public final void mo55302c(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: d */
        public final void mo55303d(float f) {
            float f2;
            float f3;
            float f4;
            float f5 = f;
            this.f34969L = f5;
            Paint paint = this.f34982m;
            if (this.f34987r) {
                RectF rectF = C18035v.f39454a;
                f2 = (f5 * 255.0f) + 0.0f;
            } else {
                RectF rectF2 = C18035v.f39454a;
                f2 = (-255.0f * f5) + 255.0f;
            }
            paint.setAlpha((int) f2);
            this.f34984o.getPosTan(this.f34985p * f5, this.f34986q, (float[]) null);
            float[] fArr = this.f34986q;
            float f6 = fArr[0];
            float f7 = fArr[1];
            int i = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
            if (i > 0 || f5 < 0.0f) {
                if (i > 0) {
                    f4 = 0.99f;
                    f3 = (f5 - 1.0f) / 0.00999999f;
                } else {
                    f4 = 0.01f;
                    f3 = (f5 / 0.01f) * -1.0f;
                }
                this.f34984o.getPosTan(this.f34985p * f4, fArr, (float[]) null);
                float[] fArr2 = this.f34986q;
                float f8 = fArr2[0];
                float f9 = fArr2[1];
                f6 = C0023f.m103b(f6, f8, f3, f6);
                f7 = C0023f.m103b(f7, f9, f3, f7);
            }
            float f10 = f6;
            float f11 = f7;
            Float valueOf = Float.valueOf(this.f34958A.f34955b.f34952a);
            valueOf.getClass();
            float floatValue = valueOf.floatValue();
            Float valueOf2 = Float.valueOf(this.f34958A.f34955b.f34953b);
            valueOf2.getClass();
            C18025l b = this.f34960C.mo69589b(f, floatValue, valueOf2.floatValue(), this.f34971b.width(), this.f34971b.height(), this.f34975f.width(), this.f34975f.height());
            this.f34965H = b;
            RectF rectF3 = this.f34992w;
            float f12 = b.f39432c / 2.0f;
            rectF3.set(f10 - f12, f11, f12 + f10, b.f39433d + f11);
            RectF rectF4 = this.f34994y;
            C18025l lVar = this.f34965H;
            float f13 = lVar.f39434e / 2.0f;
            rectF4.set(f10 - f13, f11, f13 + f10, lVar.f39435f + f11);
            this.f34993x.set(this.f34992w);
            this.f34995z.set(this.f34994y);
            Float valueOf3 = Float.valueOf(this.f34958A.f34956c.f34952a);
            valueOf3.getClass();
            float floatValue2 = valueOf3.floatValue();
            Float valueOf4 = Float.valueOf(this.f34958A.f34956c.f34953b);
            valueOf4.getClass();
            float floatValue3 = valueOf4.floatValue();
            boolean a = this.f34960C.mo69588a(this.f34965H);
            RectF rectF5 = a ? this.f34993x : this.f34995z;
            float c = C18035v.m30473c(0.0f, 1.0f, floatValue2, floatValue3, f, false);
            if (!a) {
                c = 1.0f - c;
            }
            this.f34960C.mo69590c(rectF5, c, this.f34965H);
            this.f34966I = new RectF(Math.min(this.f34993x.left, this.f34995z.left), Math.min(this.f34993x.top, this.f34995z.top), Math.max(this.f34993x.right, this.f34995z.right), Math.max(this.f34993x.bottom, this.f34995z.bottom));
            C15558a aVar = this.f34983n;
            C15401a aVar2 = this.f34972c;
            C15401a aVar3 = this.f34976g;
            RectF rectF6 = this.f34992w;
            RectF rectF7 = this.f34993x;
            RectF rectF8 = this.f34995z;
            C15550c cVar = this.f34958A.f34957d;
            aVar.getClass();
            float f14 = cVar.f34952a;
            float f15 = cVar.f34953b;
            if (f5 >= f14) {
                if (f5 > f15) {
                    aVar2 = aVar3;
                } else {
                    C18034u uVar = r1;
                    C18034u uVar2 = new C18034u(rectF6, rectF8, f14, f15, f);
                    C15401a aVar4 = (aVar2.f34575e.mo68901a(rectF6) > 0.0f ? 1 : (aVar2.f34575e.mo68901a(rectF6) == 0.0f ? 0 : -1)) != 0 || (aVar2.f34576f.mo68901a(rectF6) > 0.0f ? 1 : (aVar2.f34576f.mo68901a(rectF6) == 0.0f ? 0 : -1)) != 0 || (aVar2.f34577g.mo68901a(rectF6) > 0.0f ? 1 : (aVar2.f34577g.mo68901a(rectF6) == 0.0f ? 0 : -1)) != 0 || (aVar2.f34578h.mo68901a(rectF6) > 0.0f ? 1 : (aVar2.f34578h.mo68901a(rectF6) == 0.0f ? 0 : -1)) != 0 ? aVar2 : aVar3;
                    aVar4.getClass();
                    C15401a.C15402a aVar5 = new C15401a.C15402a(aVar4);
                    aVar5.f34587e = uVar.mo69597a(aVar2.f34575e, aVar3.f34575e);
                    aVar5.f34588f = uVar.mo69597a(aVar2.f34576f, aVar3.f34576f);
                    aVar5.f34590h = uVar.mo69597a(aVar2.f34578h, aVar3.f34578h);
                    aVar5.f34589g = uVar.mo69597a(aVar2.f34577g, aVar3.f34577g);
                    aVar2 = new C15401a(aVar5);
                }
            }
            aVar.f35006e = aVar2;
            aVar.f35005d.mo54622a(aVar2, 1.0f, rectF7, aVar.f35003b);
            aVar.f35005d.mo54622a(aVar.f35006e, 1.0f, rectF8, aVar.f35004c);
            aVar.f35002a.op(aVar.f35003b, aVar.f35004c, Path.Op.UNION);
            float f16 = this.f34973d;
            this.f34967J = C0023f.m103b(this.f34977h, f16, f5, f16);
            RectF rectF9 = this.f34966I;
            float f17 = this.f34988s;
            RectF rectF10 = this.f34966I;
            float f18 = this.f34989t;
            float f19 = this.f34967J;
            float centerY = (float) ((int) ((rectF10.centerY() / f18) * 1.5f * f19));
            this.f34968K = centerY;
            this.f34981l.setShadowLayer(f19, (float) ((int) (((rectF9.centerX() / (f17 / 2.0f)) - 1.0f) * 0.3f * f19)), centerY, 754974720);
            Float valueOf5 = Float.valueOf(this.f34958A.f34954a.f34952a);
            valueOf5.getClass();
            float floatValue4 = valueOf5.floatValue();
            Float valueOf6 = Float.valueOf(this.f34958A.f34954a.f34953b);
            valueOf6.getClass();
            this.f34964G = this.f34959B.mo69581a(f5, floatValue4, valueOf6.floatValue());
            if (this.f34979j.getColor() != 0) {
                this.f34979j.setAlpha(this.f34964G.f39410a);
            }
            if (this.f34980k.getColor() != 0) {
                this.f34980k.setAlpha(this.f34964G.f39411b);
            }
            invalidateSelf();
        }

        public final void draw(Canvas canvas) {
            if (this.f34982m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f34982m);
            }
            int save = this.f34961D ? canvas.save() : -1;
            if (this.f34990u && this.f34967J > 0.0f) {
                canvas.save();
                canvas.clipPath(this.f34983n.f35002a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    C15401a aVar = this.f34983n.f35006e;
                    if (aVar.mo54613e(this.f34966I)) {
                        float a = aVar.f34575e.mo68901a(this.f34966I);
                        canvas.drawRoundRect(this.f34966I, a, a, this.f34981l);
                    } else {
                        canvas.drawPath(this.f34983n.f35002a, this.f34981l);
                    }
                } else {
                    MaterialShapeDrawable materialShapeDrawable = this.f34991v;
                    RectF rectF = this.f34966I;
                    materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.f34991v.setElevation(this.f34967J);
                    this.f34991v.setShadowVerticalOffset((int) this.f34968K);
                    this.f34991v.setShapeAppearanceModel(this.f34983n.f35006e);
                    this.f34991v.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(this.f34983n.f35002a);
            mo55302c(canvas, this.f34978i);
            if (this.f34964G.f39412c) {
                mo55301b(canvas);
                mo55300a(canvas);
            } else {
                mo55300a(canvas);
                mo55301b(canvas);
            }
            if (this.f34961D) {
                canvas.restoreToCount(save);
                RectF rectF2 = this.f34992w;
                Path path = this.f34963F;
                PointF pointF = new PointF(rectF2.centerX(), rectF2.top);
                if (this.f34969L == 0.0f) {
                    path.reset();
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    path.lineTo(pointF.x, pointF.y);
                    this.f34962E.setColor(-65281);
                    canvas.drawPath(path, this.f34962E);
                }
                RectF rectF3 = this.f34993x;
                this.f34962E.setColor(-256);
                canvas.drawRect(rectF3, this.f34962E);
                RectF rectF4 = this.f34992w;
                this.f34962E.setColor(-16711936);
                canvas.drawRect(rectF4, this.f34962E);
                RectF rectF5 = this.f34995z;
                this.f34962E.setColor(-16711681);
                canvas.drawRect(rectF5, this.f34962E);
                RectF rectF6 = this.f34994y;
                this.f34962E.setColor(-16776961);
                canvas.drawRect(rectF6, this.f34962E);
            }
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public final void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    static {
        Class<MaterialContainerTransform> cls = MaterialContainerTransform.class;
    }

    public MaterialContainerTransform() {
        boolean z = false;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }

    private C15551d buildThresholdsGroup(boolean z) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) ? getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC) : getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF b = C18035v.m30472b(view2);
        b.offset(f, f2);
        return b;
    }

    private static C15401a captureShapeAppearance(View view, RectF rectF, C15401a aVar) {
        C15401a shapeAppearance = getShapeAppearance(view, aVar);
        RectF rectF2 = C18035v.f39454a;
        return shapeAppearance.mo54615g(new C18033t(rectF));
    }

    private static void captureValues(TransitionValues transitionValues, View view, int i, C15401a aVar) {
        RectF rectF;
        if (i != -1) {
            View view2 = transitionValues.view;
            RectF rectF2 = C18035v.f39454a;
            View findViewById = view2.findViewById(i);
            if (findViewById == null) {
                findViewById = C18035v.m30471a(i, view2);
            }
            transitionValues.view = findViewById;
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, (Object) null);
            transitionValues.view = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view3 = transitionValues.view;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2371g.m5246c(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                RectF rectF3 = C18035v.f39454a;
                rectF = new RectF((float) view3.getLeft(), (float) view3.getTop(), (float) view3.getRight(), (float) view3.getBottom());
            } else {
                rectF = C18035v.m30472b(view3);
            }
            transitionValues.values.put(PROP_BOUNDS, rectF);
            transitionValues.values.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view3, rectF, aVar));
        }
    }

    private static float getElevationOrDefault(float f, View view) {
        if (f != -1.0f) {
            return f;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2373i.m5262i(view);
    }

    private static C15401a getShapeAppearance(View view, C15401a aVar) {
        if (aVar != null) {
            return aVar;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof C15401a) {
            return (C15401a) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        return transitionShapeAppearanceResId != -1 ? new C15401a(C15401a.m24980a(context, transitionShapeAppearanceResId, 0, new C17575a((float) 0))) : view instanceof C17585k ? ((C17585k) view).getShapeAppearanceModel() : new C15401a(new C15401a.C15402a());
    }

    private C15551d getThresholdsOrDefault(boolean z, C15551d dVar, C15551d dVar2) {
        if (!z) {
            dVar = dVar2;
        }
        C15550c cVar = this.fadeProgressThresholds;
        C15550c cVar2 = dVar.f34954a;
        RectF rectF = C18035v.f39454a;
        if (cVar == null) {
            cVar = cVar2;
        }
        C15550c cVar3 = this.scaleProgressThresholds;
        C15550c cVar4 = dVar.f34955b;
        if (cVar3 == null) {
            cVar3 = cVar4;
        }
        C15550c cVar5 = this.scaleMaskProgressThresholds;
        C15550c cVar6 = dVar.f34956c;
        if (cVar5 == null) {
            cVar5 = cVar6;
        }
        C15550c cVar7 = this.shapeMaskProgressThresholds;
        C15550c cVar8 = dVar.f34957d;
        if (cVar7 == null) {
            cVar7 = cVar8;
        }
        return new C15551d(cVar, cVar3, cVar5, cVar7);
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            RectF rectF3 = C18035v.f39454a;
            return rectF2.height() * rectF2.width() > rectF.height() * rectF.width();
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            StringBuilder h = C0072d.m201h("Invalid transition direction: ");
            h.append(this.transitionDirection);
            throw new IllegalArgumentException(h.toString());
        }
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        int c;
        FastOutSlowInInterpolator fastOutSlowInInterpolator = C18268a.f40092b;
        RectF rectF = C18035v.f39454a;
        if (getInterpolator() == null) {
            setInterpolator(C18787a.m31706d(context, R.attr.motionEasingStandard, fastOutSlowInInterpolator));
        }
        int i = z ? R.attr.motionDurationLong1 : R.attr.motionDurationMedium2;
        if (!(i == 0 || getDuration() != -1 || (c = C18787a.m31705c(i, context, -1)) == -1)) {
            setDuration((long) c);
        }
        if (!this.pathMotionCustom) {
            TypedValue typedValue = new TypedValue();
            PathMotion pathMotion = null;
            if (context.getTheme().resolveAttribute(R.attr.motionPath, typedValue, true)) {
                int i2 = typedValue.type;
                if (i2 == 16) {
                    int i3 = typedValue.data;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            pathMotion = new MaterialArcMotion();
                        } else {
                            throw new IllegalArgumentException(C0015b.m88g("Invalid motion path type: ", i3));
                        }
                    }
                } else if (i2 == 3) {
                    pathMotion = new PatternPathMotion(C8354f.m16674d(String.valueOf(typedValue.string)));
                } else {
                    throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                }
            }
            if (pathMotion != null) {
                setPathMotion(pathMotion);
            }
        }
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        View view2;
        C18008a aVar;
        C18021j jVar;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (!(transitionValues3 == null || transitionValues4 == null)) {
            RectF rectF = (RectF) transitionValues3.values.get(PROP_BOUNDS);
            C15401a aVar2 = (C15401a) transitionValues3.values.get(PROP_SHAPE_APPEARANCE);
            if (rectF == null || aVar2 == null) {
                Log.w(TAG, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            } else {
                RectF rectF2 = (RectF) transitionValues4.values.get(PROP_BOUNDS);
                C15401a aVar3 = (C15401a) transitionValues4.values.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 == null || aVar3 == null) {
                    Log.w(TAG, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view3 = transitionValues3.view;
                View view4 = transitionValues4.view;
                View view5 = view4.getParent() != null ? view4 : view3;
                if (this.drawingViewId == view5.getId()) {
                    view = (View) view5.getParent();
                    view2 = view5;
                } else {
                    view = C18035v.m30471a(this.drawingViewId, view5);
                    view2 = null;
                }
                RectF b = C18035v.m30472b(view);
                float f = -b.left;
                float f2 = -b.top;
                RectF calculateDrawableBounds = calculateDrawableBounds(view, view2, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean isEntering = isEntering(rectF, rectF2);
                if (!this.appliedThemeValues) {
                    maybeApplyThemeValues(view5.getContext(), isEntering);
                }
                PathMotion pathMotion = getPathMotion();
                float elevationOrDefault = getElevationOrDefault(this.startElevation, view3);
                float elevationOrDefault2 = getElevationOrDefault(this.endElevation, view4);
                int i = this.containerColor;
                int i2 = this.startContainerColor;
                int i3 = this.endContainerColor;
                View view6 = view;
                int i4 = this.scrimColor;
                RectF rectF3 = calculateDrawableBounds;
                boolean z = this.elevationShadowEnabled;
                int i5 = i3;
                int i6 = this.fadeMode;
                int i7 = i2;
                boolean z2 = true;
                int i8 = i;
                if (i6 == 0) {
                    aVar = isEntering ? C18009b.f39406a : C18009b.f39407b;
                } else if (i6 == 1) {
                    aVar = isEntering ? C18009b.f39407b : C18009b.f39406a;
                } else if (i6 == 2) {
                    aVar = C18009b.f39408c;
                } else if (i6 == 3) {
                    aVar = C18009b.f39409d;
                } else {
                    throw new IllegalArgumentException(C0015b.m88g("Invalid fade mode: ", i6));
                }
                C18008a aVar4 = aVar;
                int i9 = this.fitMode;
                if (i9 == 0) {
                    float width = rectF.width();
                    float height = rectF.height();
                    float width2 = rectF2.width();
                    float height2 = rectF2.height();
                    float f3 = (height2 * width) / width2;
                    float f4 = (width2 * height) / width;
                    if (!isEntering ? f4 < height2 : f3 < height) {
                        z2 = false;
                    }
                    jVar = z2 ? C18022k.f39428a : C18022k.f39429b;
                } else if (i9 == 1) {
                    jVar = C18022k.f39428a;
                } else if (i9 == 2) {
                    jVar = C18022k.f39429b;
                } else {
                    throw new IllegalArgumentException(C0015b.m88g("Invalid fit mode: ", i9));
                }
                C15552e eVar = new C15552e(pathMotion, view3, rectF, aVar2, elevationOrDefault, view4, rectF2, aVar3, elevationOrDefault2, i8, i7, i5, i4, isEntering, z, aVar4, jVar, buildThresholdsGroup(isEntering), this.drawDebugEnabled);
                RectF rectF4 = rectF3;
                eVar.setBounds(Math.round(rectF4.left), Math.round(rectF4.top), Math.round(rectF4.right), Math.round(rectF4.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new C15548a(eVar));
                addListener(new C15549b(view6, eVar, view3, view4));
                return ofFloat;
            }
        }
        return null;
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public C15401a getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public View getEndView() {
        return this.endView;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public C15550c getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public C15550c getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public C15550c getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public C15550c getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public C15401a getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public View getStartView() {
        return this.startView;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public void setContainerColor(int i) {
        this.containerColor = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    public void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public void setEndShapeAppearanceModel(C15401a aVar) {
        this.endShapeAppearanceModel = aVar;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public void setEndViewId(int i) {
        this.endViewId = i;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public void setFadeProgressThresholds(C15550c cVar) {
        this.fadeProgressThresholds = cVar;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    public void setScaleMaskProgressThresholds(C15550c cVar) {
        this.scaleMaskProgressThresholds = cVar;
    }

    public void setScaleProgressThresholds(C15550c cVar) {
        this.scaleProgressThresholds = cVar;
    }

    public void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public void setShapeMaskProgressThresholds(C15550c cVar) {
        this.shapeMaskProgressThresholds = cVar;
    }

    public void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public void setStartShapeAppearanceModel(C15401a aVar) {
        this.startShapeAppearanceModel = aVar;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public void setStartViewId(int i) {
        this.startViewId = i;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public MaterialContainerTransform(Context context, boolean z) {
        boolean z2 = false;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28 ? true : z2;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }
}
