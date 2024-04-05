package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p088e1.C6689b;
import p260v0.C8184a;
import p507al.C14025c;
import p610kp.C18161c;

class ClockFaceView extends C15528c implements ClockHandView.C15515d {

    /* renamed from: e */
    public final ClockHandView f34831e;

    /* renamed from: f */
    public final Rect f34832f;

    /* renamed from: g */
    public final RectF f34833g;

    /* renamed from: h */
    public final SparseArray<TextView> f34834h;

    /* renamed from: i */
    public final C15511b f34835i;

    /* renamed from: j */
    public final int[] f34836j;

    /* renamed from: k */
    public final float[] f34837k;

    /* renamed from: l */
    public final int f34838l;

    /* renamed from: m */
    public final int f34839m;

    /* renamed from: n */
    public final int f34840n;

    /* renamed from: o */
    public final int f34841o;

    /* renamed from: p */
    public String[] f34842p;

    /* renamed from: q */
    public float f34843q;

    /* renamed from: r */
    public final ColorStateList f34844r;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class C15510a implements ViewTreeObserver.OnPreDrawListener {
        public C15510a() {
        }

        public final boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView clockFaceView = ClockFaceView.this;
            int height = ((ClockFaceView.this.getHeight() / 2) - clockFaceView.f34831e.f34855i) - clockFaceView.f34838l;
            if (height != clockFaceView.f34889c) {
                clockFaceView.f34889c = height;
                clockFaceView.mo55188a();
                ClockHandView clockHandView = clockFaceView.f34831e;
                clockHandView.f34864r = clockFaceView.f34889c;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C15511b extends C2273a {
        public C15511b() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                bVar.f14759a.setTraversalAfter(ClockFaceView.this.f34834h.get(intValue - 1));
            }
            bVar.mo18869s(C6689b.C6692c.m13082a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo55141b() {
        RectF rectF = this.f34831e.f34858l;
        for (int i = 0; i < this.f34834h.size(); i++) {
            TextView textView = this.f34834h.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f34832f);
                this.f34832f.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f34832f);
                this.f34833g.set(this.f34832f);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f34833g) ? null : new RadialGradient(rectF.centerX() - this.f34833g.left, rectF.centerY() - this.f34833g.top, 0.5f * rectF.width(), this.f34836j, this.f34837k, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    /* renamed from: c */
    public final void mo55142c(int i, String[] strArr) {
        this.f34842p = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f34834h.size();
        for (int i2 = 0; i2 < Math.max(this.f34842p.length, size); i2++) {
            TextView textView = this.f34834h.get(i2);
            if (i2 >= this.f34842p.length) {
                removeView(textView);
                this.f34834h.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.f34834h.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f34842p[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                C2364y.m5201p(textView, this.f34835i);
                textView.setTextColor(this.f34844r);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f34842p[i2]}));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo55143d(float f, boolean z) {
        if (Math.abs(this.f34843q - f) > 0.001f) {
            this.f34843q = f;
            mo55141b();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6689b.C6691b.m13081a(1, this.f34842p.length, 1).f14782a);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo55141b();
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f34841o) / Math.max(Math.max(((float) this.f34839m) / ((float) displayMetrics.heightPixels), ((float) this.f34840n) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f34832f = new Rect();
        this.f34833g = new RectF();
        this.f34834h = new SparseArray<>();
        this.f34837k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39700n, R.attr.materialClockStyle, 2132018664);
        Resources resources = getResources();
        ColorStateList a = C14025c.m21582a(context, obtainStyledAttributes, 1);
        this.f34844r = a;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f34831e = clockHandView;
        this.f34838l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f34836j = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.f34854h.add(this);
        int defaultColor = C8184a.m16459b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = C14025c.m21582a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C15510a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f34835i = new C15511b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo55142c(0, strArr);
        this.f34839m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f34840n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f34841o = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
