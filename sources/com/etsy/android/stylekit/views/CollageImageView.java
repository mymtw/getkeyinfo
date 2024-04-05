package com.etsy.android.stylekit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.p015ui.platform.C1864q;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;

public final class CollageImageView extends AppCompatImageView {
    public static final int $stable = 8;
    private final Runnable runA11yChecks;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageImageView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: runA11yChecks$lambda-0  reason: not valid java name */
    public static final void m34887runA11yChecks$lambda0(CollageImageView collageImageView) {
        C19383o.m32797g(collageImageView, "this$0");
        collageImageView.imageViewAccessibilityChecks(collageImageView);
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
        post(this.runA11yChecks);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.runA11yChecks);
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        if (isAttachedToWindow()) {
            post(this.runA11yChecks);
        }
    }

    public void setImportantForAccessibility(int i) {
        super.setImportantForAccessibility(i);
        if (isAttachedToWindow()) {
            post(this.runA11yChecks);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (isAttachedToWindow()) {
            post(this.runA11yChecks);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.runA11yChecks = new C1864q(this, 3);
    }
}
