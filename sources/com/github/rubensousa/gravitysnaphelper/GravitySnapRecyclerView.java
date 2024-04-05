package com.github.rubensousa.gravitysnaphelper;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rubensousa.gravitysnaphelper.C12600a;

public class GravitySnapRecyclerView extends OrientationAwareRecyclerView {
    private boolean isSnappingEnabled;
    private final C12600a snapHelper;

    public GravitySnapRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void snapTo(Boolean bool, Boolean bool2) {
        View i;
        RecyclerView.C3100o layoutManager = getLayoutManager();
        if (layoutManager != null && (i = this.snapHelper.mo45364i(layoutManager, false)) != null) {
            int childAdapterPosition = getChildAdapterPosition(i);
            if (bool.booleanValue()) {
                if (bool2.booleanValue()) {
                    smoothScrollToPosition(childAdapterPosition + 1);
                } else {
                    scrollToPosition(childAdapterPosition + 1);
                }
            } else if (childAdapterPosition <= 0) {
            } else {
                if (bool2.booleanValue()) {
                    smoothScrollToPosition(childAdapterPosition - 1);
                } else {
                    scrollToPosition(childAdapterPosition - 1);
                }
            }
        }
    }

    public void enableSnapping(Boolean bool) {
        if (bool.booleanValue()) {
            this.snapHelper.mo11867a(this);
        } else {
            this.snapHelper.mo11867a((RecyclerView) null);
        }
        this.isSnappingEnabled = bool.booleanValue();
    }

    public int getCurrentSnappedPosition() {
        View i;
        C12600a aVar = this.snapHelper;
        RecyclerView recyclerView = aVar.f27817q;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (i = aVar.mo45364i(aVar.f27817q.getLayoutManager(), true)) == null) {
            return -1;
        }
        return aVar.f27817q.getChildAdapterPosition(i);
    }

    public C12600a getSnapHelper() {
        return this.snapHelper;
    }

    public boolean isSnappingEnabled() {
        return this.isSnappingEnabled;
    }

    public void scrollToPosition(int i) {
        if (this.isSnappingEnabled) {
            C12600a aVar = this.snapHelper;
            boolean z = false;
            if (i == -1) {
                aVar.getClass();
            } else {
                z = aVar.mo45368o(i, false);
            }
            if (z) {
                return;
            }
        }
        super.scrollToPosition(i);
    }

    public void setSnapListener(C12600a.C12603c cVar) {
        this.snapHelper.getClass();
    }

    public void smoothScrollToPosition(int i) {
        boolean z;
        if (this.isSnappingEnabled) {
            C12600a aVar = this.snapHelper;
            if (i == -1) {
                aVar.getClass();
                z = false;
            } else {
                z = aVar.mo45368o(i, true);
            }
            if (z) {
                return;
            }
        }
        super.smoothScrollToPosition(i);
    }

    public void snapToNextPosition(Boolean bool) {
        snapTo(Boolean.TRUE, bool);
    }

    public void snapToPreviousPosition(Boolean bool) {
        snapTo(Boolean.FALSE, bool);
    }

    public GravitySnapRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GravitySnapRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isSnappingEnabled = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0761x.f1568l, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, 0);
        if (i2 == 0) {
            this.snapHelper = new C12600a(8388611);
        } else if (i2 == 1) {
            this.snapHelper = new C12600a(48);
        } else if (i2 == 2) {
            this.snapHelper = new C12600a(8388613);
        } else if (i2 != 3) {
            if (i2 == 4) {
                this.snapHelper = new C12600a(17);
            }
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        } else {
            this.snapHelper = new C12600a(80);
        }
        this.snapHelper.f27811k = obtainStyledAttributes.getBoolean(5, false);
        this.snapHelper.f27808h = obtainStyledAttributes.getBoolean(2, false);
        C12600a aVar = this.snapHelper;
        float f = obtainStyledAttributes.getFloat(3, -1.0f);
        aVar.f27813m = -1;
        aVar.f27814n = f;
        this.snapHelper.f27812l = obtainStyledAttributes.getFloat(4, 100.0f);
        enableSnapping(Boolean.valueOf(obtainStyledAttributes.getBoolean(0, true)));
        obtainStyledAttributes.recycle();
    }
}
