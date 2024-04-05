package com.etsy.android.p327ui.home.home;

import androidx.activity.result.C0118a;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import p337de.C12647a;

/* renamed from: com.etsy.android.ui.home.home.b */
public final /* synthetic */ class C9991b implements C0118a {

    /* renamed from: b */
    public final /* synthetic */ int f21990b;

    /* renamed from: c */
    public final /* synthetic */ TrackingBaseFragment f21991c;

    public /* synthetic */ C9991b(TrackingBaseFragment trackingBaseFragment, int i) {
        this.f21990b = i;
        this.f21991c = trackingBaseFragment;
    }

    /* renamed from: a */
    public final void mo413a(Object obj) {
        switch (this.f21990b) {
            case 0:
                HomeFragment.m34994reviewActionResult$lambda5((HomeFragment) this.f21991c, (C12647a) obj);
                return;
            default:
                HomePagerFragment.m35006signInResult$lambda1((HomePagerFragment) this.f21991c, (C12647a) obj);
                return;
        }
    }
}
