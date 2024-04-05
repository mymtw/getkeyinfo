package com.paypal.checkout.error;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class CorrelationIds {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String currencyConversionDebugID;
    private final String eligibilityDebugID;
    private final String fetchPayloadDebugID;
    private final String finishCheckoutDebugID;
    private final String fundingEligibilityDebugID;
    private final String lsatUpgradeDebugID;
    private final String updateClientConfigDebugID;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CorrelationIds from$pyplcheckout_externalThreedsRelease(InternalCorrelationIds internalCorrelationIds) {
            C19383o.m32797g(internalCorrelationIds, "internalIds");
            return new CorrelationIds(internalCorrelationIds.getMobileSDKEligibilityId(), internalCorrelationIds.getFundingEligibilityDebugId(), internalCorrelationIds.getUpdateClientConfigId(), internalCorrelationIds.getUpgradeLowScopeAccessTokenId(), internalCorrelationIds.getCheckoutSessionId(), internalCorrelationIds.getUpdateCurrencyConversionTypeId(), internalCorrelationIds.getApprovePaymentId());
        }
    }

    public CorrelationIds() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public CorrelationIds(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.eligibilityDebugID = str;
        this.fundingEligibilityDebugID = str2;
        this.updateClientConfigDebugID = str3;
        this.lsatUpgradeDebugID = str4;
        this.fetchPayloadDebugID = str5;
        this.currencyConversionDebugID = str6;
        this.finishCheckoutDebugID = str7;
    }

    public static /* synthetic */ CorrelationIds copy$default(CorrelationIds correlationIds, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = correlationIds.eligibilityDebugID;
        }
        if ((i & 2) != 0) {
            str2 = correlationIds.fundingEligibilityDebugID;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = correlationIds.updateClientConfigDebugID;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = correlationIds.lsatUpgradeDebugID;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = correlationIds.fetchPayloadDebugID;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = correlationIds.currencyConversionDebugID;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = correlationIds.finishCheckoutDebugID;
        }
        return correlationIds.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.eligibilityDebugID;
    }

    public final String component2() {
        return this.fundingEligibilityDebugID;
    }

    public final String component3() {
        return this.updateClientConfigDebugID;
    }

    public final String component4() {
        return this.lsatUpgradeDebugID;
    }

    public final String component5() {
        return this.fetchPayloadDebugID;
    }

    public final String component6() {
        return this.currencyConversionDebugID;
    }

    public final String component7() {
        return this.finishCheckoutDebugID;
    }

    public final CorrelationIds copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new CorrelationIds(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorrelationIds)) {
            return false;
        }
        CorrelationIds correlationIds = (CorrelationIds) obj;
        return C19383o.m32792b(this.eligibilityDebugID, correlationIds.eligibilityDebugID) && C19383o.m32792b(this.fundingEligibilityDebugID, correlationIds.fundingEligibilityDebugID) && C19383o.m32792b(this.updateClientConfigDebugID, correlationIds.updateClientConfigDebugID) && C19383o.m32792b(this.lsatUpgradeDebugID, correlationIds.lsatUpgradeDebugID) && C19383o.m32792b(this.fetchPayloadDebugID, correlationIds.fetchPayloadDebugID) && C19383o.m32792b(this.currencyConversionDebugID, correlationIds.currencyConversionDebugID) && C19383o.m32792b(this.finishCheckoutDebugID, correlationIds.finishCheckoutDebugID);
    }

    public final String getCurrencyConversionDebugID() {
        return this.currencyConversionDebugID;
    }

    public final String getEligibilityDebugID() {
        return this.eligibilityDebugID;
    }

    public final String getFetchPayloadDebugID() {
        return this.fetchPayloadDebugID;
    }

    public final String getFinishCheckoutDebugID() {
        return this.finishCheckoutDebugID;
    }

    public final String getFundingEligibilityDebugID() {
        return this.fundingEligibilityDebugID;
    }

    public final String getLsatUpgradeDebugID() {
        return this.lsatUpgradeDebugID;
    }

    public final String getUpdateClientConfigDebugID() {
        return this.updateClientConfigDebugID;
    }

    public int hashCode() {
        String str = this.eligibilityDebugID;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fundingEligibilityDebugID;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updateClientConfigDebugID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lsatUpgradeDebugID;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fetchPayloadDebugID;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currencyConversionDebugID;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.finishCheckoutDebugID;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.eligibilityDebugID;
        String str2 = this.fundingEligibilityDebugID;
        String str3 = this.updateClientConfigDebugID;
        String str4 = this.lsatUpgradeDebugID;
        String str5 = this.fetchPayloadDebugID;
        String str6 = this.currencyConversionDebugID;
        String str7 = this.finishCheckoutDebugID;
        StringBuilder f = C0388a.m1050f("CorrelationIds(eligibilityDebugID=", str, ", fundingEligibilityDebugID=", str2, ", updateClientConfigDebugID=");
        C0391c.m1061h(f, str3, ", lsatUpgradeDebugID=", str4, ", fetchPayloadDebugID=");
        C0391c.m1061h(f, str5, ", currencyConversionDebugID=", str6, ", finishCheckoutDebugID=");
        return C0023f.m110k(f, str7, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CorrelationIds(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.error.CorrelationIds.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
