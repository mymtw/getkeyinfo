package com.braze.p044ui.inappmessage.utils;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p114g4.C6861b;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageViewUtils */
public final class InAppMessageViewUtils {

    /* renamed from: a */
    public static final InAppMessageViewUtils f12086a = new InAppMessageViewUtils();

    /* renamed from: a */
    public static final void m11461a() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, f12086a, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1.INSTANCE, 7);
        C6861b.m13319e().mo18985f(true);
    }

    /* renamed from: b */
    public static final void m11462b(Drawable drawable, int i) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f12086a, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageViewUtils$setDrawableColor$1.INSTANCE, 7);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                C19383o.m32796f(drawable2, "drawable.getDrawable(0)");
                m11462b(drawable2, i);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        } else if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: c */
    public static final void m11463c(Context context, String str, int i, int i2, TextView textView) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(textView, "textView");
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                textView.setTextColor(i);
                if (textView.getBackground() != null) {
                    Drawable background = textView.getBackground();
                    C19383o.m32796f(background, "textView.background");
                    m11462b(background, i2);
                    return;
                }
                textView.setBackgroundColor(i2);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f12086a, BrazeLogger.Priority.E, e, InAppMessageViewUtils$setIcon$1.INSTANCE, 4);
            }
        }
    }

    /* renamed from: d */
    public static final void m11464d(TextView textView, TextAlign textAlign) {
        C19383o.m32797g(textView, "textView");
        C19383o.m32797g(textAlign, "textAlign");
        if (textAlign == TextAlign.START) {
            textView.setGravity(8388611);
        } else if (textAlign == TextAlign.END) {
            textView.setGravity(8388613);
        } else if (textAlign == TextAlign.CENTER) {
            textView.setGravity(17);
        }
    }

    /* renamed from: e */
    public static final void m11465e(int i, View view) {
        C19383o.m32797g(view, "view");
        Drawable background = view.getBackground();
        C19383o.m32796f(background, "view.background");
        if (Build.VERSION.SDK_INT >= 29) {
            background.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
        } else {
            background.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        view.getBackground().setAlpha(Color.alpha(i));
    }
}
