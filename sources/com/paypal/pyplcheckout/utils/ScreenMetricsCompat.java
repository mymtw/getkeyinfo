package com.paypal.pyplcheckout.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class ScreenMetricsCompat {
    public static final ScreenMetricsCompat INSTANCE = new ScreenMetricsCompat();
    private static final Api api = (Build.VERSION.SDK_INT >= 30 ? new ApiLevel30() : new ApiLevel23());

    public static class Api {
        public Size getScreenSize(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            return new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        }
    }

    public static final class ApiLevel23 extends Api {
        public Size getScreenSize(Context context) {
            DisplayMetrics displayMetrics;
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
            if (defaultDisplay != null) {
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
            } else {
                displayMetrics = Resources.getSystem().getDisplayMetrics();
            }
            return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
    }

    public static final class ApiLevel30 extends Api {
        public Size getScreenSize(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            C19383o.m32796f(currentWindowMetrics, "context.getSystemService…ava).currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.navigationBars() | WindowInsets$Type.displayCutout());
            C19383o.m32796f(insetsIgnoringVisibility, "metrics.windowInsets.get…layCutout()\n            )");
            return new Size(currentWindowMetrics.getBounds().width() - (insetsIgnoringVisibility.right + insetsIgnoringVisibility.left), currentWindowMetrics.getBounds().height() - (insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom));
        }
    }

    private ScreenMetricsCompat() {
    }

    public final Size getScreenSize(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return api.getScreenSize(context);
    }
}
