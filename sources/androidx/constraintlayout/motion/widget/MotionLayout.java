package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.widget.C2150q;
import androidx.constraintlayout.solver.widgets.C2197a;
import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.C2221e;
import androidx.constraintlayout.solver.widgets.C2223f;
import androidx.constraintlayout.solver.widgets.C2226h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2200b;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.view.C2321o;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.C19421p;
import p003a2.C0015b;
import p003a2.C0023f;
import p010a9.C0048b;
import p184n0.C7359a;
import p184n0.C7368g;
import p203p0.C7646a;
import p203p0.C7647b;
import p203p0.C7648c;
import p212q0.C7709a;
import p212q0.C7714d;

public class MotionLayout extends ConstraintLayout implements C2321o {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int MAX_KEY_FRAMES = 50;
    public static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    public boolean firstDown = true;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime = 0;
    /* access modifiers changed from: private */
    public int mBeginState = -1;
    private RectF mBoundsCheck = new RectF();
    public int mCurrentState = -1;
    public int mDebugPath = 0;
    private C2107c mDecelerateLogic = new C2107c();
    private C2115b mDesignTool;
    public C2108d mDevModeDraw;
    /* access modifiers changed from: private */
    public int mEndState = -1;
    public int mEndWrapHeight;
    public int mEndWrapWidth;
    public HashMap<View, C2148o> mFrameArrayList = new HashMap<>();
    private int mFrames = 0;
    public int mHeightMeasureMode;
    private boolean mInLayout = false;
    public boolean mInTransition = false;
    public boolean mIndirectTransition = false;
    private boolean mInteractionEnabled = true;
    public Interpolator mInterpolator;
    public boolean mIsAnimating = false;
    private boolean mKeepAnimating = false;
    private C2119e mKeyCache = new C2119e();
    private long mLastDrawTime = -1;
    private float mLastFps = 0.0f;
    /* access modifiers changed from: private */
    public int mLastHeightMeasureSpec = 0;
    public int mLastLayoutHeight;
    public int mLastLayoutWidth;
    public float mLastVelocity = 0.0f;
    /* access modifiers changed from: private */
    public int mLastWidthMeasureSpec = 0;
    private float mListenerPosition = 0.0f;
    private int mListenerState = 0;
    public boolean mMeasureDuringTransition = false;
    public C2109e mModel = new C2109e();
    private boolean mNeedsFireTransitionCompleted = false;
    public int mOldHeight;
    public int mOldWidth;
    private ArrayList<MotionHelper> mOnHideHelpers = null;
    private ArrayList<MotionHelper> mOnShowHelpers = null;
    public float mPostInterpolationPosition;
    private View mRegionView = null;
    public C2150q mScene;
    public float mScrollTargetDT;
    public float mScrollTargetDX;
    public float mScrollTargetDY;
    public long mScrollTargetTime;
    public int mStartWrapHeight;
    public int mStartWrapWidth;
    private C2112h mStateCache;
    private StopLogic mStopLogic = new StopLogic();
    private boolean mTemporalInterpolator = false;
    public ArrayList<Integer> mTransitionCompleted = new ArrayList<>();
    private float mTransitionDuration = 1.0f;
    public float mTransitionGoalPosition = 0.0f;
    private boolean mTransitionInstantly;
    public float mTransitionLastPosition = 0.0f;
    private long mTransitionLastTime;
    private C2113i mTransitionListener;
    private ArrayList<C2113i> mTransitionListeners = null;
    public float mTransitionPosition = 0.0f;
    public TransitionState mTransitionState = TransitionState.UNDEFINED;
    public boolean mUndergoingMotion = false;
    public int mWidthMeasureMode;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class C2105a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f4760b;

        public C2105a(View view) {
            this.f4760b = view;
        }

