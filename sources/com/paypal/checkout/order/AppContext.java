package com.paypal.checkout.order;

import com.paypal.checkout.createorder.ShippingPreference;
import com.paypal.checkout.createorder.UserAction;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class AppContext {
    @C18417a("brand_name")
    private final String brandName;
    @C18417a("cancel_url")
    private final String cancelUrl;
    @C18417a("landing_page")
    private final String landingPage;
    private final String locale;
    @C18417a("return_url")
    private final String returnUrl;
    @C18417a("shipping_preference")
    private final ShippingPreference shippingPreference;
    @C18417a("user_action")
    private final UserAction userAction;

    public static final class Builder {
        private String brandName;
        private String cancelUrl;
        private String landingPage;
        private String locale;
        private String returnUrl;
        private ShippingPreference shippingPreference;
        private UserAction userAction;

        public final Builder brandName(String str) {
            this.brandName = str;
            return this;
        }

        public final AppContext build() {
            return new AppContext(this.returnUrl, this.cancelUrl, this.brandName, this.locale, this.landingPage, this.shippingPreference, this.userAction);
        }

        public final Builder cancelUrl(String str) {
            this.cancelUrl = str;
            return this;
        }

        public final Builder landingPage(String str) {
            this.landingPage = str;
            return this;
        }

        public final Builder locale(String str) {
            this.locale = str;
            return this;
        }

        public final Builder returnUrl(String str) {
            this.returnUrl = str;
            return this;
        }

        public final Builder shippingPreference(ShippingPreference shippingPreference2) {
            C19383o.m32797g(shippingPreference2, "shippingPreference");
            this.shippingPreference = shippingPreference2;
            return this;
        }

        public final Builder userAction(UserAction userAction2) {
            C19383o.m32797g(userAction2, "userAction");
            this.userAction = userAction2;
            return this;
        }
    }

    public AppContext() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (ShippingPreference) null, (UserAction) null, 127, (DefaultConstructorMarker) null);
    }

    public AppContext(String str, String str2, String str3, String str4, String str5, ShippingPreference shippingPreference2, UserAction userAction2) {
        this.returnUrl = str;
        this.cancelUrl = str2;
        this.brandName = str3;
        this.locale = str4;
        this.landingPage = str5;
        this.shippingPreference = shippingPreference2;
        this.userAction = userAction2;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getLandingPage() {
        return this.landingPage;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final ShippingPreference getShippingPreference() {
        return this.shippingPreference;
    }

    public final UserAction getUserAction() {
        return this.userAction;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppContext(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.paypal.checkout.createorder.ShippingPreference r12, com.paypal.checkout.createorder.UserAction r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.AppContext.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.createorder.ShippingPreference, com.paypal.checkout.createorder.UserAction, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
