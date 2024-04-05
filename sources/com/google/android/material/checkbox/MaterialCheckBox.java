package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.R;

public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int DEF_STYLE_RES = 2132018597;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            int E = C1993m.m4344E(R.attr.colorControlActivated, this);
            int E2 = C1993m.m4344E(R.attr.colorSurface, this);
            int E3 = C1993m.m4344E(R.attr.colorOnSurface, this);
            iArr2[0] = C1993m.m4357R(1.0f, E2, E);
            iArr2[1] = C1993m.m4357R(0.54f, E2, E3);
            iArr2[2] = C1993m.m4357R(0.38f, E2, E3);
            iArr2[3] = C1993m.m4357R(0.38f, E2, E3);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r8 = p574gl.C17790a.m29918a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p610kp.C18161c.f39664G
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            boolean r10 = r9.hasValue(r6)
            if (r10 == 0) goto L_0x0026
            android.content.res.ColorStateList r8 = p507al.C14025c.m21582a(r8, r9, r6)
            r7.setButtonTintList(r8)
        L_0x0026:
            r8 = 1
            boolean r8 = r9.getBoolean(r8, r6)
            r7.useMaterialThemeColors = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
