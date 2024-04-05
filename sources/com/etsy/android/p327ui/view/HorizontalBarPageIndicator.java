package com.etsy.android.p327ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p449tb.C13389a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.view.HorizontalBarPageIndicator */
public final class HorizontalBarPageIndicator extends View implements ViewPager.C3334i {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private int currentPage;
    private int defaultHeight;
    private float pageOffset;
    public C13389a pagerCallback;
    private final Paint paintPageIndicator;
    private final Paint paintTrack;
    private int scrollState;
    private int snapPage;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HorizontalBarPageIndicator(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HorizontalBarPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalBarPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        Paint paint = new Paint(1);
        this.paintTrack = paint;
        Paint paint2 = new Paint(1);
        this.paintPageIndicator = paint2;
        if (!isInEditMode()) {
            this.defaultHeight = getResources().getDimensionPixelSize(R.dimen.clg_space_4);
            Object obj = C8184a.f17966a;
            int a = C8184a.C8188d.m16468a(context, R.color.listing_images_paging_track_bg);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(a);
            int a2 = C8184a.C8188d.m16468a(context, R.color.listing_images_paging_indicator_bg);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(a2);
        }
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

    public final C13389a getPagerCallback() {
        C13389a aVar = this.pagerCallback;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("pagerCallback");
        throw null;
    }

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        super.onDraw(canvas);
        int count = getPagerCallback().getCount();
        if (count != 0) {
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) this.defaultHeight, this.paintTrack);
            float width = (float) (getWidth() / count);
            int i = this.defaultHeight;
            float f = ((float) i) / 2.0f;
            float f2 = (((float) this.currentPage) + this.pageOffset) * width;
            canvas.drawRoundRect(f2, 0.0f, f2 + width, (float) i, f, f, this.paintPageIndicator);
            if (this.currentPage >= count - 1) {
                float f3 = (this.pageOffset - ((float) 1)) * width;
                canvas.drawRoundRect(f3, 0.0f, f3 + width, (float) this.defaultHeight, f, f, this.paintPageIndicator);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.defaultHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onPageScrollStateChanged(int i) {
        this.scrollState = i;
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.currentPage = i % getPagerCallback().getCount();
        this.pageOffset = f;
        invalidate();
    }

    public void onPageSelected(int i) {
        if (this.scrollState == 0) {
            this.currentPage = i;
            this.snapPage = i;
            invalidate();
        }
    }

    public final void setPagerCallback(C13389a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.pagerCallback = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HorizontalBarPageIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
