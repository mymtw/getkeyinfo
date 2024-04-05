package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.C0114h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.EtsyImageUrlManipulator$ImageSize;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p455u9.C13448b;
import p504ai.C13983i;

public final class ListingDynamicSizeImageView extends ForegroundImageView {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private String fullImageUrl;
    private boolean imageLoadRequested;
    private Integer loadingColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingDynamicSizeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    private final void loadImage() {
        String str;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0 && (str = this.fullImageUrl) != null) {
            this.imageLoadRequested = true;
            String size = EtsyImageUrlManipulator$ImageSize.FULLxFULL.getSize();
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            C19383o.m32797g(size, "fromSize");
            StringBuilder sb = new StringBuilder();
            sb.append(measuredWidth2);
            sb.append('x');
            sb.append(measuredHeight2);
            String sb2 = sb.toString();
            C19383o.m32797g(sb2, "toSize");
            C13448b load = C0114h.m270B0(getContext()).load(C19457k.m33023a1(str, size, sb2, false));
            C19383o.m32796f(load, "with(context).load(url)");
            Integer num = this.loadingColor;
            if (num != null) {
                load = load.mo17160t(new ColorDrawable(num.intValue()));
                C19383o.m32796f(load, "request.placeholder(ColorDrawable(color))");
            }
            load.mo16816M(this);
        }
    }

    public static /* synthetic */ void setImageInfo$default(ListingDynamicSizeImageView listingDynamicSizeImageView, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        listingDynamicSizeImageView.setImageInfo(str, num);
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

    public final void cleanUp() {
        this.loadingColor = null;
        this.imageLoadRequested = false;
        this.fullImageUrl = null;
        setImageDrawable((Drawable) null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.fullImageUrl != null && !this.imageLoadRequested) {
            loadImage();
        }
    }

    public final void setImageInfo(String str, Integer num) {
        if (str == null || C19459m.m33036e1(str, EtsyImageUrlManipulator$ImageSize.FULLxFULL.getSize(), false)) {
            this.fullImageUrl = str;
            this.loadingColor = num;
            this.imageLoadRequested = false;
            setImageDrawable((Drawable) null);
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("fullImageUrl must contain 'fullxfull' size component");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingDynamicSizeImageView(Context context) {
        this(context, (AttributeSet) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingDynamicSizeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingDynamicSizeImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
