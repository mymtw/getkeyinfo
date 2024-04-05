package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.C2197a;
import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.reflect.C19421p;
import p203p0.C7647b;

public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private C2197a mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void updateType(ConstraintWidget constraintWidget, int i, boolean z) {
        this.mResolvedType = i;
        if (z) {
            int i2 = this.mIndicatedType;
            if (i2 == 5) {
                this.mResolvedType = 1;
            } else if (i2 == 6) {
                this.mResolvedType = 0;
            }
        } else {
            int i3 = this.mIndicatedType;
            if (i3 == 5) {
                this.mResolvedType = 0;
            } else if (i3 == 6) {
                this.mResolvedType = 1;
            }
        }
        if (constraintWidget instanceof C2197a) {
            ((C2197a) constraintWidget).f5179r0 = this.mResolvedType;
        }
    }

    public boolean allowsGoneWidget() {
        return this.mBarrier.f5180s0;
    }

    public int getMargin() {
        return this.mBarrier.f5181t0;
    }

    public int getType() {
        return this.mIndicatedType;
    }

    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new C2197a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43325o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.mBarrier.f5180s0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.mBarrier.f5181t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void loadParameters(C2236a.C2237a aVar, C7647b bVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(aVar, bVar, layoutParams, sparseArray);
        if (bVar instanceof C2197a) {
            C2197a aVar2 = (C2197a) bVar;
            updateType(aVar2, aVar.f5379d.f5412b0, ((C2220d) bVar.f5126Q).f5273t0);
            C2236a.C2238b bVar2 = aVar.f5379d;
            aVar2.f5180s0 = bVar2.f5428j0;
            aVar2.f5181t0 = bVar2.f5414c0;
        }
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        updateType(constraintWidget, this.mIndicatedType, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.f5180s0 = z;
    }

    public void setDpMargin(int i) {
        this.mBarrier.f5181t0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.mBarrier.f5181t0 = i;
    }

    public void setType(int i) {
        this.mIndicatedType = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
