package com.etsy.android.stylekit.accessibility.navigation.extensions;

import android.support.p013v4.media.C0072d;
import android.view.View;
import androidx.compose.p015ui.platform.C1864q;
import androidx.core.view.C2364y;
import java.util.LinkedHashSet;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p411ob.C13148b;

public final class NavigationExtensionsKt {
    /* renamed from: a */
    public static final void m17420a(View view, long j) {
        C19383o.m32797g(view, "<this>");
        C1864q qVar = new C1864q(view, 2);
        view.addOnAttachStateChangeListener(new NavigationExtensionsKt$requestSystemAndAccessibilityFocus$1(view, qVar));
        view.postDelayed(qVar, j);
    }

    /* renamed from: b */
    public static final void m17421b(View view, int... iArr) {
        C19383o.m32797g(view, "<this>");
        int length = iArr.length;
        if (length >= 2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C19421p.m32930T(iArr.length));
            int i = 0;
            for (int valueOf : iArr) {
                linkedHashSet.add(Integer.valueOf(valueOf));
            }
            if (length <= C19327t.m32660p1(linkedHashSet).size()) {
                int i2 = length - 1;
                while (i < i2) {
                    View findViewById = view.findViewById(iArr[i]);
                    if (findViewById != null) {
                        i++;
                        View findViewById2 = view.findViewById(iArr[i]);
                        if (findViewById2 != null) {
                            C2364y.m5201p(findViewById, new C13148b(findViewById2, C2364y.m5189d(findViewById)));
                            if (!findViewById.isFocusable()) {
                                findViewById.setFocusable(true);
                            }
                            if (!findViewById2.isFocusable()) {
                                findViewById2.setFocusable(true);
                            }
                        } else {
                            StringBuilder h = C0072d.m201h("The reference of ");
                            h.append(view.getResources().getResourceName(iArr[i]));
                            h.append(" no exist in this layout");
                            throw new NullPointerException(h.toString());
                        }
                    } else {
                        StringBuilder h2 = C0072d.m201h("The reference of ");
                        h2.append(view.getResources().getResourceName(iArr[i]));
                        h2.append(" no exist in this layout");
                        throw new NullPointerException(h2.toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Duplicate view IDs are not supported");
        }
        throw new IllegalArgumentException("This method requires 2 or more views to works.");
    }
}
