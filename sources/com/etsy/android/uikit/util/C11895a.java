package com.etsy.android.uikit.util;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* renamed from: com.etsy.android.uikit.util.a */
public final class C11895a {
    /* renamed from: a */
    public static void m19620a(FragmentManager fragmentManager, HashMap<View, Fragment> hashMap) {
        List<Fragment> H = fragmentManager.mo10358H();
        if (H != null) {
            for (Fragment next : H) {
                if (next != null) {
                    if (next.getView() != null) {
                        hashMap.put(next.getView(), next);
                    }
                    try {
                        FragmentManager childFragmentManager = next.getChildFragmentManager();
                        if (!(childFragmentManager == null || childFragmentManager.mo10358H() == null)) {
                            m19620a(childFragmentManager, hashMap);
                        }
                    } catch (IllegalStateException e) {
                        C8694h.f19097a.mo21309d("Trying to get Child FragmentManager for Fragment not attached yet", e);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static C8703p m19621b(View view) {
        Fragment fragment;
        C8694h.f19097a.mo21310e("findViewTracker start");
        Context context = view.getContext();
        HashMap hashMap = new HashMap();
        if (context instanceof FragmentActivity) {
            m19620a(((FragmentActivity) context).getSupportFragmentManager(), hashMap);
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof View) && (fragment = (Fragment) hashMap.get(parent)) != null && (fragment instanceof C8693g)) {
                    return ((C8693g) fragment).getAnalyticsContext();
                }
            }
        }
        if (context instanceof C8693g) {
            return ((C8693g) view.getContext()).getAnalyticsContext();
        }
        return null;
    }
}
