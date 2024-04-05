package com.google.android.datatransport.runtime.scheduling.persistence;

import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLogoutView;
import com.paypal.pyplcheckout.utils.DialogMaker;
import p513bj.C14055g;
import p513bj.C14060k;
import p594jh.C17884a1;
import p649pm.C18400e;
import p649pm.C18415r;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.i */
public final /* synthetic */ class C6591i implements C14060k.C14062b, DialogMaker.PositiveClickListener, C18400e {

    /* renamed from: b */
    public final /* synthetic */ Object f14550b;

    public /* synthetic */ C6591i(Object obj) {
        this.f14550b = obj;
    }

    /* renamed from: b */
    public void mo36b(Object obj, C14055g gVar) {
        ((C17884a1.C17886b) obj).onEvents((C17884a1) this.f14550b, new C17884a1.C17887c(gVar));
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        return this.f14550b;
    }

    public void onPositiveClick(DialogMaker dialogMaker) {
        PayPalLogoutView.m35449handleLogoutClicked$lambda1((PayPalLogoutView) this.f14550b, dialogMaker);
    }
}
