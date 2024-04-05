package com.etsy.android.p327ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.view.StepIndicatorView */
public final class StepIndicatorView extends View {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private int currentStepPosition;
    private int endX;
    private final Paint paint;
    private int pointY;
    private int startX;
    private int stepCount;
    private int stepDistance;
    private int stepRadius;
    private float trackHeight;
    private int traversedStepColor;
    private int untraversedStepColor;

    /* renamed from: com.etsy.android.ui.view.StepIndicatorView$SavedState */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final int currentStepPosition;
        private final int stepCount;
        private final int stepRadius;
        private final Parcelable superSavedState;
        private final float trackHeight;
        private final int traversedStepColor;
        private final int untraversedStepColor;

        /* renamed from: com.etsy.android.ui.view.StepIndicatorView$SavedState$Creator */
        public static final class Creator implements Parcelable.Creator<SavedState> {
            public final SavedState createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new SavedState(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
            this(0, 0, 0.0f, 0, 0, 0, (Parcelable) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SavedState(int r6, int r7, float r8, int r9, int r10, int r11, android.os.Parcelable r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r5 = this;
                r14 = r13 & 1
                r0 = 0
                if (r14 == 0) goto L_0x0007
                r14 = r0
                goto L_0x0008
            L_0x0007:
                r14 = r6
            L_0x0008:
                r6 = r13 & 2
                if (r6 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r7
            L_0x000f:
                r6 = r13 & 4
                if (r6 == 0) goto L_0x0014
                r8 = 0
            L_0x0014:
                r2 = r8
                r6 = r13 & 8
                if (r6 == 0) goto L_0x001b
                r3 = r0
                goto L_0x001c
            L_0x001b:
                r3 = r9
            L_0x001c:
                r6 = r13 & 16
                if (r6 == 0) goto L_0x0022
                r4 = r0
                goto L_0x0023
            L_0x0022:
                r4 = r10
            L_0x0023:
                r6 = r13 & 32
                if (r6 == 0) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r0 = r11
            L_0x0029:
                r6 = r13 & 64
                if (r6 == 0) goto L_0x002e
                r12 = 0
            L_0x002e:
                r13 = r12
                r6 = r5
                r7 = r14
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r12 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.view.StepIndicatorView.SavedState.<init>(int, int, float, int, int, int, android.os.Parcelable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public int describeContents() {
            return 0;
        }

        public final int getCurrentStepPosition() {
            return this.currentStepPosition;
        }

        public final int getStepCount() {
            return this.stepCount;
        }

        public final int getStepRadius() {
            return this.stepRadius;
        }

        public final Parcelable getSuperSavedState() {
            return this.superSavedState;
        }

        public final float getTrackHeight() {
            return this.trackHeight;
        }

        public final int getTraversedStepColor() {
            return this.traversedStepColor;
        }

        public final int getUntraversedStepColor() {
            return this.untraversedStepColor;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeInt(this.stepCount);
            parcel.writeInt(this.stepRadius);
            parcel.writeFloat(this.trackHeight);
            parcel.writeInt(this.untraversedStepColor);
            parcel.writeInt(this.traversedStepColor);
            parcel.writeInt(this.currentStepPosition);
            parcel.writeParcelable(this.superSavedState, i);
        }

        public SavedState(int i, int i2, float f, int i3, int i4, int i5, Parcelable parcelable) {
            super(parcelable);
            this.stepCount = i;
            this.stepRadius = i2;
            this.trackHeight = f;
            this.untraversedStepColor = i3;
            this.traversedStepColor = i4;
            this.currentStepPosition = i5;
            this.superSavedState = parcelable;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StepIndicatorView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StepIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.stepCount = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4499n, 0, 0);
            this.stepCount = obtainStyledAttributes.getInt(0, 1);
            this.stepRadius = (int) obtainStyledAttributes.getDimension(1, (float) obtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.step_indicator_default_dot_radius));
            this.trackHeight = obtainStyledAttributes.getDimension(2, obtainStyledAttributes.getResources().getDimension(R.dimen.step_indicator_default_track_height));
            this.traversedStepColor = obtainStyledAttributes.getColor(3, C13350a.m21013d(context, R.attr.clg_color_interaction_enabled_selected));
            this.untraversedStepColor = obtainStyledAttributes.getColor(4, C13350a.m21013d(context, R.attr.clg_color_interaction_disabled));
            obtainStyledAttributes.recycle();
        }
        Paint paint2 = new Paint();
        this.paint = paint2;
        paint2.setColor(this.traversedStepColor);
        paint2.setFlags(1);
        paint2.setStrokeWidth(this.trackHeight);
        setMinimumHeight(this.stepRadius * 7);
        invalidate();
    }

    private final int measureDimension(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && (mode != Integer.MIN_VALUE || i <= size)) {
            size = i;
        }
        if (size < i) {
            Log.e(C19386q.m32807a(StepIndicatorView.class).mo71919c(), "The view is too small. The content might get cut.");
        }
        return size;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getCurrentStepPosition() {
        return this.currentStepPosition;
    }

    public final int getStepsCount() {
        return this.stepCount;
    }

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        if (this.stepCount <= 1) {
            setVisibility(8);
            return;
        }
        super.onDraw(canvas);
        int i = this.startX;
        int i2 = this.stepCount - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.currentStepPosition;
            if (i3 < i4) {
                this.paint.setColor(this.traversedStepColor);
                int i5 = this.pointY;
                canvas.drawLine((float) i, (float) i5, (float) (this.stepDistance + i), (float) i5, this.paint);
            } else if (i3 == i4) {
                this.paint.setColor(this.untraversedStepColor);
                int i6 = this.pointY;
                canvas.drawLine((float) i, (float) i6, (float) (this.stepDistance + i), (float) i6, this.paint);
            } else {
                this.paint.setColor(this.untraversedStepColor);
                int i7 = this.pointY;
                canvas.drawLine((float) i, (float) i7, (float) (this.stepDistance + i), (float) i7, this.paint);
            }
            i += this.stepDistance;
        }
        int i8 = this.startX;
        int i9 = this.stepCount;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.currentStepPosition;
            if (i10 < i11) {
                this.paint.setColor(this.traversedStepColor);
                canvas.drawCircle((float) i8, (float) this.pointY, (float) this.stepRadius, this.paint);
            } else if (i10 == i11) {
                this.paint.setColor(this.traversedStepColor);
                canvas.drawCircle((float) i8, (float) this.pointY, (float) this.stepRadius, this.paint);
            } else {
                this.paint.setColor(this.untraversedStepColor);
                canvas.drawCircle((float) i8, (float) this.pointY, (float) this.stepRadius, this.paint);
            }
            i8 += this.stepDistance;
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureDimension(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i), measureDimension(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), i2));
        this.startX = this.stepRadius * 2;
        this.endX = getWidth() - (this.stepRadius * 2);
        this.pointY = getHeight() / 2;
        this.stepDistance = (this.endX - this.startX) / (this.stepCount - 1);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C19383o.m32797g(parcelable, "state");
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.stepCount = savedState.getStepCount();
        this.stepRadius = savedState.getStepRadius();
        this.trackHeight = savedState.getTrackHeight();
        this.untraversedStepColor = savedState.getUntraversedStepColor();
        this.traversedStepColor = savedState.getTraversedStepColor();
        this.currentStepPosition = savedState.getCurrentStepPosition();
    }

    public Parcelable onSaveInstanceState() {
        float f = this.trackHeight;
        return new SavedState(this.stepCount, this.stepRadius, f, this.untraversedStepColor, this.traversedStepColor, this.currentStepPosition, super.onSaveInstanceState());
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.startX = this.stepRadius * 2;
        this.endX = getWidth() - (this.stepRadius * 2);
        this.pointY = getHeight() / 2;
        this.stepDistance = (this.endX - this.startX) / (this.stepCount - 1);
        invalidate();
    }

    public final void setCurrentStepPosition(int i) {
        this.currentStepPosition = i;
        invalidate();
    }

    public final void setStepsCount(int i) {
        this.stepCount = i;
        invalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StepIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
