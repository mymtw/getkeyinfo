package com.etsy.android.p327ui.search.container;

import androidx.fragment.app.FragmentManager;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.container.c */
public final /* synthetic */ class C10743c implements FragmentManager.C2725m {

    /* renamed from: b */
    public final /* synthetic */ SearchContainerFragment f23675b;

    /* renamed from: c */
    public final /* synthetic */ C19846a f23676c;

    public /* synthetic */ C10743c(SearchContainerFragment searchContainerFragment, C19846a aVar) {
        this.f23675b = searchContainerFragment;
        this.f23676c = aVar;
    }

    public final void onBackStackChanged() {
        SearchContainerFragment.m35028addBackstackPopListener$lambda4(this.f23675b, this.f23676c);
    }
}
