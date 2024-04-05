package com.etsy.android.stylekit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.C0162k;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageBaseImageButton;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.stylekit.views.CollageImageView;
import com.etsy.android.stylekit.views.CollageTextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CollageViewInflater extends C0162k {
    public static final int $stable = 0;

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attrs");
        return new CollageButton(context, attributeSet);
    }

    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new CollageBaseImageButton(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new CollageImageView(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final LinearProgressIndicator createProgressBarView(Context context, AttributeSet attributeSet) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new LinearProgressIndicator(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new CollageTextView(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        if (context != null && C19383o.m32792b(str, "ProgressBar")) {
            return createProgressBarView(context, attributeSet);
        }
        return null;
    }
}
