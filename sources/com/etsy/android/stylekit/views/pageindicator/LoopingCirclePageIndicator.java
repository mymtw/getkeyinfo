package com.etsy.android.stylekit.views.pageindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p388lb.C13006a;
import p435rb.C13350a;
import p449tb.C13389a;

public final class LoopingCirclePageIndicator extends View implements ViewPager.C3334i {
    public static final int $stable = 8;
    public static final C9067a Companion = new C9067a();
    public static final int MAX_ALPHA = 255;
    private int currentPage;
    private float edgeDistance;
    private float minRadius;
    private float pageOffset;
    private C13389a pagerCallback;
    private final Paint paintPage;
    private final Paint paintSelectedPage;
    private float radius;
    private int scrollState;
    private int snapPage;
    private int touchSlop;

    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new LoopingCirclePageIndicator$SavedState$Companion$CREATOR$1();
        public static final C9066a Companion = new C9066a();
        private int currentPage;

        /* renamed from: com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator$SavedState$a */
        public static final class C9066a {
        }

        public /* synthetic */ SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public final void setCurrentPage(int i) {
            this.currentPage = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "dest");
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator$a */
    public static final class C9067a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoopingCirclePageIndicator(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoopingCirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoopingCirclePageIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int measureLong(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        C13389a aVar = this.pagerCallback;
        if (aVar != null) {
            int count = aVar.getCount();
            float paddingLeft = ((float) getPaddingLeft()) + ((float) getPaddingRight());
            float f = this.radius;
            int i2 = (int) ((((float) (count - 1)) * f) + (((float) count) * 2.0f * f) + paddingLeft + 1.0f);
            return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
        }
        C19383o.m32805o("pagerCallback");
        throw null;
    }

    private final int measureShort(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((((float) 2) * this.radius) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public final void notifyDataSetChanged() {
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        super.onDraw(canvas);
        C13389a aVar = this.pagerCallback;
        if (aVar != null) {
            int count = aVar.getCount();
            if (count != 0) {
                if (this.currentPage >= count) {
                    this.currentPage = 0;
                    invalidate();
                    return;
                }
                int width = getWidth();
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int paddingTop = getPaddingTop();
                float f = this.radius;
                float f2 = ((float) 4) * f;
                float f3 = ((float) paddingTop) + f;
                float f4 = ((((float) ((width - paddingLeft) - paddingRight)) / 2.0f) - ((((float) count) * f2) / 2.0f)) + ((float) paddingLeft) + f;
                for (int i = 0; i < count; i++) {
                    float f5 = (((float) i) * f2) + f4;
                    if (this.paintPage.getAlpha() > 0) {
                        canvas.drawCircle(f5, f3, f, this.paintPage);
                    }
                }
                int i2 = this.currentPage;
                float f6 = this.pageOffset;
                float f7 = (((float) i2) + f6) * f2;
                float f8 = this.radius;
                if (i2 >= count - 1) {
                    if (((double) f6) <= 0.5d) {
                        float f9 = f6 * 2.0f;
                        float f10 = (float) 255;
                        this.paintSelectedPage.setAlpha((int) (f10 - (f10 * f9)));
                        float f11 = this.radius;
                        f8 = f11 - ((f11 - this.minRadius) * f9);
                        float f12 = this.pageOffset;
                        f7 = ((((float) this.currentPage) + f12) * f2) + (this.edgeDistance * f12);
                    } else {
                        float f13 = (f6 - 0.5f) * 2.0f;
                        this.paintSelectedPage.setAlpha((int) (((float) 255) * f13));
                        float f14 = this.minRadius;
                        f8 = C0023f.m103b(this.radius, f14, f13, f14);
                        float f15 = this.edgeDistance;
                        f7 = (f13 * f15) - f15;
                    }
                }
                canvas.drawCircle(f4 + f7, f3, f8, this.paintSelectedPage);
                return;
            }
            return;
        }
        C19383o.m32805o("pagerCallback");
        throw null;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureLong(i), measureShort(i2));
    }

    public void onPageScrollStateChanged(int i) {
        this.scrollState = i;
    }

    public void onPageScrolled(int i, float f, int i2) {
        C13389a aVar = this.pagerCallback;
        if (aVar != null) {
            this.currentPage = i % aVar.getCount();
            this.pageOffset = f;
            invalidate();
            return;
        }
        C19383o.m32805o("pagerCallback");
        throw null;
    }

    public void onPageSelected(int i) {
        if (this.scrollState == 0) {
            this.currentPage = i;
            this.snapPage = i;
            invalidate();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C19383o.m32795e(parcelable, "null cannot be cast to non-null type com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator.SavedState");
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentPage = savedState.getCurrentPage();
        this.snapPage = savedState.getCurrentPage();
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setCurrentPage(this.currentPage);
        return savedState;
    }

    public final void setCurrentPosition(int i) {
        this.currentPage = i;
        invalidate();
    }

    public final void setPagerCallback(C13389a aVar) {
        C19383o.m32797g(aVar, "pagerCallback");
        this.pagerCallback = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoopingCirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Paint paint = new Paint(1);
        this.paintPage = paint;
        Paint paint2 = new Paint(1);
        this.paintSelectedPage = paint2;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int d = C13350a.m21013d(context, R.attr.clg_color_page_control_selected);
            int d2 = C13350a.m21013d(context, R.attr.clg_color_page_control);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28659z, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…irclePageIndicator, 0, 0)");
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(obtainStyledAttributes.getColor(1, d));
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(obtainStyledAttributes.getColor(0, d2));
            obtainStyledAttributes.recycle();
            this.radius = resources.getDimension(R.dimen.clg_page_indicator_circle_radius);
            this.minRadius = (float) resources.getDimensionPixelSize(R.dimen.clg_page_indicator_loop_shrink_radius);
            this.edgeDistance = (float) resources.getDimensionPixelSize(R.dimen.clg_page_indicator_loop_edge_distance);
            this.touchSlop = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        }
    }
}
