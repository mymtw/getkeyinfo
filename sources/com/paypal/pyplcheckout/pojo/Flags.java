package com.paypal.pyplcheckout.pojo;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Flags {
    @C18417a("allowChangePaymentMethod")
    private final Boolean allowChangePaymentMethod;
    @C18417a("blockNonDomesticShipping")
    private final Boolean blockNonDomesticShipping;
    @C18417a("hideCartDetails")
    private final Boolean hideCartDetails;
    @C18417a("hideShipping")
    private final Boolean hideShipping;
    @C18417a("isBillingAddressConsentRequired")
    private final Boolean isBillingAddressConsentRequired;
    @C18417a("isBillingAgreement")
    private final Boolean isBillingAgreement;
    @C18417a("isChangeShippingAddressAllowed")
    private final Boolean isChangeShippingAddressAllowed;
    @C18417a("isSignupEligible")
    private final Boolean isSignupEligible;
    @C18417a("showPPCreditOffer")
    private final Boolean showPPCreditOffer;
    @C18417a("stickyBillingAllowed")
    private final Boolean stickyBillingAllowed;

    public Flags() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 1023, (DefaultConstructorMarker) null);
    }

    public Flags(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        this.allowChangePaymentMethod = bool;
        this.hideCartDetails = bool2;
        this.isSignupEligible = bool3;
        this.showPPCreditOffer = bool4;
        this.stickyBillingAllowed = bool5;
        this.isChangeShippingAddressAllowed = bool6;
        this.hideShipping = bool7;
        this.isBillingAgreement = bool8;
        this.isBillingAddressConsentRequired = bool9;
        this.blockNonDomesticShipping = bool10;
    }

    public static /* synthetic */ Flags copy$default(Flags flags, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, int i, Object obj) {
        Flags flags2 = flags;
        int i2 = i;
        return flags.copy((i2 & 1) != 0 ? flags2.allowChangePaymentMethod : bool, (i2 & 2) != 0 ? flags2.hideCartDetails : bool2, (i2 & 4) != 0 ? flags2.isSignupEligible : bool3, (i2 & 8) != 0 ? flags2.showPPCreditOffer : bool4, (i2 & 16) != 0 ? flags2.stickyBillingAllowed : bool5, (i2 & 32) != 0 ? flags2.isChangeShippingAddressAllowed : bool6, (i2 & 64) != 0 ? flags2.hideShipping : bool7, (i2 & 128) != 0 ? flags2.isBillingAgreement : bool8, (i2 & 256) != 0 ? flags2.isBillingAddressConsentRequired : bool9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? flags2.blockNonDomesticShipping : bool10);
    }

    public final Boolean component1() {
        return this.allowChangePaymentMethod;
    }

    public final Boolean component10() {
        return this.blockNonDomesticShipping;
    }

    public final Boolean component2() {
        return this.hideCartDetails;
    }

    public final Boolean component3() {
        return this.isSignupEligible;
    }

    public final Boolean component4() {
        return this.showPPCreditOffer;
    }

    public final Boolean component5() {
        return this.stickyBillingAllowed;
    }

    public final Boolean component6() {
        return this.isChangeShippingAddressAllowed;
    }

    public final Boolean component7() {
        return this.hideShipping;
    }

    public final Boolean component8() {
        return this.isBillingAgreement;
    }

    public final Boolean component9() {
        return this.isBillingAddressConsentRequired;
    }

    public final Flags copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        return new Flags(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Flags)) {
            return false;
        }
        Flags flags = (Flags) obj;
        return C19383o.m32792b(this.allowChangePaymentMethod, flags.allowChangePaymentMethod) && C19383o.m32792b(this.hideCartDetails, flags.hideCartDetails) && C19383o.m32792b(this.isSignupEligible, flags.isSignupEligible) && C19383o.m32792b(this.showPPCreditOffer, flags.showPPCreditOffer) && C19383o.m32792b(this.stickyBillingAllowed, flags.stickyBillingAllowed) && C19383o.m32792b(this.isChangeShippingAddressAllowed, flags.isChangeShippingAddressAllowed) && C19383o.m32792b(this.hideShipping, flags.hideShipping) && C19383o.m32792b(this.isBillingAgreement, flags.isBillingAgreement) && C19383o.m32792b(this.isBillingAddressConsentRequired, flags.isBillingAddressConsentRequired) && C19383o.m32792b(this.blockNonDomesticShipping, flags.blockNonDomesticShipping);
    }

    public final Boolean getAllowChangePaymentMethod() {
        return this.allowChangePaymentMethod;
    }

    public final Boolean getBlockNonDomesticShipping() {
        return this.blockNonDomesticShipping;
    }

    public final Boolean getHideCartDetails() {
        return this.hideCartDetails;
    }

    public final Boolean getHideShipping() {
        return this.hideShipping;
    }

    public final Boolean getShowPPCreditOffer() {
        return this.showPPCreditOffer;
    }

    public final Boolean getStickyBillingAllowed() {
        return this.stickyBillingAllowed;
    }

    public int hashCode() {
        Boolean bool = this.allowChangePaymentMethod;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hideCartDetails;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSignupEligible;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showPPCreditOffer;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.stickyBillingAllowed;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isChangeShippingAddressAllowed;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hideShipping;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isBillingAgreement;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isBillingAddressConsentRequired;
        int hashCode9 = (hashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.blockNonDomesticShipping;
        if (bool10 != null) {
            i = bool10.hashCode();
        }
        return hashCode9 + i;
    }

    public final Boolean isBillingAddressConsentRequired() {
        return this.isBillingAddressConsentRequired;
    }

    public final Boolean isBillingAgreement() {
        return this.isBillingAgreement;
    }

    public final Boolean isChangeShippingAddressAllowed() {
        return this.isChangeShippingAddressAllowed;
    }

    public final Boolean isSignupEligible() {
        return this.isSignupEligible;
    }

    public String toString() {
        Boolean bool = this.allowChangePaymentMethod;
        Boolean bool2 = this.hideCartDetails;
        Boolean bool3 = this.isSignupEligible;
        Boolean bool4 = this.showPPCreditOffer;
        Boolean bool5 = this.stickyBillingAllowed;
        Boolean bool6 = this.isChangeShippingAddressAllowed;
        Boolean bool7 = this.hideShipping;
        Boolean bool8 = this.isBillingAgreement;
        Boolean bool9 = this.isBillingAddressConsentRequired;
        Boolean bool10 = this.blockNonDomesticShipping;
        return "Flags(allowChangePaymentMethod=" + bool + ", hideCartDetails=" + bool2 + ", isSignupEligible=" + bool3 + ", showPPCreditOffer=" + bool4 + ", stickyBillingAllowed=" + bool5 + ", isChangeShippingAddressAllowed=" + bool6 + ", hideShipping=" + bool7 + ", isBillingAgreement=" + bool8 + ", isBillingAddressConsentRequired=" + bool9 + ", blockNonDomesticShipping=" + bool10 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Flags(java.lang.Boolean r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Boolean r17, java.lang.Boolean r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Flags.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
