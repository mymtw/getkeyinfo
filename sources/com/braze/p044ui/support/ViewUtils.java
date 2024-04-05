package com.braze.p044ui.support;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C2298e;
import androidx.core.view.C2348w0;
import com.appboy.Constants;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.support.ViewUtils */
public final class ViewUtils {

    /* renamed from: a */
    public static final String f12100a = C19383o.m32802l("ViewUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: a */
    public static final double m11475a(Context context, double d) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return d * ((double) context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public static final int m11476b(C2348w0 w0Var) {
        C19383o.m32797g(w0Var, "windowInsets");
        C2298e a = w0Var.mo8941a();
        return Math.max(a == null ? 0 : a.mo8889a(), w0Var.mo8942b(7).f18323d);
    }

    /* renamed from: c */
    public static final int m11477c(C2348w0 w0Var) {
        C19383o.m32797g(w0Var, "windowInsets");
        C2298e a = w0Var.mo8941a();
        return Math.max(a == null ? 0 : a.mo8890b(), w0Var.mo8942b(7).f18320a);
    }

    /* renamed from: d */
    public static final int m11478d(C2348w0 w0Var) {
        C19383o.m32797g(w0Var, "windowInsets");
        C2298e a = w0Var.mo8941a();
        return Math.max(a == null ? 0 : a.mo8891c(), w0Var.mo8942b(7).f18322c);
    }

    /* renamed from: e */
    public static final int m11479e(C2348w0 w0Var) {
        C19383o.m32797g(w0Var, "windowInsets");
        C2298e a = w0Var.mo8941a();
        return Math.max(a == null ? 0 : a.mo8892d(), w0Var.mo8942b(7).f18321b);
    }

    /* renamed from: f */
    public static final boolean m11480f(int i, Orientation orientation) {
        if (i == 2 && orientation == Orientation.LANDSCAPE) {
            BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.D, (Throwable) null, ViewUtils$isCurrentOrientationValid$1.INSTANCE, 12);
            return true;
        } else if (i == 1 && orientation == Orientation.PORTRAIT) {
            BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.D, (Throwable) null, ViewUtils$isCurrentOrientationValid$2.INSTANCE, 12);
            return true;
        } else {
            BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.D, (Throwable) null, new ViewUtils$isCurrentOrientationValid$3(i, orientation), 12);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m11481g(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: h */
    public static final boolean m11482h(Activity activity) {
        C19383o.m32797g(activity, "<this>");
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    /* renamed from: i */
    public static final void m11483i(View view) {
        if (view == null) {
            BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.D, (Throwable) null, ViewUtils$removeViewFromParent$1.INSTANCE, 12);
        }
        if ((view == null ? null : view.getParent()) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView(view);
                BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.D, (Throwable) null, new ViewUtils$removeViewFromParent$2(view, viewGroup), 12);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: j */
    public static final void m11484j(Activity activity, int i) {
        C19383o.m32797g(activity, "<this>");
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.E, e, new ViewUtils$setActivityRequestedOrientation$1(i, activity), 8);
        }
    }

    /* renamed from: k */
    public static final void m11485k(View view) {
        C19383o.m32797g(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            BrazeLogger.m11283e(f12100a, BrazeLogger.Priority.E, e, ViewUtils$setFocusableInTouchModeAndRequestFocus$1.INSTANCE, 8);
        }
    }
}
