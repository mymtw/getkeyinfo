package com.etsy.android.p327ui.user.addresses.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.stylekit.views.CollageSwitch;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressToggleSwitchViewHolder */
public final class AddressToggleSwitchViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<C11430n, C19394m> f25278b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressToggleSwitchViewHolder(CollageSwitch collageSwitch, C19857l lVar) {
        super(collageSwitch);
        C19383o.m32797g(lVar, "eventHandler");
        this.f25278b = lVar;
    }

    /* renamed from: e */
    public final void mo37309e(C11396e eVar) {
        if (eVar instanceof C11396e.C11399c) {
            View view = this.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageSwitch");
            CollageSwitch collageSwitch = (CollageSwitch) view;
            C11396e.C11399c cVar = (C11396e.C11399c) eVar;
            collageSwitch.setTitle(this.itemView.getResources().getString(cVar.f25126a.f25162c));
            Boolean bool = cVar.f25126a.f25165f;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            collageSwitch.setChecked(booleanValue);
            collageSwitch.setEnabled(!booleanValue);
            collageSwitch.setOnCheckedChangeListener((C19861p<? super View, ? super Boolean, C19394m>) new AddressToggleSwitchViewHolder$bind$1(this, eVar));
        }
    }
}
