package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
import p088e1.C6689b;

public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasFocusableAncestor(C6689b bVar, View view) {
        if (bVar == null || view == null) {
            return false;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        ViewParent f = C2364y.C2368d.m5216f(view);
        if (!(f instanceof View)) {
            return false;
        }
        C6689b j = C6689b.m13056j();
        try {
            ((View) f).onInitializeAccessibilityNodeInfo(j.f14759a);
            if (isAccessibilityFocusable(j, (View) f)) {
                return true;
            }
            if (hasFocusableAncestor(j, (View) f)) {
                j.mo18861k();
                return true;
            }
            j.mo18861k();
            return false;
        } finally {
            j.mo18861k();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(C6689b bVar, View view) {
        if (!(bVar == null || view == null || !(view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    C6689b j = C6689b.m13056j();
                    try {
                        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                        childAt.onInitializeAccessibilityNodeInfo(j.f14759a);
                        if (!isAccessibilityFocusable(j, childAt)) {
                            if (isSpeakingNode(j, childAt)) {
                                j.mo18861k();
                                return true;
                            }
                        }
                    } finally {
                        j.mo18861k();
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(C6689b bVar) {
        if (bVar == null) {
            return false;
        }
        return !TextUtils.isEmpty(bVar.mo18858h()) || !TextUtils.isEmpty(bVar.mo18856f());
    }

    public static boolean isAccessibilityFocusable(C6689b bVar, View view) {
        if (bVar == null || view == null || !bVar.mo18860i()) {
            return false;
        }
        if (isActionableForAccessibility(bVar)) {
            return true;
        }
        return isTopLevelScrollItem(bVar, view) && isSpeakingNode(bVar, view);
    }

    public static boolean isActionableForAccessibility(C6689b bVar) {
        if (bVar == null) {
            return false;
        }
        if (bVar.f14759a.isClickable() || bVar.f14759a.isLongClickable() || bVar.f14759a.isFocusable()) {
            return true;
        }
        List<C6689b.C6690a> d = bVar.mo18853d();
        return d.contains(16) || d.contains(32) || d.contains(1);
    }

    public static boolean isSpeakingNode(C6689b bVar, View view) {
        if (bVar == null || view == null || !bVar.mo18860i()) {
            return false;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int c = C2364y.C2368d.m5213c(view);
        if (c == 4) {
            return false;
        }
        if (c != 2 || bVar.f14759a.getChildCount() > 0) {
            return bVar.f14759a.isCheckable() || hasText(bVar) || hasNonActionableSpeakingDescendants(bVar, view);
        }
        return false;
    }

    public static boolean isTopLevelScrollItem(C6689b bVar, View view) {
        if (bVar == null || view == null) {
            return false;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        View view2 = (View) C2364y.C2368d.m5216f(view);
        if (view2 == null) {
            return false;
        }
        if (bVar.f14759a.isScrollable()) {
            return true;
        }
        List<C6689b.C6690a> d = bVar.mo18853d();
        if (d.contains(Integer.valueOf(RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT)) || d.contains(8192)) {
            return true;
        }
        if (view2 instanceof Spinner) {
            return false;
        }
        return (view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView);
    }
}
