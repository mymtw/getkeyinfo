package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p260v0.C8184a;

public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = 2132018629;
    private int color;
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean z = true;
        if (C2364y.C2369e.m5233d(this) != 1) {
            z = false;
        }
        int i3 = z ? this.insetEnd : this.insetStart;
        if (z) {
            i2 = getWidth();
            i = this.insetStart;
        } else {
            i2 = getWidth();
            i = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i3, 0, i2 - i, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.thickness;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.color != i) {
            this.color = i;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setDividerColor(C8184a.C8188d.m16468a(context, i));
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.thickness != i) {
            this.thickness = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r8 = p574gl.C17790a.m29918a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r7.dividerDrawable = r0
            int[] r2 = p610kp.C18161c.f39665H
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            android.content.res.Resources r10 = r7.getResources()
            r0 = 2131165936(0x7f0702f0, float:1.7946103E38)
            int r10 = r10.getDimensionPixelSize(r0)
            r0 = 3
            int r10 = r9.getDimensionPixelSize(r0, r10)
            r7.thickness = r10
            r10 = 2
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.insetStart = r10
            r10 = 1
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.insetEnd = r10
            android.content.res.ColorStateList r8 = p507al.C14025c.m21582a(r8, r9, r6)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
