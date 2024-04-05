package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p558el.C17721h;

public class SnackbarContentLayout extends LinearLayout implements C17721h {
    private Button actionView;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void updateTopBottomPadding(View view, int i, int i2) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2369e.m5236g(view)) {
            C2364y.C2369e.m5240k(view, C2364y.C2369e.m5235f(view), i, C2364y.C2369e.m5234e(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean updateViewsWithinLayout(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.messageView.getPaddingTop() == i2 && this.messageView.getPaddingBottom() == i3) {
            return z;
        }
        updateTopBottomPadding(this.messageView, i2, i3);
        return true;
    }

    public void animateContentIn(int i, int i2) {
        this.messageView.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.messageView.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void animateContentOut(int i, int i2) {
        this.messageView.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.messageView.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(R.id.snackbar_text);
        this.actionView = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (updateViewsWithinLayout(1, r0, r0 - r1) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (updateViewsWithinLayout(0, r0, r0) != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165538(0x7f070162, float:1.7945296E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165537(0x7f070161, float:1.7945294E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.messageView
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x0029
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            if (r2 == 0) goto L_0x0043
            int r5 = r7.maxInlineActionWidth
            if (r5 <= 0) goto L_0x0043
            android.widget.Button r5 = r7.actionView
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.maxInlineActionWidth
            if (r5 <= r6) goto L_0x0043
            int r1 = r0 - r1
            boolean r0 = r7.updateViewsWithinLayout(r4, r0, r1)
            if (r0 == 0) goto L_0x004e
            goto L_0x004d
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            boolean r0 = r7.updateViewsWithinLayout(r3, r0, r0)
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r3 = r4
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            super.onMeasure(r8, r9)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.maxInlineActionWidth = i;
    }

    public void updateActionTextColorAlphaIfNeeded(float f) {
        if (f != 1.0f) {
            this.actionView.setTextColor(C1993m.m4357R(f, C1993m.m4344E(R.attr.colorSurface, this), this.actionView.getCurrentTextColor()));
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
