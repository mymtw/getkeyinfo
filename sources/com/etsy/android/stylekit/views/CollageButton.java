package com.etsy.android.stylekit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.C19383o;
import p388lb.C13006a;

public final class CollageButton extends MaterialButton {
    public static final int $stable = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageButton(Context context) {
        this(context, (AttributeSet) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void buttonAccessibilityChecks(Button button) {
        C13006a.m20716e(button);
    }

    public void imageButtonAccessibilityChecks(ImageButton imageButton) {
        C13006a.m20722k(imageButton);
    }

    public void imageViewAccessibilityChecks(ImageView imageView) {
        C13006a.m20723l(imageView);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        buttonAccessibilityChecks(this);
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        buttonAccessibilityChecks(this);
    }

    public void setImportantForAccessibility(int i) {
        super.setImportantForAccessibility(i);
        buttonAccessibilityChecks(this);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        buttonAccessibilityChecks(this);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        buttonAccessibilityChecks(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.clg_button_tertiary_on_light);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
