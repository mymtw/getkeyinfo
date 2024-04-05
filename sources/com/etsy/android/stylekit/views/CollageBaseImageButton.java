package com.etsy.android.stylekit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;

public final class CollageBaseImageButton extends AppCompatImageButton {
    public static final int $stable = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageBaseImageButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageBaseImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageBaseImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
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
        imageButtonAccessibilityChecks(this);
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        imageButtonAccessibilityChecks(this);
    }

    public void setImportantForAccessibility(int i) {
        super.setImportantForAccessibility(i);
        imageButtonAccessibilityChecks(this);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        imageButtonAccessibilityChecks(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageBaseImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
