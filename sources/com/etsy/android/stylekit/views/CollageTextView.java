package com.etsy.android.stylekit.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0317g;
import androidx.appcompat.widget.C0336n0;
import androidx.appcompat.widget.C0359y;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

@SuppressLint({"RestrictedApi"})
public class CollageTextView extends AppCompatTextView {
    public static final int $stable = 8;
    private C0336n0 drawableTint;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTextView(Context context) {
        this(context, (AttributeSet) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    private final void applyCompoundDrawableTint(Drawable drawable, C0336n0 n0Var) {
        if (drawable == null) {
            return;
        }
        if ((!C0359y.m994a(drawable) || drawable.mutate() == drawable) && n0Var != null) {
            boolean z = n0Var.f865d;
            if (z || n0Var.f864c) {
                ColorStateList colorStateList = z ? n0Var.f862a : null;
                PorterDuff.Mode mode = n0Var.f864c ? n0Var.f863b : PorterDuff.Mode.SRC_IN;
                int[] drawableState = getDrawableState();
                C19383o.m32796f(drawableState, "drawableState");
                drawable.setColorFilter(createTintFilter(colorStateList, mode, drawableState));
                return;
            }
            drawable.clearColorFilter();
        }
    }

    private final void applyCompoundDrawablesTints() {
        if (this.drawableTint != null) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            C19383o.m32796f(compoundDrawablesRelative, "compoundDrawablesRelative");
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.drawableTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[1], this.drawableTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.drawableTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[3], this.drawableTint);
        }
    }

    private final PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return C0317g.m821c(colorStateList.getColorForState(iArr, 0), mode);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        applyCompoundDrawablesTints();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0336n0 n0Var = this.drawableTint;
        if (n0Var != null) {
            return n0Var.f862a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0336n0 n0Var = this.drawableTint;
        if (n0Var != null) {
            return n0Var.f863b;
        }
        return null;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        if (this.drawableTint == null) {
            this.drawableTint = new C0336n0();
        }
        C0336n0 n0Var = this.drawableTint;
        if (n0Var != null) {
            n0Var.f862a = colorStateList;
        }
        if (n0Var != null) {
            n0Var.f865d = colorStateList != null;
        }
        applyCompoundDrawablesTints();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        if (this.drawableTint == null) {
            this.drawableTint = new C0336n0();
        }
        C0336n0 n0Var = this.drawableTint;
        if (n0Var != null) {
            n0Var.f863b = mode;
        }
        if (n0Var != null) {
            n0Var.f864c = mode != null;
        }
        applyCompoundDrawablesTints();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        applyCompoundDrawablesTints();
    }
}
