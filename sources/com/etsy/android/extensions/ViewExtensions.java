package com.etsy.android.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.p327ui.view.StepIndicatorView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ViewExtensions {
    /* renamed from: a */
    public static final DisplayMetrics m12857a(View view) {
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = view.getContext();
        C19383o.m32796f(context, "this.context");
        Activity i = C1948d.m4277i(context);
        C19383o.m32795e(i, "null cannot be cast to non-null type android.app.Activity");
        WindowManager windowManager = i.getWindowManager();
        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: b */
    public static final boolean m12858b(StepIndicatorView stepIndicatorView, Button button) {
        if (stepIndicatorView == null || button == null) {
            return false;
        }
        int[] iArr = new int[2];
        stepIndicatorView.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], stepIndicatorView.getMeasuredWidth() + i, stepIndicatorView.getMeasuredHeight() + iArr[1]);
        int[] iArr2 = new int[2];
        button.getLocationOnScreen(iArr2);
        int i2 = iArr2[0];
        return rect.intersect(new Rect(i2, iArr2[1], button.getMeasuredWidth() + i2, button.getMeasuredHeight() + iArr2[1]));
    }

    /* renamed from: c */
    public static final void m12859c(View view, long j) {
        if (view != null) {
            view.setAlpha((view.getAlpha() > 1.0f ? 1 : (view.getAlpha() == 1.0f ? 0 : -1)) == 0 ? 0.0f : view.getAlpha());
            m12869m(view);
            view.animate().setDuration(j).alpha(1.0f).start();
        }
    }

    /* renamed from: d */
    public static final void m12860d(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    /* renamed from: e */
    public static final void m12861e(View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            C19383o.m32795e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    public static final void m12862f(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).toggleSoftInput(1, 0);
    }

    /* renamed from: g */
    public static final void m12863g(View view) {
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    /* renamed from: h */
    public static final void m12864h(View view, C19846a<C19394m> aVar) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewExtensions$onGlobalLayout$1(view, aVar));
    }

    /* renamed from: i */
    public static final void m12865i(View view, C8698l lVar, C19857l<? super View, C19394m> lVar2) {
        view.setOnClickListener(new ViewExtensions$trackingClick$2(lVar2, new C8698l[]{lVar}));
    }

    /* renamed from: j */
    public static final void m12866j(View view, C19857l<? super View, C19394m> lVar) {
        C19383o.m32797g(view, "<this>");
        C19383o.m32797g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        view.setOnClickListener(new ViewExtensions$trackingClick$1(lVar));
    }

    /* renamed from: k */
    public static final void m12867k(View view, boolean z, C19857l<? super View, C19394m> lVar) {
        view.setOnClickListener(new ViewExtensions$trackingClick$3(z, lVar, new C8698l[0]));
    }

    /* renamed from: l */
    public static final void m12868l(ImageView imageView, C19857l lVar) {
        C19383o.m32797g(imageView, "<this>");
        imageView.setOnLongClickListener(new ViewExtensions$trackingLongClick$1(lVar));
    }

    /* renamed from: m */
    public static final void m12869m(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    /* renamed from: n */
    public static final void m12870n(View view, C19846a<Boolean> aVar) {
        C19383o.m32797g(view, "<this>");
        if (aVar.invoke().booleanValue()) {
            m12869m(view);
        } else {
            m12860d(view);
        }
    }
}
