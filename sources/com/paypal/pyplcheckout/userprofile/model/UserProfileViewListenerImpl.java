package com.paypal.pyplcheckout.userprofile.model;

import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalLogoutViewListener;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPoliciesViewListener;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPrivacyViewListener;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalProfileHeaderViewListener;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalTermsViewListener;
import com.paypal.pyplcheckout.userprofile.view.interfaces.UserProfileViewListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserProfileViewListenerImpl implements UserProfileViewListener {
    private PayPalLogoutViewListener payPalLogoutViewListener;
    private PayPalPoliciesViewListener payPalPoliciesViewListener;
    private PayPalPrivacyViewListener payPalPrivacyViewListener;
    private PayPalProfileHeaderViewListener payPalProfileHeaderViewListener;
    private PayPalTermsViewListener payPalTermsViewListener;

    public UserProfileViewListenerImpl() {
        this((PayPalLogoutViewListener) null, (PayPalPoliciesViewListener) null, (PayPalPrivacyViewListener) null, (PayPalProfileHeaderViewListener) null, (PayPalTermsViewListener) null, 31, (DefaultConstructorMarker) null);
    }

    public UserProfileViewListenerImpl(PayPalLogoutViewListener payPalLogoutViewListener2, PayPalPoliciesViewListener payPalPoliciesViewListener2, PayPalPrivacyViewListener payPalPrivacyViewListener2, PayPalProfileHeaderViewListener payPalProfileHeaderViewListener2, PayPalTermsViewListener payPalTermsViewListener2) {
        this.payPalLogoutViewListener = payPalLogoutViewListener2;
        this.payPalPoliciesViewListener = payPalPoliciesViewListener2;
        this.payPalPrivacyViewListener = payPalPrivacyViewListener2;
        this.payPalProfileHeaderViewListener = payPalProfileHeaderViewListener2;
        this.payPalTermsViewListener = payPalTermsViewListener2;
    }

    public void onPayPalBackArrowClick() {
        PayPalProfileHeaderViewListener payPalProfileHeaderViewListener2 = this.payPalProfileHeaderViewListener;
        if (payPalProfileHeaderViewListener2 != null) {
            payPalProfileHeaderViewListener2.onPayPalBackArrowClick();
        }
    }

    public void onPayPalLogoutClick() {
        PayPalLogoutViewListener payPalLogoutViewListener2 = this.payPalLogoutViewListener;
        if (payPalLogoutViewListener2 != null) {
            payPalLogoutViewListener2.onPayPalLogoutClick();
        }
    }

    public void onPayPalPoliciesClick() {
        PayPalPoliciesViewListener payPalPoliciesViewListener2 = this.payPalPoliciesViewListener;
        if (payPalPoliciesViewListener2 != null) {
            payPalPoliciesViewListener2.onPayPalPoliciesClick();
        }
    }

    public void onPayPalPrivacyClick() {
        PayPalPrivacyViewListener payPalPrivacyViewListener2 = this.payPalPrivacyViewListener;
        if (payPalPrivacyViewListener2 != null) {
            payPalPrivacyViewListener2.onPayPalPrivacyClick();
        }
    }

    public void onPayPalProfileImageClick() {
        PayPalProfileHeaderViewListener payPalProfileHeaderViewListener2 = this.payPalProfileHeaderViewListener;
        if (payPalProfileHeaderViewListener2 != null) {
            payPalProfileHeaderViewListener2.onPayPalProfileImageClick();
        }
    }

    public void onPayPalTermsClick() {
        PayPalTermsViewListener payPalTermsViewListener2 = this.payPalTermsViewListener;
        if (payPalTermsViewListener2 != null) {
            payPalTermsViewListener2.onPayPalTermsClick();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserProfileViewListenerImpl(com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalLogoutViewListener r5, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPoliciesViewListener r6, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPrivacyViewListener r7, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalProfileHeaderViewListener r8, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalTermsViewListener r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.userprofile.model.UserProfileViewListenerImpl.<init>(com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalLogoutViewListener, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPoliciesViewListener, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPrivacyViewListener, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalProfileHeaderViewListener, com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalTermsViewListener, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
