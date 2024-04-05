package com.etsy.android.p327ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19410j;
import p759nq.C19920b;

/* renamed from: com.etsy.android.ui.FragmentFindViewByIdDelegate */
final class FragmentFindViewByIdDelegate<T extends View> implements C19920b<Fragment, T>, C2857f {

    /* renamed from: b */
    public final int f19979b;

    /* renamed from: c */
    public T f19980c;

    public FragmentFindViewByIdDelegate(int i) {
        this.f19979b = i;
    }

    public final Object getValue(Object obj, C19410j jVar) {
        Fragment fragment = (Fragment) obj;
        C19383o.m32797g(fragment, "thisRef");
        C19383o.m32797g(jVar, "property");
        T t = this.f19980c;
        if (t == null) {
            t = fragment.requireView().findViewById(this.f19979b);
            this.f19980c = t;
            if (t != null) {
                fragment.getViewLifecycleOwner().getLifecycle().mo10733a(this);
            } else {
                throw new IllegalArgumentException(this.f19979b + " does not reference a View inside of " + fragment);
            }
        }
        return t;
    }

    public final void onDestroy(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        this.f19980c = null;
        sVar.getLifecycle().mo10735c(this);
    }
}
