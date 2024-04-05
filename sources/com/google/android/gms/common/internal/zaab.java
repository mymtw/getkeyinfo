package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import com.etsy.android.R;
import com.google.android.gms.common.util.DeviceProperties;

public final class zaab extends Button {
    public zaab(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int zaa = zaa(i2, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
        int zaa2 = zaa(i2, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
        if (i == 0 || i == 1) {
            zaa = zaa2;
        } else if (i != 2) {
            throw new IllegalStateException(C0072d.m200g(32, "Unknown button size: ", i));
        }
        Drawable drawable = resources.getDrawable(zaa);
        drawable.setTintList(resources.getColorStateList(R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zaa(i2, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light))));
        if (i == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException(C0072d.m200g(32, "Unknown button size: ", i));
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }

    private zaab(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    private static int zaa(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(C0072d.m200g(33, "Unknown color scheme: ", i));
    }
}
