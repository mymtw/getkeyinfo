package com.etsy.android.p327ui;

import android.content.DialogInterface;
import com.etsy.android.p327ui.home.recentlyviewedpage.RecentlyViewedPageFragment;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.i0 */
public final /* synthetic */ class C10076i0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f22208b;

    /* renamed from: c */
    public final /* synthetic */ Object f22209c;

    public /* synthetic */ C10076i0(Object obj, int i) {
        this.f22208b = i;
        this.f22209c = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f22208b) {
            case 0:
                C19846a aVar = (C19846a) this.f22209c;
                C19383o.m32797g(aVar, "$exitCheckoutCallback");
                aVar.invoke();
                return;
            default:
                RecentlyViewedPageFragment.m34996confirmClearRecentlyViewed$lambda2((RecentlyViewedPageFragment) this.f22209c, dialogInterface, i);
                return;
        }
    }
}
