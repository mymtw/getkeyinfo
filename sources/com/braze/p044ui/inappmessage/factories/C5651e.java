package com.braze.p044ui.inappmessage.factories;

import android.view.View;
import androidx.activity.C0114h;
import com.etsy.android.stylekit.views.CollageActionGroupItem;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment;
import com.paypal.checkout.paymentbutton.PaymentButton;
import com.paypal.platform.authsdk.stepup.p538ui.StepUpFragment;
import kotlin.jvm.internal.C19383o;
import p114g4.C6861b;

/* renamed from: com.braze.ui.inappmessage.factories.e */
public final /* synthetic */ class C5651e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f12070b;

    /* renamed from: c */
    public final /* synthetic */ Object f12071c;

    public /* synthetic */ C5651e(Object obj, int i) {
        this.f12070b = i;
        this.f12071c = obj;
    }

    public final void onClick(View view) {
        switch (this.f12070b) {
            case 0:
                C19383o.m32797g((C0114h) this.f12071c, "this$0");
                C6861b.m13319e().getClass();
                return;
            case 1:
                CollageActionGroupItem.m34881setOnCheckedListener$lambda0((CollageActionGroupItem) this.f12071c, view);
                return;
            case 2:
                OtpPhoneFragment.m35139onViewCreated$lambda9((OtpPhoneFragment) this.f12071c, view);
                return;
            case 3:
                PaymentButton.m35147initClickListener$lambda7((PaymentButton) this.f12071c, view);
                return;
            default:
                StepUpFragment.m35151onViewCreated$lambda4((StepUpFragment) this.f12071c, view);
                return;
        }
    }
}
