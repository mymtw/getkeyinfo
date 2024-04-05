package com.etsy.android.p327ui.favorites.add;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.CollectionPrivacyLevel;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.w */
public final /* synthetic */ class C9788w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f21641b;

    /* renamed from: c */
    public final /* synthetic */ Object f21642c;

    public /* synthetic */ C9788w(Object obj, int i) {
        this.f21641b = i;
        this.f21642c = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f21641b) {
            case 0:
                NameAListPresenter nameAListPresenter = (NameAListPresenter) this.f21642c;
                C19383o.m32797g(nameAListPresenter, "this$0");
                nameAListPresenter.f21574g = z ? CollectionPrivacyLevel.PRIVATE : CollectionPrivacyLevel.PUBLIC;
                return;
            default:
                PayPalBillingAgreementsToggle.m35234setupViews$lambda0((PayPalBillingAgreementsToggle) this.f21642c, compoundButton, z);
                return;
        }
    }
}
