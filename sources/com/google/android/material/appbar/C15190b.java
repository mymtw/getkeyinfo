package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p088e1.C6697d;

/* renamed from: com.google.android.material.appbar.b */
public final class C15190b implements C6697d {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f34081a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f34082b;

    /* renamed from: c */
    public final /* synthetic */ View f34083c;

    /* renamed from: d */
    public final /* synthetic */ int f34084d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f34085e;

    public C15190b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f34085e = baseBehavior;
        this.f34081a = coordinatorLayout;
        this.f34082b = appBarLayout;
        this.f34083c = view;
        this.f34084d = i;
    }

    /* renamed from: a */
    public final boolean mo10006a(View view) {
        this.f34085e.mo52940l(this.f34081a, this.f34082b, this.f34083c, this.f34084d, new int[]{0, 0});
        return true;
    }
}
