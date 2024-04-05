package com.paypal.pyplcheckout.utils;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.profileinstaller.C3069k;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class AccessibilityUtilsKt {
    private static final long ACCESSIBILITY_DELAY = 700;

    public static final boolean isAccessibilityEnabled(Context context) {
        C19383o.m32797g(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(45);
        C19383o.m32796f(enabledAccessibilityServiceList, "it.getEnabledAccessibilityServiceList(types)");
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public static final void requestAccessibilityFocus(View view) {
        C19383o.m32797g(view, "<this>");
        view.performAccessibilityAction(64, (Bundle) null);
        view.sendAccessibilityEvent(4);
    }

    public static final void requestAccessibilityFocusDelayed(View view) {
        C19383o.m32797g(view, "<this>");
        new Handler(Looper.getMainLooper()).postDelayed(new C3069k(view, 4), ACCESSIBILITY_DELAY);
    }

    /* access modifiers changed from: private */
    /* renamed from: requestAccessibilityFocusDelayed$lambda-0  reason: not valid java name */
    public static final void m35461requestAccessibilityFocusDelayed$lambda0(View view) {
        C19383o.m32797g(view, "$this_requestAccessibilityFocusDelayed");
        requestAccessibilityFocus(view);
    }
}
