package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p610kp.C18161c;

class ClockHandView extends View {

    /* renamed from: s */
    public static final /* synthetic */ int f34847s = 0;

    /* renamed from: b */
    public ValueAnimator f34848b;

    /* renamed from: c */
    public boolean f34849c;

    /* renamed from: d */
    public float f34850d;

    /* renamed from: e */
    public float f34851e;

    /* renamed from: f */
    public boolean f34852f;

    /* renamed from: g */
    public int f34853g;

    /* renamed from: h */
    public final ArrayList f34854h = new ArrayList();

    /* renamed from: i */
    public final int f34855i;

    /* renamed from: j */
    public final float f34856j;

    /* renamed from: k */
    public final Paint f34857k;

    /* renamed from: l */
    public final RectF f34858l;

    /* renamed from: m */
    public final int f34859m;

    /* renamed from: n */
    public float f34860n;

    /* renamed from: o */
    public boolean f34861o;

    /* renamed from: p */
    public C15514c f34862p;

    /* renamed from: q */
    public double f34863q;

    /* renamed from: r */
    public int f34864r;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C15512a implements ValueAnimator.AnimatorUpdateListener {
        public C15512a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i = ClockHandView.f34847s;
            clockHandView.mo55148c(floatValue, true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C15513b extends AnimatorListenerAdapter {
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C15514c {
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C15515d {
        /* renamed from: d */
        void mo55143d(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f34857k = paint;
        this.f34858l = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39702o, R.attr.materialClockStyle, 2132018664);
        this.f34864r = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f34855i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f34859m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f34856j = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo55147b(0.0f, false);
        this.f34853g = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5229s(this, 2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int mo55146a(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: b */
    public final void mo55147b(float f, boolean z) {
        ValueAnimator valueAnimator = this.f34848b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            mo55148c(f, false);
            return;
        }
        float f2 = this.f34860n;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
        this.f34848b = ofFloat;
        ofFloat.setDuration(200);
        this.f34848b.addUpdateListener(new C15512a());
        this.f34848b.addListener(new C15513b());
        this.f34848b.start();
    }

    /* renamed from: c */
    public final void mo55148c(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f34860n = f2;
        this.f34863q = Math.toRadians((double) (f2 - 90.0f));
        float cos = (((float) this.f34864r) * ((float) Math.cos(this.f34863q))) + ((float) (getWidth() / 2));
        float sin = (((float) this.f34864r) * ((float) Math.sin(this.f34863q))) + ((float) (getHeight() / 2));
        RectF rectF = this.f34858l;
        float f3 = (float) this.f34855i;
        rectF.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f34854h.iterator();
        while (it.hasNext()) {
            ((C15515d) it.next()).mo55143d(f2, z);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f34857k.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f34864r) * ((float) Math.cos(this.f34863q))) + f, (((float) this.f34864r) * ((float) Math.sin(this.f34863q))) + f2, (float) this.f34855i, this.f34857k);
        double sin = Math.sin(this.f34863q);
        double cos = Math.cos(this.f34863q);
        double d = (double) ((float) (this.f34864r - this.f34855i));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f34857k.setStrokeWidth((float) this.f34859m);
        canvas.drawLine(f, f2, f3, f4, this.f34857k);
        canvas.drawCircle(f, f2, this.f34856j, this.f34857k);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo55147b(this.f34860n, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            float r1 = r10.getX()
            float r10 = r10.getY()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r3) goto L_0x0019
            r4 = 2
            if (r0 == r4) goto L_0x0019
            r0 = r2
            r4 = r0
            r5 = r4
            goto L_0x0043
        L_0x0019:
            float r4 = r9.f34850d
            float r4 = r1 - r4
            int r4 = (int) r4
            float r5 = r9.f34851e
            float r5 = r10 - r5
            int r5 = (int) r5
            int r4 = r4 * r4
            int r5 = r5 * r5
            int r5 = r5 + r4
            int r4 = r9.f34853g
            if (r5 <= r4) goto L_0x002c
            r4 = r3
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            r9.f34852f = r4
            boolean r4 = r9.f34861o
            if (r0 != r3) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            r5 = r2
            goto L_0x0043
        L_0x0038:
            r9.f34850d = r1
            r9.f34851e = r10
            r9.f34852f = r3
            r9.f34861o = r2
            r0 = r2
            r4 = r0
            r5 = r3
        L_0x0043:
            boolean r6 = r9.f34861o
            int r7 = r9.mo55146a(r1, r10)
            float r8 = r9.f34860n
            float r7 = (float) r7
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0052
            r8 = r3
            goto L_0x0053
        L_0x0052:
            r8 = r2
        L_0x0053:
            if (r5 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            goto L_0x006b
        L_0x0058:
            if (r8 != 0) goto L_0x005f
            if (r4 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r4 = r2
            goto L_0x006c
        L_0x005f:
            if (r0 == 0) goto L_0x0067
            boolean r4 = r9.f34849c
            if (r4 == 0) goto L_0x0067
            r4 = r3
            goto L_0x0068
        L_0x0067:
            r4 = r2
        L_0x0068:
            r9.mo55147b(r7, r4)
        L_0x006b:
            r4 = r3
        L_0x006c:
            r4 = r4 | r6
            r9.f34861o = r4
            if (r4 == 0) goto L_0x00ef
            if (r0 == 0) goto L_0x00ef
            com.google.android.material.timepicker.ClockHandView$c r0 = r9.f34862p
            if (r0 == 0) goto L_0x00ef
            int r10 = r9.mo55146a(r1, r10)
            float r10 = (float) r10
            boolean r1 = r9.f34852f
            com.google.android.material.timepicker.d r0 = (com.google.android.material.timepicker.C15530d) r0
            r0.f34899f = r3
            com.google.android.material.timepicker.TimeModel r4 = r0.f34896c
            int r5 = r4.f34873f
            int r6 = r4.f34872e
            int r4 = r4.f34874g
            r7 = 10
            if (r4 != r7) goto L_0x00b3
            com.google.android.material.timepicker.TimePickerView r10 = r0.f34895b
            float r1 = r0.f34898e
            com.google.android.material.timepicker.ClockHandView r10 = r10.f34878d
            r10.mo55147b(r1, r2)
            com.google.android.material.timepicker.TimePickerView r10 = r0.f34895b
            android.content.Context r10 = r10.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r4 = p260v0.C8184a.f17966a
            java.lang.Object r10 = p260v0.C8184a.C8188d.m16469b(r10, r1)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            boolean r10 = r10.isTouchExplorationEnabled()
            if (r10 != 0) goto L_0x00da
            r10 = 12
            r0.mo55195f(r10, r3)
            goto L_0x00da
        L_0x00b3:
            int r10 = java.lang.Math.round(r10)
            if (r1 != 0) goto L_0x00d1
            int r10 = r10 + 15
            int r10 = r10 / 30
            com.google.android.material.timepicker.TimeModel r4 = r0.f34896c
            int r10 = r10 * 5
            r4.getClass()
            int r10 = r10 % 60
            r4.f34873f = r10
            com.google.android.material.timepicker.TimeModel r10 = r0.f34896c
            int r10 = r10.f34873f
            int r10 = r10 * 6
            float r10 = (float) r10
            r0.f34897d = r10
        L_0x00d1:
            com.google.android.material.timepicker.TimePickerView r10 = r0.f34895b
            float r4 = r0.f34897d
            com.google.android.material.timepicker.ClockHandView r10 = r10.f34878d
            r10.mo55147b(r4, r1)
        L_0x00da:
            r0.f34899f = r2
            r0.mo55196g()
            com.google.android.material.timepicker.TimeModel r10 = r0.f34896c
            int r1 = r10.f34873f
            if (r1 != r5) goto L_0x00e9
            int r10 = r10.f34872e
            if (r10 == r6) goto L_0x00ef
        L_0x00e9:
            r10 = 4
            com.google.android.material.timepicker.TimePickerView r0 = r0.f34895b
            r0.performHapticFeedback(r10)
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
