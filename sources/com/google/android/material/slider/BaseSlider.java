package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.compose.p015ui.platform.C1830f0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.google.android.gms.common.api.Api;
import com.google.android.material.internal.C15345b;
import com.google.android.material.internal.C15367g;
import com.google.android.material.internal.C15370j;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.C15423a;
import com.google.android.material.slider.C15424b;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p003a2.C0023f;
import p088e1.C6689b;
import p123h1.C6909a;
import p260v0.C8184a;
import p507al.C14025c;
import p574gl.C17790a;
import p610kp.C18161c;
import p629nk.C18268a;

public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C15423a<S>, T extends C15424b<S>> extends View {
    public static final int DEF_STYLE_RES = 2132018642;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final long LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final long LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String TAG = BaseSlider.class.getSimpleName();
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final int UNIT_PX = 0;
    public static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private BaseSlider<S, L, T>.d accessibilityEventSender;
    /* access modifiers changed from: private */
    public final C15420e accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List<L> changeListeners;
    private int defaultThumbRadius;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private C15425c formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private final C15421f labelMaker;
    private int labelPadding;
    /* access modifiers changed from: private */
    public final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTrackSidePadding;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private final MaterialShapeDrawable thumbDrawable;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List<T> touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackTop;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C15415a();

        /* renamed from: b */
        public float f34633b;

        /* renamed from: c */
        public float f34634c;

        /* renamed from: d */
        public ArrayList<Float> f34635d;

        /* renamed from: e */
        public float f34636e;

        /* renamed from: f */
        public boolean f34637f;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        public static class C15415a implements Parcelable.Creator<SliderState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f34633b);
            parcel.writeFloat(this.f34634c);
            parcel.writeList(this.f34635d);
            parcel.writeFloat(this.f34636e);
            parcel.writeBooleanArray(new boolean[]{this.f34637f});
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f34633b = parcel.readFloat();
            this.f34634c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f34635d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f34636e = parcel.readFloat();
            this.f34637f = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C15416a implements C15421f {

        /* renamed from: a */
        public final /* synthetic */ AttributeSet f34638a;

        /* renamed from: b */
        public final /* synthetic */ int f34639b;

        public C15416a(AttributeSet attributeSet, int i) {
            this.f34638a = attributeSet;
            this.f34639b = i;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    public class C15417b implements ValueAnimator.AnimatorUpdateListener {
        public C15417b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (TooltipDrawable revealFraction : BaseSlider.this.labels) {
                revealFraction.setRevealFraction(floatValue);
            }
            BaseSlider baseSlider = BaseSlider.this;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(baseSlider);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public class C15418c extends AnimatorListenerAdapter {
        public C15418c() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (TooltipDrawable tooltipDrawable : BaseSlider.this.labels) {
                ViewGroup c = C15370j.m24962c(BaseSlider.this);
                ((ViewOverlay) (c == null ? null : new C1830f0((View) c)).f4088a).remove(tooltipDrawable);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    public class C15419d implements Runnable {

        /* renamed from: b */
        public int f34643b = -1;

        public C15419d() {
        }

        public final void run() {
            BaseSlider.this.accessibilityHelper.mo19037o(this.f34643b, 4);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    public static class C15420e extends C6909a {

        /* renamed from: n */
        public final BaseSlider<?, ?, ?> f34645n;

        /* renamed from: o */
        public Rect f34646o = new Rect();

        public C15420e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f34645n = baseSlider;
        }

        /* renamed from: e */
        public final int mo19027e(float f, float f2) {
            for (int i = 0; i < this.f34645n.getValues().size(); i++) {
                this.f34645n.updateBoundsForVirturalViewId(i, this.f34646o);
                if (this.f34646o.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: f */
        public final void mo19028f(ArrayList arrayList) {
            for (int i = 0; i < this.f34645n.getValues().size(); i++) {
                arrayList.add(Integer.valueOf(i));
            }
        }

        /* renamed from: j */
        public final boolean mo19032j(int i, int i2, Bundle bundle) {
            if (!this.f34645n.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float access$800 = this.f34645n.calculateStepIncrement(20);
                if (i2 == 8192) {
                    access$800 = -access$800;
                }
                if (this.f34645n.isRtl()) {
                    access$800 = -access$800;
                }
                float floatValue = this.f34645n.getValues().get(i).floatValue() + access$800;
                float valueFrom = this.f34645n.getValueFrom();
                float valueTo = this.f34645n.getValueTo();
                if (floatValue < valueFrom) {
                    floatValue = valueFrom;
                } else if (floatValue > valueTo) {
                    floatValue = valueTo;
                }
                if (!this.f34645n.snapThumbToValue(i, floatValue)) {
                    return false;
                }
                this.f34645n.updateHaloHotspot();
                this.f34645n.postInvalidate();
                mo19029g(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.f34645n.snapThumbToValue(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.f34645n.updateHaloHotspot();
                    this.f34645n.postInvalidate();
                    mo19029g(i);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public final void mo19034l(int i, C6689b bVar) {
            bVar.mo18851b(C6689b.C6690a.f14777t);
            List<Float> values = this.f34645n.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f34645n.getValueFrom();
            float valueTo = this.f34645n.getValueTo();
            if (this.f34645n.isEnabled()) {
                if (floatValue > valueFrom) {
                    bVar.mo18850a(8192);
                }
                if (floatValue < valueTo) {
                    bVar.mo18850a(RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
            }
            AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
            AccessibilityNodeInfo.RangeInfo rangeInfo = obtain;
            bVar.f14759a.setRangeInfo(obtain);
            bVar.mo18867q(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f34645n.getContentDescription() != null) {
                sb.append(this.f34645n.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(i == this.f34645n.getValues().size() + -1 ? this.f34645n.getContext().getString(R.string.material_slider_range_end) : i == 0 ? this.f34645n.getContext().getString(R.string.material_slider_range_start) : "");
                sb.append(this.f34645n.formatValue(floatValue));
            }
            bVar.mo18870t(sb.toString());
            this.f34645n.updateBoundsForVirturalViewId(i, this.f34646o);
            bVar.mo18864n(this.f34646o);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    public interface C15421f {
    }

    public BaseSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(C15370j.m24962c(this));
    }

    private Float calculateIncrementForKey(int i) {
        float calculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i == 21) {
            if (!isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return Float.valueOf(calculateStepIncrement);
        } else if (i == 22) {
            if (isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return Float.valueOf(calculateStepIncrement);
        } else if (i == 69) {
            return Float.valueOf(-calculateStepIncrement);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(calculateStepIncrement);
            }
            return null;
        }
    }

    private float calculateStepIncrement() {
        float f = this.stepSize;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    private int calculateTop() {
        int i = this.trackTop;
        int i2 = 0;
        if (this.labelBehavior == 1) {
            i2 = this.labels.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    private ValueAnimator createLabelAnimator(boolean z) {
        float f = 0.0f;
        float animatorCurrentValueOrDefault = getAnimatorCurrentValueOrDefault(z ? this.labelsOutAnimator : this.labelsInAnimator, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{animatorCurrentValueOrDefault, f});
        ofFloat.setDuration(z ? LABEL_ANIMATION_ENTER_DURATION : LABEL_ANIMATION_EXIT_DURATION);
        ofFloat.setInterpolator(z ? C18268a.f40095e : C18268a.f40093c);
        ofFloat.addUpdateListener(new C15417b());
        return ofFloat;
    }

    private void createLabelPool() {
        int i;
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> subList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable next : subList) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2371g.m5245b(this)) {
                    detachLabelFromContentView(next);
                }
            }
            subList.clear();
        }
        while (true) {
            i = 0;
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            C15416a aVar = (C15416a) this.labelMaker;
            TypedArray d = C15367g.m24957d(BaseSlider.this.getContext(), aVar.f34638a, C18161c.f39682Z, aVar.f34639b, DEF_STYLE_RES, new int[0]);
            TooltipDrawable access$000 = parseLabelDrawable(BaseSlider.this.getContext(), d);
            d.recycle();
            this.labels.add(access$000);
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            if (C2364y.C2371g.m5245b(this)) {
                attachLabelToContentView(access$000);
            }
        }
        if (this.labels.size() != 1) {
            i = 1;
        }
        for (TooltipDrawable strokeWidth : this.labels) {
            strokeWidth.setStrokeWidth((float) i);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewGroup c = C15370j.m24962c(this);
        C1830f0 f0Var = c == null ? null : new C1830f0((View) c);
        if (f0Var != null) {
            ((ViewOverlay) f0Var.f4088a).remove(tooltipDrawable);
            tooltipDrawable.detachView(C15370j.m24962c(this));
        }
    }

    private float dimenToValue(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.trackSidePadding)) / ((float) this.trackWidth);
        float f3 = this.valueFrom;
        return C0023f.m103b(f3, this.valueTo, f2, f3);
    }

    private void dispatchOnChangedFromUser(int i) {
        for (L a : this.changeListeners) {
            this.values.get(i).floatValue();
            a.mo54729a();
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            scheduleAccessibilityEventSender(i);
        }
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                it.next().floatValue();
                l.mo54729a();
            }
        }
    }

    private void drawActiveTrack(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.trackSidePadding;
        float f = (float) i;
        float f2 = activeRange[1] * f;
        float f3 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine((activeRange[0] * f) + ((float) i3), f3, f2 + ((float) i3), f3, this.activeTrackPaint);
    }

    private void drawInactiveTrack(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.trackSidePadding;
        float f = (float) i;
        float f2 = (activeRange[1] * f) + ((float) i3);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.inactiveTrackPaint);
        }
        int i4 = this.trackSidePadding;
        float f4 = (activeRange[0] * f) + ((float) i4);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.inactiveTrackPaint);
        }
    }

    private void drawThumbs(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                canvas.drawCircle((normalizeValue(it.next().floatValue()) * ((float) i)) + ((float) this.trackSidePadding), (float) i2, (float) this.thumbRadius, this.thumbPaint);
            }
        }
        Iterator<Float> it2 = this.values.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(it2.next().floatValue()) * ((float) i)));
            int i3 = this.thumbRadius;
            canvas.translate((float) (normalizeValue - i3), (float) (i2 - i3));
            this.thumbDrawable.draw(canvas);
            canvas.restore();
        }
    }

    private void ensureLabelsAdded() {
        if (this.labelBehavior != 2) {
            if (!this.labelsAreAnimatedIn) {
                this.labelsAreAnimatedIn = true;
                ValueAnimator createLabelAnimator = createLabelAnimator(true);
                this.labelsInAnimator = createLabelAnimator;
                this.labelsOutAnimator = null;
                createLabelAnimator.start();
            }
            Iterator<TooltipDrawable> it = this.labels.iterator();
            for (int i = 0; i < this.values.size() && it.hasNext(); i++) {
                if (i != this.focusedThumbIdx) {
                    setValueForLabel(it.next(), this.values.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())}));
            }
        }
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator createLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = createLabelAnimator;
            this.labelsInAnimator = null;
            createLabelAnimator.addListener(new C15418c());
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i) {
        if (i == 1) {
            moveFocus(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else if (i == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i == 17) {
            moveFocusInAbsoluteDirection(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else if (i == 66) {
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: private */
    public String formatValue(float f) {
        if (hasLabelFormatter()) {
            return this.formatter.mo54732a();
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.values.size() == 1) {
            floatValue2 = this.valueFrom;
        }
        float normalizeValue = normalizeValue(floatValue2);
        float normalizeValue2 = normalizeValue(floatValue);
        if (isRtl()) {
            return new float[]{normalizeValue2, normalizeValue};
        }
        return new float[]{normalizeValue, normalizeValue2};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    private float getClampedValue(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        float floatValue = i2 >= this.values.size() ? this.valueTo : this.values.get(i2).floatValue() - minSeparation;
        int i3 = i - 1;
        float floatValue2 = i3 < 0 ? this.valueFrom : this.values.get(i3).floatValue() + minSeparation;
        return f < floatValue2 ? floatValue2 : f > floatValue ? floatValue : f;
    }

    private int getColorForState(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float getValueOfTouchPosition() {
        double snapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            snapPosition = 1.0d - snapPosition;
        }
        float f = this.valueTo;
        float f2 = this.valueFrom;
        return (float) ((snapPosition * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.touchPosition;
        if (isRtl()) {
            f = 1.0f - f;
        }
        float f2 = this.valueTo;
        float f3 = this.valueFrom;
        return C0023f.m103b(f2, f3, f, f3);
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth((float) this.trackHeight);
        this.activeTrackPaint.setStrokeWidth((float) this.trackHeight);
        this.inactiveTicksPaint.setStrokeWidth(((float) this.trackHeight) / 2.0f);
        this.activeTicksPaint.setStrokeWidth(((float) this.trackHeight) / 2.0f);
    }

    private boolean isInVerticalScrollingContainer() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    private boolean isMultipleOfStepSize(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < THRESHOLD;
    }

    private void loadResources(Resources resources) {
        this.widgetHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.trackTop = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_top);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    private void maybeCalculateTicksCoordinates() {
        if (this.stepSize > 0.0f) {
            validateConfigurationIfDirty();
            int min = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / (this.trackHeight * 2)) + 1);
            float[] fArr = this.ticksCoordinates;
            if (fArr == null || fArr.length != min * 2) {
                this.ticksCoordinates = new float[(min * 2)];
            }
            float f = ((float) this.trackWidth) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.ticksCoordinates;
                fArr2[i] = (((float) (i / 2)) * f) + ((float) this.trackSidePadding);
                fArr2[i + 1] = (float) calculateTop();
            }
        }
    }

    private void maybeDrawHalo(Canvas canvas, int i, int i2) {
        if (shouldDrawCompatHalo()) {
            int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * ((float) i)) + ((float) this.trackSidePadding));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.haloRadius;
                canvas.clipRect((float) (normalizeValue - i3), (float) (i2 - i3), (float) (normalizeValue + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) normalizeValue, (float) i2, (float) this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawTicks(Canvas canvas) {
        if (this.tickVisible && this.stepSize > 0.0f) {
            float[] activeRange = getActiveRange();
            int pivotIndex = pivotIndex(this.ticksCoordinates, activeRange[0]);
            int pivotIndex2 = pivotIndex(this.ticksCoordinates, activeRange[1]);
            int i = pivotIndex * 2;
            canvas.drawPoints(this.ticksCoordinates, 0, i, this.inactiveTicksPaint);
            int i2 = pivotIndex2 * 2;
            canvas.drawPoints(this.ticksCoordinates, i, i2 - i, this.activeTicksPaint);
            float[] fArr = this.ticksCoordinates;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.inactiveTicksPaint);
        }
    }

    private void maybeIncreaseTrackSidePadding() {
        this.trackSidePadding = this.minTrackSidePadding + Math.max(this.thumbRadius - this.defaultThumbRadius, 0);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2371g.m5246c(this)) {
            updateTrackWidth(getWidth());
        }
    }

    private boolean moveFocus(int i) {
        int i2 = this.focusedThumbIdx;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.values.size() - 1);
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.focusedThumbIdx = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = i3;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i) {
        if (isRtl()) {
            i = i == Integer.MIN_VALUE ? Api.BaseClientBuilder.API_PRIORITY_OTHER : -i;
        }
        return moveFocus(i);
    }

    private float normalizeValue(float f) {
        float f2 = this.valueFrom;
        float f3 = (f - f2) / (this.valueTo - f2);
        return isRtl() ? 1.0f - f3 : f3;
    }

    private Boolean onKeyDownNoActiveThumb(int i, KeyEvent keyEvent) {
        if (i == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(moveFocus(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(moveFocus(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    moveFocus(-1);
                    return Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            return Boolean.TRUE;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            moveFocus(1);
            return Boolean.TRUE;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void onStartTrackingTouch() {
        for (T b : this.touchListeners) {
            b.mo54731b();
        }
    }

    private void onStopTrackingTouch() {
        for (T a : this.touchListeners) {
            a.mo54730a();
        }
    }

    /* access modifiers changed from: private */
    public static TooltipDrawable parseLabelDrawable(Context context, TypedArray typedArray) {
        return TooltipDrawable.createFromAttributes(context, (AttributeSet) null, 0, typedArray.getResourceId(8, 2132018676));
    }

    private static int pivotIndex(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i) {
        TypedArray d = C15367g.m24957d(context, attributeSet, C18161c.f39682Z, i, DEF_STYLE_RES, new int[0]);
        this.valueFrom = d.getFloat(3, 0.0f);
        this.valueTo = d.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = d.getFloat(2, 0.0f);
        int i2 = 18;
        boolean hasValue = d.hasValue(18);
        int i3 = hasValue ? 18 : 20;
        if (!hasValue) {
            i2 = 19;
        }
        ColorStateList a = C14025c.m21582a(context, d, i3);
        if (a == null) {
            a = C8184a.m16459b(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a);
        ColorStateList a2 = C14025c.m21582a(context, d, i2);
        if (a2 == null) {
            a2 = C8184a.m16459b(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a2);
        this.thumbDrawable.setFillColor(C14025c.m21582a(context, d, 9));
        if (d.hasValue(12)) {
            setThumbStrokeColor(C14025c.m21582a(context, d, 12));
        }
        setThumbStrokeWidth(d.getDimension(13, 0.0f));
        ColorStateList a3 = C14025c.m21582a(context, d, 5);
        if (a3 == null) {
            a3 = C8184a.m16459b(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(a3);
        this.tickVisible = d.getBoolean(17, true);
        int i4 = 14;
        boolean hasValue2 = d.hasValue(14);
        int i5 = hasValue2 ? 14 : 16;
        if (!hasValue2) {
            i4 = 15;
        }
        ColorStateList a4 = C14025c.m21582a(context, d, i5);
        if (a4 == null) {
            a4 = C8184a.m16459b(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a4);
        ColorStateList a5 = C14025c.m21582a(context, d, i4);
        if (a5 == null) {
            a5 = C8184a.m16459b(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a5);
        setThumbRadius(d.getDimensionPixelSize(11, 0));
        setHaloRadius(d.getDimensionPixelSize(6, 0));
        setThumbElevation(d.getDimension(10, 0.0f));
        setTrackHeight(d.getDimensionPixelSize(21, 0));
        this.labelBehavior = d.getInt(7, 0);
        if (!d.getBoolean(0, true)) {
            setEnabled(false);
        }
        d.recycle();
    }

    private void scheduleAccessibilityEventSender(int i) {
        BaseSlider<S, L, T>.d dVar = this.accessibilityEventSender;
        if (dVar == null) {
            this.accessibilityEventSender = new C15419d();
        } else {
            removeCallbacks(dVar);
        }
        BaseSlider<S, L, T>.d dVar2 = this.accessibilityEventSender;
        dVar2.f34643b = i;
        postDelayed(dVar2, 200);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.setText(formatValue(f));
        int normalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f) * ((float) this.trackWidth)))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int calculateTop = calculateTop() - (this.labelPadding + this.thumbRadius);
        tooltipDrawable.setBounds(normalizeValue, calculateTop - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + normalizeValue, calculateTop);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        C15345b.m24943c(C15370j.m24962c(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewGroup c = C15370j.m24962c(this);
        ((ViewOverlay) (c == null ? null : new C1830f0((View) c)).f4088a).add(tooltipDrawable);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.values.size() != arrayList.size() || !this.values.equals(arrayList)) {
                this.values = arrayList;
                this.dirtyConfig = true;
                this.focusedThumbIdx = 0;
                updateHaloHotspot();
                createLabelPool();
                dispatchOnChangedProgrammatically();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable);
    }

    private boolean snapActiveThumbToValue(float f) {
        return snapThumbToValue(this.activeThumbIdx, f);
    }

    private double snapPosition(float f) {
        float f2 = this.stepSize;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i = (int) ((this.valueTo - this.valueFrom) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* access modifiers changed from: private */
    public boolean snapThumbToValue(int i, float f) {
        this.focusedThumbIdx = i;
        if (((double) Math.abs(f - this.values.get(i).floatValue())) < THRESHOLD) {
            return false;
        }
        this.values.set(i, Float.valueOf(getClampedValue(i, f)));
        dispatchOnChangedFromUser(i);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (!shouldDrawCompatHalo() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * ((float) this.trackWidth)) + ((float) this.trackSidePadding));
                int calculateTop = calculateTop();
                int i = this.haloRadius;
                background.setHotspotBounds(normalizeValue - i, calculateTop - i, normalizeValue + i, calculateTop + i);
            }
        }
    }

    private void updateTrackWidth(int i) {
        this.trackWidth = Math.max(i - (this.trackSidePadding * 2), 0);
        maybeCalculateTicksCoordinates();
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.stepSize;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.separationUnit != 1) {
                    throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT, new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.stepSize)}));
                } else if (minSeparation < f || !isMultipleOfStepSize(minSeparation)) {
                    throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE, new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.stepSize), Float.valueOf(this.stepSize)}));
                }
            }
        } else {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION, new Object[]{Float.valueOf(minSeparation)}));
        }
    }

    private void validateStepSize() {
        if (this.stepSize > 0.0f && !valueLandsOnTick(this.valueTo)) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, new Object[]{Float.valueOf(this.stepSize), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)}));
        }
    }

    private void validateValueFrom() {
        if (this.valueFrom >= this.valueTo) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_FROM, new Object[]{Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)}));
        }
    }

    private void validateValueTo() {
        if (this.valueTo <= this.valueFrom) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_TO, new Object[]{Float.valueOf(this.valueTo), Float.valueOf(this.valueFrom)}));
        }
    }

    private void validateValues() {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.valueFrom || next.floatValue() > this.valueTo) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE, new Object[]{next, Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)}));
            } else if (this.stepSize > 0.0f && !valueLandsOnTick(next.floatValue())) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, new Object[]{next, Float.valueOf(this.valueFrom), Float.valueOf(this.stepSize), Float.valueOf(this.stepSize)}));
            }
        }
    }

    private boolean valueLandsOnTick(float f) {
        return isMultipleOfStepSize(f - this.valueFrom);
    }

    private float valueToX(float f) {
        return (normalizeValue(f) * ((float) this.trackWidth)) + ((float) this.trackSidePadding);
    }

    private void warnAboutFloatingPointError() {
        float f = this.stepSize;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, new Object[]{"stepSize", Float.valueOf(f)}));
            }
            float f2 = this.valueFrom;
            if (((float) ((int) f2)) != f2) {
                Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, new Object[]{"valueFrom", Float.valueOf(f2)}));
            }
            float f3 = this.valueTo;
            if (((float) ((int) f3)) != f3) {
                Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, new Object[]{"valueTo", Float.valueOf(f3)}));
            }
        }
    }

    public void addOnChangeListener(L l) {
        this.changeListeners.add(l);
    }

    public void addOnSliderTouchListener(T t) {
        this.touchListeners.add(t);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.accessibilityHelper.mo19026d(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        for (TooltipDrawable next : this.labels) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.thumbDrawable.isStateful()) {
            this.thumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    public void forceDrawCompatHalo(boolean z) {
        this.forceDrawCompatHalo = z;
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.f15299h;
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    public int getHaloRadius() {
        return this.haloRadius;
    }

    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.thumbDrawable.getElevation();
    }

    public int getThumbRadius() {
        return this.thumbRadius;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.thumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.thumbDrawable.getStrokeWidth();
    }

    public ColorStateList getThumbTintList() {
        return this.thumbDrawable.getFillColor();
    }

    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    public int getTrackHeight() {
        return this.trackHeight;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public final boolean isRtl() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(this) == 1;
    }

    public boolean isTickVisible() {
        return this.tickVisible;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable attachLabelToContentView : this.labels) {
            attachLabelToContentView(attachLabelToContentView);
        }
    }

    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.accessibilityEventSender;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.labelsAreAnimatedIn = false;
        for (TooltipDrawable detachLabelFromContentView : this.labels) {
            detachLabelFromContentView(detachLabelFromContentView);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        int calculateTop = calculateTop();
        drawInactiveTrack(canvas, this.trackWidth, calculateTop);
        if (((Float) Collections.max(getValues())).floatValue() > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, calculateTop);
        }
        maybeDrawTicks(canvas);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawHalo(canvas, this.trackWidth, calculateTop);
            if (this.activeThumbIdx != -1) {
                ensureLabelsAdded();
            }
        }
        drawThumbs(canvas, this.trackWidth, calculateTop);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.activeThumbIdx = -1;
            ensureLabelsRemoved();
            this.accessibilityHelper.mo19023a(this.focusedThumbIdx);
            return;
        }
        focusThumbOnFocusGained(i);
        this.accessibilityHelper.mo19036n(this.focusedThumbIdx);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean onKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i, keyEvent);
            return onKeyDownNoActiveThumb != null ? onKeyDownNoActiveThumb.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float calculateIncrementForKey = calculateIncrementForKey(i);
        if (calculateIncrementForKey != null) {
            if (snapActiveThumbToValue(calculateIncrementForKey.floatValue() + this.values.get(this.activeThumbIdx).floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return moveFocus(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
        }
        this.activeThumbIdx = -1;
        ensureLabelsRemoved();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i, keyEvent);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.widgetHeight;
        int i4 = 0;
        if (this.labelBehavior == 1) {
            i4 = this.labels.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.f34633b;
        this.valueTo = sliderState.f34634c;
        setValuesInternal(sliderState.f34635d);
        this.stepSize = sliderState.f34636e;
        if (sliderState.f34637f) {
            requestFocus();
        }
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f34633b = this.valueFrom;
        sliderState.f34634c = this.valueTo;
        sliderState.f34635d = new ArrayList<>(this.values);
        sliderState.f34636e = this.stepSize;
        sliderState.f34637f = hasFocus();
        return sliderState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        updateTrackWidth(i);
        updateHaloHotspot();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.trackSidePadding)) / ((float) this.trackWidth);
        this.touchPosition = f;
        float max = Math.max(0.0f, f);
        this.touchPosition = max;
        this.touchPosition = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownX = x;
            if (!isInVerticalScrollingContainer()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        } else if (actionMasked == 1) {
            this.thumbIsPressed = false;
            MotionEvent motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= ((float) this.scaledTouchSlop) && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= ((float) this.scaledTouchSlop) && pickActiveThumb()) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            ensureLabelsRemoved();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.thumbIsPressed) {
                if (isInVerticalScrollingContainer() && Math.abs(x - this.touchDownX) < ((float) this.scaledTouchSlop)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                onStartTrackingTouch();
            }
            if (pickActiveThumb()) {
                this.thumbIsPressed = true;
                snapTouchPosition();
                updateHaloHotspot();
                invalidate();
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    public boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float valueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float abs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.values.size(); i++) {
            float abs2 = Math.abs(this.values.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float valueToX2 = valueToX(this.values.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !isRtl() ? valueToX2 - valueToX < 0.0f : valueToX2 - valueToX > 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.activeThumbIdx = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(valueToX2 - valueToX) < ((float) this.scaledTouchSlop)) {
                    this.activeThumbIdx = -1;
                    return false;
                } else if (z) {
                    this.activeThumbIdx = i;
                }
            }
            abs = abs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(L l) {
        this.changeListeners.remove(l);
    }

    public void removeOnSliderTouchListener(T t) {
        this.touchListeners.remove(t);
    }

    public void setActiveThumbIndex(int i) {
        this.activeThumbIdx = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i;
        this.accessibilityHelper.mo19036n(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.haloRadius) {
            this.haloRadius = i;
            Drawable background = getBackground();
            if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                ((RippleDrawable) background).setRadius(this.haloRadius);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.haloColor)) {
            this.haloColor = colorStateList;
            Drawable background = getBackground();
            if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
                this.haloPaint.setColor(getColorForState(colorStateList));
                this.haloPaint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.labelBehavior != i) {
            this.labelBehavior = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(C15425c cVar) {
        this.formatter = cVar;
    }

    public void setSeparationUnit(int i) {
        this.separationUnit = i;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, new Object[]{Float.valueOf(f), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)}));
        } else if (this.stepSize != f) {
            this.stepSize = f;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.thumbDrawable.setElevation(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.thumbRadius) {
            this.thumbRadius = i;
            maybeIncreaseTrackSidePadding();
            MaterialShapeDrawable materialShapeDrawable = this.thumbDrawable;
            C15401a.C15402a aVar = new C15401a.C15402a();
            float f = (float) this.thumbRadius;
            C19388s I = C19543e0.m33293I(0);
            aVar.f34583a = I;
            float b = C15401a.C15402a.m24987b(I);
            if (b != -1.0f) {
                aVar.mo54620f(b);
            }
            aVar.f34584b = I;
            float b2 = C15401a.C15402a.m24987b(I);
            if (b2 != -1.0f) {
                aVar.mo54621g(b2);
            }
            aVar.f34585c = I;
            float b3 = C15401a.C15402a.m24987b(I);
            if (b3 != -1.0f) {
                aVar.mo54619e(b3);
            }
            aVar.f34586d = I;
            float b4 = C15401a.C15402a.m24987b(I);
            if (b4 != -1.0f) {
                aVar.mo54618d(b4);
            }
            aVar.mo54617c(f);
            materialShapeDrawable.setShapeAppearanceModel(new C15401a(aVar));
            MaterialShapeDrawable materialShapeDrawable2 = this.thumbDrawable;
            int i2 = this.thumbRadius * 2;
            materialShapeDrawable2.setBounds(0, 0, i2, i2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.thumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C8184a.m16459b(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.thumbDrawable.setStrokeWidth(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.thumbDrawable.getFillColor())) {
            this.thumbDrawable.setFillColor(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.tickColorActive)) {
            this.tickColorActive = colorStateList;
            this.activeTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.tickColorInactive)) {
            this.tickColorInactive = colorStateList;
            this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.tickVisible != z) {
            this.tickVisible = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.trackColorActive)) {
            this.trackColorActive = colorStateList;
            this.activeTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.trackHeight != i) {
            this.trackHeight = i;
            invalidateTrack();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.trackColorInactive)) {
            this.trackColorInactive = colorStateList;
            this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.valueFrom = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.valueTo = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirturalViewId(int i, Rect rect) {
        int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i).floatValue()) * ((float) this.trackWidth)));
        int calculateTop = calculateTop();
        int i2 = this.thumbRadius;
        rect.set(normalizeValue - i2, calculateTop - i2, normalizeValue + i2, calculateTop + i2);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* access modifiers changed from: private */
    public float calculateStepIncrement(int i) {
        float calculateStepIncrement = calculateStepIncrement();
        float f = (this.valueTo - this.valueFrom) / calculateStepIncrement;
        float f2 = (float) i;
        if (f <= f2) {
            return calculateStepIncrement;
        }
        return ((float) Math.round(f / f2)) * calculateStepIncrement;
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(C17790a.m29918a(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.tickVisible = true;
        this.isLongPress = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.thumbDrawable = materialShapeDrawable;
        this.separationUnit = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.inactiveTrackPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.activeTrackPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.thumbPaint = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.haloPaint = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.inactiveTicksPaint = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.activeTicksPaint = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        loadResources(context2.getResources());
        this.labelMaker = new C15416a(attributeSet, i);
        processAttributes(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        C15420e eVar = new C15420e(this);
        this.accessibilityHelper = eVar;
        C2364y.m5201p(this, eVar);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }
}
