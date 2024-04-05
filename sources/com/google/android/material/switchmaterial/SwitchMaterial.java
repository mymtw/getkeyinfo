package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p688uk.C18602a;

public class SwitchMaterial extends SwitchCompat {
    private static final int DEF_STYLE_RES = 2132018599;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private final C18602a elevationOverlayProvider;
    private ColorStateList materialThemeColorsThumbTintList;
    private ColorStateList materialThemeColorsTrackTintList;
    private boolean useMaterialThemeColors;

    public SwitchMaterial(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.materialThemeColorsThumbTintList == null) {
            int E = C1993m.m4344E(R.attr.colorSurface, this);
            int E2 = C1993m.m4344E(R.attr.colorControlActivated, this);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.elevationOverlayProvider.f41085a) {
                float f = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    f += C2364y.C2373i.m5262i((View) parent);
                }
                dimension += f;
            }
            int b = this.elevationOverlayProvider.mo70113b(dimension, E);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C1993m.m4357R(1.0f, E, E2);
            iArr2[1] = b;
            iArr2[2] = C1993m.m4357R(0.38f, E, E2);
            iArr2[3] = b;
            this.materialThemeColorsThumbTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsThumbTintList;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.materialThemeColorsTrackTintList == null) {
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            int E = C1993m.m4344E(R.attr.colorSurface, this);
            int E2 = C1993m.m4344E(R.attr.colorControlActivated, this);
            int E3 = C1993m.m4344E(R.attr.colorOnSurface, this);
            iArr2[0] = C1993m.m4357R(0.54f, E, E2);
            iArr2[1] = C1993m.m4357R(0.32f, E, E3);
            iArr2[2] = C1993m.m4357R(0.12f, E, E2);
            iArr2[3] = C1993m.m4357R(0.12f, E, E3);
            this.materialThemeColorsTrackTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTrackTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.useMaterialThemeColors && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r7 = p574gl.C17790a.m29918a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            uk.a r7 = new uk.a
            r7.<init>(r0)
            r6.elevationOverlayProvider = r7
            int[] r2 = p610kp.C18161c.f39692j1
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            boolean r7 = r8.getBoolean(r7, r7)
            r6.useMaterialThemeColors = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
