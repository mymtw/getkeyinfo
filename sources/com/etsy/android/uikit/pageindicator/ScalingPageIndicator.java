package com.etsy.android.uikit.pageindicator;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.pageindicator.ScalingPageIndicatorLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p435rb.C13350a;
import p504ai.C13983i;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ScalingPageIndicator extends View implements ViewPager.C3334i {
    public static final int $stable = 8;
    public static final C11871a Companion = new C11871a();
    public static final float LEFT_THRESHOLD = 0.1f;
    public static final float RIGHT_THRESHOLD = 0.9f;
    public Map<Integer, View> _$_findViewCache;
    private boolean calculateNewCircles;
    private List<Float> currentCircleOffsets;
    private List<? extends ScalingPageIndicatorLogic.CircleSize> currentCircles;
    private int currentPage;
    private ScalingPageIndicatorLogic.Direction direction;
    private float fullRadius;
    private float heightOffset;
    private ScalingPageIndicatorLogic logic;
    private float mediumRadius;
    private List<Float> nextCircleOffsets;
    private List<? extends ScalingPageIndicatorLogic.CircleSize> nextCircles;
    private C19857l<? super C11872b, C19394m> onPageLoadedListener;
    private boolean pageSelected;
    private C19846a<Integer> pagerCountCallback;
    private final Paint paintPage;
    private final Paint paintSelected;
    private float positionOffset;
    private int presumptiveNextPage;
    private int scrollState;
    private float smallRadius;
    private float spacing;
    private int touchSlop;

    /* renamed from: com.etsy.android.uikit.pageindicator.ScalingPageIndicator$a */
    public static final class C11871a {
    }

    /* renamed from: com.etsy.android.uikit.pageindicator.ScalingPageIndicator$b */
    public static final class C11872b {

        /* renamed from: a */
        public final int f26408a;

        /* renamed from: b */
        public final List<ScalingPageIndicatorLogic.CircleSize> f26409b;

        public C11872b(int i, List<? extends ScalingPageIndicatorLogic.CircleSize> list) {
            C19383o.m32797g(list, "currentCircles");
            this.f26408a = i;
            this.f26409b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11872b)) {
                return false;
            }
            C11872b bVar = (C11872b) obj;
            return this.f26408a == bVar.f26408a && C19383o.m32792b(this.f26409b, bVar.f26409b);
        }

        public final int hashCode() {
            return this.f26409b.hashCode() + (Integer.hashCode(this.f26408a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("State(currentPage=");
            h.append(this.f26408a);
            h.append(", currentCircles=");
            return C0070b.m186i(h, this.f26409b, ')');
        }
    }

    /* renamed from: com.etsy.android.uikit.pageindicator.ScalingPageIndicator$c */
    public /* synthetic */ class C11873c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26410a;

        static {
            int[] iArr = new int[ScalingPageIndicatorLogic.CircleSize.values().length];
            iArr[ScalingPageIndicatorLogic.CircleSize.INVISIBLE.ordinal()] = 1;
            iArr[ScalingPageIndicatorLogic.CircleSize.SMALL.ordinal()] = 2;
            iArr[ScalingPageIndicatorLogic.CircleSize.MEDIUM.ordinal()] = 3;
            iArr[ScalingPageIndicatorLogic.CircleSize.FULL.ordinal()] = 4;
            f26410a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScalingPageIndicator(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScalingPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        Paint paint = new Paint(1);
        this.paintPage = paint;
        Paint paint2 = new Paint(1);
        this.paintSelected = paint2;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.currentCircles = emptyList;
        this.nextCircles = emptyList;
        this.currentCircleOffsets = emptyList;
        this.nextCircleOffsets = emptyList;
        this.direction = ScalingPageIndicatorLogic.Direction.NONE;
        this.presumptiveNextPage = -1;
        this.pagerCountCallback = ScalingPageIndicator$pagerCountCallback$1.INSTANCE;
        this.onPageLoadedListener = ScalingPageIndicator$onPageLoadedListener$1.INSTANCE;
        Resources resources = getResources();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(C13350a.m21013d(context, R.attr.clg_color_page_control_selected_on_dark));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(C13350a.m21013d(context, R.attr.clg_color_page_control_on_dark));
        this.fullRadius = resources.getDimension(R.dimen.scaling_page_indicator_full_circle_radius);
        this.mediumRadius = resources.getDimension(R.dimen.scaling_page_indicator_medium_circle_radius);
        this.smallRadius = resources.getDimension(R.dimen.scaling_page_indicator_small_circle_radius);
        this.spacing = resources.getDimension(R.dimen.scaling_page_indicator_circle_spacing);
        this.touchSlop = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    private final List<Float> calculateCircleOffsets(List<? extends ScalingPageIndicatorLogic.CircleSize> list) {
        ArrayList arrayList = new ArrayList();
        float measuredWidth = (((float) getMeasuredWidth()) / 2.0f) - (calculateCirclesWidth(list) / 2.0f);
        float f = this.smallRadius;
        float f2 = this.spacing + f;
        int i = 0;
        boolean z = true;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                float circleRadius = circleRadius((ScalingPageIndicatorLogic.CircleSize) next);
                if (circleRadius == 0.0f) {
                    arrayList.add(i, Float.valueOf(z ? measuredWidth - f2 : measuredWidth + f));
                } else {
                    float f3 = measuredWidth + circleRadius;
                    arrayList.add(i, Float.valueOf(f3));
                    z = false;
                    measuredWidth = circleRadius + this.spacing + f3;
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        return arrayList;
    }

    private final float calculateCirclesWidth(List<? extends ScalingPageIndicatorLogic.CircleSize> list) {
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (ScalingPageIndicatorLogic.CircleSize circleRadius : list) {
            arrayList.add(Float.valueOf((circleRadius(circleRadius) * ((float) 2)) + this.spacing));
        }
        Iterator it = arrayList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += ((Number) it.next()).floatValue();
        }
        return f - this.spacing;
    }

    private final float circleRadius(ScalingPageIndicatorLogic.CircleSize circleSize) {
        int i = C11873c.f26410a[circleSize.ordinal()];
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return this.smallRadius;
        }
        if (i == 3) {
            return this.mediumRadius;
        }
        if (i == 4) {
            return this.fullRadius;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void drawCircle(int i, Canvas canvas) {
        ScalingPageIndicatorLogic.CircleSize circleSize = (ScalingPageIndicatorLogic.CircleSize) this.currentCircles.get(i);
        ScalingPageIndicatorLogic.CircleSize circleSize2 = (ScalingPageIndicatorLogic.CircleSize) C19327t.m32641W0(i, this.nextCircles);
        ScalingPageIndicatorLogic.CircleSize circleSize3 = ScalingPageIndicatorLogic.CircleSize.INVISIBLE;
        if (circleSize != circleSize3 || circleSize2 != circleSize3) {
            float f = this.positionOffset;
            float f2 = 0.0f;
            if ((f == 0.0f) && circleSize2 != null) {
                f = 1.0f;
            } else if (this.direction == ScalingPageIndicatorLogic.Direction.LEFT) {
                f = 1.0f - f;
            }
            float floatValue = this.currentCircleOffsets.get(i).floatValue();
            List<Float> list = this.nextCircleOffsets;
            float floatValue2 = ((((i < 0 || i > C17782b.m29859Y(list)) ? Float.valueOf(0.0f) : list.get(i)).floatValue() - floatValue) * f) + floatValue;
            float circleRadius = circleRadius(circleSize);
            if (circleSize2 != null) {
                f2 = circleRadius(circleSize2);
            }
            canvas.drawCircle(floatValue2, this.heightOffset, C0023f.m103b(f2, circleRadius, f, circleRadius), paintCircle(i) ? this.paintSelected : this.paintPage);
        }
    }

    private final int measureLong(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        float intValue = (float) this.pagerCountCallback.invoke().intValue();
        float f = (float) 2;
        int paddingLeft = (int) ((intValue * this.spacing * f) + (this.fullRadius * intValue * f) + ((float) getPaddingLeft()) + ((float) getPaddingRight()));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private final int measureShort(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((((float) 2) * this.fullRadius) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private final boolean paintCircle(int i) {
        int i2 = this.presumptiveNextPage;
        if (i2 != -1) {
            if (i == i2) {
                return true;
            }
        } else if (i == this.currentPage) {
            return true;
        }
        return false;
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

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.pagerCountCallback.invoke().intValue() != 0) {
            int size = this.currentCircles.size();
            for (int i = 0; i < size; i++) {
                drawCircle(i, canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureLong(i), measureShort(i2));
        this.currentCircleOffsets = calculateCircleOffsets(this.currentCircles);
        this.heightOffset = ((float) getPaddingTop()) + this.fullRadius;
    }

    public void onPageScrollStateChanged(int i) {
        this.scrollState = i;
        if (i == 1) {
            this.calculateNewCircles = true;
        } else if (i == 0 && this.pageSelected) {
            List<? extends ScalingPageIndicatorLogic.CircleSize> list = this.nextCircles;
            this.currentCircles = list;
            this.currentCircleOffsets = this.nextCircleOffsets;
            this.pageSelected = false;
            this.onPageLoadedListener.invoke(new C11872b(this.currentPage, list));
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        ScalingPageIndicatorLogic.Direction direction2 = this.currentPage > i ? ScalingPageIndicatorLogic.Direction.LEFT : ScalingPageIndicatorLogic.Direction.RIGHT;
        this.direction = direction2;
        this.positionOffset = f;
        if ((direction2 == ScalingPageIndicatorLogic.Direction.LEFT && f < 0.1f) || (direction2 == ScalingPageIndicatorLogic.Direction.RIGHT && f > 0.9f)) {
            this.presumptiveNextPage = direction2 == ScalingPageIndicatorLogic.Direction.RIGHT ? i + 1 : i;
        }
        boolean z = true;
        if (f == 0.0f) {
            this.presumptiveNextPage = -1;
            this.currentPage = i;
        }
        if (this.calculateNewCircles) {
            this.calculateNewCircles = false;
            if (f != 0.0f) {
                z = false;
            }
            if (!z) {
                ScalingPageIndicatorLogic scalingPageIndicatorLogic = this.logic;
                if (scalingPageIndicatorLogic != null) {
                    List<ScalingPageIndicatorLogic.CircleSize> a = scalingPageIndicatorLogic.mo38362a(this.currentPage, this.currentCircles, direction2);
                    this.nextCircles = a;
                    this.nextCircleOffsets = calculateCircleOffsets(a);
                } else {
                    C19383o.m32805o("logic");
                    throw null;
                }
            } else {
                return;
            }
        }
        invalidate();
    }

    public void onPageSelected(int i) {
        this.pageSelected = true;
    }

    public final void reset() {
        this.currentPage = 0;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.currentCircles = emptyList;
        this.currentCircleOffsets = emptyList;
        this.direction = ScalingPageIndicatorLogic.Direction.NONE;
        this.nextCircles = emptyList;
        this.nextCircleOffsets = emptyList;
    }

    public final void restore(C11872b bVar) {
        C19383o.m32797g(bVar, "state");
        this.currentPage = bVar.f26408a;
        this.currentCircles = bVar.f26409b;
        this.direction = ScalingPageIndicatorLogic.Direction.NONE;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.nextCircles = emptyList;
        this.nextCircleOffsets = emptyList;
        this.positionOffset = 0.0f;
    }

    public final void setOnPageLoadedListener(C19857l<? super C11872b, C19394m> lVar) {
        C19383o.m32797g(lVar, "onPageLoadedListener");
        this.onPageLoadedListener = lVar;
    }

    public final void setPagerCountCallback(C19846a<Integer> aVar) {
        C19383o.m32797g(aVar, "pagerCountCallback");
        this.pagerCountCallback = aVar;
        this.logic = new ScalingPageIndicatorLogic(aVar.invoke().intValue());
        if (this.currentCircles.isEmpty()) {
            ScalingPageIndicatorLogic scalingPageIndicatorLogic = this.logic;
            if (scalingPageIndicatorLogic != null) {
                this.currentCircles = scalingPageIndicatorLogic.mo38362a(0, EmptyList.INSTANCE, ScalingPageIndicatorLogic.Direction.NONE);
            } else {
                C19383o.m32805o("logic");
                throw null;
            }
        }
        requestLayout();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScalingPageIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
