package androidx.compose.p015ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1537o;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.DrawChildContainer */
public class DrawChildContainer extends ViewGroup {
    private boolean isDrawing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z;
        C19383o.m32797g(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            } else if (((ViewLayer) childAt).isInvalidated()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.isDrawing = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.isDrawing = false;
            }
        }
    }

    public final void drawChild$ui_release(C1537o oVar, View view, long j) {
        C19383o.m32797g(oVar, "canvas");
        C19383o.m32797g(view, "view");
        Canvas canvas = C1493c.f3222a;
        super.drawChild(((C1491b) oVar).f3219a, view, j);
    }

    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
