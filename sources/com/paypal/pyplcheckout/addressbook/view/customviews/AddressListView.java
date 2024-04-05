package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AddressListView extends RecyclerView {
    public Map<Integer, View> _$_findViewCache;
    private int maxHeight;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddressListView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddressListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void initialize(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17165R.styleable.list_view_attrs);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.list_view_attrs)");
        this.maxHeight = obtainStyledAttributes.getLayoutDimension(C17165R.styleable.list_view_attrs_max_height, this.maxHeight);
        obtainStyledAttributes.recycle();
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

    public void onMeasure(int i, int i2) {
        int i3 = this.maxHeight;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        initialize(context, attributeSet);
    }
}
