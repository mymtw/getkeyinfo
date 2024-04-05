package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout {
    private C0303b0 mListener;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public boolean fitSystemWindows(Rect rect) {
        C0303b0 b0Var = this.mListener;
        if (b0Var != null) {
            b0Var.mo3022a();
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0303b0 b0Var) {
        this.mListener = b0Var;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
