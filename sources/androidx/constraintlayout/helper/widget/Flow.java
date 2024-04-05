package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.C2221e;
import androidx.constraintlayout.solver.widgets.C2226h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import kotlin.reflect.C19421p;
import p203p0.C7647b;

public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private C2221e mFlow;

    public Flow(Context context) {
        super(context);
    }

    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mFlow = new C2221e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43325o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.mFlow.f5298U0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C2221e eVar = this.mFlow;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f5333r0 = dimensionPixelSize;
                    eVar.f5334s0 = dimensionPixelSize;
                    eVar.f5335t0 = dimensionPixelSize;
                    eVar.f5336u0 = dimensionPixelSize;
                } else if (index == 11) {
                    C2221e eVar2 = this.mFlow;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f5335t0 = dimensionPixelSize2;
                    eVar2.f5337v0 = dimensionPixelSize2;
                    eVar2.f5338w0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.mFlow.f5336u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.mFlow.f5337v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.mFlow.f5333r0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.mFlow.f5338w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.mFlow.f5334s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 38) {
                    this.mFlow.f5296S0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 28) {
                    this.mFlow.f5280C0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 37) {
                    this.mFlow.f5281D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 22) {
                    this.mFlow.f5282E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 30) {
                    this.mFlow.f5284G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 24) {
                    this.mFlow.f5283F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 32) {
                    this.mFlow.f5285H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 26) {
                    this.mFlow.f5286I0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 21) {
                    this.mFlow.f5288K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 29) {
                    this.mFlow.f5290M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 23) {
                    this.mFlow.f5289L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 31) {
                    this.mFlow.f5291N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 35) {
                    this.mFlow.f5287J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 25) {
                    this.mFlow.f5294Q0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 34) {
                    this.mFlow.f5295R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 27) {
                    this.mFlow.f5292O0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 36) {
                    this.mFlow.f5293P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 33) {
                    this.mFlow.f5297T0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    public void loadParameters(C2236a.C2237a aVar, C7647b bVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(aVar, bVar, layoutParams, sparseArray);
        if (bVar instanceof C2221e) {
            C2221e eVar = (C2221e) bVar;
            int i = layoutParams.orientation;
            if (i != -1) {
                eVar.f5298U0 = i;
            }
        }
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        onMeasure(this.mFlow, i, i2);
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        C2221e eVar = this.mFlow;
        int i = eVar.f5335t0;
        if (i <= 0 && eVar.f5336u0 <= 0) {
            return;
        }
        if (z) {
            eVar.f5337v0 = eVar.f5336u0;
            eVar.f5338w0 = i;
            return;
        }
        eVar.f5337v0 = i;
        eVar.f5338w0 = eVar.f5336u0;
    }

    public void setFirstHorizontalBias(float f) {
        this.mFlow.f5288K0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.mFlow.f5282E0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.mFlow.f5289L0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.mFlow.f5283F0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.mFlow.f5294Q0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.mFlow.f5286I0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.mFlow.f5292O0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.mFlow.f5280C0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.mFlow.f5297T0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.mFlow.f5298U0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C2221e eVar = this.mFlow;
        eVar.f5333r0 = i;
        eVar.f5334s0 = i;
        eVar.f5335t0 = i;
        eVar.f5336u0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.mFlow.f5334s0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.mFlow.f5337v0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.mFlow.f5338w0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.mFlow.f5333r0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.mFlow.f5295R0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.mFlow.f5287J0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.mFlow.f5293P0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.mFlow.f5281D0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.mFlow.f5296S0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(C2226h hVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (hVar != null) {
            hVar.mo8344P(mode, size, mode2, size2);
            setMeasuredDimension(hVar.f5340y0, hVar.f5341z0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
