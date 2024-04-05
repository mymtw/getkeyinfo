package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p728zk.C18956m;
import p728zk.C18960p;
import p728zk.C18962q;

public final class LinearProgressIndicator extends BaseProgressIndicator<C18962q> {
    public static final int DEF_STYLE_RES = 2132018604;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    public LinearProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(IndeterminateDrawable.createLinearDrawable(getContext(), (C18962q) this.spec));
        setProgressDrawable(DeterminateDrawable.createLinearDrawable(getContext(), (C18962q) this.spec));
    }

    public int getIndeterminateAnimationType() {
        return ((C18962q) this.spec).f42283g;
    }

    public int getIndicatorDirection() {
        return ((C18962q) this.spec).f42284h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.spec;
        C18962q qVar = (C18962q) s;
        boolean z2 = true;
        if (((C18962q) s).f42284h != 1) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!((C2364y.C2369e.m5233d(this) == 1 && ((C18962q) this.spec).f42284h == 2) || (C2364y.C2369e.m5233d(this) == 0 && ((C18962q) this.spec).f42284h == 3))) {
                z2 = false;
            }
        }
        qVar.f42285i = z2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        if (((C18962q) this.spec).f42283g != i) {
            if (!visibleToUser() || !isIndeterminate()) {
                S s = this.spec;
                ((C18962q) s).f42283g = i;
                ((C18962q) s).mo70376a();
                if (i == 0) {
                    getIndeterminateDrawable().setAnimatorDelegate(new C18956m((C18962q) this.spec));
                } else {
                    getIndeterminateDrawable().setAnimatorDelegate(new C18960p(getContext(), (C18962q) this.spec));
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((C18962q) this.spec).mo70376a();
    }

    public void setIndicatorDirection(int i) {
        S s = this.spec;
        ((C18962q) s).f42284h = i;
        C18962q qVar = (C18962q) s;
        boolean z = true;
        if (i != 1) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!((C2364y.C2369e.m5233d(this) == 1 && ((C18962q) this.spec).f42284h == 2) || (C2364y.C2369e.m5233d(this) == 0 && i == 3))) {
                z = false;
            }
        }
        qVar.f42285i = z;
        invalidate();
    }

    public void setProgressCompat(int i, boolean z) {
        S s = this.spec;
        if (s == null || ((C18962q) s).f42283g != 0 || !isIndeterminate()) {
            super.setProgressCompat(i, z);
        }
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((C18962q) this.spec).mo70376a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public C18962q createSpec(Context context, AttributeSet attributeSet) {
        return new C18962q(context, attributeSet);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
    }
}
