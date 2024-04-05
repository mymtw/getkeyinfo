package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.common.android.AccessibilityUtil;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.WeakHashMap;
import p088e1.C6689b;

public final class AccessibilityNodeInfoWrapper {
    public static C6689b createNodeInfoFromView(View view) {
        C6689b j = C6689b.m13056j();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        view.onInitializeAccessibilityNodeInfo(j.f14759a);
        return j;
    }

    public static String getActions(View view) {
        C6689b createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (C6689b.C6690a next : createNodeInfoFromView.mo18853d()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int a = next.mo18875a();
                if (a == 1) {
                    sb.append("focus");
                } else if (a != 2) {
                    switch (a) {
                        case 4:
                            sb.append("select");
                            break;
                        case 8:
                            sb.append("clear-selection");
                            break;
                        case 16:
                            sb.append("click");
                            break;
                        case 32:
                            sb.append("long-click");
                            break;
                        case 64:
                            sb.append("accessibility-focus");
                            break;
                        case 128:
                            sb.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb.append("next-at-movement-granularity");
                            break;
                        case RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN:
                            sb.append("previous-at-movement-granularity");
                            break;
                        case RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE:
                            sb.append("next-html-element");
                            break;
                        case RecyclerView.C3084b0.FLAG_MOVED:
                            sb.append("previous-html-element");
                            break;
                        case RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT:
                            sb.append("scroll-forward");
                            break;
                        case 8192:
                            sb.append("scroll-backward");
                            break;
                        case PrimitiveArrayBuilder.SMALL_CHUNK_SIZE /*16384*/:
                            sb.append("copy");
                            break;
                        case 32768:
                            sb.append("paste");
                            break;
                        case 65536:
                            sb.append("cut");
                            break;
                        case 131072:
                            sb.append("set-selection");
                            break;
                        default:
                            CharSequence b = next.mo18876b();
                            if (b == null) {
                                sb.append("unknown");
                                break;
                            } else {
                                sb.append(b);
                                break;
                            }
                    }
                } else {
                    sb.append("clear-focus");
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            createNodeInfoFromView.mo18861k();
        }
    }

    public static CharSequence getDescription(View view) {
        C6689b createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence f = createNodeInfoFromView.mo18856f();
            CharSequence h = createNodeInfoFromView.mo18858h();
            boolean z = !TextUtils.isEmpty(h);
            boolean z2 = view instanceof EditText;
            if (!TextUtils.isEmpty(f) && (!z2 || !z)) {
                return f;
            }
            if (z) {
                createNodeInfoFromView.mo18861k();
                return h;
            }
            String str = null;
            if (view instanceof ViewGroup) {
                StringBuilder sb = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C6689b j = C6689b.m13056j();
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    childAt.onInitializeAccessibilityNodeInfo(j.f14759a);
                    CharSequence description = (!AccessibilityUtil.isSpeakingNode(j, childAt) || AccessibilityUtil.isAccessibilityFocusable(j, childAt)) ? null : getDescription(childAt);
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    j.mo18861k();
                }
                if (sb.length() > 0) {
                    str = sb.toString();
                }
                createNodeInfoFromView.mo18861k();
                return str;
            }
            createNodeInfoFromView.mo18861k();
            return null;
        } finally {
            createNodeInfoFromView.mo18861k();
        }
    }

    public static String getFocusableReasons(View view) {
        C6689b createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean hasText = AccessibilityUtil.hasText(createNodeInfoFromView);
            boolean isCheckable = createNodeInfoFromView.f14759a.isCheckable();
            boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(createNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(createNodeInfoFromView)) {
                if (createNodeInfoFromView.f14759a.getChildCount() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    createNodeInfoFromView.mo18861k();
                    return "View is actionable and has a description.";
                } else if (isCheckable) {
                    createNodeInfoFromView.mo18861k();
                    return "View is actionable and checkable.";
                } else if (hasNonActionableSpeakingDescendants) {
                    createNodeInfoFromView.mo18861k();
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(createNodeInfoFromView, view)) {
                if (hasText) {
                    createNodeInfoFromView.mo18861k();
                    return "View is a direct child of a scrollable container and has a description.";
                } else if (isCheckable) {
                    createNodeInfoFromView.mo18861k();
                    return "View is a direct child of a scrollable container and is checkable.";
                } else if (hasNonActionableSpeakingDescendants) {
                    createNodeInfoFromView.mo18861k();
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (hasText) {
                createNodeInfoFromView.mo18861k();
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            createNodeInfoFromView.mo18861k();
            return null;
        } finally {
            createNodeInfoFromView.mo18861k();
        }
    }

    public static boolean getIgnored(View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int c = C2364y.C2368d.m5213c(view);
        if (c == 2 || c == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C2364y.C2368d.m5213c((View) parent) == 4) {
                return true;
            }
        }
        C6689b createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.mo18860i()) {
                return true;
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                if (createNodeInfoFromView.f14759a.getChildCount() <= 0) {
                    createNodeInfoFromView.mo18861k();
                    return false;
                } else if (AccessibilityUtil.isSpeakingNode(createNodeInfoFromView, view)) {
                    createNodeInfoFromView.mo18861k();
                    return false;
                } else {
                    createNodeInfoFromView.mo18861k();
                    return true;
                }
            } else if (AccessibilityUtil.hasFocusableAncestor(createNodeInfoFromView, view) || !AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.mo18861k();
                return true;
            } else {
                createNodeInfoFromView.mo18861k();
                return false;
            }
        } finally {
            createNodeInfoFromView.mo18861k();
        }
    }

    public static String getIgnoredReasons(View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int c = C2364y.C2368d.m5213c(view);
        if (c == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (c == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C2364y.C2368d.m5213c((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        C6689b createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.mo18860i()) {
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                createNodeInfoFromView.mo18861k();
                return "View is actionable, but has no description.";
            } else if (AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.mo18861k();
                return "View is not actionable, and an ancestor View has co-opted its description.";
            } else {
                createNodeInfoFromView.mo18861k();
                return "View is not actionable and has no description.";
            }
        } finally {
            createNodeInfoFromView.mo18861k();
        }
    }

    public static boolean getIsAccessibilityFocused(View view) {
        C6689b createNodeInfoFromView = createNodeInfoFromView(view);
        boolean isAccessibilityFocused = createNodeInfoFromView.f14759a.isAccessibilityFocused();
        createNodeInfoFromView.mo18861k();
        return isAccessibilityFocused;
    }
}
