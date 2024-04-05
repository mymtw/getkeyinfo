package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.p327ui.shop.viewholder.C11271e0;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment;
import kotlin.jvm.internal.C19383o;
import p362hd.C12816d;
import p452te.C13397f;
import p466vc.C13597g;

/* renamed from: com.etsy.android.stylekit.views.o */
public final /* synthetic */ class C9064o implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19946b;

    /* renamed from: c */
    public final /* synthetic */ Object f19947c;

    public /* synthetic */ C9064o(Object obj, int i) {
        this.f19946b = i;
        this.f19947c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19946b) {
            case 0:
                CollageSwitch.m34898_init_$lambda1((CollageSwitch) this.f19947c, view);
                return;
            case 1:
                C12816d dVar = (C12816d) this.f19947c;
                int i = C12816d.f28299d;
                C19383o.m32797g(dVar, "this$0");
                dVar.f28300b.mo38043a(C13597g.C13698o1.f30203a);
                return;
            case 2:
                SearchFiltersV2Fragment.m35035onViewCreated$lambda5$lambda4((SearchFiltersV2Fragment) this.f19947c, view);
                return;
            case 3:
                C13397f fVar = (C13397f) this.f19947c;
                int i2 = C11271e0.f24883d;
                if (!fVar.f29339a) {
                    fVar.f29339a = true;
                    C11192q0 q0Var = fVar.f29340b;
                    boolean z = true ^ q0Var.f24756p;
                    C11192q0.C11193a aVar = q0Var.f24741a;
                    if (aVar != null) {
                        aVar.performVacationNotificationSubscription(z);
                        return;
                    }
                    return;
                }
                return;
            default:
                OtpPhoneFragment.m35138onViewCreated$lambda8((OtpPhoneFragment) this.f19947c, view);
                return;
        }
    }
}
