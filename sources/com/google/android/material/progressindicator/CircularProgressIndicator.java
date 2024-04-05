package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.etsy.android.R;
import p728zk.C18947g;

public final class CircularProgressIndicator extends BaseProgressIndicator<C18947g> {
    public static final int DEF_STYLE_RES = 2132018592;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (C18947g) this.spec));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (C18947g) this.spec));
    }

    public int getIndicatorDirection() {
        return ((C18947g) this.spec).f42251i;
    }

    public int getIndicatorInset() {
        return ((C18947g) this.spec).f42250h;
    }

    public int getIndicatorSize() {
        return ((C18947g) this.spec).f42249g;
    }

    public void setIndicatorDirection(int i) {
        ((C18947g) this.spec).f42251i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.spec;
        if (((C18947g) s).f42250h != i) {
            ((C18947g) s).f42250h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.spec;
        if (((C18947g) s).f42249g != max) {
            ((C18947g) s).f42249g = max;
            ((C18947g) s).getClass();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((C18947g) this.spec).getClass();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public C18947g createSpec(Context context, AttributeSet attributeSet) {
        return new C18947g(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
    }
}
