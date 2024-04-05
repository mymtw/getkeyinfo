package com.paypal.pyplcheckout.services;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class InternalCorrelationIds {
    private final String approvePaymentId;
    private final String checkoutSessionId;
    private final String fundingEligibilityDebugId;
    private final String mobileSDKEligibilityId;
    private final String updateClientConfigId;
    private final String updateCurrencyConversionTypeId;
    private final String upgradeLowScopeAccessTokenId;

    public InternalCorrelationIds() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public InternalCorrelationIds(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.mobileSDKEligibilityId = str;
        this.fundingEligibilityDebugId = str2;
        this.updateClientConfigId = str3;
        this.upgradeLowScopeAccessTokenId = str4;
        this.checkoutSessionId = str5;
        this.updateCurrencyConversionTypeId = str6;
        this.approvePaymentId = str7;
    }

    public static /* synthetic */ InternalCorrelationIds copy$default(InternalCorrelationIds internalCorrelationIds, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalCorrelationIds.mobileSDKEligibilityId;
        }
        if ((i & 2) != 0) {
            str2 = internalCorrelationIds.fundingEligibilityDebugId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = internalCorrelationIds.updateClientConfigId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = internalCorrelationIds.upgradeLowScopeAccessTokenId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = internalCorrelationIds.checkoutSessionId;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = internalCorrelationIds.updateCurrencyConversionTypeId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = internalCorrelationIds.approvePaymentId;
        }
        return internalCorrelationIds.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.mobileSDKEligibilityId;
    }

    public final String component2() {
        return this.fundingEligibilityDebugId;
    }

    public final String component3() {
        return this.updateClientConfigId;
    }

    public final String component4() {
        return this.upgradeLowScopeAccessTokenId;
    }

    public final String component5() {
        return this.checkoutSessionId;
    }

    public final String component6() {
        return this.updateCurrencyConversionTypeId;
    }

    public final String component7() {
        return this.approvePaymentId;
    }

    public final InternalCorrelationIds copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new InternalCorrelationIds(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalCorrelationIds)) {
            return false;
        }
        InternalCorrelationIds internalCorrelationIds = (InternalCorrelationIds) obj;
        return C19383o.m32792b(this.mobileSDKEligibilityId, internalCorrelationIds.mobileSDKEligibilityId) && C19383o.m32792b(this.fundingEligibilityDebugId, internalCorrelationIds.fundingEligibilityDebugId) && C19383o.m32792b(this.updateClientConfigId, internalCorrelationIds.updateClientConfigId) && C19383o.m32792b(this.upgradeLowScopeAccessTokenId, internalCorrelationIds.upgradeLowScopeAccessTokenId) && C19383o.m32792b(this.checkoutSessionId, internalCorrelationIds.checkoutSessionId) && C19383o.m32792b(this.updateCurrencyConversionTypeId, internalCorrelationIds.updateCurrencyConversionTypeId) && C19383o.m32792b(this.approvePaymentId, internalCorrelationIds.approvePaymentId);
    }

    public final String getApprovePaymentId() {
        return this.approvePaymentId;
    }

    public final String getCheckoutSessionId() {
        return this.checkoutSessionId;
    }

    public final String getFundingEligibilityDebugId() {
        return this.fundingEligibilityDebugId;
    }

    public final String getMobileSDKEligibilityId() {
        return this.mobileSDKEligibilityId;
    }

    public final String getUpdateClientConfigId() {
        return this.updateClientConfigId;
    }

    public final String getUpdateCurrencyConversionTypeId() {
        return this.updateCurrencyConversionTypeId;
    }

    public final String getUpgradeLowScopeAccessTokenId() {
        return this.upgradeLowScopeAccessTokenId;
    }

    public int hashCode() {
        String str = this.mobileSDKEligibilityId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fundingEligibilityDebugId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updateClientConfigId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.upgradeLowScopeAccessTokenId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.checkoutSessionId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.updateCurrencyConversionTypeId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.approvePaymentId;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.mobileSDKEligibilityId;
        String str2 = this.fundingEligibilityDebugId;
        String str3 = this.updateClientConfigId;
        String str4 = this.upgradeLowScopeAccessTokenId;
        String str5 = this.checkoutSessionId;
        String str6 = this.updateCurrencyConversionTypeId;
        String str7 = this.approvePaymentId;
        StringBuilder f = C0388a.m1050f("InternalCorrelationIds(mobileSDKEligibilityId=", str, ", fundingEligibilityDebugId=", str2, ", updateClientConfigId=");
        C0391c.m1061h(f, str3, ", upgradeLowScopeAccessTokenId=", str4, ", checkoutSessionId=");
        C0391c.m1061h(f, str5, ", updateCurrencyConversionTypeId=", str6, ", approvePaymentId=");
        return C0023f.m110k(f, str7, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InternalCorrelationIds(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.InternalCorrelationIds.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