        public final void run() {
            this.f4760b.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public static /* synthetic */ class C2106b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4761a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4761a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4761a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4761a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4761a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C2106b.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public class C2107c extends MotionInterpolator {

        /* renamed from: a */
        public float f4762a = 0.0f;

        /* renamed from: b */
        public float f4763b = 0.0f;

        /* renamed from: c */
        public float f4764c;

        public C2107c() {
        }

        public final float getInterpolation(float f) {
            float f2 = this.f4762a;
            if (f2 > 0.0f) {
                float f3 = this.f4764c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.mLastVelocity = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f4763b;
            }
            float f4 = this.f4764c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.mLastVelocity = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f4763b;
        }

        public final float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C2108d {

        /* renamed from: a */
        public float[] f4766a;

        /* renamed from: b */
        public int[] f4767b;

        /* renamed from: c */
        public float[] f4768c;

        /* renamed from: d */
        public Path f4769d;

        /* renamed from: e */
        public Paint f4770e;

        /* renamed from: f */
        public Paint f4771f;

        /* renamed from: g */
        public Paint f4772g;

        /* renamed from: h */
        public Paint f4773h;

        /* renamed from: i */
        public Paint f4774i;

        /* renamed from: j */
        public float[] f4775j;

        /* renamed from: k */
        public int f4776k;

        /* renamed from: l */
        public Rect f4777l = new Rect();

        /* renamed from: m */
        public int f4778m = 1;

        public C2108d() {
            Paint paint = new Paint();
            this.f4770e = paint;
            paint.setAntiAlias(true);
            this.f4770e.setColor(-21965);
            this.f4770e.setStrokeWidth(2.0f);
            this.f4770e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f4771f = paint2;
            paint2.setAntiAlias(true);
            this.f4771f.setColor(-2067046);
            this.f4771f.setStrokeWidth(2.0f);
            this.f4771f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f4772g = paint3;
            paint3.setAntiAlias(true);
            this.f4772g.setColor(-13391360);
            this.f4772g.setStrokeWidth(2.0f);
            this.f4772g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f4773h = paint4;
            paint4.setAntiAlias(true);
            this.f4773h.setColor(-13391360);
            this.f4773h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f4775j = new float[8];
            Paint paint5 = new Paint();
            this.f4774i = paint5;
            paint5.setAntiAlias(true);
            this.f4772g.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f4768c = new float[100];
            this.f4767b = new int[50];
        }

        /* renamed from: a */
        public final void mo8125a(Canvas canvas, int i, int i2, C2148o oVar) {
            int i3;
            int i4;
            int i5;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i6 = i;
            C2148o oVar2 = oVar;
            if (i6 == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i7 = 0; i7 < this.f4776k; i7++) {
                    int i8 = this.f4767b[i7];
                    if (i8 == 1) {
                        z = true;
                    }
                    if (i8 == 2) {
                        z2 = true;
                    }
                }
                if (z) {
                    float[] fArr = this.f4766a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f4772g);
                }
                if (z2) {
                    mo8126b(canvas);
                }
            }
            if (i6 == 2) {
                float[] fArr2 = this.f4766a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f4772g);
            }
            if (i6 == 3) {
                mo8126b(canvas);
            }
            canvas2.drawLines(this.f4766a, this.f4770e);
            View view = oVar2.f4921a;
            if (view != null) {
                i4 = view.getWidth();
                i3 = oVar2.f4921a.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i9 = 1;
            while (i9 < i2 - 1) {
                if (i6 == 4 && this.f4767b[i9 - 1] == 0) {
                    i5 = i9;
                } else {
                    float[] fArr3 = this.f4768c;
                    int i10 = i9 * 2;
                    float f3 = fArr3[i10];
                    float f4 = fArr3[i10 + 1];
                    this.f4769d.reset();
                    this.f4769d.moveTo(f3, f4 + 10.0f);
                    this.f4769d.lineTo(f3 + 10.0f, f4);
                    this.f4769d.lineTo(f3, f4 - 10.0f);
                    this.f4769d.lineTo(f3 - 10.0f, f4);
                    this.f4769d.close();
                    int i11 = i9 - 1;
                    C2149p pVar = oVar2.f4939s.get(i11);
                    if (i6 == 4) {
                        int i12 = this.f4767b[i11];
                        if (i12 == 1) {
                            mo8128d(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (i12 == 2) {
                            mo8127c(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (i12 == 3) {
                            f = f4;
                            f2 = f3;
                            i5 = i9;
                            mo8129e(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f4769d, this.f4774i);
                        }
                        f = f4;
                        f2 = f3;
                        i5 = i9;
                        canvas2.drawPath(this.f4769d, this.f4774i);
                    } else {
                        f = f4;
                        f2 = f3;
                        i5 = i9;
                    }
                    if (i6 == 2) {
                        mo8128d(canvas2, f2 - 0.0f, f - 0.0f);
                    }
                    if (i6 == 3) {
                        mo8127c(canvas2, f2 - 0.0f, f - 0.0f);
                    }
                    if (i6 == 6) {
                        mo8129e(canvas, f2 - 0.0f, f - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f4769d, this.f4774i);
                }
                i9 = i5 + 1;
            }
            float[] fArr4 = this.f4766a;
            if (fArr4.length > 1) {
                canvas2.drawCircle(fArr4[0], fArr4[1], 8.0f, this.f4771f);
                float[] fArr5 = this.f4766a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, this.f4771f);
            }
        }

        /* renamed from: b */
        public final void mo8126b(Canvas canvas) {
            float[] fArr = this.f4766a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f4772g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f4772g);
        }

        /* renamed from: c */
        public final void mo8127c(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f4766a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder h = C0072d.m201h("");
            h.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb = h.toString();
            mo8130f(this.f4773h, sb);
            canvas2.drawText(sb, ((min2 / 2.0f) - ((float) (this.f4777l.width() / 2))) + min, f2 - 20.0f, this.f4773h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f4772g);
            StringBuilder h2 = C0072d.m201h("");
            h2.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb2 = h2.toString();
            mo8130f(this.f4773h, sb2);
            canvas2.drawText(sb2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f4777l.height() / 2))), this.f4773h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f4772g);
        }

        /* renamed from: d */
        public final void mo8128d(Canvas canvas, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            float[] fArr = this.f4766a;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f5 - f7), (double) (f6 - f8));
            float f9 = f7 - f5;
            float f10 = f8 - f6;
            float f11 = (((f4 - f6) * f10) + ((f3 - f5) * f9)) / (hypot * hypot);
            float f12 = f5 + (f9 * f11);
            float f13 = f6 + (f11 * f10);
            Path path = new Path();
            path.moveTo(f, f4);
            path.lineTo(f12, f13);
            float hypot2 = (float) Math.hypot((double) (f12 - f3), (double) (f13 - f4));
            StringBuilder h = C0072d.m201h("");
            h.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb = h.toString();
            mo8130f(this.f4773h, sb);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - ((float) (this.f4777l.width() / 2)), -20.0f, this.f4773h);
            canvas.drawLine(f3, f4, f12, f13, this.f4772g);
        }

        /* renamed from: e */
        public final void mo8129e(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder h = C0072d.m201h("");
            h.append(((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            String sb = h.toString();
            mo8130f(this.f4773h, sb);
            canvas2.drawText(sb, ((f / 2.0f) - ((float) (this.f4777l.width() / 2))) + 0.0f, f2 - 20.0f, this.f4773h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f4772g);
            StringBuilder h2 = C0072d.m201h("");
            h2.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            String sb2 = h2.toString();
            mo8130f(this.f4773h, sb2);
            canvas2.drawText(sb2, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f4777l.height() / 2))), this.f4773h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f4772g);
        }

        /* renamed from: f */
        public final void mo8130f(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f4777l);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public class C2109e {

        /* renamed from: a */
        public C2220d f4780a = new C2220d();

        /* renamed from: b */
        public C2220d f4781b = new C2220d();

        /* renamed from: c */
        public C2236a f4782c = null;

        /* renamed from: d */
        public C2236a f4783d = null;

        /* renamed from: e */
        public int f4784e;

        /* renamed from: f */
        public int f4785f;

        public C2109e() {
        }

        /* renamed from: b */
        public static void m4558b(C2220d dVar, C2220d dVar2) {
            ArrayList<ConstraintWidget> arrayList = dVar.f16944p0;
            HashMap hashMap = new HashMap();
            hashMap.put(dVar, dVar2);
            dVar2.f16944p0.clear();
            dVar2.mo8281j(dVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget aVar = next instanceof C2197a ? new C2197a() : next instanceof C2223f ? new C2223f() : next instanceof C2221e ? new C2221e() : next instanceof C7646a ? new C7647b() : new ConstraintWidget();
                dVar2.f16944p0.add(aVar);
                ConstraintWidget constraintWidget = aVar.f5126Q;
                if (constraintWidget != null) {
                    ((C7648c) constraintWidget).f16944p0.remove(aVar);
                    aVar.mo8263C();
                }
                aVar.f5126Q = dVar2;
                hashMap.put(next, aVar);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).mo8281j(next2, hashMap);
            }
        }

        /* renamed from: c */
        public static ConstraintWidget m4559c(C2220d dVar, View view) {
            if (dVar.f5141c0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.f16944p0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.f5141c0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo8131a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.mFrameArrayList.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.mFrameArrayList.put(childAt, new C2148o(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C2148o oVar = MotionLayout.this.mFrameArrayList.get(childAt2);
                if (oVar != null) {
                    if (this.f4782c != null) {
                        ConstraintWidget c = m4559c(this.f4780a, childAt2);
                        if (c != null) {
                            C2236a aVar = this.f4782c;
                            C2149p pVar = oVar.f4924d;
                            pVar.f4950d = 0.0f;
                            pVar.f4951e = 0.0f;
                            oVar.mo8155d(pVar);
                            C2149p pVar2 = oVar.f4924d;
                            pVar2.f4952f = (float) c.mo8290s();
                            pVar2.f4953g = (float) c.mo8291t();
                            pVar2.f4954h = (float) c.mo8289r();
                            pVar2.f4955i = (float) c.mo8286o();
                            C2236a.C2237a j = aVar.mo8490j(oVar.f4922b);
                            oVar.f4924d.mo8158a(j);
                            oVar.f4930j = j.f5378c.f5451f;
                            oVar.f4926f.mo8151e(c, aVar, oVar.f4922b);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, C2114a.m4565a() + "no widget for  " + C2114a.m4567c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f4783d != null) {
                        ConstraintWidget c2 = m4559c(this.f4781b, childAt2);
                        if (c2 != null) {
                            C2236a aVar2 = this.f4783d;
                            C2149p pVar3 = oVar.f4925e;
                            pVar3.f4950d = 1.0f;
                            pVar3.f4951e = 1.0f;
                            oVar.mo8155d(pVar3);
                            C2149p pVar4 = oVar.f4925e;
                            pVar4.f4952f = (float) c2.mo8290s();
                            pVar4.f4953g = (float) c2.mo8291t();
                            pVar4.f4954h = (float) c2.mo8289r();
                            pVar4.f4955i = (float) c2.mo8286o();
                            oVar.f4925e.mo8158a(aVar2.mo8490j(oVar.f4922b));
                            oVar.f4927g.mo8151e(c2, aVar2, oVar.f4922b);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, C2114a.m4565a() + "no widget for  " + C2114a.m4567c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        public final void mo8132d(C2236a aVar, C2236a aVar2) {
            this.f4782c = aVar;
            this.f4783d = aVar2;
            this.f4780a = new C2220d();
            this.f4781b = new C2220d();
            C2220d dVar = this.f4780a;
            C2200b.C2202b bVar = MotionLayout.this.mLayoutWidget.f5272s0;
            dVar.f5272s0 = bVar;
            dVar.f5271r0.f5226f = bVar;
            C2220d dVar2 = this.f4781b;
            C2200b.C2202b bVar2 = MotionLayout.this.mLayoutWidget.f5272s0;
            dVar2.f5272s0 = bVar2;
            dVar2.f5271r0.f5226f = bVar2;
            this.f4780a.f16944p0.clear();
            this.f4781b.f16944p0.clear();
            m4558b(MotionLayout.this.mLayoutWidget, this.f4780a);
            m4558b(MotionLayout.this.mLayoutWidget, this.f4781b);
            if (((double) MotionLayout.this.mTransitionLastPosition) > 0.5d) {
                if (aVar != null) {
                    mo8134f(this.f4780a, aVar);
                }
                mo8134f(this.f4781b, aVar2);
            } else {
                mo8134f(this.f4781b, aVar2);
                if (aVar != null) {
                    mo8134f(this.f4780a, aVar);
                }
            }
            this.f4780a.f5273t0 = MotionLayout.this.isRtl();
            C2220d dVar3 = this.f4780a;
            dVar3.f5270q0.mo8316c(dVar3);
            this.f4781b.f5273t0 = MotionLayout.this.isRtl();
            C2220d dVar4 = this.f4781b;
            dVar4.f5270q0.mo8316c(dVar4);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C2220d dVar5 = this.f4780a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar5.mo8270J(dimensionBehaviour);
                    this.f4781b.mo8270J(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    C2220d dVar6 = this.f4780a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar6.mo8271K(dimensionBehaviour2);
                    this.f4781b.mo8271K(dimensionBehaviour2);
                }
            }
        }

        /* renamed from: e */
        public final void mo8133e() {
            int access$900 = MotionLayout.this.mLastWidthMeasureSpec;
            int access$1000 = MotionLayout.this.mLastHeightMeasureSpec;
            int mode = View.MeasureSpec.getMode(access$900);
            int mode2 = View.MeasureSpec.getMode(access$1000);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.mCurrentState == motionLayout2.getStartState()) {
                MotionLayout.this.resolveSystem(this.f4781b, optimizationLevel, access$900, access$1000);
                if (this.f4782c != null) {
                    MotionLayout.this.resolveSystem(this.f4780a, optimizationLevel, access$900, access$1000);
                }
            } else {
                if (this.f4782c != null) {
                    MotionLayout.this.resolveSystem(this.f4780a, optimizationLevel, access$900, access$1000);
                }
                MotionLayout.this.resolveSystem(this.f4781b, optimizationLevel, access$900, access$1000);
            }
            boolean z = true;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.mWidthMeasureMode = mode;
                motionLayout3.mHeightMeasureMode = mode2;
                if (motionLayout3.mCurrentState == motionLayout3.getStartState()) {
                    MotionLayout.this.resolveSystem(this.f4781b, optimizationLevel, access$900, access$1000);
                    if (this.f4782c != null) {
                        MotionLayout.this.resolveSystem(this.f4780a, optimizationLevel, access$900, access$1000);
                    }
                } else {
                    if (this.f4782c != null) {
                        MotionLayout.this.resolveSystem(this.f4780a, optimizationLevel, access$900, access$1000);
                    }
                    MotionLayout.this.resolveSystem(this.f4781b, optimizationLevel, access$900, access$1000);
                }
                MotionLayout.this.mStartWrapWidth = this.f4780a.mo8289r();
                MotionLayout.this.mStartWrapHeight = this.f4780a.mo8286o();
                MotionLayout.this.mEndWrapWidth = this.f4781b.mo8289r();
                MotionLayout.this.mEndWrapHeight = this.f4781b.mo8286o();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.mMeasureDuringTransition = (motionLayout4.mStartWrapWidth == motionLayout4.mEndWrapWidth && motionLayout4.mStartWrapHeight == motionLayout4.mEndWrapHeight) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i = motionLayout5.mStartWrapWidth;
            int i2 = motionLayout5.mStartWrapHeight;
            int i3 = motionLayout5.mWidthMeasureMode;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                i = (int) ((motionLayout5.mPostInterpolationPosition * ((float) (motionLayout5.mEndWrapWidth - i))) + ((float) i));
            }
            int i4 = motionLayout5.mHeightMeasureMode;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                i2 = (int) ((motionLayout5.mPostInterpolationPosition * ((float) (motionLayout5.mEndWrapHeight - i2))) + ((float) i2));
            }
            int i5 = i2;
            C2220d dVar = this.f4780a;
            boolean z2 = dVar.f5263C0 || this.f4781b.f5263C0;
            if (!dVar.f5264D0 && !this.f4781b.f5264D0) {
                z = false;
            }
            motionLayout5.resolveMeasuredDimension(access$900, access$1000, i, i5, z2, z);
            MotionLayout.this.setupMotionViews();
        }

        /* renamed from: f */
        public final void mo8134f(C2220d dVar, C2236a aVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            Iterator<ConstraintWidget> it = dVar.f16944p0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.f5141c0).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.f16944p0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.f5141c0;
                int id = view.getId();
                if (aVar.f5375c.containsKey(Integer.valueOf(id))) {
                    aVar.f5375c.get(Integer.valueOf(id)).mo8495a(layoutParams);
                }
                next2.mo8272L(aVar.mo8490j(view.getId()).f5379d.f5413c);
                next2.mo8269I(aVar.mo8490j(view.getId()).f5379d.f5415d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    if (aVar.f5375c.containsKey(Integer.valueOf(id2))) {
                        C2236a.C2237a aVar2 = aVar.f5375c.get(Integer.valueOf(id2));
                        if (next2 instanceof C7647b) {
                            constraintHelper.loadParameters(aVar2, (C7647b) next2, layoutParams, sparseArray);
                        }
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (aVar.mo8490j(view.getId()).f5377b.f5455c == 1) {
                    next2.f5143d0 = view.getVisibility();
                } else {
                    next2.f5143d0 = aVar.mo8490j(view.getId()).f5377b.f5454b;
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.f16944p0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof C2226h) {
                    C7646a aVar3 = (C7646a) next3;
                    ((ConstraintHelper) next3.f5141c0).updatePreLayout(dVar, aVar3, sparseArray);
                    C2226h hVar = (C2226h) aVar3;
                    for (int i = 0; i < hVar.f16943q0; i++) {
                        ConstraintWidget constraintWidget = hVar.f16942p0[i];
                        if (constraintWidget != null) {
                            constraintWidget.f5111B = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public interface C2110f {
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public static class C2111g implements C2110f {

        /* renamed from: b */
        public static C2111g f4787b = new C2111g();

        /* renamed from: a */
        public VelocityTracker f4788a;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public class C2112h {

        /* renamed from: a */
        public float f4789a = Float.NaN;

        /* renamed from: b */
        public float f4790b = Float.NaN;

        /* renamed from: c */
        public int f4791c = -1;

        /* renamed from: d */
        public int f4792d = -1;

        public C2112h() {
        }

        /* renamed from: a */
        public final void mo8135a() {
            int i = this.f4791c;
            if (!(i == -1 && this.f4792d == -1)) {
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.f4792d);
                } else {
                    int i2 = this.f4792d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.f4790b)) {
                MotionLayout.this.setProgress(this.f4789a, this.f4790b);
                this.f4789a = Float.NaN;
                this.f4790b = Float.NaN;
                this.f4791c = -1;
                this.f4792d = -1;
            } else if (!Float.isNaN(this.f4789a)) {
                MotionLayout.this.setProgress(this.f4789a);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface C2113i {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public MotionLayout(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    private void checkStructure() {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int g = qVar.mo8167g();
        C2150q qVar2 = this.mScene;
        checkStructure(g, qVar2.mo8162b(qVar2.mo8167g()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C2150q.C2152b> it = this.mScene.f4966e.iterator();
        while (it.hasNext()) {
            C2150q.C2152b next = it.next();
            C2150q.C2152b bVar = this.mScene.f4964c;
            checkStructure(next);
            int i = next.f4985d;
            int i2 = next.f4984c;
            String b = C2114a.m4566b(getContext(), i);
            String b2 = C2114a.m4566b(getContext(), i2);
            if (sparseIntArray.get(i) == i2) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + b + "->" + b2);
            }
            if (sparseIntArray2.get(i2) == i) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + b + "->" + b2);
            }
            sparseIntArray.put(i, i2);
            sparseIntArray2.put(i2, i);
            if (this.mScene.mo8162b(i) == null) {
                Log.e(TAG, " no such constraintSetStart " + b);
            }
            if (this.mScene.mo8162b(i2) == null) {
                Log.e(TAG, " no such constraintSetEnd " + b);
            }
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2148o oVar = this.mFrameArrayList.get(childAt);
            if (oVar != null) {
                C2149p pVar = oVar.f4924d;
                float f = 0.0f;
                pVar.f4950d = 0.0f;
                pVar.f4951e = 0.0f;
                float x = childAt.getX();
                float y = childAt.getY();
                pVar.f4952f = x;
                pVar.f4953g = y;
                pVar.f4954h = (float) childAt.getWidth();
                pVar.f4955i = (float) childAt.getHeight();
                C2147n nVar = oVar.f4926f;
                nVar.getClass();
                childAt.getX();
                childAt.getY();
                childAt.getWidth();
                childAt.getHeight();
                nVar.f4906d = childAt.getVisibility();
                if (childAt.getVisibility() == 0) {
                    f = childAt.getAlpha();
                }
                nVar.f4904b = f;
                nVar.f4907e = childAt.getElevation();
                nVar.f4908f = childAt.getRotation();
                nVar.f4909g = childAt.getRotationX();
                nVar.f4910h = childAt.getRotationY();
                nVar.f4911i = childAt.getScaleX();
                nVar.f4912j = childAt.getScaleY();
                nVar.f4913k = childAt.getPivotX();
                nVar.f4914l = childAt.getPivotY();
                nVar.f4915m = childAt.getTranslationX();
                nVar.f4916n = childAt.getTranslationY();
                nVar.f4917o = childAt.getTranslationZ();
            }
        }
    }

    private void debugPos() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            C2114a.m4565a();
            C2114a.m4567c(this);
            C2114a.m4566b(getContext(), this.mCurrentState);
            C2114a.m4567c(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f = this.mTransitionLastPosition + (!(interpolator instanceof StopLogic) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f = this.mTransitionGoalPosition;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.mTransitionGoalPosition) && (signum > 0.0f || f > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            f = this.mTemporalInterpolator ? interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f) : interpolator.getInterpolation(f);
        }
        if ((i > 0 && f >= this.mTransitionGoalPosition) || (signum <= 0.0f && f <= this.mTransitionGoalPosition)) {
            f = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C2148o oVar = this.mFrameArrayList.get(childAt);
            if (oVar != null) {
                oVar.mo8154c(f, nanoTime2, childAt, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        ArrayList<C2113i> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                C2113i iVar = this.mTransitionListener;
                if (iVar != null) {
                    iVar.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                ArrayList<C2113i> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<C2113i> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f = this.mTransitionPosition;
            this.mListenerPosition = f;
            C2113i iVar2 = this.mTransitionListener;
            if (iVar2 != null) {
                iVar2.onTransitionChange(this, this.mBeginState, this.mEndState, f);
            }
            ArrayList<C2113i> arrayList3 = this.mTransitionListeners;
            if (arrayList3 != null) {
                Iterator<C2113i> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        C2113i iVar = this.mTransitionListener;
        if (iVar != null) {
            iVar.onTransitionStarted(this, i, i2);
        }
        ArrayList<C2113i> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<C2113i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i, i2);
            }
        }
    }

    private boolean handlesTouchEvent(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (handlesTouchEvent(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.mBoundsCheck.set(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, f + ((float) view.getRight()), f2 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            return this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent);
        }
        if (view.onTouchEvent(motionEvent)) {
            return true;
        }
    }

    private void init(AttributeSet attributeSet) {
        C2150q qVar;
        IS_IN_EDIT_MODE = isInEditMode();
        int i = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43301C);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = 2;
                if (index == 2) {
                    this.mScene = new C2150q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.mDebugPath == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            i3 = 0;
                        }
                        this.mDebugPath = i3;
                    }
                } else if (index == 3) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState == -1 && (qVar = this.mScene) != null) {
            this.mCurrentState = qVar.mo8167g();
            this.mBeginState = this.mScene.mo8167g();
            C2150q.C2152b bVar = this.mScene.f4964c;
            if (bVar != null) {
                i = bVar.f4984c;
            }
            this.mEndState = i;
        }
    }

    private void processTransitionCompleted() {
        ArrayList<C2113i> arrayList;
        if (this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C2113i iVar = this.mTransitionListener;
                if (iVar != null) {
                    iVar.onTransitionCompleted(this, next.intValue());
                }
                ArrayList<C2113i> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<C2113i> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    /* access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.mo8131a();
        boolean z = true;
        this.mInTransition = true;
        int width = getWidth();
        int height = getHeight();
        C2150q.C2152b bVar = this.mScene.f4964c;
        int i = bVar != null ? bVar.f4997p : -1;
        int i2 = 0;
        if (i != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C2148o oVar = this.mFrameArrayList.get(getChildAt(i3));
                if (oVar != null) {
                    oVar.f4946z = i;
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            C2148o oVar2 = this.mFrameArrayList.get(getChildAt(i4));
            if (oVar2 != null) {
                this.mScene.mo8165e(oVar2);
                oVar2.mo8156e(width, height, getNanoTime());
            }
        }
        C2150q.C2152b bVar2 = this.mScene.f4964c;
        float f = bVar2 != null ? bVar2.f4990i : 0.0f;
        if (f != 0.0f) {
            boolean z2 = ((double) f) < ShadowDrawableWrapper.COS_45;
            float abs = Math.abs(f);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    z = false;
                    break;
                }
                C2148o oVar3 = this.mFrameArrayList.get(getChildAt(i5));
                if (!Float.isNaN(oVar3.f4930j)) {
                    break;
                }
                C2149p pVar = oVar3.f4925e;
                float f6 = pVar.f4952f;
                float f7 = pVar.f4953g;
                float f8 = z2 ? f7 - f6 : f7 + f6;
                f5 = Math.min(f5, f8);
                f4 = Math.max(f4, f8);
                i5++;
            }
            if (z) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    C2148o oVar4 = this.mFrameArrayList.get(getChildAt(i6));
                    if (!Float.isNaN(oVar4.f4930j)) {
                        f3 = Math.min(f3, oVar4.f4930j);
                        f2 = Math.max(f2, oVar4.f4930j);
                    }
                }
                while (i2 < childCount) {
                    C2148o oVar5 = this.mFrameArrayList.get(getChildAt(i2));
                    if (!Float.isNaN(oVar5.f4930j)) {
                        oVar5.f4932l = 1.0f / (1.0f - abs);
                        if (z2) {
                            oVar5.f4931k = abs - (((f2 - oVar5.f4930j) / (f2 - f3)) * abs);
                        } else {
                            oVar5.f4931k = abs - (((oVar5.f4930j - f3) * abs) / (f2 - f3));
                        }
                    }
                    i2++;
                }
                return;
            }
            while (i2 < childCount) {
                C2148o oVar6 = this.mFrameArrayList.get(getChildAt(i2));
                C2149p pVar2 = oVar6.f4925e;
                float f9 = pVar2.f4952f;
                float f10 = pVar2.f4953g;
                float f11 = z2 ? f10 - f9 : f10 + f9;
                oVar6.f4932l = 1.0f / (1.0f - abs);
                oVar6.f4931k = abs - (((f11 - f5) * abs) / (f4 - f5));
                i2++;
            }
        }
    }

    private static boolean willJump(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return ((f * f4) - (((f3 * f4) * f4) / 2.0f)) + f2 > 1.0f;
        }
        float f5 = (-f) / f3;
        return ((((f3 * f5) * f5) / 2.0f) + (f * f5)) + f2 < 0.0f;
    }

    public void addTransitionListener(C2113i iVar) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new ArrayList<>();
        }
        this.mTransitionListeners.add(iVar);
    }

    public void animateTo(float f) {
        C2150q qVar = this.mScene;
        if (qVar != null) {
            float f2 = this.mTransitionLastPosition;
            float f3 = this.mTransitionPosition;
            if (f2 != f3 && this.mTransitionInstantly) {
                this.mTransitionLastPosition = f3;
            }
            float f4 = this.mTransitionLastPosition;
            if (f4 != f) {
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = f;
                C2150q.C2152b bVar = qVar.f4964c;
                this.mTransitionDuration = ((float) (bVar != null ? bVar.f4989h : qVar.f4972k)) / 1000.0f;
                setProgress(f);
                this.mInterpolator = this.mScene.mo8164d();
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f4;
                this.mTransitionLastPosition = f4;
                invalidate();
            }
        }
    }

    public void disableAutoTransition(boolean z) {
        C2150q qVar = this.mScene;
        if (qVar != null) {
            qVar.f4965d = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0343  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = 0
            r0.evaluate(r2)
            super.dispatchDraw(r29)
            androidx.constraintlayout.motion.widget.q r3 = r0.mScene
            if (r3 != 0) goto L_0x0010
            return
        L_0x0010:
            int r3 = r0.mDebugPath
            r4 = 1
            r3 = r3 & r4
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 1092616192(0x41200000, float:10.0)
            if (r3 != r4) goto L_0x00d3
            boolean r3 = r28.isInEditMode()
            if (r3 != 0) goto L_0x00d3
            int r3 = r0.mFrames
            int r3 = r3 + r4
            r0.mFrames = r3
            long r7 = r28.getNanoTime()
            long r9 = r0.mLastDrawTime
            r11 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0050
            long r9 = r7 - r9
            r11 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0052
            int r3 = r0.mFrames
            float r3 = (float) r3
            float r9 = (float) r9
            r10 = 814313567(0x3089705f, float:1.0E-9)
            float r9 = r9 * r10
            float r3 = r3 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r9
            r0.mLastFps = r3
            r0.mFrames = r2
            r0.mLastDrawTime = r7
            goto L_0x0052
        L_0x0050:
            r0.mLastDrawTime = r7
        L_0x0052:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r7 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r7)
            float r7 = r28.getProgress()
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            float r7 = (float) r7
            float r7 = r7 / r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            float r9 = r0.mLastFps
            r8.append(r9)
            java.lang.String r9 = " fps "
            r8.append(r9)
            int r9 = r0.mBeginState
            java.lang.String r9 = androidx.constraintlayout.motion.widget.C2114a.m4568d(r0, r9)
            r8.append(r9)
            java.lang.String r9 = " -> "
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r8 = android.support.p013v4.media.C0072d.m201h(r8)
            int r9 = r0.mEndState
            java.lang.String r9 = androidx.constraintlayout.motion.widget.C2114a.m4568d(r0, r9)
            r8.append(r9)
            java.lang.String r9 = " (progress: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " ) state="
            r8.append(r7)
            int r7 = r0.mCurrentState
            r9 = -1
            if (r7 != r9) goto L_0x00a9
            java.lang.String r7 = "undefined"
            goto L_0x00ad
        L_0x00a9:
            java.lang.String r7 = androidx.constraintlayout.motion.widget.C2114a.m4568d(r0, r7)
        L_0x00ad:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r8)
            int r8 = r28.getHeight()
            int r8 = r8 + -29
            float r8 = (float) r8
            r1.drawText(r7, r5, r8, r3)
            r8 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r8)
            int r8 = r28.getHeight()
            int r8 = r8 + -30
            float r8 = (float) r8
            r1.drawText(r7, r6, r8, r3)
        L_0x00d3:
            int r3 = r0.mDebugPath
            if (r3 <= r4) goto L_0x048b
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.mDevModeDraw
            if (r3 != 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = new androidx.constraintlayout.motion.widget.MotionLayout$d
            r3.<init>()
            r0.mDevModeDraw = r3
        L_0x00e2:
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.mDevModeDraw
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r7 = r0.mFrameArrayList
            androidx.constraintlayout.motion.widget.q r8 = r0.mScene
            androidx.constraintlayout.motion.widget.q$b r9 = r8.f4964c
            if (r9 == 0) goto L_0x00ef
            int r8 = r9.f4989h
            goto L_0x00f1
        L_0x00ef:
            int r8 = r8.f4972k
        L_0x00f1:
            int r9 = r0.mDebugPath
            r3.getClass()
            if (r7 == 0) goto L_0x048b
            int r10 = r7.size()
            if (r10 != 0) goto L_0x0100
            goto L_0x048b
        L_0x0100:
            r29.save()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
            boolean r10 = r10.isInEditMode()
            r11 = 2
            if (r10 != 0) goto L_0x015a
            r10 = r9 & 1
            if (r10 != r11) goto L_0x015a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            android.content.Context r11 = r11.getContext()
            android.content.res.Resources r11 = r11.getResources()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r12 = r12.mEndState
            java.lang.String r11 = r11.getResourceName(r12)
            r10.append(r11)
            java.lang.String r11 = ":"
            r10.append(r11)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            float r11 = r11.getProgress()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r11 = r11.getHeight()
            int r11 = r11 + -30
            float r11 = (float) r11
            android.graphics.Paint r12 = r3.f4773h
            r1.drawText(r10, r6, r11, r12)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r6 = r6.getHeight()
            int r6 = r6 + -29
            float r6 = (float) r6
            android.graphics.Paint r11 = r3.f4770e
            r1.drawText(r10, r5, r6, r11)
        L_0x015a:
            java.util.Collection r5 = r7.values()
            java.util.Iterator r5 = r5.iterator()
            r6 = r1
            r7 = r6
        L_0x0164:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0487
            java.lang.Object r10 = r5.next()
            androidx.constraintlayout.motion.widget.o r10 = (androidx.constraintlayout.motion.widget.C2148o) r10
            androidx.constraintlayout.motion.widget.p r11 = r10.f4924d
            int r11 = r11.f4949c
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r12 = r10.f4939s
            java.util.Iterator r12 = r12.iterator()
        L_0x017a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x018d
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.p r13 = (androidx.constraintlayout.motion.widget.C2149p) r13
            int r13 = r13.f4949c
            int r11 = java.lang.Math.max(r11, r13)
            goto L_0x017a
        L_0x018d:
            androidx.constraintlayout.motion.widget.p r12 = r10.f4925e
            int r12 = r12.f4949c
            int r11 = java.lang.Math.max(r11, r12)
            if (r9 <= 0) goto L_0x019a
            if (r11 != 0) goto L_0x019a
            r11 = r4
        L_0x019a:
            if (r11 != 0) goto L_0x019d
            goto L_0x0164
        L_0x019d:
            float[] r4 = r3.f4768c
            int[] r12 = r3.f4767b
            if (r4 == 0) goto L_0x01f5
            n0.b[] r13 = r10.f4928h
            r13 = r13[r2]
            double[] r13 = r13.mo19652g()
            if (r12 == 0) goto L_0x01cd
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r14 = r10.f4939s
            java.util.Iterator r14 = r14.iterator()
            r15 = r2
        L_0x01b4:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x01cd
            java.lang.Object r16 = r14.next()
            r0 = r16
            androidx.constraintlayout.motion.widget.p r0 = (androidx.constraintlayout.motion.widget.C2149p) r0
            int r16 = r15 + 1
            int r0 = r0.f4959m
            r12[r15] = r0
            r0 = r28
            r15 = r16
            goto L_0x01b4
        L_0x01cd:
            r0 = r2
            r12 = r0
        L_0x01cf:
            int r14 = r13.length
            if (r2 >= r14) goto L_0x01f0
            n0.b[] r14 = r10.f4928h
            r12 = r14[r12]
            r14 = r13[r2]
            r16 = r5
            double[] r5 = r10.f4934n
            r12.mo19648c(r14, r5)
            androidx.constraintlayout.motion.widget.p r5 = r10.f4924d
            int[] r12 = r10.f4933m
            double[] r14 = r10.f4934n
            r5.mo8160e(r12, r14, r4, r0)
            int r0 = r0 + 2
            int r2 = r2 + 1
            r12 = 0
            r5 = r16
            goto L_0x01cf
        L_0x01f0:
            r16 = r5
            int r0 = r0 / 2
            goto L_0x01f8
        L_0x01f5:
            r16 = r5
            r0 = 0
        L_0x01f8:
            r3.f4776k = r0
            r0 = 1
            if (r11 < r0) goto L_0x0474
            int r0 = r8 / 16
            float[] r2 = r3.f4766a
            if (r2 == 0) goto L_0x0208
            int r2 = r2.length
            int r4 = r0 * 2
            if (r2 == r4) goto L_0x0215
        L_0x0208:
            int r2 = r0 * 2
            float[] r2 = new float[r2]
            r3.f4766a = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r3.f4769d = r2
        L_0x0215:
            int r2 = r3.f4778m
            float r2 = (float) r2
            r6.translate(r2, r2)
            android.graphics.Paint r2 = r3.f4770e
            r4 = 1996488704(0x77000000, float:2.5961484E33)
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f4774i
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f4771f
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f4772g
            r2.setColor(r4)
            float[] r2 = r3.f4766a
            int r4 = r0 + -1
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r4 = r10.f4943w
            java.lang.String r6 = "translationX"
            if (r4 != 0) goto L_0x0241
            r4 = 0
            goto L_0x0247
        L_0x0241:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.motion.widget.r r4 = (androidx.constraintlayout.motion.widget.C2154r) r4
        L_0x0247:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r12 = r10.f4943w
            java.lang.String r13 = "translationY"
            if (r12 != 0) goto L_0x024f
            r12 = 0
            goto L_0x0255
        L_0x024f:
            java.lang.Object r12 = r12.get(r13)
            androidx.constraintlayout.motion.widget.r r12 = (androidx.constraintlayout.motion.widget.C2154r) r12
        L_0x0255:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.h> r14 = r10.f4944x
            if (r14 != 0) goto L_0x025b
            r6 = 0
            goto L_0x0261
        L_0x025b:
            java.lang.Object r6 = r14.get(r6)
            androidx.constraintlayout.motion.widget.h r6 = (androidx.constraintlayout.motion.widget.C2123h) r6
        L_0x0261:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.h> r14 = r10.f4944x
            if (r14 != 0) goto L_0x0267
            r13 = 0
            goto L_0x026d
        L_0x0267:
            java.lang.Object r13 = r14.get(r13)
            androidx.constraintlayout.motion.widget.h r13 = (androidx.constraintlayout.motion.widget.C2123h) r13
        L_0x026d:
            r14 = 0
        L_0x026e:
            r17 = 0
            if (r14 >= r0) goto L_0x035e
            float r15 = (float) r14
            float r15 = r15 * r5
            r19 = r0
            float r0 = r10.f4932l
            r20 = 1065353216(0x3f800000, float:1.0)
            int r21 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r21 == 0) goto L_0x029a
            r21 = r5
            float r5 = r10.f4931k
            int r22 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r22 >= 0) goto L_0x0288
            r15 = r17
        L_0x0288:
            int r22 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r22 <= 0) goto L_0x029c
            r22 = r8
            r23 = r9
            double r8 = (double) r15
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 >= 0) goto L_0x02a0
            float r15 = r15 - r5
            float r15 = r15 * r0
            goto L_0x02a0
        L_0x029a:
            r21 = r5
        L_0x029c:
            r22 = r8
            r23 = r9
        L_0x02a0:
            double r8 = (double) r15
            androidx.constraintlayout.motion.widget.p r0 = r10.f4924d
            n0.c r0 = r0.f4948b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r5 = r10.f4939s
            java.util.Iterator r5 = r5.iterator()
            r18 = 2143289344(0x7fc00000, float:NaN)
        L_0x02ad:
            boolean r24 = r5.hasNext()
            if (r24 == 0) goto L_0x02dc
            java.lang.Object r24 = r5.next()
            r25 = r5
            r5 = r24
            androidx.constraintlayout.motion.widget.p r5 = (androidx.constraintlayout.motion.widget.C2149p) r5
            r26 = r8
            n0.c r8 = r5.f4948b
            if (r8 == 0) goto L_0x02d7
            float r9 = r5.f4950d
            int r24 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r24 >= 0) goto L_0x02cd
            r0 = r8
            r17 = r9
            goto L_0x02d7
        L_0x02cd:
            boolean r8 = java.lang.Float.isNaN(r18)
            if (r8 == 0) goto L_0x02d7
            float r5 = r5.f4950d
            r18 = r5
        L_0x02d7:
            r5 = r25
            r8 = r26
            goto L_0x02ad
        L_0x02dc:
            r26 = r8
            if (r0 == 0) goto L_0x02fb
            boolean r5 = java.lang.Float.isNaN(r18)
            if (r5 == 0) goto L_0x02e7
            goto L_0x02e9
        L_0x02e7:
            r20 = r18
        L_0x02e9:
            float r5 = r15 - r17
            float r20 = r20 - r17
            float r5 = r5 / r20
            double r8 = (double) r5
            double r8 = r0.mo19654a(r8)
            float r0 = (float) r8
            float r0 = r0 * r20
            float r0 = r0 + r17
            double r8 = (double) r0
            goto L_0x02fd
        L_0x02fb:
            r8 = r26
        L_0x02fd:
            n0.b[] r0 = r10.f4928h
            r5 = 0
            r0 = r0[r5]
            double[] r5 = r10.f4934n
            r0.mo19648c(r8, r5)
            n0.a r0 = r10.f4929i
            if (r0 == 0) goto L_0x0313
            double[] r5 = r10.f4934n
            int r1 = r5.length
            if (r1 <= 0) goto L_0x0313
            r0.mo19648c(r8, r5)
        L_0x0313:
            androidx.constraintlayout.motion.widget.p r0 = r10.f4924d
            int[] r1 = r10.f4933m
            double[] r5 = r10.f4934n
            int r8 = r14 * 2
            r0.mo8160e(r1, r5, r2, r8)
            if (r6 == 0) goto L_0x032a
            r0 = r2[r8]
            float r1 = r6.mo8142a(r15)
            float r1 = r1 + r0
            r2[r8] = r1
            goto L_0x0335
        L_0x032a:
            if (r4 == 0) goto L_0x0335
            r0 = r2[r8]
            float r1 = r4.mo8179a(r15)
            float r1 = r1 + r0
            r2[r8] = r1
        L_0x0335:
            if (r13 == 0) goto L_0x0343
            int r8 = r8 + 1
            r0 = r2[r8]
            float r1 = r13.mo8142a(r15)
            float r1 = r1 + r0
            r2[r8] = r1
            goto L_0x0350
        L_0x0343:
            if (r12 == 0) goto L_0x0350
            int r8 = r8 + 1
            r0 = r2[r8]
            float r1 = r12.mo8179a(r15)
            float r1 = r1 + r0
            r2[r8] = r1
        L_0x0350:
            int r14 = r14 + 1
            r1 = r29
            r0 = r19
            r5 = r21
            r8 = r22
            r9 = r23
            goto L_0x026e
        L_0x035e:
            r22 = r8
            r23 = r9
            int r0 = r3.f4776k
            r3.mo8125a(r7, r11, r0, r10)
            android.graphics.Paint r0 = r3.f4770e
            r1 = -21965(0xffffffffffffaa33, float:NaN)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.f4771f
            r1 = -2067046(0xffffffffffe0759a, float:NaN)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.f4774i
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.f4772g
            r1 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r0.setColor(r1)
            int r0 = r3.f4778m
            int r0 = -r0
            float r0 = (float) r0
            r7.translate(r0, r0)
            int r0 = r3.f4776k
            r3.mo8125a(r7, r11, r0, r10)
            r0 = 5
            if (r11 != r0) goto L_0x046c
            android.graphics.Path r0 = r3.f4769d
            r0.reset()
            r0 = 0
        L_0x0398:
            r1 = 50
            if (r0 > r1) goto L_0x0440
            float r2 = (float) r0
            float r1 = (float) r1
            float r2 = r2 / r1
            float[] r1 = r3.f4775j
            r4 = 0
            float r2 = r10.mo8152a(r4, r2)
            n0.b[] r4 = r10.f4928h
            r5 = 0
            r4 = r4[r5]
            double r5 = (double) r2
            double[] r2 = r10.f4934n
            r4.mo19648c(r5, r2)
            androidx.constraintlayout.motion.widget.p r2 = r10.f4924d
            int[] r4 = r10.f4933m
            double[] r5 = r10.f4934n
            float r6 = r2.f4952f
            float r7 = r2.f4953g
            float r8 = r2.f4954h
            float r2 = r2.f4955i
            r9 = 0
        L_0x03c0:
            int r11 = r4.length
            r12 = 3
            r13 = 4
            if (r9 >= r11) goto L_0x03df
            r14 = r5[r9]
            float r11 = (float) r14
            r14 = r4[r9]
            r15 = 1
            if (r14 == r15) goto L_0x03db
            r15 = 2
            if (r14 == r15) goto L_0x03d9
            if (r14 == r12) goto L_0x03d7
            if (r14 == r13) goto L_0x03d5
            goto L_0x03dc
        L_0x03d5:
            r2 = r11
            goto L_0x03dc
        L_0x03d7:
            r8 = r11
            goto L_0x03dc
        L_0x03d9:
            r7 = r11
            goto L_0x03dc
        L_0x03db:
            r6 = r11
        L_0x03dc:
            int r9 = r9 + 1
            goto L_0x03c0
        L_0x03df:
            float r8 = r8 + r6
            float r2 = r2 + r7
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r4)
            java.lang.Float.isNaN(r4)
            float r6 = r6 + r17
            float r7 = r7 + r17
            float r8 = r8 + r17
            float r2 = r2 + r17
            r5 = 0
            r1[r5] = r6
            r5 = 1
            r1[r5] = r7
            r5 = 2
            r1[r5] = r8
            r1[r12] = r7
            r1[r13] = r8
            r5 = 5
            r1[r5] = r2
            r5 = 6
            r1[r5] = r6
            r6 = 7
            r1[r6] = r2
            android.graphics.Path r1 = r3.f4769d
            float[] r2 = r3.f4775j
            r7 = 0
            r7 = r2[r7]
            r8 = 1
            r2 = r2[r8]
            r1.moveTo(r7, r2)
            android.graphics.Path r1 = r3.f4769d
            float[] r2 = r3.f4775j
            r7 = 2
            r7 = r2[r7]
            r2 = r2[r12]
            r1.lineTo(r7, r2)
            android.graphics.Path r1 = r3.f4769d
            float[] r2 = r3.f4775j
            r7 = r2[r13]
            r8 = 5
            r2 = r2[r8]
            r1.lineTo(r7, r2)
            android.graphics.Path r1 = r3.f4769d
            float[] r2 = r3.f4775j
            r5 = r2[r5]
            r2 = r2[r6]
            r1.lineTo(r5, r2)
            android.graphics.Path r1 = r3.f4769d
            r1.close()
            int r0 = r0 + 1
            goto L_0x0398
        L_0x0440:
            r0 = 0
            r1 = 1
            android.graphics.Paint r2 = r3.f4770e
            r4 = 1140850688(0x44000000, float:512.0)
            r2.setColor(r4)
            r2 = 1073741824(0x40000000, float:2.0)
            r4 = r29
            r4.translate(r2, r2)
            android.graphics.Path r2 = r3.f4769d
            android.graphics.Paint r5 = r3.f4770e
            r4.drawPath(r2, r5)
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.translate(r2, r2)
            android.graphics.Paint r2 = r3.f4770e
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r2.setColor(r5)
            android.graphics.Path r2 = r3.f4769d
            android.graphics.Paint r5 = r3.f4770e
            r4.drawPath(r2, r5)
            r7 = r4
            goto L_0x0470
        L_0x046c:
            r4 = r29
            r0 = 0
            r1 = 1
        L_0x0470:
            r2 = r0
            r0 = r1
            r6 = r7
            goto L_0x047b
        L_0x0474:
            r4 = r1
            r22 = r8
            r23 = r9
            r1 = 0
            r2 = r1
        L_0x047b:
            r1 = r4
            r5 = r16
            r8 = r22
            r9 = r23
            r4 = r0
            r0 = r28
            goto L_0x0164
        L_0x0487:
            r4 = r1
            r29.restore()
        L_0x048b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void enableTransition(int i, boolean z) {
        C2150q.C2152b transition = getTransition(i);
        if (z) {
            transition.f4996o = false;
            return;
        }
        C2150q qVar = this.mScene;
        if (transition == qVar.f4964c) {
            Iterator it = qVar.mo8168h(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2150q.C2152b bVar = (C2150q.C2152b) it.next();
                if (!bVar.f4996o) {
                    this.mScene.f4964c = bVar;
                    break;
                }
            }
        }
        transition.f4996o = true;
    }

    public void evaluate(boolean z) {
        float f;
        boolean z2;
        int i;
        int i2;
        float f2;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = getNanoTime();
        }
        float f3 = this.mTransitionLastPosition;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (this.mKeepAnimating || (this.mInTransition && (z || this.mTransitionGoalPosition != f3))) {
            float signum = Math.signum(this.mTransitionGoalPosition - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.mInterpolator;
            if (!(interpolator instanceof MotionInterpolator)) {
                f = ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration;
                this.mLastVelocity = f;
            } else {
                f = 0.0f;
            }
            float f4 = this.mTransitionLastPosition + f;
            if (this.mTransitionInstantly) {
                f4 = this.mTransitionGoalPosition;
            }
            int i3 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i3 <= 0 || f4 < this.mTransitionGoalPosition) && (signum > 0.0f || f4 > this.mTransitionGoalPosition)) {
                z2 = false;
            } else {
                f4 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z2 = true;
            }
            this.mTransitionLastPosition = f4;
            this.mTransitionPosition = f4;
            this.mTransitionLastTime = nanoTime;
            if (interpolator != null && !z2) {
                if (this.mTemporalInterpolator) {
                    f2 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
                    this.mTransitionLastPosition = f2;
                    this.mTransitionLastTime = nanoTime;
                    Interpolator interpolator2 = this.mInterpolator;
                    if (interpolator2 instanceof MotionInterpolator) {
                        float velocity = ((MotionInterpolator) interpolator2).getVelocity();
                        this.mLastVelocity = velocity;
                        if (Math.abs(velocity) * this.mTransitionDuration <= EPSILON) {
                            this.mInTransition = false;
                        }
                        if (velocity > 0.0f && f2 >= 1.0f) {
                            this.mTransitionLastPosition = 1.0f;
                            this.mInTransition = false;
                            f2 = 1.0f;
                        }
                        if (velocity < 0.0f && f2 <= 0.0f) {
                            this.mTransitionLastPosition = 0.0f;
                            this.mInTransition = false;
                            f4 = 0.0f;
                        }
                    }
                } else {
                    f2 = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.mInterpolator;
                    if (interpolator3 instanceof MotionInterpolator) {
                        this.mLastVelocity = ((MotionInterpolator) interpolator3).getVelocity();
                    } else {
                        this.mLastVelocity = ((interpolator3.getInterpolation(f4 + f) - f2) * signum) / f;
                    }
                }
                f4 = f2;
            }
            if (Math.abs(this.mLastVelocity) > EPSILON) {
                setState(TransitionState.MOVING);
            }
            if ((i3 > 0 && f4 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f4 <= this.mTransitionGoalPosition)) {
                f4 = this.mTransitionGoalPosition;
                this.mInTransition = false;
            }
            int i4 = (f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1));
            if (i4 >= 0 || f4 <= 0.0f) {
                this.mInTransition = false;
                setState(TransitionState.FINISHED);
            }
            int childCount = getChildCount();
            this.mKeepAnimating = false;
            long nanoTime2 = getNanoTime();
            this.mPostInterpolationPosition = f4;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C2148o oVar = this.mFrameArrayList.get(childAt);
                if (oVar != null) {
                    this.mKeepAnimating = oVar.mo8154c(f4, nanoTime2, childAt, this.mKeyCache) | this.mKeepAnimating;
                }
            }
            boolean z5 = (i3 > 0 && f4 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f4 <= this.mTransitionGoalPosition);
            if (!this.mKeepAnimating && !this.mInTransition && z5) {
                setState(TransitionState.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.mKeepAnimating = (!z5) | this.mKeepAnimating;
            if (!(f4 > 0.0f || (i2 = this.mBeginState) == -1 || this.mCurrentState == i2)) {
                this.mCurrentState = i2;
                this.mScene.mo8162b(i2).mo8483a(this);
                setState(TransitionState.FINISHED);
                z4 = true;
            }
            if (((double) f4) >= 1.0d && this.mCurrentState != (i = this.mEndState)) {
                this.mCurrentState = i;
                this.mScene.mo8162b(i).mo8483a(this);
                setState(TransitionState.FINISHED);
                z4 = true;
            }
            if (this.mKeepAnimating || this.mInTransition) {
                invalidate();
            } else if ((i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                setState(TransitionState.FINISHED);
            }
            if ((!this.mKeepAnimating && this.mInTransition && i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                onNewStateAttachHandlers();
            }
        }
        float f5 = this.mTransitionLastPosition;
        if (f5 >= 1.0f) {
            int i6 = this.mCurrentState;
            int i7 = this.mEndState;
            if (i6 == i7) {
                z3 = z4;
            }
            this.mCurrentState = i7;
        } else {
            if (f5 <= 0.0f) {
                int i8 = this.mCurrentState;
                int i9 = this.mBeginState;
                if (i8 == i9) {
                    z3 = z4;
                }
                this.mCurrentState = i9;
            }
            this.mNeedsFireTransitionCompleted |= z4;
            if (z4 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        z4 = z3;
        this.mNeedsFireTransitionCompleted |= z4;
        requestLayout();
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    public void fireTransitionCompleted() {
        int i;
        ArrayList<C2113i> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.mTransitionCompleted;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (!(i == i2 || i2 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        processTransitionCompleted();
    }

    public void fireTrigger(int i, boolean z, float f) {
        C2113i iVar = this.mTransitionListener;
        if (iVar != null) {
            iVar.onTransitionTrigger(this, i, z, f);
        }
        ArrayList<C2113i> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<C2113i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f);
            }
        }
    }

    public void getAnchorDpDt(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, C2148o> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        C2148o oVar = hashMap.get(viewById);
        if (oVar != null) {
            oVar.mo8153b(f, f2, f3, fArr);
            float y = viewById.getY();
            this.lastPos = f;
            this.lastY = y;
            return;
        }
        String g = viewById == null ? C0015b.m88g("", i) : viewById.getContext().getResources().getResourceName(i);
        Log.w(TAG, "WARNING could not find view id " + g);
    }

    public C2236a getConstraintSet(int i) {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        return qVar.mo8162b(i);
    }

    public int[] getConstraintSetIds() {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        int size = qVar.f4969h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = qVar.f4969h.keyAt(i);
        }
        return iArr;
    }

    public String getConstraintSetNames(int i) {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        for (Map.Entry next : qVar.f4970i.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z) {
        this.mDebugPath = z ? 2 : 1;
        invalidate();
    }

    public ArrayList<C2150q.C2152b> getDefinedTransitions() {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        return qVar.f4966e;
    }

    public C2115b getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new C2115b();
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public C2150q.C2152b getTransition(int i) {
        Iterator<C2150q.C2152b> it = this.mScene.f4966e.iterator();
        while (it.hasNext()) {
            C2150q.C2152b next = it.next();
            if (next.f4982a == i) {
                return next;
            }
        }
        return null;
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new C2112h();
        }
        C2112h hVar = this.mStateCache;
        hVar.f4792d = MotionLayout.this.mEndState;
        hVar.f4791c = MotionLayout.this.mBeginState;
        hVar.f4790b = MotionLayout.this.getVelocity();
        hVar.f4789a = MotionLayout.this.getProgress();
        C2112h hVar2 = this.mStateCache;
        hVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.f4789a);
        bundle.putFloat("motion.velocity", hVar2.f4790b);
        bundle.putInt("motion.StartState", hVar2.f4791c);
        bundle.putInt("motion.EndState", hVar2.f4792d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        C2150q qVar = this.mScene;
        if (qVar != null) {
            C2150q.C2152b bVar = qVar.f4964c;
            this.mTransitionDuration = ((float) (bVar != null ? bVar.f4989h : qVar.f4972k)) / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float[] fArr2;
        int i2;
        int i3;
        double[] dArr;
        float f4 = f;
        float f5 = f2;
        float[] fArr3 = fArr;
        int i4 = i;
        float f6 = this.mLastVelocity;
        float f7 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f7);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f6 = (((interpolation - interpolation2) / EPSILON) * signum) / this.mTransitionDuration;
            f7 = interpolation2;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f6 = ((MotionInterpolator) interpolator).getVelocity();
        }
        float f8 = f6;
        C2148o oVar = this.mFrameArrayList.get(view);
        if ((i4 & 1) == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            float a = oVar.mo8152a(oVar.f4940t, f7);
            HashMap<String, C2154r> hashMap = oVar.f4943w;
            C2154r rVar = hashMap == null ? null : hashMap.get("translationX");
            HashMap<String, C2154r> hashMap2 = oVar.f4943w;
            C2154r rVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
            HashMap<String, C2154r> hashMap3 = oVar.f4943w;
            C2154r rVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
            HashMap<String, C2154r> hashMap4 = oVar.f4943w;
            f3 = f8;
            C2154r rVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
            HashMap<String, C2154r> hashMap5 = oVar.f4943w;
            C2154r rVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
            HashMap<String, C2123h> hashMap6 = oVar.f4944x;
            C2123h hVar = hashMap6 == null ? null : hashMap6.get("translationX");
            HashMap<String, C2123h> hashMap7 = oVar.f4944x;
            C2123h hVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
            HashMap<String, C2123h> hashMap8 = oVar.f4944x;
            C2123h hVar3 = hashMap8 == null ? null : hashMap8.get("rotation");
            HashMap<String, C2123h> hashMap9 = oVar.f4944x;
            C2123h hVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
            HashMap<String, C2123h> hashMap10 = oVar.f4944x;
            C2123h hVar5 = hashMap10 == null ? null : hashMap10.get("scaleY");
            C7368g gVar = new C7368g();
            gVar.f16428e = 0.0f;
            gVar.f16427d = 0.0f;
            gVar.f16426c = 0.0f;
            gVar.f16425b = 0.0f;
            gVar.f16424a = 0.0f;
            if (rVar3 != null) {
                i3 = width;
                i2 = height;
                gVar.f16428e = (float) rVar3.f5003a.mo19650e((double) a);
                gVar.f16429f = rVar3.mo8179a(a);
            } else {
                i3 = width;
                i2 = height;
            }
            if (rVar != null) {
                gVar.f16426c = (float) rVar.f5003a.mo19650e((double) a);
            }
            if (rVar2 != null) {
                gVar.f16427d = (float) rVar2.f5003a.mo19650e((double) a);
            }
            if (rVar4 != null) {
                gVar.f16424a = (float) rVar4.f5003a.mo19650e((double) a);
            }
            if (rVar5 != null) {
                gVar.f16425b = (float) rVar5.f5003a.mo19650e((double) a);
            }
            if (hVar3 != null) {
                gVar.f16428e = hVar3.mo8143b(a);
            }
            if (hVar != null) {
                gVar.f16426c = hVar.mo8143b(a);
            }
            if (hVar2 != null) {
                gVar.f16427d = hVar2.mo8143b(a);
            }
            if (!(hVar4 == null && hVar5 == null)) {
                if (hVar4 == null) {
                    gVar.f16424a = hVar4.mo8143b(a);
                }
                if (hVar5 == null) {
                    gVar.f16425b = hVar5.mo8143b(a);
                }
            }
            C7359a aVar = oVar.f4929i;
            if (aVar != null) {
                double[] dArr2 = oVar.f4934n;
                if (dArr2.length > 0) {
                    double d = (double) a;
                    aVar.mo19648c(d, dArr2);
                    oVar.f4929i.mo19651f(d, oVar.f4935o);
                    C2149p pVar = oVar.f4924d;
                    int[] iArr = oVar.f4933m;
                    double[] dArr3 = oVar.f4935o;
                    double[] dArr4 = oVar.f4934n;
                    pVar.getClass();
                    C2149p.m4620f(f, f2, fArr, iArr, dArr3, dArr4);
                }
                gVar.mo19664a(f, f2, i3, i2, fArr);
            } else if (oVar.f4928h != null) {
                double a2 = (double) oVar.mo8152a(oVar.f4940t, a);
                oVar.f4928h[0].mo19651f(a2, oVar.f4935o);
                oVar.f4928h[0].mo19648c(a2, oVar.f4934n);
                float f9 = oVar.f4940t[0];
                int i5 = 0;
                while (true) {
                    dArr = oVar.f4935o;
                    if (i5 >= dArr.length) {
                        break;
                    }
                    dArr[i5] = dArr[i5] * ((double) f9);
                    i5++;
                }
                C2149p pVar2 = oVar.f4924d;
                int[] iArr2 = oVar.f4933m;
                double[] dArr5 = oVar.f4934n;
                pVar2.getClass();
                C2149p.m4620f(f, f2, fArr, iArr2, dArr, dArr5);
                gVar.mo19664a(f, f2, i3, i2, fArr);
            } else {
                C2149p pVar3 = oVar.f4925e;
                float f10 = pVar3.f4952f;
                C2149p pVar4 = oVar.f4924d;
                float f11 = f10 - pVar4.f4952f;
                C2123h hVar6 = hVar5;
                float f12 = pVar3.f4953g - pVar4.f4953g;
                C2123h hVar7 = hVar4;
                float f13 = f;
                C2123h hVar8 = hVar2;
                float f14 = ((pVar3.f4954h - pVar4.f4954h) + f11) * f13;
                fArr2 = fArr;
                fArr2[0] = f14 + ((1.0f - f13) * f11);
                float f15 = f2;
                fArr2[1] = (((pVar3.f4955i - pVar4.f4955i) + f12) * f15) + ((1.0f - f15) * f12);
                gVar.f16428e = 0.0f;
                gVar.f16427d = 0.0f;
                gVar.f16426c = 0.0f;
                gVar.f16425b = 0.0f;
                gVar.f16424a = 0.0f;
                if (rVar3 != null) {
                    gVar.f16428e = (float) rVar3.f5003a.mo19650e((double) a);
                    gVar.f16429f = rVar3.mo8179a(a);
                }
                if (rVar != null) {
                    gVar.f16426c = (float) rVar.f5003a.mo19650e((double) a);
                }
                if (rVar2 != null) {
                    gVar.f16427d = (float) rVar2.f5003a.mo19650e((double) a);
                }
                if (rVar4 != null) {
                    gVar.f16424a = (float) rVar4.f5003a.mo19650e((double) a);
                }
                if (rVar5 != null) {
                    gVar.f16425b = (float) rVar5.f5003a.mo19650e((double) a);
                }
                if (hVar3 != null) {
                    gVar.f16428e = hVar3.mo8143b(a);
                }
                if (hVar != null) {
                    gVar.f16426c = hVar.mo8143b(a);
                }
                if (hVar8 != null) {
                    gVar.f16427d = hVar8.mo8143b(a);
                }
                if (!(hVar7 == null && hVar6 == null)) {
                    if (hVar7 == null) {
                        gVar.f16424a = hVar7.mo8143b(a);
                    }
                    if (hVar6 == null) {
                        gVar.f16425b = hVar6.mo8143b(a);
                    }
                }
                gVar.mo19664a(f, f2, i3, i2, fArr);
            }
            fArr2 = fArr;
        } else {
            fArr2 = fArr3;
            f3 = f8;
            oVar.mo8153b(f7, f4, f5, fArr2);
        }
        if (i < 2) {
            fArr2[0] = fArr2[0] * f3;
            fArr2[1] = fArr2[1] * f3;
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public void loadLayoutDescription(int i) {
        C2186v vVar;
        if (i != 0) {
            try {
                this.mScene = new C2150q(getContext(), this, i);
                if (isAttachedToWindow()) {
                    this.mScene.mo8172l(this);
                    this.mModel.mo8132d(this.mScene.mo8162b(this.mBeginState), this.mScene.mo8162b(this.mEndState));
                    rebuildScene();
                    C2150q qVar = this.mScene;
                    boolean isRtl = isRtl();
                    qVar.f4978q = isRtl;
                    C2150q.C2152b bVar = qVar.f4964c;
                    if (bVar != null && (vVar = bVar.f4993l) != null) {
                        vVar.mo8192b(isRtl);
                    }
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } else {
            this.mScene = null;
        }
    }

    public int lookUpConstraintId(String str) {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            return 0;
        }
        return qVar.f4970i.get(str).intValue();
    }

    public C2110f obtainVelocityTracker() {
        C2111g gVar = C2111g.f4787b;
        gVar.f4788a = VelocityTracker.obtain();
        return gVar;
    }

    public void onAttachedToWindow() {
        C2150q.C2152b bVar;
        int i;
        super.onAttachedToWindow();
        C2150q qVar = this.mScene;
        if (!(qVar == null || (i = this.mCurrentState) == -1)) {
            C2236a b = qVar.mo8162b(i);
            this.mScene.mo8172l(this);
            if (b != null) {
                b.mo8484b(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        C2112h hVar = this.mStateCache;
        if (hVar != null) {
            hVar.mo8135a();
            return;
        }
        C2150q qVar2 = this.mScene;
        if (qVar2 != null && (bVar = qVar2.f4964c) != null && bVar.f4995n == 4) {
            transitionToEnd();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C2150q.C2152b bVar;
        C2186v vVar;
        int i;
        RectF a;
        C2150q qVar = this.mScene;
        if (qVar != null && this.mInteractionEnabled && (bVar = qVar.f4964c) != null && (!bVar.f4996o) && (vVar = bVar.f4993l) != null && ((motionEvent.getAction() != 0 || (a = vVar.mo8191a(this, new RectF())) == null || a.contains(motionEvent.getX(), motionEvent.getY())) && (i = vVar.f5033e) != -1)) {
            View view = this.mRegionView;
            if (view == null || view.getId() != i) {
                this.mRegionView = findViewById(i);
            }
            View view2 = this.mRegionView;
            if (view2 != null) {
                this.mBoundsCheck.set((float) view2.getLeft(), (float) this.mRegionView.getTop(), (float) this.mRegionView.getRight(), (float) this.mRegionView.getBottom());
                if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(0.0f, 0.0f, this.mRegionView, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.mLastLayoutWidth == i5 && this.mLastLayoutHeight == i6)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
            this.mInLayout = false;
        } finally {
            this.mInLayout = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (((r3 == r0.f4784e && r4 == r0.f4785f) ? false : true) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            androidx.constraintlayout.motion.widget.q r0 = r7.mScene
            if (r0 != 0) goto L_0x0008
            super.onMeasure(r8, r9)
            return
        L_0x0008:
            int r0 = r7.mLastWidthMeasureSpec
            r1 = 0
            r2 = 1
            if (r0 != r8) goto L_0x0015
            int r0 = r7.mLastHeightMeasureSpec
            if (r0 == r9) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            boolean r3 = r7.mNeedsFireTransitionCompleted
            if (r3 == 0) goto L_0x0023
            r7.mNeedsFireTransitionCompleted = r1
            r7.onNewStateAttachHandlers()
            r7.processTransitionCompleted()
            r0 = r2
        L_0x0023:
            boolean r3 = r7.mDirtyHierarchy
            if (r3 == 0) goto L_0x0028
            r0 = r2
        L_0x0028:
            r7.mLastWidthMeasureSpec = r8
            r7.mLastHeightMeasureSpec = r9
            androidx.constraintlayout.motion.widget.q r3 = r7.mScene
            int r3 = r3.mo8167g()
            androidx.constraintlayout.motion.widget.q r4 = r7.mScene
            androidx.constraintlayout.motion.widget.q$b r4 = r4.f4964c
            r5 = -1
            if (r4 != 0) goto L_0x003b
            r4 = r5
            goto L_0x003d
        L_0x003b:
            int r4 = r4.f4984c
        L_0x003d:
            if (r0 != 0) goto L_0x004f
            androidx.constraintlayout.motion.widget.MotionLayout$e r0 = r7.mModel
            int r6 = r0.f4784e
            if (r3 != r6) goto L_0x004c
            int r0 = r0.f4785f
            if (r4 == r0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = r1
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 == 0) goto L_0x0073
        L_0x004f:
            int r0 = r7.mBeginState
            if (r0 == r5) goto L_0x0073
            super.onMeasure(r8, r9)
            androidx.constraintlayout.motion.widget.MotionLayout$e r8 = r7.mModel
            androidx.constraintlayout.motion.widget.q r9 = r7.mScene
            androidx.constraintlayout.widget.a r9 = r9.mo8162b(r3)
            androidx.constraintlayout.motion.widget.q r0 = r7.mScene
            androidx.constraintlayout.widget.a r0 = r0.mo8162b(r4)
            r8.mo8132d(r9, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$e r8 = r7.mModel
            r8.mo8133e()
            androidx.constraintlayout.motion.widget.MotionLayout$e r8 = r7.mModel
            r8.f4784e = r3
            r8.f4785f = r4
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            boolean r8 = r7.mMeasureDuringTransition
            if (r8 != 0) goto L_0x007a
            if (r1 == 0) goto L_0x00c9
        L_0x007a:
            int r8 = r7.getPaddingTop()
            int r9 = r7.getPaddingBottom()
            int r9 = r9 + r8
            int r8 = r7.getPaddingLeft()
            int r0 = r7.getPaddingRight()
            int r0 = r0 + r8
            androidx.constraintlayout.solver.widgets.d r8 = r7.mLayoutWidget
            int r8 = r8.mo8289r()
            int r8 = r8 + r0
            androidx.constraintlayout.solver.widgets.d r0 = r7.mLayoutWidget
            int r0 = r0.mo8286o()
            int r0 = r0 + r9
            int r9 = r7.mWidthMeasureMode
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r1) goto L_0x00a2
            if (r9 != 0) goto L_0x00b1
        L_0x00a2:
            int r8 = r7.mStartWrapWidth
            float r9 = (float) r8
            float r2 = r7.mPostInterpolationPosition
            int r3 = r7.mEndWrapWidth
            int r3 = r3 - r8
            float r8 = (float) r3
            float r2 = r2 * r8
            float r2 = r2 + r9
            int r8 = (int) r2
            r7.requestLayout()
        L_0x00b1:
            int r9 = r7.mHeightMeasureMode
            if (r9 == r1) goto L_0x00b7
            if (r9 != 0) goto L_0x00c6
        L_0x00b7:
            int r9 = r7.mStartWrapHeight
            float r0 = (float) r9
            float r1 = r7.mPostInterpolationPosition
            int r2 = r7.mEndWrapHeight
            int r2 = r2 - r9
            float r9 = (float) r2
            float r1 = r1 * r9
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.requestLayout()
        L_0x00c6:
            r7.setMeasuredDimension(r8, r0)
        L_0x00c9:
            r7.evaluateLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r5 = r5.f4993l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedPreScroll(android.view.View r19, int r20, int r21, int[] r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            androidx.constraintlayout.motion.widget.q r4 = r0.mScene
            if (r4 == 0) goto L_0x0175
            androidx.constraintlayout.motion.widget.q$b r4 = r4.f4964c
            if (r4 != 0) goto L_0x0012
            goto L_0x0175
        L_0x0012:
            boolean r5 = r4.f4996o
            r6 = 1
            r5 = r5 ^ r6
            if (r5 != 0) goto L_0x0019
            return
        L_0x0019:
            r7 = -1
            if (r5 == 0) goto L_0x002b
            androidx.constraintlayout.motion.widget.v r5 = r4.f4993l
            if (r5 == 0) goto L_0x002b
            int r5 = r5.f5033e
            if (r5 == r7) goto L_0x002b
            int r8 = r19.getId()
            if (r8 == r5) goto L_0x002b
            return
        L_0x002b:
            androidx.constraintlayout.motion.widget.q r5 = r0.mScene
            r8 = 0
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x0052
            androidx.constraintlayout.motion.widget.q$b r5 = r5.f4964c
            if (r5 == 0) goto L_0x003e
            androidx.constraintlayout.motion.widget.v r5 = r5.f4993l
            if (r5 == 0) goto L_0x003e
            boolean r5 = r5.f5046r
            goto L_0x003f
        L_0x003e:
            r5 = r9
        L_0x003f:
            if (r5 == 0) goto L_0x0052
            float r5 = r0.mTransitionPosition
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
        L_0x004b:
            boolean r5 = r1.canScrollVertically(r7)
            if (r5 == 0) goto L_0x0052
            return
        L_0x0052:
            androidx.constraintlayout.motion.widget.v r4 = r4.f4993l
            if (r4 == 0) goto L_0x00c3
            androidx.constraintlayout.motion.widget.q r4 = r0.mScene
            androidx.constraintlayout.motion.widget.q$b r4 = r4.f4964c
            androidx.constraintlayout.motion.widget.v r4 = r4.f4993l
            int r5 = r4.f5048t
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00c3
            float r5 = (float) r2
            float r7 = (float) r3
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.f5043o
            float r14 = r11.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r4.f5043o
            int r13 = r4.f5032d
            float r15 = r4.f5036h
            float r11 = r4.f5035g
            float[] r10 = r4.f5040l
            r16 = r11
            r17 = r10
            r12.getAnchorDpDt(r13, r14, r15, r16, r17)
            float r10 = r4.f5037i
            int r11 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r12 = 869711765(0x33d6bf95, float:1.0E-7)
            if (r11 == 0) goto L_0x0092
            float[] r4 = r4.f5040l
            r7 = r4[r9]
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x008d
            r4[r9] = r12
        L_0x008d:
            float r5 = r5 * r10
            r4 = r4[r9]
            float r5 = r5 / r4
            goto L_0x00a3
        L_0x0092:
            float[] r5 = r4.f5040l
            r10 = r5[r6]
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x009c
            r5[r6] = r12
        L_0x009c:
            float r4 = r4.f5038j
            float r7 = r7 * r4
            r4 = r5[r6]
            float r5 = r7 / r4
        L_0x00a3:
            float r4 = r0.mTransitionLastPosition
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x00ad
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x00b7
        L_0x00ad:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x00c3
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c3
        L_0x00b7:
            r1.setNestedScrollingEnabled(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$a r2 = new androidx.constraintlayout.motion.widget.MotionLayout$a
            r2.<init>(r1)
            r1.post(r2)
            return
        L_0x00c3:
            float r1 = r0.mTransitionPosition
            long r4 = r18.getNanoTime()
            float r7 = (float) r2
            r0.mScrollTargetDX = r7
            float r10 = (float) r3
            r0.mScrollTargetDY = r10
            long r11 = r0.mScrollTargetTime
            long r11 = r4 - r11
            double r11 = (double) r11
            r13 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r11 = r11 * r13
            float r11 = (float) r11
            r0.mScrollTargetDT = r11
            r0.mScrollTargetTime = r4
            androidx.constraintlayout.motion.widget.q r4 = r0.mScene
            androidx.constraintlayout.motion.widget.q$b r4 = r4.f4964c
            if (r4 == 0) goto L_0x015e
            androidx.constraintlayout.motion.widget.v r4 = r4.f4993l
            if (r4 == 0) goto L_0x015e
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.f5043o
            float r5 = r5.getProgress()
            boolean r11 = r4.f5039k
            if (r11 != 0) goto L_0x00fa
            r4.f5039k = r6
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.f5043o
            r11.setProgress(r5)
        L_0x00fa:
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.f5043o
            int r12 = r4.f5032d
            float r14 = r4.f5036h
            float r15 = r4.f5035g
            float[] r13 = r4.f5040l
            r16 = r13
            r13 = r5
            r11.getAnchorDpDt(r12, r13, r14, r15, r16)
            float r11 = r4.f5037i
            float[] r12 = r4.f5040l
            r13 = r12[r9]
            float r11 = r11 * r13
            float r13 = r4.f5038j
            r12 = r12[r6]
            float r13 = r13 * r12
            float r13 = r13 + r11
            float r11 = java.lang.Math.abs(r13)
            double r11 = (double) r11
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x012e
            float[] r11 = r4.f5040l
            r12 = 1008981770(0x3c23d70a, float:0.01)
            r11[r9] = r12
            r11[r6] = r12
        L_0x012e:
            float r11 = r4.f5037i
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x013b
            float r7 = r7 * r11
            float[] r10 = r4.f5040l
            r10 = r10[r9]
            float r7 = r7 / r10
            goto L_0x0144
        L_0x013b:
            float r7 = r4.f5038j
            float r10 = r10 * r7
            float[] r7 = r4.f5040l
            r7 = r7[r6]
            float r7 = r10 / r7
        L_0x0144:
            float r5 = r5 + r7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r7)
            float r5 = java.lang.Math.max(r5, r8)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r4.f5043o
            float r7 = r7.getProgress()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x015e
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r4.f5043o
            r4.setProgress(r5)
        L_0x015e:
            float r4 = r0.mTransitionPosition
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0168
            r22[r9] = r2
            r22[r6] = r3
        L_0x0168:
            r0.evaluate(r9)
            r1 = r22[r9]
            if (r1 != 0) goto L_0x0173
            r1 = r22[r6]
            if (r1 == 0) goto L_0x0175
        L_0x0173:
            r0.mUndergoingMotion = r6
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onNestedPreScroll(android.view.View, int, int, int[], int):void");
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.mUndergoingMotion && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public void onNewStateAttachHandlers() {
        C2150q.C2152b bVar;
        C2186v vVar;
        View view;
        C2150q qVar = this.mScene;
        if (qVar != null) {
            if (qVar.mo8161a(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i = this.mCurrentState;
            if (i != -1) {
                C2150q qVar2 = this.mScene;
                Iterator<C2150q.C2152b> it = qVar2.f4966e.iterator();
                while (it.hasNext()) {
                    C2150q.C2152b next = it.next();
                    if (next.f4994m.size() > 0) {
                        Iterator<C2150q.C2152b.C2153a> it2 = next.f4994m.iterator();
                        while (it2.hasNext()) {
                            it2.next().mo8177b(this);
                        }
                    }
                }
                Iterator<C2150q.C2152b> it3 = qVar2.f4968g.iterator();
                while (it3.hasNext()) {
                    C2150q.C2152b next2 = it3.next();
                    if (next2.f4994m.size() > 0) {
                        Iterator<C2150q.C2152b.C2153a> it4 = next2.f4994m.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo8177b(this);
                        }
                    }
                }
                Iterator<C2150q.C2152b> it5 = qVar2.f4966e.iterator();
                while (it5.hasNext()) {
                    C2150q.C2152b next3 = it5.next();
                    if (next3.f4994m.size() > 0) {
                        Iterator<C2150q.C2152b.C2153a> it6 = next3.f4994m.iterator();
                        while (it6.hasNext()) {
                            it6.next().mo8176a(this, i, next3);
                        }
                    }
                }
                Iterator<C2150q.C2152b> it7 = qVar2.f4968g.iterator();
                while (it7.hasNext()) {
                    C2150q.C2152b next4 = it7.next();
                    if (next4.f4994m.size() > 0) {
                        Iterator<C2150q.C2152b.C2153a> it8 = next4.f4994m.iterator();
                        while (it8.hasNext()) {
                            it8.next().mo8176a(this, i, next4);
                        }
                    }
                }
            }
            if (this.mScene.mo8174n() && (bVar = this.mScene.f4964c) != null && (vVar = bVar.f4993l) != null) {
                int i2 = vVar.f5032d;
                if (i2 != -1) {
                    view = vVar.f5043o.findViewById(i2);
                    if (view == null) {
                        StringBuilder h = C0072d.m201h("cannot find TouchAnchorId @id/");
                        h.append(C2114a.m4566b(vVar.f5043o.getContext(), vVar.f5032d));
                        Log.e("TouchResponse", h.toString());
                    }
                } else {
                    view = null;
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new C2184t());
                    nestedScrollView.setOnScrollChangeListener(new C2185u());
                }
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        C2186v vVar;
        C2150q qVar = this.mScene;
        if (qVar != null) {
            boolean isRtl = isRtl();
            qVar.f4978q = isRtl;
            C2150q.C2152b bVar = qVar.f4964c;
            if (bVar != null && (vVar = bVar.f4993l) != null) {
                vVar.mo8192b(isRtl);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = (r1 = r1.f4964c).f4993l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.q r1 = r0.mScene
            if (r1 == 0) goto L_0x0015
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f4964c
            if (r1 == 0) goto L_0x0015
            androidx.constraintlayout.motion.widget.v r1 = r1.f4993l
            if (r1 == 0) goto L_0x0015
            int r1 = r1.f5048t
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 1
            return r1
        L_0x0015:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onStartNestedScroll(android.view.View, android.view.View, int, int):boolean");
    }

    public void onStopNestedScroll(View view, int i) {
        C2186v vVar;
        C2150q qVar = this.mScene;
        if (qVar != null) {
            float f = this.mScrollTargetDX;
            float f2 = this.mScrollTargetDT;
            float f3 = f / f2;
            float f4 = this.mScrollTargetDY / f2;
            C2150q.C2152b bVar = qVar.f4964c;
            if (bVar != null && (vVar = bVar.f4993l) != null) {
                boolean z = false;
                vVar.f5039k = false;
                float progress = vVar.f5043o.getProgress();
                vVar.f5043o.getAnchorDpDt(vVar.f5032d, progress, vVar.f5036h, vVar.f5035g, vVar.f5040l);
                float f5 = vVar.f5037i;
                float[] fArr = vVar.f5040l;
                float f6 = 0.0f;
                float f7 = f5 != 0.0f ? (f3 * f5) / fArr[0] : (f4 * vVar.f5038j) / fArr[1];
                if (!Float.isNaN(f7)) {
                    progress += f7 / 3.0f;
                }
                if (progress != 0.0f) {
                    boolean z2 = progress != 1.0f;
                    int i2 = vVar.f5031c;
                    if (i2 != 3) {
                        z = true;
                    }
                    if (z && z2) {
                        MotionLayout motionLayout = vVar.f5043o;
                        if (((double) progress) >= 0.5d) {
                            f6 = 1.0f;
                        }
                        motionLayout.touchAnimateTo(i2, f6, f7);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: androidx.constraintlayout.motion.widget.q$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.constraintlayout.motion.widget.q r2 = r0.mScene
            if (r2 == 0) goto L_0x03ea
            boolean r3 = r0.mInteractionEnabled
            if (r3 == 0) goto L_0x03ea
            boolean r2 = r2.mo8174n()
            if (r2 == 0) goto L_0x03ea
            androidx.constraintlayout.motion.widget.q r2 = r0.mScene
            androidx.constraintlayout.motion.widget.q$b r3 = r2.f4964c
            r4 = 1
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.f4996o
            r3 = r3 ^ r4
            if (r3 != 0) goto L_0x0023
            boolean r1 = super.onTouchEvent(r20)
            return r1
        L_0x0023:
            int r3 = r19.getCurrentState()
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r2.f4977p
            if (r6 != 0) goto L_0x0038
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r2.f4962a
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r6.obtainVelocityTracker()
            r2.f4977p = r6
        L_0x0038:
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r2.f4977p
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = (androidx.constraintlayout.motion.widget.MotionLayout.C2111g) r6
            android.view.VelocityTracker r6 = r6.f4788a
            if (r6 == 0) goto L_0x0043
            r6.addMovement(r1)
        L_0x0043:
            r6 = 0
            r7 = 2
            r8 = -1
            if (r3 == r8) goto L_0x01c2
            int r11 = r20.getAction()
            if (r11 == 0) goto L_0x0138
            if (r11 == r7) goto L_0x0052
            goto L_0x01c2
        L_0x0052:
            boolean r11 = r2.f4975n
            if (r11 == 0) goto L_0x0058
            goto L_0x01c2
        L_0x0058:
            float r11 = r20.getRawY()
            float r12 = r2.f4980s
            float r11 = r11 - r12
            float r12 = r20.getRawX()
            float r13 = r2.f4979r
            float r12 = r12 - r13
            double r13 = (double) r12
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x0076
            double r13 = (double) r11
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            r1 = r4
            goto L_0x03e9
        L_0x0076:
            android.view.MotionEvent r13 = r2.f4974m
            if (r13 != 0) goto L_0x007b
            goto L_0x0073
        L_0x007b:
            if (r3 == r8) goto L_0x00fe
            java.util.ArrayList r14 = r2.mo8168h(r3)
            android.graphics.RectF r15 = new android.graphics.RectF
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
            r16 = 0
            r17 = 0
        L_0x008e:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto L_0x00fb
            java.lang.Object r18 = r14.next()
            r10 = r18
            androidx.constraintlayout.motion.widget.q$b r10 = (androidx.constraintlayout.motion.widget.C2150q.C2152b) r10
            boolean r7 = r10.f4996o
            if (r7 == 0) goto L_0x00a1
            goto L_0x00f8
        L_0x00a1:
            androidx.constraintlayout.motion.widget.v r7 = r10.f4993l
            if (r7 == 0) goto L_0x00f8
            boolean r4 = r2.f4978q
            r7.mo8192b(r4)
            androidx.constraintlayout.motion.widget.v r4 = r10.f4993l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.f4962a
            android.graphics.RectF r4 = r4.mo8191a(r7, r15)
            if (r4 == 0) goto L_0x00c3
            float r7 = r13.getX()
            float r9 = r13.getY()
            boolean r4 = r4.contains(r7, r9)
            if (r4 != 0) goto L_0x00c3
            goto L_0x00f8
        L_0x00c3:
            androidx.constraintlayout.motion.widget.v r4 = r10.f4993l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.f4962a
            android.graphics.RectF r4 = r4.mo8191a(r7, r15)
            if (r4 == 0) goto L_0x00dc
            float r7 = r13.getX()
            float r9 = r13.getY()
            boolean r4 = r4.contains(r7, r9)
            if (r4 != 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            androidx.constraintlayout.motion.widget.v r4 = r10.f4993l
            float r7 = r4.f5037i
            float r7 = r7 * r12
            float r4 = r4.f5038j
            float r4 = r4 * r11
            float r4 = r4 + r7
            int r7 = r10.f4984c
            if (r7 != r3) goto L_0x00ec
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00ef
        L_0x00ec:
            r7 = 1066192077(0x3f8ccccd, float:1.1)
        L_0x00ef:
            float r4 = r4 * r7
            int r7 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f8
            r17 = r4
            r16 = r10
        L_0x00f8:
            r4 = 1
            r7 = 2
            goto L_0x008e
        L_0x00fb:
            r3 = r16
            goto L_0x0100
        L_0x00fe:
            androidx.constraintlayout.motion.widget.q$b r3 = r2.f4964c
        L_0x0100:
            if (r3 == 0) goto L_0x01c2
            r0.setTransition((androidx.constraintlayout.motion.widget.C2150q.C2152b) r3)
            androidx.constraintlayout.motion.widget.q$b r3 = r2.f4964c
            androidx.constraintlayout.motion.widget.v r3 = r3.f4993l
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.f4962a
            android.graphics.RectF r3 = r3.mo8191a(r4, r5)
            if (r3 == 0) goto L_0x0125
            android.view.MotionEvent r4 = r2.f4974m
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.f4974m
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L_0x0125
            r3 = 1
            goto L_0x0126
        L_0x0125:
            r3 = r6
        L_0x0126:
            r2.f4976o = r3
            androidx.constraintlayout.motion.widget.q$b r3 = r2.f4964c
            androidx.constraintlayout.motion.widget.v r3 = r3.f4993l
            float r4 = r2.f4979r
            float r5 = r2.f4980s
            r3.f5041m = r4
            r3.f5042n = r5
            r3.f5039k = r6
            goto L_0x01c2
        L_0x0138:
            float r3 = r20.getRawX()
            r2.f4979r = r3
            float r3 = r20.getRawY()
            r2.f4980s = r3
            r2.f4974m = r1
            r2.f4975n = r6
            androidx.constraintlayout.motion.widget.q$b r1 = r2.f4964c
            androidx.constraintlayout.motion.widget.v r1 = r1.f4993l
            if (r1 == 0) goto L_0x01c6
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f4962a
            int r1 = r1.f5034f
            if (r1 != r8) goto L_0x0155
            goto L_0x015b
        L_0x0155:
            android.view.View r1 = r3.findViewById(r1)
            if (r1 != 0) goto L_0x015d
        L_0x015b:
            r1 = 0
            goto L_0x0175
        L_0x015d:
            int r3 = r1.getLeft()
            float r3 = (float) r3
            int r4 = r1.getTop()
            float r4 = (float) r4
            int r7 = r1.getRight()
            float r7 = (float) r7
            int r1 = r1.getBottom()
            float r1 = (float) r1
            r5.set(r3, r4, r7, r1)
            r1 = r5
        L_0x0175:
            if (r1 == 0) goto L_0x0191
            android.view.MotionEvent r3 = r2.f4974m
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f4974m
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x0191
            r1 = 0
            r2.f4974m = r1
            r1 = 1
            r2.f4975n = r1
            goto L_0x03e9
        L_0x0191:
            androidx.constraintlayout.motion.widget.q$b r1 = r2.f4964c
            androidx.constraintlayout.motion.widget.v r1 = r1.f4993l
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f4962a
            android.graphics.RectF r1 = r1.mo8191a(r3, r5)
            if (r1 == 0) goto L_0x01b3
            android.view.MotionEvent r3 = r2.f4974m
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f4974m
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x01b3
            r1 = 1
            r2.f4976o = r1
            goto L_0x01b5
        L_0x01b3:
            r2.f4976o = r6
        L_0x01b5:
            androidx.constraintlayout.motion.widget.q$b r1 = r2.f4964c
            androidx.constraintlayout.motion.widget.v r1 = r1.f4993l
            float r3 = r2.f4979r
            float r2 = r2.f4980s
            r1.f5041m = r3
            r1.f5042n = r2
            goto L_0x01c6
        L_0x01c2:
            boolean r3 = r2.f4975n
            if (r3 == 0) goto L_0x01c9
        L_0x01c6:
            r1 = 1
            goto L_0x03e9
        L_0x01c9:
            androidx.constraintlayout.motion.widget.q$b r3 = r2.f4964c
            if (r3 == 0) goto L_0x03b7
            androidx.constraintlayout.motion.widget.v r3 = r3.f4993l
            if (r3 == 0) goto L_0x03b7
            boolean r4 = r2.f4976o
            if (r4 != 0) goto L_0x03b7
            androidx.constraintlayout.motion.widget.MotionLayout$f r4 = r2.f4977p
            androidx.constraintlayout.motion.widget.MotionLayout$g r4 = (androidx.constraintlayout.motion.widget.MotionLayout.C2111g) r4
            android.view.VelocityTracker r5 = r4.f4788a
            if (r5 == 0) goto L_0x01e0
            r5.addMovement(r1)
        L_0x01e0:
            int r5 = r20.getAction()
            if (r5 == 0) goto L_0x03a9
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 1
            if (r5 == r10) goto L_0x02f8
            r10 = 2
            if (r5 == r10) goto L_0x01f2
            goto L_0x03b7
        L_0x01f2:
            float r5 = r20.getRawY()
            float r10 = r3.f5042n
            float r5 = r5 - r10
            float r10 = r20.getRawX()
            float r11 = r3.f5041m
            float r10 = r10 - r11
            float r11 = r3.f5037i
            float r11 = r11 * r10
            float r12 = r3.f5038j
            float r12 = r12 * r5
            float r12 = r12 + r11
            float r11 = java.lang.Math.abs(r12)
            float r12 = r3.f5049u
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x0215
            boolean r11 = r3.f5039k
            if (r11 == 0) goto L_0x03b7
        L_0x0215:
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f5043o
            float r11 = r11.getProgress()
            boolean r12 = r3.f5039k
            if (r12 != 0) goto L_0x0227
            r12 = 1
            r3.f5039k = r12
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f5043o
            r12.setProgress(r11)
        L_0x0227:
            int r13 = r3.f5032d
            if (r13 == r8) goto L_0x023d
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f5043o
            float r15 = r3.f5036h
            float r14 = r3.f5035g
            float[] r8 = r3.f5040l
            r16 = r14
            r14 = r11
            r17 = r8
            r12.getAnchorDpDt(r13, r14, r15, r16, r17)
            r14 = 1
            goto L_0x025b
        L_0x023d:
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f5043o
            int r8 = r8.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f5043o
            int r12 = r12.getHeight()
            int r8 = java.lang.Math.min(r8, r12)
            float r8 = (float) r8
            float[] r12 = r3.f5040l
            float r13 = r3.f5038j
            float r13 = r13 * r8
            r14 = 1
            r12[r14] = r13
            float r13 = r3.f5037i
            float r8 = r8 * r13
            r12[r6] = r8
        L_0x025b:
            float r8 = r3.f5037i
            float[] r12 = r3.f5040l
            r13 = r12[r6]
            float r8 = r8 * r13
            float r13 = r3.f5038j
            r12 = r12[r14]
            float r13 = r13 * r12
            float r13 = r13 + r8
            float r8 = r3.f5047s
            float r13 = r13 * r8
            float r8 = java.lang.Math.abs(r13)
            double r12 = (double) r8
            r14 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x0284
            float[] r8 = r3.f5040l
            r12 = 1008981770(0x3c23d70a, float:0.01)
            r8[r6] = r12
            r13 = 1
            r8[r13] = r12
            goto L_0x0285
        L_0x0284:
            r13 = 1
        L_0x0285:
            float r8 = r3.f5037i
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0292
            float[] r5 = r3.f5040l
            r5 = r5[r6]
            float r10 = r10 / r5
            goto L_0x0298
        L_0x0292:
            float[] r8 = r3.f5040l
            r8 = r8[r13]
            float r10 = r5 / r8
        L_0x0298:
            float r11 = r11 + r10
            float r5 = java.lang.Math.min(r11, r7)
            r7 = 0
            float r5 = java.lang.Math.max(r5, r7)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f5043o
            float r7 = r7.getProgress()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x02e5
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f5043o
            r7.setProgress(r5)
            android.view.VelocityTracker r5 = r4.f4788a
            if (r5 == 0) goto L_0x02b8
            r5.computeCurrentVelocity(r9)
        L_0x02b8:
            android.view.VelocityTracker r5 = r4.f4788a
            if (r5 == 0) goto L_0x02c1
            float r5 = r5.getXVelocity()
            goto L_0x02c2
        L_0x02c1:
            r5 = 0
        L_0x02c2:
            android.view.VelocityTracker r4 = r4.f4788a
            if (r4 == 0) goto L_0x02cb
            float r4 = r4.getYVelocity()
            goto L_0x02cc
        L_0x02cb:
            r4 = 0
        L_0x02cc:
            float r7 = r3.f5037i
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x02d9
            float[] r4 = r3.f5040l
            r4 = r4[r6]
            float r5 = r5 / r4
            goto L_0x02e0
        L_0x02d9:
            float[] r5 = r3.f5040l
            r6 = 1
            r5 = r5[r6]
            float r5 = r4 / r5
        L_0x02e0:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f5043o
            r4.mLastVelocity = r5
            goto L_0x02ea
        L_0x02e5:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f5043o
            r5 = 0
            r4.mLastVelocity = r5
        L_0x02ea:
            float r4 = r20.getRawX()
            r3.f5041m = r4
            float r4 = r20.getRawY()
            r3.f5042n = r4
            goto L_0x03b7
        L_0x02f8:
            r3.f5039k = r6
            android.view.VelocityTracker r5 = r4.f4788a
            if (r5 == 0) goto L_0x0301
            r5.computeCurrentVelocity(r9)
        L_0x0301:
            android.view.VelocityTracker r5 = r4.f4788a
            if (r5 == 0) goto L_0x030a
            float r5 = r5.getXVelocity()
            goto L_0x030b
        L_0x030a:
            r5 = 0
        L_0x030b:
            android.view.VelocityTracker r4 = r4.f4788a
            if (r4 == 0) goto L_0x0314
            float r4 = r4.getYVelocity()
            goto L_0x0315
        L_0x0314:
            r4 = 0
        L_0x0315:
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f5043o
            float r8 = r8.getProgress()
            int r10 = r3.f5032d
            r9 = -1
            if (r10 == r9) goto L_0x032e
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f5043o
            float r12 = r3.f5036h
            float r13 = r3.f5035g
            float[] r14 = r3.f5040l
            r11 = r8
            r9.getAnchorDpDt(r10, r11, r12, r13, r14)
            r12 = 1
            goto L_0x034c
        L_0x032e:
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f5043o
            int r9 = r9.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f5043o
            int r10 = r10.getHeight()
            int r9 = java.lang.Math.min(r9, r10)
            float r9 = (float) r9
            float[] r10 = r3.f5040l
            float r11 = r3.f5038j
            float r11 = r11 * r9
            r12 = 1
            r10[r12] = r11
            float r11 = r3.f5037i
            float r9 = r9 * r11
            r10[r6] = r9
        L_0x034c:
            float r9 = r3.f5037i
            float[] r10 = r3.f5040l
            r6 = r10[r6]
            r10 = r10[r12]
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x035b
            float r5 = r5 / r6
            goto L_0x035d
        L_0x035b:
            float r5 = r4 / r10
        L_0x035d:
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 != 0) goto L_0x0369
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r5 / r4
            float r4 = r4 + r8
            goto L_0x036a
        L_0x0369:
            r4 = r8
        L_0x036a:
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0398
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0398
            int r6 = r3.f5031c
            r9 = 3
            if (r6 == r9) goto L_0x0398
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f5043o
            double r10 = (double) r4
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0383
            r4 = 0
            goto L_0x0384
        L_0x0383:
            r4 = r7
        L_0x0384:
            r9.touchAnimateTo(r6, r4, r5)
            r4 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0390
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x03b7
        L_0x0390:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f5043o
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x03b7
        L_0x0398:
            r5 = 0
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x03a1
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x03b7
        L_0x03a1:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f5043o
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x03b7
        L_0x03a9:
            float r4 = r20.getRawX()
            r3.f5041m = r4
            float r4 = r20.getRawY()
            r3.f5042n = r4
            r3.f5039k = r6
        L_0x03b7:
            float r3 = r20.getRawX()
            r2.f4979r = r3
            float r3 = r20.getRawY()
            r2.f4980s = r3
            int r1 = r20.getAction()
            r3 = 1
            if (r1 != r3) goto L_0x03e8
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = r2.f4977p
            if (r1 == 0) goto L_0x01c6
            androidx.constraintlayout.motion.widget.MotionLayout$g r1 = (androidx.constraintlayout.motion.widget.MotionLayout.C2111g) r1
            android.view.VelocityTracker r3 = r1.f4788a
            if (r3 == 0) goto L_0x03db
            r3.recycle()
            r3 = 0
            r1.f4788a = r3
            goto L_0x03dc
        L_0x03db:
            r3 = 0
        L_0x03dc:
            r2.f4977p = r3
            int r1 = r0.mCurrentState
            r3 = -1
            if (r1 == r3) goto L_0x01c6
            r2.mo8161a(r0, r1)
            goto L_0x01c6
        L_0x03e8:
            r1 = r3
        L_0x03e9:
            return r1
        L_0x03ea:
            boolean r1 = super.onTouchEvent(r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new ArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.mo8133e();
        invalidate();
    }

    public boolean removeTransitionListener(C2113i iVar) {
        ArrayList<C2113i> arrayList = this.mTransitionListeners;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(iVar);
    }

    public void requestLayout() {
        C2150q qVar;
        C2150q.C2152b bVar;
        if (this.mMeasureDuringTransition || this.mCurrentState != -1 || (qVar = this.mScene) == null || (bVar = qVar.f4964c) == null || bVar.f4998q != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator d = this.mScene.mo8164d();
            if (d != null) {
                setProgress(d.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new C2112h();
            }
            C2112h hVar = this.mStateCache;
            hVar.f4789a = f;
            hVar.f4790b = f2;
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f2;
        animateTo(1.0f);
    }

    public void setScene(C2150q qVar) {
        C2186v vVar;
        this.mScene = qVar;
        boolean isRtl = isRtl();
        qVar.f4978q = isRtl;
        C2150q.C2152b bVar = qVar.f4964c;
        if (!(bVar == null || (vVar = bVar.f4993l) == null)) {
            vVar.mo8192b(isRtl);
        }
        rebuildScene();
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.mCurrentState != -1) {
            TransitionState transitionState3 = this.mTransitionState;
            this.mTransitionState = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                fireTransitionChange();
            }
            int i = C2106b.f4761a[transitionState3.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == transitionState4) {
                    fireTransitionChange();
                }
                if (transitionState == transitionState2) {
                    fireTransitionCompleted();
                }
            } else if (i == 3 && transitionState == transitionState2) {
                fireTransitionCompleted();
            }
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new C2112h();
            }
            C2112h hVar = this.mStateCache;
            hVar.f4791c = i;
            hVar.f4792d = i2;
            return;
        }
        C2150q qVar = this.mScene;
        if (qVar != null) {
            this.mBeginState = i;
            this.mEndState = i2;
            qVar.mo8173m(i, i2);
            this.mModel.mo8132d(this.mScene.mo8162b(i), this.mScene.mo8162b(i2));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i) {
        C2150q qVar = this.mScene;
        if (qVar == null) {
            Log.e(TAG, "MotionScene not defined");
            return;
        }
        C2150q.C2152b bVar = qVar.f4964c;
        if (bVar != null) {
            bVar.f4989h = i;
        } else {
            qVar.f4972k = i;
        }
    }

    public void setTransitionListener(C2113i iVar) {
        this.mTransitionListener = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new C2112h();
        }
        C2112h hVar = this.mStateCache;
        hVar.getClass();
        hVar.f4789a = bundle.getFloat("motion.progress");
        hVar.f4790b = bundle.getFloat("motion.velocity");
        hVar.f4791c = bundle.getInt("motion.StartState");
        hVar.f4792d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.mStateCache.mo8135a();
        }
    }

    public String toString() {
        Context context = getContext();
        return C2114a.m4566b(context, this.mBeginState) + "->" + C2114a.m4566b(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    public void touchAnimateTo(int i, float f, float f2) {
        C2186v vVar;
        C2186v vVar2;
        if (this.mScene != null && this.mTransitionLastPosition != f) {
            this.mTemporalInterpolator = true;
            this.mAnimationStartTime = getNanoTime();
            C2150q qVar = this.mScene;
            C2150q.C2152b bVar = qVar.f4964c;
            float f3 = ((float) (bVar != null ? bVar.f4989h : qVar.f4972k)) / 1000.0f;
            this.mTransitionDuration = f3;
            this.mTransitionGoalPosition = f;
            this.mInTransition = true;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f = 0.0f;
                } else if (i == 2) {
                    f = 1.0f;
                }
                StopLogic stopLogic = this.mStopLogic;
                float f4 = this.mTransitionLastPosition;
                float f5 = qVar.mo8166f();
                C2150q.C2152b bVar2 = this.mScene.f4964c;
                stopLogic.config(f4, f, f2, f3, f5, (bVar2 == null || (vVar = bVar2.f4993l) == null) ? 0.0f : vVar.f5044p);
                int i2 = this.mCurrentState;
                this.mTransitionGoalPosition = f;
                this.mCurrentState = i2;
                this.mInterpolator = this.mStopLogic;
            } else if (i == 4) {
                C2107c cVar = this.mDecelerateLogic;
                float f6 = this.mTransitionLastPosition;
                float f7 = qVar.mo8166f();
                cVar.f4762a = f2;
                cVar.f4763b = f6;
                cVar.f4764c = f7;
                this.mInterpolator = this.mDecelerateLogic;
            } else if (i == 5) {
                if (willJump(f2, this.mTransitionLastPosition, qVar.mo8166f())) {
                    C2107c cVar2 = this.mDecelerateLogic;
                    float f8 = this.mTransitionLastPosition;
                    float f9 = this.mScene.mo8166f();
                    cVar2.f4762a = f2;
                    cVar2.f4763b = f8;
                    cVar2.f4764c = f9;
                    this.mInterpolator = this.mDecelerateLogic;
                } else {
                    StopLogic stopLogic2 = this.mStopLogic;
                    float f10 = this.mTransitionLastPosition;
                    float f11 = this.mTransitionDuration;
                    float f12 = this.mScene.mo8166f();
                    C2150q.C2152b bVar3 = this.mScene.f4964c;
                    stopLogic2.config(f10, f, f2, f11, f12, (bVar3 == null || (vVar2 = bVar3.f4993l) == null) ? 0.0f : vVar2.f5044p);
                    this.mLastVelocity = 0.0f;
                    int i3 = this.mCurrentState;
                    this.mTransitionGoalPosition = f;
                    this.mCurrentState = i3;
                    this.mInterpolator = this.mStopLogic;
                }
            }
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
    }

    public void transitionToEnd() {
        animateTo(1.0f);
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new C2112h();
            }
            this.mStateCache.f4792d = i;
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void updateState(int i, C2236a aVar) {
        C2150q qVar = this.mScene;
        if (qVar != null) {
            qVar.f4969h.put(i, aVar);
        }
        updateState();
        if (this.mCurrentState == i) {
            aVar.mo8484b(this);
        }
    }

    public void transitionToState(int i, int i2, int i3) {
        int i4;
        C7714d dVar;
        C2150q qVar = this.mScene;
        if (!(qVar == null || (dVar = qVar.f4963b) == null)) {
            int i5 = this.mCurrentState;
            float f = (float) i2;
            float f2 = (float) i3;
            C7714d.C7715a aVar = dVar.f17102b.get(i);
            if (aVar == null) {
                i5 = i;
            } else if (f != -1.0f && f2 != -1.0f) {
                Iterator<C7714d.C7716b> it = aVar.f17104b.iterator();
                C7714d.C7716b bVar = null;
                while (true) {
                    if (it.hasNext()) {
                        C7714d.C7716b next = it.next();
                        if (next.mo20183a(f, f2)) {
                            if (i5 == next.f17110e) {
                                break;
                            }
                            bVar = next;
                        }
                    } else {
                        i5 = bVar != null ? bVar.f17110e : aVar.f17105c;
                    }
                }
            } else if (aVar.f17105c != i5) {
                Iterator<C7714d.C7716b> it2 = aVar.f17104b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (i5 == it2.next().f17110e) {
                            break;
                        }
                    } else {
                        i5 = aVar.f17105c;
                        break;
                    }
                }
            }
            if (i5 != -1) {
                i = i5;
            }
        }
        int i6 = this.mCurrentState;
        if (i6 != i) {
            if (this.mBeginState == i) {
                animateTo(0.0f);
            } else if (this.mEndState == i) {
                animateTo(1.0f);
            } else {
                this.mEndState = i;
                if (i6 != -1) {
                    setTransition(i6, i);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    return;
                }
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mTransitionLastTime = getNanoTime();
                this.mAnimationStartTime = getNanoTime();
                this.mTransitionInstantly = false;
                this.mInterpolator = null;
                C2150q qVar2 = this.mScene;
                C2150q.C2152b bVar2 = qVar2.f4964c;
                if (bVar2 != null) {
                    i4 = bVar2.f4989h;
                } else {
                    i4 = qVar2.f4972k;
                }
                this.mTransitionDuration = ((float) i4) / 1000.0f;
                this.mBeginState = -1;
                qVar2.mo8173m(-1, this.mEndState);
                this.mScene.mo8167g();
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    this.mFrameArrayList.put(childAt, new C2148o(childAt));
                }
                this.mInTransition = true;
                this.mModel.mo8132d((C2236a) null, this.mScene.mo8162b(i));
                rebuildScene();
                this.mModel.mo8131a();
                computeCurrentPositions();
                int width = getWidth();
                int height = getHeight();
                for (int i8 = 0; i8 < childCount; i8++) {
                    C2148o oVar = this.mFrameArrayList.get(getChildAt(i8));
                    this.mScene.mo8165e(oVar);
                    oVar.mo8156e(width, height, getNanoTime());
                }
                C2150q.C2152b bVar3 = this.mScene.f4964c;
                float f3 = bVar3 != null ? bVar3.f4990i : 0.0f;
                if (f3 != 0.0f) {
                    float f4 = Float.MAX_VALUE;
                    float f5 = -3.4028235E38f;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C2149p pVar = this.mFrameArrayList.get(getChildAt(i9)).f4925e;
                        float f6 = pVar.f4953g + pVar.f4952f;
                        f4 = Math.min(f4, f6);
                        f5 = Math.max(f5, f6);
                    }
                    for (int i10 = 0; i10 < childCount; i10++) {
                        C2148o oVar2 = this.mFrameArrayList.get(getChildAt(i10));
                        C2149p pVar2 = oVar2.f4925e;
                        float f7 = pVar2.f4952f;
                        float f8 = pVar2.f4953g;
                        oVar2.f4932l = 1.0f / (1.0f - f3);
                        oVar2.f4931k = f3 - ((((f7 + f8) - f4) * f3) / (f5 - f4));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    public void updateState() {
        this.mModel.mo8132d(this.mScene.mo8162b(this.mBeginState), this.mScene.mo8162b(this.mEndState));
        rebuildScene();
    }

    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        C7709a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo20178b(i, (float) i2, (float) i3);
            return;
        }
        C2150q qVar = this.mScene;
        if (qVar != null) {
            qVar.mo8162b(i).mo8484b(this);
        }
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w(TAG, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new C2112h();
            }
            this.mStateCache.f4789a = f;
            return;
        }
        if (i <= 0) {
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene != null) {
            this.mTransitionInstantly = true;
            this.mTransitionGoalPosition = f;
            this.mTransitionPosition = f;
            this.mTransitionLastTime = -1;
            this.mAnimationStartTime = -1;
            this.mInterpolator = null;
            this.mInTransition = true;
            invalidate();
        }
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            C2150q.C2152b transition = getTransition(i);
            this.mBeginState = transition.f4985d;
            this.mEndState = transition.f4984c;
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new C2112h();
                }
                C2112h hVar = this.mStateCache;
                hVar.f4791c = this.mBeginState;
                hVar.f4792d = this.mEndState;
                return;
            }
            float f = Float.NaN;
            int i2 = this.mCurrentState;
            float f2 = 0.0f;
            if (i2 == this.mBeginState) {
                f = 0.0f;
            } else if (i2 == this.mEndState) {
                f = 1.0f;
            }
            C2150q qVar = this.mScene;
            qVar.f4964c = transition;
            C2186v vVar = transition.f4993l;
            if (vVar != null) {
                vVar.mo8192b(qVar.f4978q);
            }
            this.mModel.mo8132d(this.mScene.mo8162b(this.mBeginState), this.mScene.mo8162b(this.mEndState));
            rebuildScene();
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.mTransitionLastPosition = f2;
            if (Float.isNaN(f)) {
                C2114a.m4565a();
                transitionToStart();
                return;
            }
            setProgress(f);
        }
    }

    private void checkStructure(int i, C2236a aVar) {
        String b = C2114a.m4566b(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder l = C0023f.m111l("CHECK: ", b, " ALL VIEWS SHOULD HAVE ID's ");
                l.append(childAt.getClass().getName());
                l.append(" does not!");
                Log.w(TAG, l.toString());
            }
            if ((aVar.f5375c.containsKey(Integer.valueOf(id)) ? aVar.f5375c.get(Integer.valueOf(id)) : null) == null) {
                StringBuilder l2 = C0023f.m111l("CHECK: ", b, " NO CONSTRAINTS for ");
                l2.append(C2114a.m4567c(childAt));
                Log.w(TAG, l2.toString());
            }
        }
        Integer[] numArr = (Integer[]) aVar.f5375c.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = numArr[i3].intValue();
        }
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            String b2 = C2114a.m4566b(getContext(), i5);
            if (findViewById(iArr[i4]) == null) {
                Log.w(TAG, "CHECK: " + b + " NO View matches id " + b2);
            }
            if (aVar.mo8490j(i5).f5379d.f5415d == -1) {
                Log.w(TAG, C0048b.m164c("CHECK: ", b, "(", b2, ") no LAYOUT_HEIGHT"));
            }
            if (aVar.mo8490j(i5).f5379d.f5413c == -1) {
                Log.w(TAG, C0048b.m164c("CHECK: ", b, "(", b2, ") no LAYOUT_HEIGHT"));
            }
        }
    }

    public void setTransition(C2150q.C2152b bVar) {
        int i;
        long j;
        C2186v vVar;
        C2150q qVar = this.mScene;
        qVar.f4964c = bVar;
        if (!(bVar == null || (vVar = bVar.f4993l) == null)) {
            vVar.mo8192b(qVar.f4978q);
        }
        setState(TransitionState.SETUP);
        int i2 = this.mCurrentState;
        C2150q.C2152b bVar2 = this.mScene.f4964c;
        int i3 = -1;
        if (bVar2 == null) {
            i = -1;
        } else {
            i = bVar2.f4984c;
        }
        if (i2 == i) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        boolean z = true;
        if ((bVar.f4999r & 1) == 0) {
            z = false;
        }
        if (z) {
            j = -1;
        } else {
            j = getNanoTime();
        }
        this.mTransitionLastTime = j;
        int g = this.mScene.mo8167g();
        C2150q qVar2 = this.mScene;
        C2150q.C2152b bVar3 = qVar2.f4964c;
        if (bVar3 != null) {
            i3 = bVar3.f4984c;
        }
        if (g != this.mBeginState || i3 != this.mEndState) {
            this.mBeginState = g;
            this.mEndState = i3;
            qVar2.mo8173m(g, i3);
            this.mModel.mo8132d(this.mScene.mo8162b(this.mBeginState), this.mScene.mo8162b(this.mEndState));
            C2109e eVar = this.mModel;
            int i4 = this.mBeginState;
            int i5 = this.mEndState;
            eVar.f4784e = i4;
            eVar.f4785f = i5;
            eVar.mo8133e();
            rebuildScene();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    private void checkStructure(C2150q.C2152b bVar) {
        Context context = getContext();
        if (bVar.f4985d != -1) {
            context.getResources().getResourceEntryName(bVar.f4985d);
        }
        if (bVar.f4984c != -1) {
            context.getResources().getResourceEntryName(bVar.f4984c);
        }
        if (bVar.f4985d == bVar.f4984c) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
