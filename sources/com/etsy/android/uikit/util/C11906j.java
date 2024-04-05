package com.etsy.android.uikit.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import p357gf.C12794c;

/* renamed from: com.etsy.android.uikit.util.j */
public final class C11906j {
    /* renamed from: a */
    public static C12794c m19625a(FragmentManager fragmentManager) {
        int E = fragmentManager.mo10355E();
        if (E > 0) {
            return (C12794c) fragmentManager.mo10353C(fragmentManager.f6134d.get(E - 1).getName());
        }
        if (fragmentManager.mo10358H() != null && fragmentManager.mo10358H().size() > 0) {
            int size = fragmentManager.mo10358H().size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!(fragmentManager.mo10358H().get(size) instanceof C12794c));
            return (C12794c) fragmentManager.mo10358H().get(size);
        }
        return null;
    }

    /* renamed from: b */
    public static C12794c m19626b(FragmentManager fragmentManager) {
        if (fragmentManager.mo10358H().size() <= 0) {
            return null;
        }
        for (int size = fragmentManager.mo10358H().size() - 1; size >= 0; size--) {
            Fragment fragment = fragmentManager.mo10358H().get(size);
            if (fragment.isResumed() && (fragment instanceof C12794c)) {
                return (C12794c) fragmentManager.mo10358H().get(size);
            }
        }
        return null;
    }
}
