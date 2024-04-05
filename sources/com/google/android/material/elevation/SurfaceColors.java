package com.google.android.material.elevation;

import android.content.Context;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.R;
import p688uk.C18602a;

public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);
    
    private final int elevationResId;

    private SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public static int getColorForElevation(Context context, float f) {
        return new C18602a(context).mo70112a(f, C1993m.m4343D(R.attr.colorSurface, context, 0));
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
